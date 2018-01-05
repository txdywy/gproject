package com.google.protobuf;

import java.util.Arrays;

public final class dv {
    public static final dv f35365a = new dv(0, new int[0], new Object[0], false);
    public int f35366b;
    public int[] f35367c;
    public Object[] f35368d;
    public int f35369e;
    public boolean f35370f;

    static dv m33324a(dv dvVar, dv dvVar2) {
        int i = dvVar.f35366b + dvVar2.f35366b;
        Object copyOf = Arrays.copyOf(dvVar.f35367c, i);
        System.arraycopy(dvVar2.f35367c, 0, copyOf, dvVar.f35366b, dvVar2.f35366b);
        Object copyOf2 = Arrays.copyOf(dvVar.f35368d, i);
        System.arraycopy(dvVar2.f35368d, 0, copyOf2, dvVar.f35366b, dvVar2.f35366b);
        return new dv(i, copyOf, copyOf2, true);
    }

    public dv() {
        this(0, new int[8], new Object[8], true);
    }

    private dv(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f35369e = -1;
        this.f35366b = i;
        this.f35367c = iArr;
        this.f35368d = objArr;
        this.f35370f = z;
    }

    private final void m33326b() {
        if (!this.f35370f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void m33329a(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.f35366b; i++) {
            int i2 = this.f35367c[i];
            int i3 = i2 >>> 3;
            switch (i2 & 7) {
                case 0:
                    codedOutputStream.mo6028a(i3, ((Long) this.f35368d[i]).longValue());
                    break;
                case 1:
                    codedOutputStream.mo6046c(i3, ((Long) this.f35368d[i]).longValue());
                    break;
                case 2:
                    codedOutputStream.mo6030a(i3, (C7203j) this.f35368d[i]);
                    break;
                case 3:
                    codedOutputStream.mo6027a(i3, 3);
                    ((dv) this.f35368d[i]).m33329a(codedOutputStream);
                    codedOutputStream.mo6027a(i3, 4);
                    break;
                case 5:
                    codedOutputStream.mo6049e(i3, ((Integer) this.f35368d[i]).intValue());
                    break;
                default:
                    throw InvalidProtocolBufferException.m32669f();
            }
        }
    }

    public final void m33330a(eq eqVar) {
        if (this.f35366b != 0) {
            int i;
            if (eqVar.mo6051a() == er.ASCENDING) {
                for (i = 0; i < this.f35366b; i++) {
                    m33325a(this.f35367c[i], this.f35368d[i], eqVar);
                }
                return;
            }
            for (i = this.f35366b - 1; i >= 0; i--) {
                m33325a(this.f35367c[i], this.f35368d[i], eqVar);
            }
        }
    }

    private static void m33325a(int i, Object obj, eq eqVar) {
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                eqVar.mo6056a(i2, ((Long) obj).longValue());
                return;
            case 1:
                eqVar.mo6076d(i2, ((Long) obj).longValue());
                return;
            case 2:
                eqVar.mo6058a(i2, (C7203j) obj);
                return;
            case 3:
                if (eqVar.mo6051a() == er.ASCENDING) {
                    eqVar.mo6052a(i2);
                    ((dv) obj).m33330a(eqVar);
                    eqVar.mo6064b(i2);
                    return;
                }
                eqVar.mo6064b(i2);
                ((dv) obj).m33330a(eqVar);
                eqVar.mo6052a(i2);
                return;
            case 5:
                eqVar.mo6075d(i2, ((Integer) obj).intValue());
                return;
            default:
                throw new RuntimeException(InvalidProtocolBufferException.m32669f());
        }
    }

    public final int m33327a() {
        int i = this.f35369e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.f35366b; i2++) {
                int i3 = this.f35367c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case 0:
                        i += CodedOutputStream.m32601e(i4, ((Long) this.f35368d[i2]).longValue());
                        break;
                    case 1:
                        ((Long) this.f35368d[i2]).longValue();
                        i += CodedOutputStream.m32613h(i4);
                        break;
                    case 2:
                        i += CodedOutputStream.m32593c(i4, (C7203j) this.f35368d[i2]);
                        break;
                    case 3:
                        i += ((dv) this.f35368d[i2]).m33327a() + (CodedOutputStream.m32620m(i4) * 2);
                        break;
                    case 5:
                        ((Integer) this.f35368d[i2]).intValue();
                        i += CodedOutputStream.m32604f(i4);
                        break;
                    default:
                        throw new IllegalStateException(InvalidProtocolBufferException.m32669f());
                }
            }
            this.f35369e = i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        if (this.f35366b == dvVar.f35366b) {
            int i;
            boolean z;
            int[] iArr = this.f35367c;
            int[] iArr2 = dvVar.f35367c;
            int i2 = this.f35366b;
            for (i = 0; i < i2; i++) {
                if (iArr[i] != iArr2[i]) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                Object[] objArr = this.f35368d;
                Object[] objArr2 = dvVar.f35368d;
                i2 = this.f35366b;
                for (i = 0; i < i2; i++) {
                    if (!objArr[i].equals(objArr2[i])) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f35366b + 527) * 31) + Arrays.hashCode(this.f35367c)) * 31) + Arrays.deepHashCode(this.f35368d);
    }

    final void m33331a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.f35366b; i2++) {
            ci.m33073a(stringBuilder, i, String.valueOf(this.f35367c[i2] >>> 3), this.f35368d[i2]);
        }
    }

    final void m33328a(int i, Object obj) {
        m33326b();
        if (this.f35366b == this.f35367c.length) {
            int i2 = (this.f35366b < 4 ? 8 : this.f35366b >> 1) + this.f35366b;
            this.f35367c = Arrays.copyOf(this.f35367c, i2);
            this.f35368d = Arrays.copyOf(this.f35368d, i2);
        }
        this.f35367c[this.f35366b] = i;
        this.f35368d[this.f35366b] = obj;
        this.f35366b++;
    }

    public final boolean m33332a(int i, C7225s c7225s) {
        m33326b();
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                m33328a(i, Long.valueOf(c7225s.mo6241e()));
                return true;
            case 1:
                m33328a(i, Long.valueOf(c7225s.mo6244g()));
                return true;
            case 2:
                m33328a(i, c7225s.mo6249l());
                return true;
            case 3:
                Object dvVar = new dv();
                int a;
                do {
                    a = c7225s.mo6231a();
                    if (a != 0) {
                    }
                    c7225s.mo6234a((i2 << 3) | 4);
                    m33328a(i, dvVar);
                    return true;
                } while (dvVar.m33332a(a, c7225s));
                c7225s.mo6234a((i2 << 3) | 4);
                m33328a(i, dvVar);
                return true;
            case 4:
                return false;
            case 5:
                m33328a(i, Integer.valueOf(c7225s.mo6245h()));
                return true;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
    }
}
