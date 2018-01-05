package com.google.android.finsky.family.p201c;

import android.support.design.widget.Snackbar;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C3041c implements C0657w {
    public final /* synthetic */ boolean f15899a;
    public final /* synthetic */ C3039a f15900b;

    C3041c(C3039a c3039a, boolean z) {
        this.f15900b = c3039a;
        this.f15899a = z;
    }

    public final void mo1062a(VolleyError volleyError) {
        int i;
        int i2 = 0;
        OnCheckedChangeListener onCheckedChangeListener = this.f15900b;
        boolean z = !this.f15899a;
        onCheckedChangeListener.ag.setOnCheckedChangeListener(null);
        onCheckedChangeListener.ah.setOnCheckedChangeListener(null);
        onCheckedChangeListener.ag.setChecked(z);
        RadioButton radioButton = onCheckedChangeListener.ah;
        if (z) {
            z = false;
        } else {
            z = true;
        }
        radioButton.setChecked(z);
        onCheckedChangeListener.ag.setOnCheckedChangeListener(onCheckedChangeListener);
        onCheckedChangeListener.ah.setOnCheckedChangeListener(onCheckedChangeListener);
        CharSequence string = this.f15900b.bn.getString(C7582R.string.family_library_settings_save_failed, new Object[]{C1290m.m7702a(this.f15900b.bn, volleyError)});
        C1045b c1045b = this.f15900b;
        if (c1045b.bt != null) {
            Snackbar.m500a(c1045b.bt, string, 0).m493a();
        }
        C3039a c3039a = this.f15900b;
        boolean z2 = this.f15899a;
        switch (c3039a.f15893c) {
            case 1:
                i = 412;
                break;
            case 3:
                i = 410;
                break;
            case 4:
                i = 411;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            FinskyLog.m21662b("Cannot log event for sharing settings for unrecognized backend ID %d", Integer.valueOf(c3039a.f15893c));
            return;
        }
        C2474c c2474c = new C2474c(i);
        if (z2) {
            i2 = 1;
        }
        C2474c b = c2474c.m13243b(Integer.valueOf(i2));
        if (volleyError != null) {
            b.m13210a(1);
            b.m13238a((Throwable) volleyError);
        }
        C1473m.f7980a.dc().m13319a(b.f13342a, null);
    }
}
