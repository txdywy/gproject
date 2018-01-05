package com.google.android.finsky.playcard;

import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;

final class C3915n implements ad {
    public ce f19841a;
    public ad f19842b;

    public C3915n(int i, ad adVar) {
        m18589a(i, adVar);
    }

    public final void m18589a(int i, ad adVar) {
        int i2;
        switch (i) {
            case 0:
            case 29:
            case 30:
                i2 = 509;
                break;
            case 1:
            case 31:
                i2 = 511;
                break;
            case 2:
            case 3:
                i2 = 507;
                break;
            case 4:
            case 32:
                i2 = 506;
                break;
            case 5:
                i2 = 512;
                break;
            case 6:
                i2 = 513;
                break;
            case 7:
                i2 = 504;
                break;
            case 9:
            case 28:
                i2 = 501;
                break;
            case 12:
                i2 = 515;
                break;
            case 13:
                i2 = 514;
                break;
            case 16:
                i2 = 519;
                break;
            case 17:
                i2 = 2701;
                break;
            case 18:
                i2 = 2700;
                break;
            case 20:
                i2 = 522;
                break;
            case 21:
            case 36:
                i2 = 524;
                break;
            case 22:
                i2 = 525;
                break;
            case 23:
                i2 = 526;
                break;
            case 24:
                i2 = 527;
                break;
            case 26:
                i2 = 528;
                break;
            case 27:
                i2 = 531;
                break;
            case 33:
            case 34:
                i2 = 521;
                break;
            case 35:
                i2 = 544;
                break;
            case 37:
                i2 = 532;
                break;
            case 38:
                i2 = 533;
                break;
            case 39:
                i2 = 547;
                break;
            case 40:
                i2 = 549;
                break;
            case 41:
                i2 = 548;
                break;
            case 42:
                i2 = 550;
                break;
            case 43:
                i2 = 554;
                break;
            default:
                throw new IllegalArgumentException("Unknown card type: " + i);
        }
        this.f19841a = C2482j.m13283a(i2);
        this.f19842b = adVar;
    }

    public final ce getPlayStoreUiElement() {
        return this.f19841a;
    }

    public final ad getParentNode() {
        return this.f19842b;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
