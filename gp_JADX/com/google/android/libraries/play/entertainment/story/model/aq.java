package com.google.android.libraries.play.entertainment.story.model;

import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.agera.ac;
import com.google.android.agera.p100a.C0884a;
import com.google.android.agera.p100a.C0886c;
import com.google.android.agera.p100a.C0891h;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.story.C6127s;

public final class aq extends C0884a {
    public static final ay f30589l = new az().m28412a(C6144a.class, C6145b.f30623a).m28412a(C6147d.class, C6148e.f30646a).m28412a(af.class, ag.f30568a).m28412a(bn.class, bo.f30641a).m28412a(aa.class, ab.f30559a).m28412a(ao.class, ap.f30587a).m28412a(ai.class, aj.f30575a).m28412a(bg.class, bh.f30632a).m28412a(am.class, an.f30581a).m28412a(bk.class, ba.f30627a).m28412a(bj.class, bl.f30636a).m28413b(C6165v.class, C6166w.f30671a);
    public static final C0891h f30590m = new at(f30589l);
    public static final ay f30591n = new az().m28412a(bb.class, C6169z.f30675b).m28413b(af.class, ac.f30560a);
    public static final C0891h f30592o = new at(f30591n);
    public static final C0891h f30593p = new ar();
    public final ay f30594q;
    public final C2980a f30595r;
    public final C6164u f30596s;
    public RecyclerView f30597t;

    public static aq m28395a(ac acVar, ac acVar2, C6127s c6127s, C3006a c3006a, Parcelable[] parcelableArr, C2980a c2980a, C2993b c2993b) {
        return new aq(new C0886c().m5532a(acVar, f30590m).m5532a(acVar2, f30593p), f30589l, c2980a, new C6164u(c6127s, c3006a, c2993b, parcelableArr));
    }

    aq(C0886c c0886c, ay ayVar, C2980a c2980a, C6164u c6164u) {
        super(c0886c);
        this.f30594q = ayVar;
        this.f30595r = c2980a;
        this.f30596s = c6164u;
        b_(true);
    }

    public final fr mo1041a(ViewGroup viewGroup, int i) {
        if (i == C6091h.panel_padding) {
            return new as(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }
        ax axVar = (ax) C6116b.m28101a((ax) this.f30594q.f30619b.m1709a(i), "No compatible binder for layout res id 0x%x", Integer.valueOf(i));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        return new au(inflate, axVar, axVar.mo5329a(inflate, this.f30596s), this.f30595r, this.f30596s);
    }

    public final void mo1132a(fr frVar) {
        ((as) frVar).mo5336t();
        super.mo1132a(frVar);
    }

    public final boolean mo1134b(fr frVar) {
        ((as) frVar).mo5336t();
        return super.mo1134b(frVar);
    }

    public final void mo2578a(RecyclerView recyclerView) {
        super.mo2578a(recyclerView);
        this.f30597t = recyclerView;
    }

    public final void mo2579b(RecyclerView recyclerView) {
        super.mo2579b(recyclerView);
        this.f30597t = null;
    }
}
