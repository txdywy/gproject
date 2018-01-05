package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C5126q extends ng implements C5110o {
    C5126q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account mo4608a() {
        Parcel a = m23094a(2, cw_());
        Account account = (Account) ni.m25192a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
