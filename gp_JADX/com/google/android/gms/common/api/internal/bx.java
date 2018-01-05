package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5588e;

public final class bx {
    public static void m23506a(Status status, Object obj, C5588e c5588e) {
        if (status.m23271a()) {
            c5588e.m26583a(obj);
        } else {
            c5588e.m26582a(new ApiException(status));
        }
    }
}
