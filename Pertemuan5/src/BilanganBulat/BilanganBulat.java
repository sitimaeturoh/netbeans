/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BilanganBulat;

/**
 *
 * @author MaySM
 */
public class BilanganBulat {
    public static void main (String[] args) {
        //Aritmatika
        int x = 17, y = 5;
        System.out.println("Aritmatika: ");
        System.out.println("x = "+ x);
        System.out.println("x = "+ y);
        System.out.println("x + y = "+ (x + y));
        System.out.println("x - y = "+ (x - y));
        System.out.println("x * y = "+ (x * y));
        System.out.println("x / y = "+ (x / y));
        System.out.println("x % y = "+ (x % y));
        
        System.out.println("Bitwise: ");
        x = 5;
        y = 6;
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        System.out.println("x & y = "+ (x & y));
        System.out.println("x | y = "+ (x | y));
        System.out.println("x ^ y = "+ (x ^ y));
        
        System.out.println("Pengeseran bit: ");
        x = 7;
        System.out.println("x = "+ x);
        System.out.println("x >> 2 = "+ (x >> 2));
        System.out.println("x << 1 = "+ (x << 1));
        System.out.println("x >>> 1 = "+ (x >>> 1));
        
    }
    
}
