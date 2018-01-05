package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class C0697m {
    public final int f4166a;
    public final byte[] f4167b;
    public final Map f4168c;
    public final List f4169d;
    public final boolean f4170e;
    public final long f4171f;

    @Deprecated
    public C0697m(int i, byte[] bArr, Map map, boolean z, long j) {
        this(i, bArr, map, C0697m.m4508a(map), z, j);
    }

    public C0697m(int i, byte[] bArr, boolean z, long j, List list) {
        this(i, bArr, C0697m.m4509a(list), list, z, j);
    }

    @Deprecated
    public C0697m(int i, byte[] bArr, Map map, boolean z) {
        this(i, bArr, map, z, 0);
    }

    public C0697m(byte[] bArr) {
        this(200, bArr, false, 0, Collections.emptyList());
    }

    @Deprecated
    public C0697m(byte[] bArr, Map map) {
        this(200, bArr, map, false, 0);
    }

    private C0697m(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.f4166a = i;
        this.f4167b = bArr;
        this.f4168c = map;
        if (list == null) {
            this.f4169d = null;
        } else {
            this.f4169d = Collections.unmodifiableList(list);
        }
        this.f4170e = z;
        this.f4171f = j;
    }

    private static Map m4509a(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        Map treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C0695j c0695j : list) {
            treeMap.put(c0695j.f4159a, c0695j.f4160b);
        }
        return treeMap;
    }

    private static List m4508a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new C0695j((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
