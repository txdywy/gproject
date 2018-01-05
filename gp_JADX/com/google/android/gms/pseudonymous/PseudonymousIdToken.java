package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class PseudonymousIdToken extends zza {
    public static final Creator CREATOR = new C5570e();
    public final String f28479a;

    public PseudonymousIdToken(String str) {
        this.f28479a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PseudonymousIdToken)) {
            return false;
        }
        return ad.m23722a(this.f28479a, ((PseudonymousIdToken) obj).f28479a);
    }

    public int hashCode() {
        return this.f28479a.hashCode();
    }

    public String toString() {
        String str = this.f28479a;
        return new StringBuilder(String.valueOf(str).length() + 21).append("PseudonymousIdToken[").append(str).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f28479a);
        C5130b.m23853b(parcel, a);
    }
}
