abstract class Professor {
    val nome: String
    val sobrenome: String
    val tempo: Int
    val RP: Int

    constructor(nome: String, sobrenome: String, tempo: Int, RP: Int) {
        this.nome = nome
        this.sobrenome = sobrenome
        this.tempo = tempo
        this.RP = RP
    }
}