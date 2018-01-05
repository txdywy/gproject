package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class mz extends nh implements my {
    public mz() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 3:
                ni.m25192a(parcel, ConnectionResult.CREATOR);
                ni.m25192a(parcel, zzecs.CREATOR);
                break;
            case 4:
                ni.m25192a(parcel, Status.CREATOR);
                break;
            case 6:
                ni.m25192a(parcel, Status.CREATOR);
                break;
            case 7:
                ni.m25192a(parcel, Status.CREATOR);
                ni.m25192a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo4589a((zzedc) ni.m25192a(parcel, zzedc.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
