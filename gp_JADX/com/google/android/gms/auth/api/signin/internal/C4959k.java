package com.google.android.gms.auth.api.signin.internal;

public final class C4959k {
    public static int f25458a = 31;
    public int f25459b = 1;

    public final C4959k m23090a(Object obj) {
        this.f25459b = (obj == null ? 0 : obj.hashCode()) + (this.f25459b * f25458a);
        return this;
    }

    public final C4959k m23091a(boolean z) {
        this.f25459b = (z ? 1 : 0) + (this.f25459b * f25458a);
        return this;
    }
}
