
package gui;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.usuario;

public class UsuarioGui {
    Long id;
    String nome;
    String idade;
    String aldeia;
    String status;
    String observacao;
    String blood;
    
   
    private final Connection connection;
    
   public UsuarioGui(){
       this.connection = new ConnectionFactory().getConnection();
   }
    public void adiciona(usuario usuario) {
        String sql = "INSERT INTO personagens(nome, idade, aldeia, status, observacao, blood) VALUES(?,?,?,?,?,?)";
        
        try{
         PreparedStatement psmt = connection.prepareStatement(sql);
         psmt.setString(1, usuario.getNome());
         psmt.setString(2,usuario.getIdade());
         psmt.setString(3,usuario.getAldeia());
         psmt.setString(4,usuario.getStatus());
         psmt.setString(5, usuario.getObservacao());
         psmt.setString(6,usuario.getBlood());
         psmt.execute();
         psmt.close();
        } catch (SQLException u){
            throw new RuntimeException (u);
                    }
    }
}
