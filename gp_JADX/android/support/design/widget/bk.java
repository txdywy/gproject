package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

public class bk extends cp {
    public Runnable f550h;
    public OverScroller f551i;
    public boolean f552j;
    public int f553k = -1;
    public int f554l;
    public int f555m = -1;
    public VelocityTracker f556n;

    public bk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean mo70a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f555m < 0) {
            this.f555m = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f552j) {
            return true;
        }
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f552j = false;
                int x = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (mo85b() && coordinatorLayout.m464a(view, x, y)) {
                    this.f554l = y;
                    this.f553k = motionEvent.getPointerId(0);
                    m361d();
                    break;
                }
            case 1:
            case 3:
                this.f552j = false;
                this.f553k = -1;
                if (this.f556n != null) {
                    this.f556n.recycle();
                    this.f556n = null;
                    break;
                }
                break;
            case 2:
                y = this.f553k;
                if (y != -1) {
                    y = motionEvent.findPointerIndex(y);
                    if (y != -1) {
                        y = (int) motionEvent.getY(y);
                        if (Math.abs(y - this.f554l) > this.f555m) {
                            this.f552j = true;
                            this.f554l = y;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.f556n != null) {
            this.f556n.addMovement(motionEvent);
        }
        return this.f552j;
    }

    public final boolean mo71b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f555m < 0) {
            this.f555m = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.m464a(view, (int) motionEvent.getX(), y) && mo85b()) {
                    this.f554l = y;
                    this.f553k = motionEvent.getPointerId(0);
                    m361d();
                    break;
                }
                return false;
                break;
            case 1:
                if (this.f556n != null) {
                    this.f556n.addMovement(motionEvent);
                    this.f556n.computeCurrentVelocity(1000);
                    float yVelocity = this.f556n.getYVelocity(this.f553k);
                    int i = -mo74a(view);
                    if (this.f550h != null) {
                        view.removeCallbacks(this.f550h);
                        this.f550h = null;
                    }
                    if (this.f551i == null) {
                        this.f551i = new OverScroller(view.getContext());
                    }
                    this.f551i.fling(0, mo86c(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (!this.f551i.computeScrollOffset()) {
                        mo75a(coordinatorLayout, view);
                        break;
                    }
                    this.f550h = new bl(this, coordinatorLayout, view);
                    ai.m1830a(view, this.f550h);
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f553k);
                if (findPointerIndex != -1) {
                    findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f554l - findPointerIndex;
                    if (!this.f552j && Math.abs(i2) > this.f555m) {
                        this.f552j = true;
                        i2 = i2 > 0 ? i2 - this.f555m : i2 + this.f555m;
                    }
                    if (this.f552j) {
                        this.f554l = findPointerIndex;
                        m367b(coordinatorLayout, view, i2, mo83b(view), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
        }
        this.f552j = false;
        this.f553k = -1;
        if (this.f556n != null) {
            this.f556n.recycle();
            this.f556n = null;
        }
        if (this.f556n != null) {
            this.f556n.addMovement(motionEvent);
        }
        return true;
    }

    final int a_(CoordinatorLayout coordinatorLayout, View view, int i) {
        return mo73a(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int mo73a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int c = mo86c();
        if (i2 == 0 || c < i2 || c > i3) {
            return 0;
        }
        int a = bn.m702a(i, i2, i3);
        if (c == a) {
            return 0;
        }
        a_(a);
        return c - a;
    }

    int mo72a() {
        return mo86c();
    }

    final int m367b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return mo73a(coordinatorLayout, view, mo72a() - i, i2, i3);
    }

    void mo75a(CoordinatorLayout coordinatorLayout, View view) {
    }

    boolean mo85b() {
        return false;
    }

    int mo83b(View view) {
        return -view.getHeight();
    }

    int mo74a(View view) {
        return view.getHeight();
    }

    private final void m361d() {
        if (this.f556n == null) {
            this.f556n = VelocityTracker.obtain();
        }
    }
}
