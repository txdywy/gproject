package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v7.app.C0434z;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;

public final class fw extends C0141p {
    public final boolean[] af = new boolean[2];

    public final Dialog mo143a(Bundle bundle) {
        Context h = m603h();
        Bundle bundle2 = this.f760q;
        a aVar = new a(h);
        aVar.a(C7582R.string.reviews_filter_options);
        CharSequence[] charSequenceArr = new String[this.af.length];
        charSequenceArr[0] = h.getString(C7582R.string.reviews_filter_by_version);
        charSequenceArr[1] = h.getString(C7582R.string.reviews_filter_by_device_model);
        this.af[0] = bundle2.getBoolean("filterByVersion");
        this.af[1] = bundle2.getBoolean("filterByDevice");
        boolean[] zArr = this.af;
        OnMultiChoiceClickListener fxVar = new fx(this);
        if (aVar.b != null) {
            aVar.b.setMultiChoiceItems(charSequenceArr, zArr, fxVar);
        } else {
            C0434z c0434z = aVar.a;
            c0434z.f2507a.f2485s = charSequenceArr;
            c0434z.f2507a.f2461G = fxVar;
            c0434z.f2507a.f2457C = zArr;
            c0434z.f2507a.f2458D = true;
        }
        aVar.a(17039370, new fy(this));
        return aVar.a();
    }
}
