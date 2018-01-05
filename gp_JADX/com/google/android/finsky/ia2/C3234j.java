package com.google.android.finsky.ia2;

import android.view.ViewGroup;
import com.google.android.finsky.bg.C1060p;

final class C3234j extends C1060p {
    public final /* synthetic */ C3233i f16673a;

    C3234j(C3233i c3233i, ViewGroup viewGroup) {
        this.f16673a = c3233i;
        super(viewGroup);
    }

    public final void onGlobalLayout() {
        this.f16673a.m16332e();
        this.f16673a.m16331d();
        if (this.f16673a.f16648b != null) {
            this.f16673a.f16648b.mo3396b(this.f16673a.f16656j);
        }
        super.m6486a();
    }
}
