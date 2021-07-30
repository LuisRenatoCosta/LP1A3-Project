package projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ParametrosDoSistema extends JFrame {
    
    //CRIAÇÃO DE ATRIBUTOS
    private JLabel lbTitulo;
    private JButton btCadastrarAeronave, btCadastrarVoo, btVoltar;
    private Container cp;
    
    //MÉTODO CONSTRUTOR
    public ParametrosDoSistema(){
        setVisible(true);
        lbTitulo = new JLabel("Escolha uma das ações abaixo:");
        btCadastrarAeronave = new JButton("Cadastrar Aeronave");
        btCadastrarVoo = new JButton("Cadastrar Voo");
        btVoltar = new JButton("Voltar");
        //Configuração da interface
        setTitle("Parâmetros do Sistema");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
        
        btCadastrarAeronave.setToolTipText("Cadastra a aeronave");
        btCadastrarVoo.setToolTipText("Cadastra o voo");
        btVoltar.setToolTipText("Volta");
        
        cp = getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(180, 205, 205));
        lbTitulo.setBounds(100, 10, 300, 25);
        
        btCadastrarAeronave.setBounds(150, 100, 200, 25);
        btCadastrarVoo.setBounds(150, 150, 200, 25);
        btVoltar.setBounds(150, 200, 200, 25);
        cp.add(lbTitulo);
        cp.add(btCadastrarAeronave);
        cp.add(btCadastrarVoo);
        cp.add(btVoltar);
        
        btCadastrarAeronave.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){btCadastrarAeronaveAction();}
        });
        
        /*rbDeficiente[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {rbNaoAction();}
        });
        rbDeficiente[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){rbSimAction();}
        });
        cbDependentes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){cbDependentesAction();}
        });
        ckPlanoSaude.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){btCadastrarAction();}
        });
        btCadastrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){btCadastrarAction();}
        });
        
      */
    }
    
    private void btCadastrarAeronaveAction(){
        CadastrarAeronave a = new CadastrarAeronave();
    }
    
    /*
    private void rbNaoAction(){JOptionPane.showMessageDialog(this, "Opção 'NÃO' selecionada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    private void rbSimAction(){JOptionPane.showMessageDialog(this, "Opção 'SIM' selecionada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    private void cbDependentesAction() {JOptionPane.showMessageDialog(this, "Item " + cbDependentes.getSelectedItem() + " selecionado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    private void ckPlanoSaude(){
        if (ckPlanoSaude.isSelected()){
            JOptionPane.showMessageDialog(this, "Checkbox marcado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Checkbox desmarcado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void btCadastrarAction(){
        String ps = "", df = "";
        if (ckPlanoSaude.isSelected())
            ps = "Sim";
        else
            ps = "Não";
        for (JRadioButton rb : rbDeficiente)
            if(rb.isSelected())
                df = rb.getText();
        int resposta = JOptionPane.showConfirmDialog(this, "DADOS INFORMADOS: \n" + 
                "Nome: " + tfNome.getText() + "\n" +
                "Endereço: " + tfEndereco.getText() + "\n" +
                "Telefone: " + tfTelefone.getText() + "\n" +
                "Deficiente: " + df + "\n" +
                "Dependentes: " + cbDependentes.getSelectedItem() + "\n" +
                "Plano de Saúde: " + ps + "\n\n" +
                "Deseja informar outro funcionário?", "Informação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == 0)
            JOptionPane.showMessageDialog(this,"Você informou SIM.", "Resposta", JOptionPane.INFORMATION_MESSAGE);
        else if(resposta == 1)
            JOptionPane.showMessageDialog(this,"Você informou NÃO.", "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }*/
    
    
}
