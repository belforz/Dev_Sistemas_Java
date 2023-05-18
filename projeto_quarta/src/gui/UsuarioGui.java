
package gui;
import factory.ConnectionFactory; import modelo.usuario; import java.sql.*; import java.sql.PreparedStatement;


public class UsuarioGui {
    Long id;
    String nome;
    String idade;
    String aldeia;
    String status;
    String descendencia;
    String sangue;
    String numero_ninjabook;
    String cor_olhos;
    String cor_cabelo;
    String tamanho_roupa;
    String filhos;
    String observacao;
    
    private final Connection connection;
    
      public UsuarioGui(){
       this.connection = new ConnectionFactory().getConnection();
   }
      
      public void adiciona(usuario usuario) {
        String sql = "INSERT INTO personagens(nome, idade, aldeia, status, descendencia, sangue, numero_ninjabook, cor_olhos, cor_cabelo, tamanho_roupa, filhos, observacao)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
         PreparedStatement psmt = connection.prepareStatement(sql);
         psmt.setString(1, usuario.getNome());
         psmt.setString(2,usuario.getIdade());
         psmt.setString(3,usuario.getAldeia());
         psmt.setString(4,usuario.getStatus());
         psmt.setString(5,usuario.getDescendencia());
         psmt.setString(6,usuario.getSangue());
         psmt.setString(7,usuario.getNumero_ninjabook());
         psmt.setString(8,usuario.getCor_olhos());
         psmt.setString(9,usuario.getCor_cabelo());
         psmt.setString(10,usuario.getTamanho_roupa());
         psmt.setString(11,usuario.getFilhos());
         psmt.setString(12,usuario.getObservacao());
         
         psmt.execute();
         psmt.close();
        } catch (SQLException u){
            throw new RuntimeException (u);
                    }
    }
      
      public void seleciona(usuario usuario){
      try {
          String sql = "SELECT * from personagens where id = ?";
      PreparedStatement psmt =  connection.prepareStatement(sql);
      psmt.setString(1, String.valueOf(usuario.getId()));
      ResultSet rs = psmt.executeQuery();
      
      while(rs.next()){
          String id = rs.getString("id");
          String nome = rs.getString("nome");
          String idade = rs.getString("idade");
          String aldeia  = rs.getString("aldeia");
          String status = rs.getString("status");
          String descendencia= rs.getString("descendencia");
          String sangue = rs.getString("sangue");
          String numero_ninjabook = rs.getString("numero_ninjabook");
          String cor_olhos = rs.getString("olhos");
          String cor_cabelo = rs.getString("cor_cabelo");
          String tamanho_roupa = rs.getString("tamnho_roupa");
          String filhos = rs.getString("filhos");
          String observacao = rs.getString("observacao");
          
      }
      
      
      } catch(SQLException e) {
      e.printStackTrace();
      }
      }
      public void atualiza(usuario usuario){
       try {
          String update = "UPDATE personagens SET nome= ?, idade = ?, aldeia = ?, status = ?, descendencia = ?, sangue = ?, numero_ninjabook =?, cor_olhos =?, cor_cabelo =?, tamanho_roupa = ?, filhos = ? , observacao =?";
            update += "where id = ?";
            
      
             PreparedStatement psmt = connection.prepareStatement(update);
             psmt.setString(1, usuario.getNome().isEmpty() ? null : usuario.getNome());
              psmt.setString(2, usuario.getIdade().isEmpty() ? null : usuario.getIdade());
              psmt.setString(3, usuario.getAldeia().isEmpty() ? null : usuario.getAldeia());
              psmt.setString(4, usuario.getStatus().isEmpty() ? null : usuario.getStatus());
               psmt.setString(5, usuario.getDescendencia().isEmpty() ? null : usuario.getDescendencia());
                psmt.setString(6, usuario.getSangue().isEmpty() ? null : usuario.getSangue());
             psmt.setString(7, usuario.getNumero_ninjabook().isEmpty() ? null : usuario.getNumero_ninjabook());
              psmt.setString(8, usuario.getCor_olhos().isEmpty() ? null : usuario.getCor_olhos());
               psmt.setString(9, usuario.getCor_cabelo().isEmpty() ? null : usuario.getCor_cabelo());
                psmt.setString(10, usuario.getTamanho_roupa().isEmpty() ? null : usuario.getTamanho_roupa());
                 psmt.setString(11, usuario.getFilhos().isEmpty() ? null : usuario.getFilhos());
                  psmt.setString(12, usuario.getObservacao().isEmpty() ? null : usuario.getObservacao());
                  psmt.setString(13, String.valueOf(usuario.getId()));
               
                  int rowsAffected = psmt.executeUpdate();
                   String mensagem = rowsAffected > 0 ? "Sucesso" : "Erro";
             
            
            
      }
       catch(SQLException e){
       e.printStackTrace();}
      
      
      }
      
      
      public void deleta (usuario usuario){
          try {
          String sql = "DELETE from personagens where id = ?";
      PreparedStatement psmt = connection.prepareStatement(sql);
      psmt.setString(1, String.valueOf(usuario.getId()));
          } catch (SQLException e ){
          e.printStackTrace();
          }
       
      }
    
}
