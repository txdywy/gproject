package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.C0434z;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;

public final class C2039p extends C1834t {
    public static C2039p m10725a(Fragment fragment, String str, Bundle bundle, C2495w c2495w) {
        Fragment c2039p = new C2039p();
        if (fragment != null) {
            if (fragment instanceof C1886u) {
                c2039p.m581a(fragment, -1);
            } else {
                throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
            }
        }
        bundle.putAll(C1834t.m9862a(str, c2495w));
        c2039p.m600f(bundle);
        return c2039p;
    }

    public static Bundle m10724a(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("setWifiOnly", true);
        bundle.putBoolean("showWifiOnly", z);
        bundle.putBoolean("onMobileNetwork", z2);
        return bundle;
    }

    public final Dialog mo143a(Bundle bundle) {
        OnClickListener c2096s;
        Context h;
        a aVar;
        Bundle bundle2 = this.f760q;
        boolean z = bundle2.getBoolean("showWifiOnly");
        boolean z2 = bundle2.getBoolean("setWifiOnly");
        boolean z3 = bundle2.getBoolean("onMobileNetwork");
        Context h2 = m603h();
        View inflate = LayoutInflater.from(h2).inflate(C7582R.layout.download_size_dialog, null);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.wifi_message);
        int i = z ? C7582R.string.use_wifi_warning : z3 ? C7582R.string.use_wifi_limit_on_mobile : C7582R.string.use_wifi_limit_on_wifi;
        textView.setText(i);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C7582R.id.wifi_checkbox);
        if (z) {
            checkBox.setVisibility(0);
            if (bundle == null) {
                checkBox.setChecked(z2);
            }
        }
        OnClickListener c2078q = new C2078q(this, z, checkBox, z2);
        OnClickListener c2079r = new C2079r(this);
        if (C1473m.f7980a.mo2258q().m11719a()) {
            if (h2.getPackageManager().queryIntentActivities(new Intent("android.settings.WIFI_SETTINGS"), 65536).size() > 0) {
                c2096s = new C2096s(this);
                h = m603h();
                aVar = new a(m603h(), (byte) 0);
                aVar.a(C7582R.string.use_wifi_title);
                aVar.a(inflate);
                aVar.a(C7582R.string.use_wifi_proceed_button, c2078q);
                aVar.b(C7582R.string.cancel, c2079r);
                if (c2096s != null) {
                    if (h.getPackageManager().queryIntentActivities(new Intent("android.settings.WIFI_SETTINGS"), 65536).size() > 0) {
                        if (aVar.b == null) {
                            aVar.b.setNeutralButton(C7582R.string.setup_wifi_button, c2096s);
                        } else {
                            C0434z c0434z = aVar.a;
                            c0434z.f2507a.f2479m = c0434z.f2507a.f2467a.getText(C7582R.string.setup_wifi_button);
                            c0434z.f2507a.f2480n = c2096s;
                        }
                    }
                }
                return aVar.a();
            }
        }
        c2096s = null;
        h = m603h();
        aVar = new a(m603h(), (byte) 0);
        aVar.a(C7582R.string.use_wifi_title);
        aVar.a(inflate);
        aVar.a(C7582R.string.use_wifi_proceed_button, c2078q);
        aVar.b(C7582R.string.cancel, c2079r);
        if (c2096s != null) {
            if (h.getPackageManager().queryIntentActivities(new Intent("android.settings.WIFI_SETTINGS"), 65536).size() > 0) {
                if (aVar.b == null) {
                    C0434z c0434z2 = aVar.a;
                    c0434z2.f2507a.f2479m = c0434z2.f2507a.f2467a.getText(C7582R.string.setup_wifi_button);
                    c0434z2.f2507a.f2480n = c2096s;
                } else {
                    aVar.b.setNeutralButton(C7582R.string.setup_wifi_button, c2096s);
                }
            }
        }
        return aVar.a();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo968W().V_();
        super.onCancel(dialogInterface);
    }

    public final C1886u mo968W() {
        if (this.f761r != null) {
            return (C1886u) this.f761r;
        }
        return (C1886u) m603h();
    }

    protected final int mo2460X() {
        return 6334;
    }
}
