package projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastrarAeronave extends JFrame {
    
    //CRIAÇÃO DE ATRIBUTOS
    private JLabel lbTitulo, lbModelo;
    private JTextField tfModelo;
    private JButton btCadastrar;
    private Container cp;
    
    public CadastrarAeronave(){
        setVisible(true);
        lbTitulo = new JLabel("Aeronave");
        
        lbModelo = new JLabel("Modelo: ");
        tfModelo = new JTextField();
        btCadastrar = new JButton("Cadastrar");
        //Configuração da interface
        setTitle("Cadastrar Aeronave");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
        
        btCadastrar.setToolTipText("Cadastrar a aeronave");
        cp = getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(180, 205, 205));
        
        lbTitulo.setBounds(200, 10, 100, 25);
        lbModelo.setBounds(20, 100, 100, 25);
        tfModelo.setBounds(100, 100, 360, 25);
        btCadastrar.setBounds(200, 220, 100, 25);
        cp.add(lbTitulo);
        cp.add(lbModelo);
        cp.add(tfModelo);
        
        cp.add(btCadastrar);
        
        /*btCadastrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){btCadastrarAction();}
        });*/
        
    }
    
    /*private void btCadastrarAction(){
        String modelo;
        int fileira, assento;
        modelo = tfModelo.getText();
        fileira = Integer.parseInt(tfFileira.getText());
        assento = Integer.parseInt(tfAssento.getText());
        Aviao a = new Aviao(modelo, fileira, assento);
        
        //System.out.println(tfModelo.getText());
    }*/
    
    
}
