package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public final class Status extends zza implements C4980w, ReflectedParcelable {
    public static final Creator CREATOR = new ad();
    public static final Status f25625a = new Status(0);
    public static final Status f25626b = new Status(14);
    public static final Status f25627c = new Status(8);
    public static final Status f25628d = new Status(15);
    public static final Status f25629e = new Status(16);
    public int f25630f;
    public final int f25631g;
    public final String f25632h;
    public final PendingIntent f25633i;

    static {
        Status status = new Status(17);
        status = new Status(18);
    }

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f25630f = i;
        this.f25631g = i2;
        this.f25632h = str;
        this.f25633i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean m23271a() {
        return this.f25631g <= 0;
    }

    public final Status mo4505b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f25630f == status.f25630f && this.f25631g == status.f25631g && ad.m23722a(this.f25632h, status.f25632h) && ad.m23722a(this.f25633i, status.f25633i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25630f), Integer.valueOf(this.f25631g), this.f25632h, this.f25633i});
    }

    public final String toString() {
        return ad.m23721a(this).m23723a("statusCode", this.f25632h != null ? this.f25632h : C5087l.m23645a(this.f25631g)).m23723a("resolution", this.f25633i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25631g);
        C5130b.m23844a(parcel, 2, this.f25632h);
        C5130b.m23842a(parcel, 3, this.f25633i, i);
        C5130b.m23854b(parcel, 1000, this.f25630f);
        C5130b.m23853b(parcel, a);
    }
}
