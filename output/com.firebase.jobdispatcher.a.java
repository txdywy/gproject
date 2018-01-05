package com.firebase.jobdispatcher;

static class com.firebase.jobdispatcher.a
{

    public static final int[] a;

    static {
        com.firebase.jobdispatcher.a.a = new int[4]{2, 1, 4, 8};
    }

    static int a(int[] p0) {
        v0 = 0;
        if (p0 != 0) {
            v1 = 0;
            while (v1 < p0.length) {
                v2 = p0[v1] | v0;
                v1 = v1 + 1;
                v0 = v2;
            }
        }
        return v0;
    }

    static int[] a(int p0) {
        v1 = 0;
        v2 = 0;
        v3 = 0;
        while (v2 < com.firebase.jobdispatcher.a.a.length) {
            if ((p0 & com.firebase.jobdispatcher.a.a[v2]) == com.firebase.jobdispatcher.a.a[v2])
                v0 = 1;
            else
                v0 = 0;
            v3 = v3 + v0;
            v2 = v2 + 1;
        }
        v3 = new int[v3];
        v2 = 0;
        while (v2 < com.firebase.jobdispatcher.a.a.length) {
            if ((p0 & com.firebase.jobdispatcher.a.a[v2]) == com.firebase.jobdispatcher.a.a[v2]) {
                v0 = v1 + 1;
                v3[v1] = com.firebase.jobdispatcher.a.a[v2];
            }
            else
                v0 = v1;
            v2 = v2 + 1;
            v1 = v0;
        }
        return v3;
    }

}
