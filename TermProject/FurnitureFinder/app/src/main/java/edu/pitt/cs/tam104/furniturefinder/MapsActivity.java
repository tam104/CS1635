package edu.pitt.cs.tam104.furniturefinder;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMapClickListener(this);
        mMap.setOnMarkerClickListener(this);
        mMap.setOnInfoWindowClickListener(this);

        // Add a marker in Sydney and move the camera
        LatLng southOakland = new LatLng(40.4379511,-79.9585451);
        mMap.addMarker(new MarkerOptions().position(southOakland).title("Marker in SO O"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(southOakland));
    }

    public Marker addMarker(LatLng latLng, String title, String info) {
        return mMap.addMarker(new MarkerOptions()
                .position(latLng)
                .title(title)
                .snippet(info)
                .draggable(true));
    }
    @Override
    public void onMapClick(LatLng point) {
        String address = getAddress(point);
        Marker marker = addMarker(point, "New Listing", address);
        //Bring up a side view that lets us add a listing.

    }
    private String getAddress(LatLng point){
        return "Address Goes Here";
    }
    @Override
    public boolean onMarkerClick(final Marker marker) {
        //show listing in detail
        return false;
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
    }


}
