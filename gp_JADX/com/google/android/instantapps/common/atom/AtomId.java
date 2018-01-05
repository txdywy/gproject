package com.google.android.instantapps.common.atom;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.instantapps.p309a.C5699f;
import java.util.Arrays;

public class AtomId implements Parcelable {
    public static final Creator CREATOR = new C5701a();
    public final String f28855a;
    public final String f28856b;

    public AtomId(String str, String str2) {
        this.f28855a = (String) C5699f.m26959a((Object) str);
        this.f28856b = (String) C5699f.m26959a((Object) str2);
    }

    protected AtomId(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        parcel.readString();
    }

    public String toString() {
        String str = this.f28855a;
        String str2 = this.f28856b;
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtomId)) {
            return false;
        }
        AtomId atomId = (AtomId) obj;
        if (TextUtils.equals(this.f28855a, atomId.f28855a) && TextUtils.equals(this.f28856b, atomId.f28856b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28855a, this.f28856b});
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28855a);
        parcel.writeString(this.f28856b);
        parcel.writeString(null);
    }
}
