package com.google.common.p420f.p421a;

import com.google.common.p414a.C6925j;
import com.google.common.p415b.ar;
import com.google.common.p415b.bh;
import java.util.Collections;
import java.util.List;

final class ac extends aa {
    ac(ab abVar, ar arVar) {
        super(abVar, arVar);
    }

    public final /* synthetic */ Object mo5935a(List list) {
        List a = bh.m31760a(list.size());
        for (C6925j c6925j : list) {
            a.add(c6925j != null ? c6925j.mo5848c() : null);
        }
        return Collections.unmodifiableList(a);
    }
}
