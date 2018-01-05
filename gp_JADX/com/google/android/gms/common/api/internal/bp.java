package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.common.internal.zzbv;
import com.google.android.gms.internal.mq;
import com.google.android.gms.internal.mt;
import com.google.android.gms.internal.mx;
import com.google.android.gms.internal.zzedc;
import java.util.Set;

public final class bp extends mx implements C1632q, C1634r {
    public static C4931e f25763a = mq.f27193c;
    public final Context f25764b;
    public final Handler f25765c;
    public final C4931e f25766d;
    public Set f25767e;
    public bd f25768f;
    public mt f25769g;
    public br f25770h;

    public bp(Context context, Handler handler, bd bdVar) {
        this(context, handler, bdVar, f25763a);
    }

    public bp(Context context, Handler handler, bd bdVar, C4931e c4931e) {
        this.f25764b = context;
        this.f25765c = handler;
        this.f25768f = (bd) am.m23734a((Object) bdVar, (Object) "ClientSettings must not be null");
        this.f25767e = bdVar.f26005b;
        this.f25766d = c4931e;
    }

    public final void mo2362a(int i) {
        this.f25769g.mo4510e();
    }

    public final void mo2363a(Bundle bundle) {
        this.f25769g.mo4825a(this);
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        this.f25770h.mo4582b(connectionResult);
    }

    public final void mo4589a(zzedc com_google_android_gms_internal_zzedc) {
        this.f25765c.post(new bq(this, com_google_android_gms_internal_zzedc));
    }

    static /* synthetic */ void m23487a(bp bpVar, zzedc com_google_android_gms_internal_zzedc) {
        ConnectionResult connectionResult = com_google_android_gms_internal_zzedc.f27837b;
        if (connectionResult.m23264b()) {
            zzbv com_google_android_gms_common_internal_zzbv = com_google_android_gms_internal_zzedc.f27838c;
            ConnectionResult connectionResult2 = com_google_android_gms_common_internal_zzbv.f26068c;
            if (connectionResult2.m23264b()) {
                bpVar.f25770h.mo4581a(com_google_android_gms_common_internal_zzbv.m23861a(), bpVar.f25767e);
            } else {
                String valueOf = String.valueOf(connectionResult2);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                bpVar.f25770h.mo4582b(connectionResult2);
            }
        } else {
            bpVar.f25770h.mo4582b(connectionResult);
        }
        bpVar.f25769g.mo4510e();
    }
}
