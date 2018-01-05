package com.google.android.finsky.cs.a.a;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.clearcut.a.a.a;
import com.google.android.gms.phenotype.core.c;
import com.google.android.play.a.a.l;
import com.google.d.a.b.a;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import com.google.wireless.android.a.a.a.a.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public static class com.google.android.finsky.cs.a.a.g
{

    g() {
    }

    public static com.google.android.play.a.a.l a(com.google.android.gms.phenotype.core.c p0, boolean p1) {
        v2 = 0;
        if (p0 == 0)
            v0 = 0;
        else {
            v4 = new com.google.wireless.android.a.a.a.a.h();
            if (p0 == 0)
                v0 = 0;
            else
                v0 = p0.i;
            if ((!com.google.android.gms.clearcut.a.a.a.a(v0)) || !com.google.android.gms.clearcut.a.a.a.a(0)) {
                v7 = new com.google.d.a.b.a();
                v7.c = new int[com.google.android.gms.clearcut.a.a.a.b(v0) + com.google.android.gms.clearcut.a.a.a.b(0)];
                if (v0 != 0) {
                    v1 = 0;
                    v5 = 0;
                    while (v1 < v0.length) {
                        v7.c[v5] = v0[v1];
                        v1 = v1 + 1;
                        v5 = v5 + 1;
                    }
                }
                v4.a = com.google.protobuf.nano.i.a(v7);
            }
            if (p0 != 0)
                v1 = Math.max(1, com.google.android.gms.clearcut.a.a.a.a(p0.j)) + com.google.android.gms.clearcut.a.a.a.a(p0.e) + com.google.android.gms.clearcut.a.a.a.a(p0.f) + com.google.android.gms.clearcut.a.a.a.a(p0.g) + com.google.android.gms.clearcut.a.a.a.a(p0.h);
            else
                v1 = 0;
            v0 = new ArrayList(v1);
            if (p0 != 0) {
                if (p0.d != 0 && p0.d.length != 0)
                    v0.add(p0.d);
                if (p0.j != 0) {
                    v1 = 0;
                    while (v1 < p0.j.length) {
                        if (p0.j[v1] != 0) {
                            if (p0.j[v1].length != 0)
                                v0.add(p0.j[v1]);
                        }
                        v1 = v1 + 1;
                    }
                }
                v4.d = p1;
                if (p1 != 0 && p0.e != 0)
                    Collections.addAll(v0, p0.e);
                if (p0.f != 0)
                    Collections.addAll(v0, p0.f);
                if (p0.g != 0)
                    Collections.addAll(v0, p0.g);
                if (p0.h != 0)
                    Collections.addAll(v0, p0.h);
            }
            v4.c = new byte[v0.size()][];
            v5 = 0;
            v6 = 0;
            while (v5 < ((ArrayList)v0).size()) {
                v1 = ((ArrayList)v0).get(v5);
                v5 = v5 + 1;
                v4.c[v6] = (byte[])v1;
                v6 = v6 + 1;
            }
            v0 = v4;
        }
        if (v0 != 0) {
            try {
                v2 = com.google.android.play.a.a.l.a(com.google.protobuf.nano.i.a(v0));
            }
            catch (InvalidProtocolBufferNanoException ex) {
                FinskyLog.b(ex, "Error converting ExperimentTokens.", new Object[0]);
            }
        }
        return v2;
    }

}
