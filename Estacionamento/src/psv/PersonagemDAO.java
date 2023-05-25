package psv;

import java.sql.*;
import java.util.*;

public class PersonagemDAO {
    private Connection con;
    
    public PersonagemDAO(Connection con){
        setCon(con);
    }
    
    public Connection getCon(){
        return con;
    }
    
    public void setCon(Connection con){
        this.con = con;
    }
    
    public String inserir(PersonagemBean personagem){
        String sql = "INSERT INTO personagens(nome, idade, status, descendencia, sangue, numero_ninjabook, cor_olhos, cor_cabelo, tamanho_roupa, filhos, observacao, aldeia)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1,personagem.getNome());
            ps.setString(2,personagem.getIdade());
            ps.setString(3,personagem.getStatus());
            ps.setString(4,personagem.getDescendencia());
            ps.setString(5,personagem.getSangue());
            ps.setString(6,personagem.getNumero());
            ps.setString(7,personagem.getOlhos());
            ps.setString(8,personagem.getCabelos());
            ps.setString(9,personagem.getTamanho());
            ps.setString(10,personagem.getFilhos());
            ps.setString(11,personagem.getObs());
            ps.setString(12,personagem.getAldeia());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com sucexo.";
            }else{
                return "Erro ao inserir";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(PersonagemBean personagem){
        String sql = "update personagens set nome= ? idade =? , status =?, descendencia = ? , sangue = ?, numero_ninjabook = ? , cor_olhos = ? , cor_cabelo = ? , tamanho_roupa= ? ,  filhos = ? ,observacao = ?, aldeia = ?)"; 
        sql += " where id = ?"; 
        try { 
        PreparedStatement ps = getCon().prepareStatement(sql); 
       ps.setString(1,personagem.getNome());
            ps.setString(2,personagem.getIdade());
            ps.setString(3,personagem.getStatus());
            ps.setString(4,personagem.getDescendencia());
            ps.setString(5,personagem.getSangue());
            ps.setString(6,personagem.getNumero());
            ps.setString(7,personagem.getOlhos());
            ps.setString(8,personagem.getCabelos());
            ps.setString(9,personagem.getTamanho());
            ps.setString(10,personagem.getFilhos());
            ps.setString(11,personagem.getObs());
            ps.setString(12,personagem.getAldeia());
        ps.setLong(13, personagem.getId()); 
        
        if (ps.executeUpdate() > 0) { 
        return "Alterado com sucesso."; 
        } else { 
        return "Erro ao alterar"; 
        }
       } catch (SQLException e) { 
        return e.getMessage(); 
        }
    }
    
    public String excluir(PersonagemBean personagem){
        String sql = "delete from personagens where id = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setLong(1, personagem.getId());
            
            if(ps.executeUpdate() > 0){
                return "Excluído com sucexo.";
            }else{
                return "Erro ao excluir";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public List<PersonagemBean> listarTodos(){
        String sql = "select * from personagens";
        List<PersonagemBean> listaPersonagem = new ArrayList<PersonagemBean>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    PersonagemBean pb = new PersonagemBean(); 
                     pb.setNome(rs.getString(1)); 
        pb.setIdade(rs.getString(2)); 
       pb.setStatus(rs.getString(3)); 
        pb.setDescendencia(rs.getString(4));
         pb.setNumero(rs.getString(5)); 
          pb.setSangue(rs.getString(6)); 
           pb.setOlhos(rs.getString(7)); 
            pb.setCabelos(rs.getString(8));
             pb.setFilhos(rs.getString(9));
              pb.setObs(rs.getString(10)); 
           pb.setTamanho(rs.getString(11));
            pb.setAldeia(rs.getString(12)); 
                    listaPersonagem.add(pb);
                }
                
                return listaPersonagem;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
}
