class Aluno {
    val aluno: String
    val sobrenome: String
    val RA: Int

    constructor(aluno: String, sobrenome: String, RA: Int) {
        this.aluno = aluno
        this.sobrenome = sobrenome
        this.RA = RA
    }

    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Aluno -> {
                if(this.RA == other.RA) return true
                return false
            } else -> {
                return super.equals(other)
            }
        }
    }
}