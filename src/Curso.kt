class Curso {
    val nome: String
    val RC: Int

    constructor(nome: String, RC: Int) {
        this.nome = nome
        this.RC = RC
    }

    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Curso -> {
                if(this.RC == other.RC) return true
                return false
            } else -> {
                return super.equals(other)
            }
        }
    }
}