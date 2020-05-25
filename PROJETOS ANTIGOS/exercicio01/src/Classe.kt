class Produto {
    var nome : String = "";
    var preco = 0
    var quantidade = 0


fun calcularProduto(){
    println("O produto é " + this.nome)
var result = preco * quantidade;
    print("O valor total do produto é: " + result)
}
}
fun main(){
    var prod = Produto();
    prod.nome = "Macarrão"
    prod.preco = 3;
    prod.quantidade = 4;
    prod.calcularProduto();


}