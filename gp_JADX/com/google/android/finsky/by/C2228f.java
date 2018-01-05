package com.google.android.finsky.by;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C2228f extends C2227g {
    public static final String[] f11114a = null;
    public static Map f11115b;
    public final String[] f11116c;
    public final long f11117d;
    public final long f11118e;
    public final boolean f11119f;

    public C2228f(String str, String str2, int i, long j, String[] strArr, long j2, long j3, boolean z, boolean z2, String str3, int i2, long j4) {
        super(str, C2229h.f11120a, 3, str2, 1, i, j, Long.MAX_VALUE, false, z2, str3, i2, j4);
        this.f11116c = strArr;
        this.f11117d = j2;
        this.f11118e = j3;
        this.f11119f = z;
    }

    public final String toString() {
        return String.format("{package=%s}", new Object[]{this.f11104k});
    }

    public final boolean m11635a(String[] strArr) {
        if (strArr == f11114a) {
            return true;
        }
        for (String str : strArr) {
            for (Object equals : this.f11116c) {
                if (str.equals(equals)) {
                    return true;
                }
            }
        }
        if (strArr == f11114a) {
            return true;
        }
        List list = (List) C2228f.m11634a().get(this.f11104k);
        if (list != null) {
            for (Object contains : strArr) {
                if (list.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof C2228f)) {
            return true;
        }
        C2228f c2228f = (C2228f) obj;
        if (this.f11116c.length != c2228f.f11116c.length) {
            return false;
        }
        for (String equals : this.f11116c) {
            boolean z;
            for (int i = 0; i < r4; i++) {
                if (equals.equals(c2228f.f11116c[i])) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private static synchronized Map m11634a() {
        synchronized (C2228f.class) {
            if (f11115b == null) {
                f11115b = new HashMap();
                for (String split : ((String) C0955b.gJ.m28964b()).split(";")) {
                    String[] split2 = split.split(":");
                    if (split2.length != 2) {
                        FinskyLog.m21659a("Wrong format for package key rotation spec %s", split);
                    } else {
                        f11115b.put(split2[0], new ArrayList(Arrays.asList(C4680k.m21818a(split2[1]))));
                    }
                }
            }
        }
        return f11115b;
    }
}
