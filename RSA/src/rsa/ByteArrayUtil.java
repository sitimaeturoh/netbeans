/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

/**
 *
 * @author MaySM
 */
public class ByteArrayUtil {
   static final byte[] HEX_CHAR_TABLE = {
       (byte) '0', (byte) '1', (byte) '2', (byte) '3',
       (byte) '4', (byte) '5', (byte) '6', (byte) '7',
       (byte) '8', (byte) '9', (byte) 'A', (byte) 'B',
       (byte) 'C', (byte) 'D', (byte) 'E', (byte) 'F'
   };
   
   static String getHexString(byte[] raw){
       byte[] hex = new byte [ 2 * raw.length];
       int index = 0;
       
       for (int i = 0; i < raw.length; i++) {
           byte b = raw[i];
           int v = b & 0xFF;
           hex[index++] = HEX_CHAR_TABLE[v >>> 4];
           hex[index++]= HEX_CHAR_TABLE[v & 0xF];
       }
       return new String(hex);
   }
    
}
