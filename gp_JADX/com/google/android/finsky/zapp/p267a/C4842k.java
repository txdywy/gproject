package com.google.android.finsky.zapp.p267a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0021a;
import java.util.List;

public final class C4842k extends C0021a implements C4841j {
    public C4842k(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.zapp.protocol.IWearPlayModuleService");
    }

    public final String mo4413a(String str, List list) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeTypedList(list);
        obtainAndWriteInterfaceToken = transactAndReadException(2, obtainAndWriteInterfaceToken);
        String readString = obtainAndWriteInterfaceToken.readString();
        obtainAndWriteInterfaceToken.recycle();
        return readString;
    }
}
