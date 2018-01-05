package com.google.android.gms.car;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.os.Build.VERSION;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5058o;

public final class C4995j {
    public static final boolean f25496a = (VERSION.SDK_INT >= 21);
    public final Context f25497b;
    public final Object f25498c;
    public int f25499d;
    public C5058o f25500e;
    public final C1629k f25501f;
    public BroadcastReceiver f25502g;
    public C1632q f25503h;
    public C1634r f25504i;
    public C1636d f25505j;

    public C4995j(Context context, C1629k c1629k) {
        this(context, c1629k, (byte) 0);
    }

    private C4995j(Context context, C1629k c1629k, byte b) {
        int i = 0;
        this.f25498c = new Object();
        this.f25499d = 0;
        this.f25502g = new ac(this);
        this.f25503h = new ad(this);
        this.f25504i = new ae(this);
        this.f25505j = new C5001q(this);
        this.f25501f = c1629k;
        this.f25497b = context;
        if (f25496a) {
            int i2;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.car.CONNECTED");
            intentFilter.addAction("com.google.android.gms.car.DISCONNECTED");
            this.f25497b.registerReceiver(this.f25502g, intentFilter, "com.google.android.gms.permission.CAR", null);
            UsbAccessory[] accessoryList = ((UsbManager) context.getSystemService("usb")).getAccessoryList();
            if (accessoryList != null) {
                int length = accessoryList.length;
                i2 = 0;
                while (i < length) {
                    UsbAccessory usbAccessory = accessoryList[i];
                    if ("Android".equals(usbAccessory.getManufacturer()) && ("Android Auto".equals(usbAccessory.getModel()) || "Android Open Automotive Protocol".equals(usbAccessory.getModel()))) {
                        i2 = 1;
                    }
                    i++;
                }
            } else {
                i2 = 0;
            }
            if (i2 == 0) {
                m23157a(2);
                return;
            }
            this.f25500e = C4987a.m23135a(this.f25497b, this.f25503h, this.f25504i, this.f25505j);
            this.f25500e.mo4557e();
            return;
        }
        m23157a(2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23157a(int r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = r4.f25498c;
        monitor-enter(r1);
        r2 = r4.f25499d;	 Catch:{ all -> 0x0027 }
        r3 = 3;
        if (r2 != r3) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
    L_0x000a:
        return;
    L_0x000b:
        r4.f25499d = r5;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x0019;
    L_0x0010:
        r1 = r4.f25501f;
        if (r1 == 0) goto L_0x0019;
    L_0x0014:
        r1 = r4.f25501f;
        r1.mo2360a();
    L_0x0019:
        if (r2 == r5) goto L_0x000a;
    L_0x001b:
        r1 = r4.f25501f;
        if (r1 == 0) goto L_0x000a;
    L_0x001f:
        r1 = r4.f25501f;
        if (r5 != r0) goto L_0x002a;
    L_0x0023:
        r1.mo2361a(r0);
        goto L_0x000a;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r0 = 0;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.j.a(int):void");
    }
}
