/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controleur.EquipeDouble;
import Controleur.Joueur;
import Controleur.Qualification;
import Controleur.TournoiDouble;
import Controleur.TournoiSimple;
import Models.EquipeDoubleDAO;
import Models.JoueurDAO;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class InvJoueur extends javax.swing.JFrame {

    private Accueil app;
    private JoueurDAO joueurDAO = new JoueurDAO();
    private int[] nbWildCard = joueurDAO.findNbWildCard();
    /**
     * Creates new form InvJoueur
     */
    public InvJoueur(Accueil acc) {
        initComponents();
        app = acc;
        ArrayList<Joueur> listJoueur = joueurDAO.findAllTournoiSimple();
        String[] strings = new String[100];
        int i = 0;
        for(Joueur j : listJoueur){
            strings[i]=j.getNom()+"  "+j.getPrenom();
            i++;
        }
        jList2.setListData(strings);
        jComboBoxTournoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tournoi simple", "Tournoi double", "Qualification" }));
        jLabelNbJoueurInv.setText(nbWildCard[0]+"");
        jLabelNbInvRestantes.setText(TournoiSimple.NBJOUEURSIMPLE-nbWildCard[0]+"");
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
        jScrollPaneJoueur = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jComboBoxTournoi = new javax.swing.JComboBox<>();
        jButtonInviter = new javax.swing.JButton();
        jLabelJoueurInv = new javax.swing.JLabel();
        jLabelNbJoueurInv = new javax.swing.JLabel();
        jLabelInvRestant = new javax.swing.JLabel();
        jLabelNbInvRestantes = new javax.swing.JLabel();
        jLabelTest = new javax.swing.JLabel();

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

        jScrollPaneJoueur.setViewportView(jList2);

        jComboBoxTournoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTournoiActionPerformed(evt);
            }
        });

        jButtonInviter.setText("Inviter");
        jButtonInviter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInviterActionPerformed(evt);
            }
        });

        jLabelJoueurInv.setText("Joueurs invités :");

        jLabelNbJoueurInv.setText("0");

        jLabelInvRestant.setText("Nombres d'invitations restantes :");

        jLabelNbInvRestantes.setText("32");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonQuitterApp)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAccueil)
                        .addGap(36, 36, 36)
                        .addComponent(jComboBoxTournoi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelInvRestant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNbInvRestantes)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonInviter))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabelJoueurInv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelNbJoueurInv))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabelTest)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAccueil)
                            .addComponent(jComboBoxTournoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneJoueur, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJoueurInv)
                            .addComponent(jLabelNbJoueurInv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelInvRestant)
                            .addComponent(jLabelNbInvRestantes))
                        .addGap(69, 69, 69)
                        .addComponent(jLabelTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInviter)))
                .addGap(18, 18, 18)
                .addComponent(jButtonQuitterApp)
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

    private void jComboBoxTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTournoiActionPerformed
        if (jComboBoxTournoi.getSelectedItem().equals("Tournoi simple")){
            JoueurDAO joueurDAO = new JoueurDAO();
            ArrayList<Joueur> listJoueur = joueurDAO.findAllTournoiSimple();
            String[] strings = new String[100];
            int i = 0;
            for(Joueur j : listJoueur){
                strings[i]=j.getNom()+"  "+j.getPrenom();
                i++;
            }
            jList2.setListData(strings);
            jLabelNbJoueurInv.setText(nbWildCard[0]+"");
            jLabelNbInvRestantes.setText(TournoiSimple.NBJOUEURSIMPLE-nbWildCard[0]+"");
        }
        if (jComboBoxTournoi.getSelectedItem().equals("Tournoi double")){
            JoueurDAO joueurDAO = new JoueurDAO();
            EquipeDoubleDAO equipeDAO = new EquipeDoubleDAO();
            ArrayList<EquipeDouble> listEquipe = equipeDAO.findAll();
            ArrayList<Joueur> listJoueur1 = new ArrayList();
            ArrayList<Joueur> listJoueur2 = new ArrayList();
            for(EquipeDouble ed : listEquipe){
                listJoueur1.add(joueurDAO.find(ed.getIdJoueur1()));
                listJoueur2.add(joueurDAO.find(ed.getIdJoueur2()));
            }
            String[] strings = new String[100];
            int i = 0;
            for(Joueur j : listJoueur1){
                strings[i]=j.getNom()+"  "+j.getPrenom();
                i++;
            }
            i = 0;
            for(Joueur j : listJoueur2){
                strings[i]+=" - "+j.getNom()+"  "+j.getPrenom();
                i++;
            }
            jList2.setListData(strings);
            jLabelNbJoueurInv.setText(nbWildCard[1]+"");
            jLabelNbInvRestantes.setText(TournoiDouble.NBEQUIPEDOUBLE-nbWildCard[1]+"");
        }
        if (jComboBoxTournoi.getSelectedItem().equals("Qualification")){
            JoueurDAO joueurDAO = new JoueurDAO();
            ArrayList<Joueur> listJoueur = joueurDAO.findAllQualification();
            String[] strings = new String[100];
            int i = 0;
            for(Joueur j : listJoueur){
                strings[i]=j.getNom()+"  "+j.getPrenom();
                i++;
            }
            jList2.setListData(strings);
            jLabelNbJoueurInv.setText(nbWildCard[2]+"");
            jLabelNbInvRestantes.setText(Qualification.NBJOUEURQUALIF-nbWildCard[2]+"");
        }
    }//GEN-LAST:event_jComboBoxTournoiActionPerformed

    private void jButtonInviterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInviterActionPerformed
        String jnp=jList2.getSelectedValue();
        String nom="";
        String prenom="";
        char[] nomprenom=jnp.toCharArray();
        int i=1;
        boolean temp=true;
        System.out.println(nomprenom);
        while(i<nomprenom.length && temp){
            System.out.println(i);
            if(nomprenom[i-1]==' ' && nomprenom[i]==' '){
                int j;
                for(j=0;j<i-1;j++){
                    nom=nom+nomprenom[j];
                }
                for(j=i+1;j<nomprenom.length;j++){
                    prenom=prenom+nomprenom[j];
                }
                System.out.println(nom+" "+prenom);
                temp=false;
            }
            i++;
        }
        int id=joueurDAO.findId(nom,prenom);
        joueurDAO.update(id, "1");
        jLabelNbJoueurInv.setText(nbWildCard[0]+"");
        jLabelNbInvRestantes.setText(TournoiSimple.NBJOUEURSIMPLE-nbWildCard[0]+"");
        
    }//GEN-LAST:event_jButtonInviterActionPerformed

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
            java.util.logging.Logger.getLogger(InvJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvJoueur(new Accueil()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonInviter;
    private javax.swing.JButton jButtonQuitterApp;
    private javax.swing.JComboBox<String> jComboBoxTournoi;
    private javax.swing.JLabel jLabelInvRestant;
    private javax.swing.JLabel jLabelJoueurInv;
    private javax.swing.JLabel jLabelNbInvRestantes;
    private javax.swing.JLabel jLabelNbJoueurInv;
    private javax.swing.JLabel jLabelTest;
    private static javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPaneJoueur;
    // End of variables declaration//GEN-END:variables
}