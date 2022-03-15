fun main() {
    val gauchao = Campeonato(nome = "Gauchão", ano = 2022)
    println("Número de Clubes ${gauchao.listarTodosOsClubes().size}")
    gauchao.cadastrarNovoClube(
        Clube(
            nome = "Grêmio",
            serie = Serie.B
        )
    )
    println("N° de Clubes Cadastrados ${gauchao.listarTodosOsClubes().size}")
    val times = gauchao.listarTodosOsClubes()
    val contagem = times.size - 1
    for (indice in 0..contagem){
        println("Nome: ${times[indice].nome}\nSérie: ${times[indice].serie}")
    }
}