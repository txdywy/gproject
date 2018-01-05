package com.google.android.finsky.aj;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStats$Bucket;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.RemoteException;
import android.support.v4.a.d;
import android.telephony.TelephonyManager;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.i;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.aj.f implements com.google.android.finsky.aj.g
{

    public final Context a;
    public final NetworkStatsManager b;
    public final TelephonyManager c;
    public final PackageManager d;

    f(Context p0, NetworkStatsManager p1, TelephonyManager p2, PackageManager p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    private final com.google.android.finsky.aj.e a(String p0, NetworkStats$Bucket p1) {
  4:    try {
 13:        v6 = com.google.android.finsky.utils.i.a();
        }
        catch (PackageManager$NameNotFoundException ex) {
 51:        v2 = new Object[2];
 53:        v2[0] = p0;
 55:        v2[1] = ex;
 57:        FinskyLog.d("Failed to get data usage stats for %s: %s", v2);
 60:        v2 = 0;
 61:        return v2;
        }
 40:    v0 = this.b.queryDetailsForUid(0, this.c.getSubscriberId(), v6 - ((Long)com.google.android.finsky.aa.b.hE.b()).longValue(), v6, this.d.getApplicationInfo(p0, 0).uid);
 44:    if (v0 == 0)
 46:        v2 = 0;
        else {
 76:        v4 = 0;
 78:        while (v0.hasNextBucket()) {
 84:            v0.getNextBucket(p1);
 92:            if (p1.getState() == -1)
103:                v4 = v4 + p1.getRxBytes() + p1.getTxBytes();
109:            else if (p1.getState() == 2) {
111:                p1.getRxBytes();
114:                p1.getTxBytes();
                }
            }
118:        v0.close();
124:        v2 = new com.google.android.finsky.aj.e(p0, v4, v6);
        }
 47:    return v2;
 62:    v0 = ex;
 65:    v2 = new Object[2];
 67:    v2[0] = p0;
 69:    v2[1] = v0;
 71:    FinskyLog.d("Failed to get data usage stats for %s: %s", v2);
 74:    v0 = 0;
 75:    goto 44;
128:    v0 = ex;
129:    goto 63;
130:    try
            run 17...43
        catch (RemoteException ex) {
 17:        goto 62;
        }
        catch (SecurityException ex) {
 17:        goto 128;
        }
    }

    public final com.google.android.finsky.aj.e a(String p0) {
        if (android.support.v4.a.d.a(this.a, "android.permission.PACKAGE_USAGE_STATS") == 0)
            v0 = this.a(p0, new NetworkStats$Bucket());
        else
            v0 = 0;
        return v0;
    }

}
