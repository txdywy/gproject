package android.support.design.widget;

import android.animation.ValueAnimator;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.p018a.C0095a;
import android.support.v4.view.ai;
import android.view.ViewGroup.LayoutParams;

final class C0148h implements Callback {
    C0148h() {
    }

    public final boolean handleMessage(Message message) {
        C0138g c0138g;
        switch (message.what) {
            case 0:
                c0138g = (C0138g) message.obj;
                if (c0138g.f659e.getParent() == null) {
                    LayoutParams layoutParams = c0138g.f659e.getLayoutParams();
                    if (layoutParams instanceof aq) {
                        aq aqVar = (aq) layoutParams;
                        an c0162t = new C0162t(c0138g);
                        c0162t.f672i = SwipeDismissBehavior.m503a(0.1f);
                        c0162t.f673j = SwipeDismissBehavior.m503a(0.6f);
                        c0162t.f670g = 0;
                        c0162t.f666c = new C0152l(c0138g);
                        aqVar.m642a(c0162t);
                        aqVar.f800g = 80;
                    }
                    c0138g.f657c.addView(c0138g.f659e);
                }
                c0138g.f659e.f654b = new C0154m(c0138g);
                if (!ai.f1848a.mo409s(c0138g.f659e)) {
                    c0138g.f659e.f653a = new C0157o(c0138g);
                } else if (c0138g.m498d()) {
                    c0138g.m495b();
                } else {
                    c0138g.m497c();
                }
                return true;
            case 1:
                c0138g = (C0138g) message.obj;
                int i = message.arg1;
                if (c0138g.m498d() && c0138g.f659e.getVisibility() == 0) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(new int[]{0, c0138g.f659e.getHeight()});
                    valueAnimator.setInterpolator(C0095a.f421a);
                    valueAnimator.setDuration(250);
                    valueAnimator.addListener(new C0160r(c0138g, i));
                    valueAnimator.addUpdateListener(new C0149i(c0138g));
                    valueAnimator.start();
                } else {
                    c0138g.m496b(i);
                }
                return true;
            default:
                return false;
        }
    }
}
