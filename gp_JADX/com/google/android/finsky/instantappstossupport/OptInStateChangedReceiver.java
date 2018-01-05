package com.google.android.finsky.instantappstossupport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.utils.FinskyLog;

public class OptInStateChangedReceiver extends BroadcastReceiver {
    public static final C4023a f17971b = new C4024b().m18839a(0).m18843b(0).m18837a();
    public bb f17972a;

    public OptInStateChangedReceiver() {
        ((C1397d) C3947d.m18649a(C1397d.class)).mo1859a(this);
    }

    public void onReceive(Context context, Intent intent) {
        FinskyLog.m21662b("OptInStateChangedReceiver onReceive", new Object[0]);
        if ("com.google.android.instantapps.OPT_IN_STATUS_CHANGED".equals(intent.getAction())) {
            this.f17972a.m18890a(8).m18888a(167103375, "Get opt in job", C3619a.class, f17971b, null).mo4398a(new C3622e());
            FinskyLog.m21662b("Scheduled AIA get opt in job", new Object[0]);
        }
    }
}
