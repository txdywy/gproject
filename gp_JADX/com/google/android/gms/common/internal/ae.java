package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class ae {
    public final List f25979a = new ArrayList();
    public final Object f25980b;

    ae(Object obj) {
        this.f25980b = am.m23733a(obj);
    }

    public final ae m23723a(String str, Object obj) {
        List list = this.f25979a;
        String str2 = (String) am.m23733a((Object) str);
        String valueOf = String.valueOf(obj);
        list.add(new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
        return this;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder(100).append(this.f25980b.getClass().getSimpleName()).append('{');
        int size = this.f25979a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.f25979a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
