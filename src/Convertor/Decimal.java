/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertor;
import Clases.Operacion;
/**
 *
 * @author alex
 */
public class Decimal implements Operacion {

    @Override
    public String operar(int a, int b) {
        
        String dec = Integer.toString(a);
    
  
        return dec ;
    }
    
}