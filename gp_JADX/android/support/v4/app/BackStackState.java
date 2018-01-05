package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator CREATOR = new C0247l();
    public final int[] f1254a;
    public final int f1255b;
    public final int f1256c;
    public final String f1257d;
    public final int f1258e;
    public final int f1259f;
    public final CharSequence f1260g;
    public final int f1261h;
    public final CharSequence f1262i;
    public final ArrayList f1263j;
    public final ArrayList f1264k;
    public final boolean f1265l;

    public BackStackState(C0245j c0245j) {
        int size = c0245j.f1558b.size();
        this.f1254a = new int[(size * 6)];
        if (c0245j.f1565i) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C0246k c0246k = (C0246k) c0245j.f1558b.get(i2);
                int i3 = i + 1;
                this.f1254a[i] = c0246k.f1578a;
                int i4 = i3 + 1;
                this.f1254a[i3] = c0246k.f1579b != null ? c0246k.f1579b.f758o : -1;
                int i5 = i4 + 1;
                this.f1254a[i4] = c0246k.f1580c;
                i3 = i5 + 1;
                this.f1254a[i5] = c0246k.f1581d;
                i5 = i3 + 1;
                this.f1254a[i3] = c0246k.f1582e;
                i = i5 + 1;
                this.f1254a[i5] = c0246k.f1583f;
            }
            this.f1255b = c0245j.f1563g;
            this.f1256c = c0245j.f1564h;
            this.f1257d = c0245j.f1567k;
            this.f1258e = c0245j.f1569m;
            this.f1259f = c0245j.f1570n;
            this.f1260g = c0245j.f1571o;
            this.f1261h = c0245j.f1572p;
            this.f1262i = c0245j.f1573q;
            this.f1263j = c0245j.f1574r;
            this.f1264k = c0245j.f1575s;
            this.f1265l = c0245j.f1576t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackState(Parcel parcel) {
        this.f1254a = parcel.createIntArray();
        this.f1255b = parcel.readInt();
        this.f1256c = parcel.readInt();
        this.f1257d = parcel.readString();
        this.f1258e = parcel.readInt();
        this.f1259f = parcel.readInt();
        this.f1260g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1261h = parcel.readInt();
        this.f1262i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1263j = parcel.createStringArrayList();
        this.f1264k = parcel.createStringArrayList();
        this.f1265l = parcel.readInt() != 0;
    }

    public final C0245j m1139a(ae aeVar) {
        int i = 0;
        C0245j c0245j = new C0245j(aeVar);
        int i2 = 0;
        while (i < this.f1254a.length) {
            C0246k c0246k = new C0246k();
            int i3 = i + 1;
            c0246k.f1578a = this.f1254a[i];
            if (ae.f1296a) {
                Log.v("FragmentManager", "Instantiate " + c0245j + " op #" + i2 + " base fragment #" + this.f1254a[i3]);
            }
            int i4 = i3 + 1;
            i = this.f1254a[i3];
            if (i >= 0) {
                c0246k.f1579b = (Fragment) aeVar.f1307f.get(i);
            } else {
                c0246k.f1579b = null;
            }
            i3 = i4 + 1;
            c0246k.f1580c = this.f1254a[i4];
            i4 = i3 + 1;
            c0246k.f1581d = this.f1254a[i3];
            i3 = i4 + 1;
            c0246k.f1582e = this.f1254a[i4];
            i4 = i3 + 1;
            c0246k.f1583f = this.f1254a[i3];
            c0245j.f1559c = c0246k.f1580c;
            c0245j.f1560d = c0246k.f1581d;
            c0245j.f1561e = c0246k.f1582e;
            c0245j.f1562f = c0246k.f1583f;
            c0245j.m1468a(c0246k);
            i2++;
            i = i4;
        }
        c0245j.f1563g = this.f1255b;
        c0245j.f1564h = this.f1256c;
        c0245j.f1567k = this.f1257d;
        c0245j.f1569m = this.f1258e;
        c0245j.f1565i = true;
        c0245j.f1570n = this.f1259f;
        c0245j.f1571o = this.f1260g;
        c0245j.f1572p = this.f1261h;
        c0245j.f1573q = this.f1262i;
        c0245j.f1574r = this.f1263j;
        c0245j.f1575s = this.f1264k;
        c0245j.f1576t = this.f1265l;
        c0245j.m1467a(1);
        return c0245j;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeIntArray(this.f1254a);
        parcel.writeInt(this.f1255b);
        parcel.writeInt(this.f1256c);
        parcel.writeString(this.f1257d);
        parcel.writeInt(this.f1258e);
        parcel.writeInt(this.f1259f);
        TextUtils.writeToParcel(this.f1260g, parcel, 0);
        parcel.writeInt(this.f1261h);
        TextUtils.writeToParcel(this.f1262i, parcel, 0);
        parcel.writeStringList(this.f1263j);
        parcel.writeStringList(this.f1264k);
        if (this.f1265l) {
            i2 = 1;
        }
        parcel.writeInt(i2);
    }
}
