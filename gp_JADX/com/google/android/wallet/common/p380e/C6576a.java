package com.google.android.wallet.common.p380e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.ui.common.au;
import java.util.ArrayList;
import java.util.List;

public final class C6576a extends au {
    public final C6506n f32707a = new C6506n(1760);
    public boolean f32708b;

    protected final void mo5533W() {
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        if (bundle != null) {
            this.f32708b = bundle.getBoolean("errorShown");
        }
    }

    public final void mo5537u() {
        super.mo5537u();
        if (!this.f32708b) {
            mo5469a(5, this.q.getBundle("errorDetails"));
            this.f32708b = true;
        }
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putBoolean("errorShown", this.f32708b);
    }

    public final boolean mo5535a(g gVar) {
        return false;
    }

    public final boolean mo5534X() {
        return true;
    }

    public final C6506n getUiElement() {
        return this.f32707a;
    }

    public final List getChildren() {
        return null;
    }

    public final long mo5520Y() {
        return 0;
    }

    protected final h mo5521Z() {
        return null;
    }

    public final ArrayList aa() {
        return new ArrayList();
    }
}
