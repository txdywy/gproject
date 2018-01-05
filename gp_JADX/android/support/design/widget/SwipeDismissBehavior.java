package android.support.design.widget;

import android.support.v4.widget.bp;
import android.support.v4.widget.bs;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class SwipeDismissBehavior extends an {
    public bp f665b;
    public bz f666c;
    public boolean f667d;
    public float f668e = 0.0f;
    public boolean f669f;
    public int f670g = 2;
    public float f671h = 0.5f;
    public float f672i = 0.0f;
    public float f673j = 0.5f;
    public final bs f674k = new by(this);

    public boolean mo70a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f667d;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f667d = coordinatorLayout.m464a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.f667d;
                break;
            case 1:
            case 3:
                this.f667d = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.f665b == null) {
            bp a;
            if (this.f669f) {
                a = bp.m2243a((ViewGroup) coordinatorLayout, this.f668e, this.f674k);
            } else {
                a = bp.m2244a((ViewGroup) coordinatorLayout, this.f674k);
            }
            this.f665b = a;
        }
        return this.f665b.m2261a(motionEvent);
    }

    public final boolean mo71b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f665b == null) {
            return false;
        }
        this.f665b.m2265b(motionEvent);
        return true;
    }

    public boolean mo192a(View view) {
        return true;
    }

    static float m503a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }
}
