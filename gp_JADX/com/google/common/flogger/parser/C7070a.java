package com.google.common.flogger.parser;

import com.google.common.flogger.C7064l;
import com.google.common.flogger.backend.C7041k;

public abstract class C7070a extends C7069f {
    protected C7070a() {
        super(C7064l.BRACE_STYLE);
    }

    abstract void mo6015a(C7045e c7045e, int i, String str, int i2, int i3, int i4);

    public void mo6014a(StringBuilder stringBuilder, String str, int i, int i2) {
        C7041k.m32087b(stringBuilder, str, i, i2);
    }

    protected final void mo6013a(C7045e c7045e) {
        String str = c7045e.f34550e.f34567b;
        int a = C7070a.m32167a(str, 0);
        while (a >= 0) {
            int i = a + 1;
            int i2 = a + 1;
            int i3 = 0;
            while (i < str.length()) {
                int i4 = i + 1;
                char charAt = str.charAt(i);
                char c = (char) (charAt - 48);
                if (c < '\n') {
                    i3 = (i3 * 10) + c;
                    if (i3 >= 1000000) {
                        throw ParseException.m32162a("index too large", str, i2, i4);
                    }
                    i = i4;
                } else {
                    int i5 = (i4 - 1) - i2;
                    if (i5 == 0) {
                        throw ParseException.m32162a("missing index", str, a, i4);
                    } else if (str.charAt(i2) != '0' || i5 <= 1) {
                        if (charAt == '}') {
                            i2 = -1;
                            i5 = i4;
                        } else if (charAt == ',') {
                            i = i4;
                            while (i != str.length()) {
                                i2 = i + 1;
                                if (str.charAt(i) == '}') {
                                    i5 = i2;
                                    i2 = i4;
                                } else {
                                    i = i2;
                                }
                            }
                            throw ParseException.m32163b("unterminated parameter", str, a);
                        } else {
                            throw ParseException.m32162a("malformed index", str, a + 1, i4);
                        }
                        mo6015a(c7045e, i3, str, a, i2, i5);
                        a = C7070a.m32167a(str, i5);
                    } else {
                        throw ParseException.m32162a("index has leading zero", str, i2, i4 - 1);
                    }
                }
            }
            throw ParseException.m32163b("unterminated parameter", str, a);
        }
    }

    private static int m32167a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '{') {
                return i2 - 1;
            }
            if (charAt != '\'') {
                i = i2;
            } else if (i2 == str.length()) {
                throw ParseException.m32163b("trailing single quote", str, i2 - 1);
            } else {
                i = i2 + 1;
                if (str.charAt(i2) != '\'') {
                    int i3 = i - 2;
                    i2 = i;
                    while (i2 != str.length()) {
                        i = i2 + 1;
                        if (str.charAt(i2) != '\'') {
                            i2 = i;
                        }
                    }
                    throw ParseException.m32163b("unmatched single quote", str, i3);
                }
                continue;
            }
        }
        return -1;
    }
}
