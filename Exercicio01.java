package br.pr.senac.aps.Trabalho02_Swing;

public class Exercicio01 extends javax.swing.JDialog {
     public Exercicio01(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
     }
     
     double numero1, numero2, resultado;
     String operacao;

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaResultado = new javax.swing.JTextField();
        numeroUm = new javax.swing.JButton();
        numeroDois = new javax.swing.JButton();
        numeroZero = new javax.swing.JButton();
        numeroOito = new javax.swing.JButton();
        numeroSete = new javax.swing.JButton();
        numeroSeis = new javax.swing.JButton();
        numeroTres = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        numeroQuatro = new javax.swing.JButton();
        numeroCinco = new javax.swing.JButton();
        numeroNove = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        areaResultado.setFont(new java.awt.Font("Space Mono", 1, 14)); // NOI18N

        numeroUm.setText("1");
        numeroUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroUmActionPerformed(evt);
            }
        });

        numeroDois.setText("2");
        numeroDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroDoisActionPerformed(evt);
            }
        });

        numeroZero.setText("0");
        numeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroZeroActionPerformed(evt);
            }
        });

        numeroOito.setText("8");
        numeroOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroOitoActionPerformed(evt);
            }
        });

        numeroSete.setText("7");
        numeroSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroSeteActionPerformed(evt);
            }
        });

        numeroSeis.setText("6");
        numeroSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroSeisActionPerformed(evt);
            }
        });

        numeroTres.setText("3");
        numeroTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTresActionPerformed(evt);
            }
        });

        calcular.setText("=");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        ponto.setText(".");
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });

        numeroQuatro.setText("4");
        numeroQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroQuatroActionPerformed(evt);
            }
        });

        numeroCinco.setText("5");
        numeroCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCincoActionPerformed(evt);
            }
        });

        numeroNove.setText("9");
        numeroNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroNoveActionPerformed(evt);
            }
        });

        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        subtracao.setText("-");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        multiplicacao.setText("*");
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });

        divisao.setText("/");
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaResultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroTres, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeroSete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroOito, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroNove, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeroQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numeroSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soma, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroOito, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroNove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void numeroZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroZeroActionPerformed
          areaResultado.setText(areaResultado.getText() + "0");
     }//GEN-LAST:event_numeroZeroActionPerformed

     private void numeroUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroUmActionPerformed
          areaResultado.setText(areaResultado.getText() + "1");
     }//GEN-LAST:event_numeroUmActionPerformed

     private void numeroDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDoisActionPerformed
          areaResultado.setText(areaResultado.getText() + "2");
     }//GEN-LAST:event_numeroDoisActionPerformed

     private void numeroTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTresActionPerformed
          areaResultado.setText(areaResultado.getText() + "3");
     }//GEN-LAST:event_numeroTresActionPerformed

     private void numeroQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroQuatroActionPerformed
          areaResultado.setText(areaResultado.getText() + "4");
     }//GEN-LAST:event_numeroQuatroActionPerformed

     private void numeroCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCincoActionPerformed
          areaResultado.setText(areaResultado.getText() + "5");
     }//GEN-LAST:event_numeroCincoActionPerformed

     private void numeroSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroSeisActionPerformed
          areaResultado.setText(areaResultado.getText() + "6");
     }//GEN-LAST:event_numeroSeisActionPerformed

     private void numeroSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroSeteActionPerformed
          areaResultado.setText(areaResultado.getText() + "7");
     }//GEN-LAST:event_numeroSeteActionPerformed

     private void numeroOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroOitoActionPerformed
          areaResultado.setText(areaResultado.getText() + "8");
     }//GEN-LAST:event_numeroOitoActionPerformed

     private void numeroNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroNoveActionPerformed
          areaResultado.setText(areaResultado.getText() + "9");
     }//GEN-LAST:event_numeroNoveActionPerformed

     private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
          numero1 = Double.parseDouble(areaResultado.getText());
          areaResultado.setText(areaResultado.getText() + "+");
          operacao = "+";
          areaResultado.setText("");
     }//GEN-LAST:event_somaActionPerformed

     private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
          numero1 = Double.parseDouble(areaResultado.getText());
          areaResultado.setText(areaResultado.getText() + "-");
          operacao = "-";
          areaResultado.setText("");
     }//GEN-LAST:event_subtracaoActionPerformed

     private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacaoActionPerformed
          numero1 = Double.parseDouble(areaResultado.getText());
          areaResultado.setText(areaResultado.getText() + "*");
          operacao = "*";
          areaResultado.setText("");
     }//GEN-LAST:event_multiplicacaoActionPerformed

     private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoActionPerformed
          numero1 = Double.parseDouble(areaResultado.getText());
          areaResultado.setText(areaResultado.getText() + "/");
          operacao = "/";
          areaResultado.setText("");
     }//GEN-LAST:event_divisaoActionPerformed

     private void pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoActionPerformed
          numero1 = Double.parseDouble(areaResultado.getText());
          areaResultado.setText(areaResultado.getText() + ".");
     }//GEN-LAST:event_pontoActionPerformed

     private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
          numero2 = Double.parseDouble(areaResultado.getText());
          
          if(operacao == "+") {
               resultado = numero1 + numero2;
               areaResultado.setText("" + resultado);
          } else if(operacao == "-") {
               resultado = numero1 - numero2;
               areaResultado.setText("" + resultado);
          } else if(operacao == "*") {
               resultado = numero1 * numero2;
               areaResultado.setText("" + resultado);
          } else {
               resultado = numero1 / numero2;
               areaResultado.setText("" + resultado);
          }
     }//GEN-LAST:event_calcularActionPerformed

     public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    Exercicio01 dialog = new Exercicio01(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                         @Override
                         public void windowClosing(java.awt.event.WindowEvent e) {
                              System.exit(0);
                         }
                    });
                    dialog.setVisible(true);
               }
          });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaResultado;
    private javax.swing.JButton calcular;
    private javax.swing.JButton divisao;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton numeroCinco;
    private javax.swing.JButton numeroDois;
    private javax.swing.JButton numeroNove;
    private javax.swing.JButton numeroOito;
    private javax.swing.JButton numeroQuatro;
    private javax.swing.JButton numeroSeis;
    private javax.swing.JButton numeroSete;
    private javax.swing.JButton numeroTres;
    private javax.swing.JButton numeroUm;
    private javax.swing.JButton numeroZero;
    private javax.swing.JButton ponto;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtracao;
    // End of variables declaration//GEN-END:variables
}
