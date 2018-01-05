package com.google.android.finsky.detailspage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.detailsmodules.C2602a;
import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.utils.FinskyLog;

public final class cl extends ev {
    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        cm cmVar;
        cm cmVar2 = new cm();
        em adapter = recyclerView.getAdapter();
        if (adapter instanceof C2602a) {
            int d = RecyclerView.m262d(view);
            if (d == -1) {
                cmVar = null;
            } else {
                C2602a c2602a = (C2602a) adapter;
                int i = 0;
                int i2 = 0;
                int i3 = d;
                for (d = 0; d < c2602a.m13683c(); d++) {
                    C2597a e = c2602a.m13684e(d);
                    if (e instanceof cn) {
                        if (i != 0) {
                            i2++;
                        } else {
                            i = 1;
                        }
                    } else if (!(i2 == 0 && i == 0)) {
                        i = 0;
                        i2 = 0;
                    }
                    int e2 = e.mo2978e();
                    if (i3 < e2) {
                        cmVar2.f14365a = e;
                        cmVar2.f14366b = i3;
                        cmVar2.f14367c = i2;
                        cmVar = cmVar2;
                        break;
                    }
                    i3 -= e2;
                }
                FinskyLog.m21669e("Adapter position is out of range", new Object[0]);
                cmVar = null;
            }
        } else {
            FinskyLog.m21669e("FlatDetailsModuleDecoration should only be used with ModulesAdapter", new Object[0]);
            cmVar = null;
        }
        if (cmVar != null) {
            C2597a c2597a = cmVar.f14365a;
            if (c2597a instanceof co) {
                co coVar = (co) c2597a;
                rect.top = coVar.mo3053a(cmVar.f14366b, cmVar.f14367c) + rect.top;
                rect.bottom = coVar.mo3054i() + rect.bottom;
            }
        }
    }
}
