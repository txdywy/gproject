package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzcvg extends zza {
    public static final Creator CREATOR = new jk();
    public int f27824a;
    public final String f27825b;
    public final long f27826c;
    public Long f27827d;
    public String f27828e;
    public final String f27829f;
    public Double f27830g;

    zzcvg(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f27824a = i;
        this.f27825b = str;
        this.f27826c = j;
        this.f27827d = l;
        if (i == 1) {
            this.f27830g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f27830g = d;
        }
        this.f27828e = str2;
        this.f27829f = str3;
    }

    zzcvg(String str, long j, Object obj, String str2) {
        am.m23735a(str);
        this.f27824a = 2;
        this.f27825b = str;
        this.f27826c = j;
        this.f27829f = str2;
        if (obj == null) {
            this.f27827d = null;
            this.f27830g = null;
            this.f27828e = null;
        } else if (obj instanceof Long) {
            this.f27827d = (Long) obj;
            this.f27830g = null;
            this.f27828e = null;
        } else if (obj instanceof String) {
            this.f27827d = null;
            this.f27830g = null;
            this.f27828e = (String) obj;
        } else if (obj instanceof Double) {
            this.f27827d = null;
            this.f27830g = (Double) obj;
            this.f27828e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f27824a);
        C5130b.m23844a(parcel, 2, this.f27825b);
        C5130b.m23839a(parcel, 3, this.f27826c);
        C5130b.m23843a(parcel, 4, this.f27827d);
        C5130b.m23844a(parcel, 6, this.f27828e);
        C5130b.m23844a(parcel, 7, this.f27829f);
        Double d = this.f27830g;
        if (d != null) {
            C5130b.m23838a(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        C5130b.m23853b(parcel, a);
    }
}
