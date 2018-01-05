package com.google.android.finsky.billing.payments;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.a.a;
import com.google.android.wallet.common.pub.d;
import com.google.android.wallet.common.pub.i;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.ay;
import com.squareup.leakcanary.C7582R;

public abstract class C1924e extends C1076h implements d {
    public static Bundle m10270a(String str, ay ayVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("InstrumentManagerStep.tokens", ParcelableProto.m21671a((C0757i) ayVar));
        bundle.putInt("InstrumentManagerStep.theme_res_id", i);
        return bundle;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7582R.layout.instrument_manager_step, viewGroup, false);
    }

    public final void mo1410a(View view, Bundle bundle) {
        super.mo1410a(view, bundle);
        Bundle bundle2 = this.f760q;
        String string = bundle2.getString("authAccount");
        a.a = new C2044g(this, aa().am());
        com.google.android.wallet.common.c.a.a(C1473m.f7980a.bl());
        com.google.android.wallet.common.c.a.b(C1473m.f7980a.bm());
        if (m607j().mo281a((int) C7582R.id.instrument_manager_host) == null) {
            ay ayVar = (ay) ParcelableProto.m21673a(bundle2, "InstrumentManagerStep.tokens");
            m607j().mo284a().mo325a((int) C7582R.id.instrument_manager_host, com.google.android.wallet.instrumentmanager.c.a.a(C1473m.f7980a.mo2041U().mo1183b(string), ayVar.b, ayVar.c, new i(this.f760q.getInt("InstrumentManagerStep.theme_res_id")).a(), Bundle.EMPTY)).mo334c();
        }
    }

    public final void mo1346w() {
        a.a = null;
        super.mo1346w();
    }

    public static boolean m10271a(int i) {
        switch (i) {
            case 50:
                return true;
            case 51:
            case 52:
                return false;
            default:
                throw new IllegalStateException("Unexpected InstrumentManager resultCode: " + i);
        }
    }

    public final boolean mo968W() {
        return false;
    }

    public final String mo1406a(Resources resources) {
        return null;
    }

    public final void mo1405X() {
    }
}
