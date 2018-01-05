package com.google.android.finsky.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.support.v4.app.C0141p;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.os.C0327a;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.p111d.C2471a;
import com.squareup.leakcanary.C7582R;

public final class C1129r extends C1128e {
    public static final C2471a af = C1473m.f7980a.aR();
    public C1034s ag;

    public static void m6869a(ab abVar, Activity activity) {
        if (abVar.mo283a("bg_data_dialog") == null) {
            C1128e c1129r = new C1129r();
            if (activity instanceof C1034s) {
                c1129r.ag = (C1034s) activity;
            }
            new C1508k().m8858c((int) C7582R.string.background_data_prompt_title).m8862e((int) C7582R.string.background_data_prompt_cancel).m8856b(activity.getString(C7582R.string.background_data_error, new Object[]{C0955b.ab.m28964b()})).m8853a(false).m8849a(320, null, -1, -1, af.m13184a(null)).m8854a(c1129r);
            c1129r.m625a(abVar, "bg_data_dialog");
        }
    }

    public static void m6868a(ab abVar) {
        Fragment a = abVar.mo283a("bg_data_dialog");
        if (a != null) {
            ((C0141p) a).m626a(false);
        }
    }

    protected final void mo968W() {
        super.mo968W();
        if (this.ag != null) {
            this.ag.mo1229o();
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean m6870b(Context context) {
        if (C0327a.m1721a()) {
            return false;
        }
        for (NetworkInfo networkInfo : ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo()) {
            if (networkInfo != null && networkInfo.getDetailedState() == DetailedState.BLOCKED) {
                return C1473m.f7980a.aW().mo3370h();
            }
        }
        return false;
    }
}
