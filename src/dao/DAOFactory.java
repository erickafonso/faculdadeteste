
package dao;

/**
 *
 * @author cralves
 */
public class DAOFactory {
    //Instanciando o objeto a classe ProdutoDAO
    private static CursoDAO cursoDAO = new CursoDAO();
    
    //Fazendo uma cópia dos métodos da classe ProdutoDAO e 
    //disponibilizar para a classe que solicitar
    public static CursoDAO getCursoDAO(){
        return cursoDAO;
    }//fim do método getProdutoDAO
    
    //Instanciando o objeto a classe ClientesDAO
    private static AlunosDAO alunosDAO = new AlunosDAO();
    
    //Fazendo uma cópia dos métodos da classe ClientesDAO e 
    //disponibilizar para a classe que solicitar
    public static AlunosDAO getAlunosDAO(){
        return alunosDAO;
    }//fim do método ClientesDAO
}//fecha a classe DAOFactory
