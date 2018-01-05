package com.squareup.okhttp;

import java.util.ArrayList;
import java.util.List;

public final class C7690w {
    public final List f39794a = new ArrayList(20);

    public final C7690w m37023a(String str, String str2) {
        C7690w.m37020d(str, str2);
        return m37024b(str, str2);
    }

    final C7690w m37024b(String str, String str2) {
        this.f39794a.add(str);
        this.f39794a.add(str2.trim());
        return this;
    }

    public final C7690w m37022a(String str) {
        int i = 0;
        while (i < this.f39794a.size()) {
            if (str.equalsIgnoreCase((String) this.f39794a.get(i))) {
                this.f39794a.remove(i);
                this.f39794a.remove(i);
                i -= 2;
            }
            i += 2;
        }
        return this;
    }

    public final C7690w m37025c(String str, String str2) {
        C7690w.m37020d(str, str2);
        m37022a(str);
        m37024b(str, str2);
        return this;
    }

    private static void m37020d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        } else if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        } else {
            int i;
            char charAt;
            int length = str.length();
            for (i = 0; i < length; i++) {
                charAt = str.charAt(i);
                if (charAt <= '\u001f' || charAt >= '') {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            length = str2.length();
            for (i = 0; i < length; i++) {
                charAt = str2.charAt(i);
                if (charAt <= '\u001f' || charAt >= '') {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str2}));
                }
            }
        }
    }

    public final C7689v m37021a() {
        return new C7689v(this);
    }
}
