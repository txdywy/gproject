package com.google.android.wallet.common.p376a;

import java.util.Arrays;
import java.util.HashSet;

public final class C6548a {
    public static final char[] f32641a = new char[]{'S', 'C', 'N', 'O', '1', '2', '3', 'D', 'Z', 'X', 'A', 'U', 'F', 'P', 'T', 'B', 'R'};
    public static final HashSet f32642b = new HashSet(f32641a.length);

    public static boolean m29720a(char c) {
        return f32642b.contains(Character.valueOf(c));
    }

    public static char[] m29721a() {
        return Arrays.copyOf(f32641a, f32641a.length);
    }

    static {
        for (char valueOf : f32641a) {
            f32642b.add(Character.valueOf(valueOf));
        }
    }
}
