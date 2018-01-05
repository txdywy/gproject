package com.google.android.finsky.instantapps.p212d;

import android.app.AlertDialog.Builder;
import com.squareup.leakcanary.C7582R;

final class C3428e implements Runnable {
    public final /* synthetic */ String f17558a;
    public final /* synthetic */ String f17559b;
    public final /* synthetic */ C3427d f17560c;

    C3428e(C3427d c3427d, String str, String str2) {
        this.f17560c = c3427d;
        this.f17558a = str;
        this.f17559b = str2;
    }

    public final void run() {
        C3425c c3425c = this.f17560c.f17557a;
        String str = this.f17558a;
        String str2 = this.f17559b;
        new Builder(c3425c.f17555j).setMessage(c3425c.f17555j.getString(C7582R.string.aia_disable_app_prompt_message, new Object[]{str2})).setNegativeButton(C7582R.string.aia_disable_app_prompt_negative_text, new C3431h(c3425c, str)).setPositiveButton(C7582R.string.aia_disable_app_prompt_positive_text, new C3430g(c3425c, str, str2)).setOnCancelListener(new C3429f(c3425c, str)).show();
        c3425c.f17547b.mo5136a(2902);
    }
}
