package com.google.android.finsky.activities;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public final class dm extends dl {
    public final int f6671a;

    dm(int i, int i2) {
        super(i2, C7582R.string.flag_other_concern_prompt);
        this.f6671a = i;
    }

    public final void mo1342a(Context context, Document document, String str) {
        C1473m.f7980a.ap().mo1581a(document.f14885a.f12096c, this.f6671a, str, new dn(context), new C1057do());
    }
}
