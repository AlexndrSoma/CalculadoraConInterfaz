/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.AritmeticaFactory;
import Clases.Operacion;
import Clases.TipoOperacion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class VentanaPrincipal extends JPanel {

    public int WIDTH = 300, widthTF = 50, widthB = 200;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField h;
    public JButton calc, conv;
    
  

    public VentanaPrincipal() {
        
    

        h = new JTextField("      ELIGA UNA OPCION:   "); //Header
        h.setBounds(new Rectangle(50, 20, widthB, heightTF));

        calc = new JButton("+-*/ CALCULADORA +-*/");
        calc.setBounds(new Rectangle(50, 80, widthB, heightTF));

        conv = new JButton("101  CONVERSOR 101");
        conv.setBounds(new Rectangle(50, 150, widthB, heightTF));

        h.setEditable(false);

        calc.addActionListener(new ActionListener() {
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
      
                JFrame ventanaCalc = new JFrame("VentanaCalculadora");
                ventanaCalc.setContentPane(new VentanaCalculadora());
                ventanaCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventanaCalc.setResizable(false);
                ventanaCalc.pack();
                ventanaCalc.setVisible(true);
                

            }

        });

        conv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               JFrame ventanaConv = new JFrame("VentanaConversor");
                ventanaConv.setContentPane(new VentanaConvertor());
                ventanaConv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventanaConv.setResizable(false);
                ventanaConv.pack();
                ventanaConv.setVisible(true);

            }

        });
               
              


        add(h);
        add(calc);
        add(conv);
    
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

    }
    
    
}
