package com.google.android.finsky.layout.structuredreviews;

import android.widget.PopupWindow.OnDismissListener;
import com.squareup.leakcanary.C7582R;

final class C3723e implements OnDismissListener {
    public final /* synthetic */ C3722d f18839a;

    C3723e(C3722d c3722d) {
        this.f18839a = c3722d;
    }

    public final void onDismiss() {
        this.f18839a.f18838c.f18825i.setImageResource(C7582R.drawable.play_overflow_menu);
    }
}
