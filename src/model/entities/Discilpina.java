package model.entities;

public  class  Disciplina {
	
	privado  int iddisciplina;
	 String privada nomedisciplina;
	privado  int cargahoraria;
	
	 Disciplina pública () {
	}
		
	 Disciplina pública ( int  iddisciplina , String  nomedisciplina , int  cargahoraria ) {
		isso . iddisciplina = iddisciplina;
		isso . nomedisciplina = nomedisciplina;
		isso . cargahoraria = cargahoraria;
	}
	
	public  int  getIddisciplina () {
		voltar iddisciplina;
	}
	public  void  setIddisciplina ( int  iddisciplina ) {
		isso . iddisciplina = iddisciplina;
	}
	public  String  getNomedisciplina () {
		retornar nomedisciplina;
	}
	public  void  setNomedisciplina ( String  nomedisciplina ) {
		isso . nomedisciplina = nomedisciplina;
	}
	public  int  getCargahoraria () {
		retorno cargahoraria;
	}
	public  void  setCargahoraria ( int  cargahoraria ) {
		isso . cargahoraria = cargahoraria;
	}

	@Sobrepor
	public  int  hashCode () {
		final  int prime =  31 ;
		resultado int =  1 ;
		resultar = nobre * resultado + cargahoraria;
		resultado = primo * resultado + iddisciplina;
		resultado = primo * resultado + ((nomedisciplina ==  null ) ?  0  : nomedisciplina . hashCode ());
		resultado de retorno ;
	}

	@Sobrepor
	public  boolean  equals ( Object  obj ) {
		if ( this  == obj)
			return  true ;
		if (obj ==  null )
			return  false ;
		if (getClass () ! = obj . getClass ())
			return  false ;
		Disciplina outro = ( Disciplina ) obj;
		if (cargahoraria ! = outro . cargahoraria)
			return  false ;
		if (iddisciplina ! = outro . iddisciplina)
			return  false ;
		if (nomedisciplina ==  null ) {
			if (outro . nomedisciplina ! =  null )
				return  false ;
		} else  if ( ! nomedisciplina . equals (outro . nomedisciplina))
			return  false ;
		return  true ;
	}
	
}
