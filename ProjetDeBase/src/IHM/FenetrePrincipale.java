/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import java.awt.Dimension;
import javax.swing.JFrame;

/**** @author Christian Daul  */
public class FenetrePrincipale extends JFrame {
    private PanneauPrincipal panPrincipal ;
    
    public FenetrePrincipale() {
        super() ;
        
        this.setTitle("TITRE DU PROGRAMME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 300);
        this.setMinimumSize(new Dimension(650,480));
        
        this.panPrincipal = new PanneauPrincipal() ;
        this.add(this.panPrincipal);
        
        this.pack();
        this.setVisible(true); //eueihhj
    }   // Fin du constructeur    
} // Fin de la classe FenetrePrincipale
