package com.google.firebase;

import android.support.v4.h.a;
import com.google.android.gms.common.util.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public final class C7122a {
    public static final Object f34830a = new Object();
    public static final Map f34831b = new a();

    static {
        Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
        Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
        Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
        Arrays.asList(new String[0]);
        Collections.emptySet();
    }

    public static C7126b m32345a() {
        throw new NoSuchMethodError();
    }

    public static C7122a m32346b() {
        C7122a c7122a;
        synchronized (f34830a) {
            c7122a = (C7122a) f34831b.get("[DEFAULT]");
            if (c7122a == null) {
                String a = k.a();
                throw new IllegalStateException(new StringBuilder(String.valueOf(a).length() + 116).append("Default FirebaseApp is not initialized in this process ").append(a).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
            }
        }
        return c7122a;
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }

    public final int hashCode() {
        throw new NoSuchMethodError();
    }

    public final String toString() {
        throw new NoSuchMethodError();
    }
}
