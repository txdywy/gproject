package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzclh extends zza {
    public static final Creator CREATOR = new ex();
    public int f27790a;
    public ci f27791b = null;
    public byte[] f27792c;

    zzclh(int i, byte[] bArr) {
        this.f27790a = i;
        this.f27792c = bArr;
        m26051b();
    }

    private final void m26051b() {
        if (this.f27791b == null && this.f27792c != null) {
            return;
        }
        if (this.f27791b != null && this.f27792c == null) {
            return;
        }
        if (this.f27791b != null && this.f27792c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f27791b == null && this.f27792c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final ci m26052a() {
        if ((this.f27791b != null ? 1 : null) == null) {
            try {
                byte[] bArr = this.f27792c;
                this.f27791b = (ci) wz.m24211a(new ci(), bArr, bArr.length);
                this.f27792c = null;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        m26051b();
        return this.f27791b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f27790a);
        C5130b.m23847a(parcel, 2, this.f27792c != null ? this.f27792c : wz.m24212a(this.f27791b));
        C5130b.m23853b(parcel, a);
    }
}
