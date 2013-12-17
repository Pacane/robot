package com.example.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Joel on 16/12/13.
 */
public class BestMatch {

    List<Feature> mapFeatures = new ArrayList<Feature>();

    public void addFeature(Feature feature){
        mapFeatures.add(feature);
    }

    public Feature findBestMatch(Set<String> scannedBSSIDs){
        Map<Feature, Integer> matchScore = new HashMap<Feature, Integer>();

        for (Feature feature : mapFeatures){
            matchScore.put(feature, 0);
            for (String bssid : scannedBSSIDs){
                if(feature.SSIDs.contains(bssid))
                    matchScore.put(feature, matchScore.get(feature)+1);
            }
        }

        int maxScore = 0;
        Feature bestResult = null;
        for (Map.Entry<Feature, Integer> entry : matchScore.entrySet())
        {
            if(entry.getValue() > maxScore)
                bestResult = entry.getKey();
        }

        return bestResult;
    }
}
