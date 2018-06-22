/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import Clases.Operacion;

/**
 *
 * @author alex
 */
public class Division implements Operacion {

    @Override
    public String operar(int a, int b) {
      
        String operacion=Integer.toString(a/b);
        
        return operacion;
    }
    
}
