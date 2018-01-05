package com.google.android.libraries.play.entertainment.bitmap;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import com.google.android.libraries.play.entertainment.p344d.C6070w;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.Arrays;

public final class C6047p implements OnAttachStateChangeListener, OnLayoutChangeListener {
    public static int f30156a = 75;
    public static boolean f30157b = true;
    public static final C6090b f30158c = C6090b.m28050a();
    public final BitmapStore f30159d;
    public final C6028r f30160e;
    public final C6070w f30161f;
    public int f30162g = -1;
    public Boolean f30163h;
    public float f30164i = 1.0f;
    public int f30165j;
    public int f30166k;
    public boolean f30167l;
    public ImageInfo f30168m;
    public int f30169n;
    public boolean f30170o;
    public C6032d[] f30171p = new C6032d[0];
    public int f30172q;
    public int f30173r;
    public C6036g f30174s;
    public C6050q f30175t;
    public boolean f30176u;

    public C6047p(BitmapStore bitmapStore, C6028r c6028r) {
        C6116b.m28102a();
        this.f30159d = (BitmapStore) C6116b.m28100a((Object) bitmapStore);
        this.f30160e = (C6028r) C6116b.m28100a((Object) c6028r);
        this.f30161f = C6070w.m27988a();
    }

    public final void m27946a(ImageInfo imageInfo, int i, C6032d... c6032dArr) {
        C6116b.m28100a((Object) imageInfo);
        C6116b.m28099a(imageInfo.f30112a);
        C6116b.m28105a((Object[]) c6032dArr);
        if (this.f30168m == null || !this.f30168m.f30112a.equals(imageInfo.f30112a) || i != this.f30169n || !Arrays.equals(this.f30171p, c6032dArr)) {
            boolean z;
            this.f30168m = imageInfo;
            this.f30169n = i;
            if (i == 0 || imageInfo.f30112a.indexOf(61) == -1) {
                z = false;
            } else {
                z = true;
            }
            this.f30170o = z;
            this.f30171p = (C6032d[]) c6032dArr.clone();
            f30158c.m28054a("%x bound", Integer.valueOf(hashCode()));
            m27945a();
        }
    }

    public final void onViewAttachedToWindow(View view) {
        this.f30167l = true;
        f30158c.m28054a("%x attached", Integer.valueOf(hashCode()));
        m27945a();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f30167l = false;
        f30158c.m28054a("%x detached", Integer.valueOf(hashCode()));
        m27945a();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f30172q = Math.max(0, i3 - i);
        this.f30173r = Math.max(0, i4 - i2);
        f30158c.m28054a("%x Laid out", Integer.valueOf(hashCode()));
        m27945a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m27945a() {
        /*
        r26 = this;
        r0 = r26;
        r2 = r0.f30169n;
        switch(r2) {
            case 0: goto L_0x005e;
            case 1: goto L_0x0007;
            case 2: goto L_0x005e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = r26;
        r2 = r0.f30172q;
        r2 = (float) r2;
        r0 = r26;
        r3 = r0.f30164i;
        r2 = r2 * r3;
        r2 = (double) r2;
        r2 = java.lang.Math.ceil(r2);
        r2 = (int) r2;
    L_0x0017:
        r0 = r26;
        r3 = r0.f30169n;
        switch(r3) {
            case 0: goto L_0x0060;
            case 1: goto L_0x0060;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = r26;
        r3 = r0.f30173r;
        r3 = (float) r3;
        r0 = r26;
        r4 = r0.f30164i;
        r3 = r3 * r4;
        r4 = (double) r3;
        r4 = java.lang.Math.ceil(r4);
        r3 = (int) r4;
    L_0x002e:
        r0 = r26;
        r4 = r0.f30168m;
        if (r4 == 0) goto L_0x003e;
    L_0x0034:
        r0 = r26;
        r4 = r0.f30167l;
        if (r4 == 0) goto L_0x003e;
    L_0x003a:
        if (r2 == 0) goto L_0x003e;
    L_0x003c:
        if (r3 != 0) goto L_0x0062;
    L_0x003e:
        r2 = f30158c;
        r3 = "%x teardown: not bound, not attached, or no size";
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = r26.hashCode();
        r6 = java.lang.Integer.valueOf(r6);
        r4[r5] = r6;
        r2.m28054a(r3, r4);
        r0 = r26;
        r2 = r0.f30161f;
        r2.m27993d();
        r26.m27944b();
    L_0x005d:
        return;
    L_0x005e:
        r2 = 1;
        goto L_0x0017;
    L_0x0060:
        r3 = 1;
        goto L_0x002e;
    L_0x0062:
        r11 = new com.google.android.libraries.play.entertainment.bitmap.g;
        r0 = r26;
        r4 = r0.f30168m;
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28100a(r4);
        r0 = r26;
        r4 = r0.f30169n;
        if (r4 == 0) goto L_0x0079;
    L_0x0071:
        r0 = r26;
        r4 = r0.f30168m;
        r4 = r4.f30113b;
        if (r4 != 0) goto L_0x00ad;
    L_0x0079:
        r0 = r26;
        r2 = r0.f30168m;
        r2 = r2.f30112a;
    L_0x007f:
        r0 = r26;
        r3 = r0.f30171p;
        r11.<init>(r2, r3);
        r0 = r26;
        r2 = r0.f30174s;
        r2 = r11.equals(r2);
        if (r2 == 0) goto L_0x0374;
    L_0x0090:
        r2 = f30158c;
        r3 = "%x Suppress update: same request";
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = r26.hashCode();
        r6 = java.lang.Integer.valueOf(r6);
        r4[r5] = r6;
        r2.m28054a(r3, r4);
        r0 = r26;
        r2 = r0.f30161f;
        r2.m27992c();
        goto L_0x005d;
    L_0x00ad:
        r5 = new java.lang.StringBuilder;
        r0 = r26;
        r4 = r0.f30168m;
        r4 = r4.f30112a;
        r5.<init>(r4);
        r0 = r26;
        r4 = r0.f30170o;
        if (r4 == 0) goto L_0x00ff;
    L_0x00be:
        r4 = 45;
    L_0x00c0:
        r12 = r5.append(r4);
        r0 = r26;
        r4 = r0.f30165j;
        if (r4 <= 0) goto L_0x00ce;
    L_0x00ca:
        r0 = r26;
        r2 = r0.f30165j;
    L_0x00ce:
        r0 = r26;
        r4 = r0.f30166k;
        if (r4 <= 0) goto L_0x00d8;
    L_0x00d4:
        r0 = r26;
        r3 = r0.f30166k;
    L_0x00d8:
        r4 = 0;
        r0 = r26;
        r5 = r0.f30169n;
        switch(r5) {
            case 1: goto L_0x0102;
            case 2: goto L_0x0227;
            case 3: goto L_0x0233;
            case 4: goto L_0x024c;
            case 5: goto L_0x025e;
            case 6: goto L_0x024c;
            default: goto L_0x00e0;
        };
    L_0x00e0:
        r2 = new java.lang.IllegalArgumentException;
        r0 = r26;
        r3 = r0.f30169n;
        r4 = 37;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Unknown FifeResizableMode ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r3 = r3.toString();
        r2.<init>(r3);
        throw r2;
    L_0x00ff:
        r4 = 61;
        goto L_0x00c0;
    L_0x0102:
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r3 = r12.append(r3);
        r3.append(r2);
        r10 = r4;
    L_0x010c:
        r2 = 0;
        r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x01f0;
    L_0x0111:
        r0 = r26;
        r2 = r0.f30168m;
        r2 = r2.m27917a();
        if (r2 == 0) goto L_0x01f0;
    L_0x011b:
        r0 = r26;
        r2 = r0.f30168m;
        r2 = r2.f30115d;
        if (r2 <= 0) goto L_0x01f0;
    L_0x0123:
        r0 = r26;
        r2 = r0.f30169n;
        r3 = 6;
        if (r2 != r3) goto L_0x02b0;
    L_0x012a:
        r0 = r26;
        r8 = r0.f30168m;
        r2 = r8.m27917a();
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28106b(r2);
        r2 = r8.f30115d;
        if (r2 <= 0) goto L_0x0270;
    L_0x0139:
        r2 = 1;
    L_0x013a:
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28106b(r2);
        r6 = r8.f30114c;
        r3 = r8.f30115d;
        r4 = r8.f30116e;
        r14 = (double) r6;
        r4 = r4 * r14;
        r7 = (int) r4;
        r4 = r8.f30117f;
        r14 = (double) r6;
        r4 = r4 * r14;
        r5 = (int) r4;
        r14 = r8.f30118g;
        r0 = (double) r3;
        r16 = r0;
        r14 = r14 * r16;
        r4 = (int) r14;
        r8 = r8.f30119h;
        r14 = (double) r3;
        r8 = r8 * r14;
        r2 = (int) r8;
        r8 = r5 - r7;
        r9 = r2 - r4;
        r13 = (float) r8;
        r14 = (float) r9;
        r13 = r13 / r14;
        r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1));
        if (r13 <= 0) goto L_0x0288;
    L_0x0163:
        r13 = (float) r8;
        r13 = r13 / r10;
        r13 = (int) r13;
        if (r13 <= r3) goto L_0x0273;
    L_0x0168:
        r2 = (float) r3;
        r2 = r2 * r10;
        r2 = (int) r2;
        r2 = r8 - r2;
        r2 = r2 >> 1;
        r7 = r7 + r2;
        r2 = r5 - r2;
        r4 = 0;
        r5 = r2;
        r2 = r3;
    L_0x0175:
        r8 = new com.google.wireless.android.finsky.dfe.g.a.ad;
        r8.<init>();
        r7 = (float) r7;
        r9 = (float) r6;
        r7 = r7 / r9;
        r14 = (double) r7;
        r7 = r8.a(r14);
        r5 = (float) r5;
        r6 = (float) r6;
        r5 = r5 / r6;
        r8 = (double) r5;
        r5 = r7.c(r8);
        r4 = (float) r4;
        r6 = (float) r3;
        r4 = r4 / r6;
        r6 = (double) r4;
        r4 = r5.b(r6);
        r2 = (float) r2;
        r3 = (float) r3;
        r2 = r2 / r3;
        r2 = (double) r2;
        r2 = r4.d(r2);
    L_0x019a:
        r3 = "-";
        r3 = r12.append(r3);
        r4 = r2.b;
        r6 = r2.c;
        r8 = r2.d;
        r14 = r2.e;
        r2 = "fcrop64=1,%04x%04x%04x%04x";
        r10 = 4;
        r10 = new java.lang.Object[r10];
        r13 = 0;
        r4 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27942a(r4);
        r4 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27943b(r4);
        r4 = java.lang.Integer.valueOf(r4);
        r10[r13] = r4;
        r4 = 1;
        r6 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27942a(r6);
        r5 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27943b(r6);
        r5 = java.lang.Integer.valueOf(r5);
        r10[r4] = r5;
        r4 = 2;
        r6 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27942a(r8);
        r5 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27943b(r6);
        r5 = java.lang.Integer.valueOf(r5);
        r10[r4] = r5;
        r4 = 3;
        r6 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27942a(r14);
        r5 = com.google.android.libraries.play.entertainment.bitmap.C6045n.m27943b(r6);
        r5 = java.lang.Integer.valueOf(r5);
        r10[r4] = r5;
        r2 = java.lang.String.format(r2, r10);
        r3.append(r2);
    L_0x01f0:
        r2 = 19;
        r2 = com.google.android.libraries.play.entertainment.p351m.C6115a.m28097a(r2);
        if (r2 == 0) goto L_0x020d;
    L_0x01f8:
        r0 = r26;
        r2 = r0.f30163h;
        if (r2 == 0) goto L_0x036a;
    L_0x01fe:
        r0 = r26;
        r2 = r0.f30163h;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x020d;
    L_0x0208:
        r2 = "-rwu";
        r12.append(r2);
    L_0x020d:
        r0 = r26;
        r2 = r0.f30162g;
        r3 = -1;
        if (r2 == r3) goto L_0x0370;
    L_0x0214:
        r0 = r26;
        r2 = r0.f30162g;
    L_0x0218:
        r3 = "-l";
        r3 = r12.append(r3);
        r3.append(r2);
        r2 = r12.toString();
        goto L_0x007f;
    L_0x0227:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r2 = r12.append(r2);
        r2.append(r3);
        r10 = r4;
        goto L_0x010c;
    L_0x0233:
        r4 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r4 = r12.append(r4);
        r4 = r4.append(r2);
        r5 = "-h";
        r4 = r4.append(r5);
        r4.append(r3);
        r2 = (float) r2;
        r3 = (float) r3;
        r2 = r2 / r3;
        r10 = r2;
        goto L_0x010c;
    L_0x024c:
        r4 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r4 = r12.append(r4);
        r2 = java.lang.Math.min(r2, r3);
        r4.append(r2);
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = r2;
        goto L_0x010c;
    L_0x025e:
        r4 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r4 = r12.append(r4);
        r2 = java.lang.Math.max(r2, r3);
        r4.append(r2);
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = r2;
        goto L_0x010c;
    L_0x0270:
        r2 = 0;
        goto L_0x013a;
    L_0x0273:
        r8 = r13 - r9;
        r8 = r8 >> 1;
        r4 = r4 - r8;
        r2 = r2 + r8;
        if (r4 >= 0) goto L_0x027f;
    L_0x027b:
        r2 = r2 - r4;
        r4 = 0;
        goto L_0x0175;
    L_0x027f:
        if (r2 <= r3) goto L_0x0175;
    L_0x0281:
        r2 = r2 - r3;
        r2 = r4 - r2;
        r4 = r2;
        r2 = r3;
        goto L_0x0175;
    L_0x0288:
        r13 = (float) r9;
        r13 = r13 * r10;
        r13 = (int) r13;
        if (r13 <= r6) goto L_0x029b;
    L_0x028d:
        r5 = (float) r6;
        r5 = r5 / r10;
        r5 = (int) r5;
        r5 = r9 - r5;
        r5 = r5 >> 1;
        r4 = r4 + r5;
        r2 = r2 - r5;
        r5 = 0;
        r7 = r5;
        r5 = r6;
        goto L_0x0175;
    L_0x029b:
        r8 = r13 - r8;
        r8 = r8 >> 1;
        r7 = r7 - r8;
        r5 = r5 + r8;
        if (r7 >= 0) goto L_0x02a7;
    L_0x02a3:
        r5 = r5 - r7;
        r7 = 0;
        goto L_0x0175;
    L_0x02a7:
        if (r5 <= r6) goto L_0x0175;
    L_0x02a9:
        r5 = r5 - r6;
        r5 = r7 - r5;
        r7 = r5;
        r5 = r6;
        goto L_0x0175;
    L_0x02b0:
        r0 = r26;
        r3 = r0.f30168m;
        r2 = r3.m27917a();
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28106b(r2);
        r2 = r3.f30115d;
        if (r2 <= 0) goto L_0x0320;
    L_0x02bf:
        r2 = 1;
    L_0x02c0:
        com.google.android.libraries.play.entertainment.p351m.C6116b.m28106b(r2);
        r2 = r3.f30114c;
        r4 = r3.f30115d;
        r14 = r3.f30116e;
        r0 = r3.f30117f;
        r16 = r0;
        r0 = r3.f30118g;
        r18 = r0;
        r0 = r3.f30119h;
        r20 = r0;
        r3 = (float) r2;
        r5 = (float) r4;
        r3 = r3 / r5;
        r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x0339;
    L_0x02dc:
        r8 = 0;
        r6 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r3 = (float) r4;
        r3 = r3 * r10;
        r2 = (float) r2;
        r2 = r3 / r2;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r3;
        r4 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r4 = r16 / r4;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r14 = r14 + r4;
        r4 = (double) r2;
        r4 = r14 - r4;
        r2 = (double) r2;
        r2 = r2 + r14;
        r14 = 0;
        r10 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
        if (r10 >= 0) goto L_0x0322;
    L_0x02fc:
        r2 = r2 - r4;
        r4 = 0;
        r22 = r6;
        r6 = r2;
        r2 = r22;
        r24 = r8;
        r8 = r4;
        r4 = r24;
    L_0x0309:
        r10 = new com.google.wireless.android.finsky.dfe.g.a.ad;
        r10.<init>();
        r4 = r10.b(r4);
        r2 = r4.d(r2);
        r2 = r2.a(r8);
        r2 = r2.c(r6);
        goto L_0x019a;
    L_0x0320:
        r2 = 0;
        goto L_0x02c0;
    L_0x0322:
        r14 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r10 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r10 <= 0) goto L_0x032e;
    L_0x0328:
        r14 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r2 = r2 - r14;
        r4 = r4 - r2;
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
    L_0x032e:
        r22 = r6;
        r6 = r2;
        r2 = r22;
        r24 = r8;
        r8 = r4;
        r4 = r24;
        goto L_0x0309;
    L_0x0339:
        r8 = 0;
        r6 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r2 = (float) r2;
        r2 = r2 / r10;
        r3 = (float) r4;
        r2 = r2 / r3;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r3;
        r4 = r20 - r18;
        r14 = 4603579539098121011; // 0x3fe3333333333333 float:4.172325E-8 double:0.6;
        r4 = r4 * r14;
        r14 = r18 + r4;
        r4 = (double) r2;
        r4 = r14 - r4;
        r2 = (double) r2;
        r2 = r2 + r14;
        r14 = 0;
        r10 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
        if (r10 >= 0) goto L_0x035d;
    L_0x0359:
        r2 = r2 - r4;
        r4 = 0;
        goto L_0x0309;
    L_0x035d:
        r14 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r10 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r10 <= 0) goto L_0x0309;
    L_0x0363:
        r14 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r2 = r2 - r14;
        r4 = r4 - r2;
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        goto L_0x0309;
    L_0x036a:
        r2 = f30157b;
        if (r2 == 0) goto L_0x020d;
    L_0x036e:
        goto L_0x0208;
    L_0x0370:
        r2 = f30156a;
        goto L_0x0218;
    L_0x0374:
        r2 = f30158c;
        r3 = "%1$x Update: %2$s";
        r4 = 2;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = r26.hashCode();
        r6 = java.lang.Integer.valueOf(r6);
        r4[r5] = r6;
        r5 = 1;
        r6 = r11.f30143a;
        r4[r5] = r6;
        r2.m28054a(r3, r4);
        r0 = r26;
        r2 = r0.f30161f;
        r2.m27994e();
        r26.m27944b();
        r0 = r26;
        r0.f30174s = r11;
        r2 = new com.google.android.libraries.play.entertainment.bitmap.q;
        r0 = r26;
        r2.<init>(r0);
        r0 = r26;
        r0.f30175t = r2;
        r0 = r26;
        r2 = r0.f30159d;
        r3 = r2.f30107e;
        r3 = r3.m15430b(r11);
        if (r3 == 0) goto L_0x03c6;
    L_0x03b3:
        r2 = com.google.android.libraries.play.entertainment.p344d.C6057c.m27970a(r3);
    L_0x03b7:
        r0 = r26;
        r3 = r0.f30161f;
        r4 = com.google.android.libraries.play.entertainment.p344d.C6058e.f30188b;
        r0 = r26;
        r5 = r0.f30175t;
        r2.m27965a(r3, r4, r5);
        goto L_0x005d;
    L_0x03c6:
        r3 = new com.google.android.libraries.play.entertainment.l.c;
        r4 = new com.google.android.libraries.play.entertainment.l.a;
        r5 = r11.f30143a;
        r4.<init>(r5);
        r5 = 0;
        r3.<init>(r4, r5);
        r4 = r2.f30106d;
        r3 = r4.mo3213a(r3);
        r4 = r2.f30108f;
        r5 = new com.google.android.libraries.play.entertainment.bitmap.j;
        r5.<init>(r2, r11);
        r3 = r3.m27964a(r4, r5);
        r4 = r2.f30108f;
        r5 = r2.f30109g;
        r3 = r3.m27964a(r4, r5);
        r4 = r2.f30110h;
        r3 = r3.m27963a(r4);
        r4 = r2.f30108f;
        r2 = r2.f30111i;
        r2 = r3.m27964a(r4, r2);
        goto L_0x03b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.play.entertainment.bitmap.p.a():void");
    }

    private final void m27944b() {
        if (this.f30176u) {
            this.f30160e.setImageBitmap(null);
            this.f30176u = false;
        }
        this.f30174s = null;
        if (this.f30175t != null) {
            C6050q c6050q = this.f30175t;
            c6050q.f30177a = null;
            if (c6050q.f30178b != null) {
                c6050q.f30178b.m27930c();
                c6050q.f30178b = null;
            }
            this.f30175t = null;
        }
    }
}
