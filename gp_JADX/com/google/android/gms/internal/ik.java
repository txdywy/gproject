package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class ik extends hx {
    private ik(Context context, String str, boolean z) {
        super(context, str, false);
    }

    public static ik m24820a(String str, Context context) {
        hx.m24692a(context, false);
        return new ik(context, str, false);
    }

    protected final List mo4762b(jp jpVar, ci ciVar, br brVar) {
        if (jpVar.f27074d == null || !this.z) {
            return super.mo4762b(jpVar, ciVar, brVar);
        }
        int b = jpVar.m24980b();
        List arrayList = new ArrayList();
        arrayList.addAll(super.mo4762b(jpVar, ciVar, brVar));
        arrayList.add(new kq(jpVar, "o7w7nD7659+FI5Gilkma9hcgrpF/prpHxl2mnzxedqbbyjgIpTwyk4wm6GfrdKne", "jmFYtmBsx6R0EkdxirPelCZXWeKwTC3D/yN9KFqdR9U=", ciVar, b));
        return arrayList;
    }
}
