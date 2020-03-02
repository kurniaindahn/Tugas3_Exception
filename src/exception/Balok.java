/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Kurnia Indah N
 */
public class Balok {
    double Volume (double p, double l, double t)
    {
        return p*l*t;
    }
    
    double Luas (double p, double l, double t)
    {
        return 2*((p*l)+(p*t)+(l*t));
    }
}
