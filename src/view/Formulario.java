/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
/**
 *
 * @author erick
 */
public class Formulario extends JFrame {
   // JTextField login;
    public Formulario(){
        Container c = getContentPane();
        c.add(new GUIdesignForm());
       /* 
        //borderlayout north FACULDADE
        //center gridlayout 8rows 2 columns
        //south botao salvar
        
        
        
       // cF1.setLayout(new FlowLayout());
        
        
        //TOPO
        JLabel lbSenac = new JLabel ("La Faculdad");
        lbSenac.setToolTipText("Técnico em Desenvolvimento de Sistemas");
        Font fonte = new Font("arial", Font.BOLD, 24); 
        lbSenac.setFont(fonte);
        lbSenac.setForeground(Color.BLUE);
        c.add(BorderLayout.NORTH,lbSenac);
        
        
        //CENTRO
        Container cF1 = new JPanel();
        cF1.setLayout(new GridLayout(8,2));
        c.add(BorderLayout.CENTER,cF1);
        cF1.add(new JLabel ("Nome:"));
        login = new JTextField();
        cF1.add(login);
        cF1.add(new JLabel ("Senha:"));
        login = new JPasswordField();
        cF1.add(login);
        */
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(880,600);
        setVisible(true);
    
    
    }
    public static void main(String[] args) {
        new Formulario();
    }
}
