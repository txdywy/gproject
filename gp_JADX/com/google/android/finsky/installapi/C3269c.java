package com.google.android.finsky.installapi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;

public final class C3269c extends C0021a implements C3267a {
    public C3269c(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.installapi.IPlayInstallService");
    }

    public final Bundle mo3401a(String str, String str2, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        Bundle bundle2 = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }

    public final Bundle mo3400a(String str, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, ResultReceiver resultReceiver) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) parcelFileDescriptor);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) resultReceiver);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        Bundle bundle2 = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }

    public final Bundle mo3399a(String str, Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        Bundle bundle2 = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }
}
