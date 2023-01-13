package id.ac.poliban.mi.vc.reihan.wisataapp_e020320061.utils;

import android.content.Context;

public class Tools {

    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}

// Nama  : Ahmad Reihan H
// NIM   : E020320061
// Kelas : 5C
// Prodi : Manajemen Informatika