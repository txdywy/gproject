package com.google.android.finsky.simhandler;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.hygiene.C3178v;
import com.google.android.finsky.p109w.C0989a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.setup.C4141c;
import com.google.android.finsky.utils.FinskyLog;

public class SimStateReceiver extends C0989a {
    public final Handler f21127a;
    public C4141c f21128b;
    public C1461c f21129c;
    public C3178v f21130d;
    public boolean f21131e;
    public boolean f21132f;

    SimStateReceiver(Handler handler) {
        this.f21127a = handler;
    }

    public SimStateReceiver() {
        this(new Handler(Looper.getMainLooper()));
    }

    public final void mo1179a() {
        ((C1415a) C3947d.m18649a(C1415a.class)).mo1910a(this);
        this.f21131e = this.f21129c.dj().mo2294a(12636541);
        this.f21132f = this.f21129c.dj().mo2294a(12643590);
    }

    public final void mo1180a(Context context, Intent intent) {
        if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
            if (this.f21132f) {
                this.f21127a.removeCallbacks(null);
            }
            String stringExtra = intent.getStringExtra("ss");
            FinskyLog.m21659a("%s {extra=%s}", "android.intent.action.SIM_STATE_CHANGED", stringExtra);
            if (stringExtra == null) {
                return;
            }
            if (stringExtra.equals("LOADED")) {
                if (this.f21132f) {
                    this.f21127a.postDelayed(new C4195b(this), ((Long) C0955b.jD.m28964b()).longValue());
                }
                if (this.f21131e) {
                    m19532a(context).m19382a(C4141c.f20901a, C4141c.f20902b);
                }
            } else if (this.f21131e) {
                C4141c a = m19532a(context);
                a.f20907g.cancel(65023);
                a.m19384b();
            }
        }
    }

    private final C4141c m19532a(Context context) {
        if (this.f21128b == null) {
            this.f21128b = new C4141c(context);
        }
        return this.f21128b;
    }
}
