package com.google.android.finsky.stream.controllers.assist.security;

import android.widget.Toast;
import com.google.android.finsky.utils.bb;
import com.squareup.leakcanary.C7582R;

final class C4337r implements Runnable {
    public final /* synthetic */ C4335p f21824a;

    C4337r(C4335p c4335p) {
        this.f21824a = c4335p;
    }

    public final void run() {
        C4325v c4325v = this.f21824a;
        bb.m21791a();
        if (!c4325v.f21818a) {
            c4325v.f21818a = true;
            Toast.makeText(c4325v.h, C7582R.string.myapps_security_scanning_timed_out, 0).show();
            c4325v.mo4121e();
        }
    }
}
