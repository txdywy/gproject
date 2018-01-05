package com.google.android.wallet.common.util;

import android.view.View;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.ab;
import com.google.android.wallet.ui.common.at;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.bl;
import com.google.android.wallet.ui.common.cp;
import java.util.HashSet;
import java.util.List;

public final class C6596h {
    public static void m29924a(at atVar, bl blVar) {
        C6596h.m29925a(atVar, blVar, true, new HashSet());
    }

    private static void m29925a(at atVar, bl blVar, boolean z, HashSet hashSet) {
        at atVar2 = atVar;
        while (atVar2 != null && !blVar.m30755a()) {
            if ((atVar2 instanceof au) || r12) {
                while (atVar2 != null && !(atVar2 instanceof ab)) {
                    atVar2 = atVar2.getParentFormElement();
                }
            } else {
                atVar2 = null;
            }
            if (atVar2 != null && !hashSet.contains(atVar2)) {
                hashSet.add(atVar2);
                List aa = ((ab) atVar2).aa();
                int size = aa.size();
                for (int i = 0; i < size && !blVar.m30755a(); i++) {
                    Object obj = ((C6749z) aa.get(i)).f33285e;
                    long j = ((C6749z) aa.get(i)).f33284d;
                    if (blVar.m30756a(j)) {
                        if (obj instanceof at) {
                            blVar.m30754a(j, ((at) obj).mo5522a(null));
                        } else if (obj instanceof View) {
                            blVar.m30754a(j, cp.m30902a((View) obj));
                        } else {
                            String valueOf = String.valueOf(obj);
                            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected field type: ").append(valueOf).toString());
                        }
                    }
                    if ((obj instanceof au) && !hashSet.contains(obj)) {
                        C6596h.m29925a((at) obj, blVar, false, hashSet);
                    }
                }
                if (!blVar.m30755a() && r12) {
                    atVar2 = atVar2.getParentFormElement();
                    z = true;
                } else {
                    return;
                }
            }
            return;
        }
    }
}
