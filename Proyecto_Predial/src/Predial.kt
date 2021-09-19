import org.junit.Test
import java.time.LocalDate

class Predial(persona: Persona, zonas: Zonas) {
    public var tamaño = 0.0
    public var descuento = 0.0

    var Personas: ArrayList<Persona> = arrayListOf()

    var zonas = arrayOf(
        Zonas(clave = "MAR", zona = "Marginado", costo = 2.00),
        Zonas(clave = "RUR", zona = "Rural", costo = 8.00),
        Zonas(clave = "URB", zona = "Urbano", costo = 10.00),
        Zonas(clave = "RES", zona = "Residencial", costo = 25.00)
    )

    fun calcularDescuento(persona: Persona, mes: Int): Double {
        var edad = persona.calcularEdad()

        val madreSoltera = persona.esMadreSoltera
        if (edad >= 70 && mes <= 2 || madreSoltera.equals(true) && mes <= 2) {
            println(" " + "Tendra un descuento de 70%")
            descuento = 0.70


        } else if (edad >= 70 && mes > 2 || madreSoltera.equals(true) && mes > 2) {
            println(" " + "Tendra un descuento del 50%")
            descuento = 0.50
        }
        else if (edad < 70 && mes <= 2 || madreSoltera.equals(false) && mes <= 2) {
            println(" " + "Tendra un descuento del 40%")
            descuento = 0.40
        }
        else {
            println(" " + "No tendra un descuento ")
            descuento = 0.0
        }

        return descuento
    }

    var Predio: ArrayList<Predial> = arrayListOf()

    fun propiedades(predial: Predial) {
        Predio.add(predial)
    }

    fun calcularImpuesto(terreno: Terreno): Double {
        var resultado: Double = 0.0
        zonas.forEach { zona: Zonas ->
            if (zona.clave == terreno.zona) {

                resultado = zona.costo * terreno.tamaño
                return resultado
            }
        }

        return resultado
    }

    fun calcularImporteFinal(persona: Persona, terreno: Terreno, mes: Int): Double {

        var descuentoFinal = calcularDescuento(persona, mes) * calcularImpuesto(terreno)
        println(" su descuento es: " + descuentoFinal)
        println("su importe total es:" + (calcularImpuesto(terreno) - descuentoFinal))

        return calcularImpuesto(terreno) - descuentoFinal
    }


}

/*var Zona: ArrayList<Zonas> = arrayListOf()

fun calcularCosto(zonas: Zonas): Double {
    return zonas.calcularCosto(tamaño)

}*/

/* fun importeTotal(): Double {
     var sumaPredios = 0.0
     Predio.forEach { predial ->
         sumaPredios += predial.calcularCosto()
     }
     return sumaPredios
 }

}
*/