package View;

import  java.text.ParseException ;
import  java.util.List ;
import  java.util.Scanner ;
import  java.util.concurrent.TimeUnit ;

import  model.dao.DisciplinaDAO ;
import  model.dao.FactoryDAO ;
import  model.entities.Disciplina ;

public  class  TelaDisciplina {
	
	estático  DisciplinaDAO disciplinaDao =  FactoryDAO . createDisciplinaDAO ();
	
	@SuppressWarnings ( " recurso " )
	public  static  Scanner  menuDisciplina ( console do Scanner  ) throws InterruptedException , ParseException { 

		int opcao =  0 ;
		faça {
			Sistema . para fora . println ( " \ n \ n " );
			Sistema . para fora . println ( "     ### Tela: Disciplina ### " );
			Sistema . para fora . println ( "     =========================== " );
			Sistema . para fora . println ( "     | 1 - Cadastrar | " );
			Sistema . para fora . println ( "     | 2 - Listar | " );
			Sistema . para fora . println ( "     | 3 - Alterar | " );
			Sistema . para fora . println ( "     | 4 - Excluir | " );
			Sistema . para fora . println ( "     | 0 - Retornar | " );
			Sistema . para fora . println ( "     =========================== " );
			Sistema . para fora . print ( "     Opção -> " );
			opcao = console . nextInt ();
			console . nextLine ();
			
			switch (opcao) {
			caso  1 : console = cadastrar (console);
					pausa ;
			caso  2 : 	console = listar (console);
					pausa ;
			caso  3 : console = alterar (console);
					pausa ;
			caso  4 : console = excluir (console);
					pausa ;
			caso  0 : 	console =  TelaPrincipal . menuPrincipal (console);
					pausa ;
			padrão :
				Sistema . para fora . println ( " Opção inválida! " );
				TimeUnit . SEGUNDOS . dormir ( 1 );
			}
		} enquanto (opcao ! =  0 );
		console de retorno ;
	}
	
	private  static  Scanner  cadastrar ( console do Scanner  ) throws ParseException { 
		
		Disciplina d =  nova  Disciplina ();
		
		Sistema . para fora . println ( " \ n \ n " );
		Sistema . para fora . println ( "     ### Disciplina-Cadastrar ### " );
		Sistema . para fora . println ( "     ===================================================== = " );
		
		Sistema . para fora . imprimir ( "     | Nome: " );
	    d . setNomedisciplina (console . nextLine ());
	    Sistema . para fora . imprimir ( "     | Carga Horária: " );
	    d . setCargahoraria (console . nextInt ());
	    
	    Sistema . para fora . println ( "     ===================================================== = " );
	    
	    disciplinaDao . inserir (d);
	    
	    console . nextLine ();
	    console de retorno ;
	} 
	
	 Listar scanner estático  privado ( console do scanner ) {  
				
		Lista < Disciplina > disciplinas = disciplinaDao . encontrar tudo();
		
		Sistema . para fora . println ( " \ n \ n " );
		Sistema . para fora . println ( "     ### Disciplina-Listar ### " );
		Sistema . para fora . println ( "     ===================================================== = " );
		Sistema . para fora . println ( "     | Id \ t Carga Horária \ t Nome " );
		para ( Disciplina d : disciplinas) {
			Sistema . para fora . println ( "     |      "  + d . getIddisciplina ()
							 +  " \ t " 		 + d . getCargahoraria ()
							 +  " \ t \ t " 		 + d . getNomedisciplina ());
		}
		Sistema . para fora . println ( "     ===================================================== = " );
		console . nextLine ();
		console de retorno ;
	}
	
	private  static  Scanner  alterar ( console do scanner  ) throws ParseException { 
		
		Disciplina d =  nova  Disciplina ();
		
		Sistema . para fora . println ( " \ n \ n " );
		Sistema . para fora . println ( "     ### Disciplina-Change ### " );
		Sistema . para fora . println ( "     ===================================================== = " );  		
		
		Sistema . para fora . imprimir ( "     | Id: " );
		d . setIddisciplina (console . nextInt ());
		console . nextLine ();
		  
		Sistema . para fora . imprimir ( "     | Nome: " );
		d . setNomedisciplina (console . nextLine ());

		Sistema . para fora . imprimir ( "     | Carga Horária: " );
		d . setCargahoraria (console . nextInt ());
		console . nextLine ();
		  
		Sistema . para fora . println ( "     ===================================================== = " );
		disciplinaDao . Atualizada);
		
		console . nextLine ();
		console de retorno ;
	} 
	
	private  static  Scanner  excluir ( console do scanner  ) lança ParseException { 

		Sistema . para fora . println ( " \ n \ n " );
		Sistema . para fora . println ( "     ### Disciplina-Excluir ### " );
		Sistema . para fora . println ( "     ===================================================== = " );
		Sistema . para fora . imprimir ( "     | Digite o Id: " );
		id int = console . nextInt ();
		console . nextLine ();
		Sistema . para fora . println ( "     ===================================================== = " );
		
		disciplinaDao . deleteByid (id);
		
		console . nextLine ();
		console de retorno ;
	}
}
