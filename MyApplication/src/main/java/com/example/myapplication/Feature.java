package com.example.myapplication;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joel on 16/12/13.
 */
public class Feature {
    public String ID;
    public Set<String> SSIDs;

    public Feature(String id){
        ID = id;
        SSIDs = new HashSet<String>();
    }
}
