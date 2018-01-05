package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class C0341a implements ClassLoaderCreator {
    C0341a() {
    }

    private static AbsSavedState m1791a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.f541d;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return C0341a.m1791a(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AbsSavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0341a.m1791a(parcel, null);
    }
}
