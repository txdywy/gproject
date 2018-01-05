package com.google.android.finsky.wear;

import android.net.Uri;
import com.google.android.gms.common.api.C5058o;

final class bt implements Runnable {
    public final /* synthetic */ Uri f24900a;
    public final /* synthetic */ String f24901b;
    public final /* synthetic */ C5058o f24902c;
    public final /* synthetic */ boolean f24903d;
    public final /* synthetic */ String f24904e;
    public final /* synthetic */ WearSupportService f24905f;

    bt(WearSupportService wearSupportService, Uri uri, String str, C5058o c5058o, boolean z, String str2) {
        this.f24905f = wearSupportService;
        this.f24900a = uri;
        this.f24901b = str;
        this.f24902c = c5058o;
        this.f24903d = z;
        this.f24904e = str2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r8 = this;
        r6 = 0;
        r2 = 1;
        r0 = r8.f24905f;
        r0.f24760g = r0.f24760g - 1;
        r0 = r8.f24900a;
        r3 = r0.getPathSegments();
        r0 = r3.get(r6);
        r0 = (java.lang.String) r0;
        r1 = -1;
        r4 = r0.hashCode();
        switch(r4) {
            case -1877302009: goto L_0x0030;
            case -1704809566: goto L_0x0044;
            case -1187633240: goto L_0x0062;
            case -889462529: goto L_0x0058;
            case 1138071245: goto L_0x003a;
            case 1418454339: goto L_0x004e;
            default: goto L_0x001b;
        };
    L_0x001b:
        r0 = r1;
    L_0x001c:
        switch(r0) {
            case 0: goto L_0x006c;
            case 1: goto L_0x0080;
            case 2: goto L_0x00ac;
            case 3: goto L_0x002a;
            case 4: goto L_0x00b1;
            case 5: goto L_0x00f1;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = "Unexpected command in %s";
        r1 = new java.lang.Object[r2];
        r2 = r8.f24904e;
        r1[r6] = r2;
        com.google.android.finsky.utils.FinskyLog.m21669e(r0, r1);
    L_0x002a:
        r0 = r8.f24905f;
        r0.m22419a();
        return;
    L_0x0030:
        r4 = "package_info";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x001b;
    L_0x0038:
        r0 = r6;
        goto L_0x001c;
    L_0x003a:
        r4 = "device_configuration";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x001b;
    L_0x0042:
        r0 = r2;
        goto L_0x001c;
    L_0x0044:
        r4 = "request_status";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x001b;
    L_0x004c:
        r0 = 2;
        goto L_0x001c;
    L_0x004e:
        r4 = "liveness";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x001b;
    L_0x0056:
        r0 = 3;
        goto L_0x001c;
    L_0x0058:
        r4 = "zapp_modules_request";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x001b;
    L_0x0060:
        r0 = 4;
        goto L_0x001c;
    L_0x0062:
        r4 = "intermediate_request_status";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x001b;
    L_0x006a:
        r0 = 5;
        goto L_0x001c;
    L_0x006c:
        r0 = r3.get(r2);
        r0 = (java.lang.String) r0;
        r1 = r8.f24905f;
        r2 = r8.f24901b;
        r3 = r8.f24902c;
        r1 = com.google.android.finsky.wear.ag.m22436a(r1, r2, r3);
        r1.mo2856b(r0);
        goto L_0x002a;
    L_0x0080:
        r1 = r8.f24905f;
        r3 = r8.f24901b;
        r0 = r1.f24758e;
        r0 = r0.m22523b();
        if (r0 == 0) goto L_0x0094;
    L_0x008c:
        r0 = r1.f24758e;
        r0 = r0.m22520a(r3);
        if (r0 != 0) goto L_0x00aa;
    L_0x0094:
        r0 = r2;
    L_0x0095:
        r4 = r1.f24760g;
        r4 = r4 + 1;
        r1.f24760g = r4;
        r4 = r1.f24758e;
        r5 = r1.f24756c;
        r5 = r5.f24792b;
        r6 = new com.google.android.finsky.wear.bv;
        r6.<init>(r1, r0, r3);
        r4.m22519a(r5, r2, r6);
        goto L_0x002a;
    L_0x00aa:
        r0 = r6;
        goto L_0x0095;
    L_0x00ac:
        r3.get(r2);
        goto L_0x002a;
    L_0x00b1:
        r1 = r8.f24905f;
        r3 = r8.f24900a;
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.dj();
        r4 = 12605594; // 0xc0589a float:1.76642E-38 double:6.227991E-317;
        r0 = r0.mo2294a(r4);
        if (r0 != 0) goto L_0x00cd;
    L_0x00c4:
        r0 = "Wear zapp experiment disabled";
        r1 = new java.lang.Object[r6];
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
        goto L_0x002a;
    L_0x00cd:
        r4 = r3.getHost();
        r0 = r3.getPathSegments();
        r5 = r0.get(r2);
        r5 = (java.lang.String) r5;
        r0 = r1.f24760g;
        r0 = r0 + 1;
        r1.f24760g = r0;
        r0 = r1.f24756c;
        r2 = r0.f24792b;
        r7 = r1.f24758e;
        r0 = new com.google.android.finsky.wear.by;
        r0.<init>(r1, r2, r3, r4, r5);
        r7.m22519a(r2, r6, r0);
        goto L_0x002a;
    L_0x00f1:
        r0 = r8.f24905f;
        r1 = r8.f24903d;
        if (r1 != 0) goto L_0x002a;
    L_0x00f7:
        r1 = r0.f24760g;
        r1 = r1 + 1;
        r0.f24760g = r1;
        r1 = r0.f24756c;
        r1 = r1.f24792b;
        r3 = com.google.android.gms.wearable.C5652n.f28708a;
        r4 = com.google.android.finsky.wear.cl.f24959c;
        r2 = r3.mo5116a(r1, r4, r2);
        r3 = new com.google.android.finsky.wear.bu;
        r3.<init>(r0, r1);
        r2.mo4490a(r3);
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.wear.bt.run():void");
    }
}
