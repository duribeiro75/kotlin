package one.digitalinnovation.digionebank

class Pessoa {
    val nome: String = "Eduardo"
    val cpf: String = "1234"
//    private set

//    constructor()

//    fun pessoaInfo()="$nome e $cpf"
}

    fun main(){
        val eduardo = Pessoa()

        println(eduardo.nome)
        println(eduardo.cpf)

//        println(eduardo.pessoaInfo())
    }
