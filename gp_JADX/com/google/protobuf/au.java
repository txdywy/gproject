package com.google.protobuf;

public class au extends C7199b {
    public final at f35182a;
    public at f35183b;
    public boolean f35184c = false;

    public au(at atVar) {
        this.f35182a = atVar;
        this.f35183b = (at) atVar.m32945a(ay.NEW_MUTABLE_INSTANCE, null, null);
    }

    public final void m32963b() {
        if (this.f35184c) {
            at atVar = (at) this.f35183b.m32945a(ay.NEW_MUTABLE_INSTANCE, null, null);
            m32959a(atVar, this.f35183b);
            this.f35183b = atVar;
            this.f35184c = false;
        }
    }

    public final boolean mo6118e() {
        return at.m32943a(this.f35183b, false);
    }

    public final au m32960a(at atVar) {
        m32963b();
        m32959a(this.f35183b, atVar);
        return this;
    }

    private static void m32959a(at atVar, at atVar2) {
        cu.f35284a.m33134a((Object) atVar).mo6161b(atVar, atVar2);
    }

    protected final /* synthetic */ C7199b mo6124a(C7196a c7196a) {
        return m32960a((at) c7196a);
    }

    public final /* synthetic */ C7199b mo6123a() {
        return (au) clone();
    }

    public final /* synthetic */ cf mo6125c() {
        if (this.f35184c) {
            return this.f35183b;
        }
        at atVar = this.f35183b;
        atVar.m32945a(ay.MAKE_IMMUTABLE, null, null);
        atVar.f35180h.f35370f = false;
        this.f35184c = true;
        return this.f35183b;
    }

    public final /* synthetic */ cf mo6127d() {
        at atVar;
        boolean z;
        boolean z2 = true;
        if (this.f35184c) {
            atVar = this.f35183b;
        } else {
            atVar = this.f35183b;
            atVar.m32945a(ay.MAKE_IMMUTABLE, null, null);
            atVar.f35180h.f35370f = false;
            this.f35184c = true;
            atVar = this.f35183b;
        }
        atVar = atVar;
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) atVar.m32945a(ay.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == (byte) 1) {
            z = true;
        } else if (byteValue == (byte) 0) {
            z = false;
        } else {
            if (atVar.m32945a(ay.IS_INITIALIZED, Boolean.FALSE, null) == null) {
                z2 = false;
            }
            if (booleanValue) {
                Object obj;
                ay ayVar = ay.SET_MEMOIZED_IS_INITIALIZED;
                if (z2) {
                    obj = atVar;
                } else {
                    obj = null;
                }
                atVar.m32945a(ayVar, obj, null);
            }
            z = z2;
        }
        if (z) {
            return atVar;
        }
        throw new UninitializedMessageException();
    }

    public final /* synthetic */ cf mo6121h() {
        return this.f35182a;
    }

    public /* synthetic */ Object clone() {
        at atVar;
        au auVar = (au) this.f35182a.m32945a(ay.NEW_BUILDER, null, null);
        if (this.f35184c) {
            atVar = this.f35183b;
        } else {
            atVar = this.f35183b;
            atVar.m32945a(ay.MAKE_IMMUTABLE, null, null);
            atVar.f35180h.f35370f = false;
            this.f35184c = true;
            atVar = this.f35183b;
        }
        auVar.m32960a(atVar);
        return auVar;
    }
}
