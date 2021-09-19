import org.junit.Test
import java.util.Scanner
class MainPredial {
    @Test
fun main(){

       // val sc= Scanner (System.`in`)
       // val nombre = sc.next()
      //  println ("Ingrese su nombre")

    val persona: Persona=Persona( nombre = "jaima", fechaNacimiento = "2000-12-13", madreSoltera = false)
    val zona:Zonas=Zonas(clave = "RUR", zona = "Rural", costo = 8.00)

    val predial: Predial=Predial(persona = persona, zonas =zona )

    persona.terrenos.add(Terreno("RUR",tamaño = 456.0))
    println(predial.calcularImpuesto(persona.terrenos.get(0)))
      // predial.CalcularDescuento(persona = persona,  mes = 1)
    predial.calcularImporteFinal(persona= persona, persona.terrenos.get(0), mes = 5)


}








}