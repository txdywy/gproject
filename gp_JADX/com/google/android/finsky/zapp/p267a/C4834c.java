package com.google.android.finsky.zapp.p267a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0021a;
import com.google.android.p008a.C0883c;
import java.util.List;

public final class C4834c extends C0021a implements C4832a {
    public C4834c(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.zapp.protocol.IDynamicModuleDownloader");
    }

    public final Bundle mo4406a(List list) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeTypedList(list);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        Bundle bundle = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    public final Bundle mo4407b(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        Bundle bundle2 = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }

    public final Bundle mo4405a(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        Bundle bundle2 = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }

    public final Bundle mo4408c(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        Bundle bundle2 = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }

    public final Bundle mo4404a(long j) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
        Bundle bundle = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    public final Bundle mo4409d(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C0883c.m5515a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
        Bundle bundle2 = (Bundle) C0883c.m5513a(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle2;
    }
}
