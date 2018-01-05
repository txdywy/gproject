package com.google.android.finsky.detailsmodules;

import android.os.Handler;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.detailsmodules.p183a.C2601e;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C2602a extends C1137h {
    public List f13824c;
    public final Set f13825d = new HashSet();
    public Handler f13826e = new Handler();

    public C2602a(List list) {
        if (list != null) {
            this.f13824c = new ArrayList(list);
        } else {
            this.f13824c = new ArrayList();
        }
    }

    public final C2597a m13684e(int i) {
        return (C2597a) this.f13824c.get(i);
    }

    public final int mo1040a(int i) {
        int g = m13674g(i);
        return ((C2597a) this.f13824c.get(g)).mo2977c(m13675h(i));
    }

    private final void m13673a(C2601e c2601e) {
        C2597a c2597a = c2601e.f13823t;
        if (c2597a != null) {
            int d = c2601e.m3267d();
            if (d == -1) {
                d = -1;
            } else {
                d = m13675h(d);
            }
            if (d != -1) {
                c2597a.mo3037c(c2601e.a, d);
            }
            if (c2597a.f13820a.contains(c2601e)) {
                c2597a.f13820a.set(c2597a.f13820a.indexOf(c2601e), null);
            }
            c2601e.f13823t = null;
            this.f13825d.remove(c2601e);
            super.mo1132a((fr) c2601e);
        }
    }

    public final void m13682b() {
        C2601e[] c2601eArr = (C2601e[]) this.f13825d.toArray(new C2601e[this.f13825d.size()]);
        for (C2601e a : c2601eArr) {
            m13673a(a);
        }
    }

    private final int m13674g(int i) {
        for (int i2 = 0; i2 < this.f13824c.size(); i2++) {
            int e = ((C2597a) this.f13824c.get(i2)).mo2978e();
            if (i < e) {
                return i2;
            }
            i -= e;
        }
        FinskyLog.m21669e("Should never reach here", new Object[0]);
        return -1;
    }

    private final int m13675h(int i) {
        for (int i2 = 0; i2 < this.f13824c.size(); i2++) {
            int e = ((C2597a) this.f13824c.get(i2)).mo2978e();
            if (i < e) {
                return i;
            }
            i -= e;
        }
        FinskyLog.m21669e("Should never reach here", new Object[0]);
        return -1;
    }

    public final int m13685f(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((C2597a) this.f13824c.get(i3)).mo2978e();
        }
        return i2;
    }

    public final int m13678a(C2597a c2597a, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13824c.size(); i3++) {
            C2597a c2597a2 = (C2597a) this.f13824c.get(i3);
            if (c2597a2 == c2597a) {
                return i2 + i;
            }
            i2 += c2597a2.mo2978e();
        }
        return -1;
    }

    public final int m13683c() {
        return this.f13824c.size();
    }

    public final int mo1039a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13824c.size(); i2++) {
            i += ((C2597a) this.f13824c.get(i2)).mo2978e();
        }
        return i;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C2601e c2601e = (C2601e) frVar;
        int g = m13674g(i);
        int h = m13675h(i);
        C2597a c2597a = (C2597a) this.f13824c.get(g);
        c2601e.f13823t = c2597a;
        for (int size = c2597a.f13820a.size(); size < c2597a.mo2978e(); size++) {
            c2597a.f13820a.add(null);
        }
        c2597a.f13820a.set(h, c2601e);
        c2597a.mo2976b(c2601e.a, h);
        if (!this.f13825d.contains(c2601e)) {
            this.f13825d.add(c2601e);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C2601e(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
