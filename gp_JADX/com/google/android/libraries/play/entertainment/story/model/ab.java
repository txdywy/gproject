package com.google.android.libraries.play.entertainment.story.model;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.agera.aa;
import com.google.android.agera.p100a.C0886c;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p351m.C6121g;

final class ab extends ax {
    public static final ax f30559a = new ab();

    private ab() {
        super(C6091h.panel_cluster);
    }

    private static void m28365a(C6121g c6121g) {
        StateSaver stateSaver = (StateSaver) c6121g.m28117a(StateSaver.class, C6089g.state_saver);
        stateSaver.f30524b = ((LinearLayoutManager) ((RecyclerView) c6121g.m28117a(RecyclerView.class, C6089g.slider_recycler_view)).getLayoutManager()).mo742d();
    }

    public final /* synthetic */ void mo5332b(Object obj) {
        m28365a((C6121g) obj);
    }

    public final /* synthetic */ void mo5331a(Object obj) {
        C6121g c6121g = (C6121g) obj;
        m28365a(c6121g);
        c6121g.m28119a(C6089g.state_saver);
        c6121g.m28119a(C6089g.cluster_adapter);
        ((RecyclerView) c6121g.m28117a(RecyclerView.class, C6089g.slider_recycler_view)).setAdapter(null);
    }

    public final /* synthetic */ void mo5330a(av avVar, Object obj, C2980a c2980a, C6164u c6164u) {
        CharSequence charSequence;
        aa aaVar = (aa) avVar;
        C6121g c6121g = (C6121g) obj;
        ax.m28360a(aaVar, c6121g, e, f, g, -1);
        c6121g.m28130b(aaVar.k, C6089g.panel_title);
        View view = (View) c6121g.m28117a(View.class, C6089g.background_panel);
        if (TextUtils.isEmpty(aaVar.k)) {
            aaVar.m28358a();
            charSequence = aaVar.f30552d;
        } else {
            charSequence = null;
        }
        view.setContentDescription(charSequence);
        RecyclerView recyclerView = (RecyclerView) c6121g.m28117a(RecyclerView.class, C6089g.slider_recycler_view);
        if (((aq) c6121g.m28129b(aq.class, C6089g.cluster_adapter)) == null) {
            Object aqVar = new aq(new C0886c().m5532a(aa.m5566a(aaVar.f30550b), aq.f30592o), aq.f30591n, c2980a, c6164u);
            c6121g.m28115a(C6089g.cluster_adapter, aqVar);
            recyclerView.setAdapter(aqVar);
            int i = aaVar.f30531j;
            StateSaver stateSaver = (StateSaver) c6164u.f30669d.get(i);
            if (stateSaver == null) {
                stateSaver = new StateSaver(i);
                c6164u.f30669d.put(i, stateSaver);
                aqVar = stateSaver;
            } else {
                StateSaver stateSaver2 = stateSaver;
            }
            c6121g.m28115a(C6089g.state_saver, aqVar);
            if (aqVar.f30524b != null) {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).mo728a(aqVar.f30524b);
            }
        }
    }

    public final /* synthetic */ Object mo5329a(View view, C6164u c6164u) {
        C6121g a = new C6121g().m28115a(C6089g.background_panel, (Object) view).m28116a(view, C6089g.panel_title, TextView.class).m28116a(view, C6089g.slider_recycler_view, RecyclerView.class);
        view.getContext();
        ((RecyclerView) a.m28117a(RecyclerView.class, C6089g.slider_recycler_view)).setLayoutManager(new LinearLayoutManager(0, false));
        return a;
    }
}
