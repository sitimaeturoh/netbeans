/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathArrayUtility;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author MaySM
 */
public class TestMhs {
    
    public static void main (String[] args) {
        Mhs m1 = new Mhs (1,2016, "ana", "3D");
        Mhs m2 = new Mhs (2,2016, "ani", "3D");
        Mhs m3 = new Mhs (3,2016, "anu", "3D");
        Mhs m4 = new Mhs (4,2016, "ane", "3D");
        
        List<Mhs> mhs = new ArrayList<>();
        mhs.add(m1);
        mhs.add(m2);
        mhs.add(m3);
        mhs.add(m4);
        
        mhs.forEach((mh) -> {
            System.out.println(""+mh.toString());
        });
        
    }
}
