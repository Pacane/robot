package com.example.myapplication;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by joel on 23/11/13.
 */
public class MyLocationListener implements LocationListener {

    private TextView view;

    public MyLocationListener(TextView view){
        this.view = view;
    }

    @Override
    public void onLocationChanged(Location location) {
        location.getLatitude();

        location.getLongitude();

        String text = "Latitude = " + location.getLatitude() + "\n" +

        "Longitude = " + location.getLongitude();

        view.setText(text);
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
