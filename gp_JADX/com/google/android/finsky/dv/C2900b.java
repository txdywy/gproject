package com.google.android.finsky.dv;

import android.os.AsyncTask;
import com.google.android.finsky.cn.C2322b;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

final class C2900b extends AsyncTask {
    public final /* synthetic */ Map f15422a;
    public final /* synthetic */ C2899a f15423b;

    C2900b(C2899a c2899a, Map map) {
        this.f15423b = c2899a;
        this.f15422a = map;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f15423b.m15158b(this.f15422a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Collection linkedHashSet = new LinkedHashSet();
        for (C2322b c2322b : this.f15423b.f15415l.mo2855a()) {
            if (c2322b.f11422g && !c2322b.f11424i) {
                linkedHashSet.add(c2322b.f11416a);
            }
        }
        linkedHashSet.remove(this.f15423b.f15410d.getPackageName());
        for (Set addAll : this.f15422a.values()) {
            addAll.addAll(linkedHashSet);
        }
        return null;
    }
}
