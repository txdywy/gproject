package com.google.android.finsky.tos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dp.C2866c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public class TosAckedReceiver extends BroadcastReceiver {
    public boolean f23326a;
    public C2866c f23327b;
    public ab f23328c;
    public C4569e f23329d;
    public C1287h f23330e;

    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            FinskyLog.m21665c("Invalid Broadcast: requires extras.", new Object[0]);
            return;
        }
        Bundle extras = intent.getExtras();
        String string = extras.getString("TosAckedReceiver.account");
        if (string == null) {
            FinskyLog.m21665c("Invalid Broadcast: no account.", new Object[0]);
            return;
        }
        if (!this.f23326a) {
            ((C1446i) C3947d.m18649a(C1446i.class)).mo1962a(this);
            this.f23326a = true;
        }
        Boolean valueOf = extras.containsKey("TosAckedReceiver.optIn") ? Boolean.valueOf(extras.getBoolean("TosAckedReceiver.optIn")) : null;
        C1254c a = this.f23330e.mo2015a();
        if (a == null) {
            FinskyLog.m21667d("Could not get DFE API, returning.", new Object[0]);
        } else {
            this.f23327b.m15108a(a, false, true, new C4565a(this, string, valueOf));
        }
    }
}
