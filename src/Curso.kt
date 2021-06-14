class Curso(   var nome: String,
               var RC: Int,
               var alunosMax: Int,
               var alunosMatri: MutableList<Aluno> = mutableListOf()
) {

    fun adicionarAluno(aluno: Aluno): Boolean{
        if(alunosMatri.count() < alunosMax){
            alunosMatri.add(aluno)
            return true
        }
        return false
    }

    fun removerAluno(aluno: Aluno): Boolean{
        alunosMatri.remove(aluno)
        return true
    }

    override fun equals(other: Any?): Boolean {
      if(other != null && other is Curso){
          return this.RC == other.RC
      }
        return false
    }
}