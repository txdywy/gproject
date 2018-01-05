package com.google.android.finsky.verifier.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class C4755g extends Handler {
    public final /* synthetic */ C4752d f24677a;

    public C4755g(C4752d c4752d, Looper looper) {
        this.f24677a = c4752d;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f24677a.m22292a(false);
        }
    }
}
