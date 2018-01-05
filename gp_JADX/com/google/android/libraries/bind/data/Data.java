package com.google.android.libraries.bind.data;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.libraries.bind.p325d.C5893b;

public final class Data implements Parcelable {
    public static final Creator CREATOR = new C5897f();
    public SparseArray f29416a;

    public static C5898g m27344a(int i) {
        return new C5898g(i);
    }

    public Data() {
        this((byte) 0);
    }

    private Data(byte b) {
        this.f29416a = new SparseArray(8);
    }

    public Data(SparseArray sparseArray) {
        if (VERSION.SDK_INT >= 14) {
            this.f29416a = sparseArray.clone();
            return;
        }
        this.f29416a = new SparseArray(sparseArray.size());
        m27345a(sparseArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            return this.f29416a.equals(((Data) obj).f29416a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29416a.hashCode();
    }

    private final void m27345a(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f29416a.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    @Deprecated
    public final boolean m27348b(int i) {
        return this.f29416a.get(i) != null;
    }

    public final boolean m27346a(C5898g c5898g) {
        return m27348b(c5898g.f29432a);
    }

    @Deprecated
    public final Object m27349c(int i) {
        Object obj = this.f29416a.get(i);
        if (obj instanceof C5901j) {
            return ((C5901j) obj).m27361a();
        }
        return obj;
    }

    public final Object m27347b(C5898g c5898g) {
        return m27349c(c5898g.f29432a);
    }

    @Deprecated
    public final Integer m27350d(int i) {
        Object c = m27349c(i);
        return c != null ? Integer.valueOf(((Number) c).intValue()) : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSparseArray(this.f29416a);
    }

    public final String toString() {
        if (this.f29416a.size() == 0) {
            return "Data is empty";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.f29416a.size(); i++) {
            int keyAt = this.f29416a.keyAt(i);
            Object valueAt = this.f29416a.valueAt(i);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" ");
            }
            String a = C5893b.m27341a(keyAt);
            String valueOf = String.valueOf(valueAt);
            stringBuilder.append(new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(valueOf).length()).append(a).append("=").append(valueOf).toString());
        }
        return stringBuilder.toString();
    }
}
