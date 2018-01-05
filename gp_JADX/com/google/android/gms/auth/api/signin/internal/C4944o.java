package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class C4944o extends nh implements C4943n {
    public C4944o() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 101:
                ni.m25192a(parcel, GoogleSignInAccount.CREATOR);
                ni.m25192a(parcel, Status.CREATOR);
                mo4474a();
                break;
            case 102:
                ni.m25192a(parcel, Status.CREATOR);
                mo4476b();
                break;
            case 103:
                mo4475a((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
