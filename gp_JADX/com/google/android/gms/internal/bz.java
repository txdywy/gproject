package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.car.C4997m;
import com.google.android.gms.car.C5010z;
import com.google.android.gms.car.aa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class bz extends C5010z {
    public volatile boolean f26540a = false;
    public final WeakReference f26541b;

    public bz(bv bvVar) {
        this.f26541b = new WeakReference(bvVar);
    }

    public final void mo4706a() {
        bv bvVar = (bv) this.f26541b.get();
        if (bvVar == null) {
            Log.i("CAR.CLIENT", "Null carClient in ICarConnectionListenerImpl.onConnected");
            return;
        }
        List arrayList = new ArrayList(bvVar.f26532q.size());
        synchronized (this) {
            if (!this.f26540a) {
                arrayList.addAll(bvVar.f26532q);
                this.f26540a = true;
            }
            if (!arrayList.isEmpty()) {
                m24240a(bvVar, arrayList);
            }
        }
        if (arrayList.isEmpty() && C4997m.m23159a("CAR.CLIENT", 4)) {
            String valueOf = String.valueOf(bvVar.f26532q);
            Log.i("CAR.CLIENT", new StringBuilder(String.valueOf(valueOf).length() + 68).append("Not notifying car connection [listeners=").append(valueOf).append(", mConnectionNotified=").append(this.f26540a).append("]").toString());
        }
    }

    public final void mo4707b() {
        bv bvVar = (bv) this.f26541b.get();
        if (bvVar == null) {
            Log.i("CAR.CLIENT", "Null carClient in ICarConnectionListenerImpl.onDisconnected");
            return;
        }
        List arrayList = new ArrayList(bvVar.f26532q.size());
        synchronized (this) {
            if (this.f26540a) {
                arrayList.addAll(bvVar.f26532q);
                this.f26540a = false;
            }
            if (!arrayList.isEmpty()) {
                aa.m23137a(bvVar.f26517b, new cb(this, arrayList, bvVar));
            }
        }
        bvVar.m24237c();
    }

    final void m24240a(bv bvVar, List list) {
        aa.m23137a(bvVar.f26517b, new ca(this, list, bvVar));
    }
}
