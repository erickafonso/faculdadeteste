/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.AlunosDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.AlunoVO;

/**
 *
 * @author erick
 */
public class AlunosServicos {
    public void cadastrarAlunos(AlunoVO aVO) throws SQLException {
        AlunosDAO aDAO = DAOFactory.getAlunosDAO();
        aDAO.cadastrarAlunos(aVO);
    }
    public ArrayList<AlunoVO> buscarAlunos() throws SQLException{
        AlunosDAO cDAO = DAOFactory.getAlunosDAO();
        return cDAO.buscarAluno();
    }
    
    
    public ArrayList<AlunoVO> pesquisarAluno(String query) throws SQLException{
        AlunosDAO aDAO = DAOFactory.getAlunosDAO();
        return aDAO.pesquisarAlunos(query);
    }
    
}
