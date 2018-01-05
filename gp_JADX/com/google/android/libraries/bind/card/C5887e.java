package com.google.android.libraries.bind.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.bind.card.BindRecyclerView.SavedState;

final class C5887e implements Creator {
    C5887e() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }
}
