/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.AritmeticaFactory;
import Clases.TipoOperacion;
import Clases.Operacion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author alex
 */
public class VentanaCalculadora extends JPanel {

    public int WIDTH = 300, widthTF = 50, widthB = 200;
    public int HEIGHT = 330, heightTF = 30, heightB = 30;
    public JTextField h, intA, intB,result;
    public JButton sum, res, mul, div;

    public VentanaCalculadora() {
       
        h = new JTextField("              CALCULADORA     "); //Header
        h.setBounds(new Rectangle(50, 20, widthB, heightTF));
        
        intA = new JTextField();
        intA.setBounds(new Rectangle(50, 135, widthTF, heightTF));

        intB = new JTextField();
        intB.setBounds(new Rectangle(200, 135, widthTF, heightTF));
        
        result = new JTextField("Resultado: ");
        result.setBounds(new Rectangle(50, 280, widthB, heightTF));

        sum = new JButton("+");
        sum.setBounds(new Rectangle(125, 60, widthTF, heightTF));
        
        res = new JButton(" - ");
        res.setBounds(new Rectangle(125, 120, widthTF, heightTF));
        
        mul = new JButton(" * ");
        mul.setBounds(new Rectangle(125, 180, widthTF, heightTF));
        
        div = new JButton(" / ");
        div.setBounds(new Rectangle(125, 240, widthTF, heightTF));

        h.setEditable(false);
        intA.setEditable(true);
        intB.setEditable(true);
        result.setEditable(false);

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int a,b;
                a=Integer.parseInt(intA.getText());
                
                b=Integer.parseInt(intB.getText());
                
                Operacion sum = AritmeticaFactory.getOperacion(TipoOperacion.sum);
                
               
               
                VentanaCalculadora.this.result.setText(sum.operar(a, b));

            }
            
            

        });
        
        res.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int a,b;
                a=Integer.parseInt(intA.getText());
                
                b=Integer.parseInt(intB.getText());
                
                Operacion res = AritmeticaFactory.getOperacion(TipoOperacion.rest);
                
               
               
                VentanaCalculadora.this.result.setText(res.operar(a, b));

            }
            
            

        });
        
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int a,b;
                a=Integer.parseInt(intA.getText());
                
                b=Integer.parseInt(intB.getText());
                
                Operacion mul = AritmeticaFactory.getOperacion(TipoOperacion.mult);
                
               
               
                VentanaCalculadora.this.result.setText(mul.operar(a, b));

            }
            
            

        });
        
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int a,b;
                a=Integer.parseInt(intA.getText());
                
                b=Integer.parseInt(intB.getText());
                
                Operacion div = AritmeticaFactory.getOperacion(TipoOperacion.div);
                
               
               
                VentanaCalculadora.this.result.setText(div.operar(a, b));

            }
            
            

        });
        
        add(h);
        add(intA);
        add(sum);
        add(res);
        add(mul);
        add(div);
        add(intB);
        add(result);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

    }
}
