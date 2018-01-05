package com.google.android.wallet.ui.common.p402c;

import android.os.Bundle;
import android.support.v4.h.h;
import com.google.android.wallet.common.util.C6591c;
import java.util.ArrayList;
import java.util.List;

public abstract class C6764e extends C6739a {
    public final ArrayList f33600a;
    public h f33601b;
    public h f33602c;

    private C6764e() {
        super(null);
        this.f33601b = new h();
        this.f33602c = new h();
        this.f33600a = new ArrayList();
    }

    public C6764e(C6739a... c6739aArr) {
        this();
        for (C6739a a : c6739aArr) {
            m30788a(a);
        }
    }

    public final void m30788a(C6739a c6739a) {
        if (c6739a != null) {
            this.f33600a.add(c6739a);
            long j = c6739a.f33269j;
            if (j != 0) {
                this.f33601b.a(j, c6739a);
                Boolean bool = (Boolean) this.f33602c.a(j);
                if (bool != null) {
                    c6739a.f33270k = bool.booleanValue();
                    this.f33602c.b(j);
                }
            }
        }
    }

    public final void m30790b(C6739a c6739a) {
        if (c6739a != null) {
            this.f33600a.remove(c6739a);
            this.f33601b.b(c6739a.f33269j);
        }
    }

    public final void m30787a(long j, boolean z) {
        C6739a c6739a = (C6739a) this.f33601b.a(j);
        if (c6739a != null) {
            c6739a.f33270k = z;
        } else {
            this.f33602c.a(j, Boolean.valueOf(z));
        }
    }

    public final Bundle m30789b() {
        int i;
        int i2 = 0;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int a = this.f33601b.a();
        for (i = 0; i < a; i++) {
            long a2 = this.f33601b.a(i);
            if (((C6739a) this.f33601b.b(i)).f33270k) {
                arrayList.add(Long.valueOf(a2));
            } else {
                arrayList2.add(Long.valueOf(a2));
            }
        }
        i = this.f33602c.a();
        while (i2 < i) {
            a2 = this.f33602c.a(i2);
            if (((Boolean) this.f33602c.b(i2)).booleanValue()) {
                arrayList.add(Long.valueOf(a2));
            } else {
                arrayList2.add(Long.valueOf(a2));
            }
            i2++;
        }
        Bundle bundle = new Bundle();
        bundle.putLongArray("enabledValidatorReferences", C6591c.m29913c(arrayList));
        bundle.putLongArray("disabledValidatorReferences", C6591c.m29913c(arrayList2));
        return bundle;
    }
}
