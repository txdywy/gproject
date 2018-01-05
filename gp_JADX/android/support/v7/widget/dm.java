package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.widget.LinearLayoutManager.SavedState;

final class dm implements Creator {
    dm() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }
}
