/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodamemoria;

import java.applet.Applet;
import java.util.Random;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class Jogo extends javax.swing.JFrame {

    private String[][] imgSeries = new String[4][4];
    private Integer pontos = 0;
    private Integer tentativas = 0;
    private String PrimeiraJogada = null;
    private String UltimaJogada = null;
    private Integer btl[] = new Integer[2];
    private Integer btd[] = new Integer[2];
    Integer posicao[] = new Integer[3];
    AudioClip clip;

    public Jogo() {
        initComponents();
        inicializarVariaveis();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        bt07 = new javax.swing.JButton();
        bt02 = new javax.swing.JButton();
        bt03 = new javax.swing.JButton();
        bt04 = new javax.swing.JButton();
        bt01 = new javax.swing.JButton();
        bt06 = new javax.swing.JButton();
        bt09 = new javax.swing.JButton();
        bt08 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt05 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btNovoJogo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfPontuacao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTentativas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TARank = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt07ActionPerformed(evt);
            }
        });

        bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt02ActionPerformed(evt);
            }
        });

        bt03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt03ActionPerformed(evt);
            }
        });

        bt04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt04ActionPerformed(evt);
            }
        });

        bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt01ActionPerformed(evt);
            }
        });

        bt06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt06ActionPerformed(evt);
            }
        });

        bt09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt09ActionPerformed(evt);
            }
        });

        bt08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt08ActionPerformed(evt);
            }
        });

        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });

        bt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt16ActionPerformed(evt);
            }
        });

        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });

        bt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt15ActionPerformed(evt);
            }
        });

        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });

        bt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt14ActionPerformed(evt);
            }
        });

        bt05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt05ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Jogo da Memória - Séries");
        jLabel1.setToolTipText("");

        btNovoJogo.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btNovoJogo.setForeground(new java.awt.Color(0, 102, 102));
        btNovoJogo.setText("Novo Jogo");
        btNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoJogoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Tentativas");

        tfPontuacao.setEditable(false);
        tfPontuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPontuacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Pontuação");

        tfTentativas.setEditable(false);
        tfTentativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTentativasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Rank");

        TARank.setColumns(20);
        TARank.setRows(5);
        jScrollPane2.setViewportView(TARank);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt01, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(bt05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt03, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt04, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt06, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt07, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt08, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt09, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTentativas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(btNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt01, bt02, bt03, bt04, bt05, bt06, bt07, bt08, bt09, bt10, bt11, bt12, bt13, bt14, bt15, bt16});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTentativas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt04, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(bt05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt11, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(bt10, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(bt12, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt01, bt02, bt03, bt04, bt05, bt06, bt07, bt08, bt09, bt10, bt11, bt12, bt13, bt14, bt15, bt16});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt02ActionPerformed
        bt02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[0][1])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[0][1];

            btl[1] = 2;
            btd[1] = 2;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[0][1];
            bt02.setEnabled(false);
            btl[0] = 2;
            btd[0] = 2;
        }
        
    }//GEN-LAST:event_bt02ActionPerformed

    private void btNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoJogoActionPerformed

        btl[0] = 0;
        btl[1] = 0;
        btd[0] = 0;
        btd[1] = 0;

        bt01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt01.setEnabled(true);
        bt02.setEnabled(true);
        bt03.setEnabled(true);
        bt04.setEnabled(true);
        bt05.setEnabled(true);
        bt06.setEnabled(true);
        bt07.setEnabled(true);
        bt08.setEnabled(true);
        bt09.setEnabled(true);
        bt10.setEnabled(true);
        bt11.setEnabled(true);
        bt12.setEnabled(true);
        bt13.setEnabled(true);
        bt14.setEnabled(true);
        bt15.setEnabled(true);
        bt16.setEnabled(true);

        terminarMusica();
        tentativas = 0;
        inicializarVariaveis();
        tfPontuacao.setText("");
        tfTentativas.setText("");
        pontos = 0;
        PrimeiraJogada = null;
        UltimaJogada = null;
    }//GEN-LAST:event_btNovoJogoActionPerformed


    private void tfPontuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPontuacaoActionPerformed


    }//GEN-LAST:event_tfPontuacaoActionPerformed

    private void tfTentativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTentativasActionPerformed


    }//GEN-LAST:event_tfTentativasActionPerformed

    private void bt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt01ActionPerformed
        bt01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[0][0])));
        
        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[0][0];

            btl[1] = 1;
            btd[1] = 1;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[0][0];
            bt01.setEnabled(false);
            btl[0] = 1;
            btd[0] = 1;

        }
        
    }//GEN-LAST:event_bt01ActionPerformed

    private void bt03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt03ActionPerformed
        bt03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[0][2])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[0][2];

            btl[1] = 3;
            btd[1] = 3;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[0][2];
            bt03.setEnabled(false);
            btl[0] = 3;
            btd[0] = 3;
        }
        
    }//GEN-LAST:event_bt03ActionPerformed

    private void bt04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt04ActionPerformed
        bt04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[0][3])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[0][3];

            btl[1] = 4;
            btd[1] = 4;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[0][3];
            bt04.setEnabled(false);
            btl[0] = 4;
            btd[0] = 4;
        }
        

    }//GEN-LAST:event_bt04ActionPerformed

    private void bt05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt05ActionPerformed
        bt05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[1][0])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[1][0];

            btl[1] = 5;
            btd[1] = 5;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[1][0];
            bt05.setEnabled(false);
            btl[0] = 5;
            btd[0] = 5;
        }
        
    }//GEN-LAST:event_bt05ActionPerformed

    private void bt06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt06ActionPerformed
        bt06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[1][1])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[1][1];

            btl[1] = 6;
            btd[1] = 6;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[1][1];
            bt07.setEnabled(false);
            btl[0] = 6;
            btd[0] = 6;
        }
        
    }//GEN-LAST:event_bt06ActionPerformed

    private void bt07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt07ActionPerformed
        bt07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[1][2])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[1][2];

            btl[1] = 7;
            btd[1] = 7;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[1][2];
            btl[0] = 7;
            btd[0] = 7;
            bt07.setEnabled(false);
        }
        
    }//GEN-LAST:event_bt07ActionPerformed

    private void bt08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt08ActionPerformed
        bt08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[1][3])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[1][3];

            btl[1] = 8;
            btd[1] = 8;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[1][3];
            bt08.setEnabled(false);
            btl[0] = 8;
            btd[0] = 8;
        }
        
    }//GEN-LAST:event_bt08ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        bt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[2][1])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[2][1];

            btl[1] = 10;
            btd[1] = 10;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[2][1];
            bt10.setEnabled(false);
            btl[0] = 10;
            btd[0] = 10;
        }
        
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        bt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[2][2])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[2][2];

            btl[1] = 11;
            btd[1] = 11;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[2][2];
            bt11.setEnabled(false);
            btl[0] = 11;
            btd[0] = 11;
        }
        
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        bt12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[2][3])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[2][3];

            btl[1] = 12;
            btd[1] = 12;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[2][3];
            bt12.setEnabled(false);
            btl[0] = 12;
            btd[0] = 12;
        }
       
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt14ActionPerformed
        bt14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[3][1])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[3][1];
            //chama um metodo com diferente processamento

            btl[1] = 14;
            btd[1] = 14;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[3][1];
            bt14.setEnabled(false);
            btl[0] = 14;
            btd[0] = 14;
        }
        
    }//GEN-LAST:event_bt14ActionPerformed

    private void bt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt15ActionPerformed
        bt15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[3][2])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[3][2];
            //chama um metodo com diferente processamento

            btl[1] = 15;
            btd[1] = 15;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[3][2];
            bt15.setEnabled(false);
            btl[0] = 15;
            btd[0] = 15;
        }
    }//GEN-LAST:event_bt15ActionPerformed

    private void bt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt16ActionPerformed
        bt16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[3][3])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[3][3];

            //chama um metodo com diferente processamento
            btl[1] = 16;
            btd[1] = 16;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[3][3];
            bt16.setEnabled(false);
            btl[0] = 16;
            btd[0] = 16;
        }
        
    }//GEN-LAST:event_bt16ActionPerformed

    private void bt09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt09ActionPerformed
        bt09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[2][0])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[2][0];

            btl[1] = 9;
            btd[1] = 9;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[2][0];
            bt09.setEnabled(false);
            btl[0] = 9;
            btd[0] = 9;
        }
        
    }//GEN-LAST:event_bt09ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        bt13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/" + imgSeries[3][0])));

        if (PrimeiraJogada != null) {
            UltimaJogada = imgSeries[3][0];

            btl[1] = 13;
            btd[1] = 13;
            verificar();
        } else {
            PrimeiraJogada = imgSeries[3][0];
            bt13.setEnabled(false);
            btl[0] = 13;
            btd[0] = 13;
        }
        
    }//GEN-LAST:event_bt13ActionPerformed

    public void verificar() {
        tentativas += 1;
        if (PrimeiraJogada == null ? UltimaJogada == null : PrimeiraJogada.equals(UltimaJogada)) {
            JOptionPane.showMessageDialog(this, ("Formou par!"), "Ganhador", JOptionPane.INFORMATION_MESSAGE);

            desligarBotao(btd[0], btd[1]);
            terminarMusica();
            musica();
            limpar();
            pontos += 1;
            tfPontuacao.setText(pontos.toString());
            if (pontos == 8) {
                JOptionPane.showMessageDialog(this, ("Você zerou o jogo"), "Parabéns!!!", JOptionPane.INFORMATION_MESSAGE);

                Rankfinal();
            }
        } else {
            JOptionPane.showMessageDialog(this, ("Não formou par!"), "perdedor", JOptionPane.INFORMATION_MESSAGE);
            // é melhor chamar um metodo para limpar
            ligarBotao(btl[0], btl[1]);
            limpar();
            virarnovamente();

        }

        tfTentativas.setText(tentativas.toString());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TARank;
    private javax.swing.JButton bt01;
    private javax.swing.JButton bt02;
    private javax.swing.JButton bt03;
    private javax.swing.JButton bt04;
    private javax.swing.JButton bt05;
    private javax.swing.JButton bt06;
    private javax.swing.JButton bt07;
    private javax.swing.JButton bt08;
    private javax.swing.JButton bt09;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton btNovoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfPontuacao;
    private javax.swing.JTextField tfTentativas;
    // End of variables declaration//GEN-END:variables

    private void inicializarVariaveis() {
        virarnovamente();
        btl[0] = 0;
        btl[1] = 0;
        btd[0] = 0;
        btd[1] = 0;

        ArrayList imagens = new ArrayList();

        for (int i = 1; i < 9; i++) {
            imagens.add("imagens/" + i + ".jpg");

        }
        for (int i = 1; i < 9; i++) {
            imagens.add("imagens/" + i + ".jpg");

        }

        Collections.shuffle(imagens);
        int e = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                imgSeries[i][j] = (String) imagens.get(e);
                e += 1;

            }
        }

    }

    private void virarnovamente() {

        bt01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));
        bt16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogodamemoria/imagens/cartavirada.jpg")));

    }

    public void limpar() {
        btl[0] = 0;
        btl[1] = 0;
        btd[1] = 0;
        btd[0] = 0;
        PrimeiraJogada = null;
        UltimaJogada = null;

    }

    private void musica() {

        switch (PrimeiraJogada) {

            case "imagens/1.jpg":
                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/Ummaluconopedacosong.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "imagens/2.jpg":

                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/DoctorWhoTheme.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "imagens/3.jpg":
                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/LuciferSoundtrack.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "imagens/4.jpg":
                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/TheVampireDiariesTheme.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            case "imagens/5.jpg":
                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/TheFlashCWSong.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "imagens/6.jpg":
                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/PrettyLittleLiarsIntro.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "imagens/7.jpg":
                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/SleepyHollowSong.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "imagens/8.jpg":
                try {
                    clip = Applet.newAudioClip(
                            getClass().getResource("/jogodamemoria/musicas/KlausMikaelson.wav").toURI().toURL());
                    clip.play();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

    private void desligarBotao(int i, int z) {

        switch (i) {

            case 1:
                bt01.setEnabled(false);
                break;
            case 2:
                bt02.setEnabled(false);
                break;
            case 3:
                bt03.setEnabled(false);
                break;
            case 4:
                bt04.setEnabled(false);
                break;
            case 5:
                bt05.setEnabled(false);
                break;
            case 6:
                bt06.setEnabled(false);
                break;
            case 7:
                bt07.setEnabled(false);
                break;

            case 8:
                bt08.setEnabled(false);
                break;

            case 9:
                bt09.setEnabled(false);
                break;

            case 10:
                bt10.setEnabled(false);
                break;

            case 11:
                bt11.setEnabled(false);
                break;
            case 12:
                bt12.setEnabled(false);
                break;
            case 13:
                bt13.setEnabled(false);
                break;
            case 14:
                bt14.setEnabled(false);
                break;
            case 15:
                bt15.setEnabled(false);
                break;
            case 16:
                bt16.setEnabled(false);
                break;
            default:

                break;

        }
        switch (z) {
            case 1:
                bt01.setEnabled(false);
                break;
            case 2:
                bt02.setEnabled(false);
                break;
            case 3:
                bt03.setEnabled(false);
                break;
            case 4:
                bt04.setEnabled(false);
                break;
            case 5:
                bt05.setEnabled(false);
                break;
            case 6:
                bt06.setEnabled(false);
                break;
            case 7:
                bt07.setEnabled(false);
                break;

            case 8:
                bt08.setEnabled(false);
                break;

            case 9:
                bt09.setEnabled(false);
                break;

            case 10:
                bt10.setEnabled(false);
                break;

            case 11:
                bt11.setEnabled(false);
                break;
            case 12:
                bt12.setEnabled(false);
                break;
            case 13:
                bt13.setEnabled(false);
                break;
            case 14:
                bt14.setEnabled(false);
                break;
            case 15:
                bt15.setEnabled(false);
                break;
            case 16:
                bt16.setEnabled(false);
                break;
            default:
                break;
        }
    }

    private void ligarBotao(int i, int z) {
        switch (i) {
            case 1:
                bt01.setEnabled(true);
                break;
            case 2:
                bt02.setEnabled(true);
                break;
            case 3:
                bt03.setEnabled(true);
                break;
            case 4:
                bt04.setEnabled(true);
                break;
            case 5:
                bt05.setEnabled(true);
                break;
            case 6:
                bt06.setEnabled(true);
                break;
            case 7:
                bt07.setEnabled(true);
                break;

            case 8:
                bt08.setEnabled(true);
                break;

            case 9:
                bt09.setEnabled(true);
                break;

            case 10:
                bt10.setEnabled(true);
                break;

            case 11:
                bt11.setEnabled(true);
                break;
            case 12:
                bt12.setEnabled(true);
                break;
            case 13:
                bt13.setEnabled(true);
                break;
            case 14:
                bt14.setEnabled(true);
                break;
            case 15:
                bt15.setEnabled(true);
                break;
            case 16:
                bt16.setEnabled(true);
                break;
            default:
                break;
        }
        switch (z) {
            case 1:
                bt01.setEnabled(true);
                break;
            case 2:
                bt02.setEnabled(true);
                break;
            case 3:
                bt03.setEnabled(true);
                break;
            case 4:
                bt04.setEnabled(true);
                break;
            case 5:
                bt05.setEnabled(true);
                break;
            case 6:
                bt06.setEnabled(true);
                break;
            case 7:
                bt07.setEnabled(true);
                break;

            case 8:
                bt08.setEnabled(true);
                break;

            case 9:
                bt09.setEnabled(true);
                break;

            case 10:
                bt10.setEnabled(true);
                break;

            case 11:
                bt11.setEnabled(true);
                break;
            case 12:
                bt12.setEnabled(true);
                break;
            case 13:
                bt13.setEnabled(true);
                break;
            case 14:
                bt14.setEnabled(true);
                break;
            case 15:
                bt15.setEnabled(true);
                break;
            case 16:
                bt16.setEnabled(true);
                break;
            default:
                break;
        }
    }

    private void terminarMusica() {
        if (clip != null) {
            clip.stop();
            clip = null;
        }
    }

    private void Rankfinal() {

        //primeira verificação
        if (posicao[0] == null) {
            TARank.setText("");
            posicao[0] = tentativas;
            TARank.append("1ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");

        } // segunda verificação
        else if (posicao[1] == null) {
            TARank.setText("");
            posicao[1] = tentativas;
            if (posicao[1] < posicao[0]) {
                TARank.append("1ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");
                TARank.append("2ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");

            } else if(posicao[0] < posicao[1]){
                TARank.append("1ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
                TARank.append("2ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");

            }else if(posicao[1] < posicao[0]){
                TARank.append("1ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");
                TARank.append("2ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
            }else{
                TARank.append("Todos tiveram a mesma quantidade de tentativas! \r\n");
                TARank.append("1ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
                TARank.append("2ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");
            }
            
            // ultima verifição
        } else if (posicao[2] == null) {
            posicao[2] = tentativas;
            TARank.setText("");
            if (posicao[2] < posicao[1] && posicao[2] < posicao[0]) {
                if (posicao[1] < posicao[0]) {
                    TARank.append("1ª colocação foi o que fez " + posicao[2].toString() + " tentativas\r\n");
                    TARank.append("2ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");
                    TARank.append("3ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");

                } else if(posicao[0] < posicao[1]) {
                    TARank.append("1ª colocação foi o que fez " + posicao[2].toString() + " tentativas\r\n");
                    TARank.append("2ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
                    TARank.append("3ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");

                }else{
                    TARank.append("Todos tiveram a mesma quantidade de tentativas! \r\n");
                    TARank.append("1ª colocação foi o que fez " + posicao[2].toString() + " tentativas\r\n");
                    TARank.append("1ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
                    TARank.append("1ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");
                
                }

            } else if (posicao[1] < posicao[2] && posicao[1] < posicao[0]) {
                if (posicao[2] < posicao[0]) {
                    TARank.append("1ª colocação foi o que fez " + posicao[1].toString() + "\r\n");
                    TARank.append("2ª colocação foi o que fez " + posicao[2].toString() + "\r\n");
                    TARank.append("3ª colocação foi o que fez " + posicao[0].toString() + "\r\n");

                } else if(posicao[0] < posicao[2]){
                    TARank.append("1ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");
                    TARank.append("2ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
                    TARank.append("3ª colocação foi o que fez " + posicao[2].toString() + " tentativas\r\n");

                }else{
                    TARank.append("Todos tiveram a mesma quantidade de tentativas! \r\n");
                    TARank.append("1ª colocação " + posicao[1].toString() + "\r\n");
                    TARank.append("1ª colocação " + posicao[0].toString() + "\r\n");
                    TARank.append("1ª colocação " + posicao[2].toString() + "\r\n");
                
                }

            } else if (posicao[0] < posicao[2] && posicao[0] < posicao[1]) {
                if (posicao[2] < posicao[1]) {
                    TARank.append("1ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
                    TARank.append("2ª colocação foi o que fez " + posicao[2].toString() + " tentativas\r\n");
                    TARank.append("3ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");

                } else if(posicao[1] < posicao[2]){
                    TARank.append("1ª colocação foi o que fez " + posicao[0].toString() + " tentativas\r\n");
                    TARank.append("2ª colocação foi o que fez " + posicao[1].toString() + " tentativas\r\n");
                    TARank.append("3ª colocação foi o que fez " + posicao[2].toString() + " tentativas\r\n");

                }else{
                    TARank.append("Todos tiveram a mesma quantidade de tentativas! \r\n");
                    TARank.append("1ª colocação " + posicao[0].toString() + "\r\n");
                    TARank.append("1ª colocação " + posicao[1].toString() + "\r\n");
                    TARank.append("1ª colocação " + posicao[2].toString() + "\r\n");
                }

            }
            posicao[0] = null;
            posicao[1] = null;
            posicao[2] = null;
        }

    }

}
