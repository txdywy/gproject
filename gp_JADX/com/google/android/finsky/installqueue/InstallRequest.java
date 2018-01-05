package com.google.android.finsky.installqueue;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.installer.p208b.p209a.C3312b;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.p188a.C4668b;
import com.google.protobuf.nano.j;
import java.util.Arrays;
import java.util.List;

public final class InstallRequest implements Parcelable {
    public static final Creator CREATOR = new C3365i();
    public final C3314d f17171a;
    public final List f17172b;

    public final C3367k m16702a() {
        return new C3367k(this.f17171a.f17145o);
    }

    public final String[] m16703b() {
        if (this.f17171a.f17148r == null || this.f17171a.f17148r.length <= 0) {
            return null;
        }
        return (String[]) Arrays.copyOf(this.f17171a.f17148r, this.f17171a.f17148r.length);
    }

    InstallRequest(C3314d c3314d, List list) {
        this.f17171a = c3314d;
        this.f17172b = list;
        this.f17171a.f17135e = (C3312b[]) C4668b.m21678a(this.f17172b, InstallConstraint.f17167d).toArray(new C3312b[list.size()]);
    }

    public InstallRequest(C3314d c3314d) {
        this.f17171a = c3314d;
        this.f17172b = C4668b.m21679a(this.f17171a.f17135e, InstallConstraint.f17168e);
    }

    public InstallRequest(Parcel parcel) {
        this.f17171a = (C3314d) ParcelableProto.m21674a(parcel);
        this.f17172b = C4668b.m21679a(this.f17171a.f17135e, InstallConstraint.f17168e);
    }

    public final String toString() {
        return j.a(this.f17171a);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f17171a), 0);
    }
}
