package com.google.android.finsky.scheduler;

import com.google.android.finsky.p111d.C2495w;

final class au implements C4021p {
    public final /* synthetic */ int f20229a;
    public final /* synthetic */ C2495w f20230b;
    public final /* synthetic */ AlarmEngineService f20231c;
    public final /* synthetic */ ak f20232d;

    au(ak akVar, int i, C2495w c2495w, AlarmEngineService alarmEngineService) {
        this.f20232d = akVar;
        this.f20229a = i;
        this.f20230b = c2495w;
        this.f20231c = alarmEngineService;
    }

    public final void mo3888a() {
        this.f20232d.f20200a = null;
        this.f20232d.f20209j.m18907a(2522).m18893a(1, this.f20229a).m18900b(this.f20230b);
        this.f20232d.m18818c(this.f20229a);
        this.f20231c.stopSelf();
    }
}
