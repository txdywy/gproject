package com.google.android.finsky.contentfilterui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1508k;
import com.squareup.leakcanary.C7582R;

final class C2342h implements OnClickListener {
    public final /* synthetic */ int f11523a;
    public final /* synthetic */ C2339e f11524b;

    C2342h(C2339e c2339e, int i) {
        this.f11524b = c2339e;
        this.f11523a = i;
    }

    public final void onClick(View view) {
        boolean z;
        if (!this.f11524b.ag.k) {
            this.f11524b.f11519f = this.f11523a;
        }
        Fragment fragment = this.f11524b;
        if (!(fragment.ag.i.isEmpty() && fragment.ag.j.isEmpty())) {
            if (!fragment.f11517c.f11537c.getBoolean(Integer.toString(fragment.f11518e))) {
                C1508k c1508k = new C1508k();
                if (!TextUtils.isEmpty(fragment.ag.i)) {
                    c1508k.m8859c(fragment.ag.i);
                }
                if (!TextUtils.isEmpty(fragment.ag.j)) {
                    c1508k.m8852a(fragment.ag.j);
                }
                c1508k.m8849a(322, null, -1, -1, fragment.y_.m13184a(null));
                c1508k.m8860d((int) C7582R.string.ok).m8853a(true);
                c1508k.m8851a(fragment, 1, new Bundle());
                c1508k.mo2272a().m625a(fragment.m603h().H_(), "ContentFiltersChoiceFragment.confirmationDialog");
                fragment.f11517c.f11537c.putBoolean(Integer.toString(fragment.f11518e), true);
                z = true;
                if (!z) {
                    this.f11524b.ai();
                }
            }
        }
        z = false;
        if (!z) {
            this.f11524b.ai();
        }
    }
}
