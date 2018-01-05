package com.android.vending.setup;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class RestoreConfig implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final long b;
    public final Account[] c;

    static {
        RestoreConfig.CREATOR = new com.android.vending.setup.e();
    }

    RestoreConfig(Parcel p0) {
        this.a = p0.readInt();
        this.b = p0.readLong();
        this.c = (Account[])p0.createTypedArray(Account.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeInt(this.a);
        p0.writeLong(this.b);
        p0.writeTypedArray(this.c, p1);
    }

}
