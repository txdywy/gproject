package com.google.android.finsky.updatechecker.impl;

import android.os.AsyncTask;
import com.google.android.finsky.bs.C2177a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dv.C2903e;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4642f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class C4644b extends AsyncTask {
    public final /* synthetic */ List f23939a;
    public final /* synthetic */ int f23940b;
    public final /* synthetic */ C2239c f23941c;
    public final /* synthetic */ C4642f f23942d;
    public final /* synthetic */ C4643a f23943e;

    C4644b(C4643a c4643a, List list, int i, C2239c c2239c, C4642f c4642f) {
        this.f23943e = c4643a;
        this.f23939a = list;
        this.f23940b = i;
        this.f23941c = c2239c;
        this.f23942d = c4642f;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            boolean a = this.f23943e.f23870d.dj().mo2294a(12609857);
            boolean z = this.f23939a == null && this.f23943e.f23870d.dj().mo2294a(12610799);
            Set hashSet = new HashSet(Arrays.asList(new String[]{"com.google.android.gms"}));
            this.f23943e.f23870d.dj();
            if (C2177a.m11443a()) {
                hashSet.add("com.google.android.instantapps.supervisor");
            }
            C4643a c4643a = this.f23943e;
            C2906h c2906h = this.f23943e.f23871e;
            C2903e c2903e = new C2903e();
            c2903e.f15437a = true;
            c2903e.f15438b = a;
            c2903e.f15439c = z;
            c2903e.f15441e = hashSet;
            c4643a.f23875i = c2906h.m15161a(c2903e);
            this.f23943e.f23875i.m15156a(this.f23943e.f23869c.cY().name, map);
            this.f23943e.f23875i.m11918a(new C4645c(this));
            this.f23943e.f23875i.m11917a(new C4646d(this));
            this.f23943e.f23875i.m15157a(map);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        Collection<String> collection = ((List[]) objArr)[0];
        List list = null;
        if (this.f23943e.f23870d.dj().mo2294a(12616560) && this.f23943e.f23872f.f15384e.m8823c()) {
            list = this.f23943e.f23872f.m15126a("disabled_until_updated");
        }
        if (collection == null) {
            return C3646a.m17242b(this.f23943e.f23867a, this.f23943e.f23868b.m17244a(true, list));
        }
        C3646a c3646a = this.f23943e.f23868b;
        C2206c c2206c = this.f23943e.f23867a;
        Collection arrayList = new ArrayList(collection.size());
        for (String a : collection) {
            C3647b a2 = c3646a.m17243a(a);
            if (!(a2 == null || a2.f18028c == null)) {
                arrayList.add(a2);
            }
        }
        return C3646a.m17242b(c2206c, arrayList);
    }
}
