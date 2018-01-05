package com.google.vr.p482b.p483a.p484a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.PersistableBundle;
import com.google.android.a.a;
import com.google.android.a.c;
import com.google.vr.p479a.p480a.C7247j;

public final class C7254d extends a implements C7251b {
    C7254d(IBinder iBinder) {
        super(iBinder, "com.google.vr.libraries.payments.api.IActivityDelegate");
    }

    public final void mo6326a() {
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
    }

    public final void mo6328a(int i, int i2, Intent intent) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        c.a(obtainAndWriteInterfaceToken, intent);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void mo6334b() {
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
    }

    public final void mo6338c() {
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
    }

    public final void mo6332a(C7247j c7247j) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, c7247j);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final void mo6329a(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    public final void mo6330a(Bundle bundle, PersistableBundle persistableBundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        c.a(obtainAndWriteInterfaceToken, persistableBundle);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    public final void mo6341d() {
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken());
    }

    public final void mo6343e() {
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken());
    }

    public final void mo6344f() {
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken());
    }

    public final void mo6345g() {
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken());
    }

    public final void mo6346h() {
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken());
    }

    public final void mo6335b(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
    }

    public final void mo6336b(Bundle bundle, PersistableBundle persistableBundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        c.a(obtainAndWriteInterfaceToken, persistableBundle);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    public final void mo6347i() {
        transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken());
    }

    public final void mo6348j() {
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken());
    }

    public final void mo6339c(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
    }

    public final void mo6340c(Bundle bundle, PersistableBundle persistableBundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        c.a(obtainAndWriteInterfaceToken, persistableBundle);
        transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
    }

    public final void mo6349k() {
        transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken());
    }

    public final void mo6342d(Bundle bundle) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        obtainAndWriteInterfaceToken = transactAndReadException(21, obtainAndWriteInterfaceToken);
        if (obtainAndWriteInterfaceToken.readInt() != 0) {
            bundle.readFromParcel(obtainAndWriteInterfaceToken);
        }
        obtainAndWriteInterfaceToken.recycle();
    }

    public final void mo6331a(Bundle bundle, C7247j c7247j) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, bundle);
        c.a(obtainAndWriteInterfaceToken, c7247j);
        obtainAndWriteInterfaceToken = transactAndReadException(22, obtainAndWriteInterfaceToken);
        if (obtainAndWriteInterfaceToken.readInt() != 0) {
            bundle.readFromParcel(obtainAndWriteInterfaceToken);
        }
        obtainAndWriteInterfaceToken.recycle();
    }

    public final void mo6350l() {
        transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken());
    }

    public final void mo6351m() {
        transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken());
    }

    public final void mo6327a(int i) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
    }

    public final void mo6337b(C7247j c7247j) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, c7247j);
        transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
    }

    public final void mo6333a(boolean z) {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        c.a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
    }
}
