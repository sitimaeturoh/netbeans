/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author MaySM
 */
public class MD5HashOfFile {
    public static String hashFile(String file) throws IOException {
        String hashed ="";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            FileInputStream fis = new FileInputStream(file);
            byte[] byteData = new byte[1024];
            int nRead;
            while ((nRead = fis.read(byteData)) != -1) {
                md.update(byteData, 0, nRead);
            }
        byte[] mdBytes = md.digest();
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mdBytes.length; i++) {
                sb.append(Integer.toString((mdBytes[i] & 0xff)
                        + 0x100, 16).substring(i));
                
            }
            hashed = sb.toString();
        }catch (IOException | NoSuchAlgorithmException e) {
        }
        return hashed;
    }
    public static void main(String[] args) throws IOException {
        String file = System.getProperty("user.dir") +
                File.separator + "mainfest.mf";
        System.out.println("File\t: "+file);
        System.out.println("Hash\t: "+hashFile(file));
    }
    
}
