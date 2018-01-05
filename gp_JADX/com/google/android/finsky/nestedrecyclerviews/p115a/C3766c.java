package com.google.android.finsky.nestedrecyclerviews.p115a;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.finsky.recyclerview.p182a.C2574b;
import com.google.android.finsky.utils.FinskyLog;

public final class C3766c {
    public static C3767d m17912a(C2574b c2574b) {
        C3769f c3769f;
        if (!(c2574b instanceof RecyclerView)) {
            FinskyLog.m21669e("The passed argument must be a RecyclerView", new Object[0]);
        }
        if (!(c2574b instanceof C3763a)) {
            FinskyLog.m21669e("The passed argument must implement ChildRecyclerView", new Object[0]);
        }
        RecyclerView recyclerView = (RecyclerView) c2574b;
        View rootView = recyclerView.getRootView();
        RecyclerView recyclerView2 = recyclerView;
        View parent = recyclerView.getParent();
        while (!(parent instanceof C3764n)) {
            if (parent == null || parent == rootView) {
                c3769f = null;
                break;
            }
            parent = parent.getParent();
        }
        C3769f.m17915a((Object) parent);
        C3764n c3764n = (C3764n) parent;
        C3769f.m17916b(recyclerView2);
        c3769f = c3764n.mo3732a((C3763a) recyclerView2);
        if (c3769f == null) {
            return null;
        }
        c2574b.setRecyclerViewDelegate(new C3775j(c3769f));
        ((C3763a) c2574b).setChildRecyclerViewDelegate(new C3771h(c3769f));
        return new C3770g(c3769f);
    }
}
