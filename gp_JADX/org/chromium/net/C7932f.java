package org.chromium.net;

import android.content.Context;
import java.util.Collections;
import java.util.List;

public class C7932f {
    public final C7941s f40677a;

    public C7932f(Context context) {
        this(((C7935i) C7932f.m37975a(C7935i.m37981a(context)).get(0)).mo6605a().f40677a);
    }

    public C7932f(C7941s c7941s) {
        this.f40677a = c7941s;
    }

    public C7932f mo6641a(boolean z) {
        this.f40677a.mo6612b(z);
        return this;
    }

    public C7932f mo6642b(boolean z) {
        this.f40677a.mo6611a(z);
        return this;
    }

    public C7932f mo6640a(String str, int i, int i2) {
        this.f40677a.mo6610a(str, i, i2);
        return this;
    }

    public C7931e mo6639a() {
        return this.f40677a.mo6614a();
    }

    private static List m37975a(List list) {
        if (list.size() == 0) {
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }
        for (C7935i d : list) {
            d.mo6608d();
        }
        if (list.size() == 0) {
            throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
        }
        Collections.sort(list, new C7933g());
        return list;
    }

    static int m37974a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("The input values cannot be null");
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt != parseInt2) {
                    return Integer.signum(parseInt - parseInt2);
                }
                i++;
            } catch (Throwable e) {
                throw new IllegalArgumentException("Unable to convert version segments into integers: " + split[i] + " & " + split2[i], e);
            }
        }
        return Integer.signum(split.length - split2.length);
    }
}
