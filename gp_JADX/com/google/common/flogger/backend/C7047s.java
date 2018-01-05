package com.google.common.flogger.backend;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public final class C7047s {
    public static final C7047s f34557a = new C7047s(Collections.unmodifiableSortedMap(new TreeMap()));
    public final SortedMap f34558b;
    public Integer f34559c = null;
    public String f34560d = null;

    private C7047s(SortedMap sortedMap) {
        this.f34558b = sortedMap;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7047s) && ((C7047s) obj).f34558b.equals(this.f34558b);
    }

    public final int hashCode() {
        if (this.f34559c == null) {
            this.f34559c = Integer.valueOf(this.f34558b.hashCode());
        }
        return this.f34559c.intValue();
    }

    public final String toString() {
        if (this.f34560d == null) {
            SortedMap sortedMap = this.f34558b;
            StringBuilder stringBuilder = new StringBuilder("{");
            if (sortedMap.isEmpty()) {
                stringBuilder.append("}");
            } else {
                for (Entry entry : sortedMap.entrySet()) {
                    stringBuilder.append((String) entry.getKey());
                    SortedSet<Object> sortedSet = (SortedSet) entry.getValue();
                    if (!sortedSet.isEmpty()) {
                        stringBuilder.append(':');
                        if (sortedSet.size() == 1) {
                            C7047s.m32115a(stringBuilder, sortedSet.iterator().next());
                        } else {
                            stringBuilder.append('[');
                            for (Object a : sortedSet) {
                                C7047s.m32115a(stringBuilder, a);
                                stringBuilder.append(',');
                            }
                            stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
                        }
                    }
                    stringBuilder.append(", ");
                }
                stringBuilder.setCharAt(stringBuilder.length() - 2, '}');
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
            this.f34560d = stringBuilder.toString();
        }
        return this.f34560d;
    }

    private static void m32115a(StringBuilder stringBuilder, Object obj) {
        int i = 0;
        if (obj instanceof String) {
            stringBuilder.append('\"');
            String str = (String) obj;
            for (int a = C7047s.m32114a(str, 0); a != -1; a = C7047s.m32114a(str, a + 1)) {
                stringBuilder.append(str, i, a).append("\\");
                i = a;
            }
            stringBuilder.append(str, i, str.length());
            stringBuilder.append('\"');
            return;
        }
        stringBuilder.append(obj);
    }

    private static int m32114a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    static {
        C7048t c7048t = new C7048t();
        Collections.unmodifiableSortedSet(new TreeSet());
    }
}
