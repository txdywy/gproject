package com.google.android.gms.peerdownloadmanager.p292c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public final class C5360f extends Handler {
    public final /* synthetic */ C5355a f27893a;

    public C5360f(C5355a c5355a, Looper looper) {
        this.f27893a = c5355a;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f27893a.f27879l.mo4997i();
                C5355a c5355a = this.f27893a;
                Log.d("PDM", "schedule comms sessions for discovered peers with connect priority");
                for (C5361g c5361g : c5355a.f27883p.values()) {
                    if (c5361g.f27895b) {
                        c5361g.f27897d++;
                        c5355a.f27878k.m26331a(c5361g.f27894a);
                    }
                }
                return;
            default:
                return;
        }
    }
}
