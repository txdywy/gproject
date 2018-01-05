package com.google.android.libraries.play.entertainment.story;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.android.libraries.play.entertainment.p351m.C6122h;

final class C6179w extends C6176x {
    public final /* synthetic */ boolean f30696a;
    public final /* synthetic */ int f30697b;
    public final /* synthetic */ boolean f30698c;
    public final /* synthetic */ boolean f30699d;
    public final /* synthetic */ boolean f30700e;
    public final /* synthetic */ int f30701f;
    public final /* synthetic */ int f30702g;
    public final /* synthetic */ int f30703h;
    public final /* synthetic */ int f30704i;
    public final /* synthetic */ float f30705j;
    public final /* synthetic */ int f30706k;
    public final /* synthetic */ int f30707l;
    public final /* synthetic */ int f30708m;
    public final /* synthetic */ int f30709n;
    public final /* synthetic */ float f30710o;
    public final /* synthetic */ MediaPlayerOverlayView f30711p;

    C6179w(MediaPlayerOverlayView mediaPlayerOverlayView, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, int i5, float f, int i6, int i7, int i8, int i9, float f2) {
        this.f30711p = mediaPlayerOverlayView;
        this.f30696a = z;
        this.f30697b = i;
        this.f30698c = z2;
        this.f30699d = z3;
        this.f30700e = z4;
        this.f30701f = i2;
        this.f30702g = i3;
        this.f30703h = i4;
        this.f30704i = i5;
        this.f30705j = f;
        this.f30706k = i6;
        this.f30707l = i7;
        this.f30708m = i8;
        this.f30709n = i9;
        this.f30710o = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2 = 1.0f;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f30696a) {
            this.f30711p.m28154a(this.f30697b == 5 ? floatValue : 1.0f - floatValue);
        }
        if (this.f30698c) {
            MediaPlayerOverlayView mediaPlayerOverlayView = this.f30711p;
            if (this.f30697b == 5) {
                f = 1.0f - floatValue;
            } else {
                f = floatValue;
            }
            mediaPlayerOverlayView.m28162b(f);
        }
        if (this.f30699d || this.f30700e) {
            if (this.f30699d) {
                f = 1.0f - floatValue;
            } else {
                f = 0.0f;
            }
            if (this.f30700e) {
                f2 = this.f30697b == 3 ? 1.0f - floatValue : floatValue;
            }
            this.f30711p.m28155a(f, f2);
        }
        this.f30711p.m28158a(this.f30701f, this.f30702g, this.f30703h, this.f30704i, this.f30705j, this.f30706k, this.f30707l, this.f30708m, this.f30709n, this.f30710o, floatValue);
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f30690q) {
            MediaPlayerOverlayView mediaPlayerOverlayView;
            if (this.f30697b == 7) {
                mediaPlayerOverlayView = this.f30711p;
                if (mediaPlayerOverlayView.f30324h.isEmpty()) {
                    mediaPlayerOverlayView.m28166c(false);
                } else {
                    mediaPlayerOverlayView.m28171g();
                }
            } else if (this.f30697b == 5) {
                mediaPlayerOverlayView = this.f30711p;
                mediaPlayerOverlayView.m28170f();
                mediaPlayerOverlayView.m28167d(true);
                mediaPlayerOverlayView.m28173i();
                C6122h.m28131a(mediaPlayerOverlayView.f30338w, MediaPlayerOverlayView.f30305i);
                mediaPlayerOverlayView.m28157a(6);
            } else {
                this.f30711p.m28172h();
            }
        }
    }
}
