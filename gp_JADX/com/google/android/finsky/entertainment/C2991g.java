package com.google.android.finsky.entertainment;

import android.accounts.Account;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C2989f;
import com.google.android.libraries.play.entertainment.p192l.C6101b;
import com.google.android.libraries.play.entertainment.p192l.C6113c;
import com.google.android.libraries.play.entertainment.p344d.C6056i;
import com.google.android.libraries.play.entertainment.p344d.C6062r;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.wireless.android.finsky.dfe.g.a.an;

final class C2991g extends C2983e {
    public final C1287h f15674a;

    public C2991g(C2989f c2989f, C1287h c1287h) {
        super(c2989f);
        this.f15674a = c1287h;
    }

    public final C6056i mo3213a(C6113c c6113c) {
        C6101b c6101b = c6113c.f30285b;
        C6056i c6062r = new C6062r();
        if (c6101b.mo5294a() == 1) {
            if (an.class == an.class) {
                C1254c a = this.f15674a.mo2016a(((Account) C6116b.m28100a(c6101b.f30259a)).name);
                String b = m15420b(c6101b);
                Object c2992h = new C2992h(c6101b, c6062r);
                a.mo1660m(b, c2992h, c2992h);
            }
            return c6062r;
        }
        String valueOf = String.valueOf(c6101b);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unexpected blobId type: ").append(valueOf).toString());
    }

    public final void mo3215a(C6101b c6101b) {
        this.f15674a.mo2016a(((Account) C6116b.m28100a(c6101b.f30259a)).name).mo1651f(m15420b(c6101b));
    }
}
