class Casa {
    var cor: String
    var vagaGaragem: Int

    constructor( cor : String, vagaGaragem : Int ){
        this.cor = cor
        this.vagaGaragem = vagaGaragem
    }


    fun detalheCasa() {
        println("A Casa tem cor $cor e $vagaGaragem vagas na garagem")
    }

    fun fecharJanela() {
        println("Janela Fechada")
    }
}
fun main(){
    var c = Casa("Preto", 2);
    c.detalheCasa()

}
