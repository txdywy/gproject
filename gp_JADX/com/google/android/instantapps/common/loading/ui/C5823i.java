package com.google.android.instantapps.common.loading.ui;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.google.android.instantapps.common.p217e.bj;

final /* synthetic */ class C5823i implements Runnable {
    public final C5822h f29290a;
    public final bj f29291b;

    C5823i(C5822h c5822h, bj bjVar) {
        this.f29290a = c5822h;
        this.f29291b = bjVar;
    }

    public final void run() {
        C5822h c5822h = this.f29290a;
        bj bjVar = this.f29291b;
        if (c5822h.f29286f.isShown() && c5822h.f29286f.m27217a() && c5822h.aB != 3 && c5822h.aB != 1) {
            c5822h.f29287g.animate().alpha(0.0f).setDuration((long) (bjVar.f29108f / 2)).start();
            Animation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 1, 0.5f, 1, 0.25f);
            scaleAnimation.setDuration((long) bjVar.f29108f);
            scaleAnimation.setFillAfter(true);
            c5822h.f29287g.startAnimation(scaleAnimation);
            c5822h.as.animate().alpha(0.0f).setDuration((long) bjVar.f29108f);
        }
    }
}
