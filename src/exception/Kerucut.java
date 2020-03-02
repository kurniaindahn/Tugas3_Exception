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
public class Kerucut {
    public double pi=3.14;
    public double Volume (double r, double t)
    {
        return (pi*r*r*t)/3;
        
    }
    double Luas (double r, double s)
    {
        double lalas = (pi*r*r);
        double lselimut = (pi*r*s);
        return lalas+lselimut;
    }
}
