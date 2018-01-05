package com.google.android.finsky.billing.payments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.billing.lightpurchase.d.g;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.c.a;
import com.google.android.wallet.common.pub.a.a;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.instrumentmanager.c.a;
import com.google.wireless.android.finsky.a.a.ay;

public final class com.google.android.finsky.billing.payments.e extends com.google.android.finsky.billing.lightpurchase.d.h implements com.google.android.wallet.common.pub.d
{

    e() {
        com.google.android.finsky.billing.lightpurchase.d.h();
    }

    public static Bundle a(String p0, com.google.wireless.android.finsky.a.a.ay p1, int p2) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v0.putParcelable("InstrumentManagerStep.tokens", ParcelableProto.a(p1));
        v0.putInt("InstrumentManagerStep.theme_res_id", p2);
        return v0;
    }

    public static boolean a(int p0) {
  0:    switch (p0) {
            case 50:
 30:            v0 = 1;
 31:            return v0;
            case 51:
 34:            break;
            case 52:
 34:            break;
            default:
 29:            throw new IllegalStateException(52 + "Unexpected InstrumentManager resultCode: " + p0);
        }
 32:    v0 = 0;
 33:    goto 31;
    }

    public final boolean W() {
        return 0;
    }

    public final void X() {
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        return p0.inflate(2130969018, p1, 0);
    }

    public final String a(Resources p0) {
        return 0;
    }

    public final void a(View p0, Bundle p1) {
        super.a(p0, p1);
        com.google.android.wallet.common.pub.a.a.a = new com.google.android.finsky.billing.payments.g(this, this.aa().am());
        com.google.android.wallet.common.c.a.a(com.google.android.finsky.m.a.bl());
        com.google.android.wallet.common.c.a.b(com.google.android.finsky.m.a.bm());
        if (this.j().a(2131756103) == 0) {
            v0 = (com.google.wireless.android.finsky.a.a.ay)ParcelableProto.a(this.q, "InstrumentManagerStep.tokens");
            this.j().a().a(2131756103, com.google.android.wallet.instrumentmanager.c.a.a(com.google.android.finsky.m.a.U().b(this.q.getString("authAccount")), v0.b, v0.c, new com.google.android.wallet.common.pub.i(this.q.getInt("InstrumentManagerStep.theme_res_id")).a(), Bundle.EMPTY)).c();
        }
    }

    public final void w() {
        com.google.android.wallet.common.pub.a.a.a = 0;
        super.w();
    }

}
