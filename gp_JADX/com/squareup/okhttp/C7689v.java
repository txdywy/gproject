package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.C7664o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class C7689v {
    public final String[] f39793a;

    C7689v(C7690w c7690w) {
        this.f39793a = (String[]) c7690w.f39794a.toArray(new String[c7690w.f39794a.size()]);
    }

    public final String m37014a(String str) {
        String[] strArr = this.f39793a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final Date m37018b(String str) {
        String a = m37014a(str);
        return a != null ? C7664o.m36960a(a) : null;
    }

    public final String m37013a(int i) {
        int i2 = i * 2;
        if (i2 < 0 || i2 >= this.f39793a.length) {
            return null;
        }
        return this.f39793a[i2];
    }

    public final String m37017b(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0 || i2 >= this.f39793a.length) {
            return null;
        }
        return this.f39793a[i2];
    }

    public final Set m37015a() {
        Set treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.f39793a.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(m37013a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final List m37019c(String str) {
        int length = this.f39793a.length / 2;
        List list = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(m37013a(i))) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(m37017b(i));
            }
        }
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return Collections.emptyList();
    }

    public final C7690w m37016b() {
        C7690w c7690w = new C7690w();
        Collections.addAll(c7690w.f39794a, this.f39793a);
        return c7690w;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.f39793a.length / 2;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(m37013a(i)).append(": ").append(m37017b(i)).append("\n");
        }
        return stringBuilder.toString();
    }
}
