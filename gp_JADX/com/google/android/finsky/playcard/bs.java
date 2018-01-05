package com.google.android.finsky.playcard;

import android.widget.PopupWindow.OnDismissListener;
import com.squareup.leakcanary.C7582R;

final class bs implements OnDismissListener {
    public final /* synthetic */ bl f19693a;

    bs(bl blVar) {
        this.f19693a = blVar;
    }

    public final void onDismiss() {
        this.f19693a.f19663b.setImageResource(C7582R.drawable.play_overflow_menu);
    }
}
