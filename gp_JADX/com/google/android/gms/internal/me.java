package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C5058o;
import java.util.List;

final class me extends mb {
    public /* synthetic */ List f27172u;
    public /* synthetic */ String f27173v;
    public /* synthetic */ String f27174w = null;

    me(C5058o c5058o, List list, String str) {
        this.f27172u = list;
        this.f27173v = str;
        super(c5058o);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        String a;
        mi miVar = (mi) c4948f;
        lu luVar = this.a;
        List list = this.f27172u;
        String str = this.f27173v;
        String str2 = this.f27174w;
        if (str2 == null) {
            a = miVar.m25158a("com.google.android.safetynet.API_KEY");
        } else {
            a = str2;
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        ((lw) miVar.m23032u()).mo4812a(luVar, a, iArr, str);
    }
}
