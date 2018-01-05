package com.google.android.libraries.bind.data;

import android.support.v7.widget.bi;
import android.support.v7.widget.em;
import android.support.v7.widget.eo;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.card.C5892j;
import com.google.android.libraries.bind.p323a.C5855a;
import com.google.android.libraries.bind.p323a.C5860f;
import com.google.android.libraries.bind.p324c.C5875b;
import com.google.android.libraries.bind.p325d.C5893b;
import java.util.Locale;

public class C5905o extends em {
    public static final C5875b f29441c = C5875b.m27305a(C5905o.class);
    public final C5907q f29442d;
    public C5909s f29443e;
    public C5909s f29444f;
    public C5909s f29445g;
    public boolean f29446h;
    public boolean f29447i;
    public boolean f29448j;
    public C5899h f29449k;
    public C5908r f29450l;
    public boolean f29451m;
    public boolean f29452n;

    public C5905o() {
        this((byte) 0);
    }

    private C5905o(byte b) {
        this.f29443e = C5909s.f29454b;
        this.f29444f = C5909s.f29453a;
        this.f29445g = C5909s.f29455c;
        this.f29446h = true;
        this.f29447i = true;
        this.f29448j = true;
        C5903m c5903m = new C5903m();
        super.b_(true);
        this.f29442d = null;
        C5906p c5906p = new C5906p();
    }

    private final bi m27367c(ViewGroup viewGroup, int i) {
        C5860f c5860f = C5860f.f29366a;
        C5855a.m27294a();
        c5860f.f29367b.lock();
        try {
            c5860f.f29369d = true;
            c5860f.f29370e.m27298a();
            View view = null;
            try {
                if (this.f29442d != null) {
                    view = this.f29442d.m27384a();
                }
                if (view == null) {
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
                }
                return new bi(view);
            } catch (Exception e) {
                C5875b.f29391b.mo5179a(6, f29441c.f29393c, C5875b.m27306b("Unable to inflate view %s", C5893b.m27341a(i)));
                throw e;
            }
        } finally {
            c5860f = c5860f.f29367b;
            c5860f.unlock();
        }
    }

    public final int mo1039a() {
        if (m27370e()) {
            return 1;
        }
        return this.f29450l == null ? 0 : C5908r.m27385a();
    }

    public final int mo1040a(int i) {
        if (m27370e()) {
            return m27371f().mo5198a();
        }
        Data c = m27368c();
        if (c == null) {
            throw new IllegalStateException("Null Data found at position: " + i);
        }
        Integer d = c.m27350d(C5894a.f29417a.f29432a);
        if (d != null) {
            return d.intValue();
        }
        String str = "All Data must contain key BindAdapter.DK_VIEW_RES_ID. Data: ";
        String valueOf = String.valueOf(c.toString());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    private final Data m27368c() {
        return m27370e() ? null : C5908r.m27387c();
    }

    public final long mo1043b(int i) {
        if (m27372g()) {
            return Long.MAX_VALUE;
        }
        if (m27373h()) {
            return 9223372036854775806L;
        }
        if (m27374i()) {
            return 9223372036854775805L;
        }
        Object d = C5908r.m27388d();
        if (d instanceof Long) {
            return ((Long) d).longValue();
        }
        if (d instanceof Integer) {
            return (long) ((Integer) d).intValue();
        }
        if (d == null) {
            return 0;
        }
        String obj = d.toString();
        long j = 0;
        int i2 = 0;
        while (i2 < obj.length()) {
            long charAt = ((long) obj.charAt(i2)) + (j * 63);
            i2++;
            j = charAt;
        }
        return j;
    }

    public final void mo5196a(eo eoVar) {
        super.mo5196a(eoVar);
        m27369d();
    }

    public final void mo5197b(eo eoVar) {
        super.mo5197b(eoVar);
        m27369d();
    }

    private final boolean m27369d() {
        if (this.f29449k == null) {
            return false;
        }
        if (this.f3433a.m3637a() && !this.f29451m && !this.f29452n) {
            C5899h.m27358e();
            this.f29450l = C5899h.m27357d();
            this.f29451m = true;
        } else if ((!this.f3433a.m3637a() || this.f29452n) && this.f29451m) {
            C5899h.m27359f();
            this.f29451m = false;
        }
        return true;
    }

    private final boolean m27370e() {
        return m27372g() || m27373h() || m27374i();
    }

    private final C5909s m27371f() {
        if (m27372g()) {
            return this.f29443e;
        }
        if (m27373h()) {
            return this.f29444f;
        }
        if (m27374i()) {
            return this.f29445g;
        }
        return null;
    }

    private final boolean m27372g() {
        if (this.f29446h) {
            boolean z;
            if ((this.f29449k == null || !m27383b()) && !m27374i()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final boolean m27373h() {
        return this.f29447i && !((this.f29450l != null && !C5908r.m27389e()) || m27372g() || m27374i());
    }

    private final boolean m27374i() {
        return this.f29448j && this.f29450l != null && C5908r.m27386b();
    }

    public final boolean m27383b() {
        return (this.f29449k == null || this.f29450l == null || !C5899h.m27360g()) ? false : true;
    }

    public final /* synthetic */ void mo1132a(fr frVar) {
        frVar = (bi) frVar;
        View view = frVar.a;
        if (view instanceof C5880k) {
            ((C5880k) view).mo5187a(null);
            if (view instanceof C5881b) {
                ((C5881b) view).setCardGroup(null);
            }
        }
        super.mo1132a(frVar);
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        boolean z = true;
        View view = ((bi) frVar).a;
        Data c = m27368c();
        if (view == null) {
            throw new NullPointerException("Adapter received a null View during binding.");
        } else if (m27370e()) {
            m27371f().mo5199a(view);
        } else if (c == null) {
            throw new NullPointerException("Adapter received a null Data during binding.");
        } else {
            if (view == null) {
                z = false;
            }
            C5893b.m27343a(z, "view can't be null");
            if (view instanceof C5880k) {
                ((C5880k) view).mo5187a(c);
                f29441c.m27307a("Binding at pos: %s with data: %s", Integer.valueOf(i), c);
                if ((view instanceof C5881b) && c.m27346a(C5892j.f29414a)) {
                    ((C5881b) view).setCardGroup((C5892j) c.m27347b(C5892j.f29414a));
                    return;
                }
                return;
            }
            throw new IllegalStateException(String.format(Locale.US, "Unable to bind View that does not extend DataView. View class: %s, Data: %s", new Object[]{view.getClass(), c.toString()}));
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return m27367c(viewGroup, i);
    }
}
