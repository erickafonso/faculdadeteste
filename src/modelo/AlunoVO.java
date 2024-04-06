/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author erick
 */
public class AlunoVO extends PessoaVO {
    private int idAluno;
    private String matricula; 
    private static ArrayList<AlunoVO> listaalunos = new ArrayList<>();
    public AlunoVO(String nome, String email, String senha){
        super(nome, email, senha);
       // this.matricula = matricula;
    }

    public AlunoVO() {
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /*public void cadastrar(){
        String sql =  "INSERT INTO aluno (nome, email, matricula) VALUES ( "
                    + " '" + this.getNome() +   "' ,  "
                    + " '" + this.getEmail() +  "' ,  "
                    + "  " + this.getMatricula() +"  ) ";
        Conexao.executar( sql );
    }
    
    public void editar(){
        String sql =  "UPDATE aluno SET  "
                    + " nome    = '" + this.getNome() +   "' ,  "
                    + " email   = '" + this.getEmail() +  "' ,  "
                    + " matricula =  " + this.getMatricula() +"     "
                    + " WHERE idAluno = " + this.getId();
        Conexao.executar( sql );
    }
    
    public static void excluir(int idAluno){
        String sql =  "DELETE FROM aluno WHERE idAluno = " + idAluno;
        Conexao.executar( sql );
    }
    */
    
    
    
    
    
    
    
    
    
    
    public static void addListaAlunos(AlunoVO a){
        listaalunos.add(a);
    }
    public static String getAlunos(){
        String alunosdados = "ALUNOS" + "\n";
        for(AlunoVO a : listaalunos){
               alunosdados = alunosdados + a.dados();
                    
                
     
        }
        //System.out.println(profdados);
        return alunosdados;
    }
    
    
   @Override
    public String dados(){
        String dado = super.dados() + "\n" + "#########################" +"\n";
       
        return dado;
    }
    
    
    
}
