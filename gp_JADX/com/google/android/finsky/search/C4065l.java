package com.google.android.finsky.search;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.finsky.C1473m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C4065l {
    public static final Map f20406a = new HashMap();
    public final List f20407b = new ArrayList();
    public final Set f20408c = new HashSet();
    public final Context f20409d;
    public final int f20410e;

    public C4065l(Context context, int i) {
        this.f20409d = context;
        this.f20410e = i;
    }

    private final Uri m18987a(int i) {
        if (i != 3) {
            try {
                String a = C1473m.f7980a.bn().mo2693a(i);
                PackageManager packageManager = this.f20409d.getPackageManager();
                int i2 = ((ResolveInfo) packageManager.queryIntentActivities(packageManager.getLaunchIntentForPackage(a), 65536).get(0)).activityInfo.applicationInfo.icon;
                if (i2 != 0) {
                    return new Builder().scheme("android.resource").authority(a).path(Integer.toString(i2)).build();
                }
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.search.w m18988a(java.lang.String r17, boolean r18, java.lang.String r19, android.graphics.drawable.Drawable r20, com.google.android.finsky.cv.p177a.bd r21, com.google.android.finsky.cv.p177a.eu r22, byte[] r23, boolean r24, int r25, java.lang.String r26) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r0.f20410e;
        r0 = r25;
        if (r0 == r1) goto L_0x027f;
    L_0x0008:
        switch(r25) {
            case 0: goto L_0x001a;
            case 1: goto L_0x0034;
            case 2: goto L_0x0034;
            case 3: goto L_0x001a;
            case 4: goto L_0x0034;
            case 5: goto L_0x000b;
            case 6: goto L_0x0034;
            case 7: goto L_0x0034;
            case 8: goto L_0x000b;
            case 9: goto L_0x000b;
            case 10: goto L_0x000b;
            case 11: goto L_0x000b;
            case 12: goto L_0x000b;
            case 13: goto L_0x0034;
            default: goto L_0x000b;
        };
    L_0x000b:
        r1 = "Unexpected search suggestion backend %d";
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = java.lang.Integer.valueOf(r25);
        r2[r3] = r4;
        com.google.android.finsky.utils.FinskyLog.m21669e(r1, r2);
    L_0x001a:
        r12 = r25;
    L_0x001c:
        if (r19 != 0) goto L_0x0037;
    L_0x001e:
        r1 = r17;
    L_0x0020:
        r2 = java.lang.Integer.valueOf(r12);
        r15 = android.util.Pair.create(r1, r2);
        r0 = r16;
        r1 = r0.f20408c;
        r1 = r1.contains(r15);
        if (r1 == 0) goto L_0x0049;
    L_0x0032:
        r1 = 0;
    L_0x0033:
        return r1;
    L_0x0034:
        r25 = 13;
        goto L_0x001a;
    L_0x0037:
        r1 = 2;
        r1 = new java.lang.CharSequence[r1];
        r2 = 0;
        r1[r2] = r17;
        r2 = 1;
        r1[r2] = r19;
        r1 = android.text.TextUtils.concat(r1);
        r1 = r1.toString();
        goto L_0x0020;
    L_0x0049:
        if (r21 == 0) goto L_0x00a9;
    L_0x004b:
        r0 = r21;
        r6 = r0.f11860f;
    L_0x004f:
        if (r6 == 0) goto L_0x00ab;
    L_0x0051:
        r0 = r21;
        r1 = r0.f11863i;
        if (r1 == 0) goto L_0x00ab;
    L_0x0057:
        r7 = 1;
    L_0x0058:
        if (r6 != 0) goto L_0x006c;
    L_0x005a:
        if (r22 == 0) goto L_0x006c;
    L_0x005c:
        r1 = com.google.android.finsky.dfemodel.C2726q.m14754c(r19);
        r0 = r16;
        r1 = r0.m18987a(r1);
        if (r1 == 0) goto L_0x006c;
    L_0x0068:
        r6 = r1.toString();
    L_0x006c:
        r3 = 0;
        r1 = android.text.TextUtils.isEmpty(r26);
        if (r1 != 0) goto L_0x00ad;
    L_0x0073:
        r3 = r26;
    L_0x0075:
        r1 = new com.google.android.finsky.search.b;
        if (r21 == 0) goto L_0x007f;
    L_0x0079:
        r2 = r21.m12247d();
        if (r2 != 0) goto L_0x023c;
    L_0x007f:
        r8 = 0;
    L_0x0080:
        r0 = r16;
        r2 = r0.f20407b;
        r13 = r2.size();
        if (r18 != 0) goto L_0x027c;
    L_0x008a:
        r14 = 1;
    L_0x008b:
        r2 = r17;
        r4 = r19;
        r5 = r20;
        r9 = r22;
        r10 = r23;
        r11 = r24;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r0 = r16;
        r2 = r0.f20407b;
        r2.add(r1);
        r0 = r16;
        r2 = r0.f20408c;
        r2.add(r15);
        goto L_0x0033;
    L_0x00a9:
        r6 = 0;
        goto L_0x004f;
    L_0x00ab:
        r7 = 0;
        goto L_0x0058;
    L_0x00ad:
        r0 = r16;
        r1 = r0.f20410e;
        if (r12 == r1) goto L_0x0075;
    L_0x00b3:
        r1 = com.google.android.finsky.C1473m.f7980a;
        r1 = r1.dn();
        if (r1 != 0) goto L_0x00d2;
    L_0x00bb:
        r1 = "DfeToc not available yet";
        r2 = 0;
        r2 = new java.lang.Object[r2];
        com.google.android.finsky.utils.FinskyLog.m21669e(r1, r2);
        r1 = 0;
    L_0x00c4:
        r0 = r16;
        r2 = r0.f20409d;
        r2 = r2.getResources();
        switch(r12) {
            case 3: goto L_0x00d5;
            case 13: goto L_0x00dd;
            default: goto L_0x00cf;
        };
    L_0x00cf:
        r26 = 0;
        goto L_0x0073;
    L_0x00d2:
        r1 = r1.f14883c;
        goto L_0x00c4;
    L_0x00d5:
        r1 = 2131953097; // 0x7f1305c9 float:1.9542655E38 double:1.053324784E-314;
        r26 = r2.getString(r1);
        goto L_0x0073;
    L_0x00dd:
        if (r1 != 0) goto L_0x00e7;
    L_0x00df:
        r1 = 2131953104; // 0x7f1305d0 float:1.954267E38 double:1.053324787E-314;
    L_0x00e2:
        r26 = r2.getString(r1);
        goto L_0x0073;
    L_0x00e7:
        r3 = com.google.android.finsky.bg.C1608h.m9250a();
        r3 = com.google.android.finsky.bg.C1608h.m9245a(r3, r1);
        r4 = 4;
        if (r3 > r4) goto L_0x00f4;
    L_0x00f2:
        if (r3 > 0) goto L_0x0107;
    L_0x00f4:
        r1 = "Invalid digital content corpora count available [%d]";
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r3 = java.lang.Integer.valueOf(r3);
        r4[r5] = r3;
        com.google.android.finsky.utils.FinskyLog.m21669e(r1, r4);
        r1 = 2131953104; // 0x7f1305d0 float:1.954267E38 double:1.053324787E-314;
        goto L_0x00e2;
    L_0x0107:
        r4 = 1;
        if (r3 != r4) goto L_0x0146;
    L_0x010a:
        r4 = 4;
        r4 = java.lang.Integer.valueOf(r4);
        r4 = r1.contains(r4);
        if (r4 == 0) goto L_0x0119;
    L_0x0115:
        r1 = 2131953100; // 0x7f1305cc float:1.9542661E38 double:1.0533247853E-314;
        goto L_0x00e2;
    L_0x0119:
        r4 = 2;
        r4 = java.lang.Integer.valueOf(r4);
        r4 = r1.contains(r4);
        if (r4 == 0) goto L_0x0128;
    L_0x0124:
        r1 = 2131953107; // 0x7f1305d3 float:1.9542676E38 double:1.0533247887E-314;
        goto L_0x00e2;
    L_0x0128:
        r4 = 1;
        r4 = java.lang.Integer.valueOf(r4);
        r4 = r1.contains(r4);
        if (r4 == 0) goto L_0x0137;
    L_0x0133:
        r1 = 2131953098; // 0x7f1305ca float:1.9542657E38 double:1.0533247843E-314;
        goto L_0x00e2;
    L_0x0137:
        r4 = 6;
        r4 = java.lang.Integer.valueOf(r4);
        r4 = r1.contains(r4);
        if (r4 == 0) goto L_0x0146;
    L_0x0142:
        r1 = 2131953111; // 0x7f1305d7 float:1.9542684E38 double:1.0533247907E-314;
        goto L_0x00e2;
    L_0x0146:
        switch(r3) {
            case 2: goto L_0x0155;
            case 3: goto L_0x01f7;
            case 4: goto L_0x0237;
            default: goto L_0x0149;
        };
    L_0x0149:
        r1 = "Error in choosing entertainment search suggest subtext";
        r3 = 0;
        r3 = new java.lang.Object[r3];
        com.google.android.finsky.utils.FinskyLog.m21669e(r1, r3);
        r1 = 2131953104; // 0x7f1305d0 float:1.954267E38 double:1.053324787E-314;
        goto L_0x00e2;
    L_0x0155:
        r3 = 4;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x0170;
    L_0x0160:
        r3 = 2;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x0170;
    L_0x016b:
        r1 = 2131953103; // 0x7f1305cf float:1.9542668E38 double:1.0533247867E-314;
        goto L_0x00e2;
    L_0x0170:
        r3 = 4;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x018b;
    L_0x017b:
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x018b;
    L_0x0186:
        r1 = 2131953101; // 0x7f1305cd float:1.9542663E38 double:1.0533247857E-314;
        goto L_0x00e2;
    L_0x018b:
        r3 = 4;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x01a6;
    L_0x0196:
        r3 = 6;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x01a6;
    L_0x01a1:
        r1 = 2131953106; // 0x7f1305d2 float:1.9542674E38 double:1.053324788E-314;
        goto L_0x00e2;
    L_0x01a6:
        r3 = 2;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x01c1;
    L_0x01b1:
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x01c1;
    L_0x01bc:
        r1 = 2131953108; // 0x7f1305d4 float:1.9542678E38 double:1.053324789E-314;
        goto L_0x00e2;
    L_0x01c1:
        r3 = 2;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x01dc;
    L_0x01cc:
        r3 = 6;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x01dc;
    L_0x01d7:
        r1 = 2131953110; // 0x7f1305d6 float:1.9542682E38 double:1.05332479E-314;
        goto L_0x00e2;
    L_0x01dc:
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 == 0) goto L_0x0149;
    L_0x01e7:
        r3 = 6;
        r3 = java.lang.Integer.valueOf(r3);
        r1 = r1.contains(r3);
        if (r1 == 0) goto L_0x0149;
    L_0x01f2:
        r1 = 2131953099; // 0x7f1305cb float:1.954266E38 double:1.053324785E-314;
        goto L_0x00e2;
    L_0x01f7:
        r3 = 6;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 != 0) goto L_0x0207;
    L_0x0202:
        r1 = 2131953104; // 0x7f1305d0 float:1.954267E38 double:1.053324787E-314;
        goto L_0x00e2;
    L_0x0207:
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 != 0) goto L_0x0217;
    L_0x0212:
        r1 = 2131953105; // 0x7f1305d1 float:1.9542672E38 double:1.0533247877E-314;
        goto L_0x00e2;
    L_0x0217:
        r3 = 2;
        r3 = java.lang.Integer.valueOf(r3);
        r3 = r1.contains(r3);
        if (r3 != 0) goto L_0x0227;
    L_0x0222:
        r1 = 2131953102; // 0x7f1305ce float:1.9542666E38 double:1.053324786E-314;
        goto L_0x00e2;
    L_0x0227:
        r3 = 4;
        r3 = java.lang.Integer.valueOf(r3);
        r1 = r1.contains(r3);
        if (r1 != 0) goto L_0x0149;
    L_0x0232:
        r1 = 2131953109; // 0x7f1305d5 float:1.954268E38 double:1.0533247897E-314;
        goto L_0x00e2;
    L_0x0237:
        r1 = 2131953104; // 0x7f1305d0 float:1.954267E38 double:1.053324787E-314;
        goto L_0x00e2;
    L_0x023c:
        r2 = f20406a;
        r0 = r21;
        r4 = r0.f11866l;
        r2 = r2.containsKey(r4);
        if (r2 != 0) goto L_0x026d;
    L_0x0248:
        r2 = f20406a;
        r0 = r21;
        r4 = r0.f11866l;
        r0 = r21;
        r5 = r0.f11866l;
        r5 = android.graphics.Color.parseColor(r5);
        r0 = r16;
        r8 = r0.f20409d;
        r9 = 2130838100; // 0x7f020254 float:1.7281173E38 double:1.052773902E-314;
        r8 = android.support.v4.p028a.C0216d.m1112a(r8, r9);
        r9 = r8.mutate();
        r10 = android.graphics.PorterDuff.Mode.MULTIPLY;
        r9.setColorFilter(r5, r10);
        r2.put(r4, r8);
    L_0x026d:
        r2 = f20406a;
        r0 = r21;
        r4 = r0.f11866l;
        r2 = r2.get(r4);
        r2 = (android.graphics.drawable.Drawable) r2;
        r8 = r2;
        goto L_0x0080;
    L_0x027c:
        r14 = 0;
        goto L_0x008b;
    L_0x027f:
        r12 = r25;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.search.l.a(java.lang.String, boolean, java.lang.String, android.graphics.drawable.Drawable, com.google.android.finsky.cv.a.bd, com.google.android.finsky.cv.a.eu, byte[], boolean, int, java.lang.String):com.google.android.play.search.w");
    }
}
