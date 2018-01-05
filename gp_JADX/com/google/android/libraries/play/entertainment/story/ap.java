package com.google.android.libraries.play.entertainment.story;

import android.view.View;
import com.google.android.agera.ac;
import com.google.android.agera.ak;
import com.google.android.agera.am;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p347g.C6088a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.wireless.android.finsky.dfe.g.a.an;

final class ap implements am {
    public final /* synthetic */ al f30395a;

    ap(al alVar) {
        this.f30395a = alVar;
    }

    public final void ad_() {
        ak akVar = (ak) ((ac) C6116b.m28100a(this.f30395a.f30385g)).i_();
        if (akVar.m5595a()) {
            CharSequence charSequence;
            an anVar = (an) akVar.m5596b();
            if (anVar.b == null) {
                charSequence = null;
            } else {
                Object obj = anVar.b.d;
            }
            this.f30395a.m603h().setTitle(charSequence);
            this.f30395a.f30383e = anVar.d;
            C6088a.m28049W().m15515r().mo3227a((C2980a) C6116b.m28100a(this.f30395a.f30382d), anVar.d);
            ((StoryFlowLayout) C6116b.m28100a(this.f30395a.ag)).getToolbar().setTitle(charSequence);
            ((View) C6116b.m28100a(this.f30395a.ah)).setVisibility(8);
            if (anVar.b == null || anVar.b.b.length == 0) {
                al.f30380b.m28058b(null, "Empty response for story '%s'", this.f30395a.f30384f);
                ((View) C6116b.m28100a(this.f30395a.ai)).setVisibility(0);
                return;
            }
            ((View) C6116b.m28100a(this.f30395a.ai)).setVisibility(8);
            return;
        }
        if ((akVar == ak.f5662a ? 1 : 0) != 0) {
            ((View) C6116b.m28100a(this.f30395a.ah)).setVisibility(0);
            ((View) C6116b.m28100a(this.f30395a.ai)).setVisibility(8);
            return;
        }
        al.f30380b.m28058b(akVar.m5598d(), "Error loading story '%s'", this.f30395a.f30384f);
        ((View) C6116b.m28100a(this.f30395a.ah)).setVisibility(8);
        ((View) C6116b.m28100a(this.f30395a.ai)).setVisibility(0);
    }
}
