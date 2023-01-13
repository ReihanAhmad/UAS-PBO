package id.ac.poliban.mi.vc.reihan.wisataapp_e020320061.model;

import com.google.android.gms.maps.model.LatLng;


public class ModelMapLocation {

    public String name;
    public LatLng center;

    public ModelMapLocation() {}

    public ModelMapLocation(String name, double lat, double lng) {
        this.name = name;
        this.center = new LatLng(lat, lng);
    }
}

// Nama  : Ahmad Reihan H
// NIM   : E020320061
// Kelas : 5C
// Prodi : Manajemen Informatika