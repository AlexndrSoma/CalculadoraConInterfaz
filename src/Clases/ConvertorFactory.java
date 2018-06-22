/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Convertor.Binario;
import Convertor.Octal;
import Convertor.Decimal;
import Convertor.Hexadecimal;


/**
 *
 * @author alex
 */
public class  ConvertorFactory {

    public static Operacion getOperacion(TipoOperacion type) {

        switch (type) {
            case bin:
                return new Binario();
            case oct:
                return new Octal();
            case dec:
                return new Decimal();
            case hex:
                return new Hexadecimal();
        }

        return null;

    }
}
