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
    
    public String inserir(PersonagemBean carro){
        String sql = "insert into carrobean(placa, cor, descricao, modelo) values(?,?,?,?)";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            ps.setString(4, carro.getModelo());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com sucexo.";
            }else{
                return "Erro ao inserir";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(PersonagemBean carro){
        String sql = "update carrobean set cor = ?,descricao = ?, modelo = ?"; 
        sql += " where placa = ?"; 
        try { 
        PreparedStatement ps = getCon().prepareStatement(sql); 
        ps.setString(1, carro.getCor()); 
        ps.setString(2, carro.getDescricao()); 
        ps.setString(3, carro.getModelo()); 
        ps.setString(4, carro.getPlaca()); 
        
        if (ps.executeUpdate() > 0) { 
        return "Alterado com sucesso."; 
        } else { 
        return "Erro ao alterar"; 
        }
       } catch (SQLException e) { 
        return e.getMessage(); 
        }
    }
    
    public String excluir(PersonagemBean carro){
        String sql = "delete from carrobean where placa = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            
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
        String sql = "select * from carrobean";
        List<PersonagemBean> listaCarro = new ArrayList<PersonagemBean>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    PersonagemBean cb = new PersonagemBean();                
                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setDescricao(rs.getString(3));
                    cb.setModelo(rs.getString(4));
                    listaCarro.add(cb);
                }
                
                return listaCarro;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
}
