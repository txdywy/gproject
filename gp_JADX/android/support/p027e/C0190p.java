package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.v4.view.ai;
import android.view.View;

final class C0190p extends AnimatorListenerAdapter {
    public boolean f1151a;
    public final /* synthetic */ View f1152b;
    public final /* synthetic */ Rect f1153c;
    public final /* synthetic */ int f1154d;
    public final /* synthetic */ int f1155e;
    public final /* synthetic */ int f1156f;
    public final /* synthetic */ int f1157g;

    C0190p(View view, Rect rect, int i, int i2, int i3, int i4) {
        this.f1152b = view;
        this.f1153c = rect;
        this.f1154d = i;
        this.f1155e = i2;
        this.f1156f = i3;
        this.f1157g = i4;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1151a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f1151a) {
            ai.m1825a(this.f1152b, this.f1153c);
            bq.m944a(this.f1152b, this.f1154d, this.f1155e, this.f1156f, this.f1157g);
        }
    }
}
