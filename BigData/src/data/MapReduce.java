/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.Document;


/**
 *
 * @author MaySM
 */
public class MapReduce {
    public static ArrayList<Document> map(ArrayList<Document> friendList) {
        ArrayList <Document> mapResult = new ArrayList<>();
        for(Document personFriend:friendList) {
            ArrayList<Document> mapFriend = new ArrayList<>();
            String name = personFriend.getString("name");
            ArrayList friends = (ArrayList)personFriend.get("friends");
            
        }
    }
    
}
