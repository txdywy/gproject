package com.google.android.finsky.bm;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.finsky.bg.ai;
import com.google.android.libraries.play.entertainment.story.MediaPlayerOverlayView;

public final class com.google.android.finsky.bm.a implements View$OnAttachStateChangeListener, ViewTreeObserver$OnScrollChangedListener
{

    public final com.google.android.finsky.bm.b a;
    public View b;
    public ViewGroup c;
    public final MediaPlayerOverlayView d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public int h;
    public final int i;
    public boolean j;

    a(com.google.android.finsky.bm.b p0, MediaPlayerOverlayView p1, int p2) {
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        this.a = p0;
        this.d = p1;
        this.i = p2;
    }

    public final void a() {
        if (this.b != 0) {
            this.b.removeOnAttachStateChangeListener(this);
            this.b.getViewTreeObserver().removeOnScrollChangedListener(this);
            this.b = 0;
        }
        this.c = 0;
        this.j = 0;
    }

    public final void b() {
        if (this.b != 0) {
            this.g.set(0, 0, this.b.getWidth(), this.b.getHeight());
            this.c.offsetDescendantRectToMyCoords(this.b, this.g);
            switch (this.h) {
                case 3:
                    v0 = 1;
                    break;
                case 4:
                    v0 = 1;
                    break;
                default:
                    v0 = 0;
                    break;
            }
            if (v0 != 0)
                v0 = this.d.a();
            else
                v0 = 0;
            v2 = new Rect(0, this.e.top, this.c.getWidth(), this.c.getHeight() - (v0 + this.i)).contains(this.g);
            if (v2 != 0) {
                this.f.set(0, 0, this.b.getWidth(), this.b.getHeight());
                v0 = (ViewGroup)this.d.getParent();
                v0.offsetDescendantRectToMyCoords(this.b, this.f);
                v0.offsetRectIntoDescendantCoords(this.d, this.f);
                this.d.a(this.f, this.h);
                if (this.j == 0)
                    this.a.a();
            }
            else if (this.j != 0)
                this.a.a(0);
            this.j = v2;
        }
    }

    public final void onScrollChanged() {
        if (!com.google.android.finsky.bg.ai.b(this.b))
            this.a.a(1);
    }

    public final void onViewAttachedToWindow(View p0) {
    }

    public final void onViewDetachedFromWindow(View p0) {
        this.a.a(1);
    }

}
