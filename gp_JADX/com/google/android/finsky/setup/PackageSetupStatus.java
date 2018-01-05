package com.google.android.finsky.setup;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.setup.p243c.C4140b;
import com.google.android.finsky.utils.ParcelableProto;

public class PackageSetupStatus implements Parcelable {
    public static final Creator CREATOR = new C4179l();
    public C4140b f20546a;

    public PackageSetupStatus(String str, String str2, int i, String str3, int i2, String str4, boolean z, String str5, boolean z2, int i3, es esVar) {
        C4140b c4140b = new C4140b();
        c4140b.f20887a |= 4;
        c4140b.f20890d = i;
        c4140b.f20887a |= 32;
        c4140b.f20893g = i2;
        c4140b.f20887a |= 128;
        c4140b.f20895i = z;
        c4140b.f20887a |= 512;
        c4140b.f20897k = z2;
        this.f20546a = c4140b.m19373a(i3);
        if (!TextUtils.isEmpty(str)) {
            c4140b = this.f20546a;
            if (str == null) {
                throw new NullPointerException();
            }
            c4140b.f20887a |= 8;
            c4140b.f20891e = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            c4140b = this.f20546a;
            if (str2 == null) {
                throw new NullPointerException();
            }
            c4140b.f20887a |= 2;
            c4140b.f20889c = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            c4140b = this.f20546a;
            if (str3 == null) {
                throw new NullPointerException();
            }
            c4140b.f20887a |= 16;
            c4140b.f20892f = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            c4140b = this.f20546a;
            if (str4 == null) {
                throw new NullPointerException();
            }
            c4140b.f20887a |= 64;
            c4140b.f20894h = str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            c4140b = this.f20546a;
            if (str5 == null) {
                throw new NullPointerException();
            }
            c4140b.f20887a |= 256;
            c4140b.f20896j = str5;
        }
        if (esVar != null) {
            this.f20546a.f20899m = esVar;
        }
    }

    protected PackageSetupStatus(Parcel parcel) {
        this.f20546a = (C4140b) ParcelableProto.m21674a(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f20546a), i);
    }

    public int describeContents() {
        return 0;
    }

    public final String m19066a() {
        if (((this.f20546a.f20887a & 2) != 0 ? 1 : null) != null) {
            return this.f20546a.f20889c;
        }
        return null;
    }

    public final String m19068b() {
        if (((this.f20546a.f20887a & 8) != 0 ? 1 : null) != null) {
            return this.f20546a.f20891e;
        }
        return null;
    }

    public final String m19069c() {
        if (((this.f20546a.f20887a & 16) != 0 ? 1 : null) != null) {
            return this.f20546a.f20892f;
        }
        return null;
    }

    public final String m19070d() {
        if (((this.f20546a.f20887a & 64) != 0 ? 1 : null) != null) {
            return this.f20546a.f20894h;
        }
        return null;
    }

    public final String m19071e() {
        if (((this.f20546a.f20887a & 256) != 0 ? 1 : null) != null) {
            return this.f20546a.f20896j;
        }
        return null;
    }

    public final void m19067a(int i) {
        C4140b c4140b = this.f20546a;
        c4140b.f20887a |= 1;
        c4140b.f20888b = i;
    }
}
