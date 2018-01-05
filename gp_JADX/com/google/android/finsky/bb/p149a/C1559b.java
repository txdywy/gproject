package com.google.android.finsky.bb.p149a;

import android.content.Intent;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;

final class C1559b implements Runnable {
    public final /* synthetic */ Intent f8348a;
    public final /* synthetic */ C3748a f8349b;
    public final /* synthetic */ C2495w f8350c;
    public final /* synthetic */ C1558a f8351d;

    C1559b(C1558a c1558a, Intent intent, C3748a c3748a, C2495w c2495w) {
        this.f8351d = c1558a;
        this.f8348a = intent;
        this.f8349b = c3748a;
        this.f8350c = c2495w;
    }

    public final void run() {
        String str;
        if (this.f8348a == null) {
            str = null;
        } else {
            str = this.f8348a.getStringExtra("completionRedirectUrl");
        }
        if (str != null) {
            this.f8349b.mo3692b(str, this.f8350c);
        } else if (this.f8349b.mo3722y()) {
            this.f8349b.mo3646a(this.f8351d.f8340d.dn(), this.f8350c);
        }
    }
}
