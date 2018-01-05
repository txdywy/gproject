package com.google.android.finsky.contentfilterui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.cs;
import com.caverock.androidsvg.q;
import com.google.android.finsky.ab.a;
import com.google.android.finsky.ab.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.j;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.bh;
import com.google.wireless.android.finsky.dfe.nano.bi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class com.google.android.finsky.contentfilterui.e extends com.google.android.finsky.pagesystem.b implements ValueAnimator$AnimatorUpdateListener, View$OnClickListener, com.google.android.finsky.at.m
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public com.google.wireless.android.finsky.dfe.nano.bi ag;
    public boolean ah;
    public ViewGroup ai;
    public CheckBox aj;
    public Button ak;
    public com.google.android.finsky.contentfilterui.n c;
    public int e;
    public int f;
    public int h;
    public com.google.android.finsky.d.a y_;

    e() {
        com.google.android.finsky.pagesystem.b();
        this.a = com.google.android.finsky.d.j.a(5236);
        this.f = -1;
        this.h = 0;
    }

    private final void aj() {
        v0 = new int[2];
        v0[0] = this.h;
        v0[1] = this.f;
        v0 = ValueAnimator.ofInt(v0);
        v0.addListener(new com.google.android.finsky.contentfilterui.i(this));
        v0.addUpdateListener(this);
        v0.setDuration(150);
        v0.start();
    }

    private final View$OnClickListener b(int p0) {
        return new com.google.android.finsky.contentfilterui.h(this, p0);
    }

    protected final void O_() {
        super.O_();
        this.ah = 0;
        this.ak.setEnabled(1);
    }

    protected final int Z() {
        return 2130968707;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = 1;
        v4 = super.a(p0, p1, p2);
        v0 = (TextView)v4.findViewById(2131755494);
        this.ai = (ViewGroup)v4.findViewById(2131755495);
        this.ak = (Button)v4.findViewById(2131755496);
        this.ak.setText(this.c.b.j);
        this.ak.setOnClickListener(this);
        if (this.ah == 0)
            v1 = 1;
        else
            v1 = 0;
        this.ak.setEnabled(v1);
        if (this.ag == 0)
            v0 = v4;
        else {
            if (this.ag.k != 0) {
                v0.setVisibility(8);
                v0 = (ContentFilterChoiceItemView)p0.inflate(2130968709, this.ai, 0);
                if (this.f != 0)
                    v2 = 0;
                v0.h.setText(this.ag.e[0].e);
                v0.c.setVisibility(8);
                v0.j.setVisibility(0);
                v0.j.setChecked(v2);
                v0.k.setVisibility(8);
                v0.i.setVisibility(8);
                this.aj = v0.getCheckBox();
                v0.setOnClickListener(this.b(0));
                this.ai.addView(v0);
            }
            else {
                v0.setText(this.ag.h);
                v2 = 0;
                while (v2 < this.ag.e.length) {
                    v0 = (ContentFilterChoiceItemView)p0.inflate(2130968709, this.ai, 0);
                    v0.setOnClickListener(this.b(v2));
                    v1 = 0;
                    if (v2 == 0)
                        v1 = this.c(2131951937);
                    else if (v2 == this.ag.e.length - 1)
                        v1 = this.c(2131951934);
                    v0.h.setText(this.ag.e[v2].e);
                    if (v1 != 0)
                        v0.i.setText(v1);
                    else
                        v0.i.setVisibility(8);
                    if (this.ag.e[v2].d != 0) {
                        com.google.android.finsky.bg.af.a(v0.k, this.ag.e[v2].d);
                        v0.a.a(v0.k, this.ag.e[v2].d.f, this.ag.e[v2].d.i);
                    }
                    this.ai.addView(v0);
                    v2 = v2 + 1;
                }
                this.aj();
            }
            v0 = v4;
        }
        return v0;
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 1)
            this.ai();
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.contentfilterui.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.contentfilterui.d)).a(this);
        super.a(p0);
    }

    protected final void aa() {
    }

    final void ai() {
        if (this.ag.k != 0)
            this.aj.performClick();
        else
            this.aj();
    }

    public final void b(Bundle p0) {
  0:    super.b(p0);
  3:    this.s_();
  7:    this.L = 1;
 11:    if (this.ag != 0)
 61:        return;
 23:    this.ag = this.c.b.b[this.e];
 47:    v0 = 0;
 49:    if (v0 >= this.c.b.b[this.e].e.length) goto 65;
 57:    if (com.google.android.finsky.ab.a.a(this.c.b.b[this.e].e[v0]) != ((com.google.android.finsky.ab.b)this.c.e.get(this.e)).c) goto 62;
 59:    this.f = v0;
 61:    return;
 62:    v0 = v0 + 1;
 64:    goto 48;
 66:    v0 = this.c.b.b[this.e].e.length - 1;
 68:    goto 59;
    }

    protected final void cg_() {
    }

    public final void d() {
        super.d();
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.bm.c(this.ag.f);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void onAnimationUpdate(ValueAnimator p0) {
        v6 = ((Integer)p0.getAnimatedValue()).intValue();
        if (this.k()) {
            v1 = 0;
            while (v1 < this.ai.getChildCount()) {
                v0 = (ContentFilterChoiceItemView)this.ai.getChildAt(v1);
                if (v1 > 0 && v1 <= v6)
                    v3 = 1;
                else
                    v3 = 0;
                if (v1 < v6)
                    v5 = 1;
                else
                    v5 = 0;
                if (v1 == v6)
                    v4 = 1;
                else
                    v4 = 0;
                if (v1 > v6)
                    v2 = 1;
                else
                    v2 = 0;
                if (v3 != 0)
                    v3 = 0;
                else
                    v3 = 4;
                v0.d.setVisibility(v3);
                if (v5 != 0)
                    v3 = 0;
                else
                    v3 = 4;
                v0.e.setVisibility(v3);
                if (v4 != 0)
                    v3 = 0;
                else
                    v3 = 8;
                v0.g.setVisibility(v3);
                if (v4 != 0) {
                    v7 = v0.getResources().getDimensionPixelSize(2131624135);
                    v8 = com.caverock.androidsvg.q.a(v0.getContext(), 2131361806);
                    v8.a((float)v7 * 1065353216 / v8.a());
                    v9 = new com.caverock.androidsvg.cs(v8, new com.caverock.androidsvg.as().b(v0.getResources().getColor(2131558454)));
                    v9.setBounds(0, 0, v7, v7);
                    v0.g.setImageDrawable(v9);
                }
                if (v4 != 0)
                    v3 = 8;
                else
                    v3 = 0;
                v0.f.setVisibility(v3);
                v3 = v0.f;
                if (v2 == 0)
                    v0 = 1;
                else
                    v0 = 0;
                v3.setEnabled(v0);
                v1 = v1 + 1;
            }
        }
    }

    public final void onClick(View p0) {
        if (p0 == this.ak) {
            this.ah = 1;
            this.ak.setEnabled(0);
            this.au();
            if (this.ag.k != 0) {
                if (this.aj.isChecked())
                    v0 = 0;
                else
                    v0 = 1;
                this.f = v0;
            }
            v3 = new ArrayList(this.c.e);
            v0 = (com.google.android.finsky.ab.b)this.c.e.get(this.e);
            v3.set(this.e, new com.google.android.finsky.ab.b(v0.a, v0.b, com.google.android.finsky.ab.a.a(this.ag.e[this.f])));
            v8 = com.google.android.finsky.ab.a.a(this.ag.e[this.f]);
            v0 = new com.google.android.finsky.contentfilterui.o(this.c, this.h(), v3, 1, new com.google.android.finsky.contentfilterui.f(this), new com.google.android.finsky.contentfilterui.g(this));
            if (v8 == -1)
                this.c.j.a().a(this.c.d, 0, this.c.b.b[this.e].c, 0, v0, v0);
            else {
                v1 = new b[1];
                v1[0] = new com.google.android.finsky.ab.b(this.c.b.b[this.e].c, this.c.b.b[this.e].d, v8);
                this.c.j.a().a(this.c.d, com.google.android.finsky.contentfilterui.n.a(Arrays.asList(v1)), 0, 0, v0, v0);
            }
        }
    }

}
