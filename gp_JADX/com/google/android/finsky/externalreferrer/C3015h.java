package com.google.android.finsky.externalreferrer;

final class C3015h implements Runnable {
    public int f15795a;
    public final /* synthetic */ String f15796b;
    public final /* synthetic */ boolean f15797c;
    public final /* synthetic */ ExternalReferrerService f15798d;

    C3015h(ExternalReferrerService externalReferrerService, String str, boolean z) {
        this.f15798d = externalReferrerService;
        this.f15796b = str;
        this.f15797c = z;
    }

    public final void run() {
        this.f15795a++;
        if (this.f15795a == 2) {
            ExternalReferrerService externalReferrerService = this.f15798d;
            externalReferrerService.f15749e--;
            ((C3012d) this.f15798d.f15745a.mo1a()).m15598a(this.f15796b, this.f15797c);
            if (this.f15798d.f15749e <= 0) {
                this.f15798d.stopSelf(this.f15798d.f15748d);
            }
        }
    }
}
