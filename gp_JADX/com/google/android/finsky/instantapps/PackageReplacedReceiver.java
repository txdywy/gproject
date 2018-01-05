package com.google.android.finsky.instantapps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p221d.p222a.C5710a;

public class PackageReplacedReceiver extends BroadcastReceiver {
    public C5710a f17318a;
    public bf f17319b;

    public void onReceive(Context context, Intent intent) {
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3510a(this);
        this.f17318a.mo5136a(2201);
        PhenotypeUpdateService.m16867b(context);
        InstantAppHygieneService.m16860a(context, ((Long) this.f17319b.mo5158a()).longValue());
        this.f17318a.mo5136a(2202);
    }
}
