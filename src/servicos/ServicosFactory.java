package servicos;

/**
 *
 * @author cralves
 */
public class ServicosFactory {

    private static CursoServicos cursoServicos = new CursoServicos();

    public static CursoServicos getCursoServicos() {
        return cursoServicos;
    }//fim do método getProdutoServicos
    
    
    

    private static AlunosServicos alunosServicos = new AlunosServicos();

    public static AlunosServicos getAlunosSevicos() {
        return alunosServicos;
    }//fim do método getClientesServicos

}//fecha a classe ServicosFactory
