package com.google.android.finsky.bn;

import android.content.Intent;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.a;

public final class C2129c {
    public static final String[] f10793N = new String[0];
    public long f10794A;
    public long f10795B;
    public String f10796C;
    public long f10797D;
    public C2470a f10798E;
    public C2470a f10799F;
    public long f10800G;
    public String f10801H = "unknown";
    public int f10802I = 0;
    public Intent f10803J;
    public int f10804K = 1;
    public String[] f10805L;
    public C3314d f10806M;
    public final String f10807a;
    public int f10808b = 1;
    public int f10809c = -1;
    public int f10810d = -1;
    public a f10811e;
    public long f10812f;
    public int f10813g;
    public String f10814h;
    public String f10815i;
    public long f10816j;
    public String f10817k;
    public String f10818l;
    public int f10819m;
    public String f10820n;
    public long f10821o;
    public String f10822p;
    public long f10823q;
    public int f10824r;
    public int f10825s;
    public String f10826t;
    public String[] f10827u;
    public String f10828v;
    public String f10829w;
    public byte[] f10830x;
    public long f10831y;
    public C2441n f10832z;

    C2129c(String str) {
        this.f10807a = str;
    }

    public C2129c(String str, int i, int i2, int i3, int i4, a aVar, long j, int i5, String str2, long j2, String str3, String str4, String str5, String str6, int i6, long j3, String str7, long j4, int i7, int i8, String str8, String[] strArr, String str9, String str10, byte[] bArr, long j5, C2441n c2441n, long j6, long j7, String str11, long j8, C2470a c2470a, C2470a c2470a2, long j9, int i9, Intent intent, String str12, String[] strArr2, C3314d c3314d) {
        this.f10807a = str;
        this.f10808b = i;
        this.f10809c = i2;
        this.f10804K = i3;
        this.f10810d = i4;
        this.f10811e = aVar;
        this.f10812f = j;
        this.f10813g = i5;
        this.f10814h = str2;
        this.f10816j = j2;
        this.f10817k = str3;
        this.f10820n = str4;
        this.f10815i = str5;
        this.f10818l = str6;
        this.f10819m = i6;
        this.f10821o = j3;
        this.f10822p = str7;
        this.f10823q = j4;
        this.f10824r = i7;
        this.f10825s = i8;
        this.f10826t = str8;
        this.f10827u = strArr;
        this.f10828v = str9;
        this.f10829w = str10;
        this.f10830x = bArr;
        this.f10831y = j5;
        this.f10832z = c2441n;
        this.f10794A = j6;
        this.f10795B = j7;
        this.f10796C = str11;
        this.f10797D = j8;
        this.f10798E = c2470a;
        this.f10799F = c2470a2;
        this.f10800G = j9;
        this.f10802I = i9;
        this.f10803J = intent;
        this.f10801H = str12;
        this.f10805L = strArr2;
        this.f10806M = c3314d;
    }

    public final String toString() {
        boolean z = true;
        String str = "(packageName=%s,autoUpdate=%d,desiredVersion=%d,hasDeliveryData=%b,installerState=%d,downloadUri=%s,firstDownloadMs=%d,externalReferrer=%s,continueUrl=%s,account=%s)";
        Object[] objArr = new Object[10];
        objArr[0] = this.f10807a;
        objArr[1] = Integer.valueOf(this.f10808b);
        objArr[2] = Integer.valueOf(this.f10809c);
        if (this.f10811e == null) {
            z = false;
        }
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = Integer.valueOf(this.f10813g);
        objArr[5] = this.f10814h;
        objArr[6] = Long.valueOf(this.f10816j);
        objArr[7] = this.f10817k;
        objArr[8] = this.f10820n;
        objArr[9] = FinskyLog.m21655a(this.f10815i);
        return String.format(str, objArr);
    }

    public final String[] m11117a() {
        return this.f10827u == null ? f10793N : this.f10827u;
    }

    public final int m11118b() {
        if ((this.f10819m & 16384) != 0) {
            return 1;
        }
        if ((this.f10819m & 32768) != 0) {
            return 2;
        }
        return 3;
    }

    public final C2470a m11119c() {
        return this.f10798E != null ? this.f10798E : new C2470a();
    }

    public final C2470a m11120d() {
        return this.f10799F != null ? this.f10799F : new C2470a();
    }
}
