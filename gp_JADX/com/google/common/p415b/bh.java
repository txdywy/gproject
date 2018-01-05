package com.google.common.p415b;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class bh {
    public static ArrayList m31760a(int i) {
        ae.m31700a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List m31761a(List list) {
        if (list instanceof at) {
            return ((at) list).mo5892e();
        }
        if (list instanceof bj) {
            return ((bj) list).f34307a;
        }
        if (list instanceof RandomAccess) {
            return new bi(list);
        }
        return new bj(list);
    }
}
