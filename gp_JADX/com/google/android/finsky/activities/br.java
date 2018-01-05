package com.google.android.finsky.activities;

import android.graphics.Rect;

final /* synthetic */ class br implements Runnable {
    public final bq f6569a;
    public final Rect f6570b;

    br(bq bqVar, Rect rect) {
        this.f6569a = bqVar;
        this.f6570b = rect;
    }

    public final void run() {
        bq bqVar = this.f6569a;
        bqVar.f6563n.m16051a(this.f6570b);
        bqVar.f6564o = cg.SHOW_WITHOUT_ANIMATION;
    }
}
