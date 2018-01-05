package com.google.android.finsky.uninstall.v2a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.animation.AnimationUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C4630x extends Fragment implements C1031w, al {
    public int f23833a = -1;
    public boolean f23834b;
    public ak f23835c;

    private final C4626s m21578Z() {
        return ((C4607w) m603h()).mo1276k();
    }

    public final boolean mo968W() {
        return this.f23835c.mo4306e();
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        m21580X();
        m21578Z().m21574b();
    }

    final void m21580X() {
        C2495w c2495w = m21578Z().f23821k;
        List list = m21578Z().f23824n;
        if (m21578Z().f23827q) {
            this.f23835c = new C4610c(m603h());
        } else {
            this.f23835c = new C4613f(c2495w, list, m603h());
        }
        this.f23835c.mo4300a((C1031w) this);
        this.f23835c.mo4301a((al) this);
        this.f23835c.mo4307f();
    }

    public final void m_() {
        C4626s Z = m21578Z();
        if (Z.f23815e.f23834b) {
            if (Z.f23815e.f23833a == -1) {
                FinskyLog.m21669e("Illegal state: hideLoading called without fragment.", new Object[0]);
            } else {
                Z.f23813c.setVisibility(0);
                Z.f23813c.startAnimation(AnimationUtils.loadAnimation(Z.f23811a, C7582R.anim.play_fade_in));
                Z.m21572a(Z.f23814d);
                Z.m21573a(false);
            }
        }
        this.f23835c.mo4303b(this);
        if (m21578Z().m21576d()) {
            m21578Z().m21577e();
        }
    }

    public final void mo4309Y() {
        C2495w c2495w = m21578Z().f23821k;
        m603h().finish();
        ArrayList d = this.f23835c.mo4305d();
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            Document document = (Document) obj;
            new Handler(Looper.getMainLooper()).postDelayed(new C4631y(document.f14885a.f12100g, document.m14625N().f13171k, c2495w), 500);
        }
        this.f23835c.mo4301a(null);
    }

    public final void mo4310a(VolleyError volleyError) {
        String b = C1290m.m7703b(m603h(), volleyError);
        String a = C1290m.m7702a(m603h(), volleyError);
        C4626s Z = m21578Z();
        Z.f23825o = b;
        Z.f23826p = a;
        this.f23835c.mo4301a(null);
        m21578Z().m21571a(4);
    }
}
