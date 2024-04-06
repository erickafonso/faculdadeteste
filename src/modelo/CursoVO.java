/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class CursoVO {
    private int idCurso;

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public CursoVO() {
    }

    public int getIdCurso() {
        return idCurso;
    }
    private String nome;
    private String duracao;
    private String modalidade;
    private String descricao;
    private Double valor;
    private static ArrayList<CursoVO> listacursos = new ArrayList<>();
    
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    public CursoVO(String nome, String duracao, String modalidade, String descricao) {
        this.nome = nome;
        this.duracao = duracao;
        this.modalidade = modalidade;
        this.descricao = descricao;
    }

    public CursoVO(String nome, String duracao, String modalidade) {
        this.nome = nome;
        this.duracao = duracao;
        this.modalidade = modalidade;
    }

    public CursoVO(String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public CursoVO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
        public static void addListaCursos(CursoVO c){
        listacursos.add(c);
    }
    public static String getCursos(){
        String cursodados = "CURSOS" +"\n\n";
        for(CursoVO c : listacursos){
               cursodados = cursodados + c.dados();
                    
                
     
        }
        
        return cursodados;
    }
    
    
   
    public String dados(){
        String dado = "Nome: " + getNome() + "\n" + "Descrição: " + getDescricao() +"\n" +  "Duração: " + getDuracao() +"\n" +
                      "Modalidade: " + getModalidade()+"\n" + "Valor: " + getValor()+"\n" +"#########################" +"\n";
       // System.out.println("Salario: " + getSalario());
        //System.out.println("#########################");
        return dado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
