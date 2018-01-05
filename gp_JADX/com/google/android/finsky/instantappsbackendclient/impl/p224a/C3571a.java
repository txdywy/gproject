package com.google.android.finsky.instantappsbackendclient.impl.p224a;

import android.content.Context;
import android.database.Cursor;
import com.google.android.finsky.instantappsbackendclient.impl.C3570t;
import com.google.android.finsky.instantappsbackendclient.impl.ac;
import com.google.android.finsky.instantappsbackendclient.impl.af;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.instantapps.p288b.C5262b;
import com.google.e.a.a.a.a.a.e;
import com.google.protobuf.nano.C0757i;
import p002a.C0002a;

public final class C3571a implements C3570t {
    public final Context f17849a;
    public final C0002a f17850b;

    C3571a(Context context, C0002a c0002a) {
        this.f17849a = context;
        this.f17850b = c0002a;
    }

    public final af mo3544a(ac acVar) {
        byte[] bArr = null;
        C0757i c0757i = acVar.f17859b;
        if (c0757i instanceof e) {
            e eVar = (e) c0757i;
            Cursor query = this.f17849a.getContentResolver().query(C5262b.f26393a.buildUpon().appendPath("getAppSplits").appendQueryParameter("packageName", eVar.a.a).appendQueryParameter("versionCode", Integer.toString(-1)).build(), new String[]{"appSplits"}, null, null, null);
            if (query == null || !query.moveToFirst()) {
                FinskyLog.m21667d("Local package fetch failed, falling back to primary client", new Object[0]);
            } else {
                bArr = query.getBlob(0);
            }
            if (bArr != null) {
                return new C3572b(bArr);
            }
        }
        return ((C3570t) this.f17850b.mo1a()).mo3544a(acVar);
    }
}
