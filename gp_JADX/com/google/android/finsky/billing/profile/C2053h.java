package com.google.android.finsky.billing.profile;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.dfe.nano.v;

final class C2053h implements OnClickListener {
    public final /* synthetic */ View f10554a;
    public final /* synthetic */ v f10555b;
    public final /* synthetic */ C2048c f10556c;

    C2053h(C2048c c2048c, View view, v vVar) {
        this.f10556c = c2048c;
        this.f10554a = view;
        this.f10555b = vVar;
    }

    public final void onClick(View view) {
        OnClickListener onClickListener = null;
        C1089s c1089s = this.f10556c.e;
        v vVar = this.f10555b;
        ad parentNode = this.f10556c.getParentNode();
        C2495w c2495w = this.f10556c.af;
        if (c1089s.al != null) {
            for (v vVar2 : c1089s.al.d) {
                if (TextUtils.equals(vVar2.e, vVar.e)) {
                    break;
                }
            }
            v vVar22 = null;
            if (vVar22 == null) {
                c2495w.m13371a(new C2474c(392).m13244b(vVar.h).f13342a, null);
                c1089s.m6758b(3, 3);
            } else {
                onClickListener = c1089s.m10810a(vVar22, c1089s.al.e, parentNode, c2495w).f10598f;
            }
        } else if (c1089s.f6948l == 8) {
            c1089s.m6758b(3, c1089s.af);
        } else {
            c1089s.m6758b(1, 0);
        }
        if (onClickListener != null) {
            onClickListener.onClick(this.f10554a);
            this.f10556c.aw = false;
        }
    }
}
