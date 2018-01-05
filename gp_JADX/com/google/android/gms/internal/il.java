package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.p282a.C5051b;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.measurement.C5312g;
import java.util.ArrayList;
import java.util.List;

public final class il extends hz {
    public final iu f26999a;
    public gu f27000b;
    public Boolean f27001c;
    public final gm f27002d;
    public final jh f27003e;
    public final List f27004f = new ArrayList();
    public final gm f27005g;

    protected il(hv hvVar) {
        super(hvVar);
        this.f27003e = new jh(hvVar.f26939n);
        this.f26999a = new iu(this);
        this.f27002d = new im(this, hvVar);
        this.f27005g = new ir(this, hvVar);
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    protected final void m24825a(gu guVar) {
        mo4728b();
        am.m23733a((Object) guVar);
        this.f27000b = guVar;
        m24848u();
        m24823A();
    }

    protected final void m24827a(C5312g c5312g) {
        mo4728b();
        m24432x();
        m24828a(new ip(this, c5312g));
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    protected final void mo4745s() {
    }

    public final boolean m24847t() {
        mo4728b();
        m24432x();
        return this.f27000b != null;
    }

    final void m24848u() {
        mo4728b();
        this.f27003e.m24885a();
        this.f27002d.m24502a(gj.m24438D());
    }

    public final void m24850z() {
        mo4728b();
        m24432x();
        try {
            C5051b.m23267a();
            mo4736j().unbindService(this.f26999a);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        this.f27000b = null;
    }

    final void m24826a(gu guVar, zza com_google_android_gms_common_internal_safeparcel_zza) {
        mo4728b();
        mo4727a();
        m24432x();
        gj.m24442H();
        List arrayList = new ArrayList();
        gj.m24448P();
        int i = 100;
        for (int i2 = 0; i2 < 1001 && r5 == 100; i2++) {
            Object t = mo4737k().m24598t();
            if (t != null) {
                arrayList.addAll(t);
                i = t.size();
            } else {
                i = 0;
            }
            if (com_google_android_gms_common_internal_safeparcel_zza != null && r5 < 100) {
                arrayList.add(com_google_android_gms_common_internal_safeparcel_zza);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                zza com_google_android_gms_common_internal_safeparcel_zza2 = (zza) obj;
                if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzcqw) {
                    try {
                        guVar.mo4752a((zzcqw) com_google_android_gms_common_internal_safeparcel_zza2, mo4731e().m24555a(mo4742p().m24651t()));
                    } catch (RemoteException e) {
                        mo4742p().f26845d.m24653a("Failed to send event to the service", e);
                    }
                } else if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzcvg) {
                    try {
                        guVar.mo4754a((zzcvg) com_google_android_gms_common_internal_safeparcel_zza2, mo4731e().m24555a(mo4742p().m24651t()));
                    } catch (RemoteException e2) {
                        mo4742p().f26845d.m24653a("Failed to send attribute to the service", e2);
                    }
                } else if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzcqh) {
                    try {
                        guVar.mo4751a((zzcqh) com_google_android_gms_common_internal_safeparcel_zza2, mo4731e().m24555a(mo4742p().m24651t()));
                    } catch (RemoteException e22) {
                        mo4742p().f26845d.m24653a("Failed to send conditional property to the service", e22);
                    }
                } else {
                    mo4742p().f26845d.m24652a("Discarding data. Unrecognized parcel type.");
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m24849v() {
        /*
        r7 = this;
        r2 = 0;
        r1 = 1;
        r7.mo4728b();
        r7.m24432x();
        r0 = r7.m24847t();
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r0 = r7.f27001c;
        if (r0 != 0) goto L_0x008a;
    L_0x0013:
        r0 = r7.mo4743q();
        r0.mo4728b();
        r3 = r0.m24683t();
        r4 = "use_service";
        r3 = r3.contains(r4);
        if (r3 != 0) goto L_0x00c2;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        r7.f27001c = r0;
        r0 = r7.f27001c;
        if (r0 != 0) goto L_0x008a;
    L_0x002d:
        r0 = r7.mo4742p();
        r0 = r0.f26851j;
        r3 = "State of service unknown";
        r0.m24652a(r3);
        r7.mo4728b();
        r7.m24432x();
        com.google.android.gms.internal.gj.m24442H();
        r0 = r7.mo4742p();
        r0 = r0.f26851j;
        r3 = "Checking service availability";
        r0.m24652a(r3);
        r0 = r7.mo4736j();
        r0 = com.google.android.gms.common.C5095d.m23655a(r0);
        switch(r0) {
            case 0: goto L_0x00d2;
            case 1: goto L_0x00e0;
            case 2: goto L_0x00fb;
            case 3: goto L_0x0109;
            case 9: goto L_0x0116;
            case 18: goto L_0x00ed;
            default: goto L_0x0057;
        };
    L_0x0057:
        r0 = r2;
    L_0x0058:
        r0 = java.lang.Boolean.valueOf(r0);
        r7.f27001c = r0;
        r0 = r7.mo4743q();
        r3 = r7.f27001c;
        r3 = r3.booleanValue();
        r0.mo4728b();
        r4 = r0.mo4742p();
        r4 = r4.f26851j;
        r5 = "Setting useService";
        r6 = java.lang.Boolean.valueOf(r3);
        r4.m24653a(r5, r6);
        r0 = r0.m24683t();
        r0 = r0.edit();
        r4 = "use_service";
        r0.putBoolean(r4, r3);
        r0.apply();
    L_0x008a:
        r0 = r7.f27001c;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x015a;
    L_0x0092:
        r0 = r7.mo4742p();
        r0 = r0.f26851j;
        r1 = "Using measurement service";
        r0.m24652a(r1);
        r1 = r7.f26999a;
        r0 = r1.f27027c;
        r0.mo4728b();
        r0 = r1.f27027c;
        r0 = r0.mo4736j();
        monitor-enter(r1);
        r2 = r1.f27025a;	 Catch:{ all -> 0x00bf }
        if (r2 == 0) goto L_0x0123;
    L_0x00af:
        r0 = r1.f27027c;	 Catch:{ all -> 0x00bf }
        r0 = r0.mo4742p();	 Catch:{ all -> 0x00bf }
        r0 = r0.f26851j;	 Catch:{ all -> 0x00bf }
        r2 = "Connection attempt already in progress";
        r0.m24652a(r2);	 Catch:{ all -> 0x00bf }
        monitor-exit(r1);	 Catch:{ all -> 0x00bf }
        goto L_0x000e;
    L_0x00bf:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00bf }
        throw r0;
    L_0x00c2:
        r0 = r0.m24683t();
        r3 = "use_service";
        r0 = r0.getBoolean(r3, r2);
        r0 = java.lang.Boolean.valueOf(r0);
        goto L_0x0027;
    L_0x00d2:
        r0 = r7.mo4742p();
        r0 = r0.f26851j;
        r3 = "Service available";
        r0.m24652a(r3);
        r0 = r1;
        goto L_0x0058;
    L_0x00e0:
        r0 = r7.mo4742p();
        r0 = r0.f26851j;
        r3 = "Service missing";
        r0.m24652a(r3);
        goto L_0x0057;
    L_0x00ed:
        r0 = r7.mo4742p();
        r0 = r0.f26847f;
        r3 = "Service updating";
        r0.m24652a(r3);
        r0 = r1;
        goto L_0x0058;
    L_0x00fb:
        r0 = r7.mo4742p();
        r0 = r0.f26850i;
        r3 = "Service container out of date";
        r0.m24652a(r3);
        r0 = r1;
        goto L_0x0058;
    L_0x0109:
        r0 = r7.mo4742p();
        r0 = r0.f26847f;
        r3 = "Service disabled";
        r0.m24652a(r3);
        goto L_0x0057;
    L_0x0116:
        r0 = r7.mo4742p();
        r0 = r0.f26847f;
        r3 = "Service invalid";
        r0.m24652a(r3);
        goto L_0x0057;
    L_0x0123:
        r2 = r1.f27026b;	 Catch:{ all -> 0x00bf }
        if (r2 == 0) goto L_0x0137;
    L_0x0127:
        r0 = r1.f27027c;	 Catch:{ all -> 0x00bf }
        r0 = r0.mo4742p();	 Catch:{ all -> 0x00bf }
        r0 = r0.f26851j;	 Catch:{ all -> 0x00bf }
        r2 = "Already awaiting connection attempt";
        r0.m24652a(r2);	 Catch:{ all -> 0x00bf }
        monitor-exit(r1);	 Catch:{ all -> 0x00bf }
        goto L_0x000e;
    L_0x0137:
        r2 = new com.google.android.gms.internal.hb;	 Catch:{ all -> 0x00bf }
        r3 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x00bf }
        r2.<init>(r0, r3, r1, r1);	 Catch:{ all -> 0x00bf }
        r1.f27026b = r2;	 Catch:{ all -> 0x00bf }
        r0 = r1.f27027c;	 Catch:{ all -> 0x00bf }
        r0 = r0.mo4742p();	 Catch:{ all -> 0x00bf }
        r0 = r0.f26851j;	 Catch:{ all -> 0x00bf }
        r2 = "Connecting to remote service";
        r0.m24652a(r2);	 Catch:{ all -> 0x00bf }
        r0 = 1;
        r1.f27025a = r0;	 Catch:{ all -> 0x00bf }
        r0 = r1.f27026b;	 Catch:{ all -> 0x00bf }
        r0.m23030s();	 Catch:{ all -> 0x00bf }
        monitor-exit(r1);	 Catch:{ all -> 0x00bf }
        goto L_0x000e;
    L_0x015a:
        com.google.android.gms.internal.gj.m24442H();
        r0 = r7.mo4736j();
        r0 = r0.getPackageManager();
        r3 = new android.content.Intent;
        r3.<init>();
        r4 = r7.mo4736j();
        r5 = "com.google.android.gms.measurement.AppMeasurementService";
        r3 = r3.setClassName(r4, r5);
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0.queryIntentServices(r3, r4);
        if (r0 == 0) goto L_0x01cf;
    L_0x017c:
        r0 = r0.size();
        if (r0 <= 0) goto L_0x01cf;
    L_0x0182:
        if (r1 == 0) goto L_0x01e0;
    L_0x0184:
        r0 = r7.mo4742p();
        r0 = r0.f26851j;
        r1 = "Using local app measurement service";
        r0.m24652a(r1);
        r0 = new android.content.Intent;
        r1 = "com.google.android.gms.measurement.START";
        r0.<init>(r1);
        r1 = new android.content.ComponentName;
        r2 = r7.mo4736j();
        com.google.android.gms.internal.gj.m24442H();
        r3 = "com.google.android.gms.measurement.AppMeasurementService";
        r1.<init>(r2, r3);
        r0.setComponent(r1);
        r1 = r7.f26999a;
        r2 = r1.f27027c;
        r2.mo4728b();
        r2 = r1.f27027c;
        r2 = r2.mo4736j();
        com.google.android.gms.common.p282a.C5051b.m23267a();
        monitor-enter(r1);
        r3 = r1.f27025a;	 Catch:{ all -> 0x01cc }
        if (r3 == 0) goto L_0x01d1;
    L_0x01bc:
        r0 = r1.f27027c;	 Catch:{ all -> 0x01cc }
        r0 = r0.mo4742p();	 Catch:{ all -> 0x01cc }
        r0 = r0.f26851j;	 Catch:{ all -> 0x01cc }
        r2 = "Connection attempt already in progress";
        r0.m24652a(r2);	 Catch:{ all -> 0x01cc }
        monitor-exit(r1);	 Catch:{ all -> 0x01cc }
        goto L_0x000e;
    L_0x01cc:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x01cc }
        throw r0;
    L_0x01cf:
        r1 = r2;
        goto L_0x0182;
    L_0x01d1:
        r3 = 1;
        r1.f27025a = r3;	 Catch:{ all -> 0x01cc }
        r3 = r1.f27027c;	 Catch:{ all -> 0x01cc }
        r3 = r3.f26999a;	 Catch:{ all -> 0x01cc }
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        com.google.android.gms.common.p282a.C5051b.m23269b(r2, r0, r3, r4);	 Catch:{ all -> 0x01cc }
        monitor-exit(r1);	 Catch:{ all -> 0x01cc }
        goto L_0x000e;
    L_0x01e0:
        r0 = r7.mo4742p();
        r0 = r0.f26845d;
        r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest";
        r0.m24652a(r1);
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.il.v():void");
    }

    final void m24828a(Runnable runnable) {
        mo4728b();
        if (m24847t()) {
            runnable.run();
        } else if (((long) this.f27004f.size()) >= gj.m24446N()) {
            mo4742p().f26845d.m24652a("Discarding data. Max runnable queue size reached");
        } else {
            this.f27004f.add(runnable);
            this.f27005g.m24502a(60000);
            m24849v();
        }
    }

    final void m24823A() {
        mo4728b();
        mo4742p().f26851j.m24653a("Processing queued up service tasks", Integer.valueOf(this.f27004f.size()));
        for (Runnable run : this.f27004f) {
            try {
                run.run();
            } catch (Throwable th) {
                mo4742p().f26845d.m24653a("Task exception while flushing queue", th);
            }
        }
        this.f27004f.clear();
        this.f27005g.m24504c();
    }

    static /* synthetic */ void m24822a(il ilVar, ComponentName componentName) {
        ilVar.mo4728b();
        if (ilVar.f27000b != null) {
            ilVar.f27000b = null;
            ilVar.mo4742p().f26851j.m24653a("Disconnected from device MeasurementService", componentName);
            ilVar.mo4728b();
            ilVar.m24849v();
        }
    }
}
