package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class Scope extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new ac();
    public int f25623a;
    public final String f25624b;

    Scope(int i, String str) {
        am.m23736a(str, (Object) "scopeUri must not be null or empty");
        this.f25623a = i;
        this.f25624b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.f25624b.equals(((Scope) obj).f25624b);
    }

    public final int hashCode() {
        return this.f25624b.hashCode();
    }

    public final String toString() {
        return this.f25624b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25623a);
        C5130b.m23844a(parcel, 2, this.f25624b);
        C5130b.m23853b(parcel, a);
    }
}
