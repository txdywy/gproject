package com.google.android.finsky.ak;

public static class com.google.android.finsky.ak.p
{

    p() {
    }

    public static String a(int p0) {
        v0 = 0;
        if (p0 == 0)
            v0 = 0;
        else {
            v1 = new Throwable().getStackTrace();
            v2 = com.google.android.finsky.ak.p.getCanonicalName();
            while (v0 < v1.length && v1[v0].getClassName().startsWith(v2.substring(0, v2.lastIndexOf(".") + 1)))
                v0 = v0 + 1;
            v3 = new StringBuilder();
            while (v0 < Math.min(v1.length, v0 + p0)) {
                v3.append(v1[v0]);
                v3.append("\n");
                v0 = v0 + 1;
            }
            v0 = v3.toString();
        }
        return v0;
    }

}
