package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.CursoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author cralves
 */
public class CursoDAO {

    public void cadastrarCurso(CursoVO cVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "INSERT INTO curso VALUES (null, ?, ?, ?, ?, ? )";
            //String sql = "INSERT INTO curso (nome , duracao , valor ) VALUES(?,?,?) ";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, cVO.getNome());
            pstm.setString(2, cVO.getDuracao());
            pstm.setDouble(3, cVO.getValor());
            pstm.setString(4, cVO.getDescricao());
            pstm.setString(5, cVO.getModalidade());

            pstm.execute();
            pstm.close();

        } catch (SQLException se) {
            throw new SQLException("Erro no Cadastro!" + se);
        } finally {
            con.close();
        }//fim do try catch finally

    }//fim do método cadastrarProduto

    public ArrayList<CursoVO> buscarCurso() throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "Select * from curso";
            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();
            ArrayList<CursoVO> cursoList = new ArrayList<>();

            while (rs.next()) {
                CursoVO cVO = new CursoVO();

                cVO.setIdCurso(rs.getInt("idCurso"));
                cVO.setNome(rs.getString("nome"));
                cVO.setDuracao(rs.getString("duracao"));
                cVO.setValor(rs.getDouble("valor"));

                cursoList.add(cVO);
            }//fim do while
            pstm.close();

            return cursoList;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar Produto! " + se.getMessage());
        } finally {
            con.close();
        }
    }//fim do método buscarProduto

    public ArrayList<CursoVO> filtrarCurso(String query) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "select * from curso " + query;
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            ArrayList<CursoVO> cursoList = new ArrayList<>();

            while (rs.next()) {
                CursoVO cVO = new CursoVO();

                cVO.setIdCurso(rs.getInt("idCurso"));
                cVO.setNome(rs.getString("nome"));
                cVO.setDuracao(rs.getString("duracao"));
                cVO.setValor(rs.getDouble("valor"));

                cursoList.add(cVO);
            }//fim do while

            pstm.close();

            return cursoList;

        } catch (SQLException se) {
            throw new SQLException("Erro ao filtrar produto! " + se.getMessage());
        } finally {
            con.close();
        }//fim da finally        
    }//fim do método filtrarProduto

    public void deletarCurso(int idCurso) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "delete from curso where idCurso = ?";
            //String sql = "delete from curso where idCurso = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setInt(0, idCurso);
            //pstm.setInt(1, idCurso);
            pstm.execute();
            pstm.close();
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar curso! CursoDAO " + se.getMessage());
        } finally {
            con.close();
        }//fim da finally
    }//fecha o método detelarProduto

    public void alterarCurso(CursoVO cVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql;
            sql = "Update curso set "
                    + "nome = ' " + cVO.getNome() + " ', "
                    + "duracao = " + cVO.getDuracao() + ", "
                    + "valor = " + cVO.getValor() + " "
                    + " where idCurso = " + cVO.getIdCurso() + " ";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();

        } catch (SQLException se) {
            throw new SQLException("Erro ao Alterar Curso! " + se.getMessage());
        } finally {
            con.close();
        }//fim do Try catch finally
    }//fecha o método alterarProduto

}//fecha a classe ProdutoDAO
