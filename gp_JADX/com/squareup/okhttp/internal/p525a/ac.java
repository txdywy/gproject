package com.squareup.okhttp.internal.p525a;

import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.util.logging.Logger;
import p526e.C7724h;
import p526e.C7725i;
import p526e.C7728j;

public final class ac implements at {
    public static final Logger f39397a = Logger.getLogger(ae.class.getName());
    public static final C7728j f39398b = C7728j.m37412a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public final C7610b mo6421a(C7725i c7725i, boolean z) {
        return new af(c7725i, z);
    }

    public final C7611d mo6422a(C7724h c7724h, boolean z) {
        return new ag(c7724h, z);
    }

    static IllegalArgumentException m36699a(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    static IOException m36701b(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    static int m36697a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            short s2 = i - 1;
        }
        if (s <= s2) {
            return (short) (s2 - s);
        }
        throw ac.m36701b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(s2));
    }

    static int m36698a(C7725i c7725i) {
        return (((c7725i.mo6496f() & HprofParser.ROOT_UNKNOWN) << 16) | ((c7725i.mo6496f() & HprofParser.ROOT_UNKNOWN) << 8)) | (c7725i.mo6496f() & HprofParser.ROOT_UNKNOWN);
    }

    static void m36700a(C7724h c7724h, int i) {
        c7724h.mo6493e((i >>> 16) & HprofParser.ROOT_UNKNOWN);
        c7724h.mo6493e((i >>> 8) & HprofParser.ROOT_UNKNOWN);
        c7724h.mo6493e(i & HprofParser.ROOT_UNKNOWN);
    }
}
