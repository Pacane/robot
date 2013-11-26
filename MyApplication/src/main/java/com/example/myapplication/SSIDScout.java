package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joel on 24/11/13.
 */
public class SSIDScout {
    private final WifiManager wifi;

    public SSIDScout(WifiManager wifi) {
        this.wifi = wifi;
    }

    public List<String> getSSIDs(){
        final List<ScanResult> scanResults = wifi.getScanResults();
        List<String> results = new ArrayList<String>();
        for(ScanResult scanResult: scanResults) {
            results.add(scanResult.BSSID);
        }

        return results;
    }
}
