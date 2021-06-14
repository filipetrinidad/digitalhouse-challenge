class ProfessorTitular(
    override var nome: String,
    override var sobrenome: String,
    override var tempo: Int,
    override var RP: Int,
    var especialidade: String
):Professor()