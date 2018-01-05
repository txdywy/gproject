package com.google.android.finsky.verifier.impl;

import android.os.AsyncTask;

final class bv extends AsyncTask {
    public final /* synthetic */ bu f24483a;

    bv(bu buVar) {
        this.f24483a = buVar;
    }

    private final Void m22210a() {
        try {
            this.f24483a.f24482a.m22206b();
            return null;
        } finally {
            this.f24483a.f24482a.m22069l();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m22210a();
    }
}
