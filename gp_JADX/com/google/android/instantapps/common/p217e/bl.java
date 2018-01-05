package com.google.android.instantapps.common.p217e;

import android.os.Handler;
import com.google.android.gms.common.C5107g;

public final /* synthetic */ class bl implements Runnable {
    public final bk f29116a;
    public final bq f29117b;
    public final bo f29118c;

    public bl(bk bkVar, bq bqVar, bo boVar) {
        this.f29116a = bkVar;
        this.f29117b = bqVar;
        this.f29118c = boVar;
    }

    public final void run() {
        bk bkVar = this.f29116a;
        bq bqVar = this.f29117b;
        bo boVar = this.f29118c;
        Handler handler = new Handler(bkVar.f29114b.getMainLooper());
        C5107g a = C5107g.m23705a(bkVar.f29114b);
        bkVar.f29114b.getPackageManager();
        if (a.m23710a(bqVar.mo5144b())) {
            handler.post(new bm(boVar));
        } else {
            handler.post(new bn(boVar));
        }
    }
}
