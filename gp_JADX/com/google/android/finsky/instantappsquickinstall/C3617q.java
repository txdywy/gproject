package com.google.android.finsky.instantappsquickinstall;

import com.google.android.finsky.dfemodel.Document;

public final class C3617q {
    public int f17968a;
    public final ValidatedQuickInstallRequest f17969b;
    public Document f17970c;

    public static C3617q m17221a(QuickInstallState quickInstallState) {
        C3617q c3617q = new C3617q(quickInstallState.f17928b);
        c3617q.f17968a = quickInstallState.f17929c;
        c3617q.f17970c = quickInstallState.f17927a;
        return c3617q;
    }

    public C3617q(ValidatedQuickInstallRequest validatedQuickInstallRequest) {
        this.f17969b = validatedQuickInstallRequest;
    }

    public final QuickInstallState m17222a() {
        if (this.f17969b != null) {
            return new QuickInstallState(this.f17968a, this.f17969b, this.f17970c);
        }
        throw new IllegalStateException("Request cannot be null");
    }
}
