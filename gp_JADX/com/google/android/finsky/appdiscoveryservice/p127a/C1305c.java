package com.google.android.finsky.appdiscoveryservice.p127a;

import android.app.usage.UsageStats;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;

public final class C1305c {
    public final Creator f7752a = UsageStats.CREATOR;

    public final UsageStats m7764a(String str) {
        byte[] decode = Base64.decode(str, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        UsageStats usageStats = (UsageStats) this.f7752a.createFromParcel(obtain);
        obtain.recycle();
        return usageStats;
    }

    public static String m7763a(UsageStats usageStats) {
        Parcel obtain = Parcel.obtain();
        usageStats.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return Base64.encodeToString(marshall, 0);
    }

    C1305c() {
    }
}
