package com.google.android.finsky.bb.p149a;

import java.util.Collections;
import java.util.List;

public final class C1560c {
    public static final List f8352a = Collections.emptyList();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List m9052a(android.content.Context r11, com.google.android.finsky.bb.C1561c r12) {
        /*
        r1 = 1;
        r5 = 4;
        r4 = 3;
        r2 = 0;
        r3 = com.google.android.gms.common.C5095d.m23664d(r11);
        r0 = com.google.android.finsky.aa.C0955b.eY;
        r0 = r0.m28964b();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        if (r3 > r0) goto L_0x0020;
    L_0x0016:
        r0 = "GmsCore too old; cannot show family.";
        r1 = new java.lang.Object[r2];
        com.google.android.finsky.utils.FinskyLog.m21667d(r0, r1);
        r0 = f8352a;
    L_0x001f:
        return r0;
    L_0x0020:
        r6 = r12.mo2329j();
        r7 = r12.mo2326g();
        r3 = new android.content.Intent;
        r0 = "com.google.android.gms.family.v2.CREATE";
        r3.<init>(r0);
        r0 = com.google.android.finsky.aa.C0955b.eX;
        r0 = r0.m28964b();
        r0 = (java.lang.String) r0;
        r0 = r3.setPackage(r0);
        r3 = r11.getPackageManager();
        r0 = r3.resolveActivity(r0, r2);
        if (r0 == 0) goto L_0x0068;
    L_0x0045:
        r3 = com.google.android.gms.common.C5095d.m23664d(r11);
        r0 = com.google.android.finsky.aa.C0955b.eZ;
        r0 = r0.m28964b();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        if (r3 < r0) goto L_0x0068;
    L_0x0057:
        r0 = r1;
    L_0x0058:
        r8 = r12.mo2320b();
        if (r8 != 0) goto L_0x006a;
    L_0x005e:
        r0 = "User setting not available";
        r1 = new java.lang.Object[r2];
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
        r0 = f8352a;
        goto L_0x001f;
    L_0x0068:
        r0 = r2;
        goto L_0x0058;
    L_0x006a:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r9 = r12.mo2327h();
        r10 = r12.mo2323d();
        if (r10 != 0) goto L_0x011e;
    L_0x0079:
        r1 = r2;
    L_0x007a:
        if (r1 == 0) goto L_0x0083;
    L_0x007c:
        r1 = java.lang.Integer.valueOf(r1);
        r3.add(r1);
    L_0x0083:
        r1 = r8.b;
        switch(r1) {
            case 1: goto L_0x012d;
            case 2: goto L_0x0135;
            case 3: goto L_0x012a;
            case 4: goto L_0x0127;
            default: goto L_0x0088;
        };
    L_0x0088:
        r1 = r2;
    L_0x0089:
        if (r1 != r5) goto L_0x014c;
    L_0x008b:
        r1 = java.lang.Integer.valueOf(r1);
        r3.add(r1);
    L_0x0092:
        r1 = r12.mo2325f();
        if (r1 == 0) goto L_0x00ae;
    L_0x0098:
        r1 = r12.mo2323d();
        if (r1 == 0) goto L_0x0164;
    L_0x009e:
        r1 = r12.mo2328i();
        if (r1 == 0) goto L_0x015b;
    L_0x00a4:
        r1 = 5;
    L_0x00a5:
        if (r1 == 0) goto L_0x00ae;
    L_0x00a7:
        r1 = java.lang.Integer.valueOf(r1);
        r3.add(r1);
    L_0x00ae:
        r5 = r8.b;
        r8 = r8.e;
        if (r7 == 0) goto L_0x0167;
    L_0x00b4:
        r1 = "1";
        r4 = r1;
    L_0x00b7:
        if (r0 == 0) goto L_0x016c;
    L_0x00b9:
        r0 = "1";
        r1 = r0;
    L_0x00bc:
        if (r6 == 0) goto L_0x0171;
    L_0x00be:
        r0 = "1";
    L_0x00c0:
        r6 = java.lang.String.valueOf(r3);
        r7 = java.lang.String.valueOf(r4);
        r7 = r7.length();
        r7 = r7 + 38;
        r9 = java.lang.String.valueOf(r1);
        r9 = r9.length();
        r7 = r7 + r9;
        r9 = java.lang.String.valueOf(r0);
        r9 = r9.length();
        r7 = r7 + r9;
        r9 = java.lang.String.valueOf(r6);
        r9 = r9.length();
        r7 = r7 + r9;
        r9 = new java.lang.StringBuilder;
        r9.<init>(r7);
        r7 = "FamilyOptions=";
        r7 = r9.append(r7);
        r5 = r7.append(r5);
        r5 = r5.append(r8);
        r4 = r5.append(r4);
        r1 = r4.append(r1);
        r0 = r1.append(r0);
        r1 = "=>";
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r0 = r0.toString();
        r1 = new java.lang.Object[r2];
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
        r0 = r3;
        goto L_0x001f;
    L_0x011e:
        r10 = r12.mo2328i();
        if (r10 != 0) goto L_0x007a;
    L_0x0124:
        r1 = 2;
        goto L_0x007a;
    L_0x0127:
        r1 = r2;
        goto L_0x0089;
    L_0x012a:
        r1 = r4;
        goto L_0x0089;
    L_0x012d:
        if (r7 == 0) goto L_0x0132;
    L_0x012f:
        r1 = r5;
        goto L_0x0089;
    L_0x0132:
        r1 = r4;
        goto L_0x0089;
    L_0x0135:
        r1 = r8.e;
        switch(r1) {
            case 1: goto L_0x013c;
            case 2: goto L_0x013a;
            case 3: goto L_0x0144;
            default: goto L_0x013a;
        };
    L_0x013a:
        goto L_0x0088;
    L_0x013c:
        if (r7 == 0) goto L_0x0141;
    L_0x013e:
        r1 = r5;
        goto L_0x0089;
    L_0x0141:
        r1 = r4;
        goto L_0x0089;
    L_0x0144:
        if (r9 == 0) goto L_0x0149;
    L_0x0146:
        r1 = r4;
        goto L_0x0089;
    L_0x0149:
        r1 = r2;
        goto L_0x0089;
    L_0x014c:
        if (r1 != r4) goto L_0x0092;
    L_0x014e:
        if (r6 == 0) goto L_0x0092;
    L_0x0150:
        if (r0 == 0) goto L_0x0092;
    L_0x0152:
        r1 = java.lang.Integer.valueOf(r1);
        r3.add(r1);
        goto L_0x0092;
    L_0x015b:
        r1 = r12.mo2324e();
        if (r1 == 0) goto L_0x0164;
    L_0x0161:
        r1 = 6;
        goto L_0x00a5;
    L_0x0164:
        r1 = r2;
        goto L_0x00a5;
    L_0x0167:
        r1 = "0";
        r4 = r1;
        goto L_0x00b7;
    L_0x016c:
        r0 = "0";
        r1 = r0;
        goto L_0x00bc;
    L_0x0171:
        r0 = "0";
        goto L_0x00c0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.bb.a.c.a(android.content.Context, com.google.android.finsky.bb.c):java.util.List");
    }
}
