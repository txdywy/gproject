package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentState implements Parcelable {
    public static final Creator CREATOR = new av();
    public final String f1271a;
    public final int f1272b;
    public final boolean f1273c;
    public final int f1274d;
    public final int f1275e;
    public final String f1276f;
    public final boolean f1277g;
    public final boolean f1278h;
    public final Bundle f1279i;
    public final boolean f1280j;
    public Bundle f1281k;
    public Fragment f1282l;

    FragmentState(Fragment fragment) {
        this.f1271a = fragment.getClass().getName();
        this.f1272b = fragment.f758o;
        this.f1273c = fragment.f766w;
        this.f1274d = fragment.f735G;
        this.f1275e = fragment.f736H;
        this.f1276f = fragment.f737I;
        this.f1277g = fragment.f740L;
        this.f1278h = fragment.f739K;
        this.f1279i = fragment.f760q;
        this.f1280j = fragment.f738J;
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f1271a = parcel.readString();
        this.f1272b = parcel.readInt();
        this.f1273c = parcel.readInt() != 0;
        this.f1274d = parcel.readInt();
        this.f1275e = parcel.readInt();
        this.f1276f = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1277g = z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1278h = z;
        this.f1279i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z2 = false;
        }
        this.f1280j = z2;
        this.f1281k = parcel.readBundle();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeString(this.f1271a);
        parcel.writeInt(this.f1272b);
        parcel.writeInt(this.f1273c ? 1 : 0);
        parcel.writeInt(this.f1274d);
        parcel.writeInt(this.f1275e);
        parcel.writeString(this.f1276f);
        if (this.f1277g) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (this.f1278h) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f1279i);
        if (!this.f1280j) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeBundle(this.f1281k);
    }
}
