package com.google.android.finsky.billing.common;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.flushlogs.C3129a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public abstract class C1647h extends C1646b implements ad {
    public C3129a f8575A;
    public String f8576B;
    public byte[] f8577C;
    public boolean f8578D;
    public C2495w f8579E;
    public ce f8580F = C2482j.m13283a(mo2368f());
    public C2471a f8581y;
    public C3982a f8582z;

    public abstract int mo2368f();

    public static void m9344a(Intent intent, String str) {
        intent.putExtra("authAccount", str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1351c) C3947d.m18649a(C1351c.class)).mo1734a(this);
        this.f8578D = this.f8582z.mo3875b();
        if (this.f8578D) {
            this.f8582z.mo3879f();
            finish();
            return;
        }
        this.f8576B = getIntent().getStringExtra("authAccount");
        if (this.f8576B == null) {
            FinskyLog.m21669e("authAccount argument not set.", new Object[0]);
        }
        this.f8579E = this.f8581y.m13180a(bundle, getIntent());
        this.f8577C = getIntent().getByteArrayExtra("LoggingFragmentActivity.serverLogsCookie");
        if (bundle == null) {
            this.f8579E.m13370a(new C2488p().m13345b(this).m13343a(this.f8577C));
        }
    }

    public void onBackPressed() {
        this.f8579E.m13379b(new C2475d(this).m13256a(600).m13258a(this.f8577C));
        super.onBackPressed();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f8579E.m13377a(bundle);
    }

    public void onResume() {
        super.onResume();
        this.f8575A.m16010c();
    }

    public void onPause() {
        super.onPause();
        this.f8575A.m16007a();
    }

    public void onDestroy() {
        if (this.f8578D) {
            super.onDestroy();
            return;
        }
        if (isFinishing() && this.f8579E != null) {
            this.f8579E.m13370a(new C2488p().m13345b(this).m13340a(603).m13343a(this.f8577C));
        }
        super.onDestroy();
    }

    public ce getPlayStoreUiElement() {
        return this.f8580F;
    }

    public ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}
