package com.google.android.finsky.billing.p130b;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.common.C1788a;
import com.google.android.finsky.billing.common.C1790e;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.bt;

public final class C1774n {
    public C2171b f9187a;
    public C2162a f9188b;
    public final Account f9189c;
    public final C1790e f9190d;
    public final C2495w f9191e;
    public final C3300k f9192f;
    public final C2199l f9193g;
    public final C1697p f9194h;
    public final Activity f9195i;
    public final C1788a f9196j;
    public final C1552e f9197k;
    public bt f9198l;
    public boolean f9199m;

    public C1774n(Account account, C2495w c2495w, C3300k c3300k, C2199l c2199l, C1697p c1697p, C1790e c1790e, Activity activity, C1788a c1788a, C1552e c1552e) {
        ((C1349e) C3947d.m18649a(C1349e.class)).mo1730a(this);
        this.f9189c = account;
        this.f9191e = c2495w;
        this.f9192f = c3300k;
        this.f9193g = c2199l;
        this.f9194h = c1697p;
        this.f9190d = c1790e;
        this.f9195i = activity;
        this.f9196j = c1788a;
        this.f9197k = c1552e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9718a(com.google.wireless.android.finsky.dfe.c.a.bt r11) {
        /*
        r10 = this;
        r1 = 0;
        r5 = 1;
        r4 = 0;
        r0 = r10.f9199m;
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        r10.f9198l = r11;
    L_0x0009:
        return;
    L_0x000a:
        if (r11 == 0) goto L_0x011b;
    L_0x000c:
        r3 = r11.c;
        r2 = r11.b;
        r0 = r11.f;
        if (r0 == 0) goto L_0x0118;
    L_0x0014:
        r0 = r11.f;
        r0 = r0.i;
        if (r0 == 0) goto L_0x002c;
    L_0x001a:
        r0 = r10.f9188b;
        r6 = r10.f9195i;
        r6 = r6.getPackageManager();
        r7 = r11.f;
        r7 = r7.g;
        r0 = r0.mo2703a(r6, r7);
        if (r0 == 0) goto L_0x00db;
    L_0x002c:
        r6 = r10.f9196j;
        r7 = r11.f;
        r0 = r10.f9195i;
        r0 = r0.getPackageManager();
        r8 = r10.f9191e;
        if (r7 != 0) goto L_0x0067;
    L_0x003a:
        r0 = r1;
    L_0x003b:
        if (r0 != 0) goto L_0x0058;
    L_0x003d:
        r1 = r11.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x0044;
    L_0x0043:
        r4 = r5;
    L_0x0044:
        if (r4 == 0) goto L_0x0058;
    L_0x0046:
        r0 = r11.e;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x010a;
    L_0x004e:
        r0 = r10.f9187a;
        r1 = r10.f9195i;
        r4 = r10.f9191e;
        r0 = r0.mo2738a(r1, r4);
    L_0x0058:
        if (r0 == 0) goto L_0x005f;
    L_0x005a:
        r1 = r10.f9195i;
        r1.startActivity(r0);
    L_0x005f:
        r1 = r2;
        r0 = r3;
    L_0x0061:
        r2 = r10.f9194h;
        r2.mo2398a(r0, r1);
        goto L_0x0009;
    L_0x0067:
        r9 = r7.k;
        if (r9 == 0) goto L_0x0079;
    L_0x006b:
        r9 = r7.d();
        if (r9 == 0) goto L_0x0079;
    L_0x0071:
        r9 = r7.e;
        r0 = r0.getLaunchIntentForPackage(r9);
        if (r0 != 0) goto L_0x003b;
    L_0x0079:
        r0 = r7.a;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x0084;
    L_0x007f:
        r0 = r5;
    L_0x0080:
        if (r0 != 0) goto L_0x0086;
    L_0x0082:
        r0 = r1;
        goto L_0x003b;
    L_0x0084:
        r0 = r4;
        goto L_0x0080;
    L_0x0086:
        r0 = new android.content.Intent;
        r1 = r7.c;
        r0.<init>(r1);
        r1 = r7.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x00d7;
    L_0x0093:
        r1 = r5;
    L_0x0094:
        if (r1 == 0) goto L_0x009d;
    L_0x0096:
        r1 = r6.f9313a;
        r6 = r7.h;
        r0.setClassName(r1, r6);
    L_0x009d:
        r1 = r7.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x00d9;
    L_0x00a3:
        r1 = r5;
    L_0x00a4:
        if (r1 == 0) goto L_0x00af;
    L_0x00a6:
        r1 = r7.d;
        r1 = android.net.Uri.parse(r1);
        r0.setData(r1);
    L_0x00af:
        r1 = r7.d();
        if (r1 == 0) goto L_0x00ba;
    L_0x00b5:
        r1 = r7.e;
        r0.setPackage(r1);
    L_0x00ba:
        r1 = r7.j;
        if (r1 == 0) goto L_0x00c1;
    L_0x00be:
        r8.m13376a(r0);
    L_0x00c1:
        r1 = r7.b;
        r1 = com.google.android.finsky.billing.common.C1788a.m9750a(r1);
        r0.setFlags(r1);
        r1 = r7.f;
        r1 = com.google.android.finsky.billing.common.C1802r.m9801a(r1);
        if (r1 == 0) goto L_0x003b;
    L_0x00d2:
        r0.putExtras(r1);
        goto L_0x003b;
    L_0x00d7:
        r1 = r4;
        goto L_0x0094;
    L_0x00d9:
        r1 = r4;
        goto L_0x00a4;
    L_0x00db:
        r0 = r10.f9195i;
        r1 = r10.f9195i;
        r6 = r10.f9188b;
        r7 = r11.f;
        r7 = r7.g;
        r6 = r6.mo2715c(r7);
        r1 = r1.getString(r6);
        r0 = android.widget.Toast.makeText(r0, r1, r4);
        r0.show();
        r0 = r10.f9188b;
        r1 = r10.f9188b;
        r6 = r11.f;
        r6 = r6.g;
        r1 = r1.mo2693a(r6);
        r6 = r11.f;
        r6 = r6.d;
        r0 = r0.mo2691a(r1, r6);
        goto L_0x003b;
    L_0x010a:
        r0 = r10.f9187a;
        r1 = r10.f9195i;
        r4 = r11.e;
        r5 = r10.f9191e;
        r0 = r0.mo2745a(r1, r4, r5);
        goto L_0x0058;
    L_0x0118:
        r0 = r1;
        goto L_0x003b;
    L_0x011b:
        r0 = r4;
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.b.n.a(com.google.wireless.android.finsky.dfe.c.a.bt):void");
    }

    final void m9719a(Throwable th) {
        if (this.f9197k.mo2294a(12604323)) {
            C2474c c2474c = new C2474c(1105);
            c2474c.m13238a(th);
            this.f9191e.m13367a(c2474c);
        }
    }
}
