package com.google.android.libraries.performance.primes;

import d.a.a.a.a.a.bk;
import java.util.ArrayList;

final class eb {
    public final ArrayList f30018a = new ArrayList();
    public long f30019b = 1;

    eb(String str, long j) {
        m27842a(str, this.f30019b, 0, j, j);
    }

    final long m27841a(String str, long j, long j2) {
        long j3 = this.f30019b + 1;
        this.f30019b = j3;
        return m27842a(str, j3, 1, j, j2);
    }

    final long m27842a(String str, long j, long j2, long j3, long j4) {
        if (j4 < j3) {
            String str2 = "PrimesStartupTracer";
            String str3 = "endTime < startTime. Dropping span: ";
            String valueOf = String.valueOf(str);
            C5989do.m27824a(5, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            return -1;
        }
        bk bkVar = new bk();
        bkVar.c = Long.valueOf(j);
        bkVar.b = str;
        bkVar.e = Long.valueOf(j3);
        bkVar.f = Long.valueOf(j4 - j3);
        bkVar.d = Long.valueOf(j2);
        this.f30018a.add(bkVar);
        return j;
    }
}
