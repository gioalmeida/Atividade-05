package model.dao;

import  java.util.List ;

import  model.entities.Disciplina ;

 interface  p�blica DisciplinaDAO {

	 inser��o vazia ( Disciplina  obj );
	void  update ( Disciplina  obj );
	void  deleteByid ( ID inteiro  );
	Disciplina  findByid ( ID inteiro  );
	Lista < Disciplina >  findAll ();
}