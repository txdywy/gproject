package com.google.android.gms.peerdownloadmanager.comms.p291b;

import android.content.BroadcastReceiver;

final class C5411b extends BroadcastReceiver {
    public final /* synthetic */ C5410a f28056a;

    C5411b(C5410a c5410a) {
        this.f28056a = c5410a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
        r9 = this;
        r3 = -1;
        r1 = 0;
        r2 = 1;
        r0 = r11.getAction();
        r4 = r0.hashCode();
        switch(r4) {
            case -1780914469: goto L_0x0027;
            case -377527494: goto L_0x0031;
            case -206700896: goto L_0x003b;
            case 6759640: goto L_0x001d;
            case 1167529923: goto L_0x0013;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = r3;
    L_0x000f:
        switch(r0) {
            case 0: goto L_0x0045;
            case 1: goto L_0x00fc;
            case 2: goto L_0x0109;
            case 3: goto L_0x013f;
            case 4: goto L_0x0144;
            default: goto L_0x0012;
        };
    L_0x0012:
        return;
    L_0x0013:
        r4 = "android.bluetooth.device.action.FOUND";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x000e;
    L_0x001b:
        r0 = r1;
        goto L_0x000f;
    L_0x001d:
        r4 = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x000e;
    L_0x0025:
        r0 = r2;
        goto L_0x000f;
    L_0x0027:
        r4 = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x000e;
    L_0x002f:
        r0 = 2;
        goto L_0x000f;
    L_0x0031:
        r4 = "android.bluetooth.device.action.UUID";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x000e;
    L_0x0039:
        r0 = 3;
        goto L_0x000f;
    L_0x003b:
        r4 = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x000e;
    L_0x0043:
        r0 = 4;
        goto L_0x000f;
    L_0x0045:
        r4 = r9.f28056a;
        r0 = "android.bluetooth.device.extra.DEVICE";
        r0 = r11.getParcelableExtra(r0);
        r0 = (android.bluetooth.BluetoothDevice) r0;
        if (r0 == 0) goto L_0x0012;
    L_0x0051:
        r3 = r0.getAddress();
        r5 = r0.getBluetoothClass();
        if (r5 != 0) goto L_0x00d4;
    L_0x005b:
        r3 = r2;
    L_0x005c:
        if (r3 != 0) goto L_0x0012;
    L_0x005e:
        r3 = r4.f28048k;
        if (r3 == 0) goto L_0x006e;
    L_0x0062:
        r3 = r4.f28048k;
        r5 = r0.getAddress();
        r3 = r3.compareTo(r5);
        if (r3 >= 0) goto L_0x006f;
    L_0x006e:
        r1 = r2;
    L_0x006f:
        r2 = "BluetoothDiscovery";
        r3 = r0.getName();
        r5 = r0.getAddress();
        r6 = r0.getBluetoothClass();
        r6 = r6.getDeviceClass();
        r7 = java.lang.String.valueOf(r3);
        r7 = r7.length();
        r7 = r7 + 44;
        r8 = java.lang.String.valueOf(r5);
        r8 = r8.length();
        r7 = r7 + r8;
        r8 = new java.lang.StringBuilder;
        r8.<init>(r7);
        r7 = "Discovered device: ";
        r7 = r8.append(r7);
        r3 = r7.append(r3);
        r7 = " | ";
        r3 = r3.append(r7);
        r3 = r3.append(r5);
        r5 = " | ";
        r3 = r3.append(r5);
        r3 = r3.append(r6);
        r5 = " | ";
        r3 = r3.append(r5);
        r3 = r3.append(r1);
        r3 = r3.toString();
        android.util.Log.v(r2, r3);
        r2 = r4.f28049l;
        r3 = new com.google.android.gms.peerdownloadmanager.comms.a.c;
        r3.<init>(r0);
        r2.mo4969a(r3, r1);
        goto L_0x0012;
    L_0x00d4:
        r5 = r5.getDeviceClass();
        r6 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        r6 = r6.getAddress();
        r6 = r3.equals(r6);
        if (r6 != 0) goto L_0x00f6;
    L_0x00e6:
        r6 = "02:00:00:00:00:00";
        r3 = r3.equals(r6);
        if (r3 != 0) goto L_0x00f6;
    L_0x00ee:
        r3 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        if (r5 == r3) goto L_0x00f9;
    L_0x00f2:
        r3 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        if (r5 == r3) goto L_0x00f9;
    L_0x00f6:
        r3 = r2;
        goto L_0x005c;
    L_0x00f9:
        r3 = r1;
        goto L_0x005c;
    L_0x00fc:
        r0 = "BluetoothDiscovery";
        r1 = "BT scan discovery started";
        android.util.Log.d(r0, r1);
        r0 = r9.f28056a;
        r0.f28054q = r2;
        goto L_0x0012;
    L_0x0109:
        r0 = "BluetoothDiscovery";
        r2 = "BT scan discovery finished";
        android.util.Log.d(r0, r2);
        r0 = r9.f28056a;
        r0 = r0.f28054q;
        r2 = r9.f28056a;
        r2.f28054q = r1;
        if (r0 == 0) goto L_0x0012;
    L_0x011a:
        r0 = r9.f28056a;
        r0 = r0.f28041d;
        r1 = r0.f28238e;
        r1 = r1.f28248a;
        if (r1 == 0) goto L_0x0012;
    L_0x0124:
        r1 = r0.f28238e;
        r1 = r1.f28248a;
        r2 = r1.f28252a;
        r2 = r2.mo5025a();
        r1.f28254c = r2;
        r1 = r0.f28240g;
        r0 = r0.f28238e;
        r0 = r0.f28248a;
        r2 = r0.m26377a();
        r1.mo5032a(r2);
        goto L_0x0012;
    L_0x013f:
        com.google.android.gms.peerdownloadmanager.comms.p291b.C5410a.m26206a(r11);
        goto L_0x0012;
    L_0x0144:
        r0 = r9.f28056a;
        r1 = "android.bluetooth.adapter.extra.SCAN_MODE";
        r1 = r11.getIntExtra(r1, r3);
        r0.f28053p = r1;
        r1 = "BluetoothDiscovery";
        r2 = r0.f28053p;
        r3 = 34;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "handleScanModeChanged: ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r2 = r2.toString();
        android.util.Log.d(r1, r2);
        r1 = r0.f28053p;
        switch(r1) {
            case -1: goto L_0x0171;
            case 20: goto L_0x017a;
            case 21: goto L_0x017a;
            default: goto L_0x016f;
        };
    L_0x016f:
        goto L_0x0012;
    L_0x0171:
        r0 = "BluetoothDiscovery";
        r1 = "Couldn't read EXTRA_SCAN_MODE.";
        android.util.Log.e(r0, r1);
        goto L_0x0012;
    L_0x017a:
        r1 = r0.f28047j;
        if (r1 == 0) goto L_0x0012;
    L_0x017e:
        r0.m26220g();
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.peerdownloadmanager.comms.b.b.onReceive(android.content.Context, android.content.Intent):void");
    }
}
