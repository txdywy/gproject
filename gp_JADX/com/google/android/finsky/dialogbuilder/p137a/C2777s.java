package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.cf;
import com.squareup.leakcanary.C7582R;

public final class C2777s extends C1666l {
    public C2798j f15060a;
    public final cf f15061b;

    public C2777s(LayoutInflater layoutInflater, cf cfVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1829a(this);
        this.f15061b = cfVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        ImageView imageView = (FifeImageView) view;
        this.f15060a.m14902a(this.f15061b.a, imageView, c2797e);
        if (this.f15061b.b != null) {
            imageView.setOnClickListener(new C2778t(this, c2797e));
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_image;
    }
}
