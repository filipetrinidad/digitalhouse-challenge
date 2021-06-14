abstract class Professor() {
    abstract val nome: String
    abstract val sobrenome: String
    abstract val tempo: Int
    abstract val RP: Int

    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Professor -> {
                if(this.RP == other.RP) return true
                return false
            } else -> {
                return super.equals(other)
            }
        }
    }
}