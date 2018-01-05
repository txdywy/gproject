package android.support.design.stateful;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class C0135a implements ClassLoaderCreator {
    C0135a() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ExtendableSavedState(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExtendableSavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExtendableSavedState(parcel, null);
    }
}
