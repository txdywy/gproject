package com.google.vr.p479a.p480a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;

public final class C7246i extends a implements C7245h {
    C7246i(IBinder iBinder) {
        super(iBinder, "com.google.vr.internal.lullaby.INativeEvent");
    }

    public final void mo6324a(String str, String str2, String str3) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void mo6321a(String str, int i, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void mo6322a(String str, long j, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeLong(j);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    public final void mo6320a(String str, float f, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeFloat(f);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    public final void mo6319a(String str, double d, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeDouble(d);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final void mo6325a(String str, boolean z, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        c.a(obtainAndWriteInterfaceToken, z);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    public final void mo6323a(String str, C7247j c7247j, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        c.a(obtainAndWriteInterfaceToken, c7247j);
        obtainAndWriteInterfaceToken.writeString(str2);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    public final String mo6318a(String str, String str2) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken = transactAndReadException(9, obtainAndWriteInterfaceToken);
        String readString = obtainAndWriteInterfaceToken.readString();
        obtainAndWriteInterfaceToken.recycle();
        return readString;
    }
}
