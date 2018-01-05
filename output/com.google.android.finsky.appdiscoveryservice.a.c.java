package com.google.android.finsky.appdiscoveryservice.a;

import android.app.usage.UsageStats;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.util.Base64;

public final class com.google.android.finsky.appdiscoveryservice.a.c
{

    public final Parcelable$Creator a;

    c() {
        this.a = UsageStats.CREATOR;
    }

    public static String a(UsageStats p0) {
        v0 = Parcel.obtain();
        p0.writeToParcel(v0, 0);
        v0.recycle();
        return Base64.encodeToString(v0.marshall(), 0);
    }

    public final UsageStats a(String p0) {
        v0 = Base64.decode(p0, 0);
        v1 = Parcel.obtain();
        v1.unmarshall(v0, 0, v0.length);
        v1.recycle();
        return (UsageStats)this.a.createFromParcel(v1);
    }

}
