
import java.awt.BorderLayout;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.text.StyleConstants;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class PainelCliente extends javax.swing.JPanel {

    /**
     * Creates new form PainelCliente
     */
    public PainelCliente() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_mediaConsumo5 = new javax.swing.JButton();
        jL_tituloLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jB_mediaKmsLitro = new javax.swing.JButton();
        jB_mediaKmsLitro2 = new javax.swing.JButton();
        jB_quantoGastarPercorrer = new javax.swing.JButton();
        jB_alcoolXGasolina = new javax.swing.JButton();
        jB_quantosLitrosVaiDar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jL_tituloLogin1 = new javax.swing.JLabel();
        jB_insiraDadosVeiculo = new javax.swing.JButton();
        jB_suaGaragem = new javax.swing.JButton();
        jB_DespesasMultas = new javax.swing.JButton();
        jB_voltar = new javax.swing.JButton();

        jB_mediaConsumo5.setBackground(new java.awt.Color(139, 199, 238));
        jB_mediaConsumo5.setForeground(new java.awt.Color(255, 255, 255));
        jB_mediaConsumo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/medidor de combustivel.jpeg"))); // NOI18N
        jB_mediaConsumo5.setAlignmentY(0.0F);
        jB_mediaConsumo5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html>\nCalcular a média de <br/> consumo(1)\n</html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jB_mediaConsumo5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_mediaConsumo5.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_mediaConsumo5.setName(""); // NOI18N
        jB_mediaConsumo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_mediaConsumo5MouseClicked(evt);
            }
        });
        jB_mediaConsumo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_mediaConsumo5ActionPerformed(evt);
            }
        });

        jL_tituloLogin.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jL_tituloLogin.setForeground(new java.awt.Color(109, 135, 116));
        jL_tituloLogin.setText("Consult Trip");

        jSeparator1.setForeground(new java.awt.Color(109, 135, 116));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 5));

        jB_mediaKmsLitro.setForeground(new java.awt.Color(255, 255, 255));
        jB_mediaKmsLitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gasolina3.png"))); // NOI18N
        jB_mediaKmsLitro.setAlignmentY(0.0F);
        jB_mediaKmsLitro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html>\nMédia Km's<br/> por litro\n</html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_mediaKmsLitro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_mediaKmsLitro.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_mediaKmsLitro.setName(""); // NOI18N
        jB_mediaKmsLitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_mediaKmsLitroMouseClicked(evt);
            }
        });
        jB_mediaKmsLitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_mediaKmsLitroActionPerformed(evt);
            }
        });

        jB_mediaKmsLitro2.setForeground(new java.awt.Color(255, 255, 255));
        jB_mediaKmsLitro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/full-tank.png"))); // NOI18N
        jB_mediaKmsLitro2.setAlignmentY(0.0F);
        jB_mediaKmsLitro2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html> Média Km's<br/> por litro(2) </html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_mediaKmsLitro2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_mediaKmsLitro2.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_mediaKmsLitro2.setName(""); // NOI18N
        jB_mediaKmsLitro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_mediaKmsLitro2MouseClicked(evt);
            }
        });
        jB_mediaKmsLitro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_mediaKmsLitro2ActionPerformed(evt);
            }
        });

        jB_quantoGastarPercorrer.setForeground(new java.awt.Color(255, 255, 255));
        jB_quantoGastarPercorrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/destino.png"))); // NOI18N
        jB_quantoGastarPercorrer.setAlignmentY(0.0F);
        jB_quantoGastarPercorrer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html> Quanto vou gastar <br/> para percorrer? </html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_quantoGastarPercorrer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_quantoGastarPercorrer.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_quantoGastarPercorrer.setName(""); // NOI18N
        jB_quantoGastarPercorrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_quantoGastarPercorrerMouseClicked(evt);
            }
        });
        jB_quantoGastarPercorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_quantoGastarPercorrerActionPerformed(evt);
            }
        });

        jB_alcoolXGasolina.setForeground(new java.awt.Color(255, 255, 255));
        jB_alcoolXGasolina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alcoolougasolina.png"))); // NOI18N
        jB_alcoolXGasolina.setAlignmentY(0.0F);
        jB_alcoolXGasolina.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html> Álcool ou <br> Gasolina? </html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_alcoolXGasolina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_alcoolXGasolina.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_alcoolXGasolina.setName(""); // NOI18N
        jB_alcoolXGasolina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_alcoolXGasolinaMouseClicked(evt);
            }
        });
        jB_alcoolXGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_alcoolXGasolinaActionPerformed(evt);
            }
        });

        jB_quantosLitrosVaiDar.setForeground(new java.awt.Color(255, 255, 255));
        jB_quantosLitrosVaiDar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bombaDeCombustivel.png"))); // NOI18N
        jB_quantosLitrosVaiDar.setAlignmentY(0.0F);
        jB_quantosLitrosVaiDar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html> Quantos litros <br> vai dar?\n</html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_quantosLitrosVaiDar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_quantosLitrosVaiDar.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_quantosLitrosVaiDar.setName(""); // NOI18N
        jB_quantosLitrosVaiDar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_quantosLitrosVaiDarMouseClicked(evt);
            }
        });
        jB_quantosLitrosVaiDar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_quantosLitrosVaiDarActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(109, 135, 116));

        jL_tituloLogin1.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jL_tituloLogin1.setForeground(new java.awt.Color(109, 135, 116));
        jL_tituloLogin1.setText("Sua área");

        jB_insiraDadosVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jB_insiraDadosVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/carros.png"))); // NOI18N
        jB_insiraDadosVeiculo.setAlignmentY(0.0F);
        jB_insiraDadosVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html>Cadastre seus veiculos</html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_insiraDadosVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_insiraDadosVeiculo.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_insiraDadosVeiculo.setName(""); // NOI18N
        jB_insiraDadosVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_insiraDadosVeiculoMouseClicked(evt);
            }
        });
        jB_insiraDadosVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_insiraDadosVeiculoActionPerformed(evt);
            }
        });

        jB_suaGaragem.setForeground(new java.awt.Color(255, 255, 255));
        jB_suaGaragem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/garagem2.png"))); // NOI18N
        jB_suaGaragem.setAlignmentY(0.0F);
        jB_suaGaragem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html> Sua garagem</html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_suaGaragem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_suaGaragem.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_suaGaragem.setName(""); // NOI18N
        jB_suaGaragem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_suaGaragemMouseClicked(evt);
            }
        });

        jB_DespesasMultas.setForeground(new java.awt.Color(255, 255, 255));
        jB_DespesasMultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dinheiro.png"))); // NOI18N
        jB_DespesasMultas.setAlignmentY(0.0F);
        jB_DespesasMultas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "<html>Despesas/multas</html>", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Segoe UI Emoji", 1, 10), new java.awt.Color(109, 135, 116))); // NOI18N
        jB_DespesasMultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jB_DespesasMultas.setMaximumSize(new java.awt.Dimension(1005, 496));
        jB_DespesasMultas.setName(""); // NOI18N
        jB_DespesasMultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_DespesasMultasMouseClicked(evt);
            }
        });

        jB_voltar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jB_voltar.setForeground(new java.awt.Color(109, 135, 116));
        jB_voltar.setText("Voltar ao login");
        jB_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_voltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_tituloLogin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_insiraDadosVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_suaGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_DespesasMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB_mediaKmsLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_mediaKmsLitro2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_quantoGastarPercorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_quantosLitrosVaiDar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_alcoolXGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jL_tituloLogin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_voltar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_tituloLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jB_mediaKmsLitro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jB_alcoolXGasolina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jB_mediaKmsLitro2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jB_quantoGastarPercorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_quantosLitrosVaiDar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_tituloLogin1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jB_insiraDadosVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_suaGaragem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jB_DespesasMultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jB_voltar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_mediaKmsLitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_mediaKmsLitroActionPerformed
        
    }//GEN-LAST:event_jB_mediaKmsLitroActionPerformed

    private void jB_mediaKmsLitro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_mediaKmsLitro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_mediaKmsLitro2ActionPerformed

    private void jB_mediaKmsLitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_mediaKmsLitroMouseClicked
        
        principalJFrame.painel4 = new PainelMediaKmsLitro(/*produtosArray*/);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel4, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_mediaKmsLitroMouseClicked

    private void jB_mediaKmsLitro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_mediaKmsLitro2MouseClicked
        principalJFrame.painel5 = new PainelMediaKmsLitro2();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel5, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_mediaKmsLitro2MouseClicked

    private void jB_quantoGastarPercorrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_quantoGastarPercorrerMouseClicked
        // enviar para o painel6
        principalJFrame.painel6 = new quantoGastarPercorrer();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel6, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_quantoGastarPercorrerMouseClicked

    private void jB_quantoGastarPercorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_quantoGastarPercorrerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_quantoGastarPercorrerActionPerformed

    private void jB_alcoolXGasolinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_alcoolXGasolinaMouseClicked
        principalJFrame.painel8 = new AlcoolOuGasolina();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel8, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_alcoolXGasolinaMouseClicked

    private void jB_alcoolXGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_alcoolXGasolinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_alcoolXGasolinaActionPerformed

    private void jB_mediaConsumo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_mediaConsumo5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_mediaConsumo5MouseClicked

    private void jB_mediaConsumo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_mediaConsumo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_mediaConsumo5ActionPerformed

    private void jB_quantosLitrosVaiDarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_quantosLitrosVaiDarMouseClicked
        // enviar para o painel7
        principalJFrame.painel7 = new quantosLitroVaiDar();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel7, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_quantosLitrosVaiDarMouseClicked

    private void jB_quantosLitrosVaiDarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_quantosLitrosVaiDarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_quantosLitrosVaiDarActionPerformed

    private void jB_insiraDadosVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_insiraDadosVeiculoMouseClicked
        // TODO add your handling code here:PainelDadosVeiculo painel9
        principalJFrame.painel9 = new PainelDadosVeiculo();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel9, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_insiraDadosVeiculoMouseClicked

    private void jB_insiraDadosVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_insiraDadosVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_insiraDadosVeiculoActionPerformed

    private void jB_suaGaragemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_suaGaragemMouseClicked
        principalJFrame.painel10 = new SuaGaragem();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel10, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_suaGaragemMouseClicked

    private void jB_DespesasMultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_DespesasMultasMouseClicked
        principalJFrame.painel11 = new PainelDespesasMultas();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel11, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_DespesasMultasMouseClicked

    private void jB_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_voltarMouseClicked
        principalJFrame.painel1 = new Login();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel3);
        janela.add(principalJFrame.painel1, BorderLayout.CENTER);
        janela.pack();

    }//GEN-LAST:event_jB_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_DespesasMultas;
    private javax.swing.JButton jB_alcoolXGasolina;
    private javax.swing.JButton jB_insiraDadosVeiculo;
    private javax.swing.JButton jB_mediaConsumo5;
    private javax.swing.JButton jB_mediaKmsLitro;
    private javax.swing.JButton jB_mediaKmsLitro2;
    private javax.swing.JButton jB_quantoGastarPercorrer;
    private javax.swing.JButton jB_quantosLitrosVaiDar;
    private javax.swing.JButton jB_suaGaragem;
    private javax.swing.JButton jB_voltar;
    private javax.swing.JLabel jL_tituloLogin;
    private javax.swing.JLabel jL_tituloLogin1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
