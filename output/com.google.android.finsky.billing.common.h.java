package com.google.android.finsky.billing.common;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.flushlogs.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.billing.common.h extends com.google.android.finsky.billing.common.b implements com.google.android.finsky.d.ad
{

    public com.google.android.finsky.flushlogs.a A;
    public String B;
    public byte[] C;
    public boolean D;
    public com.google.android.finsky.d.w E;
    public com.google.wireless.android.a.a.a.a.ce F;
    public com.google.android.finsky.d.a y;
    public com.google.android.finsky.recoverymode.a z;

    h() {
        com.google.android.finsky.billing.common.b();
        this.F = com.google.android.finsky.d.j.a(this.f());
    }

    public static void a(Intent p0, String p1) {
        p0.putExtra("authAccount", p1);
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    public abstract int f();

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.F;
    }

    public void onBackPressed() {
        this.E.b(new com.google.android.finsky.d.d(this).a(600).a(this.C));
        super.onBackPressed();
    }

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.billing.common.c)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.common.c)).a(this);
        this.D = this.z.b();
        if (this.D != 0) {
            this.z.f();
            this.finish();
        }
        else {
            this.B = this.getIntent().getStringExtra("authAccount");
            if (this.B == 0)
                FinskyLog.e("authAccount argument not set.", new Object[0]);
            this.E = this.y.a(p0, this.getIntent());
            this.C = this.getIntent().getByteArrayExtra("LoggingFragmentActivity.serverLogsCookie");
            if (p0 == 0)
                this.E.a(new com.google.android.finsky.d.p().b(this).a(this.C));
        }
    }

    public void onDestroy() {
        if (this.D != 0)
            super.onDestroy();
        else {
            if (this.isFinishing() && this.E != 0)
                this.E.a(new com.google.android.finsky.d.p().b(this).a(603).a(this.C));
            super.onDestroy();
        }
    }

    public void onPause() {
        super.onPause();
        this.A.a();
    }

    public void onResume() {
        super.onResume();
        this.A.c();
    }

    public void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        this.E.a(p0);
    }

}
