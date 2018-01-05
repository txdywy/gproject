package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.C5128s;
import com.google.android.gms.common.internal.C5132u;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5164d;

public final class zzl extends zza {
    public static final Creator CREATOR = new C5145s();
    public final String f26097a;
    public final C5139m f26098b;
    public final boolean f26099c;

    zzl(String str, IBinder iBinder, boolean z) {
        this.f26097a = str;
        this.f26098b = m23897a(iBinder);
        this.f26099c = z;
    }

    zzl(String str, C5139m c5139m, boolean z) {
        this.f26097a = str;
        this.f26098b = c5139m;
        this.f26099c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 1, this.f26097a);
        if (this.f26098b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = this.f26098b.asBinder();
        }
        C5130b.m23841a(parcel, 2, iBinder);
        C5130b.m23846a(parcel, 3, this.f26099c);
        C5130b.m23853b(parcel, a);
    }

    private static C5139m m23897a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        C5128s c5128s;
        if (iBinder == null) {
            c5128s = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            c5128s = queryLocalInterface instanceof C5128s ? (C5128s) queryLocalInterface : new C5132u(iBinder);
        }
        try {
            C5139m c5140n;
            C5161a a = c5128s.mo4624a();
            byte[] bArr = a == null ? null : (byte[]) C5164d.m23907a(a);
            if (bArr != null) {
                c5140n = new C5140n(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                c5140n = null;
            }
            return c5140n;
        } catch (Throwable e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
