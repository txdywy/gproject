package com.google.android.finsky.updatechecker.impl;

import com.google.wireless.android.a.a.a.a.aa;

public final class C4647e {
    public final aa f23946a = new aa();

    public final C4647e m21624a(boolean z) {
        aa aaVar = this.f23946a;
        aaVar.a |= 65536;
        aaVar.r = z;
        return this;
    }

    public final C4647e m21623a(int i) {
        aa aaVar;
        if (i != -1) {
            aaVar = this.f23946a;
            aaVar.a |= 131072;
            aaVar.s = i;
        } else {
            aaVar = this.f23946a;
            aaVar.s = -1;
            aaVar.a &= -131073;
        }
        return this;
    }

    public final C4647e m21626b(boolean z) {
        aa aaVar = this.f23946a;
        aaVar.a |= 262144;
        aaVar.t = z;
        return this;
    }

    public final C4647e m21625b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                this.f23946a.a(i);
                break;
            default:
                this.f23946a.a(0);
                break;
        }
        return this;
    }
}
