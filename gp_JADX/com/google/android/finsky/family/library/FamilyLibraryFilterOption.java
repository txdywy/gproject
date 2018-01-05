package com.google.android.finsky.family.library;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.play.utils.a.a;
import com.google.wireless.android.finsky.dfe.h.a.k;

public class FamilyLibraryFilterOption implements Parcelable {
    public static final Creator CREATOR = new C3054e();
    public final String f15918a;
    public final int[] f15919b;
    public final int f15920c;
    public final boolean f15921d;

    FamilyLibraryFilterOption(String str, int[] iArr, int i, boolean z) {
        this.f15918a = str;
        this.f15919b = iArr;
        this.f15920c = i;
        this.f15921d = z;
    }

    FamilyLibraryFilterOption(Parcel parcel) {
        this.f15918a = parcel.readString();
        this.f15919b = parcel.createIntArray();
        this.f15920c = parcel.readInt();
        this.f15921d = parcel.readByte() != (byte) 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15918a);
        parcel.writeIntArray(this.f15919b);
        parcel.writeInt(this.f15920c);
        parcel.writeInt(this.f15921d ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public final boolean m15707a(k kVar) {
        int i = kVar.c.f12098e;
        if (this.f15919b != null && this.f15919b.length > 0 && a.a(this.f15919b, i) < 0) {
            return false;
        }
        if (kVar.d == this.f15920c || kVar.d == 3 || this.f15920c == 3) {
            return true;
        }
        return false;
    }
}
