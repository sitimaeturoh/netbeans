/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;

/**
 *
 * @author MaySM
 */
class KunciPublikRSA {
    private BigInteger n;
    private BigInteger e;

    public KunciPublikRSA(BigInteger n, BigInteger e) {
        this.n = n;
        this.e = e;
    }
    
    public BigInteger getN(){
        return n;
    }
    
    public void setN(BigInteger n) {
        this.n = n;
    }
     public  BigInteger getE(){
         return e;
     }
     
     public  void setE(BigInteger e) {
         this.e = e;
     }
    
     public String toString(){
         return "(e= " +e + "," + "n = " + n + ")";
     } 
    
}
