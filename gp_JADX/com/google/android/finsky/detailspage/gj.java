package com.google.android.finsky.detailspage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraCredits;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraPrimary;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraSecondary;
import com.google.android.finsky.detailspage.TextModule.ExpandedData;
import java.util.ArrayList;

final class gj implements Creator {
    gj() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExpandedData[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ExpandedData expandedData = new ExpandedData();
        expandedData.f14123a = parcel.readInt();
        expandedData.f14124b = parcel.readString();
        expandedData.f14125c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.f14126d = parcel.readInt();
        expandedData.f14127e = parcel.readString();
        expandedData.f14128f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.f14129g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.f14130h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.f14131i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        expandedData.f14132j = parcel.readInt() == 1;
        expandedData.f14133k = parcel.readString();
        expandedData.f14134l = new ArrayList();
        parcel.readTypedList(expandedData.f14134l, DetailsExtraCredits.CREATOR);
        expandedData.f14135m = new ArrayList();
        parcel.readTypedList(expandedData.f14135m, DetailsExtraPrimary.CREATOR);
        expandedData.f14136n = new ArrayList();
        parcel.readTypedList(expandedData.f14136n, DetailsExtraSecondary.CREATOR);
        expandedData.f14137o = parcel.readString();
        return expandedData;
    }
}
