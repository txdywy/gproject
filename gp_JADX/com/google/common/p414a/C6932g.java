package com.google.common.p414a;

import java.util.Arrays;

public final class C6932g {
    public final String f34260a;
    public final C6933h f34261b = new C6933h();
    public C6933h f34262c = this.f34261b;
    public boolean f34263d = false;

    public C6932g(String str) {
        this.f34260a = (String) C6937m.m31623a((Object) str);
    }

    public final String toString() {
        boolean z = this.f34263d;
        StringBuilder append = new StringBuilder(32).append(this.f34260a).append('{');
        String str = "";
        for (C6933h c6933h = this.f34261b.f34266c; c6933h != null; c6933h = c6933h.f34266c) {
            Object obj = c6933h.f34265b;
            if (!z || obj != null) {
                append.append(str);
                str = ", ";
                if (c6933h.f34264a != null) {
                    append.append(c6933h.f34264a).append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    append.append(obj);
                } else {
                    CharSequence deepToString = Arrays.deepToString(new Object[]{obj});
                    append.append(deepToString, 1, deepToString.length() - 1);
                }
            }
        }
        return append.append('}').toString();
    }
}
