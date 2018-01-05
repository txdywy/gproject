package com.google.android.finsky.stream.base.playcluster;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.playcard.C3906g;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.utils.bb;
import com.google.android.play.layout.d;
import java.util.ArrayList;
import java.util.List;

public final class C4285g {
    public final SparseArray f21641a = new SparseArray();

    public final void m19889a(d dVar, int i) {
        ao.m18509b(dVar);
        ((List) this.f21641a.get(i)).add(dVar);
    }

    public final d m19888a(C3906g c3906g, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        bb.m21791a();
        int i = c3906g.f19735a;
        List list = (List) this.f21641a.get(i);
        if (list == null) {
            list = new ArrayList();
            this.f21641a.put(i, list);
        }
        if (list.isEmpty()) {
            return (d) layoutInflater.inflate(i, viewGroup, false);
        }
        return (d) list.remove(0);
    }
}
