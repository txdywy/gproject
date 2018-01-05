package com.google.android.play.search;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.Point;
import android.view.View;
import android.view.ViewAnimationUtils;

final class ae implements C6407o {
    public final /* synthetic */ PlaySearchToolbar f32336a;

    ae(PlaySearchToolbar playSearchToolbar) {
        this.f32336a = playSearchToolbar;
    }

    public final void mo5425a(int i) {
        if (i == 1 || i == 2) {
            this.f32336a.m29405j();
            PlaySearch playSearch = this.f32336a.ae;
            Runnable afVar = new af(this);
            if (PlaySearch.f32272m) {
                AnimatorListener c6414g = new C6414g(afVar);
                View view = (View) playSearch.getParent();
                if (!(view == null || playSearch.f32283v == null || !playSearch.f32283v.isAttachedToWindow())) {
                    Point a = playSearch.m29354a();
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(playSearch.f32283v, a.x, a.y, (float) view.getWidth(), 0.0f);
                    createCircularReveal.setDuration(300);
                    createCircularReveal.addListener(new C6416i(playSearch));
                    createCircularReveal.addListener(c6414g);
                    createCircularReveal.start();
                }
            } else {
                playSearch.setVisibility(4);
                afVar.run();
            }
        }
        if (this.f32336a.aj != null) {
            this.f32336a.aj.mo5425a(i);
        }
    }

    public final void mo5428a(String str, boolean z) {
        if (this.f32336a.ad != null) {
            this.f32336a.ad.setQuery(str);
        }
        if (this.f32336a.aj != null) {
            this.f32336a.aj.mo5428a(str, z);
        }
    }

    public final void mo5426a(C6429w c6429w) {
        if (this.f32336a.m29403h()) {
            this.f32336a.m29400a(true, 2);
        } else {
            this.f32336a.ae.f32280s.m29446b();
        }
        this.f32336a.ae.f32280s.m29446b();
        if (this.f32336a.aj != null) {
            this.f32336a.aj.mo5426a(c6429w);
        }
    }

    public final boolean mo5429b(C6429w c6429w) {
        if (this.f32336a.aj != null) {
            return this.f32336a.aj.mo5429b(c6429w);
        }
        return false;
    }

    public final void mo5427a(String str) {
        if (this.f32336a.m29403h()) {
            this.f32336a.m29400a(true, 2);
        } else {
            this.f32336a.ae.f32280s.m29446b();
        }
        if (this.f32336a.aj != null) {
            this.f32336a.aj.mo5427a(str);
        }
    }
}
