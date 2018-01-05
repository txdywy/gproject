package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.dd;
import com.squareup.leakcanary.C7582R;

public final class ae extends C1666l {
    public C2798j f15021a;
    public final dd f15022b;

    public ae(LayoutInflater layoutInflater, dd ddVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1820a(this);
        this.f15022b = ddVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        TextView textView = (TextView) view;
        this.f15021a.m14904a(this.f15022b.a, textView, c2797e, new Object[0]);
        if (this.f15022b.b != null) {
            textView.setBackgroundResource(C7582R.drawable.play_highlight_overlay_light);
            textView.setOnClickListener(new af(this, c2797e));
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_text;
    }
}
