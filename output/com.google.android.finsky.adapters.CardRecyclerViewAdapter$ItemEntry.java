package com.google.android.finsky.adapters;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class CardRecyclerViewAdapter$ItemEntry implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        CardRecyclerViewAdapter$ItemEntry.CREATOR = new com.google.android.finsky.adapters.d();
    }

    CardRecyclerViewAdapter$ItemEntry() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }

    public final boolean a() {
        if (this.c == 6)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeInt(this.a);
        p0.writeInt(this.b);
        p0.writeInt(this.c);
        p0.writeInt(this.d);
        p0.writeInt(this.e);
    }

}
