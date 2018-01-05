package com.google.android.finsky.wear;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.wearable.C4779q;
import com.google.android.gms.wearable.C5650l;

public class WearChangeListenerService extends C4779q {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4383a(com.google.android.gms.wearable.C5616d r12) {
        /*
        r11 = this;
        r8 = 12624984; // 0xc0a458 float:1.769137E-38 double:6.237571E-317;
        r2 = 0;
        r7 = 2;
        r6 = 1;
        r4 = 0;
        r0 = "Wear received %d events";
        r1 = new java.lang.Object[r6];
        r3 = r12.mo4501c();
        r3 = java.lang.Integer.valueOf(r3);
        r1[r4] = r3;
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
        r0 = com.google.android.finsky.C1473m.f7980a;
        r0 = r0.dj();
        r0 = r0.mo2294a(r8);
        if (r0 == 0) goto L_0x002c;
    L_0x0024:
        r0 = "disabled";
        r1 = new java.lang.Object[r4];
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
    L_0x002b:
        return;
    L_0x002c:
        r8 = r12.iterator();
        r3 = r2;
    L_0x0031:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x013e;
    L_0x0037:
        r0 = r8.next();
        r0 = (com.google.android.gms.wearable.C5615c) r0;
        r1 = r0.mo5121b();
        r9 = r1.mo5123b();
        r1 = "wear";
        r5 = r9.getScheme();
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0065;
    L_0x0051:
        r1 = r9.getHost();
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0065;
    L_0x005b:
        r1 = r9.getPathSegments();
        r1 = r1.size();
        if (r1 > 0) goto L_0x006f;
    L_0x0065:
        r0 = "Malformed DataEvent %s";
        r1 = new java.lang.Object[r6];
        r1[r4] = r9;
        com.google.android.finsky.utils.FinskyLog.m21665c(r0, r1);
        goto L_0x0031;
    L_0x006f:
        r1 = r9.getPathSegments();
        r1 = r1.get(r4);
        r1 = (java.lang.String) r1;
        r5 = -1;
        r10 = r1.hashCode();
        switch(r10) {
            case -1877302009: goto L_0x008f;
            case -1750600751: goto L_0x00ea;
            case -1704809566: goto L_0x00a3;
            case -1434202360: goto L_0x00f5;
            case -1187633240: goto L_0x00c1;
            case -889462529: goto L_0x00b7;
            case -831699946: goto L_0x00df;
            case 274870228: goto L_0x00cb;
            case 1138071245: goto L_0x0099;
            case 1321437053: goto L_0x00d5;
            case 1418454339: goto L_0x00ad;
            default: goto L_0x0081;
        };
    L_0x0081:
        r1 = r5;
    L_0x0082:
        switch(r1) {
            case 0: goto L_0x0100;
            case 1: goto L_0x0100;
            case 2: goto L_0x0100;
            case 3: goto L_0x0100;
            case 4: goto L_0x0100;
            case 5: goto L_0x0100;
            case 6: goto L_0x0031;
            case 7: goto L_0x0031;
            case 8: goto L_0x0031;
            case 9: goto L_0x0031;
            case 10: goto L_0x0031;
            default: goto L_0x0085;
        };
    L_0x0085:
        r0 = "Unexpected DataEvent %s";
        r1 = new java.lang.Object[r6];
        r1[r4] = r9;
        com.google.android.finsky.utils.FinskyLog.m21665c(r0, r1);
        goto L_0x0031;
    L_0x008f:
        r10 = "package_info";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x0097:
        r1 = r4;
        goto L_0x0082;
    L_0x0099:
        r10 = "device_configuration";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00a1:
        r1 = r6;
        goto L_0x0082;
    L_0x00a3:
        r10 = "request_status";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00ab:
        r1 = r7;
        goto L_0x0082;
    L_0x00ad:
        r10 = "liveness";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00b5:
        r1 = 3;
        goto L_0x0082;
    L_0x00b7:
        r10 = "zapp_modules_request";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00bf:
        r1 = 4;
        goto L_0x0082;
    L_0x00c1:
        r10 = "intermediate_request_status";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00c9:
        r1 = 5;
        goto L_0x0082;
    L_0x00cb:
        r10 = "wearable_info";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00d3:
        r1 = 6;
        goto L_0x0082;
    L_0x00d5:
        r10 = "install_wearable";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00dd:
        r1 = 7;
        goto L_0x0082;
    L_0x00df:
        r10 = "uninstall_wearable";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00e7:
        r1 = 8;
        goto L_0x0082;
    L_0x00ea:
        r10 = "zapp_modules_response";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00f2:
        r1 = 9;
        goto L_0x0082;
    L_0x00f5:
        r10 = "phone_installed_apps";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0081;
    L_0x00fd:
        r1 = 10;
        goto L_0x0082;
    L_0x0100:
        r1 = r0.mo5122c();
        switch(r1) {
            case 1: goto L_0x011c;
            case 2: goto L_0x012d;
            default: goto L_0x0107;
        };
    L_0x0107:
        r1 = "Unexpected DataEvent type %d %s";
        r5 = new java.lang.Object[r7];
        r0 = r0.mo5122c();
        r0 = java.lang.Integer.valueOf(r0);
        r5[r4] = r0;
        r5[r6] = r9;
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r5);
        goto L_0x0031;
    L_0x011c:
        if (r3 != 0) goto L_0x019c;
    L_0x011e:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0123:
        r1 = r9.toString();
        r0.add(r1);
        r3 = r0;
        goto L_0x0031;
    L_0x012d:
        if (r2 != 0) goto L_0x019a;
    L_0x012f:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0134:
        r1 = r9.toString();
        r0.add(r1);
        r2 = r0;
        goto L_0x0031;
    L_0x013e:
        if (r3 != 0) goto L_0x0142;
    L_0x0140:
        if (r2 == 0) goto L_0x002b;
    L_0x0142:
        r4 = android.os.Binder.clearCallingIdentity();
        r0 = com.google.android.finsky.C1473m.f7980a;	 Catch:{ all -> 0x0195 }
        r0 = r0.dj();	 Catch:{ all -> 0x0195 }
        r6 = 12624984; // 0xc0a458 float:1.769137E-38 double:6.237571E-317;
        r0 = r0.mo2294a(r6);	 Catch:{ all -> 0x0195 }
        if (r0 == 0) goto L_0x0162;
    L_0x0155:
        r0 = "disabled";
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0195 }
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);	 Catch:{ all -> 0x0195 }
    L_0x015d:
        android.os.Binder.restoreCallingIdentity(r4);
        goto L_0x002b;
    L_0x0162:
        r0 = r11.getApplicationContext();	 Catch:{ all -> 0x0195 }
        r1 = new android.content.Intent;	 Catch:{ all -> 0x0195 }
        r6 = com.google.android.finsky.wear.WearSupportService.class;
        r1.<init>(r0, r6);	 Catch:{ all -> 0x0195 }
        r6 = "wearsupportservice://node_updates";
        r6 = android.net.Uri.parse(r6);	 Catch:{ all -> 0x0195 }
        r1.setData(r6);	 Catch:{ all -> 0x0195 }
        r6 = "command";
        r7 = "node_updates";
        r1.putExtra(r6, r7);	 Catch:{ all -> 0x0195 }
        if (r3 == 0) goto L_0x0184;
    L_0x017f:
        r6 = "changed_uri_list";
        r1.putStringArrayListExtra(r6, r3);	 Catch:{ all -> 0x0195 }
    L_0x0184:
        if (r2 == 0) goto L_0x018b;
    L_0x0186:
        r3 = "deleted_uri_list";
        r1.putStringArrayListExtra(r3, r2);	 Catch:{ all -> 0x0195 }
    L_0x018b:
        r2 = com.google.android.finsky.C1473m.f7980a;	 Catch:{ all -> 0x0195 }
        r2 = r2.al();	 Catch:{ all -> 0x0195 }
        r2.m22452a(r0, r1);	 Catch:{ all -> 0x0195 }
        goto L_0x015d;
    L_0x0195:
        r0 = move-exception;
        android.os.Binder.restoreCallingIdentity(r4);
        throw r0;
    L_0x019a:
        r0 = r2;
        goto L_0x0134;
    L_0x019c:
        r0 = r3;
        goto L_0x0123;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.wear.WearChangeListenerService.a(com.google.android.gms.wearable.d):void");
    }

    public final void mo4384a(C5650l c5650l) {
        String a = c5650l.mo5126a();
        String b = c5650l.mo5127b();
        FinskyLog.m21659a("Received wear message %s from node %s", a, b);
        int i = -1;
        switch (a.hashCode()) {
            case -1712109713:
                if (a.equals("run_daily_hygiene")) {
                    i = 0;
                    break;
                }
                break;
            case 939422987:
                if (a.equals("checkin_complete")) {
                    boolean z = true;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                C1473m.f7980a.an().m22465a(C1473m.f7980a.f7981b, b, "hygiene_reason_node_request", true);
                return;
            case 1:
                C1473m.f7980a.an().m22465a(C1473m.f7980a.f7981b, b, "hygiene_reason_retry", true);
                return;
            default:
                FinskyLog.m21665c("Unknown message %s", a);
                return;
        }
    }
}
