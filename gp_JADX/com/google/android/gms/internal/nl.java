package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class nl extends ng implements nj {
    nl(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    public final Bundle mo4827a(Account account, String str, Bundle bundle) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) account);
        cw_.writeString(str);
        ni.m25194a(cw_, (Parcelable) bundle);
        Parcel a = m23094a(5, cw_);
        Bundle bundle2 = (Bundle) ni.m25192a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    public final Bundle mo4828a(Bundle bundle) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) bundle);
        Parcel a = m23094a(6, cw_);
        Bundle bundle2 = (Bundle) ni.m25192a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
