package com.google.common.flogger.parser;

import com.google.common.flogger.C7064l;
import com.google.common.flogger.backend.C7041k;

public abstract class C7072g extends C7069f {
    protected C7072g() {
        super(C7064l.PRINTF_STYLE);
    }

    abstract int mo6016a(C7045e c7045e, int i, String str, int i2, int i3, int i4);

    public final void mo6014a(StringBuilder stringBuilder, String str, int i, int i2) {
        C7041k.m32086a(stringBuilder, str, i, i2);
    }

    protected final void mo6013a(C7045e c7045e) {
        String str = c7045e.f34550e.f34567b;
        int a = C7072g.m32173a(str, 0);
        int i = 0;
        int i2 = -1;
        while (a >= 0) {
            int i3 = a + 1;
            int i4 = 0;
            int i5 = i3;
            while (i5 < str.length()) {
                int i6 = i5 + 1;
                char charAt = str.charAt(i5);
                char c = (char) (charAt - 48);
                if (c < '\n') {
                    i4 = (i4 * 10) + c;
                    if (i4 >= 1000000) {
                        throw ParseException.m32162a("index too large", str, a, i6);
                    }
                    i5 = i6;
                } else {
                    if (charAt == '$') {
                        if ((i6 - 1) - i3 == 0) {
                            throw ParseException.m32162a("missing index", str, a, i6);
                        } else if (str.charAt(i3) == '0') {
                            throw ParseException.m32162a("index has leading zero", str, a, i6);
                        } else {
                            i3 = i4 - 1;
                            if (i6 == str.length()) {
                                throw ParseException.m32163b("unterminated parameter", str, a);
                            }
                            i4 = i6 + 1;
                            str.charAt(i6);
                        }
                    } else if (charAt != '<') {
                        int i7 = i;
                        i++;
                        i4 = i6;
                        i6 = i3;
                        i3 = i7;
                    } else if (i2 == -1) {
                        throw ParseException.m32162a("invalid relative parameter", str, a, i6);
                    } else if (i6 == str.length()) {
                        throw ParseException.m32163b("unterminated parameter", str, a);
                    } else {
                        i4 = i6 + 1;
                        str.charAt(i6);
                        i3 = i2;
                    }
                    i2 = i4 - 1;
                    while (i2 < str.length()) {
                        if (((char) ((str.charAt(i2) & -33) - 65)) < '\u001a') {
                            a = C7072g.m32173a(str, mo6016a(c7045e, i3, str, a, i6, i2));
                            i2 = i3;
                        } else {
                            i2++;
                        }
                    }
                    throw ParseException.m32163b("unterminated parameter", str, a);
                }
            }
            throw ParseException.m32163b("unterminated parameter", str, a);
        }
    }

    private static int m32173a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw ParseException.m32163b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }
}
