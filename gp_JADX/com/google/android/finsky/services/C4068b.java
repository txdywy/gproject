package com.google.android.finsky.services;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import java.util.concurrent.Semaphore;

final class C4068b implements Runnable {
    public final /* synthetic */ cv f20427a;
    public final /* synthetic */ Account f20428b;
    public final /* synthetic */ DfeToc f20429c;
    public final /* synthetic */ String f20430d;
    public final /* synthetic */ C2482j f20431e;
    public final /* synthetic */ Bundle f20432f;
    public final /* synthetic */ Semaphore f20433g;
    public final /* synthetic */ C4067a f20434h;

    C4068b(C4067a c4067a, cv cvVar, Account account, DfeToc dfeToc, String str, C2482j c2482j, Bundle bundle, Semaphore semaphore) {
        this.f20434h = c4067a;
        this.f20427a = cvVar;
        this.f20428b = account;
        this.f20429c = dfeToc;
        this.f20430d = str;
        this.f20431e = c2482j;
        this.f20432f = bundle;
        this.f20433g = semaphore;
    }

    public final void run() {
        DetailsService.m18991a(this.f20434h.f20426a, new Document(this.f20427a), this.f20428b, this.f20429c, this.f20430d, this.f20431e, this.f20434h.f20426a.f20416a, this.f20432f);
        this.f20433g.release();
    }
}
