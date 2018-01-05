package com.google.android.finsky.verifier.impl.p261b;

import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;

final class C4742b extends AsyncTask {
    public final /* synthetic */ C4740a f24426a;

    C4742b(C4740a c4740a) {
        this.f24426a = c4740a;
    }

    private final Void m22101a() {
        try {
            if (!this.f24426a.mo4343a()) {
            }
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Unexpected exception on background thread", new Object[0]);
        } finally {
            this.f24426a.m22069l();
        }
        return null;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m22101a();
    }
}
