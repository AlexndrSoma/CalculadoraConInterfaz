/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.VentanaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class main {

    public static void main(String[] args) {

        JFrame ventanaPrinc = new JFrame("VentanaPrincipal");
        ventanaPrinc.setContentPane(new VentanaPrincipal());
        ventanaPrinc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrinc.setResizable(false);
        ventanaPrinc.pack();
        ventanaPrinc.setVisible(true);

  

    }
}
