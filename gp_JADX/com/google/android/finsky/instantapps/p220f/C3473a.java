package com.google.android.finsky.instantapps.p220f;

import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.instantapps.common.p219f.C3472a;
import com.google.android.instantapps.common.p219f.C3474b;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C3473a extends C3472a {
    public final C3478e f17664c;
    public final List f17665d = new ArrayList();
    public String f17666e = null;

    public C3473a(C3478e c3478e) {
        this.f17664c = c3478e;
    }

    public final void m17042a(String str) {
        this.f17666e = str;
        this.f3433a.m3638b();
    }

    public final int mo1039a() {
        return this.f17665d.size() + 1;
    }

    public final int mo1040a(int i) {
        return 2;
    }

    public final /* synthetic */ void mo3535a(C3474b c3474b, int i) {
        C3475b c3475b = (C3475b) c3474b;
        if (i == this.f17665d.size()) {
            c3475b.m17044a(null, TextUtils.isEmpty(this.f17666e));
        } else {
            c3475b.m17044a((String) this.f17665d.get(i), TextUtils.equals(this.f17666e, (CharSequence) this.f17665d.get(i)));
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C3475b(this.f17664c, LayoutInflater.from(viewGroup.getContext()).inflate(C7582R.layout.instant_apps_settings_account_row, viewGroup, false));
    }
}
