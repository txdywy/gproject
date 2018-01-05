package com.google.android.libraries.play.entertainment.story;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v7.app.C0404a;
import android.support.v7.app.aa;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.agera.C0899j;
import com.google.android.agera.ac;
import com.google.android.agera.ad;
import com.google.android.agera.ag;
import com.google.android.agera.ak;
import com.google.android.agera.am;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6027b;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2981c;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p192l.p350a.C6103c;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p347g.C6088a;
import com.google.android.libraries.play.entertainment.p349k.C6097b;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.story.model.C6164u;
import com.google.android.libraries.play.entertainment.story.model.StateSaver;
import com.google.android.libraries.play.entertainment.story.model.aq;
import com.google.android.libraries.play.entertainment.story.model.au;
import com.google.android.libraries.play.entertainment.story.model.ax;
import com.google.wireless.android.finsky.dfe.g.a.an;

public final class al extends C6088a {
    public static final C6090b f30380b = C6090b.m28050a();
    public View af;
    public StoryFlowLayout ag;
    public View ah;
    public View ai;
    public RecyclerView aj;
    public MediaPlayerOverlayView ak;
    public aq al;
    public ar am;
    public C6137g an;
    public final am f30381c = new ap(this);
    public C2981c f30382d;
    public byte[] f30383e;
    public String f30384f;
    public ac f30385g;
    public ac f30386h;
    public ViewGroup f30387i;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f30387i = (ViewGroup) C6116b.m28100a((ViewGroup) layoutInflater.inflate(C6091h.fragment_story, viewGroup, false));
        this.af = (View) C6116b.m28100a(this.f30387i.findViewById(C6089g.status_bar_underlay));
        this.ag = (StoryFlowLayout) C6116b.m28100a((StoryFlowLayout) this.f30387i.findViewById(C6089g.pe__story_flow_layout));
        this.ag.a(new am(this, layoutInflater.getContext(), bundle));
        View view = (View) C6116b.m28100a(this.f30387i.findViewById(C6089g.pe__text_media_fragment_container));
        this.ak = (MediaPlayerOverlayView) C6116b.m28100a((MediaPlayerOverlayView) this.f30387i.findViewById(C6089g.pe__media_player_overlay));
        if (C6115a.m28097a(21)) {
            this.f30387i.setOnApplyWindowInsetsListener(new an(view, this.ak, this.af, this.ag));
        }
        return this.f30387i;
    }

    public final void m28222a(String str) {
        C6116b.m28104a(this.f30385g == null, "already created storyRepository for the previous id");
        this.f30384f = str;
    }

    public final void mo139d(Bundle bundle) {
        C2980a a;
        C2980a a2;
        C0899j aoVar;
        ac a3;
        ac acVar;
        C6127s c6127s;
        C3006a t;
        Parcelable[] parcelableArr;
        super.mo139d(bundle);
        C0404a c0404a = (C0404a) C6116b.m28100a(((aa) m603h()).G_().mo500a());
        c0404a.mo559a();
        c0404a.mo566a(true);
        c0404a.mo565a((CharSequence) "");
        ab j = m607j();
        ab abVar = this.f730B;
        Account a4 = C2998a.m15496l().m15510m().mo3254a();
        if (TextUtils.isEmpty(this.f30384f) || a4 == null) {
            this.f30385g = com.google.android.agera.aa.m5566a(ak.m5593a(new an()));
        } else {
            this.f30385g = new C6097b(C2998a.m15496l().m15513p().f30249a, new C6103c(new bc(a4, this.f30384f)));
        }
        C2993b r = C2998a.m15496l().m15515r();
        if (bundle != null) {
            this.f30383e = bundle.getByteArray("serverLogsCookie");
        }
        byte[] bArr = this.f30383e;
        C0254u h = m603h();
        if (h instanceof ai) {
            Intent intent = ((ai) h).getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("causeNode");
                if (bundleExtra != null) {
                    a = C2998a.m15496l().m15515r().mo3223a(bundleExtra);
                    a2 = r.mo3225a(bArr, a);
                    this.f30382d = a2;
                    this.f30386h = ((ag) ad.m5583a(ba.f30466b).mo1150a(r1).mo1152b().mo1151a(this.f30385g).mo1153b(ba.f30467c)).mo1149a(ba.f30468d).mo1148a();
                    if (C2998a.m15496l().m15520w().mo3255a()) {
                        this.an = new C6138h();
                    } else {
                        this.an = new C6139i();
                    }
                    this.am = new ar(m603h(), abVar, j, (ViewGroup) C6116b.m28100a(this.f30387i), (View) C6116b.m28100a(this.af), (StoryFlowLayout) C6116b.m28100a(this.ag), (RecyclerView) C6116b.m28100a(this.aj), C6089g.pe_youtube_player_fragment_container, (MediaPlayerOverlayView) C6116b.m28100a(this.ak), C2998a.m15496l().m15517t(), r, C2998a.m15496l().m15518u(), C2998a.m15496l().m15519v(), a2, this.an, C2998a.m15496l().m15520w());
                    aoVar = new ao(this);
                    a3 = ad.m5583a((Integer) aoVar.mo1154a(Integer.valueOf(0))).mo1150a(this.f30386h, this.am.f30419p).mo1152b().mo1149a(aoVar).mo1148a();
                    acVar = this.f30386h;
                    c6127s = this.am;
                    t = C2998a.m15496l().m15517t();
                    if (bundle != null) {
                        parcelableArr = null;
                    } else {
                        parcelableArr = bundle.getParcelableArray("listAdapterInstanceState");
                    }
                    this.al = aq.m28395a(acVar, a3, c6127s, t, parcelableArr, a2, r);
                    this.aj.setAdapter(this.al);
                    this.aj.m278a(new aq(this));
                    this.an.mo5325a(m603h());
                }
            }
        }
        a = null;
        a2 = r.mo3225a(bArr, a);
        this.f30382d = a2;
        this.f30386h = ((ag) ad.m5583a(ba.f30466b).mo1150a(r1).mo1152b().mo1151a(this.f30385g).mo1153b(ba.f30467c)).mo1149a(ba.f30468d).mo1148a();
        if (C2998a.m15496l().m15520w().mo3255a()) {
            this.an = new C6138h();
        } else {
            this.an = new C6139i();
        }
        this.am = new ar(m603h(), abVar, j, (ViewGroup) C6116b.m28100a(this.f30387i), (View) C6116b.m28100a(this.af), (StoryFlowLayout) C6116b.m28100a(this.ag), (RecyclerView) C6116b.m28100a(this.aj), C6089g.pe_youtube_player_fragment_container, (MediaPlayerOverlayView) C6116b.m28100a(this.ak), C2998a.m15496l().m15517t(), r, C2998a.m15496l().m15518u(), C2998a.m15496l().m15519v(), a2, this.an, C2998a.m15496l().m15520w());
        aoVar = new ao(this);
        a3 = ad.m5583a((Integer) aoVar.mo1154a(Integer.valueOf(0))).mo1150a(this.f30386h, this.am.f30419p).mo1152b().mo1149a(aoVar).mo1148a();
        acVar = this.f30386h;
        c6127s = this.am;
        t = C2998a.m15496l().m15517t();
        if (bundle != null) {
            parcelableArr = bundle.getParcelableArray("listAdapterInstanceState");
        } else {
            parcelableArr = null;
        }
        this.al = aq.m28395a(acVar, a3, c6127s, t, parcelableArr, a2, r);
        this.aj.setAdapter(this.al);
        this.aj.m278a(new aq(this));
        this.an.mo5325a(m603h());
    }

    public final void g_() {
        super.g_();
        ((ac) C6116b.m28100a(this.f30385g)).mo1144a(this.f30381c);
        ((aq) C6116b.m28100a(this.al)).m5528b();
        this.f30381c.ad_();
        ((ar) C6116b.m28100a(this.am)).f30418o.m28340a();
    }

    public final void mo979u() {
        super.mo979u();
        ((C2981c) C6116b.m28100a(this.f30382d)).o_();
    }

    public final void mo140e(Bundle bundle) {
        int childCount;
        super.mo140e(bundle);
        if (this.f30383e != null) {
            bundle.putByteArray("serverLogsCookie", this.f30383e);
        }
        bundle.putParcelable("listLayoutManagerInstanceState", ((LinearLayoutManager) ((RecyclerView) C6116b.m28100a(this.aj)).getLayoutManager()).mo742d());
        String str = "listAdapterInstanceState";
        aq aqVar = (aq) C6116b.m28100a(this.al);
        if (aqVar.f30597t != null) {
            childCount = aqVar.f30597t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                fr a = aqVar.f30597t.m275a(aqVar.f30597t.getChildAt(i));
                if (a instanceof au) {
                    au auVar = (au) a;
                    ax axVar = auVar.f30599t;
                    Object obj = auVar.f30600u;
                    C6164u c6164u = auVar.f30602w;
                    axVar.mo5332b(obj);
                }
            }
        }
        C6164u c6164u2 = aqVar.f30596s;
        childCount = c6164u2.f30669d.size();
        Parcelable[] parcelableArr = new StateSaver[childCount];
        for (int i2 = 0; i2 < childCount; i2++) {
            parcelableArr[i2] = (StateSaver) c6164u2.f30669d.valueAt(i2);
        }
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final void h_() {
        ((ac) C6116b.m28100a(this.f30385g)).mo1145b(this.f30381c);
        ((aq) C6116b.m28100a(this.al)).m5530c();
        ar arVar = (ar) C6116b.m28100a(this.am);
        arVar.f30414k.m28285f();
        arVar.f30418o.m28344b();
        if (arVar.f30412i.f30309D != 6 && arVar.f30412i.f30309D != 4) {
            arVar.f30412i.m28161b();
        } else if (arVar.f30412i.f30309D == 4 && arVar.f30413j.m28293c()) {
            arVar.f30412i.m28161b();
        }
        super.h_();
    }

    public final void mo138d() {
        ((RecyclerView) C6116b.m28100a(this.aj)).setAdapter(null);
        super.mo138d();
    }

    public final void mo1346w() {
        ((C6137g) C6116b.m28100a(this.an)).mo5328b(m603h());
        super.mo1346w();
    }

    public final boolean m28219X() {
        boolean z;
        ar arVar = (ar) C6116b.m28100a(this.am);
        if (arVar.f30413j.f30457b.mo5287b()) {
            if (arVar.f30404D != null) {
                arVar.m28255a(arVar.f30404D);
            } else {
                ar.f30399a.m28058b(null, "Unexpected null currentPlayerNode", new Object[0]);
            }
            z = true;
        } else if (arVar.f30412i.f30315J != 0) {
            arVar.f30412i.m28169e();
            z = true;
        } else {
            Fragment fragment = (bd) arVar.f30407d.mo281a(C6089g.pe__text_media_fragment_container);
            if (arVar.f30412i.f30309D == 6) {
                MediaPlayerOverlayView mediaPlayerOverlayView = arVar.f30412i;
                boolean z2 = fragment != null && fragment.mo5347X();
                mediaPlayerOverlayView.m28164b(z2);
                if (arVar.f30404D != null) {
                    arVar.m28255a(arVar.f30404D);
                } else {
                    ar.f30399a.m28058b(null, "Unexpected null currentPlayerNode", new Object[0]);
                }
                z = true;
            } else if (fragment != null) {
                arVar.f30407d.mo284a().mo324a(C6027b.text_fragment_in, C6027b.text_fragment_out, C6027b.text_fragment_in, C6027b.text_fragment_out).mo327a(fragment).mo336d();
                arVar.m28255a(fragment.m28191Z());
                arVar.m28263c();
                if (fragment.mo5347X()) {
                    arVar.f30412i.m28164b(false);
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        StoryFlowLayout storyFlowLayout = (StoryFlowLayout) C6116b.m28100a(this.ag);
        if (!storyFlowLayout.af) {
            return true;
        }
        storyFlowLayout.a(storyFlowLayout.P);
        return true;
    }

    public final void m28220Y() {
        if (this.f30382d != null) {
            C2993b r = C2998a.m15496l().m15515r();
            r.mo3231b(r.mo3235d(this.f30382d));
        }
    }

    public static al m28218a(ab abVar) {
        Fragment a = abVar.mo283a("com.google.android.libraries.play.entertainment.story:StoryFragment");
        C6116b.m28104a(a instanceof al, "A StoryFragment must be added with tag 'com.google.android.libraries.play.entertainment.story:StoryFragment'");
        return (al) a;
    }
}
