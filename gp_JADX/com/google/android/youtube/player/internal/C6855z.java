package com.google.android.youtube.player.internal;

import android.os.Handler;
import android.os.Message;
import com.google.android.youtube.player.C6821b;

final class C6855z extends Handler {
    public final /* synthetic */ C6850x f33880a;

    C6855z(C6850x c6850x) {
        this.f33880a = c6850x;
    }

    public final void handleMessage(Message message) {
        if (message.what == 3) {
            this.f33880a.m31197a((C6821b) message.obj);
        } else if (message.what == 4) {
            synchronized (this.f33880a.f33868h) {
                if (this.f33880a.f33874n && this.f33880a.m31203f() && this.f33880a.f33868h.contains(message.obj)) {
                    ((aj) message.obj).mo5741a();
                }
            }
        } else if (message.what == 2 && !this.f33880a.m31203f()) {
        } else {
            if (message.what == 2 || message.what == 1) {
                Object obj;
                aa aaVar = (aa) message.obj;
                synchronized (aaVar) {
                    obj = aaVar.f33835a;
                }
                aaVar.mo5673a(obj);
            }
        }
    }
}
