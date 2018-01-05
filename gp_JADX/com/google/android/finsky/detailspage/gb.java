package com.google.android.finsky.detailspage;

import android.widget.PopupWindow.OnDismissListener;
import com.squareup.leakcanary.C7582R;

final class gb implements OnDismissListener {
    public final /* synthetic */ ga f14615a;

    gb(ga gaVar) {
        this.f14615a = gaVar;
    }

    public final void onDismiss() {
        this.f14615a.f14614b.f14106o.setImageResource(C7582R.drawable.play_overflow_menu);
    }
}
