package com.google.android.finsky.cl;

import android.content.Context;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.installqueue.C2291q;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.utils.C4678i;
import com.google.wireless.android.finsky.dfe.l.a.a;
import com.squareup.leakcanary.C7582R;
import java.util.concurrent.TimeUnit;
import p002a.C0002a;

public final class C2292c implements C2291q {
    public final Context f11316a;
    public final C0002a f11317b;
    public final C0002a f11318c;
    public final C0002a f11319d;
    public final C4817d f11320e;

    public C2292c(Context context, C0002a c0002a, C0002a c0002a2, C0002a c0002a3, C4817d c4817d) {
        this.f11316a = context;
        this.f11317b = c0002a;
        this.f11318c = c0002a2;
        this.f11319d = c0002a3;
        this.f11320e = c4817d;
    }

    public final C4809e mo2835a(C3369m c3369m) {
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(C4678i.m21812a()) + TimeUnit.MINUTES.toSeconds((long) ((Integer) C0955b.ie.m28964b()).intValue());
        this.f11317b.mo1a();
        a a = C2289a.m11792a();
        if (a == null) {
            if (((Integer) C1789d.f9315b.m5760a()).intValue() == 4) {
                C1789d.f9315b.m5763a(Integer.valueOf(1));
            }
            m11795a(c3369m.f17274d, this.f11316a.getString(C7582R.string.offpeak_notification_not_available, new Object[]{c3369m.f17274d.f17171a.f17138h}), "err");
            return this.f11320e.mo4401a(null);
        }
        if (a.e < toSeconds) {
            a.b |= 4;
            a.e = toSeconds;
        }
        if ((a.e - TimeUnit.MILLISECONDS.toSeconds(C4678i.m21812a()) > TimeUnit.MINUTES.toSeconds((long) ((Integer) C0955b.f5893if.m28964b()).intValue()) ? 1 : 0) != 0) {
            m11795a(c3369m.f17274d, this.f11316a.getString(C7582R.string.offpeak_notification_reschedule, new Object[]{c3369m.f17274d.f17171a.f17138h}), "progress");
        }
        C4817d c4817d = this.f11320e;
        this.f11317b.mo1a();
        return c4817d.mo4401a(C2289a.m11791a(c3369m.f17274d, a));
    }

    private final void m11795a(InstallRequest installRequest, String str, String str2) {
        ((ab) this.f11318c.mo1a()).mo3792a(installRequest.f17171a.f17133c, null, null, str, (int) C7582R.mipmap.ic_launcher_play_store, ((C2162a) this.f11319d.mo1a()).mo2691a(installRequest.f17171a.f17133c, C1289l.m7694a(installRequest.f17171a.f17133c)), str2);
    }
}
