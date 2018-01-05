package com.google.android.wallet.clientlog;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

public final class C6540d implements OnGlobalLayoutListener, OnScrollChangedListener {
    public final View f32631a;
    public LogContext f32632b;
    public long f32633c;
    public final int f32634d;
    public String f32635e;
    public boolean f32636f;
    public final Rect f32637g;

    public C6540d(View view) {
        this(view, 0);
    }

    public C6540d(View view, int i) {
        this.f32635e = "";
        this.f32637g = new Rect();
        this.f32631a = view;
        this.f32634d = i;
    }

    public final void m29713a() {
        if (!this.f32636f && this.f32632b != null && C6537a.m29695a(this.f32632b.m29671b(), 1001) && this.f32633c != 0) {
            ViewTreeObserver viewTreeObserver = this.f32631a.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
        }
    }

    public final void onGlobalLayout() {
        m29712c();
    }

    public final void onScrollChanged() {
        m29712c();
    }

    private final void m29712c() {
        if (!this.f32636f && this.f32631a.isShown() && this.f32631a.getGlobalVisibleRect(this.f32637g)) {
            if (this.f32634d == 0) {
                C6537a.m29704c(this.f32632b, this.f32633c);
            } else {
                C6537a.m29683a(this.f32632b, this.f32634d, this.f32635e, this.f32633c);
            }
            this.f32636f = true;
            ViewTreeObserver viewTreeObserver = this.f32631a.getViewTreeObserver();
            viewTreeObserver.removeGlobalOnLayoutListener(this);
            viewTreeObserver.removeOnScrollChangedListener(this);
        }
    }

    public final Bundle m29715b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("impressionLogged", this.f32636f);
        return bundle;
    }

    public final void m29714a(Bundle bundle) {
        this.f32636f = bundle.getBoolean("impressionLogged");
    }
}
