package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Iterator;

public final class zzcqt extends zza implements Iterable {
    public static final Creator CREATOR = new gq();
    public final Bundle f27819a;

    zzcqt(Bundle bundle) {
        this.f27819a = bundle;
    }

    public final Iterator iterator() {
        return new gp(this);
    }

    public final String toString() {
        return this.f27819a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23840a(parcel, 2, new Bundle(this.f27819a));
        C5130b.m23853b(parcel, a);
    }
}
