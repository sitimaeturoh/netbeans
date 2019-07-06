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
class KunciPrivatRSA {
    
    public  BigInteger d; 

    public KunciPrivatRSA(BigInteger d) {
        this.d = d;
    }
    
    public  BigInteger getD() {
        return d;
    }
    
    public void setD(BigInteger d) {
        this.d = d;
    }
    
    @Override
    public String toString(){
        return "d = " + d;
    }
}
