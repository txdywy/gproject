package com.google.android.finsky.ia2;

import android.content.Context;
import android.support.v7.widget.ff;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.gl;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.pagesystem.C1044f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.wireless.android.finsky.dfe.nano.aa;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.google.wireless.android.finsky.dfe.nano.z;
import java.util.ArrayList;
import java.util.List;

public final class C3228d implements gt, C3227r {
    public final C1070e f16585a;
    public C3240q f16586b;
    public boolean f16587c;
    public boolean f16588d;
    public final ai f16589e;
    public final al f16590f;
    public final byte[] f16591g;

    public C3228d(Context context, C3748a c3748a, C1254c c1254c, LayoutInflater layoutInflater, gl glVar, int i, ah ahVar, ff ffVar, FinskyHeaderListLayout finskyHeaderListLayout, C2116a c2116a, boolean z, C1044f c1044f, byte[] bArr, C2495w c2495w, al alVar, C1070e c1070e) {
        this.f16589e = glVar.f6890f;
        this.f16585a = c1070e;
        this.f16590f = alVar;
        this.f16591g = bArr;
        aa aaVar = glVar.f6885a.h;
        if (aaVar != null) {
            C3241u c3241u = new C3241u(context, c3748a, i, ahVar, layoutInflater, ffVar, finskyHeaderListLayout, c2116a.m11028g(), c1254c, c2495w, c1044f, alVar);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            m16286a(aaVar, c3241u, z, arrayList, arrayList2);
            this.f16586b = new C3240q(arrayList, layoutInflater, ahVar, c2116a, aaVar.c, this, bArr, arrayList2, alVar);
            return;
        }
        FinskyLog.m21669e("Empty subnavContainer. Wrong home response for IA2?", new Object[0]);
    }

    public final void m16291b(boolean z) {
        C3240q c3240q = this.f16586b;
        c3240q.f16702f = true;
        c3240q.f16703g = z;
        C3229s c3229s = (C3229s) c3240q.f16697a.get(c3240q.m16346a());
        if (c3229s.mo3393c()) {
            c3240q.f16706j.mo3397a();
            c3240q.m16350a(c3229s.mo3385a(c3240q.f16703g));
            c3240q.f16703g = false;
            return;
        }
        if (C1473m.f7980a.dj().mo2294a(12637322)) {
            c3240q.f16711o.mo1385a(1737, c3240q.f16709m, (byte[]) c3240q.f16710n.get(c3240q.m16346a()), true);
        }
        c3240q.f16706j.m16127a(0, null);
        c3229s.mo3386a();
    }

    public final View mo1309a() {
        C3240q c3240q = this.f16586b;
        if (c3240q.f16707k == null) {
            c3240q.m16351b();
        }
        return c3240q.f16707k;
    }

    public final void mo1311a(boolean z) {
        if (z != this.f16587c) {
            this.f16589e.m13206a(z);
            this.f16587c = z;
            if (z) {
                C3240q c3240q = this.f16586b;
                if (c3240q.f16701e < 0 || c3240q.f16701e >= c3240q.f16697a.size()) {
                    c3240q.m16348a(c3240q.f16700d, 0);
                } else {
                    ((C3229s) c3240q.f16697a.get(c3240q.f16701e)).mo3387a(0);
                }
            }
        }
    }

    public final ac mo1312b() {
        ac acVar = new ac();
        C3240q c3240q = this.f16586b;
        acVar.m21688a("Ia2SubNavManager.SubNavSelectedIndex", Integer.valueOf(c3240q.m16346a()));
        List arrayList = new ArrayList();
        for (int i = 0; i < c3240q.f16697a.size(); i++) {
            ac acVar2 = new ac();
            ((C3229s) c3240q.f16697a.get(i)).mo3392b(acVar2);
            arrayList.add(acVar2);
        }
        c3240q.f16697a.clear();
        acVar.m21688a("Ia2SubNavManager.SubNavPageStateList", arrayList);
        return acVar;
    }

    public final void mo1310a(ac acVar) {
        C3240q c3240q = this.f16586b;
        if (acVar != null) {
            List list = (List) acVar.m21690b("Ia2SubNavManager.SubNavPageStateList");
            if (list != null && c3240q.f16697a.size() == list.size()) {
                for (int i = 0; i < list.size(); i++) {
                    ((C3229s) c3240q.f16697a.get(i)).mo3389a((ac) list.get(i));
                }
            }
            if (acVar.m21689a("Ia2SubNavManager.SubNavSelectedIndex")) {
                c3240q.m16348a(acVar.getInt("Ia2SubNavManager.SubNavSelectedIndex"), 0);
            }
        }
    }

    public final void mo3384c() {
        if (!(this.f16585a == null || !this.f16587c || this.f16588d)) {
            this.f16585a.mo1383j();
            this.f16588d = true;
        }
        this.f16590f.mo1393b(1734, this.f16591g, null, false);
    }

    private final void m16286a(aa aaVar, C3241u c3241u, boolean z, List list, List list2) {
        int length = aaVar.b.length;
        z[] zVarArr = aaVar.b;
        for (int i = 0; i < length; i++) {
            z zVar = aaVar.b[i];
            Object obj = zVarArr[i].e;
            ag[] agVarArr = zVar.g;
            String str = zVar.f;
            byte[] bArr = this.f16591g;
            boolean z2 = z;
            C3233i c3233i = new C3233i(i, c3241u.f16712a, c3241u.f16713b, c3241u.f16714c, c3241u.f16715d, c3241u.f16716e, c3241u.f16718g, c3241u.f16719h, c3241u.f16720i, c3241u.f16717f, str, agVarArr, z2, new ai(471, zVarArr[i].e, this.f16589e), c3241u.f16721j, c3241u.f16723l, c3241u.f16724m, bArr, obj);
            list2.add(obj);
            list.add(c3233i);
        }
    }
}
