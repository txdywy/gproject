package com.google.android.finsky.adapters;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter.ItemEntry;

final class C1160d implements Creator {
    C1160d() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ItemEntry[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        ItemEntry itemEntry = new ItemEntry();
        itemEntry.f7093a = readInt;
        itemEntry.f7094b = readInt2;
        itemEntry.f7095c = readInt3;
        itemEntry.f7096d = readInt4;
        itemEntry.f7097e = readInt5;
        return itemEntry;
    }
}
