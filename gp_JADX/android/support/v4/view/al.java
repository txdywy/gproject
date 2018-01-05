package android.support.v4.view;

import android.view.Display;
import android.view.View;

class al extends ak {
    al() {
    }

    public final int mo400k(View view) {
        return view.getLayoutDirection();
    }

    public final int mo401l(View view) {
        return view.getPaddingStart();
    }

    public final int mo402m(View view) {
        return view.getPaddingEnd();
    }

    public final void mo399a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public final int mo403n(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public final boolean mo404o(View view) {
        return view.isPaddingRelative();
    }

    public final Display mo405p(View view) {
        return view.getDisplay();
    }
}
