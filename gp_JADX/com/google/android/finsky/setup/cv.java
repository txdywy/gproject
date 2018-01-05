package com.google.android.finsky.setup;

import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class cv implements OnGlobalLayoutListener {
    public final /* synthetic */ cu f20962a;

    cv(cu cuVar) {
        this.f20962a = cuVar;
    }

    public final void onGlobalLayout() {
        cu cuVar = this.f20962a;
        Rect rect = new Rect();
        cuVar.f20958a.getWindowVisibleDisplayFrame(rect);
        int i = (rect.bottom - rect.top) + cuVar.f20960c;
        if (i != cuVar.f20959b) {
            int height = cuVar.f20958a.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                cuVar.f20961d.height = height - i2;
            } else {
                cuVar.f20961d.height = height;
            }
            cuVar.f20958a.requestLayout();
            cuVar.f20959b = i;
        }
    }
}
