package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import com.google.android.finsky.utils.ak;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;

public final class gb extends C0141p {
    public final Dialog mo143a(Bundle bundle) {
        Context h = m603h();
        Bundle bundle2 = this.f760q;
        a aVar = new a(h);
        aVar.a(C7582R.string.sort_reviews);
        CharSequence[] charSequenceArr = new CharSequence[ak.f24035a.length];
        for (int i = 0; i < ak.f24035a.length; i++) {
            charSequenceArr[i] = h.getString(ak.f24035a[i].f24037b);
        }
        aVar.a(charSequenceArr, bundle2.getInt("sorting_type"), new gc(this));
        return aVar.a();
    }
}
