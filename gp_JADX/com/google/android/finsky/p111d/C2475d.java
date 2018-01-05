package com.google.android.finsky.p111d;

import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bp;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import java.util.ArrayList;

public final class C2475d {
    public final bp f13343a = C2482j.m13311f();
    public final ad f13344b;
    public ce f13345c;

    public C2475d(ad adVar) {
        this.f13344b = adVar;
    }

    public final C2475d m13256a(int i) {
        if (this.f13345c == null) {
            this.f13345c = C2482j.m13283a(i);
        } else if (i != 0) {
            this.f13345c.b(i);
        }
        return this;
    }

    public final C2475d m13258a(byte[] bArr) {
        if (bArr != null) {
            if (this.f13345c == null) {
                this.f13345c = C2482j.m13283a(0);
            }
            this.f13345c.a(bArr);
        }
        return this;
    }

    public final C2475d m13257a(cf cfVar) {
        if (cfVar != null) {
            if (this.f13345c == null) {
                this.f13345c = C2482j.m13283a(0);
            }
            this.f13345c.e = cfVar;
        }
        return this;
    }

    public final bp m13259a() {
        ArrayList arrayList = new ArrayList();
        if (this.f13345c != null) {
            arrayList.add(this.f13345c);
        }
        for (ad adVar = this.f13344b; adVar != null; adVar = adVar.getParentNode()) {
            ce playStoreUiElement = adVar.getPlayStoreUiElement();
            if (playStoreUiElement == null) {
                FinskyLog.m21665c("Unexpected null PlayStoreUiElement from node %s", adVar);
                break;
            }
            arrayList.add(C2482j.m13284a(playStoreUiElement));
        }
        this.f13343a.a = (ce[]) arrayList.toArray(this.f13343a.a);
        return this.f13343a;
    }

    public final boolean m13260b() {
        return this.f13345c == null && this.f13344b == null;
    }
}
