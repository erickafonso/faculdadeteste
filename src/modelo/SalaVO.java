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
public class SalaVO {
    private String numero;
    private String capacidade;
    private String andar;
    private String tipo;
    private static ArrayList<SalaVO> listasalas = new ArrayList<>();
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public SalaVO(String numero) {
        this.numero = numero;
    }

    public SalaVO(String numero, String capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public SalaVO(String numero, String capacidade, String andar) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.andar = andar;
    }

    public SalaVO(String numero, String capacidade, String andar, String tipo) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.andar = andar;
        this.tipo = tipo;
    }
    
    
    
     public static void addListaSalas(SalaVO s){
        listasalas.add(s);
    }
    public static String getSalas(){
        String saladados = "SALAS" +"\n\n";
        for(SalaVO s : listasalas){
               saladados = saladados + s.dados();
                    
                
     
        }
        
        return saladados;
    }
    
    
   
    public String dados(){
        String dado = "Número: " + getNumero() + "\n" + "Capacidade: " + getCapacidade() +"\n" +  "Andar: " + getAndar() +"\n" +
                      "Tipo: " + getTipo()+"\n" + "#########################" +"\n";
       // System.out.println("Salario: " + getSalario());
        //System.out.println("#########################");
        return dado;
    }
    
    
    
    
    
}
