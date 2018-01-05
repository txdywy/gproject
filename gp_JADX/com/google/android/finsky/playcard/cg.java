package com.google.android.finsky.playcard;

import android.view.View;
import android.view.View.OnClickListener;

final class cg implements OnClickListener {
    public final /* synthetic */ PlayCardViewRate f19720a;

    cg(PlayCardViewRate playCardViewRate) {
        this.f19720a = playCardViewRate;
    }

    public final void onClick(View view) {
        if (this.f19720a.f19524j != null) {
            this.f19720a.f19524j.mo4252a();
        }
    }
}
