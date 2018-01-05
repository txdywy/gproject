package com.google.android.finsky.flushlogs;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ae.C1182a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.TimeUnit;

public class C3129a {
    public Handler f16127a;
    public final Context f16128b;
    public final C1182a f16129c;
    public final C1461c f16130d;
    public final bb f16131e;
    public C3135h f16132f;

    public C3129a(Context context, C1182a c1182a, C1461c c1461c, bb bbVar) {
        this.f16128b = context;
        this.f16129c = c1182a;
        this.f16130d = c1461c;
        this.f16131e = bbVar;
    }

    private final Handler m16004d() {
        synchronized (C3129a.class) {
            if (this.f16127a == null) {
                this.f16127a = new Handler(Looper.getMainLooper());
            }
        }
        return this.f16127a;
    }

    private final Runnable m16005e() {
        return new C3130b(this);
    }

    public final void m16007a() {
        if (this.f16129c.m7134b()) {
            m16010c();
            m16008a(this.f16128b, ((Long) C0955b.fs.m28964b()).longValue());
            return;
        }
        m16004d().postDelayed(m16005e(), ((Long) C0955b.fq.m28964b()).longValue());
    }

    public final void m16009b() {
        m16008a(this.f16128b, 0);
    }

    public final void m16010c() {
        m16004d().removeCallbacks(m16005e());
        Context context = this.f16128b;
        if (((Long) C0954a.ax.m5760a()).longValue() > 0) {
            C0954a.ax.m5763a(Long.valueOf(0));
            if (this.f16130d.dj().mo2294a(12643154)) {
                m16006f().m16012a().m18887a(16161616).mo4398a(C4831h.f25111a);
            } else {
                ((AlarmManager) context.getSystemService("alarm")).cancel(C3129a.m16003a(context));
            }
        }
    }

    private static PendingIntent m16003a(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent(context, FlushLogsReceiver.class), 0);
    }

    final void m16008a(Context context, long j) {
        long longValue = ((Long) C0954a.ax.m5760a()).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (longValue <= 0 || longValue < currentTimeMillis) {
            longValue = currentTimeMillis + j;
            C0954a.ax.m5763a(Long.valueOf(((Long) C0955b.fu.m28964b()).longValue() + longValue));
            if (this.f16130d.dj().mo2294a(12643154)) {
                C3135h f = m16006f();
                if (!f.m16012a().m18889b(16161616)) {
                    FinskyLog.m21662b("Scheduling log flush.", new Object[0]);
                    f.m16012a().m18888a(16161616, "flush-logs", C3131d.class, new C4024b().m18839a(j).m18843b(TimeUnit.DAYS.toMillis(1)).m18838a(1).m18837a(), null).mo4398a(C3136i.f16142a);
                    return;
                }
                return;
            }
            ((AlarmManager) context.getSystemService("alarm")).set(0, longValue, C3129a.m16003a(context));
        }
    }

    private final C3135h m16006f() {
        if (this.f16132f == null) {
            this.f16132f = new C3135h(this.f16131e);
        }
        return this.f16132f;
    }
}
