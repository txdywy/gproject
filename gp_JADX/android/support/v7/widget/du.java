package android.support.v7.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class du implements OnTouchListener {
    public final /* synthetic */ C0491do f3414a;

    du(C0491do c0491do) {
        this.f3414a = c0491do;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.f3414a.f3153K != null && this.f3414a.f3153K.isShowing() && x >= 0 && x < this.f3414a.f3153K.getWidth() && y >= 0 && y < this.f3414a.f3153K.getHeight()) {
            this.f3414a.f3149G.postDelayed(this.f3414a.f3145C, 250);
        } else if (action == 1) {
            this.f3414a.f3149G.removeCallbacks(this.f3414a.f3145C);
        }
        return false;
    }
}
