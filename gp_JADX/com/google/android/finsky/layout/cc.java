package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;

final class cc implements OnClickListener {
    public final /* synthetic */ VpaSelectAllEntryLayout f18567a;

    cc(VpaSelectAllEntryLayout vpaSelectAllEntryLayout) {
        this.f18567a = vpaSelectAllEntryLayout;
    }

    public final void onClick(View view) {
        if (this.f18567a.f18418b != null) {
            this.f18567a.f18418b.a_(this.f18567a.f18417a.isChecked());
        }
    }
}
