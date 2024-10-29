/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package trabalhosd.telas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import trabalhosd.TcpCliente;

/**
 *
 * @author umestudantecristao
 */
public class JDialogAvaliarAlgoritmo extends javax.swing.JDialog {

    ArrayList<Integer> resposta = new ArrayList<>(Collections.nCopies(11, 0));
    /**
     * Creates new form JDialogInserirDados
     */
    public JDialogAvaliarAlgoritmo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRespostaAlgoritmo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSelecionados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSintomas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Treinar algoritmo");
        setResizable(false);

        jListSelecionados.setFont(new java.awt.Font("Fira Mono", 0, 12)); // NOI18N
        jListSelecionados.setFocusable(false);
        jListSelecionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSelecionadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListSelecionados);

        jLabel1.setFont(new java.awt.Font("Fira Sans Condensed", 0, 18)); // NOI18N
        jLabel1.setText("------------------SINTOMAS APRESENTADOS------------------");

        jListSintomas.setFont(new java.awt.Font("Fira Mono Medium", 0, 14)); // NOI18N
        jListSintomas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Febre", "Dor de cabeça", "Falta de ar", "Náusea", "Dor de barriga", "Nariz entupido", "Dor de ouvido", "Fraqueza", "Falta de apetite", "Diarréia" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListSintomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSintomasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListSintomas);

        jLabel2.setFont(new java.awt.Font("Fira Sans Condensed", 0, 18)); // NOI18N
        jLabel2.setText("------------------SELECIONE OS SINTOMAS------------------");

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEnviar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnviar)
                    .addComponent(jButtonCancelar))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void adicionarEremoverLista(int index, JList<String> jlistEntrega, JList<String> jlistRecebe){
        DefaultListModel<String> modelEntrega = new DefaultListModel<String>();
        DefaultListModel<String> modelRecebe = new DefaultListModel<String>();

        String item = jlistEntrega.getModel().getElementAt(index);

        for (int i = 0; i < jlistEntrega.getModel().getSize(); i++) {
            if (jlistEntrega.getModel().getElementAt(i) != item) {
                modelEntrega.addElement(jListSintomas.getModel().getElementAt(i));
            }
        }

        jlistEntrega.setModel(modelEntrega);

        for (int i = 0; i < jlistRecebe.getModel().getSize(); i++) {
            modelRecebe.addElement(jlistRecebe.getModel().getElementAt(i));
        }

        modelRecebe.addElement(item);
        jlistRecebe.setModel(modelRecebe);
    }
    
    private void jListSintomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSintomasMouseClicked
        if (evt.getClickCount() == 2) {
            int index = jListSintomas.locationToIndex(evt.getPoint());
            if (index != -1) {
                adicionarEremoverLista(index, jListSintomas, jListSelecionados);
            }
        }
    }//GEN-LAST:event_jListSintomasMouseClicked

    private void jListSelecionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListSelecionadosMouseClicked
         if (evt.getClickCount() == 2) {
            int index = jListSelecionados.locationToIndex(evt.getPoint());
            if (index != -1) {
                adicionarEremoverLista(index, jListSelecionados, jListSintomas);
            }
        
        }
    }//GEN-LAST:event_jListSelecionadosMouseClicked

    public ArrayList<Integer> getResposta(){
        return this.resposta;
    }
    
    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
       ArrayList<String> listaSintomas = new ArrayList<String>();
        String[] doencas = {"Febre", "Dor de cabeça", "Falta de ar", "Náusea", 
        "Dor de barriga", "Nariz entupido", "Dor de ouvido", "Fraqueza", 
        "Falta de apetite","Diarréia"};
        for (int i = 0; i < jListSelecionados.getModel().getSize(); i++) {
            listaSintomas.add(jListSelecionados.getModel().getElementAt(i));
        }
        
        for (int i = 0; i < listaSintomas.size(); i++){
            for(int j = 0; j < doencas.length; j++){
                if(listaSintomas.get(i) == doencas[j]){
                
                resposta.set(j, 1);
            }
           }
        }
        resposta.set(10, -2);
        
        this.dispose();
    }//GEN-LAST:event_jButtonEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRespostaAlgoritmo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListSelecionados;
    private javax.swing.JList<String> jListSintomas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
