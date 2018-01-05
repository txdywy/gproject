package com.google.android.finsky.billing;

import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.q;
import android.support.v7.app.z;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.wallet.ui.common.a;
import java.util.List;

public final class com.google.android.finsky.billing.p extends com.google.android.finsky.billing.t
{

    p() {
        com.google.android.finsky.billing.t();
    }

    public static Bundle a(boolean p0, boolean p1) {
        v0 = new Bundle();
        v0.putBoolean("setWifiOnly", 1);
        v0.putBoolean("showWifiOnly", p0);
        v0.putBoolean("onMobileNetwork", p1);
        return v0;
    }

    public static com.google.android.finsky.billing.p a(Fragment p0, String p1, Bundle p2, com.google.android.finsky.d.w p3) {
        v0 = new com.google.android.finsky.billing.p();
        if (p0 == 0) {
            p2.putAll(com.google.android.finsky.billing.p.a(p1, p3));
            v0.f(p2);
            return v0;
        }
        if (p0 instanceof com.google.android.finsky.billing.u) {
            v0.a(p0, -1);
            p2.putAll(com.google.android.finsky.billing.p.a(p1, p3));
            v0.f(p2);
            return v0;
        }
        throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
    }

    public final com.google.android.finsky.billing.u W() {
        if (this.r != 0)
            v0 = (com.google.android.finsky.billing.u)this.r;
        else
            v0 = (com.google.android.finsky.billing.u)this.h();
        return v0;
    }

    protected final int X() {
        return 6334;
    }

    public final Dialog a(Bundle p0) {
        v3 = this.q.getBoolean("showWifiOnly");
        v4 = this.q.getBoolean("setWifiOnly");
        v5 = this.h();
        v6 = LayoutInflater.from(v5).inflate(2130968799, 0);
        if (v3 != 0)
            v1 = 2131953362;
        else if (this.q.getBoolean("onMobileNetwork"))
            v1 = 2131953358;
        else
            v1 = 2131953359;
        ((TextView)v6.findViewById(2131755686)).setText(v1);
        v0 = (CheckBox)v6.findViewById(2131755687);
        if (v3 != 0) {
            v0.setVisibility(0);
            if (p0 == 0)
                v0.setChecked(v4);
        }
        v1 = new com.google.android.finsky.billing.q(this, v3, v0, v4);
        if (com.google.android.finsky.m.a.q().a() && v5.getPackageManager().queryIntentActivities(new Intent("android.settings.WIFI_SETTINGS"), 65536).size() > 0)
            v0 = new com.google.android.finsky.billing.s(this);
        else
            v0 = 0;
        v4 = new com.google.android.wallet.ui.common.a(this.h(), 0);
        v4.a(2131953361);
        v4.a(v6);
        v4.a(2131953360, v1);
        v4.b(2131951799, new com.google.android.finsky.billing.r(this));
        if (v0 != 0 && this.h().getPackageManager().queryIntentActivities(new Intent("android.settings.WIFI_SETTINGS"), 65536).size() > 0) {
            if (v4.b != 0)
                v4.b.setNeutralButton(2131953143, v0);
            else {
                v4.a.a.m = v4.a.a.a.getText(2131953143);
                v4.a.a.n = v0;
            }
        }
        return v4.a();
    }

    public final void onCancel(DialogInterface p0) {
        this.W().V_();
        super.onCancel(p0);
    }

}
