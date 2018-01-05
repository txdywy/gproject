package com.google.android.finsky.entertainment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p191c.C2981c;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

final class C2994i implements C2993b {
    public final C2471a f15677a;
    public final Handler f15678b = new Handler(Looper.getMainLooper());

    C2994i(C2471a c2471a) {
        this.f15677a = c2471a;
    }

    private final C2495w m15465g(C2980a c2980a) {
        if (c2980a instanceof C2995j) {
            return ((C2995j) c2980a).f15679a;
        }
        FinskyLog.m21667d("Missing logging context, lost event chain, starting a new context", new Object[0]);
        return this.f15677a.m13184a(null);
    }

    public final C2495w m15466a(C2980a c2980a, C2980a c2980a2) {
        if (c2980a2 != null) {
            return m15465g(c2980a2).m13365a();
        }
        if (c2980a != null) {
            return m15465g(c2980a);
        }
        FinskyLog.m21667d("Missing logging context, lost event chain, starting a new context", new Object[0]);
        return this.f15677a.m13184a(null);
    }

    public final void mo3226a(C2980a c2980a) {
        C2996k c2996k = (C2996k) c2980a;
        ((ad) C6116b.m28100a(c2996k.getParentNode())).mo1219a(c2996k);
    }

    public final void mo3231b(C2980a c2980a) {
        C2996k c2996k = (C2996k) c2980a;
        c2996k.a.m13379b(new C2475d(c2996k));
    }

    public final Bundle mo3232c(C2980a c2980a) {
        if (!(c2980a instanceof C2995j)) {
            return null;
        }
        Bundle bundle = new Bundle();
        m15465g(c2980a).m13377a(bundle);
        return bundle;
    }

    public final C2980a mo3223a(Bundle bundle) {
        return new C2995j(this.f15677a.m13179a(bundle));
    }

    public final C2981c mo3225a(byte[] bArr, C2980a c2980a) {
        return new C2997l(this.f15678b, m15465g(c2980a), 21, bArr);
    }

    public final C2980a mo3235d(C2980a c2980a) {
        return C2994i.m15464a(m15465g(c2980a), 600, null, c2980a);
    }

    public final C2980a mo3222a(int i, byte[] bArr, C2980a c2980a) {
        int i2;
        C2495w g = m15465g(c2980a);
        switch (i) {
            case 1:
                i2 = 6120;
                break;
            case 2:
                i2 = 6121;
                break;
            case 3:
                i2 = 6122;
                break;
            case 5:
                i2 = 6124;
                break;
            case 6:
                i2 = 6125;
                break;
            case 7:
                i2 = 6126;
                break;
            case 8:
                i2 = 6127;
                break;
            case 9:
                i2 = 6128;
                break;
            case 10:
                i2 = 6129;
                break;
            case 11:
                i2 = 6130;
                break;
            case 12:
                i2 = 6131;
                break;
            case 14:
                i2 = 6132;
                break;
            default:
                i2 = 0;
                break;
        }
        return C2994i.m15464a(g, i2, bArr, c2980a);
    }

    public final C2980a mo3229b(byte[] bArr, C2980a c2980a) {
        return C2994i.m15464a(m15465g(c2980a), 6170, bArr, c2980a);
    }

    public final C2980a mo3237e(C2980a c2980a) {
        return C2994i.m15464a(m15465g(c2980a), 6171, null, c2980a);
    }

    public final C2980a mo3239f(C2980a c2980a) {
        return C2994i.m15464a(m15465g(c2980a), 6172, null, c2980a);
    }

    public final C2980a mo3228b(C2980a c2980a, C2980a c2980a2) {
        return C2994i.m15464a(m15466a(c2980a, c2980a2), 6174, null, c2980a);
    }

    public final C2980a mo3233c(C2980a c2980a, C2980a c2980a2) {
        return C2994i.m15464a(m15465g(c2980a2), 6175, null, c2980a);
    }

    public final C2980a mo3236d(C2980a c2980a, C2980a c2980a2) {
        return C2994i.m15464a(m15465g(c2980a2), 6177, null, c2980a);
    }

    public final C2980a mo3238e(C2980a c2980a, C2980a c2980a2) {
        return C2994i.m15464a(m15465g(c2980a2), 6178, null, c2980a);
    }

    public final C2980a mo3224a(byte[] bArr, C2980a c2980a, C2980a c2980a2) {
        return C2994i.m15464a(m15466a(c2980a, c2980a2), 6179, bArr, c2980a);
    }

    public final C2980a mo3230b(byte[] bArr, C2980a c2980a, C2980a c2980a2) {
        return C2994i.m15464a(m15466a(c2980a, c2980a2), 6176, bArr, c2980a);
    }

    public final C2980a mo3234c(byte[] bArr, C2980a c2980a, C2980a c2980a2) {
        return C2994i.m15464a(m15466a(c2980a, c2980a2), 6173, bArr, c2980a);
    }

    private static C2980a m15464a(C2495w c2495w, int i, byte[] bArr, C2980a c2980a) {
        return new C2996k(c2495w, i, bArr, ((C2996k) c2980a).mo3241b(c2495w));
    }

    public final void mo3227a(C2980a c2980a, byte[] bArr) {
        C2482j.m13285a(((C2996k) c2980a).getPlayStoreUiElement(), bArr);
    }
}
