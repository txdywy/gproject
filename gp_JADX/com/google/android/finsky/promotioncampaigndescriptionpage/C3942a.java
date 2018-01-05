package com.google.android.finsky.promotioncampaigndescriptionpage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C3942a implements Creator {
    C3942a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PromotionCampaignDescriptionData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PromotionCampaignDescriptionData(parcel);
    }
}
