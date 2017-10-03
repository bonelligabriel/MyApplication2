package com.example.gabriel.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        //LatLng sydney = new LatLng(-34, 151);//

        LatLng linha12 = new LatLng(-26.870424, -49.095579);
        mMap.addMarker(new MarkerOptions().position(linha12).title("Terminal do Aterro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(linha12, 18));

        LatLng dshg = new LatLng(-26.928403, -49.057648);
        mMap.addPolyline(new PolylineOptions().add(
                linha12,
                new LatLng(-26.87472, -49.09772),
                new LatLng(-26.87618, -49.09993),
                new LatLng(-26.87852, -49.10137),
                new LatLng(-26.88217, -49.10281),
                new LatLng(-26.88402, -49.10065),
                new LatLng(-26.88701, -49.09847),
                new LatLng(-26.88863, -49.09713),
                new LatLng(-26.89055, -49.09783),
                new LatLng(-26.89246, -49.09846),
                new LatLng(-26.89562, -49.09904),
                new LatLng(-26.8979,  -49.09889),
                new LatLng(-26.90076, -49.09797),
                new LatLng(-26.90397, -49.09807),
                new LatLng(-26.90446, -49.09494),
                new LatLng(-26.9041,  -49.09183),
                new LatLng(-26.90338, -49.0889),
                new LatLng(-26.90537, -49.08713),
                new LatLng(-26.90762, -49.08484),

                dshg
        )
                .width(10)
                .color(Color.BLUE)
        );
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
