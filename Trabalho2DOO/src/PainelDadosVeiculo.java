
import Clases.Audios.AudioErro;
import Clases.Empacotamento;
import Clases.Veiculo;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author nicka
 */
public class PainelDadosVeiculo extends javax.swing.JPanel {
    
    ArrayList<Veiculo> despesasArray = new ArrayList<>();
    /**
     * Creates new form PainelDadosVeiculo
     */
    public PainelDadosVeiculo() {
        initComponents();
        jPanel2.setVisible(false);
        this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jL_tituloLogin4 = new javax.swing.JLabel();
        jL_valorCombustivel1 = new javax.swing.JLabel();
        jTF_marcaDoVeiculo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTF_modeloDoVeiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_anoDoVeiculo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTF_motorizacao = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTF_cor = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jFTF_kilometragem = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        jTF_placa = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jCB_tipoDoVeiculo = new javax.swing.JComboBox<>();
        jB_insiraManutencao = new javax.swing.JButton();
        jL_tituloLogin3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jL_tituloLogin5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jFTF_trocaOleo = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        jFTF_trocaOleoData = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jFTF_trocaFiltroOleo = new javax.swing.JFormattedTextField();
        jFTF_trocaFiltroOleoData = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jFTF_trocaFiltroAr = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        jFTF_trocaFiltroArData = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        jFTF_trocaFiltroArCondicionado = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        jFTF_trocaFiltroArCondicionadoData = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jFTF_trocaFiltroCombustivel = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        jFTF_trocaFiltroCombustivelData = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        jFTF_trocaCorreiaDentada = new javax.swing.JFormattedTextField();
        jLabel39 = new javax.swing.JLabel();
        jFTF_trocaCorreiaDentadaData = new javax.swing.JFormattedTextField();
        jB_salvar = new javax.swing.JButton();
        jB_voltar = new javax.swing.JButton();
        jB_resetarInformacoes = new javax.swing.JButton();

        setBackground(new java.awt.Color(179, 200, 144));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(179, 200, 144));

        jPanel1.setBackground(new java.awt.Color(179, 200, 144));

        jL_tituloLogin4.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jL_tituloLogin4.setForeground(java.awt.Color.white);
        jL_tituloLogin4.setText("Insira os dados do seu veículo");

        jL_valorCombustivel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_valorCombustivel1.setForeground(new java.awt.Color(255, 255, 255));
        jL_valorCombustivel1.setText("Marca do veiculo:");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Modelo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ano do veículo:");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Motorização:");

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cor:");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Kilometragem:");

        jFTF_kilometragem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFTF_kilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTF_kilometragemActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Placa:");

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Tipo do veiculo:");

        jCB_tipoDoVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Carro", "Moto", "Caminhão", "Onibus" }));
        jCB_tipoDoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_tipoDoVeiculoActionPerformed(evt);
            }
        });

        jB_insiraManutencao.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jB_insiraManutencao.setForeground(new java.awt.Color(109, 135, 116));
        jB_insiraManutencao.setText("Isira os dados da ultima manutencao");
        jB_insiraManutencao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_insiraManutencaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jL_tituloLogin4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTF_kilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTF_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jCB_tipoDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jB_insiraManutencao)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jL_valorCombustivel1)
                                .addComponent(jTF_marcaDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jTF_modeloDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTF_anoDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTF_motorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jL_tituloLogin4)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jL_valorCombustivel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTF_marcaDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTF_motorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_modeloDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_anoDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTF_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCB_tipoDoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTF_kilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jB_insiraManutencao)
                .addContainerGap())
        );

        jL_tituloLogin3.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jL_tituloLogin3.setText("Consult Trip");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(179, 200, 144));

        jL_tituloLogin5.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jL_tituloLogin5.setForeground(java.awt.Color.white);
        jL_tituloLogin5.setText("<html>Insira os dados sobre a ultima <br>manutensão básica<html>");

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ultima troca de oléo:");

        jFTF_trocaOleo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFTF_trocaOleo.setToolTipText("<html>Isira a kilometragem<br> em que foi feita a troca<html>");
        jFTF_trocaOleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTF_trocaOleoActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Data:");

        try {
            jFTF_trocaOleoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_trocaOleoData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTF_trocaOleoData.setText("__/__/__");
        jFTF_trocaOleoData.setToolTipText("<html>Digite somente os numeros,<br> sem usar \".\" ou \",\"<html>");

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("<html>Troca do filtro<br> de oléo:<html>");

        jFTF_trocaFiltroOleo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFTF_trocaFiltroOleo.setToolTipText("<html>Isira a kilometragem<br> em que foi feita a troca<html>");
        jFTF_trocaFiltroOleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTF_trocaFiltroOleoActionPerformed(evt);
            }
        });

        try {
            jFTF_trocaFiltroOleoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_trocaFiltroOleoData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTF_trocaFiltroOleoData.setToolTipText("<html>Digite somente os numeros,<br> sem usar \".\" ou \",\"<html>");

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Data:");

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Troca do filtro de ar:");

        jFTF_trocaFiltroAr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFTF_trocaFiltroAr.setToolTipText("<html>Isira a kilometragem<br> em que foi feita a troca<html>");
        jFTF_trocaFiltroAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTF_trocaFiltroArActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Data:");

        try {
            jFTF_trocaFiltroArData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_trocaFiltroArData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTF_trocaFiltroArData.setToolTipText("<html>Digite somente os numeros,<br> sem usar \".\" ou \",\"<html>");

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("<html>Troca do filtro <br>do ar-condicionado.:<html>");

        jFTF_trocaFiltroArCondicionado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFTF_trocaFiltroArCondicionado.setToolTipText("<html>Isira a kilometragem<br> em que foi feita a troca<html>");
        jFTF_trocaFiltroArCondicionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTF_trocaFiltroArCondicionadoActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Data:");

        try {
            jFTF_trocaFiltroArCondicionadoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_trocaFiltroArCondicionadoData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTF_trocaFiltroArCondicionadoData.setToolTipText("<html>Digite somente os numeros,<br> sem usar \".\" ou \",\"<html>");

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("<html>Troca do filtro <br>de combustível:<html>");

        jFTF_trocaFiltroCombustivel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFTF_trocaFiltroCombustivel.setToolTipText("<html>Isira a kilometragem<br> em que foi feita a troca<html>");
        jFTF_trocaFiltroCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTF_trocaFiltroCombustivelActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Data:");

        try {
            jFTF_trocaFiltroCombustivelData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_trocaFiltroCombustivelData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTF_trocaFiltroCombustivelData.setToolTipText("<html>Digite somente os numeros,<br> sem usar \".\" ou \",\"<html>");

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("<html>Troca da correia <br>dentada:<html>");

        jFTF_trocaCorreiaDentada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFTF_trocaCorreiaDentada.setToolTipText("<html>Isira a kilometragem<br> em que foi feita a troca<html>");
        jFTF_trocaCorreiaDentada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTF_trocaCorreiaDentadaActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Data:");

        try {
            jFTF_trocaCorreiaDentadaData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_trocaCorreiaDentadaData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTF_trocaCorreiaDentadaData.setToolTipText("<html>Digite somente os numeros,<br> sem usar \".\" ou \",\"<html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jL_tituloLogin5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTF_trocaOleo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTF_trocaOleoData, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFTF_trocaFiltroOleo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFTF_trocaFiltroArCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFTF_trocaFiltroAr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jFTF_trocaFiltroCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jFTF_trocaCorreiaDentada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFTF_trocaFiltroCombustivelData, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFTF_trocaCorreiaDentadaData))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFTF_trocaFiltroOleoData))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFTF_trocaFiltroArData))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFTF_trocaFiltroArCondicionadoData)))))
                        .addGap(107, 107, 107))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_tituloLogin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29)
                            .addComponent(jFTF_trocaOleoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTF_trocaOleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(jFTF_trocaFiltroOleoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTF_trocaFiltroOleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jFTF_trocaFiltroArData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTF_trocaFiltroAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jFTF_trocaFiltroArCondicionadoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTF_trocaFiltroArCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(jFTF_trocaFiltroCombustivelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTF_trocaFiltroCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(jFTF_trocaCorreiaDentadaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTF_trocaCorreiaDentada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jB_salvar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jB_salvar.setForeground(new java.awt.Color(109, 135, 116));
        jB_salvar.setText("Salvar");
        jB_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_salvarMouseClicked(evt);
            }
        });

        jB_voltar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jB_voltar.setForeground(new java.awt.Color(109, 135, 116));
        jB_voltar.setText("Voltar");
        jB_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_voltarMouseClicked(evt);
            }
        });

        jB_resetarInformacoes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jB_resetarInformacoes.setForeground(new java.awt.Color(109, 135, 116));
        jB_resetarInformacoes.setText("<html>Limpar todos os<br>dados inseridos<html>");
        jB_resetarInformacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_resetarInformacoesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_tituloLogin3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jB_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_resetarInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_tituloLogin3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_voltar)
                            .addComponent(jB_salvar)))
                    .addComponent(jB_resetarInformacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jB_resetarInformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_resetarInformacoesMouseClicked
        jTF_anoDoVeiculo.setText("");
        jTF_placa.setText("");
        jTF_modeloDoVeiculo.setText("");
        jTF_cor.setText("");
        jTF_marcaDoVeiculo.setText("");
        jTF_motorizacao.setText("");
        jTF_placa.setText("");
        jFTF_kilometragem.setText("");
        jFTF_trocaCorreiaDentada.setText("");
        jFTF_trocaCorreiaDentadaData.setText("");
        jFTF_trocaFiltroAr.setText("");
        jFTF_trocaFiltroArCondicionado.setText("");
        jFTF_trocaFiltroArCondicionadoData.setText("");
        jFTF_trocaFiltroArData.setText("");
        jFTF_trocaFiltroCombustivelData.setText("");
        jFTF_trocaFiltroOleo.setText("");
        jFTF_trocaOleo.setText("");
        jFTF_trocaFiltroOleoData.setText("");
        jFTF_trocaOleoData.setText("");
    }//GEN-LAST:event_jB_resetarInformacoesMouseClicked

    private void jB_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_voltarMouseClicked
        principalJFrame.painel3 = new PainelCliente();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel9);
        janela.add(principalJFrame.painel3, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jB_voltarMouseClicked

    private void jB_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_salvarMouseClicked
        
        if (jTF_marcaDoVeiculo.getText().equals("") || jTF_modeloDoVeiculo.getText().equals("") || jCB_tipoDoVeiculo.getSelectedIndex() == 0){
            //Som de erro!
                AudioErro audioErro = new AudioErro();
                audioErro.AudioErro();
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else {
            //Adicionar
            Veiculo veiculos = new Veiculo(jTF_marcaDoVeiculo.getText(), jTF_modeloDoVeiculo.getText(), jTF_anoDoVeiculo.getText(), jTF_cor.getText(), jTF_motorizacao.getText(), jTF_placa.getText(), (String) jCB_tipoDoVeiculo.getSelectedItem(), jFTF_kilometragem.getText());
            principalJFrame.usuario.getVeiculosArray().add(veiculos);
            //
            JOptionPane.showMessageDialog(null, "Os dados inseridos foram salvos!");
        }
    }//GEN-LAST:event_jB_salvarMouseClicked

    private void jFTF_trocaCorreiaDentadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTF_trocaCorreiaDentadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTF_trocaCorreiaDentadaActionPerformed

    private void jFTF_trocaFiltroCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTF_trocaFiltroCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTF_trocaFiltroCombustivelActionPerformed

    private void jFTF_trocaFiltroArCondicionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTF_trocaFiltroArCondicionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTF_trocaFiltroArCondicionadoActionPerformed

    private void jFTF_trocaFiltroArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTF_trocaFiltroArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTF_trocaFiltroArActionPerformed

    private void jFTF_trocaFiltroOleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTF_trocaFiltroOleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTF_trocaFiltroOleoActionPerformed

    private void jFTF_trocaOleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTF_trocaOleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTF_trocaOleoActionPerformed

    private void jB_insiraManutencaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_insiraManutencaoMouseClicked
        jPanel2.setVisible(true);

    }//GEN-LAST:event_jB_insiraManutencaoMouseClicked

    private void jCB_tipoDoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_tipoDoVeiculoActionPerformed
        int tipo = jCB_tipoDoVeiculo.getItemCount();
        if (tipo == 1) {
            jFTF_trocaCorreiaDentadaData.setVisible(false);
            jFTF_trocaCorreiaDentada.setVisible(false);
            jLabel38.setVisible(false);
            jLabel39.setVisible(false);
        }else{
            jFTF_trocaCorreiaDentadaData.setVisible(true);
            jFTF_trocaCorreiaDentada.setVisible(true);
            jLabel38.setVisible(true);
            jLabel39.setVisible(true);
        }
    }//GEN-LAST:event_jCB_tipoDoVeiculoActionPerformed

    private void jFTF_kilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTF_kilometragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTF_kilometragemActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_insiraManutencao;
    private javax.swing.JButton jB_resetarInformacoes;
    private javax.swing.JButton jB_salvar;
    private javax.swing.JButton jB_voltar;
    private javax.swing.JComboBox<String> jCB_tipoDoVeiculo;
    private javax.swing.JFormattedTextField jFTF_kilometragem;
    private javax.swing.JFormattedTextField jFTF_trocaCorreiaDentada;
    private javax.swing.JFormattedTextField jFTF_trocaCorreiaDentadaData;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroAr;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroArCondicionado;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroArCondicionadoData;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroArData;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroCombustivel;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroCombustivelData;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroOleo;
    private javax.swing.JFormattedTextField jFTF_trocaFiltroOleoData;
    private javax.swing.JFormattedTextField jFTF_trocaOleo;
    private javax.swing.JFormattedTextField jFTF_trocaOleoData;
    private javax.swing.JLabel jL_tituloLogin3;
    private javax.swing.JLabel jL_tituloLogin4;
    private javax.swing.JLabel jL_tituloLogin5;
    private javax.swing.JLabel jL_valorCombustivel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTF_anoDoVeiculo;
    private javax.swing.JTextField jTF_cor;
    private javax.swing.JTextField jTF_marcaDoVeiculo;
    private javax.swing.JTextField jTF_modeloDoVeiculo;
    private javax.swing.JTextField jTF_motorizacao;
    private javax.swing.JTextField jTF_placa;
    // End of variables declaration//GEN-END:variables
}
