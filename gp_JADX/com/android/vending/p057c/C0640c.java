package com.android.vending.p057c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C0640c extends C0021a implements C0638a {
    public C0640c(IBinder iBinder) {
        super(iBinder, "com.android.vending.contentfilters.IContentFiltersService");
    }

    public final Bundle mo1051a(int[] iArr) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeIntArray(iArr);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        Bundle bundle = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }
}
