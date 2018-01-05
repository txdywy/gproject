package com.google.android.libraries.performance.primes.p333b;

import com.google.android.libraries.performance.primes.p333b.p334a.C5957c;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.Snapshot;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public final class C5961a {
    public static final Iterable f29718a = Collections.unmodifiableList(Arrays.asList(new String[]{"boolean", "boolean[]", "boolean[][]", "byte", "byte[]", "byte[][]", "byte[][][]", "char", "char[]", "char[][]", "short", "short[]", "short[][]", "int", "int[]", "int[][]", "int[][][]", "long", "long[]", "long[][]", "float", "float[]", "float[][]", "double", "double[]", "double[][]", Snapshot.JAVA_LANG_CLASS, "java.lang.Class[]", "java.lang.Class[][]", "java.lang.Byte", "java.lang.Byte[]", "java.lang.Character", "java.lang.Character[]", "java.lang.Boolean", "java.lang.Boolean[]", "java.lang.Short", "java.lang.Short[]", "java.lang.Integer", "java.lang.Integer[]", "java.lang.Long", "java.lang.Long[]", "java.lang.Float", "java.lang.Float[]", "java.lang.Double", "java.lang.Double[]", "java.lang.String", "java.lang.String[]", "java.lang.String[][]", "java.lang.String[][][]"}));
    public static final Iterable f29719b = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(HprofParser.ROOT_DEBUGGER), Integer.valueOf(HprofParser.ROOT_FINALIZING), Integer.valueOf(HprofParser.ROOT_INTERNED_STRING), Integer.valueOf(HprofParser.ROOT_UNKNOWN), Integer.valueOf(HprofParser.ROOT_UNREACHABLE)}));
    public final File f29720c;

    public C5961a(File file) {
        this.f29720c = file;
    }

    public static List m27671a(C5970j c5970j, Iterable iterable) {
        List arrayList = new ArrayList();
        for (C5962e c5962e : iterable) {
            if (c5962e.f29722j != null && (c5962e instanceof C5965d)) {
                arrayList.add(C5961a.m27670a(c5970j, c5962e));
            }
        }
        return arrayList;
    }

    private static String m27670a(C5970j c5970j, C5962e c5962e) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c5962e.mo5238c(c5970j, -1));
        while (c5962e.f29722j != null) {
            stringBuilder.append('\n');
            stringBuilder.append(c5962e.f29722j.mo5238c(c5970j, c5962e.f29722j.m27681d(c5970j, c5962e.m27680d(c5970j))));
            c5962e = c5962e.f29722j;
        }
        return stringBuilder.toString();
    }

    public static void m27673a(C5970j c5970j, C5971k c5971k) {
        Deque arrayDeque = new ArrayDeque();
        for (C5962e c5962e : c5971k.f29759c) {
            if (!C5961a.m27674a(c5962e)) {
                arrayDeque.addLast(c5962e);
            }
        }
        C5961a.m27672a(c5970j, c5971k.f29758b, arrayDeque);
    }

    private static void m27672a(C5970j c5970j, C5957c c5957c, Deque deque) {
        while (!deque.isEmpty()) {
            C5962e c5962e = (C5962e) deque.removeFirst();
            int a = c5962e.mo5235a(c5970j);
            for (int i = 0; i < a; i++) {
                C5962e c5962e2 = (C5962e) c5957c.m27663a(c5962e.mo5236a(c5970j, i));
                if (c5962e2 != null && c5962e2.f29722j == null && (c5962e2.f29723k & 1) == 0 && !C5961a.m27674a(c5962e2)) {
                    c5962e2.f29722j = c5962e;
                    deque.addLast(c5962e2);
                }
            }
        }
    }

    private static boolean m27674a(C5962e c5962e) {
        return (c5962e instanceof C5965d) && (((C5965d) c5962e).f29733a.k & 2) != 0;
    }
}
