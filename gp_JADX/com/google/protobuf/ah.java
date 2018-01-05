package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ah {
    public static volatile boolean f35106a = false;
    public static volatile ah f35107b;
    public static final ah f35108c = new ah((byte) 0);
    public final Map f35109d;

    private static Class m32881d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static ah m32878a() {
        return ag.m32874a();
    }

    public static ah m32879b() {
        ah ahVar = f35107b;
        if (ahVar == null) {
            synchronized (ah.class) {
                ahVar = f35107b;
                if (ahVar == null) {
                    ahVar = ag.m32876b();
                    f35107b = ahVar;
                }
            }
        }
        return ahVar;
    }

    static ah m32880c() {
        return ar.m32931a(ah.class);
    }

    public ax mo6220a(cf cfVar, int i) {
        return (ax) this.f35109d.get(new ai(cfVar, i));
    }

    ah() {
        this.f35109d = new HashMap();
    }

    ah(byte b) {
        this.f35109d = Collections.emptyMap();
    }

    static {
        m32881d();
    }
}
