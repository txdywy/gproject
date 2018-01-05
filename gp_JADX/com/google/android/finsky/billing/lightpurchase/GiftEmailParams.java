package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class GiftEmailParams implements Parcelable {
    public static final Creator CREATOR = new C1960s();
    public final String f9633a;
    public final String f9634b;
    public final String f9635c;

    public GiftEmailParams(C1961t c1961t) {
        this.f9633a = c1961t.f9969a;
        if (TextUtils.isEmpty(this.f9633a)) {
            throw new IllegalArgumentException("senderName cannot be empty");
        }
        this.f9634b = c1961t.f9970b;
        if (TextUtils.isEmpty(this.f9634b)) {
            throw new IllegalArgumentException("recipientEmailAddress cannot be empty");
        }
        this.f9635c = c1961t.f9971c;
    }

    GiftEmailParams(Parcel parcel) {
        this.f9633a = parcel.readString();
        this.f9634b = parcel.readString();
        this.f9635c = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9633a);
        parcel.writeString(this.f9634b);
        parcel.writeString(this.f9635c);
    }
}
