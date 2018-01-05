package com.google.android.gms.common.api.internal;

import android.os.Build.VERSION;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

public abstract class C5057a {
    public abstract void mo4583a(Status status);

    public abstract void mo4584a(aq aqVar);

    public abstract void mo4585a(C5067h c5067h, boolean z);

    static /* synthetic */ Status m23287a(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        if (VERSION.SDK_INT >= 15 && (remoteException instanceof TransactionTooLargeException)) {
            stringBuilder.append("TransactionTooLargeException: ");
        }
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(8, stringBuilder.toString());
    }
}
