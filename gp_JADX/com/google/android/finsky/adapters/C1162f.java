package com.google.android.finsky.adapters;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.layout.CategoryRow;
import com.google.wireless.android.finsky.dfe.nano.x;

final class C1162f implements OnClickListener {
    public final /* synthetic */ x f7191a;
    public final /* synthetic */ CategoryRow f7192b;
    public final /* synthetic */ C1161e f7193c;

    C1162f(C1161e c1161e, x xVar, CategoryRow categoryRow) {
        this.f7193c = c1161e;
        this.f7191a = xVar;
        this.f7192b = categoryRow;
    }

    public final void onClick(View view) {
        this.f7193c.f7168d.mo3673a(this.f7191a.e, this.f7191a.c, this.f7193c.f7169e, this.f7193c.f7170f, this.f7193c.f7171g, this.f7192b, this.f7193c.f7165A);
    }
}
