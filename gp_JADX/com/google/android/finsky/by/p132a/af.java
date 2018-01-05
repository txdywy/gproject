package com.google.android.finsky.by.p132a;

import android.accounts.Account;

final class af implements Runnable {
    public final /* synthetic */ Account f11011a;
    public final /* synthetic */ String[] f11012b;
    public final /* synthetic */ Runnable f11013c;
    public final /* synthetic */ String f11014d;
    public final /* synthetic */ ab f11015e;

    af(ab abVar, Account account, String[] strArr, Runnable runnable, String str) {
        this.f11015e = abVar;
        this.f11011a = account;
        this.f11012b = strArr;
        this.f11013c = runnable;
        this.f11014d = str;
    }

    public final void run() {
        synchronized (this.f11015e) {
            ((C2219r) this.f11015e.f11001f.get(this.f11011a)).m11628a(this.f11012b, this.f11013c, this.f11014d);
        }
    }
}
