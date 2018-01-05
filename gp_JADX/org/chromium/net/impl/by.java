package org.chromium.net.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.chromium.net.az;

public final class by extends az {
    public final List f40903a;
    public Map f40904b;

    by(List list) {
        this.f40903a = list;
    }

    public final Map m38130a() {
        if (this.f40904b != null) {
            return this.f40904b;
        }
        Map treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Entry entry : this.f40903a) {
            List arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        this.f40904b = Collections.unmodifiableMap(treeMap);
        return this.f40904b;
    }
}
