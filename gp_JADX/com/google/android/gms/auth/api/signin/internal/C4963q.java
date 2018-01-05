package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C4963q extends ng implements C4962p {
    C4963q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void mo4497a(C4943n c4943n, GoogleSignInOptions googleSignInOptions) {
        Parcel cw_ = cw_();
        ni.m25193a(cw_, (IInterface) c4943n);
        ni.m25194a(cw_, (Parcelable) googleSignInOptions);
        m23095b(103, cw_);
    }
}
