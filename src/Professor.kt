abstract class Professor() {
    abstract val nome: String
    abstract val sobrenome: String
    abstract val tempo: Int
    abstract val RP: Int

    override fun equals(other: Any?): Boolean {
        if(other != null && other is Professor){
            return this.RP == other.RP
        }
        return false
    }
}