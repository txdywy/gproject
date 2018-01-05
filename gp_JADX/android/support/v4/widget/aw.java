package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.squareup.haha.perflib.HprofParser;

final class aw implements AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout f2092a;

    aw(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2092a = swipeRefreshLayout;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f2092a.f2019d) {
            this.f2092a.f2004C.setAlpha(HprofParser.ROOT_UNKNOWN);
            this.f2092a.f2004C.start();
            if (this.f2092a.f2010I && this.f2092a.f2018c != null) {
                this.f2092a.f2018c.m2220a();
            }
            this.f2092a.f2029n = this.f2092a.f2037w.getTop();
            return;
        }
        this.f2092a.m2139a();
    }
}
