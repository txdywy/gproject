package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.C5096b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.bk;

final class cr implements Runnable {
    public final cq f25819a;
    public final /* synthetic */ cp f25820b;

    cr(cp cpVar, cq cqVar) {
        this.f25820b = cpVar;
        this.f25819a = cqVar;
    }

    public final void run() {
        if (this.f25820b.f25800d) {
            ConnectionResult connectionResult = this.f25819a.f25818b;
            if (connectionResult.m23263a()) {
                this.f25820b.a.startActivityForResult(GoogleApiActivity.m23270a(this.f25820b.m23279a(), connectionResult.f25612d, this.f25819a.f25817a, false), 1);
            } else if (C5095d.m23658a(connectionResult.f25611c)) {
                Activity a = this.f25820b.m23279a();
                bg bgVar = this.f25820b.a;
                int i = connectionResult.f25611c;
                OnCancelListener onCancelListener = this.f25820b;
                Dialog a2 = C5096b.m23666a((Context) a, i, new bk(C5095d.m23656a(a, i, "d"), bgVar), onCancelListener);
                if (a2 != null) {
                    C5096b.m23668a(a, a2, "GooglePlayServicesErrorDialog", onCancelListener);
                }
            } else if (connectionResult.f25611c == 18) {
                C5096b.m23667a(this.f25820b.m23279a().getApplicationContext(), new cs(this, C5096b.m23665a(this.f25820b.m23279a(), this.f25820b)));
            } else {
                this.f25820b.mo4599a(connectionResult, this.f25819a.f25817a);
            }
        }
    }
}
