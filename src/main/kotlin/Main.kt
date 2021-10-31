fun main(args: Array<String>) {

    var nome = ""
    var prefEmp = ""
    var nacio = ""
    var tipSang = ""
    var idade = 0
    var ano = 2021

    print("Digite seu nome: ")
    nome = readLine()!!
    print("Digite a sua idade: ")
    idade = readLine()!!.toInt()
    print("Digite qual a sua preferência de emprego: ")
    prefEmp = readLine()!!
    print("Digite sua nacionalidade: ")
    nacio = readLine()!!
    print("Digite seu tipo sanguineo: ")
    tipSang = readLine()!!

    var anoNasc = ano - idade

    println("\nOpa,meu nome é $nome, tenho $idade de idade, a minha"+"\n" +
            "preferencia de emprego é $prefEmp , meu tipo tipo sanguineo é $tipSang e " +
            "eu nasci no ano de $anoNasc")
    }

