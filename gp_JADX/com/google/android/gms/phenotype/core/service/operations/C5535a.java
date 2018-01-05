package com.google.android.gms.phenotype.core.service.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C5535a {
    static void m26477a(Map map, Object obj, Object obj2) {
        List list = (List) map.get(obj);
        if (list == null) {
            list = new ArrayList();
            map.put(obj, list);
        }
        list.add(obj2);
    }
}
