/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author MaySM
 */
public class RSA {
    
    public LinkedList pembangkitKunci(int panjang_n) {
        LinkedList obj = new LinkedList();
        BigInteger p = null,q = null,n = null,phi_n = null,e = null,d = null;
        BigInteger[] pq =  pilihPQ(panjang_n);
        p = pq[0];
        q = pq[1];
        phi_n = pq[2];
        e = pq[3];
        n = p.multiply(q);
        d = RSA.inversPerkalian(e,phi_n);
        
        //membuat objek baru
        KunciPublikRSA kunciPublik = new KunciPublikRSA(n,e);
        obj.add(kunciPublik);
        KunciPrivatRSA kunciPrivat = new KunciPrivatRSA(d);
        obj.add(kunciPrivat);
        
        
        return obj;
    }
    
    public static BigInteger inversPerkalian(BigInteger e, BigInteger phi_n){
        BigInteger A = phi_n, B= e;
        BigInteger q = null;
        BigInteger r = null;
        BigInteger S1 = BigInteger.ONE, S2 = BigInteger.ZERO, S=null;
        BigInteger TI = BigInteger.ZERO, T2 = BigInteger.ONE, T = null;
    
        while(B.compareTo(BigInteger.ZERO) !=0) {
            BigInteger[]res = A.divideAndRemainder(B);
            q = res[0];
            r = res[1];
            
            A = B;
            B = r;
            
            S = S1.subtract(q.multiply(S2));
            S1 = S2;
            S2 = S;
            
            T = TI.subtract(q.multiply(T2));
            TI = T2;
            T2 = T;
        }
        
        if(TI.signum() == -1) return phi_n.add(TI);
        return TI;
    }
    
    protected BigInteger[] pilihPQ(int panjang_n) {
       BigInteger[] ret = new BigInteger[4];
        BigInteger p = null, q= null, phi_n=null, e=null;
       boolean ujiKriteria = false;
        Random r = new Random();
        
        while(ujiKriteria == false){
            p = new BigInteger(panjang_n/2, 10, r);
            q = new BigInteger(panjang_n/2, 10, r);
            
            BigInteger p1 = p.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2));
            BigInteger q1 = q.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2));
            
            if(p1.gcd(p).compareTo(BigInteger.ONE) !=0) continue;
            if(p1.gcd(q).compareTo(BigInteger.ONE) !=0) continue;
            
            BigInteger p_minus_1 = p.subtract(BigInteger.ONE);
            BigInteger q_minus_1 = q.subtract(BigInteger.ONE);
        
            phi_n = p_minus_1.multiply(q_minus_1);
            
            BigInteger gcd = p_minus_1.gcd(q_minus_1);
            
            ujiKriteria = gcd.compareTo(BigInteger.ONE)<0;
            if(!ujiKriteria) continue;
            
            e = new BigInteger(r.nextInt(panjang_n),r);
            gcd = phi_n.gcd(e);
            
            if(gcd.compareTo(BigInteger.ONE) != 0) {
                ujiKriteria = false;
                continue;
            }
        }
        
       ret[0] = p;
       ret[1] = q;
       ret[2] = phi_n;
       ret[3] = e;
       
       
       return ret;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int panjang_n = 128;
        RSA rsa = new RSA();
        
        LinkedList kunciRSA = rsa.pembangkitKunci(panjang_n);
        System.out.println("Kunci Publik\n" + kunciRSA.get(0));
        System.out.println("Kunci Privat\n" + kunciRSA.get(1));
        
        
        KunciPublikRSA kunciPublikRSA = (KunciPublikRSA) kunciRSA.get(0);
        KunciPrivatRSA kunciPrivatRSA = (KunciPrivatRSA) kunciRSA.get(1);
        
        byte[] plainteks = new byte[panjang_n/8 -1];
        Random r = new Random();
        r.nextBytes(plainteks);
        BigInteger bigP = new BigInteger(1, plainteks);
        System.out.println("plainteks : " + ByteArrayUtil.getHexString(bigP.toByteArray()));
        
        byte[] chipertexts = rsa.enkripsi(bigP.toByteArray(), kunciPublik);
        System.out.println("chipstexts : "+ ByteArrayUtil.getHexString(chipertexts));
    }
    
}
