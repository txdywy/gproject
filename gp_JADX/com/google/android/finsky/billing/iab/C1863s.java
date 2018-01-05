package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.android.vending.p056b.C0637h;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bk;
import com.google.wireless.android.a.a.a.a.bl;

final class C1863s extends C0637h {
    public final /* synthetic */ InAppBillingService f9543a;

    C1863s(InAppBillingService inAppBillingService) {
        this.f9543a = inAppBillingService;
    }

    public final int mo2478a(int i, String str, String str2) {
        int i2;
        InAppBillingService inAppBillingService;
        Throwable e;
        Account account = null;
        Long l;
        try {
            C1864t a = m9964a(str, null);
            l = a.f9545b;
            try {
                C1868x c1868x = a.f9547d;
                if (c1868x != C1868x.RESULT_OK) {
                    i2 = c1868x.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                } else {
                    account = a.f9544a;
                    InAppBillingService inAppBillingService2 = this.f9543a;
                    i2 = inAppBillingService2.f9492j.mo2475a(account.name, inAppBillingService2.m9915a(str)).m9935a(i, str2, null);
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    this.f9543a.m9910a(account, e, str, 621);
                    i2 = InAppBillingService.f9484b.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    return i2;
                } catch (Throwable th) {
                    e = th;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            l = null;
            this.f9543a.m9910a(account, e, str, 621);
            i2 = InAppBillingService.f9484b.f9566l;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            return i2;
        } catch (Throwable th2) {
            e = th2;
            l = null;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            throw e;
        }
        return i2;
    }

    public final Bundle mo2479a(int i, String str, String str2, Bundle bundle) {
        Long l;
        C1867w c1867w;
        Bundle a;
        Throwable e;
        Account account = null;
        InAppBillingService inAppBillingService;
        try {
            C1864t a2 = m9964a(str, null);
            l = a2.f9545b;
            try {
                C1868x c1868x = a2.f9547d;
                if (c1868x != C1868x.RESULT_OK) {
                    c1867w = this.f9543a.f9486d;
                    a = C1867w.m9980a(c1868x);
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                } else {
                    Account account2 = a2.f9544a;
                    if (bundle != null) {
                        account = bundle.getString("libraryVersion");
                    }
                    if (account == null) {
                        try {
                            if (this.f9543a.f9490h) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putString("libraryVersion", "dp-1");
                            }
                        } catch (Exception e2) {
                            e = e2;
                            account = account2;
                            try {
                                this.f9543a.m9910a(account, e, str, 622);
                                c1867w = this.f9543a.f9486d;
                                a = C1867w.m9980a(InAppBillingService.f9484b);
                                inAppBillingService = this.f9543a;
                                if (l != null) {
                                    inAppBillingService.f9491i.mo2473a(l.longValue());
                                }
                                return a;
                            } catch (Throwable th) {
                                e = th;
                                inAppBillingService = this.f9543a;
                                if (l != null) {
                                    inAppBillingService.f9491i.mo2473a(l.longValue());
                                }
                                throw e;
                            }
                        }
                    }
                    InAppBillingService inAppBillingService2 = this.f9543a;
                    a = inAppBillingService2.f9492j.mo2475a(account2.name, inAppBillingService2.m9915a(str)).m9937a(i, str, str2, bundle);
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                }
            } catch (Exception e3) {
                e = e3;
                this.f9543a.m9910a(account, e, str, 622);
                c1867w = this.f9543a.f9486d;
                a = C1867w.m9980a(InAppBillingService.f9484b);
                inAppBillingService = this.f9543a;
                if (l != null) {
                    inAppBillingService.f9491i.mo2473a(l.longValue());
                }
                return a;
            }
        } catch (Exception e4) {
            e = e4;
            l = null;
            this.f9543a.m9910a(account, e, str, 622);
            c1867w = this.f9543a.f9486d;
            a = C1867w.m9980a(InAppBillingService.f9484b);
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            return a;
        } catch (Throwable th2) {
            e = th2;
            l = null;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            throw e;
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo2482a(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
        r9 = this;
        r1 = 0;
        r0 = 0;
        r2 = r9.m9964a(r11, r0);	 Catch:{ Exception -> 0x004d, all -> 0x006e }
        r7 = r2.f9545b;	 Catch:{ Exception -> 0x004d, all -> 0x006e }
        r0 = r2.f9547d;	 Catch:{ Exception -> 0x0083, all -> 0x007e }
        r3 = com.google.android.finsky.billing.iab.C1868x.RESULT_OK;	 Catch:{ Exception -> 0x0083, all -> 0x007e }
        if (r0 == r3) goto L_0x0024;
    L_0x000e:
        r2 = r9.f9543a;	 Catch:{ Exception -> 0x0083, all -> 0x007e }
        r2 = r2.f9486d;	 Catch:{ Exception -> 0x0083, all -> 0x007e }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r0);	 Catch:{ Exception -> 0x0083, all -> 0x007e }
        r1 = r9.f9543a;
        if (r7 == 0) goto L_0x0023;
    L_0x001a:
        r1 = r1.f9491i;
        r2 = r7.longValue();
        r1.mo2473a(r2);
    L_0x0023:
        return r0;
    L_0x0024:
        r8 = r2.f9544a;	 Catch:{ Exception -> 0x0083, all -> 0x007e }
        r0 = r9.f9543a;	 Catch:{ Exception -> 0x0087, all -> 0x007e }
        r1 = r0.f9492j;	 Catch:{ Exception -> 0x0087, all -> 0x007e }
        r3 = r8.name;	 Catch:{ Exception -> 0x0087, all -> 0x007e }
        r0 = r0.m9915a(r11);	 Catch:{ Exception -> 0x0087, all -> 0x007e }
        r0 = r1.mo2475a(r3, r0);	 Catch:{ Exception -> 0x0087, all -> 0x007e }
        r6 = r2.f9546c;	 Catch:{ Exception -> 0x0087, all -> 0x007e }
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r4 = r13;
        r5 = r14;
        r0 = r0.m9939a(r1, r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x0087, all -> 0x007e }
        r1 = r9.f9543a;
        if (r7 == 0) goto L_0x0023;
    L_0x0043:
        r1 = r1.f9491i;
        r2 = r7.longValue();
        r1.mo2473a(r2);
        goto L_0x0023;
    L_0x004d:
        r0 = move-exception;
        r2 = r1;
    L_0x004f:
        r3 = r9.f9543a;	 Catch:{ all -> 0x0080 }
        r4 = 623; // 0x26f float:8.73E-43 double:3.08E-321;
        r3.m9910a(r2, r0, r11, r4);	 Catch:{ all -> 0x0080 }
        r0 = r9.f9543a;	 Catch:{ all -> 0x0080 }
        r0 = r0.f9486d;	 Catch:{ all -> 0x0080 }
        r0 = com.google.android.finsky.billing.iab.InAppBillingService.f9484b;	 Catch:{ all -> 0x0080 }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r0);	 Catch:{ all -> 0x0080 }
        r2 = r9.f9543a;
        if (r1 == 0) goto L_0x0023;
    L_0x0064:
        r2 = r2.f9491i;
        r4 = r1.longValue();
        r2.mo2473a(r4);
        goto L_0x0023;
    L_0x006e:
        r0 = move-exception;
        r7 = r1;
    L_0x0070:
        r1 = r9.f9543a;
        if (r7 == 0) goto L_0x007d;
    L_0x0074:
        r1 = r1.f9491i;
        r2 = r7.longValue();
        r1.mo2473a(r2);
    L_0x007d:
        throw r0;
    L_0x007e:
        r0 = move-exception;
        goto L_0x0070;
    L_0x0080:
        r0 = move-exception;
        r7 = r1;
        goto L_0x0070;
    L_0x0083:
        r0 = move-exception;
        r2 = r1;
        r1 = r7;
        goto L_0x004f;
    L_0x0087:
        r0 = move-exception;
        r1 = r7;
        r2 = r8;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.iab.s.a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo2480a(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
        r8 = this;
        r1 = 0;
        r0 = 0;
        r0 = r8.m9964a(r10, r0);	 Catch:{ Exception -> 0x004b, all -> 0x006c }
        r6 = r0.f9545b;	 Catch:{ Exception -> 0x004b, all -> 0x006c }
        r2 = r0.f9547d;	 Catch:{ Exception -> 0x0081, all -> 0x007c }
        r3 = com.google.android.finsky.billing.iab.C1868x.RESULT_OK;	 Catch:{ Exception -> 0x0081, all -> 0x007c }
        if (r2 == r3) goto L_0x0024;
    L_0x000e:
        r0 = r8.f9543a;	 Catch:{ Exception -> 0x0081, all -> 0x007c }
        r0 = r0.f9486d;	 Catch:{ Exception -> 0x0081, all -> 0x007c }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r2);	 Catch:{ Exception -> 0x0081, all -> 0x007c }
        r1 = r8.f9543a;
        if (r6 == 0) goto L_0x0023;
    L_0x001a:
        r1 = r1.f9491i;
        r2 = r6.longValue();
        r1.mo2473a(r2);
    L_0x0023:
        return r0;
    L_0x0024:
        r7 = r0.f9544a;	 Catch:{ Exception -> 0x0081, all -> 0x007c }
        r0 = r8.f9543a;	 Catch:{ Exception -> 0x0085, all -> 0x007c }
        r1 = r0.f9492j;	 Catch:{ Exception -> 0x0085, all -> 0x007c }
        r2 = r7.name;	 Catch:{ Exception -> 0x0085, all -> 0x007c }
        r0 = r0.m9915a(r10);	 Catch:{ Exception -> 0x0085, all -> 0x007c }
        r0 = r1.mo2475a(r2, r0);	 Catch:{ Exception -> 0x0085, all -> 0x007c }
        r5 = 0;
        r1 = r9;
        r2 = r10;
        r3 = r11;
        r4 = r12;
        r0 = r0.m9938a(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x0085, all -> 0x007c }
        r1 = r8.f9543a;
        if (r6 == 0) goto L_0x0023;
    L_0x0041:
        r1 = r1.f9491i;
        r2 = r6.longValue();
        r1.mo2473a(r2);
        goto L_0x0023;
    L_0x004b:
        r0 = move-exception;
        r2 = r1;
    L_0x004d:
        r3 = r8.f9543a;	 Catch:{ all -> 0x007e }
        r4 = 624; // 0x270 float:8.74E-43 double:3.083E-321;
        r3.m9910a(r2, r0, r10, r4);	 Catch:{ all -> 0x007e }
        r0 = r8.f9543a;	 Catch:{ all -> 0x007e }
        r0 = r0.f9486d;	 Catch:{ all -> 0x007e }
        r0 = com.google.android.finsky.billing.iab.InAppBillingService.f9484b;	 Catch:{ all -> 0x007e }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r0);	 Catch:{ all -> 0x007e }
        r2 = r8.f9543a;
        if (r1 == 0) goto L_0x0023;
    L_0x0062:
        r2 = r2.f9491i;
        r4 = r1.longValue();
        r2.mo2473a(r4);
        goto L_0x0023;
    L_0x006c:
        r0 = move-exception;
        r6 = r1;
    L_0x006e:
        r1 = r8.f9543a;
        if (r6 == 0) goto L_0x007b;
    L_0x0072:
        r1 = r1.f9491i;
        r2 = r6.longValue();
        r1.mo2473a(r2);
    L_0x007b:
        throw r0;
    L_0x007c:
        r0 = move-exception;
        goto L_0x006e;
    L_0x007e:
        r0 = move-exception;
        r6 = r1;
        goto L_0x006e;
    L_0x0081:
        r0 = move-exception;
        r2 = r1;
        r1 = r6;
        goto L_0x004d;
    L_0x0085:
        r0 = move-exception;
        r1 = r6;
        r2 = r7;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.iab.s.a(int, java.lang.String, java.lang.String, java.lang.String):android.os.Bundle");
    }

    public final int mo2485b(int i, String str, String str2) {
        Long l;
        int i2;
        Throwable e;
        Account account = null;
        InAppBillingService inAppBillingService;
        try {
            C1864t a = m9964a(str, null);
            l = a.f9545b;
            try {
                C1868x c1868x = a.f9547d;
                if (c1868x != C1868x.RESULT_OK) {
                    i2 = c1868x.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                } else {
                    account = a.f9544a;
                    InAppBillingService inAppBillingService2 = this.f9543a;
                    i2 = inAppBillingService2.f9492j.mo2475a(account.name, inAppBillingService2.m9915a(str)).m9949b(i, str, str2, null);
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    this.f9543a.m9910a(account, e, str, 625);
                    i2 = InAppBillingService.f9484b.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    return i2;
                } catch (Throwable th) {
                    e = th;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            l = null;
            this.f9543a.m9910a(account, e, str, 625);
            i2 = InAppBillingService.f9484b.f9566l;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            return i2;
        } catch (Throwable th2) {
            e = th2;
            l = null;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            throw e;
        }
        return i2;
    }

    public final int mo2477a() {
        return C1868x.RESULT_ERROR.f9566l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo2484a(int r11, java.lang.String r12, java.util.List r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
        r10 = this;
        r1 = 0;
        r0 = 0;
        r2 = 0;
        r2 = r10.m9964a(r12, r2);	 Catch:{ Exception -> 0x0054, all -> 0x0088 }
        r8 = r2.f9545b;	 Catch:{ Exception -> 0x0054, all -> 0x0088 }
        r0 = r2.f9547d;	 Catch:{ Exception -> 0x009e, all -> 0x0099 }
        r3 = com.google.android.finsky.billing.iab.C1868x.RESULT_OK;	 Catch:{ Exception -> 0x009e, all -> 0x0099 }
        if (r0 == r3) goto L_0x0025;
    L_0x000f:
        r2 = r10.f9543a;	 Catch:{ Exception -> 0x009e, all -> 0x0099 }
        r2 = r2.f9486d;	 Catch:{ Exception -> 0x009e, all -> 0x0099 }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r0);	 Catch:{ Exception -> 0x009e, all -> 0x0099 }
        r1 = r10.f9543a;
        if (r8 == 0) goto L_0x0024;
    L_0x001b:
        r1 = r1.f9491i;
        r2 = r8.longValue();
        r1.mo2473a(r2);
    L_0x0024:
        return r0;
    L_0x0025:
        r9 = r2.f9544a;	 Catch:{ Exception -> 0x009e, all -> 0x0099 }
        r0 = r10.f9543a;	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r1 = r0.f9492j;	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r3 = r9.name;	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r0 = r0.m9915a(r12);	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r0 = r1.mo2475a(r3, r0);	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r1 = r2.f9546c;	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r7 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r1 = r11;
        r2 = r12;
        r3 = r13;
        r4 = r14;
        r5 = r15;
        r6 = r16;
        r0 = r0.m9940a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x00a1, all -> 0x0099 }
        r1 = r10.f9543a;
        if (r8 == 0) goto L_0x0024;
    L_0x004a:
        r1 = r1.f9491i;
        r2 = r8.longValue();
        r1.mo2473a(r2);
        goto L_0x0024;
    L_0x0054:
        r2 = move-exception;
        r6 = r0;
    L_0x0056:
        r5 = new com.google.wireless.android.a.a.a.a.bk;	 Catch:{ all -> 0x009b }
        r5.<init>();	 Catch:{ all -> 0x009b }
        r0 = new com.google.wireless.android.a.a.a.a.bj;	 Catch:{ all -> 0x009b }
        r0.<init>();	 Catch:{ all -> 0x009b }
        r5.a = r0;	 Catch:{ all -> 0x009b }
        r0 = r5.a;	 Catch:{ all -> 0x009b }
        r3 = 2;
        r0.a(r3);	 Catch:{ all -> 0x009b }
        r0 = r10.f9543a;	 Catch:{ all -> 0x009b }
        r4 = 623; // 0x26f float:8.73E-43 double:3.08E-321;
        r3 = r12;
        r0.m9911a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x009b }
        r0 = r10.f9543a;	 Catch:{ all -> 0x009b }
        r0 = r0.f9486d;	 Catch:{ all -> 0x009b }
        r0 = com.google.android.finsky.billing.iab.InAppBillingService.f9484b;	 Catch:{ all -> 0x009b }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r0);	 Catch:{ all -> 0x009b }
        r1 = r10.f9543a;
        if (r6 == 0) goto L_0x0024;
    L_0x007e:
        r1 = r1.f9491i;
        r2 = r6.longValue();
        r1.mo2473a(r2);
        goto L_0x0024;
    L_0x0088:
        r1 = move-exception;
        r8 = r0;
        r0 = r1;
    L_0x008b:
        r1 = r10.f9543a;
        if (r8 == 0) goto L_0x0098;
    L_0x008f:
        r1 = r1.f9491i;
        r2 = r8.longValue();
        r1.mo2473a(r2);
    L_0x0098:
        throw r0;
    L_0x0099:
        r0 = move-exception;
        goto L_0x008b;
    L_0x009b:
        r0 = move-exception;
        r8 = r6;
        goto L_0x008b;
    L_0x009e:
        r2 = move-exception;
        r6 = r8;
        goto L_0x0056;
    L_0x00a1:
        r2 = move-exception;
        r6 = r8;
        r1 = r9;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.iab.s.a(int, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo2483a(int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, android.os.Bundle r30) {
        /*
        r24 = this;
        r5 = 0;
        r4 = 0;
        r0 = r24;
        r1 = r26;
        r2 = r30;
        r6 = r0.m9964a(r1, r2);	 Catch:{ Exception -> 0x0290, all -> 0x0285 }
        r0 = r6.f9545b;	 Catch:{ Exception -> 0x0290, all -> 0x0285 }
        r20 = r0;
        r4 = r6.f9547d;	 Catch:{ Exception -> 0x0294, all -> 0x011a }
        r7 = com.google.android.finsky.billing.iab.C1868x.RESULT_OK;	 Catch:{ Exception -> 0x0294, all -> 0x011a }
        if (r4 == r7) goto L_0x0030;
    L_0x0016:
        r0 = r24;
        r6 = r0.f9543a;	 Catch:{ Exception -> 0x0294, all -> 0x011a }
        r6 = r6.f9486d;	 Catch:{ Exception -> 0x0294, all -> 0x011a }
        r4 = com.google.android.finsky.billing.iab.C1867w.m9980a(r4);	 Catch:{ Exception -> 0x0294, all -> 0x011a }
        r0 = r24;
        r5 = r0.f9543a;
        if (r20 == 0) goto L_0x002f;
    L_0x0026:
        r5 = r5.f9491i;
        r6 = r20.longValue();
        r5.mo2473a(r6);
    L_0x002f:
        return r4;
    L_0x0030:
        r0 = r6.f9544a;	 Catch:{ Exception -> 0x0294, all -> 0x011a }
        r21 = r0;
        r0 = r24;
        r4 = r0.f9543a;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = r4.f9492j;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r21;
        r7 = r0.name;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r26;
        r4 = r4.m9915a(r0);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r23 = r5.mo2475a(r7, r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r6 = r6.f9546c;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r30 != 0) goto L_0x0087;
    L_0x004c:
        r4 = 0;
        r22 = r4;
    L_0x004f:
        r19 = new android.os.Bundle;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r19.<init>();	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r23;
        r1 = r25;
        r4 = r0.m9941a(r1);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_OK;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 == r5) goto L_0x0092;
    L_0x0060:
        r5 = "RESPONSE_CODE";
        r4 = r4.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r5, r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
    L_0x0075:
        r0 = r24;
        r4 = r0.f9543a;
        if (r20 == 0) goto L_0x0084;
    L_0x007b:
        r4 = r4.f9491i;
        r6 = r20.longValue();
        r4.mo2473a(r6);
    L_0x0084:
        r4 = r19;
        goto L_0x002f;
    L_0x0087:
        r4 = "libraryVersion";
        r0 = r30;
        r4 = r0.getString(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r22 = r4;
        goto L_0x004f;
    L_0x0092:
        r4 = 6;
        r0 = r25;
        if (r0 >= r4) goto L_0x00f6;
    L_0x0097:
        r4 = "Input Error: getBuyIntentExtraParams was introduced in API version 6.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        com.google.android.finsky.utils.FinskyLog.m21665c(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "RESPONSE_CODE";
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_DEVELOPER_ERROR;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = r5.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x00b7:
        r6 = move-exception;
        r10 = r20;
        r5 = r21;
    L_0x00bc:
        r9 = new com.google.wireless.android.a.a.a.a.bk;	 Catch:{ all -> 0x028b }
        r9.<init>();	 Catch:{ all -> 0x028b }
        r4 = new com.google.wireless.android.a.a.a.a.bj;	 Catch:{ all -> 0x028b }
        r4.<init>();	 Catch:{ all -> 0x028b }
        r9.a = r4;	 Catch:{ all -> 0x028b }
        r4 = r9.a;	 Catch:{ all -> 0x028b }
        r7 = 3;
        r4.a(r7);	 Catch:{ all -> 0x028b }
        r0 = r24;
        r4 = r0.f9543a;	 Catch:{ all -> 0x028b }
        r8 = 623; // 0x26f float:8.73E-43 double:3.08E-321;
        r7 = r26;
        r4.m9911a(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x028b }
        r0 = r24;
        r4 = r0.f9543a;	 Catch:{ all -> 0x028b }
        r4 = r4.f9486d;	 Catch:{ all -> 0x028b }
        r4 = com.google.android.finsky.billing.iab.InAppBillingService.f9484b;	 Catch:{ all -> 0x028b }
        r4 = com.google.android.finsky.billing.iab.C1867w.m9980a(r4);	 Catch:{ all -> 0x028b }
        r0 = r24;
        r5 = r0.f9543a;
        if (r10 == 0) goto L_0x002f;
    L_0x00eb:
        r5 = r5.f9491i;
        r6 = r10.longValue();
        r5.mo2473a(r6);
        goto L_0x002f;
    L_0x00f6:
        r4 = 0;
        r0 = r23;
        r1 = r28;
        r4 = r0.m9942a(r1, r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_OK;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 == r5) goto L_0x012b;
    L_0x0103:
        r5 = "RESPONSE_CODE";
        r4 = r4.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r5, r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x011a:
        r4 = move-exception;
    L_0x011b:
        r0 = r24;
        r5 = r0.f9543a;
        if (r20 == 0) goto L_0x012a;
    L_0x0121:
        r5 = r5.f9491i;
        r6 = r20.longValue();
        r5.mo2473a(r6);
    L_0x012a:
        throw r4;
    L_0x012b:
        r4 = android.text.TextUtils.isEmpty(r27);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 == 0) goto L_0x0152;
    L_0x0131:
        r4 = "Input Error: Non empty/null argument expected for sku.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        com.google.android.finsky.utils.FinskyLog.m21665c(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "RESPONSE_CODE";
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_DEVELOPER_ERROR;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = r5.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x0152:
        r0 = r23;
        r1 = r28;
        r2 = r27;
        r3 = r26;
        r4 = r0.m9948a(r1, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 == 0) goto L_0x0179;
    L_0x0160:
        r4 = "RESPONSE_CODE";
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_ITEM_ALREADY_OWNED;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = r5.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x0179:
        r8 = 0;
        r12 = 0;
        r13 = 0;
        r16 = 1;
        r18 = 0;
        if (r30 == 0) goto L_0x022b;
    L_0x0182:
        r4 = r30.isEmpty();	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 != 0) goto L_0x022b;
    L_0x0188:
        r4 = "vr";
        r0 = r30;
        r4 = r0.containsKey(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 == 0) goto L_0x01b8;
    L_0x0192:
        r4 = 7;
        r0 = r25;
        if (r0 >= r4) goto L_0x01b8;
    L_0x0197:
        r4 = "Input Error: VR mode purchase was introduced in API version 7.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        com.google.android.finsky.utils.FinskyLog.m21665c(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "RESPONSE_CODE";
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_DEVELOPER_ERROR;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = r5.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x01b8:
        r4 = "isDynamicSku";
        r5 = 0;
        r0 = r30;
        r4 = r0.getBoolean(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 != 0) goto L_0x01f2;
    L_0x01c3:
        r16 = 1;
    L_0x01c5:
        r4 = "vr";
        r0 = r30;
        r13 = r0.getBoolean(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r13 == 0) goto L_0x01f5;
    L_0x01cf:
        r4 = "subs";
        r0 = r28;
        r4 = android.text.TextUtils.equals(r0, r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 == 0) goto L_0x01f5;
    L_0x01d9:
        r4 = "RESPONSE_CODE";
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_BILLING_UNAVAILABLE;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = r5.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x01f2:
        r16 = 0;
        goto L_0x01c5;
    L_0x01f5:
        r4 = "skusToReplace";
        r0 = r30;
        r8 = r0.getStringArrayList(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "skusToReplace";
        r0 = r30;
        r0.remove(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "vr";
        r0 = r30;
        r0.remove(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "isDynamicSku";
        r0 = r30;
        r0.remove(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "libraryVersion";
        r0 = r30;
        r0.remove(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = "skuPackageName";
        r0 = r30;
        r18 = r0.getString(r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = r30.isEmpty();	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 != 0) goto L_0x022b;
    L_0x0227:
        r12 = com.google.android.finsky.billing.iab.C1849e.m9934a(r30);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
    L_0x022b:
        r0 = r23;
        r4 = r0.f9507l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r23;
        r5 = r0.f9500e;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r23;
        r14 = r0.f9502g;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r15 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r17 = 1;
        r6 = r25;
        r7 = r26;
        r9 = r27;
        r10 = r28;
        r11 = r29;
        r4 = r4.m9992a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 != 0) goto L_0x0266;
    L_0x024d:
        r4 = "RESPONSE_CODE";
        r5 = com.google.android.finsky.billing.iab.C1868x.RESULT_ERROR;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = r5.f9566l;	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r0 = r19;
        r0.putInt(r4, r5);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r4 = 1;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r4, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x0266:
        r0 = r23;
        r1 = r19;
        r4 = r0.m9936a(r1, r4);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        r5 = 3;
        r0 = r23;
        r1 = r19;
        r2 = r26;
        r3 = r22;
        r0.m9944a(r1, r5, r2, r3);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        if (r4 == 0) goto L_0x0075;
    L_0x027c:
        r0 = r23;
        r1 = r19;
        r0.m9943a(r4, r1);	 Catch:{ Exception -> 0x00b7, all -> 0x011a }
        goto L_0x0075;
    L_0x0285:
        r5 = move-exception;
        r20 = r4;
        r4 = r5;
        goto L_0x011b;
    L_0x028b:
        r4 = move-exception;
        r20 = r10;
        goto L_0x011b;
    L_0x0290:
        r6 = move-exception;
        r10 = r4;
        goto L_0x00bc;
    L_0x0294:
        r6 = move-exception;
        r10 = r20;
        goto L_0x00bc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.iab.s.a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final Bundle mo2481a(int i, String str, String str2, String str3, Bundle bundle) {
        Long l;
        Bundle a;
        InAppBillingService inAppBillingService;
        Throwable e;
        Account account;
        bk bkVar;
        C1867w c1867w;
        Throwable th;
        try {
            C1864t a2 = m9964a(str, bundle);
            l = a2.f9545b;
            try {
                C1868x c1868x = a2.f9547d;
                if (c1868x != C1868x.RESULT_OK) {
                    C1867w c1867w2 = this.f9543a.f9486d;
                    a = C1867w.m9980a(c1868x);
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                } else {
                    Account account2 = a2.f9544a;
                    try {
                        InAppBillingService inAppBillingService2 = this.f9543a;
                        a = inAppBillingService2.f9492j.mo2475a(account2.name, inAppBillingService2.m9915a(str)).m9950b(i, str, str2, str3, bundle);
                        inAppBillingService = this.f9543a;
                        if (l != null) {
                            inAppBillingService.f9491i.mo2473a(l.longValue());
                        }
                    } catch (Exception e2) {
                        e = e2;
                        account = account2;
                        try {
                            bkVar = new bk();
                            bkVar.b = new bl();
                            bkVar.b.a(2);
                            this.f9543a.m9911a(account, e, str, 624, bkVar);
                            c1867w = this.f9543a.f9486d;
                            a = C1867w.m9980a(InAppBillingService.f9484b);
                            inAppBillingService = this.f9543a;
                            if (l != null) {
                                inAppBillingService.f9491i.mo2473a(l.longValue());
                            }
                            return a;
                        } catch (Throwable th2) {
                            th = th2;
                            inAppBillingService = this.f9543a;
                            if (l != null) {
                                inAppBillingService.f9491i.mo2473a(l.longValue());
                            }
                            throw th;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                account = null;
                bkVar = new bk();
                bkVar.b = new bl();
                bkVar.b.a(2);
                this.f9543a.m9911a(account, e, str, 624, bkVar);
                c1867w = this.f9543a.f9486d;
                a = C1867w.m9980a(InAppBillingService.f9484b);
                inAppBillingService = this.f9543a;
                if (l != null) {
                    inAppBillingService.f9491i.mo2473a(l.longValue());
                }
                return a;
            }
        } catch (Exception e4) {
            e = e4;
            l = null;
            account = null;
            bkVar = new bk();
            bkVar.b = new bl();
            bkVar.b.a(2);
            this.f9543a.m9911a(account, e, str, 624, bkVar);
            c1867w = this.f9543a.f9486d;
            a = C1867w.m9980a(InAppBillingService.f9484b);
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            return a;
        } catch (Throwable th3) {
            l = null;
            th = th3;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            throw th;
        }
        return a;
    }

    public final int mo2486b(int i, String str, String str2, Bundle bundle) {
        Long l;
        int i2;
        InAppBillingService inAppBillingService;
        Throwable e;
        Account account = null;
        try {
            C1864t a = m9964a(str, bundle);
            l = a.f9545b;
            try {
                C1868x c1868x = a.f9547d;
                if (c1868x != C1868x.RESULT_OK) {
                    i2 = c1868x.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                } else {
                    account = a.f9544a;
                    InAppBillingService inAppBillingService2 = this.f9543a;
                    i2 = inAppBillingService2.f9492j.mo2475a(account.name, inAppBillingService2.m9915a(str)).m9935a(i, str2, bundle);
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    this.f9543a.m9910a(account, e, str, 621);
                    i2 = InAppBillingService.f9484b.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    return i2;
                } catch (Throwable th) {
                    e = th;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            l = null;
            this.f9543a.m9910a(account, e, str, 621);
            i2 = InAppBillingService.f9484b.f9566l;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            return i2;
        } catch (Throwable th2) {
            e = th2;
            l = null;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            throw e;
        }
        return i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo2487b(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
        /*
        r8 = this;
        r1 = 0;
        r0 = r8.m9964a(r10, r13);	 Catch:{ Exception -> 0x004a, all -> 0x006b }
        r6 = r0.f9545b;	 Catch:{ Exception -> 0x004a, all -> 0x006b }
        r2 = r0.f9547d;	 Catch:{ Exception -> 0x0080, all -> 0x007b }
        r3 = com.google.android.finsky.billing.iab.C1868x.RESULT_OK;	 Catch:{ Exception -> 0x0080, all -> 0x007b }
        if (r2 == r3) goto L_0x0023;
    L_0x000d:
        r0 = r8.f9543a;	 Catch:{ Exception -> 0x0080, all -> 0x007b }
        r0 = r0.f9486d;	 Catch:{ Exception -> 0x0080, all -> 0x007b }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r2);	 Catch:{ Exception -> 0x0080, all -> 0x007b }
        r1 = r8.f9543a;
        if (r6 == 0) goto L_0x0022;
    L_0x0019:
        r1 = r1.f9491i;
        r2 = r6.longValue();
        r1.mo2473a(r2);
    L_0x0022:
        return r0;
    L_0x0023:
        r7 = r0.f9544a;	 Catch:{ Exception -> 0x0080, all -> 0x007b }
        r0 = r8.f9543a;	 Catch:{ Exception -> 0x0084, all -> 0x007b }
        r1 = r0.f9492j;	 Catch:{ Exception -> 0x0084, all -> 0x007b }
        r2 = r7.name;	 Catch:{ Exception -> 0x0084, all -> 0x007b }
        r0 = r0.m9915a(r10);	 Catch:{ Exception -> 0x0084, all -> 0x007b }
        r0 = r1.mo2475a(r2, r0);	 Catch:{ Exception -> 0x0084, all -> 0x007b }
        r1 = r9;
        r2 = r10;
        r3 = r11;
        r4 = r12;
        r5 = r13;
        r0 = r0.m9938a(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x0084, all -> 0x007b }
        r1 = r8.f9543a;
        if (r6 == 0) goto L_0x0022;
    L_0x0040:
        r1 = r1.f9491i;
        r2 = r6.longValue();
        r1.mo2473a(r2);
        goto L_0x0022;
    L_0x004a:
        r0 = move-exception;
        r2 = r1;
    L_0x004c:
        r3 = r8.f9543a;	 Catch:{ all -> 0x007d }
        r4 = 624; // 0x270 float:8.74E-43 double:3.083E-321;
        r3.m9910a(r2, r0, r10, r4);	 Catch:{ all -> 0x007d }
        r0 = r8.f9543a;	 Catch:{ all -> 0x007d }
        r0 = r0.f9486d;	 Catch:{ all -> 0x007d }
        r0 = com.google.android.finsky.billing.iab.InAppBillingService.f9484b;	 Catch:{ all -> 0x007d }
        r0 = com.google.android.finsky.billing.iab.C1867w.m9980a(r0);	 Catch:{ all -> 0x007d }
        r2 = r8.f9543a;
        if (r1 == 0) goto L_0x0022;
    L_0x0061:
        r2 = r2.f9491i;
        r4 = r1.longValue();
        r2.mo2473a(r4);
        goto L_0x0022;
    L_0x006b:
        r0 = move-exception;
        r6 = r1;
    L_0x006d:
        r1 = r8.f9543a;
        if (r6 == 0) goto L_0x007a;
    L_0x0071:
        r1 = r1.f9491i;
        r2 = r6.longValue();
        r1.mo2473a(r2);
    L_0x007a:
        throw r0;
    L_0x007b:
        r0 = move-exception;
        goto L_0x006d;
    L_0x007d:
        r0 = move-exception;
        r6 = r1;
        goto L_0x006d;
    L_0x0080:
        r0 = move-exception;
        r2 = r1;
        r1 = r6;
        goto L_0x004c;
    L_0x0084:
        r0 = move-exception;
        r1 = r6;
        r2 = r7;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.iab.s.b(int, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final int mo2488c(int i, String str, String str2, Bundle bundle) {
        Long l;
        int i2;
        InAppBillingService inAppBillingService;
        Throwable e;
        Account account = null;
        try {
            C1864t a = m9964a(str, bundle);
            l = a.f9545b;
            try {
                C1868x c1868x = a.f9547d;
                if (c1868x != C1868x.RESULT_OK) {
                    i2 = c1868x.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                } else {
                    account = a.f9544a;
                    InAppBillingService inAppBillingService2 = this.f9543a;
                    i2 = inAppBillingService2.f9492j.mo2475a(account.name, inAppBillingService2.m9915a(str)).m9949b(i, str, str2, bundle);
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    this.f9543a.m9910a(account, e, str, 625);
                    i2 = InAppBillingService.f9484b.f9566l;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    return i2;
                } catch (Throwable th) {
                    e = th;
                    inAppBillingService = this.f9543a;
                    if (l != null) {
                        inAppBillingService.f9491i.mo2473a(l.longValue());
                    }
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            l = null;
            this.f9543a.m9910a(account, e, str, 625);
            i2 = InAppBillingService.f9484b.f9566l;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            return i2;
        } catch (Throwable th2) {
            e = th2;
            l = null;
            inAppBillingService = this.f9543a;
            if (l != null) {
                inAppBillingService.f9491i.mo2473a(l.longValue());
            }
            throw e;
        }
        return i2;
    }

    private final C1864t m9964a(String str, Bundle bundle) {
        C1864t c1864t = new C1864t();
        c1864t.f9546c = this.f9543a.f9491i.mo2474b();
        Context context;
        C1867w c1867w;
        C1868x c1868x;
        C1552e dj;
        Object b;
        Pair pair;
        if (this.f9543a.f9485c.dj().mo2294a(12631549)) {
            context = this.f9543a;
            int i = c1864t.f9546c;
            c1867w = context.f9486d;
            c1864t.f9547d = C1867w.m9983a(str, context, i, context.f9485c.dj());
            if (c1864t.f9547d != C1868x.RESULT_OK) {
                return c1864t;
            }
            c1864t.f9545b = Long.valueOf(this.f9543a.f9491i.mo2472a());
            c1868x = InAppBillingService.f9483a;
            if (bundle == null) {
                c1864t.f9544a = this.f9543a.f9486d.m9995b(str);
            } else {
                context = this.f9543a;
                dj = this.f9543a.f9485c.dj();
                c1867w = context.f9486d;
                if (bundle == null || !bundle.containsKey("accountName")) {
                    b = c1867w.m9995b(str);
                    if (b == null) {
                        pair = new Pair(null, C1868x.RESULT_BILLING_UNAVAILABLE);
                    }
                    pair = new Pair(b, C1868x.RESULT_OK);
                } else if (C2744a.m14788a(context, str) || C1867w.m9989a(context, str, dj)) {
                    b = c1867w.f9553d.mo1183b(bundle.getString("accountName"));
                    if (b == null) {
                        pair = new Pair(null, C1868x.RESULT_BILLING_UNAVAILABLE);
                    } else {
                        bundle.remove("accountName");
                        pair = new Pair(b, C1868x.RESULT_OK);
                    }
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str);
                    pair = new Pair(null, C1868x.RESULT_DEVELOPER_ERROR);
                }
                c1864t.f9544a = (Account) pair.first;
                c1868x = (C1868x) pair.second;
            }
            if (c1864t.f9544a == null) {
                c1864t.f9547d = c1868x;
            }
        } else {
            c1864t.f9545b = Long.valueOf(this.f9543a.f9491i.mo2472a());
            c1868x = InAppBillingService.f9483a;
            if (bundle == null) {
                c1864t.f9544a = this.f9543a.f9486d.m9995b(str);
            } else {
                context = this.f9543a;
                dj = this.f9543a.f9485c.dj();
                c1867w = context.f9486d;
                if (bundle == null || !bundle.containsKey("accountName")) {
                    b = c1867w.m9995b(str);
                    if (b == null) {
                        pair = new Pair(null, C1868x.RESULT_BILLING_UNAVAILABLE);
                    }
                    pair = new Pair(b, C1868x.RESULT_OK);
                } else if (C2744a.m14788a(context, str) || C1867w.m9989a(context, str, dj)) {
                    b = c1867w.f9553d.mo1183b(bundle.getString("accountName"));
                    if (b == null) {
                        pair = new Pair(null, C1868x.RESULT_BILLING_UNAVAILABLE);
                    } else {
                        bundle.remove("accountName");
                        pair = new Pair(b, C1868x.RESULT_OK);
                    }
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str);
                    pair = new Pair(null, C1868x.RESULT_DEVELOPER_ERROR);
                }
                c1864t.f9544a = (Account) pair.first;
                c1868x = (C1868x) pair.second;
            }
            c1864t.f9547d = this.f9543a.m9914a(str, c1864t.f9544a, c1864t.f9546c);
            if (c1864t.f9547d != C1868x.RESULT_OK) {
                return c1864t;
            }
            if (c1864t.f9544a == null) {
                c1864t.f9547d = c1868x;
            }
        }
        return c1864t;
    }
}
