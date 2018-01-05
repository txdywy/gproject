package com.google.android.libraries.play.entertainment.story;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.wireless.android.finsky.dfe.g.a.af;

final class aw implements OnClickListener {
    public final /* synthetic */ af[] f30450a;
    public final /* synthetic */ int f30451b;
    public final /* synthetic */ av f30452c;

    aw(av avVar, af[] afVarArr, int i) {
        this.f30452c = avVar;
        this.f30450a = afVarArr;
        this.f30451b = i;
    }

    public final void onClick(View view) {
        if (this.f30450a == this.f30452c.f30441d) {
            this.f30452c.m28274a(this.f30451b);
        }
    }
}
