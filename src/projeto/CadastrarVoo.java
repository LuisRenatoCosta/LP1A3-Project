package projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastrarVoo extends JFrame{
    
//CRIAÇÃO DE ATRIBUTOS
    private JLabel lbTitulo, lbAeronave, lbNro, lbData, lbHora;
    private JTextField tfAeronave, tfNro, tfData, tfHora;
    private JButton btCadastrar;
    private Container cp;
    
    public CadastrarVoo(){
        setVisible(true);
        lbTitulo = new JLabel("Voo");
        
        lbAeronave = new JLabel("Aeronave: ");
        lbNro = new JLabel("NRO: ");
        lbData = new JLabel("Data: ");
        lbHora = new JLabel("Hora: ");
        tfAeronave = new JTextField();
        tfNro = new JTextField();
        tfData = new JTextField();
        tfHora = new JTextField();
        btCadastrar = new JButton("Cadastrar");
        //Configuração da interface
        setTitle("Cadastrar Voo");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
        
        btCadastrar.setToolTipText("Cadastrar o voo");
        cp = getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(180, 205, 205));
        
        lbTitulo.setBounds(225, 10, 100, 25);
        lbAeronave.setBounds(20, 50, 80, 25);
        lbNro.setBounds(20, 90, 80, 25);
        lbData.setBounds(20, 130, 80, 25);
        lbHora.setBounds(20, 170, 80, 25);
        tfAeronave.setBounds(100, 50, 360, 25);
        tfNro.setBounds(100, 90, 360, 25);
        tfData.setBounds(100, 130, 360, 25);
        tfHora.setBounds(100, 170, 360, 25);
        btCadastrar.setBounds(200, 220, 100, 25);
        cp.add(lbTitulo);
        cp.add(lbAeronave);
        cp.add(lbNro);
        cp.add(lbData);
        cp.add(lbHora);
        cp.add(tfAeronave);
        cp.add(tfNro);
        cp.add(tfData);
        cp.add(tfHora);
        cp.add(btCadastrar);
        
    }
}
