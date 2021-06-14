class DigitalHouseManager(var alunos: MutableList<Aluno> = mutableListOf(),
                          var professores: MutableList<Professor> = mutableListOf(),
                          var cursos: MutableList<Curso> = mutableListOf(),
                          var matriculas: MutableList<Matricula> = mutableListOf()) {

    fun registrarCurso(nome: String, RC: Int, alunosMax: Int){
        val curso = Curso(nome, RC, alunosMax)
        cursos.add(curso)
    }

    fun excluirCurso(RC: Int){
        cursos.forEach(){
            if(it.RC == RC){
                cursos.remove(it)
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String , tempo: Int, RP: Int, quantHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, tempo, RP, quantHoras)
        professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, tempo: Int, RP: Int, especialidade: String) {
        val professorTitular = ProfessorTitular(nome, sobrenome, tempo, RP, especialidade)
        professores.add(professorTitular)
    }

    fun excluirProfessor(RP: Int){
        professores.forEach(){
            if(it.RP == RP){
                professores.remove(it)
            }
        }
    }

    fun MatricularAluno(nome: String, sobrenome: String, RA: Int){
        val aluno = Aluno(nome, sobrenome, RA)
        alunos.add(aluno)
    }

}
