package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

final class C0183i extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup f1147a;
    public final /* synthetic */ BitmapDrawable f1148b;
    public final /* synthetic */ View f1149c;
    public final /* synthetic */ float f1150d;

    C0183i(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
        this.f1147a = viewGroup;
        this.f1148b = bitmapDrawable;
        this.f1149c = view;
        this.f1150d = f;
    }

    public final void onAnimationEnd(Animator animator) {
        bq.m941a(this.f1147a).mo229b(this.f1148b);
        bq.m942a(this.f1149c, this.f1150d);
    }
}
