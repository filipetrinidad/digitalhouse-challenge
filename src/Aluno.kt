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
        if(other != null && other is Aluno){
            return this.RA == other.RA
        }
        return false
    }
}