/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Aritmetica.Suma;
import Aritmetica.Resta;
import Aritmetica.Multiplicacion;
import Aritmetica.Division;


/**
 *
 * @author alex
 */
public class AritmeticaFactory {

    public static Operacion getOperacion(TipoOperacion type) {

        switch (type) {
            case sum:
                return new Suma();
            case rest:
                return new Resta();
            case mult:
                return new Multiplicacion();
            case div:
                return new Division();
        }

        return null;

    }
}
