package com.google.android.finsky.installqueue;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.finsky.installer.p208b.p209a.C3312b;
import com.google.android.finsky.installer.p208b.p209a.C3316f;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import java.util.Arrays;

public final class InstallConstraint implements Parcelable {
    public static final Creator CREATOR = new C3358a();
    public static final InstallConstraint f17166a = new C3361d().m16799e();
    public static final C2918a f17167d = new C3359b();
    public static final C2918a f17168e = new C3360c();
    public final C3312b f17169b;
    public final TimeWindow f17170c;

    public InstallConstraint(C3312b c3312b) {
        this.f17169b = c3312b;
        this.f17170c = this.f17169b.f17121e != null ? new TimeWindow(this.f17169b.f17121e) : null;
    }

    public InstallConstraint(Parcel parcel) {
        this.f17169b = (C3312b) ParcelableProto.m21674a(parcel);
        this.f17170c = this.f17169b.f17121e != null ? new TimeWindow(this.f17169b.f17121e) : null;
    }

    InstallConstraint(C3312b c3312b, TimeWindow timeWindow) {
        C3316f c3316f;
        this.f17169b = c3312b;
        C3312b c3312b2 = this.f17169b;
        if (timeWindow != null) {
            c3316f = timeWindow.f17173a;
        } else {
            c3316f = null;
        }
        c3312b2.f17121e = c3316f;
        this.f17170c = timeWindow;
    }

    public final String m16701a() {
        String encodeToString = Base64.encodeToString(C0757i.m4909a(this.f17169b), 0);
        return new StringBuilder(String.valueOf(encodeToString).length() + 2).append("[").append(encodeToString).append("]").toString();
    }

    public final String toString() {
        return String.format("InstallConstraint[networkType: %d, requireCharging: %s, timeWindow: %s, deferred: %s, provisionState: %d, storage: %d, importanceThreshold: %d, authentication: %d, requireGearheadProjectionOff: %s]", new Object[]{Integer.valueOf(this.f17169b.f17119c), Boolean.valueOf(this.f17169b.f17120d), this.f17170c, Boolean.valueOf(this.f17169b.f17122f), Integer.valueOf(this.f17169b.f17123g), Integer.valueOf(this.f17169b.f17124h), Integer.valueOf(this.f17169b.f17126j), Integer.valueOf(this.f17169b.f17127k), Boolean.valueOf(this.f17169b.f17128l)});
    }

    public final int hashCode() {
        return Arrays.hashCode(C0757i.m4909a(this.f17169b));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InstallConstraint) {
            return C0757i.m4908a(this.f17169b, ((InstallConstraint) obj).f17169b);
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f17169b), 0);
    }
}
