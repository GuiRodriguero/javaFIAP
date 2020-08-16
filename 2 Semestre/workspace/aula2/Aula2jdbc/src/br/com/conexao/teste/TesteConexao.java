package br.com.conexao.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.conexao.excecao.Excecao;

public class TesteConexao { //Ler sobre Garbage Collector -> Nunca crie vari�veis dentro de la�o
	
	//Pasta lib criada para colocar o driver jdbc para criar uma refer�ncia interna
	//Isso faz com que se o projeto � exportado, o driver sempre acompanhar�
	
	public static void main(String[] args) { 
		//Driver Manager -> Classe que cria conex�o com o banco
		//DriverManager.getConnection("url", "usu", "pwd"); url == String de conex�o
		
		Connection fiap = null;
		Statement estrutura = null;
		ResultSet resultado = null; //Representa os dados que vem do banco de dados
		
		try { 
			//gera a conex�o que � armazenada pelo connection -> Driver Manager
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85499", "131002"); //� uma exce��o checked porque sem um try catch o java avisa que poder� ocorrer um erro
			
			//cria a estrutura de statement e o resultado -> Connection
			estrutura = fiap.createStatement();
			
			//armazena o statement  e o resultado -> Statement
			resultado = estrutura.executeQuery("select * from TB_CLIENTE"); // comando sql
			resultado.next(); //vai para a primeira linha da tabela (uma depois da linha que contem os nomes das colunas)
			System.out.println(resultado.getInt("ID_CLIENTE")); // exibindo o id
			resultado.next();
			System.out.println(resultado.getString("NM_CLIENTE")); // Exibindo o nome
			
			System.out.println("Abriu conex�o!!");
		}catch (Exception e){
			System.out.println(Excecao.tratarExcecao(e));
			e.printStackTrace(); // Mostra o que de fato provocou o erro 
		}finally {
			try {
				fiap.close();
				System.out.println("Fechou conex�o!!");
			}catch(Exception e){
				System.out.println(Excecao.tratarExcecao(e));
			}
		}
	}
}
