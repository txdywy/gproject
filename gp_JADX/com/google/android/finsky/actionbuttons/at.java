package com.google.android.finsky.actionbuttons;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import com.google.android.finsky.at.C1508k;
import com.squareup.leakcanary.C7582R;

public final class at {
    public static void m5929a(String str, Fragment fragment, boolean z, boolean z2, boolean z3) {
        ab abVar = fragment.f730B;
        if (abVar.mo283a("uninstall_confirm") == null) {
            int i;
            int i2 = C7582R.string.ok;
            int i3 = C7582R.string.cancel;
            if (!z2) {
                i = C7582R.string.uninstall_non_owned_app_msg;
            } else if (z) {
                i = C7582R.string.uninstall_system_updates_msg;
            } else if (z3) {
                i = C7582R.string.uninstall_app_msg_active_subscriptions;
                i2 = C7582R.string.yes;
                i3 = C7582R.string.no;
            } else {
                i = C7582R.string.uninstall_app_msg;
            }
            C1508k c1508k = new C1508k();
            c1508k.m8848a(i).m8860d(i2).m8862e(i3);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", str);
            c1508k.m8851a(fragment, 1, bundle);
            c1508k.mo2272a().m625a(abVar, "uninstall_confirm");
        }
    }
}
