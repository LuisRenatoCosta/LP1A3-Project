package projeto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame{
    
    //Criação do Menu
    private JMenuBar mbBarra; // Barra do Menu
    private JMenu mnMenuPrincipal; //Menu Cadastro
    
    //Itens do Menu Principal
    private JMenuItem miCadParametrosSistema; //Submenu Parêmtros do Sistema do Menu Principal
    private JMenuItem miCadReservaPassagens; //Submenu Reserva de Passagens do Menu Principal
    private JMenuItem miCadSair; //Item Sair do Menu Principal
    
    public Menu(){
        mbBarra = new JMenuBar();
        mnMenuPrincipal = new JMenu("Menu Principal");
        miCadParametrosSistema = new JMenuItem("Parâmetros do Sistema");
        miCadReservaPassagens = new JMenuItem("Reservas de Passagens");
        miCadSair = new JMenuItem("Sair");
        setTitle("Reserva de Passagens Aéreas");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(180, 205, 205));
        miCadParametrosSistema.setMnemonic('P');
        miCadReservaPassagens.setMnemonic('R');
        miCadSair.setMnemonic('S');
        mnMenuPrincipal.add(miCadParametrosSistema);
        mnMenuPrincipal.add(miCadReservaPassagens);
        mnMenuPrincipal.addSeparator();
        mnMenuPrincipal.add(miCadSair);
        mbBarra.add(mnMenuPrincipal);
        setJMenuBar(mbBarra);
        setVisible(true);
        
        miCadParametrosSistema.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {miCadParametrosSistemaAction();}
        });
        miCadReservaPassagens.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {miCadReservaPassagensAction();}
        });
        miCadSair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {miCadSairAction();}
        });
    }
    
    
    private void miCadParametrosSistemaAction(){
        return;
    }
    private void miCadReservaPassagensAction(){
        return;
    }
    private void miCadSairAction(){
        return;
    }
    
    
    /*------------------------------------------------------------------------------------------------------------       
    --------------------------------------------------------------------------------------------------------------
    --------------------------------------------------------------------------------------------------------------
    --------------------------------------------------------------------------------------------------------------*/
    /*//CRIAÇÃO DE ATRIBUTOS
    private JLabel lbTitulo, lbNome, lbEndereco, lbTelefone, lbDeficiente, lbDependentes;
    private JTextField tfNome, tfEndereco, tfTelefone;
    private static final String valDef[] = {"Não", "Sim"};
    private JRadioButton rbDeficiente[];
    private ButtonGroup bgDeficiente;
    private JComboBox<Integer> cbDependentes;
    private static final Integer valDep[] = {0, 1, 2, 3, 4};
    private JCheckBox ckPlanoSaude;
    private JButton btCadastrar;
    private Container cp;
    
    public Menu(){
        setVisible(true);
        lbTitulo = new JLabel("Cadastro de Funcionários");
        lbNome = new JLabel ("Nome");
        lbEndereco = new JLabel("Endereço");
        lbTelefone = new JLabel ("Telefone");
        lbDeficiente = new JLabel("Deficiente");
        lbDependentes = new JLabel("Dependentes");
        tfNome = new JTextField();
        tfEndereco = new JTextField();
        tfTelefone = new JTextField();
        rbDeficiente = new JRadioButton[2];
        bgDeficiente = new ButtonGroup();
        cbDependentes = new JComboBox<>(valDep);
        ckPlanoSaude = new JCheckBox("Possui Plano de Saúde");
        btCadastrar = new JButton("Cadastrar");
        //Configuração da interface
        setTitle("Exemplo");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
        for (int i = 0; i < rbDeficiente.length; i = i + 1){
            rbDeficiente[i] = new JRadioButton(valDef[i]);
            rbDeficiente[i].setBackground(new Color(180, 205, 205));
            bgDeficiente.add(rbDeficiente[i]);
        }
        rbDeficiente[0].setSelected(true);
        ckPlanoSaude.setBackground(new Color(180, 205, 205));
        btCadastrar.setToolTipText("Cadastra o funcionário");
        cp = getContentPane();
        cp.setLayout(null);
        cp.setBackground(new Color(180, 205, 205));
        lbTitulo.setBounds(135, 10, 300, 25);
        lbNome.setBounds(20, 40, 100, 25);
        tfNome.setBounds(100, 40, 360, 25);
        lbEndereco.setBounds(20, 70, 100, 25);
        tfEndereco.setBounds(100, 70, 360, 25);
        lbTelefone.setBounds(20, 100, 100, 25);
        tfTelefone.setBounds(100, 100, 120, 25);
        lbDeficiente.setBounds(20, 130, 100, 25);
        rbDeficiente[0].setBounds(100, 130, 50, 25);
        rbDeficiente[1].setBounds(150, 130, 50, 25);
        lbDependentes.setBounds(20, 160, 100, 25);
        cbDependentes.setBounds(100, 160, 50, 25);
        ckPlanoSaude.setBounds(16, 190, 250, 25);
        btCadastrar.setBounds(200, 220, 100, 25);
        cp.add(lbTitulo);
        cp.add(lbNome);
        cp.add(tfNome);
        cp.add(lbEndereco);
        cp.add(tfEndereco);
        cp.add(lbTelefone);
        cp.add(tfTelefone);
        cp.add(lbDeficiente);
        cp.add(rbDeficiente[0]);
        cp.add(rbDeficiente[1]);
        cp.add(lbDependentes);
        cp.add(cbDependentes);
        cp.add(ckPlanoSaude);
        cp.add(btCadastrar);
        rbDeficiente[0].addActionListener(new ActionListener() {
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
    }
    
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
    
    /*------------------------------------------------------------------------------------------------------------       
    --------------------------------------------------------------------------------------------------------------
    --------------------------------------------------------------------------------------------------------------
    --------------------------------------------------------------------------------------------------------------*/
    /*private JMenuBar mbBarra; // Barra do Menu
    private JMenu mnCadastro; //Menu Cadastro
    
    private JMenuItem miCadCurso;
    private JMenuItem miCadDisciplina;
    private JMenu mnCadPessoa;
    private JMenuItem miCadPessoa[];
    
    private static final String cadPesItens[] = {"Professores","Alunos"};
    private JMenuItem miCadSair;
    
    public Menu(){
        mbBarra = new JMenuBar();
        mnCadastro = new JMenu("Cadastro");
        miCadCurso = new JMenuItem("Cursos");
        miCadDisciplina = new JMenuItem("Disciplinas");
        mnCadPessoa = new JMenu("Pessoas");
        miCadPessoa = new JMenuItem[2];
        miCadSair = new JMenuItem("Sair");
        setTitle("Exemplo");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(180, 205, 205));
        miCadCurso.setMnemonic('C');
        miCadDisciplina.setMnemonic('D');
        mnCadPessoa.setMnemonic('P');
        miCadSair.setMnemonic('S');
        for (int i = 0; i < miCadPessoa.length; i = i + 1){
            miCadPessoa[i] = new JMenuItem(cadPesItens[i]);
            mnCadPessoa.add(miCadPessoa[i]);
        }
        mnCadastro.add(miCadCurso);
        mnCadastro.add(miCadDisciplina);
        mnCadastro.add(mnCadPessoa);
        mnCadastro.addSeparator();
        mnCadastro.add(miCadSair);
        mbBarra.add(mnCadastro);
        setJMenuBar(mbBarra);
        setVisible(true);
    }*/
    
}
