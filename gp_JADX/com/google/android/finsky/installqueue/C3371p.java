package com.google.android.finsky.installqueue;

import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.List;

public final class C3371p {
    public final int f17276a;
    public final long f17277b;
    public final long f17278c;
    public final int f17279d;
    public final List f17280e;

    public C3371p(int i, long j, long j2, int i2) {
        this(i, j, j2, i2, Arrays.asList(new String[0]));
    }

    public C3371p(int i, long j, long j2, int i2, List list) {
        this.f17276a = i;
        this.f17277b = j;
        this.f17278c = j2;
        this.f17279d = i2;
        this.f17280e = list;
    }

    @Deprecated
    public static int m16828a(int i) {
        switch (i) {
            case 0:
                return -1;
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 4;
            case 4:
                return 7;
            default:
                FinskyLog.m21669e("Invalid InstallerState: %d", Integer.valueOf(i));
                return -1;
        }
    }
}
