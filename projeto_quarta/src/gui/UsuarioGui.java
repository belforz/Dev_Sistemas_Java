
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
    String msg_txt;
    
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
          usuario.setNome(nome);
          String idade = rs.getString("idade");
          usuario.setIdade(idade);
          String aldeia  = rs.getString("aldeia");
          usuario.setAldeia(aldeia);
          String status = rs.getString("status");
          usuario.setStatus(status);
          String descendencia= rs.getString("descendencia");
          usuario.setDescendencia(descendencia);
          String sangue = rs.getString("sangue");
          usuario.setSangue(sangue);
          String numero_ninjabook = rs.getString("numero_ninjabook");
          usuario.setNumero_ninjabook(numero_ninjabook);
          String cor_olhos = rs.getString("olhos");
          usuario.setCor_olhos(cor_olhos);
          String cor_cabelo = rs.getString("cor_cabelo");
          usuario.setCor_cabelo(cor_cabelo);
          String tamanho_roupa = rs.getString("tamnho_roupa");
          usuario.setTamanho_roupa(tamanho_roupa);
          String filhos = rs.getString("filhos");
          usuario.setFilhos(filhos);
          String observacao = rs.getString("observacao");
          usuario.setObservacao(observacao);
          
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
        psmt.setString(1, (usuario.getNome() != null && !usuario.getNome().isEmpty()) ? usuario.getNome() : null);
        psmt.setString(2, (usuario.getIdade() != null && !usuario.getIdade().isEmpty()) ? usuario.getIdade() : null);
        psmt.setString(3, (usuario.getAldeia() != null && !usuario.getAldeia().isEmpty()) ? usuario.getAldeia() : null);
        psmt.setString(4, (usuario.getStatus() != null && !usuario.getStatus().isEmpty()) ? usuario.getStatus() : null);
        psmt.setString(5, (usuario.getDescendencia() != null && !usuario.getDescendencia().isEmpty()) ? usuario.getDescendencia() : null);
        psmt.setString(6, (usuario.getSangue() != null && !usuario.getSangue().isEmpty()) ? usuario.getSangue() : null);
        psmt.setString(7, (usuario.getNumero_ninjabook() != null && !usuario.getNumero_ninjabook().isEmpty()) ? usuario.getNumero_ninjabook() : null);
        psmt.setString(8, (usuario.getCor_olhos() != null && !usuario.getCor_olhos().isEmpty()) ? usuario.getCor_olhos() : null);
        psmt.setString(9, (usuario.getCor_cabelo() != null && !usuario.getCor_cabelo().isEmpty()) ? usuario.getCor_cabelo() : null);
        psmt.setString(10, (usuario.getTamanho_roupa() != null && !usuario.getTamanho_roupa().isEmpty()) ? usuario.getTamanho_roupa() : null);
        psmt.setString(11, (usuario.getFilhos() != null && !usuario.getFilhos().isEmpty()) ? usuario.getFilhos() : null);
        psmt.setString(12, (usuario.getObservacao() != null && !usuario.getObservacao().isEmpty()) ? usuario.getObservacao() : null);
        psmt.setString(13, String.valueOf(usuario.getId()));
              
                  
               int rowsAffected = psmt.executeUpdate();
                   String mensagem = rowsAffected > 0 ? "Sucesso" : "Erro";
                  usuario.setMsg_txt(mensagem);
                
                   
                   psmt.close();
             
            
            
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
