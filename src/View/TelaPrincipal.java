package View;

import  java.text.ParseException ;
import  java.util.Scanner ;
import  java.util.concurrent.TimeUnit ;

public  class  TelaPrincipal {

	public  static  Scanner  menuPrincipal ( console do Scanner  ) lan�a ParseException , InterruptedException { 
		
		int opcao =  0 ;
		fa�a {
			Sistema . para fora . println ( " \ n \ n Sistema de Controler do IFG " );
			Sistema . para fora . println ( "     =========================== " );
			Sistema . para fora . println ( "     | 1 - Aluno | " );
			Sistema . para fora . println ( "     | 2 - Curso | " );
			Sistema . para fora . println ( "     | 3 - Disciplina | " );
			Sistema . para fora . println ( "     | 0 - Sair | " );
			Sistema . para fora . println ( "     =========================== " );
			Sistema . para fora . print ( "     Op��o -> " );
			opcao = console . nextInt ();
			console . nextLine ();
			
			switch (opcao) {
				caso  1 :  retornar  TelaAluno . menuAluno (console);
				caso  2 :  retornar  TelaCurso . menuCurso (console);
				caso  3 :  retornar  TelaDisciplina . menuDisciplina (console);
				caso  0 :  sistema . para fora . println ( "     Aplica��o Encerrada! " );
						pausa ;
				padr�o :
					Sistema . para fora . println ( " Op��o Inv�lida! " );
					TimeUnit . SEGUNDOS . dormir ( 1 );
			}
		} enquanto (opcao ! = 0 );
		console de retorno ;
	}
}
