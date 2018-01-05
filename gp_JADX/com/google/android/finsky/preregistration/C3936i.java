package com.google.android.finsky.preregistration;

import android.content.Context;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C3936i implements C1031w {
    public final /* synthetic */ C3928a f19911a;
    public final /* synthetic */ C3197o f19912b;
    public final /* synthetic */ Context f19913c;
    public final /* synthetic */ C3934g f19914d;

    public C3936i(C3934g c3934g, C3928a c3928a, C3197o c3197o, Context context) {
        this.f19914d = c3934g;
        this.f19911a = c3928a;
        this.f19912b = c3197o;
        this.f19913c = context;
    }

    public final void m_() {
        C3934g c3934g = this.f19914d;
        Map map = this.f19911a.f19888d;
        C3197o c3197o = this.f19912b;
        Context context = this.f19913c;
        List arrayList = new ArrayList(Arrays.asList(C4680k.m21818a((String) C0954a.ab.m5760a())));
        Iterator it = arrayList.iterator();
        Object obj = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!map.containsKey(str)) {
                C0954a.ac.m5777b(str).m5765c();
                it.remove();
                obj = 1;
            }
        }
        if (obj != null) {
            if (arrayList.size() == 0) {
                C0954a.ab.m5765c();
            } else {
                C0954a.ab.m5763a(C4680k.m21815a(arrayList));
            }
        }
        long a = C4678i.m21812a();
        if (map != null) {
            for (C3929b c3929b : map.values()) {
                Document document = c3929b.f19890a;
                if (!document.ae() && document.af() == 1) {
                    String str2 = document.f14885a.f12096c;
                    if (c3934g.f19903h.mo2854a(str2) != null) {
                        c3934g.m18639a(str2, c3929b.f19891b, context);
                    } else if (c3929b.f19891b.size() == 0) {
                        FinskyLog.m21669e("We got a document (%s) with no associated account names", str2);
                    } else {
                        long longValue = ((Long) C0954a.ac.m5777b(str2).m5760a()).longValue();
                        if (longValue == 0) {
                            if (c3197o != null) {
                                c3197o.mo3372a(document, (String) c3929b.f19891b.get(0));
                            }
                        } else if (longValue < a - C3934g.f19896a) {
                            c3934g.m18639a(str2, c3929b.f19891b, context);
                        }
                    }
                }
            }
        }
        if (this.f19912b != null) {
            this.f19912b.mo3373a(true);
        }
    }
}
