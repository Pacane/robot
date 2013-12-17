package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel on 16/12/13.
 */
public class Feature {
    public String ID;
    public List<String> SSIDs;

    public Feature(String id){
        ID = id;
        SSIDs = new ArrayList<String>();
    }
}