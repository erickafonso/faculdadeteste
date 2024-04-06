
package servicos;

import dao.DAOFactory;
import dao.CursoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.CursoVO;

/**
 *
 * @author erick
 */
public class CursoServicos {
    
    public void cadastrarCurso(CursoVO cVO) throws SQLException {
        CursoDAO cDAO = DAOFactory.getCursoDAO();
        cDAO.cadastrarCurso(cVO);
    }//fim do métoso cadastrarCurso
    
    public ArrayList<CursoVO> buscarCurso() throws SQLException{
        CursoDAO cDAO = DAOFactory.getCursoDAO();
        return cDAO.buscarCurso();
    }//fim do método buscarCurso
    
    public ArrayList<CursoVO> filtrarCurso(String query) throws SQLException{
        CursoDAO pDAO = DAOFactory.getCursoDAO();
        return pDAO.filtrarCurso(query);
    }//fim do método filtrarCurso
    
    public void deletarCurso( int idCurso) throws SQLException{
        CursoDAO cDAO = DAOFactory.getCursoDAO();
        cDAO.deletarCurso(idCurso);
    }//fim do método deletarCurso
    
    public void alterarCursp(CursoVO cVO) throws SQLException{
        CursoDAO cDAO = DAOFactory.getCursoDAO();
        cDAO.alterarCurso(cVO);
    }//fim do método alterarCurso
    
    
    
    
    
}//fecha a classe ProdutoServicos
