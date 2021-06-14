class Aluno( var aluno: String,
             var sobrenome: String,
             var RA: Int) {

    override fun equals(other: Any?): Boolean {
        if(other != null && other is Aluno){
            return this.RA == other.RA
        }
        return false
    }
}