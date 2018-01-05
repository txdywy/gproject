package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

public abstract class lg extends nh implements lf {
    public lg() {
        attachInterface(this, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo4796a((Status) ni.m25192a(parcel, Status.CREATOR), (PseudonymousIdToken) ni.m25192a(parcel, PseudonymousIdToken.CREATOR));
                break;
            case 2:
                ni.m25192a(parcel, Status.CREATOR);
                mo4795a();
                break;
            default:
                return false;
        }
        return true;
    }
}
