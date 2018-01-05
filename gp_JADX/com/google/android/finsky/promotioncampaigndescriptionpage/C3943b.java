package com.google.android.finsky.promotioncampaigndescriptionpage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.hm;
import com.google.android.finsky.promotioncampaigndescriptionpage.PromotionCampaignDescriptionData.PromotionCampaignDescriptionRow;
import com.google.android.finsky.utils.ParcelableProto;

final class C3943b implements Creator {
    C3943b() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PromotionCampaignDescriptionRow[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PromotionCampaignDescriptionRow((hm) ParcelableProto.m21674a(parcel));
    }
}
