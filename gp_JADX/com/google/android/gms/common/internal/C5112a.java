package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public final class C5112a extends C5111p {
    public static Account m23714a(C5110o c5110o) {
        Account account = null;
        if (c5110o != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = c5110o.mo4608a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final Account mo4608a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
