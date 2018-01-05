package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class uu extends ty {
    public wb f27255h = wb.f27585a;
    public int f27256i = -1;

    protected static uu m25289a(uu uuVar, ud udVar) {
        zzfxb a;
        Object obj = 1;
        uu a2 = m25290a(uuVar, udVar, uq.m25756a());
        if (a2 != null) {
            if ((a2.mo4849a(vb.f27551a, Boolean.TRUE, null) != null ? 1 : null) == null) {
                a = new zzfxz().m26058a();
                if (a == null) {
                    throw null;
                }
                throw a;
            }
        }
        if (a2 != null) {
            if (a2.mo4849a(vb.f27551a, Boolean.TRUE, null) == null) {
                obj = null;
            }
            if (obj == null) {
                a = new zzfxz().m26058a();
                if (a == null) {
                    throw null;
                }
                throw a;
            }
        }
        return a2;
    }

    private static uu m25290a(uu uuVar, ud udVar, uq uqVar) {
        try {
            um d = udVar.mo4898d();
            uu a = m25291a(uuVar, d, uqVar);
            d.mo4903a(0);
            return a;
        } catch (zzfxb e) {
            throw e;
        } catch (zzfxb e2) {
            throw e2;
        }
    }

    static uu m25292a(uu uuVar, byte[] bArr, uq uqVar) {
        try {
            um a = um.m25684a(bArr);
            uu a2 = m25291a(uuVar, a, uqVar);
            a.mo4903a(0);
            return a2;
        } catch (zzfxb e) {
            throw e;
        } catch (zzfxb e2) {
            throw e2;
        }
    }

    static Object m25293a(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    protected abstract Object mo4849a(int i, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((uu) mo4849a(vb.f27557g, null, null)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            Object obj2 = ux.f27544a;
            obj = (uu) obj;
            mo4849a(vb.f27552b, obj2, obj);
            this.f27255h = obj2.mo4933a(this.f27255h, obj.f27255h);
            return true;
        } catch (zzfwr e) {
            return false;
        }
    }

    public final /* synthetic */ vl mo4847g() {
        uv uvVar = (uv) mo4849a(vb.f27556f, null, null);
        uvVar.m25314a(this);
        return uvVar;
    }

    public final /* synthetic */ vk mo4848h() {
        return (uu) mo4849a(vb.f27557g, null, null);
    }

    public int hashCode() {
        if (this.g != 0) {
            return this.g;
        }
        Object uzVar = new uz();
        mo4849a(vb.f27552b, uzVar, (Object) this);
        this.f27255h = uzVar.mo4933a(this.f27255h, this.f27255h);
        this.g = uzVar.f27547a;
        return this.g;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ").append(obj);
        vn.m25793a(this, stringBuilder, 0);
        return stringBuilder.toString();
    }

    static uu m25291a(uu uuVar, um umVar, uq uqVar) {
        uu uuVar2 = (uu) uuVar.mo4849a(vb.f27555e, null, null);
        try {
            uuVar2.mo4849a(vb.f27553c, (Object) umVar, (Object) uqVar);
            uuVar2.mo4849a(vb.f27554d, null, null);
            return uuVar2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof zzfxb) {
                throw ((zzfxb) e.getCause());
            }
            throw e;
        }
    }
}
