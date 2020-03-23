/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;
import java.util.Random;
/**
 *
 * @author David
 */
public class Pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random azar = new Random();
        
        int n = 1000000000;
        int puntosCirculo = 0;
        
        for(int i=0 ; i<n; i++)
        {
            double x = azar.nextDouble();
            double y = azar.nextDouble();
            
            if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < 1)
                puntosCirculo += 1;
        }
        
        System.out.println("puntosCirculo = " + puntosCirculo);
        System.out.println("n = "+n);
        
        double pi = (double)puntosCirculo / n * 4;
        System.out.println("Pi = "+pi);
        
        System.out.println("Calla, puta");
    }
    
}
