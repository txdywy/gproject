package com.google.android.finsky.cu;

import android.support.v4.app.ad;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.utils.bb;

final class C2416c implements ad {
    public final /* synthetic */ C3748a f11725a;

    C2416c(C3748a c3748a) {
        this.f11725a = c3748a;
    }

    public final void mo1358a() {
        C2417d c2417d = C2415b.f11723a;
        bb.m21791a();
        c2417d.f11728c.clear();
        c2417d = C2415b.f11723a;
        switch (c2417d.f11727b.f11717a) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                c2417d.f11727b.stop();
                break;
        }
        C2415b.f11723a.m12129a();
        this.f11725a.mo3686b((ad) this);
    }
}
