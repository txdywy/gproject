package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;

final class bf implements OnClickListener {
    public final /* synthetic */ ReviewItemLayout f18517a;

    bf(ReviewItemLayout reviewItemLayout) {
        this.f18517a = reviewItemLayout;
    }

    public final void onClick(View view) {
        if (this.f18517a.f18320r != null) {
            this.f18517a.f18320r.mo1512a(this.f18517a);
        }
    }
}
