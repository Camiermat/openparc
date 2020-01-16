/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controleur.ArbitreChaise;
import Controleur.ArbitreLigne;
import Controleur.Court;
import Controleur.EquipeDouble;
import Controleur.EquipeRamasseur;
import Controleur.Joueur;
import Models.ArbitreChaiseDAO;
import Models.ArbitreLigneDAO;
import Models.CourtDAO;
import Models.EquipeDoubleDAO;
import Models.EquipeRamasseurDAO;
import Models.JoueurDAO;
import Models.RamasseurDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author p1805797
 */
public class CreerMatch extends javax.swing.JFrame {

    private Accueil app;
    private JoueurDAO joueurDAO = new JoueurDAO();
    private CourtDAO courtDAO = new CourtDAO();
    private EquipeDoubleDAO equipeDoubleDAO = new EquipeDoubleDAO();
    private ArbitreChaiseDAO arbitreChaiseDAO = new ArbitreChaiseDAO();
    private ArbitreLigneDAO arbitreLigneDAO = new ArbitreLigneDAO();
    private EquipeRamasseurDAO equipeRamasseurDAO = new EquipeRamasseurDAO();
    private RamasseurDAO ramasseurDAO = new RamasseurDAO();
    private int niveau = 1;
    private String oldJoueur1;
    private String oldJoueur2;
    /**
     * Creates new form CreerMatch
     * @param app
     */
    public CreerMatch(Accueil app) {
        initComponents();
        this.app = app;
        DefaultComboBoxModel<String> aModelJoueur1 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelJoueur2 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelCourt = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelArbitreChaise = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelArbitreLigne = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelEquipeRamasseur = new DefaultComboBoxModel();
        ArrayList<Joueur> listJoueur = joueurDAO.findAllTournoiSimple(niveau);
        ArrayList<Court> listCourt = courtDAO.findAll();
        ArrayList<ArbitreChaise> listArbitreChaise = arbitreChaiseDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
        ArrayList<EquipeRamasseur> listEquipeRamasseur = equipeRamasseurDAO.findAll();
        for(Joueur j : listJoueur){
            aModelJoueur1.addElement(j.getNom()+"  "+j.getPrenom());
            aModelJoueur2.addElement(j.getNom()+"  "+j.getPrenom());
        }
        oldJoueur1=aModelJoueur1.getElementAt(1);
        oldJoueur2=aModelJoueur2.getElementAt(0);
        aModelJoueur1.removeElementAt(1);
        aModelJoueur2.removeElementAt(0);
        for(Court c : listCourt){
            aModelCourt.addElement(c.getName());
        }
        for(ArbitreChaise ac : listArbitreChaise){
            aModelArbitreChaise.addElement(ac.getNom()+"  "+ac.getPrenom());
        }
        for(ArbitreLigne al : listArbitreLigne){
            aModelArbitreLigne.addElement(al.getNom()+"  "+al.getPrenom());
        }
        for(EquipeRamasseur er : listEquipeRamasseur){
            aModelEquipeRamasseur.addElement(er.getId()+"");
        }
        jComboBoxJoueur1.setModel(aModelJoueur1);
        jComboBoxJoueur2.setModel(aModelJoueur2);
        jComboBoxCourt.setModel(aModelCourt);
        jComboBoxArbitreChaise.setModel(aModelArbitreChaise);
        jComboBoxArbitreLigne1.setModel(aModelArbitreLigne);
        jComboBoxArbitreLigne2.setModel(aModelArbitreLigne);
        jComboBoxArbitreLigne3.setModel(aModelArbitreLigne);
        jComboBoxArbitreLigne4.setModel(aModelArbitreLigne);
        jComboBoxArbitreLigne5.setModel(aModelArbitreLigne);
        jComboBoxArbitreLigne6.setModel(aModelArbitreLigne);
        jComboBoxArbitreLigne7.setModel(aModelArbitreLigne);
        jComboBoxEquipeRamasseur1.setModel(aModelEquipeRamasseur);
        jComboBoxEquipeRamasseur2.setModel(aModelEquipeRamasseur);
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
        jComboBoxChoixTournoi = new javax.swing.JComboBox<>();
        jComboBoxNiveauTournoi = new javax.swing.JComboBox<>();
        jComboBoxJoueur1 = new javax.swing.JComboBox<>();
        jComboBoxJoueur2 = new javax.swing.JComboBox<>();
        jComboBoxArbitreChaise = new javax.swing.JComboBox<>();
        jComboBoxArbitreLigne1 = new javax.swing.JComboBox<>();
        jComboBoxArbitreLigne2 = new javax.swing.JComboBox<>();
        jComboBoxArbitreLigne3 = new javax.swing.JComboBox<>();
        jComboBoxArbitreLigne4 = new javax.swing.JComboBox<>();
        jComboBoxArbitreLigne5 = new javax.swing.JComboBox<>();
        jComboBoxArbitreLigne6 = new javax.swing.JComboBox<>();
        jComboBoxArbitreLigne7 = new javax.swing.JComboBox<>();
        jComboBoxEquipeRamasseur1 = new javax.swing.JComboBox<>();
        jComboBoxEquipeRamasseur2 = new javax.swing.JComboBox<>();
        jComboBoxCourt = new javax.swing.JComboBox<>();
        jComboBoxDate = new javax.swing.JComboBox<>();
        jComboBoxCréneauHoraire = new javax.swing.JComboBox<>();

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

        jComboBoxChoixTournoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tournoi simple", "Tournoi double", "Qualification" }));
        jComboBoxChoixTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChoixTournoiActionPerformed(evt);
            }
        });

        jComboBoxNiveauTournoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16 ème", "8 ème", "1/4 finale", "1/2 finale", "finale" }));
        jComboBoxNiveauTournoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNiveauTournoiActionPerformed(evt);
            }
        });

        jComboBoxJoueur1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Joueur 1" }));
        jComboBoxJoueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJoueur1ActionPerformed(evt);
            }
        });

        jComboBoxJoueur2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Joueur 2" }));
        jComboBoxJoueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJoueur2ActionPerformed(evt);
            }
        });

        jComboBoxArbitreChaise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre chaise" }));
        jComboBoxArbitreChaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreChaiseActionPerformed(evt);
            }
        });

        jComboBoxArbitreLigne1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre Ligne" }));
        jComboBoxArbitreLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreLigne1ActionPerformed(evt);
            }
        });

        jComboBoxArbitreLigne2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre Ligne" }));
        jComboBoxArbitreLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreLigne2ActionPerformed(evt);
            }
        });

        jComboBoxArbitreLigne3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre Ligne" }));
        jComboBoxArbitreLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreLigne3ActionPerformed(evt);
            }
        });

        jComboBoxArbitreLigne4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre Ligne" }));
        jComboBoxArbitreLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreLigne4ActionPerformed(evt);
            }
        });

        jComboBoxArbitreLigne5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre Ligne" }));
        jComboBoxArbitreLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreLigne5ActionPerformed(evt);
            }
        });

        jComboBoxArbitreLigne6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre Ligne" }));
        jComboBoxArbitreLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreLigne6ActionPerformed(evt);
            }
        });

        jComboBoxArbitreLigne7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arbitre Ligne" }));
        jComboBoxArbitreLigne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArbitreLigne7ActionPerformed(evt);
            }
        });

        jComboBoxEquipeRamasseur1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipe ramasseur balles" }));
        jComboBoxEquipeRamasseur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquipeRamasseur1ActionPerformed(evt);
            }
        });

        jComboBoxEquipeRamasseur2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipe ramasseur balles" }));
        jComboBoxEquipeRamasseur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquipeRamasseur2ActionPerformed(evt);
            }
        });

        jComboBoxCourt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Court" }));
        jComboBoxCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCourtActionPerformed(evt);
            }
        });

        jComboBoxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date" }));

        jComboBoxCréneauHoraire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Créneau horaire" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonQuitterApp)
                                    .addComponent(jComboBoxJoueur1, 0, 153, Short.MAX_VALUE)
                                    .addComponent(jComboBoxJoueur2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCourt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxEquipeRamasseur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxArbitreChaise, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxEquipeRamasseur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxCréneauHoraire, javax.swing.GroupLayout.Alignment.LEADING, 0, 153, Short.MAX_VALUE)
                                .addComponent(jComboBoxDate, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxArbitreLigne1, 0, 153, Short.MAX_VALUE)
                            .addComponent(jComboBoxArbitreLigne2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxArbitreLigne3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxArbitreLigne4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxArbitreLigne5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxArbitreLigne6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxArbitreLigne7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAccueil)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBoxChoixTournoi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxNiveauTournoi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAccueil)
                    .addComponent(jComboBoxChoixTournoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNiveauTournoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxArbitreChaise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxArbitreLigne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxArbitreLigne2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEquipeRamasseur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxArbitreLigne3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEquipeRamasseur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCourt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxArbitreLigne4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxArbitreLigne5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCréneauHoraire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBoxArbitreLigne6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxArbitreLigne7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
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

    private void jComboBoxChoixTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChoixTournoiActionPerformed
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi simple")){
            DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
            DefaultComboBoxModel<String> aModelNiveau = new DefaultComboBoxModel();
            aModelNiveau.addElement("16 ème");
            aModelNiveau.addElement("8 ème");
            aModelNiveau.addElement("1/4 finale");
            aModelNiveau.addElement("1/2 finale");
            aModelNiveau.addElement("finale");
            jComboBoxNiveauTournoi.setModel(aModelNiveau);
            niveau=1;
            ArrayList<Joueur> listJoueur = joueurDAO.findAllTournoiSimple(niveau);
            for(Joueur j : listJoueur){
                aModel.addElement(j.getNom()+"  "+j.getPrenom());
            }
            jComboBoxJoueur1.setModel(aModel);
            jComboBoxJoueur2.setModel(aModel);
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi double")){
            DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
            DefaultComboBoxModel<String> aModelNiveau = new DefaultComboBoxModel();
            aModelNiveau.addElement("8 ème");
            aModelNiveau.addElement("1/4 finale");
            aModelNiveau.addElement("1/2 finale");
            aModelNiveau.addElement("finale");
            jComboBoxNiveauTournoi.setModel(aModelNiveau);
            niveau=1;
            ArrayList<EquipeDouble> listEquipe = equipeDoubleDAO.findAll(niveau);
            ArrayList<Joueur> listJoueur1 = new ArrayList();
            ArrayList<Joueur> listJoueur2 = new ArrayList();
            for(EquipeDouble ed : listEquipe){
                listJoueur1.add(joueurDAO.find(ed.getIdJoueur1()));
                listJoueur2.add(joueurDAO.find(ed.getIdJoueur2()));
            }
            int nb = listEquipe.size();
            String[] strings = new String[nb];
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
            for(int k=0;k<strings.length;k++)aModel.addElement(strings[k]);
            jComboBoxJoueur1.setModel(aModel);
            jComboBoxJoueur2.setModel(aModel);
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Qualification")){
            DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
            DefaultComboBoxModel<String> aModelNiveau = new DefaultComboBoxModel();
            aModelNiveau.addElement("1er tour");
            aModelNiveau.addElement("2ème tour");
            jComboBoxNiveauTournoi.setModel(aModelNiveau);
            niveau=1;
            ArrayList<Joueur> listJoueur = joueurDAO.findAllQualification(niveau);
            for(Joueur j : listJoueur){
                aModel.addElement(j.getNom()+"  "+j.getPrenom());
            }
            jComboBoxJoueur1.setModel(aModel);
            jComboBoxJoueur2.setModel(aModel);
        }
    }//GEN-LAST:event_jComboBoxChoixTournoiActionPerformed

    private void jComboBoxNiveauTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNiveauTournoiActionPerformed
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi simple")){
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("16 ème"))niveau=1;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("8 ème"))niveau=2;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/4 finale"))niveau=3;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/2 finale"))niveau=4;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("finale"))niveau=5;
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi Double")){
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("8 ème"))niveau=1;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/4 finale"))niveau=2;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/2 finale"))niveau=3;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("finale"))niveau=4;
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Qualification")){
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1er tour"))niveau=1;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("2ème tour"))niveau=2;
        }
    }//GEN-LAST:event_jComboBoxNiveauTournoiActionPerformed

    private void jComboBoxJoueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJoueur1ActionPerformed
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        int i = jComboBoxJoueur2.getModel().getSize();
        for (int j=0;j<i;j++){
            aModel.addElement(jComboBoxJoueur2.getModel().getElementAt(j));
        }
        aModel.addElement(oldJoueur2);
        oldJoueur2=jComboBoxJoueur1.getSelectedItem().toString();
        aModel.removeElement(jComboBoxJoueur1.getSelectedItem());
        jComboBoxJoueur2.setModel(aModel);
    }//GEN-LAST:event_jComboBoxJoueur1ActionPerformed

    private void jComboBoxJoueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJoueur2ActionPerformed
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        int i = jComboBoxJoueur1.getModel().getSize();
        for (int j=0;j<i;j++){
            aModel.addElement(jComboBoxJoueur1.getModel().getElementAt(j));
        }
        aModel.addElement(oldJoueur1);
        oldJoueur1=jComboBoxJoueur2.getSelectedItem().toString();
        aModel.removeElement(jComboBoxJoueur2.getSelectedItem());
        jComboBoxJoueur1.setModel(aModel);
    }//GEN-LAST:event_jComboBoxJoueur2ActionPerformed

    private void jComboBoxCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCourtActionPerformed
        
    }//GEN-LAST:event_jComboBoxCourtActionPerformed

    private void jComboBoxArbitreChaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreChaiseActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreChaiseActionPerformed

    private void jComboBoxEquipeRamasseur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipeRamasseur1ActionPerformed
        
    }//GEN-LAST:event_jComboBoxEquipeRamasseur1ActionPerformed

    private void jComboBoxEquipeRamasseur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipeRamasseur2ActionPerformed
        
    }//GEN-LAST:event_jComboBoxEquipeRamasseur2ActionPerformed

    private void jComboBoxArbitreLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne1ActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreLigne1ActionPerformed

    private void jComboBoxArbitreLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne2ActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreLigne2ActionPerformed

    private void jComboBoxArbitreLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne3ActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreLigne3ActionPerformed

    private void jComboBoxArbitreLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne4ActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreLigne4ActionPerformed

    private void jComboBoxArbitreLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne5ActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreLigne5ActionPerformed

    private void jComboBoxArbitreLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne6ActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreLigne6ActionPerformed

    private void jComboBoxArbitreLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne7ActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreLigne7ActionPerformed

    private DefaultComboBoxModel<String> trierModel(DefaultComboBoxModel<String> aModel){
        DefaultComboBoxModel<String> bModel = new DefaultComboBoxModel();
        for (int i=0;i<aModel.getSize();i++){
            
        }
        return bModel;
    }
    
    private int indexJoueurMaximum(DefaultComboBoxModel<String> aModel){
        int max = 100;
        for (int i=0;i<aModel.getSize();i++){
            int res = joueurDAO.find(aModel.getElementAt(i));
            if ()
        }
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
            java.util.logging.Logger.getLogger(CreerMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerMatch(new Accueil()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccueil;
    private javax.swing.JButton jButtonQuitterApp;
    private javax.swing.JComboBox<String> jComboBoxArbitreChaise;
    private javax.swing.JComboBox<String> jComboBoxArbitreLigne1;
    private javax.swing.JComboBox<String> jComboBoxArbitreLigne2;
    private javax.swing.JComboBox<String> jComboBoxArbitreLigne3;
    private javax.swing.JComboBox<String> jComboBoxArbitreLigne4;
    private javax.swing.JComboBox<String> jComboBoxArbitreLigne5;
    private javax.swing.JComboBox<String> jComboBoxArbitreLigne6;
    private javax.swing.JComboBox<String> jComboBoxArbitreLigne7;
    private javax.swing.JComboBox<String> jComboBoxChoixTournoi;
    private javax.swing.JComboBox<String> jComboBoxCourt;
    private javax.swing.JComboBox<String> jComboBoxCréneauHoraire;
    private javax.swing.JComboBox<String> jComboBoxDate;
    private javax.swing.JComboBox<String> jComboBoxEquipeRamasseur1;
    private javax.swing.JComboBox<String> jComboBoxEquipeRamasseur2;
    private javax.swing.JComboBox<String> jComboBoxJoueur1;
    private javax.swing.JComboBox<String> jComboBoxJoueur2;
    private javax.swing.JComboBox<String> jComboBoxNiveauTournoi;
    // End of variables declaration//GEN-END:variables
}
