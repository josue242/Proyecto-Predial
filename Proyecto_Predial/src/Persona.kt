import org.junit.Test
import kotlin.collections.ArrayList
import java.time.LocalDate


class Persona(nombre:String, fechaNacimiento:String, madreSoltera:Boolean) {

    public val nombrePersona = nombre
    public val fechaNac = fechaNacimiento
    public val esMadreSoltera= madreSoltera
    public var edad= this.calcularEdad()

    var terrenos: ArrayList<Terreno> = arrayListOf()

    fun calcularEdad(): Int {

        val fechaNacimiento = LocalDate.parse(this.fechaNac)
        print(fechaNacimiento)
        val fechaActual = LocalDate.now()
        print(fechaActual)
        val edad = fechaActual.getYear() - fechaNacimiento.getYear()
        print(edad)
        return edad
    }

}







