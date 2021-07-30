package projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ReservaDePassagens extends JFrame{
    
    //CRIAÇÃO DE ATRIBUTOS
    private JLabel lbTitulo;
    private JButton btFazerReserva, btConsultarLugaresVazios, btConsultarReservasRealizadas, btVoltar;
    private Container cp;
    
    //MÉTODO CONSTRUTOR
    public ReservaDePassagens(){
        setVisible(true);
        lbTitulo = new JLabel("Escolha uma das ações abaixo:");
        btFazerReserva = new JButton("Fazer uma reserva");
        btConsultarLugaresVazios = new JButton("Consultar lugares vazios");
        btConsultarReservasRealizadas = new JButton("Consultar reservas já realizadas");
        btVoltar = new JButton("Voltar");
        //Configuração da interface
        setTitle("Reserva de Passagens");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
        
        btFazerReserva.setToolTipText("Fazer uma reserva");
        btConsultarLugaresVazios.setToolTipText("Consultar lugares vazios");
        btConsultarReservasRealizadas.setToolTipText("Consultar as reservas já feitas");
        btVoltar.setToolTipText("Volta");
        
        cp = getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(180, 205, 205));
        lbTitulo.setBounds(100, 10, 300, 25);
        
        btFazerReserva.setBounds(150, 50, 250, 25);
        btConsultarLugaresVazios.setBounds(150, 100, 250, 25);
        btConsultarReservasRealizadas.setBounds(150, 150, 250, 25);
        btVoltar.setBounds(150, 200, 250, 25);
        cp.add(lbTitulo);
        cp.add(btFazerReserva);
        cp.add(btConsultarLugaresVazios);
        cp.add(btConsultarReservasRealizadas);
        cp.add(btVoltar);
    }
    
}
