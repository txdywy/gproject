package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Configuration extends zza implements Comparable {
    public static final Creator CREATOR = new C5565x();
    public final int f28282a;
    public final Flag[] f28283b;
    public final String[] f28284c;
    public final Map f28285d = new TreeMap();

    public Configuration(int i, Flag[] flagArr, String[] strArr) {
        this.f28282a = i;
        this.f28283b = flagArr;
        for (Flag flag : flagArr) {
            this.f28285d.put(flag.f28302a, flag);
        }
        this.f28284c = strArr;
        if (this.f28284c != null) {
            Arrays.sort(this.f28284c);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.f28282a == configuration.f28282a && C5549h.m26526a(this.f28285d, configuration.f28285d) && Arrays.equals(this.f28284c, configuration.f28284c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        stringBuilder.append(this.f28282a);
        stringBuilder.append(", ");
        stringBuilder.append("(");
        for (Flag append : this.f28285d.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        stringBuilder.append(", ");
        stringBuilder.append("(");
        if (this.f28284c != null) {
            for (String append2 : this.f28284c) {
                stringBuilder.append(append2);
                stringBuilder.append(", ");
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(")");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28282a);
        C5130b.m23849a(parcel, 3, this.f28283b, i);
        C5130b.m23850a(parcel, 4, this.f28284c);
        C5130b.m23853b(parcel, a);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.f28282a - ((Configuration) obj).f28282a;
    }
}
