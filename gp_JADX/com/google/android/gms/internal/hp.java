package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.p239b.C4893b;
import java.util.ArrayList;
import java.util.List;

public class hp extends hx {
    public C4893b f26904t;

    static {
        hp.class.getSimpleName();
    }

    private hp(Context context) {
        super(context, "");
    }

    public static String m24701a(String str, String str2) {
        return ed.m24320a(str, str2);
    }

    public static hp m24702b(Context context) {
        hx.m24692a(context, true);
        return new hp(context);
    }

    protected final ci mo4758a(Context context, View view) {
        return null;
    }

    protected final void mo4761a(jp jpVar, ci ciVar, br brVar) {
        if (!jpVar.f27084n) {
            hx.m24693a(mo4762b(jpVar, ciVar, brVar));
        } else if (this.f26904t != null) {
            String str = this.f26904t.f25246a;
            if (!TextUtils.isEmpty(str)) {
                ciVar.ab = ju.m24986a(str);
                ciVar.ac = Integer.valueOf(5);
                ciVar.ad = Boolean.valueOf(this.f26904t.f25247b);
            }
            this.f26904t = null;
        }
    }

    protected final List mo4762b(jp jpVar, ci ciVar, br brVar) {
        List arrayList = new ArrayList();
        if (jpVar.f27074d == null) {
            return arrayList;
        }
        jp jpVar2 = jpVar;
        arrayList.add(new kq(jpVar2, "o7w7nD7659+FI5Gilkma9hcgrpF/prpHxl2mnzxedqbbyjgIpTwyk4wm6GfrdKne", "jmFYtmBsx6R0EkdxirPelCZXWeKwTC3D/yN9KFqdR9U=", ciVar, jpVar.m24980b()));
        return arrayList;
    }
}
