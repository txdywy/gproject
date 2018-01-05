package com.google.android.instantapps.common.atom;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.instantapps.p309a.C5698e;
import java.util.Arrays;
import java.util.Locale;

public class AtomReference implements Parcelable {
    public static final Creator CREATOR = new C5702b();
    public final AtomId f28857a;
    public final int f28858b;
    public final String f28859c;
    public final byte[] f28860d;
    public final int f28861e;
    public final byte[] f28862f;
    public final boolean f28863g;

    public AtomReference(AtomId atomId, String str, byte[] bArr) {
        this.f28857a = atomId;
        this.f28858b = 0;
        this.f28859c = str;
        this.f28860d = null;
        this.f28861e = 0;
        this.f28862f = bArr;
        this.f28863g = false;
    }

    AtomReference(Parcel parcel) {
        this.f28857a = (AtomId) parcel.readParcelable(AtomId.class.getClassLoader());
        this.f28859c = parcel.readString();
        this.f28860d = parcel.createByteArray();
        this.f28861e = parcel.readInt();
        this.f28862f = parcel.createByteArray();
        this.f28863g = parcel.readInt() != 0;
        this.f28858b = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtomReference)) {
            return false;
        }
        AtomReference atomReference = (AtomReference) obj;
        if (C5698e.m26958a(this.f28857a, atomReference.f28857a) && this.f28858b == atomReference.f28858b && C5698e.m26958a(this.f28859c, atomReference.f28859c) && Arrays.equals(this.f28860d, atomReference.f28860d) && this.f28861e == atomReference.f28861e && Arrays.equals(this.f28862f, atomReference.f28862f) && this.f28863g == atomReference.f28863g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28859c, this.f28857a, Integer.valueOf(this.f28858b), Integer.valueOf(Arrays.hashCode(this.f28860d)), Integer.valueOf(this.f28861e)});
    }

    public String toString() {
        return String.format(Locale.US, "AtomReference { atomId=%s, versionCode=%d, downloadUrl=%s, atomSizeBytes=%d }", new Object[]{this.f28857a, Integer.valueOf(this.f28858b), this.f28859c, Integer.valueOf(this.f28861e)});
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeParcelable(this.f28857a, 0);
        parcel.writeString(this.f28859c);
        parcel.writeByteArray(this.f28860d);
        parcel.writeInt(this.f28861e);
        parcel.writeByteArray(this.f28862f);
        if (this.f28863g) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f28858b);
    }
}
