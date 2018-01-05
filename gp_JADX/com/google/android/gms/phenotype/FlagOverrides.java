package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class FlagOverrides extends zza {
    public static final Creator CREATOR = new ai();
    public final List f28314a;

    public FlagOverrides(List list) {
        this.f28314a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverrides)) {
            return false;
        }
        return this.f28314a.equals(((FlagOverrides) obj).f28314a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlagOverrides(");
        Object obj = 1;
        for (FlagOverride flagOverride : this.f28314a) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            obj = null;
            flagOverride.m26413a(stringBuilder);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23855b(parcel, 2, this.f28314a);
        C5130b.m23853b(parcel, a);
    }
}
