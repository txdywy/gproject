package com.google.android.finsky.ao;

import com.android.volley.C0660x;
import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.nano.bu;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final /* synthetic */ class C1239c implements C0660x {
    public final C1237a f7393a;
    public final Map f7394b;
    public final C1243g f7395c;

    C1239c(C1237a c1237a, Map map, C1243g c1243g) {
        this.f7393a = c1237a;
        this.f7394b = map;
        this.f7395c = c1243g;
    }

    public final void b_(Object obj) {
        C1237a c1237a = this.f7393a;
        Map map = this.f7394b;
        C1243g c1243g = this.f7395c;
        bx bxVar = (bx) obj;
        Map hashMap = new HashMap();
        for (bu buVar : bxVar.a) {
            Document document = new Document(buVar.b);
            hashMap.put(document.cf(), document);
        }
        C1248l c1248l = new C1248l();
        for (String str : map.keySet()) {
            for (String str2 : (List) map.get(str)) {
                Document document2 = (Document) hashMap.get(str2);
                List list = (List) c1248l.f7412a.get(str);
                if (list == null) {
                    list = new ArrayList();
                    c1248l.f7412a.put(str, list);
                }
                list.add(document2);
            }
        }
        c1237a.m7243a(c1243g, c1248l.m7249a());
    }
}
