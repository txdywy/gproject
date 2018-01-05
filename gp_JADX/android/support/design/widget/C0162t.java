package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

final class C0162t extends SwipeDismissBehavior {
    public final /* synthetic */ C0138g f979a;

    C0162t(C0138g c0138g) {
        this.f979a = c0138g;
    }

    public final boolean mo192a(View view) {
        return view instanceof C0137x;
    }

    private final boolean m791a(CoordinatorLayout coordinatorLayout, C0137x c0137x, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (coordinatorLayout.m464a((View) c0137x, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    br.m708a().m709a(this.f979a.f664j);
                    break;
                }
                break;
            case 1:
            case 3:
                br.m708a().m713b(this.f979a.f664j);
                break;
        }
        return super.mo70a(coordinatorLayout, c0137x, motionEvent);
    }
}
