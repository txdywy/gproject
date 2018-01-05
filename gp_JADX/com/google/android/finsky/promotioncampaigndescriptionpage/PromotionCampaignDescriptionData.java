package com.google.android.finsky.promotioncampaigndescriptionpage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.hm;
import com.google.android.finsky.utils.ParcelableProto;
import java.util.ArrayList;
import java.util.List;

public class PromotionCampaignDescriptionData implements Parcelable {
    public static final Creator CREATOR = new C3942a();
    public final int f19932a;
    public final List f19933b;

    public class PromotionCampaignDescriptionRow implements Parcelable {
        public static final Creator CREATOR = new C3943b();
        public final hm f19931a;

        public PromotionCampaignDescriptionRow(hm hmVar) {
            this.f19931a = hmVar;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(ParcelableProto.m21671a(this.f19931a), 0);
        }
    }

    public PromotionCampaignDescriptionData(int i, List list) {
        this.f19932a = i;
        this.f19933b = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19932a);
        parcel.writeTypedList(this.f19933b);
    }

    PromotionCampaignDescriptionData(Parcel parcel) {
        this.f19932a = parcel.readInt();
        this.f19933b = new ArrayList();
        parcel.readTypedList(this.f19933b, PromotionCampaignDescriptionRow.CREATOR);
    }
}
