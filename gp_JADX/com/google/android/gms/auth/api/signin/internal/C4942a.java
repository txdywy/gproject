package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.support.v4.app.bx;
import android.support.v4.p028a.C0211f;
import com.google.android.gms.common.api.C5058o;

final class C4942a implements bx {
    public /* synthetic */ SignInHubActivity f25407a;

    C4942a(SignInHubActivity signInHubActivity) {
        this.f25407a = signInHubActivity;
    }

    public final C0211f mo969a(int i, Bundle bundle) {
        return new C4946c(this.f25407a, C5058o.m23308a());
    }

    public final /* synthetic */ void mo972a(C0211f c0211f, Object obj) {
        this.f25407a.setResult(this.f25407a.f25405r, this.f25407a.f25406s);
        this.f25407a.finish();
    }

    public final void mo973b() {
    }
}
