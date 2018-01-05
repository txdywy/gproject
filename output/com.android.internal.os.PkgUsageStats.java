package com.android.internal.os;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public class PkgUsageStats implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public String a;
    public int b;
    public long c;
    public Map d;

    static {
        PkgUsageStats.CREATOR = new com.android.internal.os.a();
    }

    PkgUsageStats(Parcel p0) {
        this.a = p0.readString();
        this.b = p0.readInt();
        this.c = p0.readLong();
        v1 = p0.readInt();
        this.d = new HashMap(v1);
        v0 = 0;
        while (v0 < v1) {
            this.d.put(p0.readString(), Long.valueOf(p0.readLong()));
            v0 = v0 + 1;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        v0 = Integer.toHexString(System.identityHashCode(this));
        return (String.valueOf(v0).length() + 16 + String.valueOf(this.a).length()) + "PkgUsageStats{" + v0 + " " + this.a + "}";
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeString(this.a);
        p0.writeInt(this.b);
        p0.writeLong(this.c);
        p0.writeInt(this.d.size());
        v2 = this.d.entrySet().iterator();
        while (v2.hasNext()) {
            v0 = (Map$Entry)v2.next();
            p0.writeString((String)v0.getKey());
            p0.writeLong(((Long)v0.getValue()).longValue());
        }
    }

}
