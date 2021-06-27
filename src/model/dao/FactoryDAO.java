package model.dao;

import  model.db.DB ;

public  class  FactoryDAO {

	public  static  CursoDAO  createCursoDAO () {
		retornar  novo  CursoDAOImpl ( DB . getConexao ());
	}
	
	public  static  AlunoDAO  createAlunoDAO () {
		retornar  novo  AlunoDAOImpl ( DB . getConexao ());
	}
	
	public  static  DisciplinaDAO  createDisciplinaDAO () {
		retornar  novo  DisciplinaDAOImpl ( DB . getConexao ());
	}
}