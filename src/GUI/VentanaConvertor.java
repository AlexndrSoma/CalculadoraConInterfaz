/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.AritmeticaFactory;
import Clases.ConvertorFactory;
import Clases.TipoOperacion;
import Clases.Operacion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class VentanaConvertor extends JPanel {

    public int WIDTH = 400, widthTF = 80, widthB = 200;
    public int HEIGHT = 330, heightTF = 30, heightB = 30;
    public JTextField nume,nums, h, result;
    public JButton binbe, binbs, octbe, octbs, decbe, decbs, hexbe, hexbs;
    int a;
    int b=0;

    public VentanaConvertor() {

        h = new JTextField("CONVERSOR. TIPO DE ENTRADA:"); //Header
        h.setBounds(new Rectangle(100, 20, widthB, heightTF));
        
        nume = new JTextField();
        nume.setBounds(new Rectangle(150, 120, widthTF, heightTF));
        

        result = new JTextField("CONVERTIR A ");
        result.setBounds(new Rectangle(100, 150, widthB, heightTF));

        binbe = new JButton("Bin");
        binbe.setBounds(new Rectangle(10, 60, widthTF, heightTF));


        binbs = new JButton("Bin");
        binbs.setBounds(new Rectangle(10, 200, widthTF, heightTF));

        nums = new JTextField("RESULTADO: ");
        nums.setBounds(new Rectangle(100, 240, widthB, heightTF));

        octbe = new JButton("Oct");
        octbe.setBounds(new Rectangle(110, 60, widthTF, heightTF));

        octbs = new JButton("Oct");
        octbs.setBounds(new Rectangle(110, 200, widthTF, heightTF));

        decbe = new JButton("Dec");
        decbe.setBounds(new Rectangle(210, 60, widthTF, heightTF));

        decbs = new JButton("Dec");
        decbs.setBounds(new Rectangle(210, 200, widthTF, heightTF));

        hexbe = new JButton("Hex");
        hexbe.setBounds(new Rectangle(310, 60, widthTF, heightTF));

        hexbs = new JButton("Hex");
        hexbs.setBounds(new Rectangle(310, 200, widthTF, heightTF));

        h.setEditable(false);
        nume.setEditable(true);
        nums.setEditable(false);
        result.setEditable(false);

        binbe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    VentanaConvertor.this.result.setText(nume.getText());

                    a = Integer.parseInt(nume.getText(), 2);
                    
                    System.out.println(a);
                    
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });

        octbe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    VentanaConvertor.this.result.setText(nume.getText());

                    a = Integer.parseInt(nume.getText(), 8);
                    
                    System.out.println(a);
                    
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });

        decbe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    VentanaConvertor.this.result.setText(nume.getText());

                    a = Integer.parseInt(nume.getText(), 10);
                    
                    System.out.println(a);
                    
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });

        hexbe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    VentanaConvertor.this.result.setText(nume.getText());

                    Operacion dec= AritmeticaFactory.getOperacion(TipoOperacion.dec);
                            a = Integer.parseInt(nume.getText(), 16);
                    
                    System.out.println(a);
                    
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });

        binbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    
                    Operacion bin = ConvertorFactory.getOperacion(TipoOperacion.bin);

                    VentanaConvertor.this.nums.setText(String.valueOf(bin.operar(a, b)));
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });
        
        octbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    
                    Operacion oct = ConvertorFactory.getOperacion(TipoOperacion.oct);

                    VentanaConvertor.this.nums.setText(String.valueOf(oct.operar(a, b)));
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });
        
        decbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    
                    Operacion dec = ConvertorFactory.getOperacion(TipoOperacion.dec);

                    VentanaConvertor.this.nums.setText(String.valueOf(dec.operar(a, b)));
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });
        
        hexbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    
                    Operacion hex = ConvertorFactory.getOperacion(TipoOperacion.hex);

                    VentanaConvertor.this.nums.setText(String.valueOf(hex.operar(a, b)));
                } catch (NumberFormatException er) {
                    er.printStackTrace();

                }

            }

        });

        add(h);
        add(nume);
        add(nums);
        add(binbe);
        add(decbe);
        add(hexbe);
        add(octbe);
        add(binbs);
        add(decbs);
        add(hexbs);
        add(octbs);
        add(result);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

    }
}
