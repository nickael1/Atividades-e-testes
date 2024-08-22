/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import Clases.Audios.AudioErro;
import Clases.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author alunolages
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        jRB_administrador.setVisible(false);
        
    }
    static ArrayList<Usuario> usuariosArray = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bG_login = new javax.swing.ButtonGroup();
        jL_tituloLogin = new javax.swing.JLabel();
        jL_CPF = new javax.swing.JLabel();
        jTF_CPF = new javax.swing.JTextField();
        jL_nome = new javax.swing.JLabel();
        jTF_senha = new javax.swing.JTextField();
        jRB_administrador = new javax.swing.JRadioButton();
        jRB_cliente = new javax.swing.JRadioButton();
        jB_entrar = new javax.swing.JButton();
        jL_imagensLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jL_tituloLogin.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jL_tituloLogin.setForeground(new java.awt.Color(109, 135, 116));
        jL_tituloLogin.setText("Consult Trip");

        jL_CPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_CPF.setForeground(new java.awt.Color(109, 135, 116));
        jL_CPF.setText("CPF:");

        jTF_CPF.setBackground(new java.awt.Color(248, 237, 227));

        jL_nome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_nome.setForeground(new java.awt.Color(109, 135, 116));
        jL_nome.setText("Senha:");

        jTF_senha.setBackground(new java.awt.Color(248, 237, 227));

        jRB_administrador.setBackground(new java.awt.Color(239, 239, 239));
        bG_login.add(jRB_administrador);
        jRB_administrador.setForeground(new java.awt.Color(109, 135, 116));
        jRB_administrador.setText("Administrador");

        bG_login.add(jRB_cliente);
        jRB_cliente.setForeground(new java.awt.Color(109, 135, 116));
        jRB_cliente.setText("Cliente");

        jB_entrar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jB_entrar.setForeground(new java.awt.Color(109, 135, 116));
        jB_entrar.setText("Entrar");
        jB_entrar.setBorder(null);
        jB_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_entrarMouseClicked(evt);
            }
        });
        jB_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_entrarActionPerformed(evt);
            }
        });

        jL_imagensLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_imagensLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seguro-de-carro-dicas-para-pegar-estrada-com-seguranca.jpg"))); // NOI18N
        jL_imagensLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 135, 116), 2));
        jL_imagensLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 135, 116));
        jLabel1.setText("Uma longa viagem começa com um único passo!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_tituloLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_CPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRB_administrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRB_cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jL_imagensLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_CPF)
                    .addComponent(jTF_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_nome)
                    .addComponent(jTF_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRB_administrador)
                    .addComponent(jRB_cliente)
                    .addComponent(jL_tituloLogin)
                    .addComponent(jB_entrar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_imagensLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_entrarMouseClicked
        
        try {
            long cpfV = Long.parseLong(jTF_CPF.getText());
            

            if (jTF_CPF.getText().equals("") || jTF_senha.getText().equals("") || bG_login.getSelection() == null){
                //Som de erro!
                AudioErro audioErro = new AudioErro();
                audioErro.AudioErro();
                JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Precione o OK para continuar!");
                //
                
                String jRBSelecionado = "não selecionado";
                if (jRB_administrador.isSelected()) {
                    jRBSelecionado = "administrador";
                    principalJFrame.painel2 = new PainelAdministrador(/*usuarioArray*/);
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                    janela.getContentPane().remove(principalJFrame.painel1);
                    janela.add(principalJFrame.painel2, BorderLayout.CENTER);
                    janela.pack();
                } else if (jRB_cliente.isSelected()) {
                    jRBSelecionado = "cliente";
                    principalJFrame.painel3 = new PainelCliente(/*produtosArray*/);
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                    janela.getContentPane().remove(principalJFrame.painel1);
                    janela.add(principalJFrame.painel3, BorderLayout.CENTER);
                    janela.pack();
                    ///salvar os nomes
                    /*if (jTF_valor.getText().equals("") || jFTF_data.getText().equals("") || jCB_tipo.getSelectedIndex() == 0){
                        JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }else {
                        //Adicionar
                        Usuario usuarios = new Usuario(jTF_CPF.getText(), jTF_nome.getText());
                        principalJFrame.usuario.add(usuarios);
                        
                        JOptionPane.showMessageDialog(null, "Os dados inseridos foram salvos!");
                    }*/
                }

                jTF_CPF.setText("");
                jTF_senha.setText("");

                
            }
        }
        catch (HeadlessException | NumberFormatException e) {
            //Som de erro!
                AudioErro audioErro = new AudioErro();
                audioErro.AudioErro();
            JOptionPane.showMessageDialog(null, "Algo não está preenchido ou foi preenchido de forma incorreta!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jB_entrarMouseClicked

    private void jB_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_entrarActionPerformed

    }//GEN-LAST:event_jB_entrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bG_login;
    private javax.swing.JButton jB_entrar;
    private javax.swing.JLabel jL_CPF;
    private javax.swing.JLabel jL_imagensLogin;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_tituloLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRB_administrador;
    private javax.swing.JRadioButton jRB_cliente;
    private javax.swing.JTextField jTF_CPF;
    private javax.swing.JTextField jTF_senha;
    // End of variables declaration//GEN-END:variables
}
