package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.support.v4.widget.DrawerLayout.SavedState;

final class C0392y implements ClassLoaderCreator {
    C0392y() {
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
