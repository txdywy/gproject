package com.google.android.finsky.packagemanager.impl;

import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;

final class C3864m extends AsyncTask {
    public final /* synthetic */ String f19266a;
    public final /* synthetic */ int f19267b;
    public final /* synthetic */ C3863l f19268c;

    C3864m(C3863l c3863l, String str, int i) {
        this.f19268c = c3863l;
        this.f19266a = str;
        this.f19267b = i;
    }

    private final Void m18349a() {
        try {
            Thread.sleep(this.f19268c.f19264a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21665c("Sleep interrupted in experiment", new Object[0]);
        }
        this.f19268c.f19265b.mo3826a(this.f19266a, this.f19267b);
        return null;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m18349a();
    }
}
