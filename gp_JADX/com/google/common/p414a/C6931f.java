package com.google.common.p414a;

import java.io.IOException;
import java.util.Iterator;

public final class C6931f {
    public final String f34259a;

    public C6931f(String str) {
        this.f34259a = (String) C6937m.m31623a((Object) str);
    }

    public final StringBuilder m31619a(StringBuilder stringBuilder, Iterator it) {
        try {
            C6937m.m31623a((Object) stringBuilder);
            if (it.hasNext()) {
                stringBuilder.append(C6931f.m31618a(it.next()));
                while (it.hasNext()) {
                    stringBuilder.append(this.f34259a);
                    stringBuilder.append(C6931f.m31618a(it.next()));
                }
            }
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static CharSequence m31618a(Object obj) {
        C6937m.m31623a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
