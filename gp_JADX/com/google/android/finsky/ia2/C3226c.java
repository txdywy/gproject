package com.google.android.finsky.ia2;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.ff;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.activities.gl;
import com.google.android.finsky.activities.gt;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.frameworkviews.ah;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.p111d.ak;
import com.google.android.finsky.p111d.al;
import com.google.android.finsky.pagesystem.C1041g;
import com.google.android.finsky.pagesystem.C1044f;
import com.google.android.finsky.utils.ac;
import com.google.wireless.android.finsky.dfe.nano.aa;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.google.wireless.android.finsky.dfe.nano.z;
import java.util.ArrayList;
import java.util.List;

public final class C3226c implements gt, ak, C3225n {
    public boolean f16578a;
    public boolean f16579b;
    public C3236l f16580c;
    public final LayoutInflater f16581d;
    public final ai f16582e;
    public al f16583f;
    public byte[] f16584g;

    public C3226c(Context context, C3748a c3748a, C1254c c1254c, LayoutInflater layoutInflater, gl glVar, int i, ah ahVar, ff ffVar, FinskyHeaderListLayout finskyHeaderListLayout, C2116a c2116a, boolean z, C1044f c1044f, byte[] bArr, C2495w c2495w, al alVar, C1041g c1041g) {
        this.f16581d = layoutInflater;
        this.f16582e = glVar.f6890f;
        this.f16579b = c2116a.m11027f();
        this.f16583f = alVar;
        this.f16584g = bArr;
        aa aaVar = glVar.f6885a.h;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (aaVar != null) {
            C3241u c3241u = new C3241u(context, c3748a, i, ahVar, layoutInflater, ffVar, finskyHeaderListLayout, c2116a.m11028g(), c1254c, c2495w, this, c1044f, alVar, c1041g);
            int length = aaVar.b.length;
            z[] zVarArr = aaVar.b;
            for (int i2 = 0; i2 < length; i2++) {
                z zVar = aaVar.b[i2];
                Object obj = zVarArr[i2].e;
                ag[] agVarArr = zVar.g;
                boolean z2 = z;
                C3230f c3230f = new C3230f(i2, c3241u.f16712a, c3241u.f16713b, c3241u.f16714c, c3241u.f16715d, c3241u.f16716e, c3241u.f16718g, c3241u.f16719h, c3241u.f16720i, c3241u.f16717f, zVar.f, agVarArr, z2, new ai(471, zVarArr[i2].e, this.f16582e), c3241u.f16721j, c3241u.f16722k, c3241u.f16723l, c3241u.f16724m, bArr, obj, c3241u.f16725n);
                arrayList2.add(obj);
                arrayList.add(c3230f);
            }
        }
        this.f16580c = new C3236l(arrayList, this.f16581d, ahVar, c2116a, aaVar.c, this, bArr, arrayList2, alVar);
    }

    public final View mo1309a() {
        C3236l c3236l = this.f16580c;
        if (c3236l.f16688o == null) {
            c3236l.m16338a();
        }
        return c3236l.f16688o;
    }

    public final ac mo1312b() {
        ac acVar = new ac();
        C3236l c3236l = this.f16580c;
        c3236l.f16683j.removeCallbacks(c3236l.f16680g);
        c3236l.f16680g = null;
        acVar.m21688a("Ia2SubNavManager.SubNavSelectedIndex", Integer.valueOf(c3236l.f16678e));
        List arrayList = new ArrayList();
        for (int i = 0; i < c3236l.f16675b.size(); i++) {
            C3238o c3238o = (C3238o) c3236l.f16675b.get(i);
            Handler handler = c3236l.f16683j;
            ac acVar2 = new ac();
            c3238o.f16694a.mo3392b(acVar2);
            c3238o.f16694a = null;
            handler.removeCallbacksAndMessages(c3238o.f16695b);
            c3238o.f16695b = null;
            arrayList.add(acVar2);
        }
        acVar.m21688a("Ia2SubNavManager.SubNavPageStateList", arrayList);
        c3236l.f16675b = null;
        return acVar;
    }

    public final void mo1310a(ac acVar) {
        C3236l c3236l = this.f16580c;
        if (acVar != null) {
            List list = (List) acVar.m21690b("Ia2SubNavManager.SubNavPageStateList");
            if (list != null && c3236l.f16675b.size() == list.size()) {
                for (int i = 0; i < list.size(); i++) {
                    ((C3238o) c3236l.f16675b.get(i)).f16694a.mo3389a((ac) list.get(i));
                }
            }
            if (acVar.m21689a("Ia2SubNavManager.SubNavSelectedIndex")) {
                int i2 = acVar.getInt("Ia2SubNavManager.SubNavSelectedIndex");
                if (i2 != -1) {
                    c3236l.m16340a(i2, 0, false);
                }
            }
        }
    }

    public final void mo1311a(boolean z) {
        if (z != this.f16578a) {
            C3236l c3236l;
            if (z) {
                this.f16582e.m13206a(true);
                c3236l = this.f16580c;
                if (c3236l.f16678e == -1) {
                    c3236l.m16340a(c3236l.f16674a, 0, true);
                } else {
                    c3236l.m16342b().mo3387a(0);
                }
            } else {
                this.f16582e.m13206a(false);
                if (this.f16579b) {
                    c3236l = this.f16580c;
                    if (c3236l.f16678e != -1) {
                        c3236l.f16683j.removeCallbacks(c3236l.f16680g);
                        c3236l.f16682i = true;
                        c3236l.f16687n.m16127a(0, null);
                        if (c3236l.f16680g != null) {
                            c3236l.f16683j.post(c3236l.f16680g);
                        }
                    }
                }
            }
            this.f16578a = z;
        }
    }

    public final boolean mo3383d() {
        return !this.f16579b || this.f16578a;
    }

    public final void mo3382c() {
        this.f16583f.mo1393b(1734, this.f16584g, null, false);
    }
}
