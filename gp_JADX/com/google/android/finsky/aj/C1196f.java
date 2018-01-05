package com.google.android.finsky.aj;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStats.Bucket;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.support.v4.p028a.C0216d;
import android.telephony.TelephonyManager;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;

public final class C1196f implements C1195g {
    public final Context f7299a;
    public final NetworkStatsManager f7300b;
    public final TelephonyManager f7301c;
    public final PackageManager f7302d;

    public C1196f(Context context, NetworkStatsManager networkStatsManager, TelephonyManager telephonyManager, PackageManager packageManager) {
        this.f7299a = context;
        this.f7300b = networkStatsManager;
        this.f7301c = telephonyManager;
        this.f7302d = packageManager;
    }

    public final C1194e mo1515a(String str) {
        if (C0216d.m1111a(this.f7299a, "android.permission.PACKAGE_USAGE_STATS") == 0) {
            return m7148a(str, new Bucket());
        }
        return null;
    }

    private final C1194e m7148a(String str, Bucket bucket) {
        NetworkStats queryDetailsForUid;
        RemoteException e;
        long j;
        try {
            int i = this.f7302d.getApplicationInfo(str, 0).uid;
            long a = C4678i.m21812a();
            try {
                queryDetailsForUid = this.f7300b.queryDetailsForUid(0, this.f7301c.getSubscriberId(), a - ((Long) C0955b.hE.m28964b()).longValue(), a, i);
            } catch (RemoteException e2) {
                e = e2;
                FinskyLog.m21667d("Failed to get data usage stats for %s: %s", str, e);
                queryDetailsForUid = null;
                if (queryDetailsForUid != null) {
                    return null;
                }
                j = 0;
                while (queryDetailsForUid.hasNextBucket()) {
                    queryDetailsForUid.getNextBucket(bucket);
                    if (bucket.getState() != -1) {
                        j += bucket.getRxBytes() + bucket.getTxBytes();
                    } else if (bucket.getState() != 2) {
                        bucket.getRxBytes();
                        bucket.getTxBytes();
                    }
                }
                queryDetailsForUid.close();
                return new C1194e(str, j, a);
            } catch (SecurityException e3) {
                e = e3;
                FinskyLog.m21667d("Failed to get data usage stats for %s: %s", str, e);
                queryDetailsForUid = null;
                if (queryDetailsForUid != null) {
                    return null;
                }
                j = 0;
                while (queryDetailsForUid.hasNextBucket()) {
                    queryDetailsForUid.getNextBucket(bucket);
                    if (bucket.getState() != -1) {
                        j += bucket.getRxBytes() + bucket.getTxBytes();
                    } else if (bucket.getState() != 2) {
                        bucket.getRxBytes();
                        bucket.getTxBytes();
                    }
                }
                queryDetailsForUid.close();
                return new C1194e(str, j, a);
            }
            if (queryDetailsForUid != null) {
                return null;
            }
            j = 0;
            while (queryDetailsForUid.hasNextBucket()) {
                queryDetailsForUid.getNextBucket(bucket);
                if (bucket.getState() != -1) {
                    j += bucket.getRxBytes() + bucket.getTxBytes();
                } else if (bucket.getState() != 2) {
                    bucket.getRxBytes();
                    bucket.getTxBytes();
                }
            }
            queryDetailsForUid.close();
            return new C1194e(str, j, a);
        } catch (NameNotFoundException e4) {
            FinskyLog.m21667d("Failed to get data usage stats for %s: %s", str, e4);
            return null;
        }
    }
}
