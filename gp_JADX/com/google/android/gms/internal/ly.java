package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.safetynet.C5321b;
import java.util.List;

public class ly implements C5321b {
    public static SparseArray f27161a;
    public static long f27162b;

    static {
        ly.class.getSimpleName();
    }

    public final C4954s mo4815a(C5058o c5058o, List list, String str) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (!TextUtils.isEmpty(str)) {
            return c5058o.mo4544a(new me(c5058o, list, str));
        } else {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        }
    }

    public final C4954s mo4816a(C5058o c5058o, byte[] bArr) {
        return c5058o.mo4544a(new md(c5058o, bArr));
    }
}
