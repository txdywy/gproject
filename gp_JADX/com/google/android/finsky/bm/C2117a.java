package com.google.android.finsky.bm;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.finsky.bg.ai;
import com.google.android.libraries.play.entertainment.story.MediaPlayerOverlayView;

public final class C2117a implements OnAttachStateChangeListener, OnScrollChangedListener {
    public final C2118b f10738a;
    public View f10739b;
    public ViewGroup f10740c;
    public final MediaPlayerOverlayView f10741d;
    public final Rect f10742e = new Rect();
    public final Rect f10743f = new Rect();
    public final Rect f10744g = new Rect();
    public int f10745h;
    public final int f10746i;
    public boolean f10747j;

    C2117a(C2118b c2118b, MediaPlayerOverlayView mediaPlayerOverlayView, int i) {
        this.f10738a = c2118b;
        this.f10741d = mediaPlayerOverlayView;
        this.f10746i = i;
    }

    public final void m11030a() {
        if (this.f10739b != null) {
            this.f10739b.removeOnAttachStateChangeListener(this);
            this.f10739b.getViewTreeObserver().removeOnScrollChangedListener(this);
            this.f10739b = null;
        }
        this.f10740c = null;
        this.f10747j = false;
    }

    public final void onScrollChanged() {
        if (!ai.m9230b(this.f10739b)) {
            this.f10738a.mo2651a(true);
        }
    }

    public final void m11031b() {
        if (this.f10739b != null) {
            boolean z;
            int a;
            this.f10744g.set(0, 0, this.f10739b.getWidth(), this.f10739b.getHeight());
            this.f10740c.offsetDescendantRectToMyCoords(this.f10739b, this.f10744g);
            int i = this.f10746i;
            switch (this.f10745h) {
                case 3:
                case 4:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                a = this.f10741d.m28153a();
            } else {
                a = 0;
            }
            boolean contains = new Rect(0, this.f10742e.top, this.f10740c.getWidth(), this.f10740c.getHeight() - (a + i)).contains(this.f10744g);
            if (contains) {
                this.f10743f.set(0, 0, this.f10739b.getWidth(), this.f10739b.getHeight());
                ViewGroup viewGroup = (ViewGroup) this.f10741d.getParent();
                viewGroup.offsetDescendantRectToMyCoords(this.f10739b, this.f10743f);
                viewGroup.offsetRectIntoDescendantCoords(this.f10741d, this.f10743f);
                this.f10741d.m28159a(this.f10743f, this.f10745h);
                if (!this.f10747j) {
                    this.f10738a.mo2648a();
                }
            } else if (this.f10747j) {
                this.f10738a.mo2651a(false);
            }
            this.f10747j = contains;
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f10738a.mo2651a(true);
    }
}
