fun main(args: Array<String>){
  val diaSemana = 8

  val dia = when(diaSemana) {
   1 -> "Segunda"
   2 -> "Terça"
   3 -> "Quarta"
   4 -> "Quinta"
      5 -> "Sexta"
   else -> "Esse dia da semana não existe"
  }

  println(dia)
 }

