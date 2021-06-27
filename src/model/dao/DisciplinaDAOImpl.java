package model.dao;

import  java.sql.Connection ;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
import  java.sql.SQLException ;
import  java.sql.Statement ;
import  java.util.ArrayList ;
import  java.util.List ;

import  model.db.DB ;
import  model.entities.Disciplina ;
import  model.entities.Disciplina ;

public  class  DisciplinaDAOImpl  implementa  DisciplinaDAO {

	 conexão privada conexao;
	
	public  DisciplinaDAOImpl ( Connection  conexao ) {
		isso . conexao = conexao;
	}

	@Sobrepor
	public  void  insert ( Disciplina  obj ) {
		
		PreparedStatement pst =  null ;
		ResultSet rs =  null ;
		
		tente {
			pst = conexão . prepareStatement ( " INSERT INTO disciplina (nomedisciplina, cargahoraria) "
					+  " VALORES (?,?) " , Declaração . RETURN_GENERATED_KEYS );
			
			pst . setString ( 1 , obj . getNomedisciplina ());
			pst . setInt ( 2 , obj . getCargahoraria ());
			
			int linhas = pst . executeUpdate ();
			
			if (linhas >  0 ) {
				rs = pst . getGeneratedKeys ();
				if (rs . next ()) {
					obj . setIddisciplina (rs . getInt ( 1 ));
				}
				Sistema . para fora . println ( "     | Disciplina [ " 
									+ obj . getIddisciplina () +  " | "
									+ obj . getNomedisciplina () +  " | " 
									+   obj . getCargahoraria () +  " ] "
									+  " foi criada com sucesso! " );
			}
			else {
				Sistema . para fora . println ( "     Não foi possível cadastrar a Disciplina! " );
			}
		}
		pegar ( SQLException e) {
			e . printStackTrace ();
		}
		finalmente {
			DB . fechaPreparedStatement (pst);
			DB . fechaResultSet (rs);
		}	
	}

	@Sobrepor
	public  void  update ( Disciplina  obj ) {
		
		PreparedStatement pst =  null ;
		tente {
			pst = conexão . prepareStatement ( " UPDATE Disciplina SET nomedisciplina =?, cargahoraria =? "
										+  " 	ONDE idDisciplina =? " );
			pst . setString ( 1 , obj . getNomedisciplina ());
			pst . setInt ( 2 , obj . getCargahoraria ());
			pst . setInt ( 3 , obj . getIddisciplina ());
			
			int linhas = pst . executeUpdate ();
			if (linhas >  0 ) {	
				Sistema . para fora . println ( "     Disciplina [ " 
								+ obj . getIddisciplina () +  " | " 
								+ obj . getNomedisciplina () +  " | "
								+ obj . getCargahoraria () +  " ] "
								+  " alterada com sucesso! " );
			}
			else {
				Sistema . para fora . println ( "     Não foi realizada a alteração da Disciplina! " );
			}
		}
		pegar ( SQLException e) {
			e . printStackTrace ();
		}
		finalmente {
			DB . fechaPreparedStatement (pst);
		}
	}

	@Sobrepor
	public  void  deleteByid ( inteiro  id ) {
		
		PreparedStatement pst =  null ;
		tente {
			pst = conexão . prepareStatement ( " EXCLUIR DA Disciplina ONDE idDisciplina =? " );
			pst . setInt ( 1 , id);
			
			int linhas = pst . executeUpdate ();
			if (linhas >  0 ) {	
				Sistema . para fora . println ( "     Disciplina [ "  + id +  " ] excluída com sucesso! " );
			}
			else {
				Sistema . para fora . println ( "     Não foi possível excluir a id da Disciplina [ "  + id +  " ]! " );
			}
		}
		pegar ( SQLException e) {
			e . printStackTrace ();
		}
		finalmente {
			DB . fechaPreparedStatement (pst);
		}
	}

	@Sobrepor
	public  Disciplina  findByid ( Integer  id ) {
		
		PreparedStatement pst =  null ;
		ResultSet rs =  null ;
		tente {
			pst = conexão . prepareStatement (
					" SELECT d. * FROM Disciplina d ONDE idDisciplina =? " );
			pst . setInt ( 1 , id);
			rs = pst . executeQuery ();
			
			if (rs . next ()) {
				Disciplina d =  nova  Disciplina ();
				d . setIddisciplina (rs . getInt ( 0 ));
				d . setNomedisciplina (rs . getString ( 1 ));
				d . setCargahoraria (rs . getInt ( 3 ));
				return d;
			}
			return  null ;
		}
		pegar ( SQLException e) {
			e . printStackTrace ();
		}
		finalmente {
			DB . fechaPreparedStatement (pst);
			DB . fechaResultSet (rs);
		}		
		return  null ;
	}

	@Sobrepor
	 Lista  pública < Disciplina > findAll () {
		
		PreparedStatement pst =  null ;
		ResultSet rs =  null ;
		Lista < Disciplina > lista =  nova  ArrayList <> ();	
		
		tente {
			pst = conexão . prepareStatement ( " SELECT * FROM Disciplina " );
			rs = pst . executeQuery ();
			while (rs . next ()) {   
				Disciplina d =  nova  Disciplina (rs . GetInt ( " idDisciplina " ), rs . GetString ( " Nomedisciplina " ), rs . GetInt ( " cargahoraria " ));
				lista . adicione (d);
			}
		}
		pegar ( SQLException e) {
			Sistema . para fora . println (e);
		}
		finalmente {
			DB . fechaPreparedStatement (pst);
			DB . fechaResultSet (rs);
		}
		return lista;	
	}
}