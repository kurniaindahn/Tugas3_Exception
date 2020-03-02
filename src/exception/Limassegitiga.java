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
public class Limassegitiga {
    public double Volume (double a, double ta, double t)
    {
        double lalas=(a*ta)/2;
        return (lalas*t)/3;
    }
    
   public double Luas (double a, double ta, double tm)
   {
       double lalas=(a*ta)/2;
       double lmiring=(a*tm)/2;
       return lalas+(3*lmiring);
   }
}
