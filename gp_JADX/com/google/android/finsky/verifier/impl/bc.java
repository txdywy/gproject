package com.google.android.finsky.verifier.impl;

import android.os.AsyncTask;
import com.google.android.finsky.aa.C0955b;
import com.google.android.gms.safetynet.C5571a;

final class bc extends AsyncTask {
    public final /* synthetic */ int f24441a;
    public final /* synthetic */ bb f24442b;

    bc(bb bbVar, int i) {
        this.f24442b = bbVar;
        this.f24441a = i;
    }

    private final Void m22110a() {
        try {
            if (this.f24441a == 1 && ((Boolean) C0955b.cQ.m28964b()).booleanValue()) {
                C5571a.m26561a(this.f24442b.f24440g.f24418i).m26565a(2, null);
            }
            this.f24442b.f24440g.m22095a(this.f24442b.f24434a.packageName, this.f24442b.f24436c, this.f24442b.f24438e, this.f24442b.f24439f);
            return null;
        } finally {
            this.f24442b.f24440g.m22069l();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m22110a();
    }
}
