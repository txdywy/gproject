package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public class ConnectionConfiguration extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C5659v();
    public final String f28558a;
    public final String f28559b;
    public final int f28560c;
    public final int f28561d;
    public final boolean f28562e;
    public volatile boolean f28563f;
    public volatile String f28564g;
    public boolean f28565h;
    public String f28566i;

    ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.f28558a = str;
        this.f28559b = str2;
        this.f28560c = i;
        this.f28561d = i2;
        this.f28562e = z;
        this.f28563f = z2;
        this.f28564g = str3;
        this.f28565h = z3;
        this.f28566i = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return ad.m23722a(this.f28558a, connectionConfiguration.f28558a) && ad.m23722a(this.f28559b, connectionConfiguration.f28559b) && ad.m23722a(Integer.valueOf(this.f28560c), Integer.valueOf(connectionConfiguration.f28560c)) && ad.m23722a(Integer.valueOf(this.f28561d), Integer.valueOf(connectionConfiguration.f28561d)) && ad.m23722a(Boolean.valueOf(this.f28562e), Boolean.valueOf(connectionConfiguration.f28562e)) && ad.m23722a(Boolean.valueOf(this.f28565h), Boolean.valueOf(connectionConfiguration.f28565h));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28558a, this.f28559b, Integer.valueOf(this.f28560c), Integer.valueOf(this.f28561d), Boolean.valueOf(this.f28562e), Boolean.valueOf(this.f28565h)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionConfiguration[ ");
        String str = "mName=";
        String valueOf = String.valueOf(this.f28558a);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        str = ", mAddress=";
        valueOf = String.valueOf(this.f28559b);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mType=" + this.f28560c);
        stringBuilder.append(", mRole=" + this.f28561d);
        stringBuilder.append(", mEnabled=" + this.f28562e);
        stringBuilder.append(", mIsConnected=" + this.f28563f);
        str = ", mPeerNodeId=";
        valueOf = String.valueOf(this.f28564g);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mBtlePriority=" + this.f28565h);
        str = ", mNodeId=";
        valueOf = String.valueOf(this.f28566i);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28558a);
        C5130b.m23844a(parcel, 3, this.f28559b);
        C5130b.m23854b(parcel, 4, this.f28560c);
        C5130b.m23854b(parcel, 5, this.f28561d);
        C5130b.m23846a(parcel, 6, this.f28562e);
        C5130b.m23846a(parcel, 7, this.f28563f);
        C5130b.m23844a(parcel, 8, this.f28564g);
        C5130b.m23846a(parcel, 9, this.f28565h);
        C5130b.m23844a(parcel, 10, this.f28566i);
        C5130b.m23853b(parcel, a);
    }
}
