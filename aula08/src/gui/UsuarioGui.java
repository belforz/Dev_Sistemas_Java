
package gui;
import factory.ConnectionFactory; import modelo.usuario; import java.sql.*; import java.sql.PreparedStatement;

public class UsuarioGui {
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
   
    private final Connection connection;
    
   public UsuarioGui(){
       this.connection = new ConnectionFactory().getConnection();
   }
    public void adiciona(usuario usuario) {
        String sql = "INSERT INTO usuario(nome, cpf, email, telefone) VALUES(?,?,?,?)";
        
        try{
         PreparedStatement psmt = connection.prepareStatement(sql);
         psmt.setString(1, usuario.getNome());
         psmt.setString(2,usuario.getCpf());
         psmt.setString(3,usuario.getEmail());
         psmt.setString(4,usuario.getTelefone());
         psmt.execute();
         psmt.close();
        } catch (SQLException u){
            throw new RuntimeException (u);
                    }
    }
    
}
    

    

