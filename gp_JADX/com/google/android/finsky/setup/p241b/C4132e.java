package com.google.android.finsky.setup.p241b;

import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Parcelable;
import com.google.android.finsky.setup.dp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

final class C4132e implements dp {
    public Bundle f20837a;
    public final ConditionVariable f20838b;
    public final /* synthetic */ C4131d f20839c;

    C4132e(C4131d c4131d, ConditionVariable conditionVariable) {
        this.f20839c = c4131d;
        this.f20838b = conditionVariable;
    }

    public final void mo3935a(String str, ee[] eeVarArr, ef[] efVarArr) {
        this.f20837a = new Bundle();
        try {
            LinkedHashMap a = C4131d.m19245a(eeVarArr, efVarArr);
            if (a != null) {
                List arrayList = new ArrayList(a.keySet().size());
                for (Entry entry : a.entrySet()) {
                    Bundle a2 = m19248a((ef) entry.getKey(), (List) entry.getValue());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f20837a.putParcelableArray("document_groups", (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
                }
                this.f20838b.open();
            }
        } finally {
            this.f20838b.open();
        }
    }

    private final Bundle m19248a(ef efVar, List list) {
        String str = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        String str2 = "title";
        if (efVar != null) {
            if (((efVar.b & 1) != 0 ? 1 : 0) != 0) {
                str = efVar.c;
            }
        }
        bundle.putString(str2, str);
        List arrayList = new ArrayList(list.size());
        for (ee a : list) {
            Bundle a2 = this.f20839c.f20836c.m19172a(a);
            if (a2 == null) {
                FinskyLog.m21665c("Could not read preload", new Object[0]);
            } else {
                arrayList.add(a2);
            }
        }
        bundle.putParcelableArray("documents", (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
        return bundle;
    }
}
