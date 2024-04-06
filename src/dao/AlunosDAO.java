/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.AlunoVO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ConexaoBanco;

/**
 *
 * @author 181700028
 */
public class AlunosDAO {
    
    public void cadastrarAlunos(AlunoVO aVO) throws SQLException{
        
        Connection con =new ConexaoBanco().getConexao();
        try{
            String sql = "insert into aluno values (null, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm= con.prepareStatement(sql);
            pstm.setString(1, aVO.getNome());
            pstm.setString(2, aVO.getEmail());
            pstm.setString(3, aVO.getSenha());
            pstm.setString(4, aVO.getSenha());
            pstm.setString(5, null);
            pstm.setString(6, null);
            pstm.setString(7, null);
            
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException se){
            throw new SQLException("Erro ao cadastrar Aluno(DAO)! " + se.getMessage());
        }finally{
            con.close();
        }
        
        
    }
    public ArrayList<AlunoVO> buscarAluno() throws SQLException{
        
        Connection con =new ConexaoBanco().getConexao();
        try{
            String sql= "Select * from aluno";
            PreparedStatement pstm= con.prepareStatement(sql);
            ResultSet rs= pstm.executeQuery();
            ArrayList<AlunoVO> alunoList =new ArrayList<>();
            
            while(rs.next()){
                AlunoVO aVO=new AlunoVO();
                aVO.setIdAluno(rs.getInt("idAluno"));
                aVO.setNome(rs.getString("nome"));
                aVO.setEmail(rs.getString("email"));
                aVO.setSenha(rs.getString("senha"));    
                aVO.setCpf(rs.getString("cpf"));
                
                
                alunoList.add(aVO);
                
            }
            
            pstm.close();
            return alunoList;
            
        }catch(SQLException se){
            throw new SQLException("Erro ao buscar Aluno(DAO)! " + se.getMessage());
        }finally{
            con.close();
        }
        
        
    }
    
    
   public ArrayList<AlunoVO> pesquisarAlunos(String query) throws SQLException{
       Connection con = new ConexaoBanco().getConexao();
       
       try {
           String sql = " Select * from aluno " + query;
           PreparedStatement pstm = con.prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           ArrayList<AlunoVO> alunoList = new ArrayList<>();
           AlunoVO aVO = new AlunoVO();
           
           while(rs.next()){
               aVO.setIdAluno(rs.getInt("idAluno"));
                aVO.setNome(rs.getString("nome"));
                aVO.setEmail(rs.getString("email"));
                aVO.setSenha(rs.getString("senha"));    
                aVO.setCpf(rs.getString("cpf"));
               
               /*aVO.setCodCli(rs.getInt("idcliente"));
               aVO.setNome(rs.getString("nome"));
               aVO.setCPF(rs.getString("cpf"));
               aVO.setEmail(rs.getString("email"));
               aVO.setFone(rs.getString("fone"));
               aVO.setEndereco(rs.getString("endereco"));
               aVO.setCEP(rs.getString("cep"));
               aVO.setBairro(rs.getString("bairro"));
               aVO.setUf(rs.getString("uf"));   */
             
               alunoList.add(aVO);
           }//fim do while
           
           pstm.close();
           return alunoList;
                      
       } catch (SQLException se) {
           throw new SQLException( "Erro ao pesquisar aluno! " + se);
       }finally{
           con.close();
       }//fim do finally
       
   }//fim do método pesquisar
    
    
}
