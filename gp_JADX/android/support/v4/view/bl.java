package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.support.v4.view.ViewPager.SavedState;

final class bl implements ClassLoaderCreator {
    bl() {
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
