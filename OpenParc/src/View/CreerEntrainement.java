/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controleur.Court;
import Controleur.Joueur;
import Models.CourtDAO;
import Models.JoueurDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author p1805797
 */
public class CreerEntrainement extends javax.swing.JFrame {

    private Accueil app;
    private JoueurDAO joueurDAO = new JoueurDAO();
    private CourtDAO courtDAO = new CourtDAO();
    /**
     * Creates new form ModifierMatch
     */
    public CreerEntrainement(Accueil acc) {
        initComponents();
        app = acc;
        DefaultComboBoxModel<String> aModelCourt = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelCréneau = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelJoueur = new DefaultComboBoxModel();
        ArrayList<Court> listCourt = courtDAO.findAll();
        ArrayList<Joueur> listJoueur = joueurDAO.findAll();
        ArrayList<String> listCréneauIndisponible = courtDAO.findCréneauLibre("16/05/2020",1);
        ArrayList<String> listCréneau = new ArrayList();
        listCréneau.add("11h");
        listCréneau.add("13h30");
        listCréneau.add("16h");
        listCréneau.add("18h30");
        for(Joueur j : listJoueur){
            aModelJoueur.addElement(j.getNom()+"  "+j.getPrenom());
        }
        for(Court c : listCourt){
            aModelCourt.addElement(c.getName());
        }
        
        for(String creneauIndispo : listCréneauIndisponible){
            for(int i=0;i<listCréneau.size();i++){
                if(listCréneau.get(i).equals(creneauIndispo)){
                    listCréneau.remove(i);
                }
            }
        }
        if(listCréneau.size()>0){
            for(String créneau : listCréneau){
                aModelCréneau.addElement(créneau);
            }
        } else {
            aModelCréneau.addElement("Aucun créneau disponible");
        }
        
        
        jComboBoxJoueur.setModel(aModelJoueur);
        jComboBoxCourt.setModel(aModelCourt);
        jComboBoxCréneauHoraire.setModel(aModelCréneau);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAccueil = new javax.swing.JButton();
        jButtonQuitterApp = new javax.swing.JButton();
        jComboBoxCourt = new javax.swing.JComboBox<>();
        jComboBoxDate = new javax.swing.JComboBox<>();
        jComboBoxCréneauHoraire = new javax.swing.JComboBox<>();
        jComboBoxJoueur = new javax.swing.JComboBox<>();
        jButtonValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAccueil.setText("Accueil");
        jButtonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccueilActionPerformed(evt);
            }
        });

        jButtonQuitterApp.setText("Quitter l'application");
        jButtonQuitterApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterAppActionPerformed(evt);
            }
        });

        jComboBoxCourt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Court" }));
        jComboBoxCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCourtActionPerformed(evt);
            }
        });

        jComboBoxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16/05/2020", "17/05/2020", "18/05/2020", "19/05/2020", "20/05/2020", "21/05/2020", "22/05/2020", "23/05/2020" }));
        jComboBoxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDateActionPerformed(evt);
            }
        });

        jComboBoxCréneauHoraire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Créneau hoaraire" }));

        jComboBoxJoueur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Joueur" }));

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonQuitterApp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonValider))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAccueil)
                            .addComponent(jComboBoxCourt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jComboBoxJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxCréneauHoraire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 248, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccueil)
                .addGap(78, 78, 78)
                .addComponent(jComboBoxCourt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBoxCréneauHoraire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQuitterApp)
                    .addComponent(jButtonValider))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccueilActionPerformed
        this.dispose();
        app.setVisible(true);
    }//GEN-LAST:event_jButtonAccueilActionPerformed

    private void jButtonQuitterAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterAppActionPerformed
        this.dispose();
        app.dispose();
    }//GEN-LAST:event_jButtonQuitterAppActionPerformed

    private void jComboBoxCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCourtActionPerformed
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        Court court = courtDAO.findAvecNom(jComboBoxCourt.getSelectedItem().toString());
        ArrayList<String> listCréneauIndisponible = courtDAO.findCréneauLibre("16/05/2020",court.getNumero());
        ArrayList<String> listCréneau = new ArrayList();
        listCréneau.add("11h");
        listCréneau.add("13h30");
        listCréneau.add("16h");
        listCréneau.add("18h30");
        for(String creneauIndispo : listCréneauIndisponible){
            for(int i=0;i<listCréneau.size();i++){
                if(listCréneau.get(i).equals(creneauIndispo)){
                    listCréneau.remove(i);
                }
            }
        }
        if(listCréneau.size()>0){
            for(String créneau : listCréneau){
                aModel.addElement(créneau);
            }
        } else {
            aModel.addElement("Aucun créneau disponible");
        }
        jComboBoxCréneauHoraire.setModel(aModel);
    }//GEN-LAST:event_jComboBoxCourtActionPerformed

    private void jComboBoxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDateActionPerformed
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        Court court = courtDAO.findAvecNom(jComboBoxCourt.getSelectedItem().toString());
        ArrayList<String> listCréneauIndisponible = courtDAO.findCréneauLibre(jComboBoxDate.getSelectedItem().toString(),court.getNumero());
        System.out.println(jComboBoxDate.getSelectedItem().toString()+" "+court.getNumero());
        ArrayList<String> listCréneau = new ArrayList();
        listCréneau.add("11h");
        listCréneau.add("13h30");
        listCréneau.add("16h");
        listCréneau.add("18h30");
        for(String creneauIndispo : listCréneauIndisponible){
            for(int i=0;i<listCréneau.size();i++){
                if(listCréneau.get(i).equals(creneauIndispo)){
                    listCréneau.remove(i);
                }
            }
        }
        if(listCréneau.size()>0){
            for(String créneau : listCréneau){
                aModel.addElement(créneau);
            }
        } else {
            aModel.addElement("Aucun créneau disponible");
        }
        jComboBoxCréneauHoraire.setModel(aModel);
    }//GEN-LAST:event_jComboBoxDateActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        String créneau=jComboBoxCréneauHoraire.getSelectedItem().toString();
        String date=jComboBoxDate.getSelectedItem().toString();
        String courtstr=jComboBoxCourt.getSelectedItem().toString();
        int court=courtDAO.findAvecNom(courtstr).getNumero();
        char[] joueurstr=jComboBoxJoueur.getSelectedItem().toString().toCharArray();
        
        Boolean temp=true,temp2=true;
        int i=1;
        String nom="",prenom="";
        while(i<joueurstr.length && temp){
            if(joueurstr[i-1]==' ' && joueurstr[i]==' '){
                int j;
                for(j=0;j<i-1;j++){
                    nom=nom+joueurstr[j];
                }
                j=i+1;
                while(j<joueurstr.length && temp2){
                    if(joueurstr[j]==Character.MIN_VALUE && joueurstr[j+1]==Character.MIN_VALUE){
                        temp2=false;
                    } else {
                        prenom=prenom+joueurstr[j];
                    }
                    j++;
                }
                temp=false;
            }
            i++;
        }
        int idjoueur=joueurDAO.findIdAvecNomPrenom(nom, prenom);
        Joueur joueur=joueurDAO.find(idjoueur);
        
        ArrayList<Joueur> listJoueurEnMatchEntrainement=joueurDAO.findAllJoueurEnMatchEntrainement(date, court, créneau);
        temp=true;
        for(Joueur joueurEnMatchEntrainement:listJoueurEnMatchEntrainement){
            if(joueur.getId()==joueurEnMatchEntrainement.getId()){
                JOptionPane.showMessageDialog(null, "Le joueur  "+joueur.getNom()+" "+joueur.getPrenom()+" est occupé à "+créneau+" le "+date+".");
                temp=false;
            }
        }
        if(temp){
            JOptionPane.showMessageDialog(null, "L'entrainement de joueur  "+joueur.getNom()+" "+joueur.getPrenom()+" est programmé à "+créneau+" le "+date+".");
            this.dispose();
            app.setVisible(true);
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed

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
            java.util.logging.Logger.getLogger(CreerEntrainement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerEntrainement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerEntrainement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerEntrainement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
       //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerEntrainement(new Accueil()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonQuitterApp;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBoxCourt;
    private javax.swing.JComboBox<String> jComboBoxCréneauHoraire;
    private javax.swing.JComboBox<String> jComboBoxDate;
    private javax.swing.JComboBox<String> jComboBoxJoueur;
    // End of variables declaration//GEN-END:variables
}
