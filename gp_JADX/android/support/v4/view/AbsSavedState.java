package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AbsSavedState implements Parcelable {
    public static final Creator CREATOR = new C0341a();
    public static final AbsSavedState f541d = new C03311();
    public final Parcelable f542e;

    final class C03311 extends AbsSavedState {
        C03311() {
            super();
        }
    }

    private AbsSavedState() {
        this.f542e = null;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == f541d) {
            parcelable = null;
        }
        this.f542e = parcelable;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f541d;
        }
        this.f542e = readParcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f542e, i);
    }
}
