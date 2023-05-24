package psv;

import java.sql.*;

public class Conexao {
    public static Connection abrirConexao(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.dbc.Driver").newInstance();
            
            String url = "";
            url += "jdbc:mysql://127.0.0.1/estacionamento?";
            url += "user=root&password=";
            
            con = DriverManager.getConnection(url);
            System.out.println("Conexão Aberta");
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return con;
    }
    
    public static void fecharConexao(Connection con) {
        try{
            con.close();
            System.out.println("Conexão Fechada"); 
            
        } catch(SQLException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
