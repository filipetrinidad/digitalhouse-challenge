abstract class Professor() {
    abstract var nome: String
    abstract var sobrenome: String
    abstract var tempo: Int
    abstract var RP: Int

    override fun equals(other: Any?): Boolean {
        if(other != null && other is Professor){
            return this.RP == other.RP
        }
        return false
    }
}