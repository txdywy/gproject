package android.support.design.widget.transformation;

import android.support.design.widget.p024a.C0136a;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class C0163a implements OnPreDrawListener {
    public final /* synthetic */ View f988a;
    public final /* synthetic */ int f989b;
    public final /* synthetic */ C0136a f990c;
    public final /* synthetic */ ExpandableBehavior f991d;

    C0163a(ExpandableBehavior expandableBehavior, View view, int i, C0136a c0136a) {
        this.f991d = expandableBehavior;
        this.f988a = view;
        this.f989b = i;
        this.f990c = c0136a;
    }

    public final boolean onPreDraw() {
        this.f988a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f991d.f980a == this.f989b) {
            this.f991d.mo193a((View) this.f990c, this.f988a, this.f990c.mo120a(), false);
        }
        return false;
    }
}
