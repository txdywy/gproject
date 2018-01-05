package com.google.android.finsky.fastscroll;

import com.google.android.finsky.utils.ac;

public final class C3106e implements C3103b {
    public final C3103b f16057a;
    public final C3103b f16058b;

    public C3106e(C3103b c3103b, C3103b c3103b2) {
        this.f16057a = c3103b;
        this.f16058b = c3103b2;
    }

    public final boolean mo3316a() {
        return this.f16057a.mo3316a() || this.f16058b.mo3316a();
    }

    public final float mo3317b() {
        return C3106e.m15918b(this.f16057a) + C3106e.m15918b(this.f16058b);
    }

    public final float mo3319c() {
        return C3106e.m15916a(this.f16057a) + C3106e.m15916a(this.f16058b);
    }

    public final void mo3314a(float f) {
        Object obj = 1;
        float b = mo3317b() * f;
        if (this.f16057a.mo3316a()) {
            float b2 = C3106e.m15917b((b - C3106e.m15916a(this.f16058b)) / C3106e.m15918b(this.f16057a));
            this.f16057a.mo3314a(b2);
            if (!(b2 == 0.0f || b2 == 1.0f)) {
                obj = null;
            }
        }
        if (this.f16058b.mo3316a() && r0 != null) {
            this.f16058b.mo3314a(C3106e.m15917b((b - C3106e.m15916a(this.f16057a)) / C3106e.m15918b(this.f16058b)));
        }
    }

    public final void mo3320d() {
        this.f16057a.mo3320d();
        this.f16058b.mo3320d();
    }

    public final void mo3321e() {
        this.f16057a.mo3321e();
        this.f16058b.mo3321e();
    }

    public final void mo3315a(ac acVar) {
        if (this.f16057a.getClass().equals(this.f16058b.getClass())) {
            throw new UnsupportedOperationException("Cannot save instance state when the parent and the child are of the same type.");
        }
        this.f16057a.mo3315a(acVar);
        this.f16058b.mo3315a(acVar);
    }

    public final void mo3318b(ac acVar) {
        if (this.f16057a.getClass().equals(this.f16058b.getClass())) {
            throw new UnsupportedOperationException("Cannot restore instance state when the parent and the child are of the same type.");
        }
        this.f16057a.mo3318b(acVar);
        this.f16058b.mo3318b(acVar);
    }

    private static float m15918b(C3103b c3103b) {
        return c3103b.mo3316a() ? c3103b.mo3317b() : 0.0f;
    }

    static float m15916a(C3103b c3103b) {
        return c3103b.mo3316a() ? c3103b.mo3319c() : 0.0f;
    }

    private static float m15917b(float f) {
        return Math.min(1.0f, Math.max(0.0f, f));
    }
}
