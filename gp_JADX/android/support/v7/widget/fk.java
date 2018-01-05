package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.support.v7.widget.RecyclerView.SavedState;

final class fk implements ClassLoaderCreator {
    fk() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SavedState(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel, null);
    }
}
