class ProfessorAdjunto(
    override var nome: String,
    override var sobrenome: String,
    override var tempo: Int,
    override var RP: Int,
    var quantHoras: Int,
): Professor()