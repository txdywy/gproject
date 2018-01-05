package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
    public static final Creator CREATOR = new au();
    public FragmentState[] f1266a;
    public int[] f1267b;
    public BackStackState[] f1268c;
    public int f1269d = -1;
    public int f1270e;

    public FragmentManagerState(Parcel parcel) {
        this.f1266a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f1267b = parcel.createIntArray();
        this.f1268c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1269d = parcel.readInt();
        this.f1270e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1266a, i);
        parcel.writeIntArray(this.f1267b);
        parcel.writeTypedArray(this.f1268c, i);
        parcel.writeInt(this.f1269d);
        parcel.writeInt(this.f1270e);
    }
}
