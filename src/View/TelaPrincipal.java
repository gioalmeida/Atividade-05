package View;

import  java.text.ParseException ;
import  java.util.Scanner ;
import  java.util.concurrent.TimeUnit ;

public  class  TelaPrincipal {

	public  static  Scanner  menuPrincipal ( console do Scanner  ) lança ParseException , InterruptedException { 
		
		int opcao =  0 ;
		faça {
			Sistema . para fora . println ( " \ n \ n Sistema de Controler do IFG " );
			Sistema . para fora . println ( "     =========================== " );
			Sistema . para fora . println ( "     | 1 - Aluno | " );
			Sistema . para fora . println ( "     | 2 - Curso | " );
			Sistema . para fora . println ( "     | 3 - Disciplina | " );
			Sistema . para fora . println ( "     | 0 - Sair | " );
			Sistema . para fora . println ( "     =========================== " );
			Sistema . para fora . print ( "     Opção -> " );
			opcao = console . nextInt ();
			console . nextLine ();
			
			switch (opcao) {
				caso  1 :  retornar  TelaAluno . menuAluno (console);
				caso  2 :  retornar  TelaCurso . menuCurso (console);
				caso  3 :  retornar  TelaDisciplina . menuDisciplina (console);
				caso  0 :  sistema . para fora . println ( "     Aplicação Encerrada! " );
						pausa ;
				padrão :
					Sistema . para fora . println ( " Opção Inválida! " );
					TimeUnit . SEGUNDOS . dormir ( 1 );
			}
		} enquanto (opcao ! = 0 );
		console de retorno ;
	}
}
