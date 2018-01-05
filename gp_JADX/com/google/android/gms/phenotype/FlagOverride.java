package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class FlagOverride extends zza {
    public static final Creator CREATOR = new ah();
    public final String f28310a;
    public final String f28311b;
    public final Flag f28312c;
    public final boolean f28313d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.f28310a = str;
        this.f28311b = str2;
        this.f28312c = flag;
        this.f28313d = z;
    }

    public final String m26413a(StringBuilder stringBuilder) {
        stringBuilder.append("FlagOverride(");
        stringBuilder.append(this.f28310a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28311b);
        stringBuilder.append(", ");
        this.f28312c.m26412a(stringBuilder);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28313d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverride)) {
            return false;
        }
        FlagOverride flagOverride = (FlagOverride) obj;
        return C5549h.m26526a(this.f28310a, flagOverride.f28310a) && C5549h.m26526a(this.f28311b, flagOverride.f28311b) && C5549h.m26526a(this.f28312c, flagOverride.f28312c) && this.f28313d == flagOverride.f28313d;
    }

    public String toString() {
        return m26413a(new StringBuilder());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28310a);
        C5130b.m23844a(parcel, 3, this.f28311b);
        C5130b.m23842a(parcel, 4, this.f28312c, i);
        C5130b.m23846a(parcel, 5, this.f28313d);
        C5130b.m23853b(parcel, a);
    }
}
