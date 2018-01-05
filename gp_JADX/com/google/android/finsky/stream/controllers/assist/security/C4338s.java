package com.google.android.finsky.stream.controllers.assist.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.finsky.utils.bb;
import com.squareup.leakcanary.C7582R;

final class C4338s extends BroadcastReceiver {
    public final /* synthetic */ C4335p f21825a;

    C4338s(C4335p c4335p) {
        this.f21825a = c4335p;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("success", false);
        C4325v c4325v = this.f21825a;
        bb.m21791a();
        if (!c4325v.f21818a) {
            c4325v.f21818a = true;
            if (!booleanExtra) {
                Toast.makeText(c4325v.h, C7582R.string.myapps_security_scanning_timed_out, 0).show();
            }
            c4325v.mo4121e();
        }
    }
}
