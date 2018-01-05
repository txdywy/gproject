package com.google.android.finsky.ak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C1215q {
    public final StringBuilder f7339a;
    public final List f7340b;

    public C1215q() {
        this(new StringBuilder("1=1"), new ArrayList());
    }

    public C1215q(Object obj) {
        this("pk", obj);
    }

    public C1215q(String str, Object obj) {
        this();
        m7191a(str, obj);
    }

    private C1215q(StringBuilder stringBuilder, List list) {
        this.f7339a = stringBuilder;
        this.f7340b = list;
    }

    public final C1215q m7191a(String str, Object obj) {
        m7193a(str, "=", obj);
        return this;
    }

    public final C1215q m7197b(String str, Object obj) {
        m7193a(str, "<", obj);
        return this;
    }

    public final C1215q m7192a(String str, List list) {
        m7194a(str, "in", list);
        return this;
    }

    public final C1215q m7190a(String str) {
        m7193a(str, "is null", null);
        return this;
    }

    public final String[] m7196a() {
        List list = this.f7340b;
        if (list.isEmpty()) {
            return null;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public final void m7193a(String str, String str2, Object obj) {
        m7194a(str, str2, obj == null ? null : Collections.singletonList(obj));
    }

    public final void m7194a(String str, String str2, List list) {
        m7195a(str, str2, false, list);
    }

    public final void m7195a(String str, String str2, boolean z, List list) {
        this.f7339a.append(" AND ");
        this.f7339a.append(str);
        this.f7339a.append(" ");
        this.f7339a.append(str2);
        if (list != null) {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Empty argument value");
            }
            Class cls = null;
            for (Object next : list) {
                if (cls == null) {
                    cls = next.getClass();
                }
                if (!cls.isInstance(next)) {
                    throw new IllegalArgumentException("Heterogeneous list of values provided, all objects should be same type");
                }
            }
            this.f7339a.append(" (?");
            int size = list.size();
            for (int i = 0; i < size - 1; i++) {
                this.f7339a.append(", ?");
            }
            this.f7339a.append(")");
            if (z) {
                this.f7339a.append(" ESCAPE '!'");
            }
            for (Object valueOf : list) {
                this.f7340b.add(String.valueOf(valueOf));
            }
        }
    }

    public static C1215q m7189a(C1215q c1215q, C1215q c1215q2, String str) {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(c1215q.f7339a.toString());
        stringBuilder.append(String.format(") %s (", new Object[]{str}));
        stringBuilder.append(c1215q2.f7339a.toString());
        stringBuilder.append(")");
        List arrayList = new ArrayList(c1215q.f7340b);
        arrayList.addAll(c1215q2.f7340b);
        return new C1215q(stringBuilder, arrayList);
    }
}
