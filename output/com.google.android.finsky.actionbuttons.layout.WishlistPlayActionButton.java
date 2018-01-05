package com.google.android.finsky.actionbuttons.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.actionbuttons.i;
import com.google.android.finsky.api.h;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.g;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.providers.d;

protected class WishlistPlayActionButton extends PlayActionButtonV2 implements com.google.android.finsky.ee.f
{

    public com.google.android.finsky.api.h a;
    public com.google.android.finsky.d.g b;
    public com.google.android.finsky.accounts.c c;
    public com.google.android.finsky.ee.a d;
    public Document e;
    public boolean f;
    public View$OnClickListener g;

    WishlistPlayActionButton(Context p0) {
        PlayActionButtonV2(p0);
    }

    WishlistPlayActionButton(Context p0, AttributeSet p1) {
        PlayActionButtonV2(p0, p1);
    }

    private final void a(boolean p0, int p1) {
        if (p0 != 0)
            this.a(p1, this.getContext().getString(2131952404), this.g);
        else
            this.a(p1, this.getContext().getString(2131952403), this.g);
    }

    public final void a(Document p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.finsky.d.ad p2) {
        v6 = this.a.a();
        if (this.d.a(p0, v6))
            this.setVisibility(8);
        else {
            this.e = p0;
            this.setVisibility(0);
            v3 = this.c.cY();
            this.g = new com.google.android.finsky.actionbuttons.layout.a(this, p0, v3, p2, p1, v6);
            this.a(this.d.a(p0, v3), p0.a.f);
            this.f = 1;
        }
    }

    public final void a(String p0, boolean p1, boolean p2) {
        if (this.f != 0 && p0.equals(this.e.a.c))
            this.a(p1, this.e.a.f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.a(this);
    }

    public void onDetachedFromWindow() {
        this.d.b(this);
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((com.google.android.finsky.actionbuttons.i)com.google.android.finsky.providers.d.a(com.google.android.finsky.actionbuttons.i)).a(this);
    }

}
