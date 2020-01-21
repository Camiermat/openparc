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
import java.sql.Date;
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
    private static String strArbitreLigne1,strArbitreLigne2,strArbitreLigne3,strArbitreLigne4,strArbitreLigne5,strArbitreLigne6,strArbitreLigne7;
    private static int arbitreLigneBox1=0,arbitreLigneBox2=0,arbitreLigneBox3=0,arbitreLigneBox4=0,arbitreLigneBox5=0,arbitreLigneBox6=0,arbitreLigneBox7=0;
    
    /**
     * Creates new form CreerMatch
     * @param app
     */
    public CreerMatch(Accueil app) {
        initComponents();
        this.app = app;
        DefaultComboBoxModel<String> aModelCourt = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelArbitreChaise = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelEquipeRamasseur1 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelEquipeRamasseur2 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModelCréneau = new DefaultComboBoxModel();
        ArrayList<Court> listCourt = courtDAO.findAll();
        ArrayList<ArbitreChaise> listArbitreChaise = arbitreChaiseDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne1 = arbitreLigneDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne2 = arbitreLigneDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne3 = arbitreLigneDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne4 = arbitreLigneDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne5 = arbitreLigneDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne6 = arbitreLigneDAO.findAll();
        ArrayList<ArbitreLigne> listArbitreLigne7 = arbitreLigneDAO.findAll();
        ArrayList<EquipeRamasseur> listEquipeRamasseur1 = equipeRamasseurDAO.findAll();
        ArrayList<EquipeRamasseur> listEquipeRamasseur2 = equipeRamasseurDAO.findAll();
        ArrayList<Joueur> listJoueur1 = joueurDAO.findAllTournoiSimple(niveau);
        ArrayList<Joueur> listJoueur2 = joueurDAO.findAllTournoiSimple(niveau);
        ArrayList<String> listCréneauIndisponible = courtDAO.findCréneauLibre("16/05/2020",1);
        ArrayList<String> listCréneau = new ArrayList();
        listCréneau.add("11h");
        listCréneau.add("13h30");
        listCréneau.add("16h");
        listCréneau.add("18h30");
        if(listJoueur1.size()>1){
            afficherJoueurs(listJoueur1,listJoueur2);
        } else {
            afficherJoueurs(listJoueur1,listJoueur2);
        }
        
        
        for(Court c : listCourt){
            aModelCourt.addElement(c.getName());
        }
        
        
        for(ArbitreChaise ac : listArbitreChaise){
            aModelArbitreChaise.addElement(ac.getNom()+"  "+ac.getPrenom());
        }
        
        
        int l;
        for(l=0;l<6;l++){
            listArbitreLigne1.remove(1);
        }
        listArbitreLigne2.remove(0);
        for(l=0;l<5;l++){
            listArbitreLigne2.remove(1);
        }
        listArbitreLigne3.remove(0);
        listArbitreLigne3.remove(0);
        for(l=0;l<4;l++){
            listArbitreLigne3.remove(1);
        }
        for(l=0;l<3;l++){
            listArbitreLigne4.remove(0);
        }
        for(l=0;l<3;l++){
            listArbitreLigne4.remove(1);
        }
        for(l=0;l<4;l++){
            listArbitreLigne5.remove(0);
        }
        for(l=0;l<2;l++){
            listArbitreLigne5.remove(1);
        }
        for(l=0;l<5;l++){
            listArbitreLigne6.remove(0);
        }
        listArbitreLigne6.remove(1);
        for(l=0;l<6;l++){
            listArbitreLigne7.remove(0);
        }
        jComboBoxArbitreLigne1.setModel(modelArbitreLigne(listArbitreLigne1));
        jComboBoxArbitreLigne2.setModel(modelArbitreLigne(listArbitreLigne2));
        jComboBoxArbitreLigne3.setModel(modelArbitreLigne(listArbitreLigne3));
        jComboBoxArbitreLigne4.setModel(modelArbitreLigne(listArbitreLigne4));
        jComboBoxArbitreLigne5.setModel(modelArbitreLigne(listArbitreLigne5));
        jComboBoxArbitreLigne6.setModel(modelArbitreLigne(listArbitreLigne6));
        jComboBoxArbitreLigne7.setModel(modelArbitreLigne(listArbitreLigne7));
                
        
        listEquipeRamasseur1.remove(1);
        listEquipeRamasseur2.remove(0);
        for(EquipeRamasseur er : listEquipeRamasseur1){
            aModelEquipeRamasseur1.addElement(er.getId()+"");
        }
        for(EquipeRamasseur er : listEquipeRamasseur2){
            aModelEquipeRamasseur2.addElement(er.getId()+"");
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
        
        strArbitreLigne1=jComboBoxArbitreLigne1.getSelectedItem().toString();
        strArbitreLigne2=jComboBoxArbitreLigne2.getSelectedItem().toString();
        strArbitreLigne3=jComboBoxArbitreLigne3.getSelectedItem().toString();
        strArbitreLigne4=jComboBoxArbitreLigne4.getSelectedItem().toString();
        strArbitreLigne5=jComboBoxArbitreLigne5.getSelectedItem().toString();
        strArbitreLigne6=jComboBoxArbitreLigne6.getSelectedItem().toString();
        strArbitreLigne7=jComboBoxArbitreLigne7.getSelectedItem().toString();
        
        jComboBoxCourt.setModel(aModelCourt);
        jComboBoxArbitreChaise.setModel(aModelArbitreChaise);
        jComboBoxEquipeRamasseur1.setModel(aModelEquipeRamasseur1);
        jComboBoxEquipeRamasseur2.setModel(aModelEquipeRamasseur2);
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

        jComboBoxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16/05/2020", "17/05/2020", "18/05/2020", "19/05/2020", "20/05/2020", "21/05/2020", "22/05/2020", "23/05/2020" }));
        jComboBoxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDateActionPerformed(evt);
            }
        });

        jComboBoxCréneauHoraire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Créneau horaire" }));
        jComboBoxCréneauHoraire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCréneauHoraireActionPerformed(evt);
            }
        });

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
            DefaultComboBoxModel<String> aModelNiveau = new DefaultComboBoxModel();
            aModelNiveau.addElement("16 ème");
            aModelNiveau.addElement("8 ème");
            aModelNiveau.addElement("1/4 finale");
            aModelNiveau.addElement("1/2 finale");
            aModelNiveau.addElement("finale");
            jComboBoxNiveauTournoi.setModel(aModelNiveau);
            niveau=1;
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllTournoiSimple(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllTournoiSimple(niveau);
            if(listJoueur1.size()>1){
                afficherJoueurs(listJoueur1,listJoueur2);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi double")){
            DefaultComboBoxModel<String> aModelNiveau = new DefaultComboBoxModel();
            aModelNiveau.addElement("8 ème");
            aModelNiveau.addElement("1/4 finale");
            aModelNiveau.addElement("1/2 finale");
            aModelNiveau.addElement("finale");
            jComboBoxNiveauTournoi.setModel(aModelNiveau);
            niveau=1;
            ArrayList<EquipeDouble> listEquipe1 = equipeDoubleDAO.findAll(niveau);
            ArrayList<EquipeDouble> listEquipe2 = equipeDoubleDAO.findAll(niveau);
            if(listEquipe1.size()>1){
                afficherEquipes(listEquipe1,listEquipe2);
            } else {
                afficherEquipes(listEquipe1,listEquipe2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Qualification")){
            DefaultComboBoxModel<String> aModelNiveau = new DefaultComboBoxModel();
            aModelNiveau.addElement("1er tour");
            aModelNiveau.addElement("2ème tour");
            jComboBoxNiveauTournoi.setModel(aModelNiveau);
            niveau=1;
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllQualification(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllQualification(niveau);
            if(listJoueur1.size()>1){
                afficherJoueurs(listJoueur1,listJoueur2);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
    }//GEN-LAST:event_jComboBoxChoixTournoiActionPerformed

    private void jComboBoxNiveauTournoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNiveauTournoiActionPerformed
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi simple")){
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("16 ème"))niveau=1;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("8 ème"))niveau=2;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/4 finale"))niveau=3;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/2 finale"))niveau=4;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("finale"))niveau=5;
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllTournoiSimple(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllTournoiSimple(niveau);
            if(listJoueur1.size()>1){
                afficherJoueurs(listJoueur1,listJoueur2);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi double")){
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("8 ème"))niveau=1;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/4 finale"))niveau=2;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1/2 finale"))niveau=3;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("finale"))niveau=4;
            ArrayList<EquipeDouble> listEquipe1 = equipeDoubleDAO.findAll(niveau);
            ArrayList<EquipeDouble> listEquipe2 = equipeDoubleDAO.findAll(niveau);
            if(listEquipe1.size()>1){
                afficherEquipes(listEquipe1,listEquipe2);
            } else {
                afficherEquipes(listEquipe1,listEquipe2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Qualification")){
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("1er tour"))niveau=1;
            if (jComboBoxNiveauTournoi.getSelectedItem().equals("2ème tour"))niveau=2;
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllQualification(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllQualification(niveau);
            if(listJoueur1.size()>1){
                afficherJoueurs(listJoueur1,listJoueur2);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
    }//GEN-LAST:event_jComboBoxNiveauTournoiActionPerformed

    private void jComboBoxJoueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJoueur1ActionPerformed
        String joueurEquipeSelect=jComboBoxJoueur2.getSelectedItem().toString();
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi simple")){
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllTournoiSimple(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllTournoiSimple(niveau);
            if(listJoueur1.size()>1){
                afficherJoueur2(listJoueur1,getJoueur(jComboBoxJoueur1.getSelectedItem().toString().toCharArray()));
                jComboBoxJoueur2.setSelectedItem(joueurEquipeSelect);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi double")){
            ArrayList<EquipeDouble> listEquipe1 = equipeDoubleDAO.findAll(niveau);
            ArrayList<EquipeDouble> listEquipe2 = equipeDoubleDAO.findAll(niveau);
            if(listEquipe1.size()>1){
                char[] charEquipeDouble=jComboBoxJoueur1.getSelectedItem().toString().toCharArray();
                char[] cjoueur1=new char[100];
                char[] cjoueur2=new char[100];
                int i=0,j=0,k=0;
                while(charEquipeDouble[i]!=','){
                    i++;
                }
                for(j=0;j<i;j++){
                    cjoueur1[j]=charEquipeDouble[j];
                }
                for(j=i+2;j<charEquipeDouble.length;j++){
                    cjoueur2[k]=charEquipeDouble[j];
                    k++;
                }
                Joueur joueur1=getJoueur(cjoueur1);
                Joueur joueur2=getJoueur(cjoueur2);
                afficherEquipe2(listEquipe1,equipeDoubleDAO.findAvecIdJoueurs(joueur1.getId(), joueur2.getId()));
                jComboBoxJoueur2.setSelectedItem(joueurEquipeSelect);
            } else {
                afficherEquipes(listEquipe2,listEquipe2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Qualification")){
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllQualification(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllQualification(niveau);
            if(listJoueur1.size()>1){
                afficherJoueur2(listJoueur1,getJoueur(jComboBoxJoueur1.getSelectedItem().toString().toCharArray()));
                jComboBoxJoueur2.setSelectedItem(joueurEquipeSelect);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
    }//GEN-LAST:event_jComboBoxJoueur1ActionPerformed

    private void jComboBoxJoueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJoueur2ActionPerformed
        String joueurEquipeSelect=jComboBoxJoueur1.getSelectedItem().toString();
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi simple")){
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllTournoiSimple(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllTournoiSimple(niveau);
            if(listJoueur1.size()>1){
                afficherJoueur1(listJoueur1,getJoueur(jComboBoxJoueur2.getSelectedItem().toString().toCharArray()));
                jComboBoxJoueur1.setSelectedItem(joueurEquipeSelect);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Tournoi double")){
            ArrayList<EquipeDouble> listEquipe1 = equipeDoubleDAO.findAll(niveau);
            ArrayList<EquipeDouble> listEquipe2 = equipeDoubleDAO.findAll(niveau);
            if(listEquipe1.size()>1){
                char[] charEquipeDouble=jComboBoxJoueur2.getSelectedItem().toString().toCharArray();
                char[] cjoueur1=new char[100];
                char[] cjoueur2=new char[100];
                int i=0,j=0,k=0;
                while(charEquipeDouble[i]!=','){
                    i++;
                }
                for(j=0;j<i;j++){
                    cjoueur1[j]=charEquipeDouble[j];
                }
                for(j=i+2;j<charEquipeDouble.length;j++){
                    cjoueur2[k]=charEquipeDouble[j];
                    k++;
                }
                Joueur joueur1=getJoueur(cjoueur1);
                Joueur joueur2=getJoueur(cjoueur2);
                afficherEquipe1(listEquipe1,equipeDoubleDAO.findAvecIdJoueurs(joueur1.getId(), joueur2.getId()));
                jComboBoxJoueur1.setSelectedItem(joueurEquipeSelect);
            } else {
                afficherEquipes(listEquipe2,listEquipe2);
            }
        }
        if (jComboBoxChoixTournoi.getSelectedItem().equals("Qualification")){
            ArrayList<Joueur> listJoueur1 = joueurDAO.findAllQualification(niveau);
            ArrayList<Joueur> listJoueur2 = joueurDAO.findAllQualification(niveau);
            if(listJoueur1.size()>1){
                afficherJoueur1(listJoueur1,getJoueur(jComboBoxJoueur2.getSelectedItem().toString().toCharArray()));
                jComboBoxJoueur1.setSelectedItem(joueurEquipeSelect);
            } else {
                afficherJoueurs(listJoueur1,listJoueur2);
            }
        }
    }//GEN-LAST:event_jComboBoxJoueur2ActionPerformed

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

    private void jComboBoxArbitreChaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreChaiseActionPerformed
        
    }//GEN-LAST:event_jComboBoxArbitreChaiseActionPerformed

    private void jComboBoxEquipeRamasseur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipeRamasseur1ActionPerformed
        DefaultComboBoxModel<String> aModel1 = new DefaultComboBoxModel();
        ArrayList<EquipeRamasseur> listEquipeRamasseur = equipeRamasseurDAO.findAll();
        String idEquipeSelect=jComboBoxEquipeRamasseur2.getSelectedItem().toString();
        listEquipeRamasseur.remove(new Integer(jComboBoxEquipeRamasseur1.getSelectedItem().toString())-1);
        for(EquipeRamasseur er : listEquipeRamasseur){
            aModel1.addElement(er.getId()+"");
        }
        jComboBoxEquipeRamasseur2.setModel(aModel1);
        jComboBoxEquipeRamasseur2.setSelectedItem(idEquipeSelect);
        return;
    }//GEN-LAST:event_jComboBoxEquipeRamasseur1ActionPerformed

    private void jComboBoxEquipeRamasseur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipeRamasseur2ActionPerformed
        DefaultComboBoxModel<String> aModel1 = new DefaultComboBoxModel();
        ArrayList<EquipeRamasseur> listEquipeRamasseur = equipeRamasseurDAO.findAll();
        String idEquipeSelect=jComboBoxEquipeRamasseur1.getSelectedItem().toString();
        listEquipeRamasseur.remove(new Integer(jComboBoxEquipeRamasseur2.getSelectedItem().toString())-1);
        for(EquipeRamasseur er : listEquipeRamasseur){
            aModel1.addElement(er.getId()+"");
        }
        jComboBoxEquipeRamasseur1.setModel(aModel1);
        jComboBoxEquipeRamasseur1.setSelectedItem(idEquipeSelect);
        return;
    }//GEN-LAST:event_jComboBoxEquipeRamasseur2ActionPerformed

    private void jComboBoxArbitreLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne1ActionPerformed
        if(arbitreLigneBox1==0){
            strArbitreLigne1=jComboBoxArbitreLigne1.getSelectedItem().toString();

            ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne2 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne3 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne4 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne5 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne6 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne7 = arbitreLigneDAO.findAll();


            ArbitreLigne arbitreLigne1=getArbitreLigne(strArbitreLigne1.toCharArray());
            ArbitreLigne arbitreLigne2=getArbitreLigne(strArbitreLigne2.toCharArray());
            ArbitreLigne arbitreLigne3=getArbitreLigne(strArbitreLigne3.toCharArray());
            ArbitreLigne arbitreLigne4=getArbitreLigne(strArbitreLigne4.toCharArray());
            ArbitreLigne arbitreLigne5=getArbitreLigne(strArbitreLigne5.toCharArray());
            ArbitreLigne arbitreLigne6=getArbitreLigne(strArbitreLigne6.toCharArray());
            ArbitreLigne arbitreLigne7=getArbitreLigne(strArbitreLigne7.toCharArray());


            listArbitreLigne2=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne3=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne4=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne5=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne6=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne7=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6);   


            DefaultComboBoxModel<String> aModel1 = modelArbitreLigne(listArbitreLigne2);
            DefaultComboBoxModel<String> aModel2 = modelArbitreLigne(listArbitreLigne3);
            DefaultComboBoxModel<String> aModel3 = modelArbitreLigne(listArbitreLigne4);
            DefaultComboBoxModel<String> aModel4 = modelArbitreLigne(listArbitreLigne5);
            DefaultComboBoxModel<String> aModel5 = modelArbitreLigne(listArbitreLigne6);
            DefaultComboBoxModel<String> aModel6 = modelArbitreLigne(listArbitreLigne7);
            jComboBoxArbitreLigne2.setModel(aModel1);
            jComboBoxArbitreLigne3.setModel(aModel2);
            jComboBoxArbitreLigne4.setModel(aModel3);
            jComboBoxArbitreLigne5.setModel(aModel4);
            jComboBoxArbitreLigne6.setModel(aModel5);
            jComboBoxArbitreLigne7.setModel(aModel6);
            
            arbitreLigneBox2=1;
            arbitreLigneBox3=1;
            arbitreLigneBox4=1;
            arbitreLigneBox5=1;
            arbitreLigneBox6=1;
            arbitreLigneBox7=1;

            jComboBoxArbitreLigne2.setSelectedItem(strArbitreLigne2);
            jComboBoxArbitreLigne3.setSelectedItem(strArbitreLigne3);
            jComboBoxArbitreLigne4.setSelectedItem(strArbitreLigne4);
            jComboBoxArbitreLigne5.setSelectedItem(strArbitreLigne5);
            jComboBoxArbitreLigne6.setSelectedItem(strArbitreLigne6);
            jComboBoxArbitreLigne7.setSelectedItem(strArbitreLigne7);
        } else {
            arbitreLigneBox1=0;
        }
        
        /*
        jComboBoxArbitreLigne2.setSelectedIndex(chercherIndiceArbitreLigne(listArbitreLigne2,arbitreLigne2));
        jComboBoxArbitreLigne3.setSelectedIndex(chercherIndiceArbitreLigne(listArbitreLigne3,arbitreLigne3));
        jComboBoxArbitreLigne4.setSelectedIndex(chercherIndiceArbitreLigne(listArbitreLigne4,arbitreLigne4));
        jComboBoxArbitreLigne5.setSelectedIndex(chercherIndiceArbitreLigne(listArbitreLigne5,arbitreLigne5));
        jComboBoxArbitreLigne6.setSelectedIndex(chercherIndiceArbitreLigne(listArbitreLigne6,arbitreLigne6));
        jComboBoxArbitreLigne7.setSelectedIndex(chercherIndiceArbitreLigne(listArbitreLigne7,arbitreLigne7));
        System.out.println(jComboBoxArbitreLigne4.getSelectedItem().toString());*/
    }//GEN-LAST:event_jComboBoxArbitreLigne1ActionPerformed

    private void jComboBoxArbitreLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne2ActionPerformed
        if(arbitreLigneBox2==0){
            strArbitreLigne2=jComboBoxArbitreLigne2.getSelectedItem().toString();

            ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne1 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne3 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne4 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne5 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne6 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne7 = arbitreLigneDAO.findAll();


            ArbitreLigne arbitreLigne1=getArbitreLigne(strArbitreLigne1.toCharArray());
            ArbitreLigne arbitreLigne2=getArbitreLigne(strArbitreLigne2.toCharArray());
            ArbitreLigne arbitreLigne3=getArbitreLigne(strArbitreLigne3.toCharArray());
            ArbitreLigne arbitreLigne4=getArbitreLigne(strArbitreLigne4.toCharArray());
            ArbitreLigne arbitreLigne5=getArbitreLigne(strArbitreLigne5.toCharArray());
            ArbitreLigne arbitreLigne6=getArbitreLigne(strArbitreLigne6.toCharArray());
            ArbitreLigne arbitreLigne7=getArbitreLigne(strArbitreLigne7.toCharArray());


            listArbitreLigne1=enleverArbitresLigne(listArbitreLigne,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne3=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne4=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne5=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne6=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne7=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6);

            DefaultComboBoxModel<String> aModel1 = modelArbitreLigne(listArbitreLigne1);
            DefaultComboBoxModel<String> aModel2 = modelArbitreLigne(listArbitreLigne3);
            DefaultComboBoxModel<String> aModel3 = modelArbitreLigne(listArbitreLigne4);
            DefaultComboBoxModel<String> aModel4 = modelArbitreLigne(listArbitreLigne5);
            DefaultComboBoxModel<String> aModel5 = modelArbitreLigne(listArbitreLigne6);
            DefaultComboBoxModel<String> aModel6 = modelArbitreLigne(listArbitreLigne7);
            jComboBoxArbitreLigne1.setModel(aModel1);
            jComboBoxArbitreLigne3.setModel(aModel2);
            jComboBoxArbitreLigne4.setModel(aModel3);
            jComboBoxArbitreLigne5.setModel(aModel4);
            jComboBoxArbitreLigne6.setModel(aModel5);
            jComboBoxArbitreLigne7.setModel(aModel6);

            arbitreLigneBox1=1;
            arbitreLigneBox3=1;
            arbitreLigneBox4=1;
            arbitreLigneBox5=1;
            arbitreLigneBox6=1;
            arbitreLigneBox7=1;

            jComboBoxArbitreLigne1.setSelectedItem(jComboBoxArbitreLigne1);
            jComboBoxArbitreLigne3.setSelectedItem(jComboBoxArbitreLigne3);
            jComboBoxArbitreLigne4.setSelectedItem(jComboBoxArbitreLigne4);
            jComboBoxArbitreLigne5.setSelectedItem(jComboBoxArbitreLigne5);
            jComboBoxArbitreLigne6.setSelectedItem(jComboBoxArbitreLigne6);
            jComboBoxArbitreLigne7.setSelectedItem(jComboBoxArbitreLigne7);
        } else {
            arbitreLigneBox2=0;
        }
    }//GEN-LAST:event_jComboBoxArbitreLigne2ActionPerformed

    private void jComboBoxArbitreLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne3ActionPerformed
        if(arbitreLigneBox3==0){
            strArbitreLigne3=jComboBoxArbitreLigne3.getSelectedItem().toString();

            ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne1 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne2 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne4 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne5 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne6 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne7 = arbitreLigneDAO.findAll();


            ArbitreLigne arbitreLigne1=getArbitreLigne(strArbitreLigne1.toCharArray());
            ArbitreLigne arbitreLigne2=getArbitreLigne(strArbitreLigne2.toCharArray());
            ArbitreLigne arbitreLigne3=getArbitreLigne(strArbitreLigne3.toCharArray());
            ArbitreLigne arbitreLigne4=getArbitreLigne(strArbitreLigne4.toCharArray());
            ArbitreLigne arbitreLigne5=getArbitreLigne(strArbitreLigne5.toCharArray());
            ArbitreLigne arbitreLigne6=getArbitreLigne(strArbitreLigne6.toCharArray());
            ArbitreLigne arbitreLigne7=getArbitreLigne(strArbitreLigne7.toCharArray());


            listArbitreLigne1=enleverArbitresLigne(listArbitreLigne,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne2=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne4=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne5=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne6=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne7=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6);

            
            DefaultComboBoxModel<String> aModel1 = modelArbitreLigne(listArbitreLigne1);
            DefaultComboBoxModel<String> aModel2 = modelArbitreLigne(listArbitreLigne2);
            DefaultComboBoxModel<String> aModel3 = modelArbitreLigne(listArbitreLigne4);
            DefaultComboBoxModel<String> aModel4 = modelArbitreLigne(listArbitreLigne5);
            DefaultComboBoxModel<String> aModel5 = modelArbitreLigne(listArbitreLigne6);
            DefaultComboBoxModel<String> aModel6 = modelArbitreLigne(listArbitreLigne7);
            jComboBoxArbitreLigne1.setModel(aModel1);
            jComboBoxArbitreLigne2.setModel(aModel2);
            jComboBoxArbitreLigne4.setModel(aModel3);
            jComboBoxArbitreLigne5.setModel(aModel4);
            jComboBoxArbitreLigne6.setModel(aModel5);
            jComboBoxArbitreLigne7.setModel(aModel6);

            arbitreLigneBox1=1;
            arbitreLigneBox2=1;
            arbitreLigneBox4=1;
            arbitreLigneBox5=1;
            arbitreLigneBox6=1;
            arbitreLigneBox7=1;

            jComboBoxArbitreLigne1.setSelectedItem(jComboBoxArbitreLigne1);
            jComboBoxArbitreLigne2.setSelectedItem(jComboBoxArbitreLigne2);
            jComboBoxArbitreLigne4.setSelectedItem(jComboBoxArbitreLigne4);
            jComboBoxArbitreLigne5.setSelectedItem(jComboBoxArbitreLigne5);
            jComboBoxArbitreLigne6.setSelectedItem(jComboBoxArbitreLigne6);
            jComboBoxArbitreLigne7.setSelectedItem(jComboBoxArbitreLigne7);
        } else {
            arbitreLigneBox3=0;
        }
    }//GEN-LAST:event_jComboBoxArbitreLigne3ActionPerformed

    private void jComboBoxArbitreLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne4ActionPerformed
        if(arbitreLigneBox4==0){
            strArbitreLigne4=jComboBoxArbitreLigne4.getSelectedItem().toString();

            ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne1 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne2 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne3 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne5 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne6 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne7 = arbitreLigneDAO.findAll();


            ArbitreLigne arbitreLigne1=getArbitreLigne(strArbitreLigne1.toCharArray());
            ArbitreLigne arbitreLigne2=getArbitreLigne(strArbitreLigne2.toCharArray());
            ArbitreLigne arbitreLigne3=getArbitreLigne(strArbitreLigne3.toCharArray());
            ArbitreLigne arbitreLigne4=getArbitreLigne(strArbitreLigne4.toCharArray());
            ArbitreLigne arbitreLigne5=getArbitreLigne(strArbitreLigne5.toCharArray());
            ArbitreLigne arbitreLigne6=getArbitreLigne(strArbitreLigne6.toCharArray());
            ArbitreLigne arbitreLigne7=getArbitreLigne(strArbitreLigne7.toCharArray());


            listArbitreLigne1=enleverArbitresLigne(listArbitreLigne,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne2=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne3=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne5=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne6=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne7=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6);

            DefaultComboBoxModel<String> aModel1 = modelArbitreLigne(listArbitreLigne1);
            DefaultComboBoxModel<String> aModel2 = modelArbitreLigne(listArbitreLigne2);
            DefaultComboBoxModel<String> aModel3 = modelArbitreLigne(listArbitreLigne3);
            DefaultComboBoxModel<String> aModel4 = modelArbitreLigne(listArbitreLigne5);
            DefaultComboBoxModel<String> aModel5 = modelArbitreLigne(listArbitreLigne6);
            DefaultComboBoxModel<String> aModel6 = modelArbitreLigne(listArbitreLigne7);
            jComboBoxArbitreLigne1.setModel(aModel1);
            jComboBoxArbitreLigne2.setModel(aModel2);
            jComboBoxArbitreLigne3.setModel(aModel3);
            jComboBoxArbitreLigne5.setModel(aModel4);
            jComboBoxArbitreLigne6.setModel(aModel5);
            jComboBoxArbitreLigne7.setModel(aModel6);

            arbitreLigneBox1=1;
            arbitreLigneBox2=1;
            arbitreLigneBox3=1;
            arbitreLigneBox5=1;
            arbitreLigneBox6=1;
            arbitreLigneBox7=1;

            jComboBoxArbitreLigne1.setSelectedItem(jComboBoxArbitreLigne1);
            jComboBoxArbitreLigne2.setSelectedItem(jComboBoxArbitreLigne2);
            jComboBoxArbitreLigne3.setSelectedItem(jComboBoxArbitreLigne3);
            jComboBoxArbitreLigne5.setSelectedItem(jComboBoxArbitreLigne5);
            jComboBoxArbitreLigne6.setSelectedItem(jComboBoxArbitreLigne6);
            jComboBoxArbitreLigne7.setSelectedItem(jComboBoxArbitreLigne7);
        } else {
            arbitreLigneBox4=0;
        }
    }//GEN-LAST:event_jComboBoxArbitreLigne4ActionPerformed

    private void jComboBoxArbitreLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne5ActionPerformed
        if(arbitreLigneBox5==0){
            strArbitreLigne5=jComboBoxArbitreLigne5.getSelectedItem().toString();

            ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne1 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne2 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne3 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne4 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne6 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne7 = arbitreLigneDAO.findAll();


            ArbitreLigne arbitreLigne1=getArbitreLigne(strArbitreLigne1.toCharArray());
            ArbitreLigne arbitreLigne2=getArbitreLigne(strArbitreLigne2.toCharArray());
            ArbitreLigne arbitreLigne3=getArbitreLigne(strArbitreLigne3.toCharArray());
            ArbitreLigne arbitreLigne4=getArbitreLigne(strArbitreLigne4.toCharArray());
            ArbitreLigne arbitreLigne5=getArbitreLigne(strArbitreLigne5.toCharArray());
            ArbitreLigne arbitreLigne6=getArbitreLigne(strArbitreLigne6.toCharArray());
            ArbitreLigne arbitreLigne7=getArbitreLigne(strArbitreLigne7.toCharArray());


            listArbitreLigne1=enleverArbitresLigne(listArbitreLigne,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne2=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne3=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne4=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne6=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne7=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6);

            DefaultComboBoxModel<String> aModel1 = modelArbitreLigne(listArbitreLigne1);
            DefaultComboBoxModel<String> aModel2 = modelArbitreLigne(listArbitreLigne2);
            DefaultComboBoxModel<String> aModel3 = modelArbitreLigne(listArbitreLigne3);
            DefaultComboBoxModel<String> aModel4 = modelArbitreLigne(listArbitreLigne4);
            DefaultComboBoxModel<String> aModel5 = modelArbitreLigne(listArbitreLigne6);
            DefaultComboBoxModel<String> aModel6 = modelArbitreLigne(listArbitreLigne7);
            jComboBoxArbitreLigne1.setModel(aModel1);
            jComboBoxArbitreLigne2.setModel(aModel2);
            jComboBoxArbitreLigne3.setModel(aModel3);
            jComboBoxArbitreLigne4.setModel(aModel4);
            jComboBoxArbitreLigne6.setModel(aModel5);
            jComboBoxArbitreLigne7.setModel(aModel6);

            arbitreLigneBox1=1;
            arbitreLigneBox2=1;
            arbitreLigneBox3=1;
            arbitreLigneBox4=1;
            arbitreLigneBox6=1;
            arbitreLigneBox7=1;
            
            jComboBoxArbitreLigne1.setSelectedItem(jComboBoxArbitreLigne1);
            jComboBoxArbitreLigne2.setSelectedItem(jComboBoxArbitreLigne2);
            jComboBoxArbitreLigne3.setSelectedItem(jComboBoxArbitreLigne3);
            jComboBoxArbitreLigne4.setSelectedItem(jComboBoxArbitreLigne4);
            jComboBoxArbitreLigne6.setSelectedItem(jComboBoxArbitreLigne6);
            jComboBoxArbitreLigne7.setSelectedItem(jComboBoxArbitreLigne7);
        } else {
            arbitreLigneBox5=0;
        }
    }//GEN-LAST:event_jComboBoxArbitreLigne5ActionPerformed

    private void jComboBoxArbitreLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne6ActionPerformed
        if(arbitreLigneBox6==0){
            strArbitreLigne6=jComboBoxArbitreLigne6.getSelectedItem().toString();

            ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne1 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne2 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne3 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne4 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne5 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne7 = arbitreLigneDAO.findAll();


            ArbitreLigne arbitreLigne1=getArbitreLigne(strArbitreLigne1.toCharArray());
            ArbitreLigne arbitreLigne2=getArbitreLigne(strArbitreLigne2.toCharArray());
            ArbitreLigne arbitreLigne3=getArbitreLigne(strArbitreLigne3.toCharArray());
            ArbitreLigne arbitreLigne4=getArbitreLigne(strArbitreLigne4.toCharArray());
            ArbitreLigne arbitreLigne5=getArbitreLigne(strArbitreLigne5.toCharArray());
            ArbitreLigne arbitreLigne6=getArbitreLigne(strArbitreLigne6.toCharArray());
            ArbitreLigne arbitreLigne7=getArbitreLigne(strArbitreLigne7.toCharArray());

            
            listArbitreLigne1=enleverArbitresLigne(listArbitreLigne,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne2=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne3=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne4=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne5=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne7=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6);


            DefaultComboBoxModel<String> aModel1 = modelArbitreLigne(listArbitreLigne1);
            DefaultComboBoxModel<String> aModel2 = modelArbitreLigne(listArbitreLigne2);
            DefaultComboBoxModel<String> aModel3 = modelArbitreLigne(listArbitreLigne3);
            DefaultComboBoxModel<String> aModel4 = modelArbitreLigne(listArbitreLigne4);
            DefaultComboBoxModel<String> aModel5 = modelArbitreLigne(listArbitreLigne5);
            DefaultComboBoxModel<String> aModel6 = modelArbitreLigne(listArbitreLigne7);
            jComboBoxArbitreLigne1.setModel(aModel1);
            jComboBoxArbitreLigne2.setModel(aModel2);
            jComboBoxArbitreLigne3.setModel(aModel3);
            jComboBoxArbitreLigne4.setModel(aModel4);
            jComboBoxArbitreLigne5.setModel(aModel5);
            jComboBoxArbitreLigne7.setModel(aModel6);

            arbitreLigneBox1=1;
            arbitreLigneBox2=1;
            arbitreLigneBox3=1;
            arbitreLigneBox4=1;
            arbitreLigneBox5=1;
            arbitreLigneBox7=1;

            jComboBoxArbitreLigne1.setSelectedItem(jComboBoxArbitreLigne1);
            jComboBoxArbitreLigne2.setSelectedItem(jComboBoxArbitreLigne2);
            jComboBoxArbitreLigne3.setSelectedItem(jComboBoxArbitreLigne3);
            jComboBoxArbitreLigne4.setSelectedItem(jComboBoxArbitreLigne4);
            jComboBoxArbitreLigne5.setSelectedItem(jComboBoxArbitreLigne5);
            jComboBoxArbitreLigne7.setSelectedItem(jComboBoxArbitreLigne7);
        } else {
            arbitreLigneBox6=0;
        }
    }//GEN-LAST:event_jComboBoxArbitreLigne6ActionPerformed

    private void jComboBoxArbitreLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArbitreLigne7ActionPerformed
        if(arbitreLigneBox7==0){
            strArbitreLigne7=jComboBoxArbitreLigne7.getSelectedItem().toString();

            ArrayList<ArbitreLigne> listArbitreLigne = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne1 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne2 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne3 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne4 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne5 = arbitreLigneDAO.findAll();
            ArrayList<ArbitreLigne> listArbitreLigne6 = arbitreLigneDAO.findAll();


            ArbitreLigne arbitreLigne1=getArbitreLigne(strArbitreLigne1.toCharArray());
            ArbitreLigne arbitreLigne2=getArbitreLigne(strArbitreLigne2.toCharArray());
            ArbitreLigne arbitreLigne3=getArbitreLigne(strArbitreLigne3.toCharArray());
            ArbitreLigne arbitreLigne4=getArbitreLigne(strArbitreLigne4.toCharArray());
            ArbitreLigne arbitreLigne5=getArbitreLigne(strArbitreLigne5.toCharArray());
            ArbitreLigne arbitreLigne6=getArbitreLigne(strArbitreLigne6.toCharArray());
            ArbitreLigne arbitreLigne7=getArbitreLigne(strArbitreLigne7.toCharArray());


            listArbitreLigne1=enleverArbitresLigne(listArbitreLigne,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne2=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne3=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne4,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne4=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne5,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne5=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne6,arbitreLigne7);
            listArbitreLigne = arbitreLigneDAO.findAll();
            listArbitreLigne6=enleverArbitresLigne(listArbitreLigne,arbitreLigne1,arbitreLigne2,arbitreLigne3,arbitreLigne4,arbitreLigne5,arbitreLigne7);


            DefaultComboBoxModel<String> aModel1 = modelArbitreLigne(listArbitreLigne1);
            DefaultComboBoxModel<String> aModel2 = modelArbitreLigne(listArbitreLigne2);
            DefaultComboBoxModel<String> aModel3 = modelArbitreLigne(listArbitreLigne3);
            DefaultComboBoxModel<String> aModel4 = modelArbitreLigne(listArbitreLigne4);
            DefaultComboBoxModel<String> aModel5 = modelArbitreLigne(listArbitreLigne5);
            DefaultComboBoxModel<String> aModel6 = modelArbitreLigne(listArbitreLigne6);
            jComboBoxArbitreLigne1.setModel(aModel1);
            jComboBoxArbitreLigne2.setModel(aModel2);
            jComboBoxArbitreLigne3.setModel(aModel3);
            jComboBoxArbitreLigne4.setModel(aModel4);
            jComboBoxArbitreLigne5.setModel(aModel5);
            jComboBoxArbitreLigne6.setModel(aModel6);

            arbitreLigneBox1=1;
            arbitreLigneBox2=1;
            arbitreLigneBox3=1;
            arbitreLigneBox4=1;
            arbitreLigneBox5=1;
            arbitreLigneBox6=1;

            jComboBoxArbitreLigne1.setSelectedItem(jComboBoxArbitreLigne1);
            jComboBoxArbitreLigne2.setSelectedItem(jComboBoxArbitreLigne2);
            jComboBoxArbitreLigne3.setSelectedItem(jComboBoxArbitreLigne3);
            jComboBoxArbitreLigne4.setSelectedItem(jComboBoxArbitreLigne4);
            jComboBoxArbitreLigne5.setSelectedItem(jComboBoxArbitreLigne5);
            jComboBoxArbitreLigne6.setSelectedItem(jComboBoxArbitreLigne6);
        } else {
            arbitreLigneBox7=0;
        }
    }//GEN-LAST:event_jComboBoxArbitreLigne7ActionPerformed

    private void jComboBoxCréneauHoraireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCréneauHoraireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCréneauHoraireActionPerformed

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
    
    private void afficherJoueurs(ArrayList<Joueur> listJoueur1, ArrayList<Joueur> listJoueur2){
        DefaultComboBoxModel<String> aModel1 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModel2 = new DefaultComboBoxModel();
        if(listJoueur1.size()>1){
            listJoueur1.remove(0);
            listJoueur2.remove(1);
            for(Joueur j : listJoueur1){
                aModel1.addElement(j.getNom()+"  "+j.getPrenom());
            }
            for(Joueur j : listJoueur2){
                aModel2.addElement(j.getNom()+"  "+j.getPrenom());
            }
        } else {
            aModel1.addElement("Pas assez de joueurs");
            aModel2.addElement("Pas assez de joueurs");
        }
        jComboBoxJoueur1.setModel(aModel1);
        jComboBoxJoueur2.setModel(aModel2);
    }
    
    private void afficherJoueur1(ArrayList<Joueur> listJoueur, Joueur j){
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        listJoueur.remove(chercherIndiceJoueur(listJoueur,j));
        for(Joueur joueur : listJoueur){
            aModel.addElement(joueur.getNom()+"  "+joueur.getPrenom());
        }
        jComboBoxJoueur1.setModel(aModel);
    }
    
    private void afficherJoueur2(ArrayList<Joueur> listJoueur, Joueur j){
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        listJoueur.remove(chercherIndiceJoueur(listJoueur,j));
        for(Joueur joueur : listJoueur){
            aModel.addElement(joueur.getNom()+"  "+joueur.getPrenom());
        }
        jComboBoxJoueur2.setModel(aModel);
    }
    
    private void afficherEquipes(ArrayList<EquipeDouble> listEquipe1, ArrayList<EquipeDouble> listEquipe2){
        DefaultComboBoxModel<String> aModel1 = new DefaultComboBoxModel();
        DefaultComboBoxModel<String> aModel2 = new DefaultComboBoxModel();
        if(listEquipe1.size()>1){
            listEquipe1.remove(0);
            listEquipe2.remove(1);
            for(EquipeDouble equipeDouble : listEquipe1){
                Joueur joueur1=joueurDAO.find(equipeDouble.getIdJoueur1());
                Joueur joueur2=joueurDAO.find(equipeDouble.getIdJoueur2());
                aModel1.addElement(joueur1.getNom()+"  "+joueur1.getPrenom()+", "+joueur2.getNom()+"  "+joueur2.getPrenom());
            }
            for(EquipeDouble equipeDouble : listEquipe2){
                Joueur joueur1=joueurDAO.find(equipeDouble.getIdJoueur1());
                Joueur joueur2=joueurDAO.find(equipeDouble.getIdJoueur2());
                aModel2.addElement(joueur1.getNom()+"  "+joueur1.getPrenom()+", "+joueur2.getNom()+"  "+joueur2.getPrenom());
            }
        } else {
            aModel1.addElement("Pas assez de joueurs");
            aModel2.addElement("Pas assez de joueurs");
        }
        jComboBoxJoueur1.setModel(aModel1);
        jComboBoxJoueur2.setModel(aModel2);
    }
    
    private void afficherEquipe1(ArrayList<EquipeDouble> listEquipe, EquipeDouble equipe){
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        listEquipe.remove(chercherIndiceEquipe(listEquipe,equipe));
        for(EquipeDouble equipeDouble : listEquipe){
            Joueur joueur1=joueurDAO.find(equipeDouble.getIdJoueur1());
            Joueur joueur2=joueurDAO.find(equipeDouble.getIdJoueur2());
            aModel.addElement(joueur1.getNom()+"  "+joueur1.getPrenom()+", "+joueur2.getNom()+"  "+joueur2.getPrenom());
        }
        jComboBoxJoueur1.setModel(aModel);
    }
    
    private void afficherEquipe2(ArrayList<EquipeDouble> listEquipe, EquipeDouble equipe){
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        listEquipe.remove(chercherIndiceEquipe(listEquipe,equipe));
        for(EquipeDouble equipeDouble : listEquipe){
            Joueur joueur1=joueurDAO.find(equipeDouble.getIdJoueur1());
            Joueur joueur2=joueurDAO.find(equipeDouble.getIdJoueur2());
            aModel.addElement(joueur1.getNom()+"  "+joueur1.getPrenom()+", "+joueur2.getNom()+"  "+joueur2.getPrenom());
        }
        jComboBoxJoueur2.setModel(aModel);
    }
    
    public int chercherIndiceJoueur(ArrayList<Joueur> listJoueur,Joueur joueur){
        int indice=0;
        while(listJoueur.get(indice).getId()!=joueur.getId()){
            indice++;
        }
        return indice--;
    }
    
    public int chercherIndiceArbitreLigne(ArrayList<ArbitreLigne> listArbitreLigne,ArbitreLigne arbitreLigne){
        int indice=0;
        while(listArbitreLigne.get(indice).getId()!=arbitreLigne.getId()){
            indice++;
        }
        return indice--;
    }
    
    public int chercherIndiceEquipe(ArrayList<EquipeDouble> listEquipe,EquipeDouble equipe){
        int indice=0;
        while(listEquipe.get(indice).getId()!=equipe.getId()){
            indice++;
        }
        return indice--;
    }
    
    private DefaultComboBoxModel<String> modelArbitreLigne(ArrayList<ArbitreLigne> listArbitreLigne){
        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel();
        for(ArbitreLigne al : listArbitreLigne){
            aModel.addElement(al.getNom()+"  "+al.getPrenom());
        }
        return aModel;
    }
    
    private ArbitreLigne getArbitreLigne(char[] nomprenom){
        String[] nometprenom=getNomEtPrenom(nomprenom);
        return arbitreLigneDAO.find(arbitreLigneDAO.findIdAvecNomPrenom(nometprenom[0],nometprenom[1]));
    }
    
    private String[] getNomEtPrenom(char[] nomprenom){
        Boolean temp=true,temp2=true;
        int i=1;
        String nom="",prenom="";
        while(i<nomprenom.length && temp){
            if(nomprenom[i-1]==' ' && nomprenom[i]==' '){
                int j;
                for(j=0;j<i-1;j++){
                    nom=nom+nomprenom[j];
                }
                j=i+1;
                while(j<nomprenom.length && temp2){
                    if(nomprenom[j]==Character.MIN_VALUE && nomprenom[j+1]==Character.MIN_VALUE){
                        temp2=false;
                    } else {
                        prenom=prenom+nomprenom[j];
                    }
                    j++;
                }
                temp=false;
            }
            i++;
        }
        String[] nometprenom=new String[2];
        nometprenom[0]=nom;
        nometprenom[1]=prenom;
        return nometprenom;
    }
    
    private Joueur getJoueur(char[] nomprenom){
        String[] nometprenom=getNomEtPrenom(nomprenom);
        return joueurDAO.find(joueurDAO.findIdAvecNomPrenom(nometprenom[0], nometprenom[1]));
    }
    
    private ArrayList<ArbitreLigne> enleverArbitresLigne(ArrayList<ArbitreLigne> listArbitreLigne, ArbitreLigne arbitreLigne1, ArbitreLigne arbitreLigne2, ArbitreLigne arbitreLigne3, ArbitreLigne arbitreLigne4, ArbitreLigne arbitreLigne5, ArbitreLigne arbitreLigne6) {
       int indice;
       indice=chercherIndiceArbitreLigne(listArbitreLigne,arbitreLigne1);
       listArbitreLigne.remove(indice);
       indice=chercherIndiceArbitreLigne(listArbitreLigne,arbitreLigne2);
       listArbitreLigne.remove(indice);
       indice=chercherIndiceArbitreLigne(listArbitreLigne,arbitreLigne3);
       listArbitreLigne.remove(indice);
       indice=chercherIndiceArbitreLigne(listArbitreLigne,arbitreLigne4);
       listArbitreLigne.remove(indice);
       indice=chercherIndiceArbitreLigne(listArbitreLigne,arbitreLigne5);
       listArbitreLigne.remove(indice);
       indice=chercherIndiceArbitreLigne(listArbitreLigne,arbitreLigne6);
       listArbitreLigne.remove(indice);
       return listArbitreLigne;
    }
    
    private void setArbitreLigneComboBoxes(String arbitreLigne1,String arbitreLigne2,String arbitreLigne3,String arbitreLigne4,String arbitreLigne5,String arbitreLigne6,String arbitreLigne7){
        
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
