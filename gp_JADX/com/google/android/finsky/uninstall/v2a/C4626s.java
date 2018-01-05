package com.google.android.finsky.uninstall.v2a;

import android.content.Intent;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.android.vending.AssetBrowserActivity;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ah;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C4626s {
    public C0254u f23811a;
    public View f23812b;
    public View f23813c;
    public View f23814d;
    public C4630x f23815e;
    public ah f23816f;
    public String f23817g;
    public boolean f23818h;
    public boolean f23819i;
    public String f23820j;
    public C2495w f23821k;
    public C2495w f23822l;
    public ao f23823m;
    public List f23824n;
    public String f23825o;
    public String f23826p;
    public boolean f23827q;
    public ar f23828r;
    public final Runnable f23829s = new C4627t(this);

    C4626s(C0254u c0254u, ah ahVar, View view, boolean z, boolean z2, C2495w c2495w) {
        this.f23811a = c0254u;
        this.f23812b = view;
        this.f23814d = view.findViewById(C7582R.id.loading_spinner);
        this.f23813c = view.findViewById(C7582R.id.uninstall_manager_content_frame);
        this.f23818h = z;
        this.f23816f = ahVar;
        this.f23819i = z2;
        this.f23822l = c2495w;
        this.f23821k = c2495w;
        this.f23815e = (C4630x) this.f23811a.H_().mo283a("uninstall_manager_base_fragment");
    }

    final void m21570a() {
        boolean z = this.f23815e.f23834b;
        m21571a(this.f23815e.f23833a);
        if (z) {
            m21573a(false);
            m21574b();
        }
    }

    final void m21574b() {
        if (!this.f23815e.f23834b) {
            if (this.f23815e.f23833a != -1) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f23811a, C7582R.anim.slide_out_left);
                loadAnimation.setAnimationListener(new C4629v(this));
                this.f23813c.startAnimation(loadAnimation);
                this.f23814d.setVisibility(0);
                this.f23814d.startAnimation(AnimationUtils.loadAnimation(this.f23811a, C7582R.anim.slide_in_right));
            } else {
                this.f23813c.setVisibility(4);
                this.f23814d.setVisibility(0);
                this.f23814d.startAnimation(AnimationUtils.loadAnimation(this.f23811a, C7582R.anim.play_fade_in));
            }
            m21573a(true);
        }
    }

    public final void m21575c() {
        this.f23812b.removeCallbacks(this.f23829s);
    }

    final void m21573a(boolean z) {
        this.f23815e.f23834b = z;
    }

    public final void m21571a(int i) {
        Fragment adVar;
        switch (i) {
            case 0:
                if (!this.f23824n.isEmpty()) {
                    this.f23821k = this.f23822l.m13365a();
                    this.f23817g = "uninstall_manager_selection";
                    adVar = new ad();
                    this.f23816f.o_();
                    adVar.ai = this.f23816f;
                    m21569a(adVar);
                    break;
                }
                this.f23821k = this.f23822l.m13365a();
                this.f23817g = "uninstall_manager_selection";
                adVar = new C4624q();
                this.f23816f.o_();
                adVar.ag = this.f23816f;
                m21569a(adVar);
                break;
            case 1:
                if (this.f23819i) {
                    this.f23821k = this.f23822l.m13365a();
                }
                this.f23817g = "uninstall_manager_confirmation";
                adVar = C4612e.m21530a(this.f23820j, af.m21457a().m21464d(), Boolean.valueOf(this.f23818h));
                this.f23816f.o_();
                adVar.af = this.f23816f;
                m21569a(adVar);
                break;
            case 4:
                String str = this.f23825o;
                String str2 = this.f23826p;
                this.f23817g = "uninstall_manager_error";
                adVar = C4625r.m21564a(str, str2);
                this.f23816f.o_();
                adVar.f23808e = this.f23816f;
                m21569a(adVar);
                break;
        }
        this.f23815e.f23833a = i;
    }

    private final void m21569a(Fragment fragment) {
        aw a = this.f23811a.H_().mo284a();
        if (this.f23815e.f23834b) {
            this.f23813c.setVisibility(4);
            this.f23812b.postDelayed(this.f23829s, 100);
        } else {
            if (this.f23815e.f23833a != -1) {
                a.mo323a((int) C7582R.anim.slide_in_right, (int) C7582R.anim.slide_out_left);
            }
            this.f23813c.setVisibility(0);
        }
        ab H_ = this.f23811a.H_();
        if (H_.mo283a(this.f23817g) == null) {
            a.mo332b(C7582R.id.uninstall_manager_content_frame, fragment, this.f23817g);
            if (this.f23817g.equals("uninstall_manager_confirmation")) {
                if (this.f23819i) {
                    this.f23819i = false;
                } else {
                    a.mo330a(null);
                }
            }
            a.mo334c();
        } else if (this.f23817g.equals("uninstall_manager_selection")) {
            H_.mo292c();
        }
        m21573a(false);
    }

    final void m21572a(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f23811a, C7582R.anim.fade_out);
        loadAnimation.setAnimationListener(new C4628u(view));
        view.startAnimation(loadAnimation);
    }

    final boolean m21576d() {
        return this.f23827q && this.f23815e.f23835c != null && this.f23815e.mo968W() && this.f23815e.f23835c.mo4304c().isEmpty();
    }

    final void m21577e() {
        FinskyLog.m21659a("Nothing to delete; starting main activity", new Object[0]);
        Intent intent = new Intent(C1473m.f7980a.f7981b, AssetBrowserActivity.class);
        intent.addFlags(268435456);
        this.f23811a.finish();
        this.f23811a.startActivity(intent);
    }
}
