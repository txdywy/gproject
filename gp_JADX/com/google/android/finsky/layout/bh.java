package com.google.android.finsky.layout;

import android.widget.PopupWindow.OnDismissListener;
import com.squareup.leakcanary.C7582R;

final class bh implements OnDismissListener {
    public final /* synthetic */ bg f18523a;

    bh(bg bgVar) {
        this.f18523a = bgVar;
    }

    public final void onDismiss() {
        this.f18523a.f18522e.f18318p.setImageResource(C7582R.drawable.play_overflow_menu);
    }
}
