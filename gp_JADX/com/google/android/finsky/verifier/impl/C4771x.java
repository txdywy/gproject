package com.google.android.finsky.verifier.impl;

import android.os.AsyncTask;

final class C4771x extends AsyncTask {
    public final /* synthetic */ C4770w f24720a;

    C4771x(C4770w c4770w) {
        this.f24720a = c4770w;
    }

    private final Void m22382a() {
        try {
            this.f24720a.f24719a.m22380b();
            return null;
        } finally {
            this.f24720a.f24719a.m22069l();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m22382a();
    }
}
