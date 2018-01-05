package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.cn;
import com.squareup.leakcanary.C7582R;

public final class C2783x extends C1666l {
    public C2798j f15072a;
    public final cn f15073b;

    public C2783x(LayoutInflater layoutInflater, cn cnVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1831a(this);
        this.f15073b = cnVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        if (this.f15073b.a != null) {
            this.f15072a.m14902a(this.f15073b.a, (FifeImageView) view.findViewById(C7582R.id.icon), c2797e);
        }
        this.f15072a.m14904a(this.f15073b.b, (TextView) view.findViewById(C7582R.id.title), c2797e, new Object[0]);
        this.f15072a.m14904a(this.f15073b.c, (TextView) view.findViewById(C7582R.id.subtitle), c2797e, new Object[0]);
        this.f15072a.m14901a(this.f15073b.d, (Button) view.findViewById(C7582R.id.edit_button), c2797e);
        if (this.f15073b.e != null) {
            this.f15072a.m14902a(this.f15073b.e, (FifeImageView) view.findViewById(C7582R.id.check_mark), c2797e);
        }
        if (this.f15073b.f != null) {
            view.setOnClickListener(new C2784y(this, c2797e));
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_instrument;
    }
}
