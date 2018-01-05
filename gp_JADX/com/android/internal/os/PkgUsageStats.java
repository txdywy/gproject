package com.android.internal.os;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PkgUsageStats implements Parcelable {
    public static final Creator CREATOR = new C0593a();
    public String f3926a;
    public int f3927b;
    public long f3928c;
    public Map f3929d;

    public String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String str = this.f3926a;
        return new StringBuilder((String.valueOf(toHexString).length() + 16) + String.valueOf(str).length()).append("PkgUsageStats{").append(toHexString).append(" ").append(str).append("}").toString();
    }

    public PkgUsageStats(Parcel parcel) {
        this.f3926a = parcel.readString();
        this.f3927b = parcel.readInt();
        this.f3928c = parcel.readLong();
        int readInt = parcel.readInt();
        this.f3929d = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f3929d.put(parcel.readString(), Long.valueOf(parcel.readLong()));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3926a);
        parcel.writeInt(this.f3927b);
        parcel.writeLong(this.f3928c);
        parcel.writeInt(this.f3929d.size());
        for (Entry entry : this.f3929d.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeLong(((Long) entry.getValue()).longValue());
        }
    }
}
