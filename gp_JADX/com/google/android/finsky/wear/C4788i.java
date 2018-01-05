package com.google.android.finsky.wear;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.gms.wearable.C5620h;
import com.google.wireless.android.p360b.p361a.C6333b;

public class C4788i extends C2693e {
    public final String f24978i;
    public final C6333b f24979j;
    public final int f24980k;
    public final String f24981l;
    public String f24982m;
    public final String f24983n;
    public final String f24984o;
    public final String f24985p;
    public final String f24986q;
    public final String f24987r;
    public final String f24988s;
    public final String f24989t;
    public final String f24990u;
    public final String f24991v;
    public final int f24992w;
    public final String f24993x;
    public final String f24994y;

    public C4788i(String str, C5620h c5620h) {
        this.f24978i = str;
        C6333b c6333b = new C6333b();
        c6333b.f31728b = C2693e.m14554b(c5620h.m26658d("touchScreen"));
        c6333b.f31729c = C2693e.m14551a(c5620h.m26658d("keyboard"));
        c6333b.f31730d = C2693e.m14556c(c5620h.m26658d("navigation"));
        c6333b.f31731e = C2693e.m14558d(c5620h.m26658d("screenLayout"));
        c6333b.f31733g = c5620h.m26657c("hasHardKeyboard");
        c6333b.f31734h = c5620h.m26657c("hasFiveWayNavigation");
        c6333b.f31735i = c5620h.m26658d("screenDensity");
        c6333b.m29011b(c5620h.m26658d("screenWidth"));
        c6333b.m29012c(c5620h.m26658d("screenHeight"));
        c6333b.f31738l = c5620h.m26658d("glEsVersion");
        c6333b.f31739m = c5620h.m26664j("systemSharedLibrary");
        c6333b.f31740n = c5620h.m26664j("systemAvailableFeatures");
        c6333b.f31742p = c5620h.m26664j("nativePlatform");
        c6333b.f31743q = c5620h.m26664j("systemSupportedLocales");
        c6333b.f31744r = c5620h.m26664j("glExtension");
        c6333b.m29013d(c5620h.m26658d("smallestScreenWidth"));
        if (c5620h.m26653a("lowRamDevice")) {
            c6333b.m29008a(c5620h.m26657c("lowRamDevice"));
        }
        if (c5620h.m26653a("totalMemoryBytes")) {
            c6333b.m29007a(c5620h.m26659e("totalMemoryBytes"));
        }
        if (c5620h.m26653a("maxNumOfCpuCores")) {
            c6333b.m29014e(c5620h.m26658d("maxNumOfCpuCores"));
        }
        this.f24979j = c6333b;
        this.f24980k = c5620h.m26658d("wearskyVersionCode");
        this.f24981l = c5620h.m26660f("wearskyVersionName");
        this.f24982m = c5620h.m26660f("androidId");
        this.f24983n = c5620h.m26660f("deviceDataVersionInfo");
        this.f24984o = c5620h.m26660f("loggingId");
        this.f24985p = c5620h.m26660f("buildDevice");
        this.f24986q = c5620h.m26660f("buildFingerprint");
        this.f24987r = c5620h.m26660f("buildHardware");
        this.f24988s = c5620h.m26660f("buildId");
        this.f24989t = c5620h.m26660f("buildModel");
        this.f24990u = c5620h.m26660f("buildProduct");
        this.f24991v = c5620h.m26660f("buildVersionRelease");
        this.f24992w = c5620h.m26658d("buildVersionSdkInt");
        this.f24993x = c5620h.m26660f("simOperator");
        this.f24994y = c5620h.m26660f("simOperatorName");
        c5620h.m26660f("networkOperator");
        c5620h.m26660f("networkOperatorName");
    }

    private final String m22527c(String str) {
        String b = m14567b(str);
        if (b == null) {
            return this.f24978i;
        }
        String valueOf = String.valueOf(this.f24978i);
        b = String.valueOf(b);
        return b.length() != 0 ? valueOf.concat(b) : new String(valueOf);
    }

    public final String mo3111a(String str) {
        return (String) C0954a.am.m5777b(m22527c(str)).m5760a();
    }

    protected final void mo3113a(String str, String str2) {
        C0954a.am.m5777b(m22527c(str)).m5763a((Object) str2);
    }

    public final void mo3112a(C1254c c1254c) {
        if (c1254c != null && c1254c.mo1620b() != null) {
            C0954a.am.m5777b(m22527c(c1254c.mo1636c())).m5765c();
        }
    }

    public final C6333b mo3115c() {
        return this.f24979j;
    }

    protected final String mo3114b() {
        return this.f24982m;
    }
}
