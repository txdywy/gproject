package com.google.android.finsky.detailspage;

import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.co;
import java.util.ArrayList;
import java.util.Arrays;

final class er implements C0660x {
    public final /* synthetic */ boolean f14533a;
    public final /* synthetic */ eo f14534b;

    er(eo eoVar, boolean z) {
        this.f14534b = eoVar;
        this.f14533a = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        ex exVar = (ex) this.f14534b.b;
        exVar.f14554l = new ArrayList(Arrays.asList(((co) obj).a));
        ((ex) this.f14534b.b).f14549g = true;
        this.f14534b.f14493f = false;
        this.f14534b.m14264a(this.f14533a);
    }
}
