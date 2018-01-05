package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
final class C5097c extends Handler {
    public final Context f25940a;
    public /* synthetic */ C5096b f25941b;

    public C5097c(C5096b c5096b, Context context) {
        this.f25941b = c5096b;
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f25940a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                int a = C5095d.m23655a(this.f25940a);
                if (C5095d.m23658a(a)) {
                    C5096b c5096b = this.f25941b;
                    Context context = this.f25940a;
                    c5096b.m23670a(context, a, C5095d.m23660b(context, a, "n"));
                    return;
                }
                return;
            default:
                Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
                return;
        }
    }
}
