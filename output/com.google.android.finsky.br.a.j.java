package com.google.android.finsky.br.a;

import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.as.a;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;

static class com.google.android.finsky.br.a.j
{

    public static Class a;

    static {
        com.google.android.finsky.br.a.j.a = 0;
    }

    static synchronized Class a() {
        enter com.google.android.finsky.br.a.j;
        try {
            if (com.google.android.finsky.br.a.j.a == 0) {
                if (com.google.android.finsky.as.a.a(com.google.android.finsky.m.a.b)) {
                    try {
                        com.google.android.finsky.br.a.j.a = Class.forName("com.google.android.finsky.activities.TvMainActivity");
                    }
                    catch (ClassNotFoundException ex) {
                        try {
                            v2 = new Object[1];
                            v2[0] = "com.google.android.finsky.activities.TvMainActivity";
                            FinskyLog.e("Could not find class '%s'", v2);
                        }
                        catch (Throwable ex) {
                            exit com.google.android.finsky.br.a.j;
                            throw ex;
                        }
                    }
                    catch (Throwable ex) {
                        exit com.google.android.finsky.br.a.j;
                        throw ex;
                    }
                }
                else {
                    try {
                        com.google.android.finsky.br.a.j.a = MainActivity;
                    }
                    catch (Throwable ex) {
                        exit com.google.android.finsky.br.a.j;
                        throw ex;
                    }
                }
            }
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.br.a.j;
            throw ex;
        }
        try {
            exit com.google.android.finsky.br.a.j;
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.br.a.j;
            throw ex;
        }
        return com.google.android.finsky.br.a.j.a;
    }

    static Class b() {
        try {
            v0 = Class.forName("com.google.android.finsky.activities.TvTosActivity");
        }
        catch (ClassNotFoundException ex) {
            v1 = new Object[1];
            v1[0] = "com.google.android.finsky.activities.TvTosActivity";
            FinskyLog.d("Could not find class '%s'", v1);
            v0 = 0;
        }
        return v0;
    }

}
