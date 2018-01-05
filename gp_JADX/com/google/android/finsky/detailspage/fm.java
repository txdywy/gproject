package com.google.android.finsky.detailspage;

import android.widget.PopupWindow.OnDismissListener;
import com.squareup.leakcanary.C7582R;

final class fm implements OnDismissListener {
    public final /* synthetic */ fl f14582a;

    fm(fl flVar) {
        this.f14582a = flVar;
    }

    public final void onDismiss() {
        this.f14582a.f14581a.f14089j.setImageResource(C7582R.drawable.play_overflow_menu);
    }
}
