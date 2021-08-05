package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", num = 12)

    println(digiOneBank.nome)
    println(digiOneBank.num)

    val banco2 = digiOneBank.copy(nome = "DigiTwo")
    println(banco2.info())
}