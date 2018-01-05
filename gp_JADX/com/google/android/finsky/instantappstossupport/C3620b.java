package com.google.android.finsky.instantappstossupport;

import android.os.AsyncTask;
import com.google.android.finsky.scheduler.ah;
import com.google.android.instantapps.common.gms.C5785k;
import p002a.C0002a;

final class C3620b extends AsyncTask {
    public final C0002a f17975a;
    public final ah f17976b;

    C3620b(C0002a c0002a, ah ahVar) {
        this.f17975a = c0002a;
        this.f17976b = ahVar;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        ((C5785k) this.f17975a.mo1a()).m27186a(new C3621c(this));
        return null;
    }
}
