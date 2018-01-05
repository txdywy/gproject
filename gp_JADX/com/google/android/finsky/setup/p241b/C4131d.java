package com.google.android.finsky.setup.p241b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.finsky.setup.PlaySetupServiceV2;
import com.google.android.finsky.setup.VpaService;
import com.google.android.finsky.setup.p240a.C4124k;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C4131d implements C4128c {
    public final String f20834a;
    public final Context f20835b;
    public final C4124k f20836c;

    static LinkedHashMap m19245a(ee[] eeVarArr, ef[] efVarArr) {
        if (eeVarArr == null || eeVarArr.length == 0) {
            return new LinkedHashMap();
        }
        int i;
        if (efVarArr == null) {
            efVarArr = new ef[0];
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Object put : efVarArr) {
            linkedHashMap.put(put, null);
        }
        List arrayList = new ArrayList();
        for (ee eeVar : eeVarArr) {
            if (eeVar == null) {
                FinskyLog.m21665c("PaiDocumentFetcher got null preload in preloads response", new Object[0]);
            } else {
                Object obj;
                if (eeVar == null || efVarArr == null) {
                    obj = null;
                } else {
                    if (((eeVar.b & 32) != 0 ? 1 : 0) != 0) {
                        i = eeVar.j;
                    } else {
                        i = -1;
                    }
                    if (i < 0 || i >= efVarArr.length) {
                        obj = null;
                    } else {
                        ef efVar = efVarArr[i];
                    }
                }
                if (obj != null) {
                    List list = (List) linkedHashMap.get(obj);
                    if (list == null) {
                        list = new ArrayList();
                        linkedHashMap.put(obj, list);
                    }
                    list.add(eeVar);
                } else {
                    arrayList.add(eeVar);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            linkedHashMap2.put(new ef(), arrayList);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            if (!(entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                linkedHashMap2.put((ef) entry.getKey(), (List) entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public C4131d(Context context, String str, C4126m c4126m) {
        this.f20835b = context;
        this.f20834a = str;
        this.f20836c = c4126m.m19179d(str);
    }

    public final Bundle mo3934a() {
        ConditionVariable conditionVariable = new ConditionVariable();
        C4133f c4133f = new C4133f(this, conditionVariable);
        if (!this.f20835b.bindService(new Intent(this.f20835b, VpaService.class), c4133f, 1)) {
            return PlaySetupServiceV2.m19083a("Unable to bind to VPA service.", this.f20834a);
        }
        boolean block = conditionVariable.block(15000);
        this.f20835b.unbindService(c4133f);
        if (!block) {
            return PlaySetupServiceV2.m19083a("Timed out waiting for VPA service.", this.f20834a);
        }
        if (c4133f.f20840a.f20837a == null) {
            return PlaySetupServiceV2.m19083a("VPA Service failed to return results", this.f20834a);
        }
        return c4133f.f20840a.f20837a;
    }
}
