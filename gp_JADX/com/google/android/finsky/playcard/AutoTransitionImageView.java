package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;

public class AutoTransitionImageView extends FrameLayout implements C3892e {
    public C1612l f19323a;
    public long f19324b;
    public ViewPropertyAnimator f19325c;
    public int f19326d;
    public View f19327e;
    public View f19328f;
    public boolean f19329g;
    public int f19330h;

    public AutoTransitionImageView(Context context) {
        this(context, null);
    }

    public AutoTransitionImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void mo3834a() {
        this.f19325c = this.f19329g ? this.f19328f.animate().alpha(1.0f) : this.f19327e.animate().alpha(0.0f);
        this.f19325c.setDuration(this.f19324b).setInterpolator(new AccelerateInterpolator()).setListener(new C3905f(this)).start();
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1876a(this);
        super.onFinishInflate();
    }

    final void m18392a(View view, bd bdVar) {
        this.f19323a.m9288a((FifeImageView) view, bdVar.f11860f, bdVar.f11863i);
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.clearAnimation();
    }
}
