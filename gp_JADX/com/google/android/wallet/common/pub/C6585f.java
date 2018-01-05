package com.google.android.wallet.common.pub;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.p443h.p447b.p448a.p449a.p450a.C7149a;

final class C6585f implements Creator {
    C6585f() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SecurePaymentsPayload[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SecurePaymentsPayload((C7149a) ParcelableProto.m29888a(parcel));
    }
}
