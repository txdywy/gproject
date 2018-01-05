package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;

public class GiftEmailParams implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;

    static {
        GiftEmailParams.CREATOR = new com.google.android.finsky.billing.lightpurchase.s();
    }

    GiftEmailParams(Parcel p0) {
        this.a = p0.readString();
        this.b = p0.readString();
        this.c = p0.readString();
    }

    GiftEmailParams(com.google.android.finsky.billing.lightpurchase.t p0) {
        this.a = p0.a;
        if (TextUtils.isEmpty(this.a))
            throw new IllegalArgumentException("senderName cannot be empty");
        this.b = p0.b;
        if (TextUtils.isEmpty(this.b))
            throw new IllegalArgumentException("recipientEmailAddress cannot be empty");
        this.c = p0.c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        p0.writeString(this.a);
        p0.writeString(this.b);
        p0.writeString(this.c);
    }

}
