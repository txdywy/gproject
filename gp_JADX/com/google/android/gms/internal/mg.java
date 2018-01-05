package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.safetynet.SafeBrowsingData;

final class mg extends ls {
    public /* synthetic */ mb f27176a;

    mg(mb mbVar) {
        this.f27176a = mbVar;
    }

    public final void mo4800a(Status status, SafeBrowsingData safeBrowsingData) {
        DataHolder dataHolder = safeBrowsingData.f28488b;
        if (dataHolder != null) {
            try {
                int i = dataHolder.f25956h;
                if (i != 0) {
                    if (ly.f27161a != null) {
                        ly.f27161a.clear();
                    }
                    ly.f27161a = new SparseArray();
                    for (int i2 = 0; i2 < i; i2++) {
                        mn mnVar = new mn(dataHolder, i2);
                        ly.f27161a.put(mnVar.f27183b, mnVar);
                    }
                    ly.f27162b = SystemClock.elapsedRealtime();
                }
                if (!dataHolder.m23680b()) {
                    dataHolder.close();
                }
            } catch (Throwable th) {
                if (!dataHolder.m23680b()) {
                    dataHolder.close();
                }
            }
        }
        this.f27176a.m23071a(new mc(status, safeBrowsingData));
    }
}
