class Curso {
    val nome: String
    val RC: Int

    constructor(nome: String, RC: Int) {
        this.nome = nome
        this.RC = RC
    }

    override fun equals(other: Any?): Boolean {
      if(other != null && other is Curso){
          return this.RC == other.RC
      }
        return false
    }
}