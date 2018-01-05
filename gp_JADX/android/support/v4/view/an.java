package android.support.v4.view;

import android.view.View;

class an extends am {
    an() {
    }

    public final void mo408r(View view) {
        view.setAccessibilityLiveRegion(1);
    }

    public final void mo384a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public final boolean mo409s(View view) {
        return view.isLaidOut();
    }

    public final boolean mo410t(View view) {
        return view.isAttachedToWindow();
    }
}
