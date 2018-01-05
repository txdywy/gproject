package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;

final class dt implements OnClickListener {
    public final /* synthetic */ dv f14433a;
    public final /* synthetic */ ReviewSnippetsModuleLayout f14434b;

    dt(ReviewSnippetsModuleLayout reviewSnippetsModuleLayout, dv dvVar) {
        this.f14434b = reviewSnippetsModuleLayout;
        this.f14433a = dvVar;
    }

    public final void onClick(View view) {
        if (this.f14434b.f14041b != null) {
            this.f14434b.f14041b.mo3072a(this.f14433a);
        }
    }
}
