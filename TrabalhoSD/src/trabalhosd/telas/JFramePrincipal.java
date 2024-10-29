/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhosd.telas;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.ListModel;
import trabalhosd.TcpCliente;

/**
 *
 * @author umestudantecristao
 */
public class JFramePrincipal extends javax.swing.JFrame {

    ArrayList<Integer> listaSintomas = null;
    TcpCliente cliente = null;
    DefaultListModel modelDiagnostico = null;
    double progresso;

    public JFramePrincipal() {
        initComponents();
        cliente = new TcpCliente(listaSintomas);
        modelDiagnostico = new DefaultListModel();
        jProgressBar.setValue(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonTreinarAlgoritmo = new javax.swing.JButton();
        jButtonGerarDiagnostico = new javax.swing.JButton();
        jButtonAvaliarAlgoritmo = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMain = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de diagnósticos médicos");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Fira Sans Book", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SISTEMA");

        jButtonTreinarAlgoritmo.setFont(new java.awt.Font("Fira Sans Condensed Book", 0, 18)); // NOI18N
        jButtonTreinarAlgoritmo.setText("Treinar algoritmo");
        jButtonTreinarAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTreinarAlgoritmoActionPerformed(evt);
            }
        });

        jButtonGerarDiagnostico.setFont(new java.awt.Font("Fira Sans Condensed Book", 0, 18)); // NOI18N
        jButtonGerarDiagnostico.setText("Gerar diagnóstico");
        jButtonGerarDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarDiagnosticoActionPerformed(evt);
            }
        });

        jButtonAvaliarAlgoritmo.setFont(new java.awt.Font("Fira Sans Condensed Book", 0, 18)); // NOI18N
        jButtonAvaliarAlgoritmo.setText("Avaliar algoritmo");
        jButtonAvaliarAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvaliarAlgoritmoActionPerformed(evt);
            }
        });

        jProgressBar.setForeground(new java.awt.Color(51, 255, 51));
        jProgressBar.setValue(70);
        jProgressBar.setStringPainted(true);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Confiabilidade do algoritmo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAvaliarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGerarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTreinarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addComponent(jButtonTreinarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonAvaliarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonGerarDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Fira Sans Book", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sintomas");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jListMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jListMain.setFont(new java.awt.Font("Fira Sans Condensed", 1, 12)); // NOI18N
        jListMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListMain);

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextPane1.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jTextPane1);

        jLabel4.setFont(new java.awt.Font("Fira Sans Book", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Diagnóstico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(331, 331, 331)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAvaliarAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvaliarAlgoritmoActionPerformed
        JDialogAvaliarAlgoritmo tela = new JDialogAvaliarAlgoritmo(this, true);
        tela.setVisible(true);
        
        listaSintomas = tela.getResposta();
        cliente.setListaSintomas(listaSintomas);
        atualizarModel(listaSintomas, "Avaliação");
        enviarLista();
        
        int i = JOptionPane.showConfirmDialog(this, "Este diagnóstico está correto?", "Avaliação", YES_NO_OPTION);
        System.out.println(i);
        if(i == 0){
            listaSintomas.set(10, -3);   
        }else{
            listaSintomas.set(10, -4);
        }
        cliente.setListaSintomas(listaSintomas);
        enviarLista();
        System.out.println(cliente.getConf());
        jProgressBar.setValue((int) cliente.getConf());
    }//GEN-LAST:event_jButtonAvaliarAlgoritmoActionPerformed

    private void jButtonGerarDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarDiagnosticoActionPerformed
        JDialogGerarDiagnostico tela = new JDialogGerarDiagnostico(this, true);
        tela.setVisible(true);
        
        listaSintomas = tela.getResposta();
        cliente.setListaSintomas(listaSintomas);
        atualizarModel(listaSintomas, "Diagnóstico");
        enviarLista();
    }//GEN-LAST:event_jButtonGerarDiagnosticoActionPerformed

    private void atualizarModel(ArrayList<Integer> elemento, String modo){
        ArrayList<Integer> subList = new ArrayList<Integer>(elemento.subList(0, 9));
        String listaSintomasString = "( " + modo + " )" + "[Sintomas:";
        int n = 0;
        
        if(!subList.isEmpty()){
            for(int i = 0; i<subList.size(); i++){
                n = subList.get(i);
                if(n == 1){
                    switch(i){
                       case 0: listaSintomasString = listaSintomasString + " Febre"; break;
                       case 1: listaSintomasString = listaSintomasString + " Dor de cabeça"; break;
                       case 2: listaSintomasString = listaSintomasString + " Falta de ar"; break;
                       case 3: listaSintomasString = listaSintomasString + " Náusea"; break;
                       case 4: listaSintomasString = listaSintomasString + " Dor de barriga"; break;
                       case 5: listaSintomasString = listaSintomasString + " Nariz entupido"; break;
                       case 6: listaSintomasString = listaSintomasString + " Dor de ouvido"; break;
                       case 7: listaSintomasString = listaSintomasString + " Fraqueza"; break;
                       case 8: listaSintomasString = listaSintomasString + " Falta de apetite"; break;
                       case 9: listaSintomasString = listaSintomasString + " Diarréia"; break;
                    }   
                }
            }
            listaSintomasString = listaSintomasString + "]";
        }
        
        modelDiagnostico.addElement(listaSintomasString);
        jListMain.setModel(modelDiagnostico);
    }
    
    private void jButtonTreinarAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTreinarAlgoritmoActionPerformed
        JDialogTreinarAlgoritmo tela = new JDialogTreinarAlgoritmo(this, true);
        tela.setVisible(true);
        
        listaSintomas = tela.retornarLista();
        cliente.setListaSintomas(listaSintomas);
       atualizarModel(listaSintomas, "Treinamento");
        
        //Imprimir o vetor com os sintomas
        System.out.println(listaSintomas);
        enviarLista();
    }//GEN-LAST:event_jButtonTreinarAlgoritmoActionPerformed

    public ArrayList<Integer> getListaSintomas() {
        return listaSintomas;
    }

    private void enviarLista() {
        cliente.enviar();
        jTextPane1.setText(cliente.getMensagem());
    }

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
            java.util.logging.Logger.getLogger(JDialogTreinarAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogTreinarAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogTreinarAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogTreinarAlgoritmo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvaliarAlgoritmo;
    private javax.swing.JButton jButtonGerarDiagnostico;
    private javax.swing.JButton jButtonTreinarAlgoritmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListMain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
