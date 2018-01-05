package android.support.design.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p037h.C0304u;
import android.support.v4.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Creator CREATOR = new C0135a();
    public final C0304u f543a;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f543a = new C0304u();
    }

    ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f543a = new C0304u(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f543a.put(strArr[i], bundleArr[i]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f543a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Parcelable[] parcelableArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f543a.m1629b(i2);
            parcelableArr[i2] = (Bundle) this.f543a.m1630c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(parcelableArr, 0);
    }

    public String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.f543a);
        return new StringBuilder((String.valueOf(toHexString).length() + 30) + String.valueOf(valueOf).length()).append("ExtendableSavedState{").append(toHexString).append(" states=").append(valueOf).append("}").toString();
    }
}
