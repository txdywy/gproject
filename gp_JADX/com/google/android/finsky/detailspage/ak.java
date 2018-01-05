package com.google.android.finsky.detailspage;

import android.content.Context;
import com.google.android.finsky.detailsmodules.modules.secondaryactions.C2607c;
import com.google.android.finsky.detailsmodules.modules.subscriptions.C2617h;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ak {
    public static final List f14244a = Arrays.asList(new Class[]{ct.class, am.class, C2655i.class, go.class, C2676a.class, gy.class, ci.class, dc.class, cz.class, C2617h.class, gq.class, bk.class, C2636c.class, C2652f.class, al.class, dz.class, ef.class, bq.class, df.class, de.class, cv.class, C2688x.class, ce.class, C2634b.class, C2632a.class, fo.class, bt.class, C2664a.class, C2644a.class, eo.class, fg.class, el.class, dx.class, gs.class, gw.class, dn.class, dw.class, C2674v.class, C2607c.class, dd.class, cy.class, fd.class, C2689y.class, dl.class, cr.class, cp.class});
    public static final ai f14245b = new ai(0, Collections.emptySet(), m13856a(f14244a));
    public static final List f14246c = Arrays.asList(new Class[]{ct.class, am.class, C2655i.class, ad.class, C2676a.class, ci.class, dc.class, cz.class, C2617h.class, C2636c.class, C2652f.class, al.class, dz.class, ef.class, bq.class, df.class, de.class, cv.class, C2688x.class, ce.class, C2634b.class, C2632a.class, fo.class, bt.class, C2664a.class, C2644a.class, eo.class, fg.class, el.class, dx.class, gs.class, gw.class, dn.class, dw.class, C2674v.class, C2607c.class, dd.class, cy.class, fd.class, C2689y.class, dl.class, cr.class, cp.class});
    public static final ai f14247d = new ai(0, new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(7)})), m13856a(f14246c));
    public static final ai[] f14248e = new ai[]{ag.f14240a, ah.f14241a, f14247d, f14245b};

    public static List m13855a(Context context, Document document, Set set, be beVar, String str, C2599c c2599c, C2495w c2495w, C3748a c3748a, ad adVar) {
        ai a = m13854a(document, set);
        List arrayList = new ArrayList();
        List list = a.f14238d;
        for (int i = 0; i < list.size(); i++) {
            aj ajVar = (aj) list.get(i);
            for (int i2 = 0; i2 < ajVar.f14242a.size(); i2++) {
                Class cls = (Class) ajVar.f14242a.get(i2);
                if (cls != cy.class) {
                    try {
                        C2598b a2 = beVar.m13938a(cls, context, str, c2599c, c2495w, c3748a, adVar);
                        a2.f13822c = ajVar.f14243b;
                        arrayList.add(a2);
                    } catch (Exception e) {
                        String str2 = "Exception trying to instantiate module: ";
                        String valueOf = String.valueOf(e.getMessage());
                        FinskyLog.m21669e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    }
                }
            }
        }
        return arrayList;
    }

    static ai m13854a(Document document, Set set) {
        ai[] aiVarArr = f14248e;
        for (ai aiVar : aiVarArr) {
            if ((aiVar.f14236b == document.f14885a.f12099f || aiVar.f14236b == 0) && set.containsAll(aiVar.f14237c)) {
                return aiVar;
            }
        }
        FinskyLog.m21669e("No matching ordering found in D30 resolver.", new Object[0]);
        return f14245b;
    }

    private static List m13856a(List list) {
        List arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new aj((Class) list.get(i)));
        }
        return arrayList;
    }
}
