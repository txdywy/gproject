package com.google.android.wallet.common.pub;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.p443h.p447b.p448a.p449a.p450a.C7149a;
import com.google.p443h.p447b.p448a.p449a.p450a.C7150b;

public class SecurePaymentsPayload implements Parcelable {
    public static final Creator CREATOR = new C6585f();
    @Deprecated
    public final byte[] f32709a;
    @Deprecated
    public final C6586g[] f32710b;
    public final C7149a f32711c;

    public SecurePaymentsPayload(C7149a c7149a) {
        if (c7149a == null) {
            throw new IllegalArgumentException("securePayload must not be null");
        }
        this.f32711c = c7149a;
        this.f32709a = c7149a.f34920a;
        int length = c7149a.f34921b.length;
        this.f32710b = new C6586g[length];
        for (int i = 0; i < length; i++) {
            this.f32710b[i] = new C6586g(c7149a.f34921b[i].f34924b, c7149a.f34921b[i].f34925c);
        }
    }

    public SecurePaymentsPayload(byte[] bArr, C6586g[] c6586gArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("opaqueToken must not be null");
        }
        this.f32709a = bArr;
        this.f32710b = c6586gArr;
        C7149a c7149a = new C7149a();
        c7149a.f34920a = bArr;
        int length = c6586gArr.length;
        c7149a.f34921b = new C7150b[length];
        for (int i = 0; i < length; i++) {
            c7149a.f34921b[i] = new C7150b();
            c7149a.f34921b[i].f34924b = c6586gArr[i].f32720a;
            c7149a.f34921b[i].f34925c = c6586gArr[i].f32721b;
        }
        this.f32711c = c7149a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m29885a(this.f32711c), 0);
    }
}
