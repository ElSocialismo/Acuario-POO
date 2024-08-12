package acuario

fun construirAcuario() {
    val miAcuario =     Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()

    val miTorre = TanqueTorre(diametro = 25, alto = 45)
    miTorre.imprimirTamano()
}

fun crearPeces() {
    val tiburón = Tiburón()
    val pezPayaso = PezPayaso()

    println("El color del tiburón es: ${tiburón.color}")
    println("El color del pez payaso es: ${pezPayaso.color}")
}


fun main() {
    construirAcuario()
}

