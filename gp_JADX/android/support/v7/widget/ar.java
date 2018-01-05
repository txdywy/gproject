package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.aq;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

final class ar extends PopupWindow {
    public static final boolean f3121a = (VERSION.SDK_INT < 21);
    public boolean f3122b;

    public ar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        hc a = hc.m3769a(context, attributeSet, C0403j.PopupWindow, i, i2);
        if (a.m3782f(C0403j.PopupWindow_overlapAnchor)) {
            boolean a2 = a.m3772a(C0403j.PopupWindow_overlapAnchor, false);
            if (f3121a) {
                this.f3122b = a2;
            } else {
                aq.m2197a((PopupWindow) this, a2);
            }
        }
        setBackgroundDrawable(a.m3771a(C0403j.PopupWindow_android_popupBackground));
        a.f3558b.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (f3121a && this.f3122b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (f3121a && this.f3122b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        int height;
        if (f3121a && this.f3122b) {
            height = i2 - view.getHeight();
        } else {
            height = i2;
        }
        super.update(view, i, height, i3, i4);
    }
}
