package com.google.android.gms.internal;

public class uv extends tz {
    public final uu f27262a;
    public uu f27263b;
    public boolean f27264c = false;

    protected uv(uu uuVar) {
        this.f27262a = uuVar;
        this.f27263b = (uu) uuVar.mo4849a(vb.f27555e, null, null);
    }

    private static void m25311a(uu uuVar, uu uuVar2) {
        Object obj = va.f27550a;
        uuVar.mo4849a(vb.f27552b, obj, (Object) uuVar2);
        uuVar.f27255h = obj.mo4933a(uuVar.f27255h, uuVar2.f27255h);
    }

    public final /* synthetic */ tz mo4853a() {
        return (uv) clone();
    }

    protected final /* synthetic */ tz mo4854a(ty tyVar) {
        return m25314a((uu) tyVar);
    }

    public final uv m25314a(uu uuVar) {
        m25315b();
        m25311a(this.f27263b, uuVar);
        return this;
    }

    protected final void m25315b() {
        if (this.f27264c) {
            uu uuVar = (uu) this.f27263b.mo4849a(vb.f27555e, null, null);
            m25311a(uuVar, this.f27263b);
            this.f27263b = uuVar;
            this.f27264c = false;
        }
    }

    public final uu m25316c() {
        if (this.f27264c) {
            return this.f27263b;
        }
        this.f27263b.mo4849a(vb.f27554d, null, null);
        this.f27264c = true;
        return this.f27263b;
    }

    public final /* synthetic */ vk mo4848h() {
        return this.f27262a;
    }

    public final uu m25317d() {
        uu uuVar;
        boolean z = true;
        if (this.f27264c) {
            uuVar = this.f27263b;
        } else {
            this.f27263b.mo4849a(vb.f27554d, null, null);
            this.f27264c = true;
            uuVar = this.f27263b;
        }
        uuVar = uuVar;
        if (uuVar.mo4849a(vb.f27551a, Boolean.TRUE, null) == null) {
            z = false;
        }
        if (z) {
            return uuVar;
        }
        throw new zzfxz();
    }

    public final /* synthetic */ vk mo4856e() {
        uu uuVar;
        boolean z = true;
        if (this.f27264c) {
            uuVar = this.f27263b;
        } else {
            this.f27263b.mo4849a(vb.f27554d, null, null);
            this.f27264c = true;
            uuVar = this.f27263b;
        }
        uuVar = uuVar;
        if (uuVar.mo4849a(vb.f27551a, Boolean.TRUE, null) == null) {
            z = false;
        }
        if (z) {
            return uuVar;
        }
        throw new zzfxz();
    }

    public /* synthetic */ Object clone() {
        uu uuVar;
        uv uvVar = (uv) this.f27262a.mo4849a(vb.f27556f, null, null);
        if (this.f27264c) {
            uuVar = this.f27263b;
        } else {
            this.f27263b.mo4849a(vb.f27554d, null, null);
            this.f27264c = true;
            uuVar = this.f27263b;
        }
        uvVar.m25314a(uuVar);
        return uvVar;
    }
}
