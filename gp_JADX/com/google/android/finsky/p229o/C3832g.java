package com.google.android.finsky.p229o;

import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.b.b.a.a;
import com.google.wireless.android.finsky.dfe.b.b.a.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class C3832g implements C0657w, C0660x {
    public final C1254c f19188a;
    public List f19189b = new ArrayList();
    public boolean f19190c = false;
    public int f19191d = 0;

    C3832g(C1254c c1254c) {
        this.f19188a = c1254c;
        m18289c();
    }

    private final void m18289c() {
        for (String a : (Set) C0954a.bE.m5760a()) {
            C3833h a2 = C3832g.m18288a(a);
            if (a2 == null) {
                FinskyLog.m21667d("Could not parse stored dismissal token", new Object[0]);
            } else {
                this.f19189b.add(a2);
            }
        }
    }

    final void m18290a() {
        Object hashSet = new HashSet();
        for (C3833h c3833h : this.f19189b) {
            String l = Long.toString(c3833h.f19192a);
            String str = c3833h.f19193b.c;
            hashSet.add(new StringBuilder((String.valueOf(l).length() + 1) + String.valueOf(str).length()).append(l).append(':').append(str).toString());
        }
        C0954a.bE.m5763a(hashSet);
    }

    final void m18292b() {
        bb.m21791a();
        if (this.f19191d > 0) {
            FinskyLog.m21662b("Not sending dismissed tokens because another request is already in flight.", new Object[0]);
            this.f19190c = true;
        } else if (this.f19189b.isEmpty()) {
            FinskyLog.m21662b("Tried sending a dismiss request without any tokens to send.", new Object[0]);
        } else {
            this.f19190c = false;
            this.f19191d = this.f19189b.size();
            a[] aVarArr = new a[this.f19191d];
            for (int i = 0; i < this.f19191d; i++) {
                aVarArr[i] = ((C3833h) this.f19189b.get(i)).f19193b;
            }
            b bVar = new b();
            bVar.a = aVarArr;
            this.f19188a.mo1562a(bVar, (C0660x) this, (C0657w) this);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        bb.m21791a();
        long a = C4678i.m21812a();
        Iterator it = this.f19189b.subList(0, this.f19191d).iterator();
        while (it.hasNext()) {
            if (a > ((C3833h) it.next()).f19192a + ((Long) C0955b.jJ.m28964b()).longValue()) {
                it.remove();
            }
        }
        m18290a();
        this.f19191d = 0;
        if (this.f19190c) {
            m18292b();
        }
    }

    private static C3833h m18288a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(58);
        if (indexOf < 0 || indexOf + 1 == str.length()) {
            return null;
        }
        try {
            return new C3833h(Long.valueOf(str.substring(0, indexOf)).longValue(), str.substring(indexOf + 1));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        bb.m21791a();
        this.f19189b.subList(0, this.f19191d).clear();
        m18290a();
        this.f19191d = 0;
        if (this.f19190c) {
            m18292b();
        }
    }
}
