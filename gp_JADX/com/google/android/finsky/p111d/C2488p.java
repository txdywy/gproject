package com.google.android.finsky.p111d;

import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bu;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.ArrayList;
import java.util.List;

public final class C2488p {
    public final bu f13410a = C2482j.m13312g();
    public ad f13411b;
    public ad f13412c;
    public ce f13413d;

    public final bu m13344a() {
        if (this.f13411b != null) {
            ce a = C2482j.m13283a(0);
            C2482j.m13303b(this.f13411b.getPlayStoreUiElement(), a);
            this.f13410a.b = a;
            return this.f13410a;
        }
        List arrayList = new ArrayList();
        if (this.f13413d != null) {
            arrayList.add(this.f13413d);
        }
        for (ad adVar = this.f13412c; adVar != null; adVar = adVar.getParentNode()) {
            arrayList.add(adVar.getPlayStoreUiElement());
        }
        a = C2482j.m13286a(arrayList);
        if (a != null) {
            this.f13410a.b = a;
        } else {
            FinskyLog.m21669e("Encountered empty tree.", new Object[0]);
        }
        return this.f13410a;
    }

    public final C2488p m13341a(long j) {
        if (j != 0) {
            bu buVar = this.f13410a;
            buVar.a |= 1;
            buVar.d = j;
        }
        return this;
    }

    public final C2488p m13342a(ad adVar) {
        if (this.f13412c != null) {
            FinskyLog.m21669e("Already set leaf node", new Object[0]);
        }
        if (adVar != null) {
            this.f13411b = adVar;
        }
        return this;
    }

    public final C2488p m13345b(ad adVar) {
        if (this.f13411b != null) {
            FinskyLog.m21669e("Already called setRootNode", new Object[0]);
        }
        if (adVar != null) {
            this.f13412c = adVar;
        }
        return this;
    }

    public final C2488p m13340a(int i) {
        if (this.f13411b != null) {
            FinskyLog.m21669e("Already called setRootNode", new Object[0]);
        }
        if (this.f13413d == null) {
            this.f13413d = C2482j.m13283a(i);
        } else if (i != 0) {
            this.f13413d.b(i);
        }
        return this;
    }

    public final C2488p m13343a(byte[] bArr) {
        if (this.f13411b != null) {
            FinskyLog.m21669e("Already called setRootNode", new Object[0]);
        }
        if (bArr != null) {
            if (this.f13413d == null) {
                this.f13413d = C2482j.m13283a(0);
            }
            this.f13413d.a(bArr);
        }
        return this;
    }
}
