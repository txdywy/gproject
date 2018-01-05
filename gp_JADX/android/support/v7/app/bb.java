package android.support.v7.app;

import android.content.Context;
import android.support.v7.p041b.p042a.C0436b;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

final class bb extends ContentFrameLayout {
    public final /* synthetic */ aq f2326a;

    public bb(aq aqVar, Context context) {
        this.f2326a = aqVar;
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2326a.mo530a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            x = (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) ? true : 0;
            if (x != 0) {
                aq aqVar = this.f2326a;
                aqVar.m2415a(aqVar.m2433g(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0436b.m2650b(getContext(), i));
    }
}
