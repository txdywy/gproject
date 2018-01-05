package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1613m;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;

public final class C1835g extends C1834t {
    public static C1835g m9869a(Fragment fragment, String str, long j, C2495w c2495w) {
        Bundle a = C1834t.m9862a(str, c2495w);
        a.putLong("installationSize", j);
        Fragment c1835g = new C1835g();
        if (fragment != null) {
            if (fragment instanceof C1886u) {
                c1835g.m581a(fragment, -1);
            } else {
                throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
            }
        }
        c1835g.m600f(a);
        return c1835g;
    }

    public final Dialog mo143a(Bundle bundle) {
        int intValue;
        long j = this.f760q.getLong("installationSize");
        Context h = m603h();
        C1552e dj = C1473m.f7980a.dj();
        if (dj.mo2294a(12633090)) {
            this.ah.m13370a(new C2488p().m13345b(this));
        }
        boolean a = dj.mo2294a(12641184);
        a aVar = new a(h, (byte) 0);
        aVar.a(C7582R.string.download_app_title);
        View inflate = LayoutInflater.from(h).inflate(C7582R.layout.download_network_warning_dialog, null);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.installation_size);
        if (j > 0) {
            CharSequence string;
            String a2 = C1613m.m9289a(j, m605i());
            if (a) {
                string = h.getString(C7582R.string.use_mobile_network_app_size_v2, new Object[]{a2});
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = a2;
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                C1473m.f7980a.bD();
                objArr[1] = C1613m.m9289a(C2830g.m14962a(statFs), null);
                string = h.getString(C7582R.string.use_mobile_network_app_size, objArr);
            }
            textView.setText(string);
            textView.setVisibility(0);
        }
        if (((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
            intValue = ((Integer) C1789d.f9315b.m5760a()).intValue();
        } else {
            intValue = 0;
        }
        boolean a3 = C1473m.f7980a.bW().m14997a();
        RadioButton radioButton = (RadioButton) inflate.findViewById(C7582R.id.wait_for_wifi);
        if (a3 || a) {
            radioButton.setChecked(true);
            radioButton.setOnClickListener(new C1844h(this));
            radioButton.setVisibility(0);
        }
        if (a) {
            inflate.findViewById(C7582R.id.download_now_subtext).setVisibility(0);
        }
        C1473m.f7980a.bx();
        RadioButton radioButton2 = (RadioButton) inflate.findViewById(C7582R.id.offpeak_or_wifi);
        inflate.findViewById(C7582R.id.offpeak_or_wifi_subtext);
        RadioButton radioButton3 = (RadioButton) inflate.findViewById(C7582R.id.download_now);
        radioButton3.setOnClickListener(new C1845i(this));
        if (!(a3 || a)) {
            radioButton3.setChecked(true);
        }
        CheckBox checkBox = (CheckBox) inflate.findViewById(C7582R.id.download_remember_preference);
        if (a) {
            checkBox.setChecked(!((Boolean) C1789d.f9316c.m5760a()).booleanValue());
        } else {
            checkBox.setChecked(true);
        }
        textView = (TextView) inflate.findViewById(C7582R.id.download_remember_preference_subtext);
        textView.setText(Html.fromHtml(m592c((int) C7582R.string.download_network_remember_preference_subtext)));
        textView.setOnClickListener(new C1871j(this));
        aVar.a(inflate).a(C7582R.string.network_dialog_ok_button, new C1872k(this, radioButton, radioButton2, checkBox, intValue));
        Dialog a4 = aVar.a();
        if (a) {
            a4.setCanceledOnTouchOutside(false);
        }
        return a4;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (C1473m.f7980a.dj().mo2294a(12641184)) {
            mo968W().mo2499a(1, false);
        } else {
            mo968W().V_();
        }
        super.onCancel(dialogInterface);
    }

    final C1886u mo968W() {
        if (this.f761r != null) {
            return (C1886u) this.f761r;
        }
        return (C1886u) m603h();
    }

    protected final int mo2460X() {
        return 6320;
    }
}
