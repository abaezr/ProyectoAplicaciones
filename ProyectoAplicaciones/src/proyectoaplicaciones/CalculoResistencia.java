/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaplicaciones;

import static java.lang.Math.pow;

/**
 *
 * @author user
 */
public class CalculoResistencia {
    public double calculoValorResistencia(double banda1, double banda2, double multiplicador){
        double valor;
        if(multiplicador == pow(10,10.0))
            multiplicador = 0.1;
        if(multiplicador == pow(10,11))
            multiplicador = 0.01;
        valor = (banda1*10+banda2)*multiplicador;
        return valor;
    }
    public double calculoTolerancia(double colorBanda){
        double tolerancia = 0;
        if(colorBanda == 1)
            tolerancia = 5;
        if(colorBanda == 2)
            tolerancia = 10;
        if(colorBanda == 3)
            tolerancia = 1;
       if(colorBanda == 4)
            tolerancia = 2;
        return tolerancia;
    }
}
