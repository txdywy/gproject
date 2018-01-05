package com.google.common.flogger.parser;

import com.google.common.flogger.backend.C7041k;
import com.google.common.flogger.p422a.C7004a;

public final class C7071b extends C7070a {
    public static final C7070a f34586a = new C7071b();

    private C7071b() {
    }

    public final void mo6015a(C7045e c7045e, int i, String str, int i2, int i3, int i4) {
        if (i3 != -1) {
            throw ParseException.m32162a("the default brace style parser does not allow trailing format specifiers", str, i3 - 1, i4 - 1);
        }
        c7045e.m32098b(i2, i4, C7004a.m31940a(i));
    }

    public final void mo6014a(StringBuilder stringBuilder, String str, int i, int i2) {
        C7041k.m32087b(stringBuilder, str, i, i2);
    }
}
