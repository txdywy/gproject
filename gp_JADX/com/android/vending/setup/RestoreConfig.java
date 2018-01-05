package com.android.vending.setup;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RestoreConfig implements Parcelable {
    public static final Creator CREATOR = new C0652e();
    public final int f4019a;
    public final long f4020b;
    public final Account[] f4021c;

    protected RestoreConfig(Parcel parcel) {
        this.f4019a = parcel.readInt();
        this.f4020b = parcel.readLong();
        this.f4021c = (Account[]) parcel.createTypedArray(Account.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4019a);
        parcel.writeLong(this.f4020b);
        parcel.writeTypedArray(this.f4021c, i);
    }
}
