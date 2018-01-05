package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.p028a.C0232v;
import android.util.Log;
import java.util.Calendar;

final class bq {
    public static bq f2382a;
    public final Context f2383b;
    public final LocationManager f2384c;
    public final br f2385d = new br();

    bq(Context context, LocationManager locationManager) {
        this.f2383b = context;
        this.f2384c = locationManager;
    }

    final boolean m2534a() {
        br brVar = this.f2385d;
        if ((this.f2385d.f2387b > System.currentTimeMillis() ? 1 : null) != null) {
            return brVar.f2386a;
        }
        Location location = null;
        Location location2 = null;
        if (C0232v.m1135a(this.f2383b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m2533a("network");
        }
        if (C0232v.m1135a(this.f2383b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m2533a("gps");
        }
        Location location3 = (location2 == null || location == null) ? location2 != null ? location2 : location : location2.getTime() > location.getTime() ? location2 : location;
        if (location3 != null) {
            br brVar2 = this.f2385d;
            long currentTimeMillis = System.currentTimeMillis();
            if (bp.f2378a == null) {
                bp.f2378a = new bp();
            }
            bp bpVar = bp.f2378a;
            bpVar.m2532a(currentTimeMillis - 86400000, location3.getLatitude(), location3.getLongitude());
            bpVar.m2532a(currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            boolean z = bpVar.f2381d == 1;
            long j = bpVar.f2380c;
            long j2 = bpVar.f2379b;
            bpVar.m2532a(86400000 + currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            long j3 = bpVar.f2380c;
            if (j == -1 || j2 == -1) {
                j3 = 43200000 + currentTimeMillis;
            } else {
                if (currentTimeMillis > j2) {
                    j3 += 0;
                } else if (currentTimeMillis > j) {
                    j3 = 0 + j2;
                } else {
                    j3 = 0 + j;
                }
                j3 += 60000;
            }
            brVar2.f2386a = z;
            brVar2.f2387b = j3;
            return brVar.f2386a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private final Location m2533a(String str) {
        try {
            if (this.f2384c.isProviderEnabled(str)) {
                return this.f2384c.getLastKnownLocation(str);
            }
        } catch (Throwable e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }
}
