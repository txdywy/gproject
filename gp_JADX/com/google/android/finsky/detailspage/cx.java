package com.google.android.finsky.detailspage;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.detailsmodules.modules.secondaryactions.C2607c;
import com.google.android.finsky.detailsmodules.modules.subscriptions.C2617h;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailspage.episodelist.C2644a;
import com.google.android.finsky.detailspage.seasonlist.C2664a;
import com.google.android.finsky.detailspage.videowatchaction.C2676a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class cx {
    public static final List f14376a = Arrays.asList(new Class[]{ct.class, am.class, C2655i.class, go.class, C2676a.class, gy.class, ci.class, dc.class, cz.class, C2617h.class, gq.class, bk.class, C2636c.class, C2652f.class, al.class, dz.class, ef.class, bq.class, df.class, de.class, cv.class, C2688x.class, ce.class, C2634b.class, C2632a.class, fo.class, bt.class, C2664a.class, C2644a.class, eo.class, fg.class, el.class, dx.class, gs.class, gw.class, dn.class, dw.class, C2674v.class, C2607c.class, dd.class, cy.class, fd.class, C2689y.class, dl.class, cr.class, cp.class});
    public static final List f14377b = Arrays.asList(new Class[]{ct.class, am.class, C2655i.class, ad.class, C2676a.class, ci.class, dc.class, cz.class, C2617h.class, C2636c.class, C2652f.class, al.class, dz.class, ef.class, bq.class, df.class, de.class, cv.class, C2688x.class, ce.class, C2634b.class, C2632a.class, fo.class, bt.class, C2664a.class, C2644a.class, eo.class, fg.class, el.class, dx.class, gs.class, gw.class, dn.class, dw.class, C2674v.class, C2607c.class, dd.class, cy.class, fd.class, C2689y.class, dl.class, cr.class, cp.class});
    public List f14378c;
    public List f14379d;
    public final be f14380e;
    public final ak f14381f;

    public cx(be beVar, ak akVar) {
        this.f14380e = beVar;
        this.f14381f = akVar;
    }

    final List m14085a(Document document, Set set) {
        if (this.f14381f != null) {
            return ak.m13854a(document, set).m13849c();
        }
        List a;
        C1552e dj = C1473m.f7980a.dj();
        List list = m14083a(set) ? f14377b : f14376a;
        if (dj.mo2294a(12630151)) {
            if (list == f14376a) {
                if (this.f14378c == null) {
                    this.f14378c = m14081a(list);
                }
                list = this.f14378c;
            } else if (list == f14377b) {
                if (this.f14379d == null) {
                    this.f14379d = m14081a(list);
                }
                list = this.f14379d;
            }
        }
        if (dj.mo2294a(12631596)) {
            a = m14082a(list, bq.class, al.class);
        } else {
            a = list;
        }
        int i = document.f14885a.f12098e;
        if (i == 5 || i == 64) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0) {
            return a;
        }
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < a.size()) {
            Class cls = (Class) a.get(i2);
            if (go.class.equals(cls) || ad.class.equals(cls)) {
                i3 = i2 + 1;
            } else if (C2607c.class.equals(cls)) {
                i4 = i2;
            }
            if (i3 == -1 || i4 == -1) {
                i2++;
            } else {
                list = new ArrayList(a);
                if (i4 != i3) {
                    list.add(i3, list.remove(i4));
                }
                return list;
            }
        }
        FinskyLog.m21665c("Expected modules not found when applying gifting experiments", new Object[0]);
        return a;
    }

    public final List m14086a(Document document, Set set, List list) {
        List arrayList = new ArrayList();
        int indexOf = m14085a(document, set).indexOf(cy.class);
        if (indexOf >= 0 && indexOf <= list.size()) {
            int length = document.m14663r().length;
            for (int i = 0; i < length; i++) {
                bn bnVar = new bn();
                bnVar.f14308g = i;
                list.add(indexOf + i, bnVar);
                arrayList.add(bnVar);
            }
        }
        return arrayList;
    }

    public final List m14087a(List list, Context context, String str, C2599c c2599c, C2495w c2495w, C3748a c3748a, ad adVar) {
        List arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (((Class) list.get(i)) != cy.class) {
                arrayList.add(this.f14380e.m13938a((Class) list.get(i), context, str, c2599c, c2495w, c3748a, adVar));
            }
        }
        return arrayList;
    }

    public final int m14084a(int i, Document document, Set set, Set set2) {
        int i2 = 0;
        boolean a = m14083a(set);
        boolean a2 = m14083a(set2);
        if (a == a2) {
            return i;
        }
        List a3 = m14085a(document, a2 ? set : set2);
        if (!a2) {
            set2 = set;
        }
        List a4 = m14085a(document, set2);
        if (!a && a2) {
            int i3;
            if (i > a3.indexOf(go.class)) {
                i3 = i - 1;
            } else {
                i3 = i;
            }
            if (i > a3.indexOf(gy.class)) {
                i3--;
            }
            if (i > a3.indexOf(bk.class)) {
                i3--;
            }
            if (i3 > a4.indexOf(ad.class)) {
                i3++;
            }
            return i3;
        } else if (!a || a2) {
            return i;
        } else {
            if (i > a4.indexOf(ad.class)) {
                i--;
            }
            List arrayList = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(a3.indexOf(go.class)), Integer.valueOf(a3.indexOf(gy.class)), Integer.valueOf(a3.indexOf(bk.class))}));
            Collections.sort(arrayList);
            while (i2 < arrayList.size()) {
                if (i > ((Integer) arrayList.get(i2)).intValue()) {
                    i++;
                }
                i2++;
            }
            return i;
        }
    }

    private static List m14081a(List list) {
        List arrayList = new ArrayList(list);
        m14082a(arrayList, df.class, al.class);
        return m14082a(arrayList, de.class, al.class);
    }

    private static List m14082a(List list, Class cls, Class cls2) {
        int indexOf = list.indexOf(cls);
        int indexOf2 = list.indexOf(cls2);
        if (!(indexOf == -1 || indexOf2 == -1 || indexOf <= indexOf2)) {
            for (int i = indexOf - 1; i >= indexOf2; i--) {
                list.set(i + 1, (Class) list.get(i));
            }
            list.set(indexOf2, cls);
        }
        return list;
    }

    static boolean m14083a(Set set) {
        return set.contains(Integer.valueOf(7));
    }
}
