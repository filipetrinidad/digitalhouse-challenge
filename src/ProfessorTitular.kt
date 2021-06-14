class ProfessorTitular(
    override val nome: String,
    override val sobrenome: String,
    override val tempo: Int,
    override val RP: Int,
    val especialidade: String
):Professor()