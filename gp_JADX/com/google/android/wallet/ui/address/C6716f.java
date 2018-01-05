package com.google.android.wallet.ui.address;

import android.text.TextUtils;
import com.android.volley.x;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.p440g.p441a.p442a.C7147b;
import java.util.ArrayList;
import org.json.JSONObject;

final class C6716f implements x {
    public final /* synthetic */ ArrayList f33158a;
    public final /* synthetic */ C6713c f33159b;

    C6716f(C6713c c6713c, ArrayList arrayList) {
        this.f33159b = c6713c;
        this.f33158a = arrayList;
    }

    public final /* synthetic */ void b_(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        this.f33159b.m30437a(false);
        int a = C6553f.m29730a(jSONObject);
        String a2 = C6563p.m29793a(a);
        if (a != 0) {
            ArrayList arrayList = this.f33158a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                C7147b c7147b = (C7147b) obj2;
                if (c7147b != null && a2.equalsIgnoreCase(c7147b.f34899a) && TextUtils.isEmpty(c7147b.f34903e) && !TextUtils.isEmpty(c7147b.f34910l)) {
                    Object obj3 = c7147b.f34910l;
                    if (!TextUtils.isEmpty(obj3)) {
                        obj3 = C6553f.m29746c(jSONObject, obj3);
                        if (!TextUtils.isEmpty(obj3)) {
                            c7147b.f34903e = obj3;
                        }
                    }
                }
            }
        }
        String d = C6553f.m29748d(jSONObject);
        if (!(TextUtils.isEmpty(d) || TextUtils.isEmpty(a2))) {
            if (this.f33159b.f33126S == null) {
                this.f33159b.f33126S = C6713c.m30408a(this.f33159b.m30441c());
                this.f33159b.f33126S.f34910l = d;
                this.f33159b.f33126S.f34899a = a2;
            } else if (TextUtils.isEmpty(this.f33159b.f33126S.f34910l) && (a2.equalsIgnoreCase(this.f33159b.f33126S.f34899a) || TextUtils.isEmpty(this.f33159b.f33126S.f34899a))) {
                this.f33159b.f33126S.f34910l = d;
            }
        }
        this.f33159b.m30436a(jSONObject);
    }
}
