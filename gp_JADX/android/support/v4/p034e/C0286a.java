package android.support.v4.p034e;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;

public final class C0286a {
    public static boolean m1605a(ConnectivityManager connectivityManager) {
        if (VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 1:
            case 7:
            case 9:
                return false;
            default:
                return true;
        }
    }
}
