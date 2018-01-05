package com.google.protobuf.nano;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C7217f implements Cloneable {
    public C7214c f35460a;
    public Object f35461b;
    public List f35462c;

    public C7217f(C7214c c7214c, Object obj) {
        this.f35460a = c7214c;
        this.f35461b = obj;
    }

    C7217f() {
        this.f35462c = new ArrayList();
    }

    final int m33601a() {
        if (this.f35461b != null) {
            C7214c c7214c = this.f35460a;
            Object obj = this.f35461b;
            if (c7214c.f35451d) {
                return c7214c.mo6225a(obj);
            }
            return c7214c.mo6229b(obj);
        }
        int i = 0;
        for (C7221k c7221k : this.f35462c) {
            i = (c7221k.f35467b.length + (CodedOutputByteBufferNano.m33507f(c7221k.f35466a) + 0)) + i;
        }
        return i;
    }

    final void m33602a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35461b != null) {
            C7214c c7214c = this.f35460a;
            Object obj = this.f35461b;
            if (c7214c.f35451d) {
                c7214c.mo6230c(obj, codedOutputByteBufferNano);
                return;
            } else {
                c7214c.mo6228a(obj, codedOutputByteBufferNano);
                return;
            }
        }
        for (C7221k c7221k : this.f35462c) {
            codedOutputByteBufferNano.m33539e(c7221k.f35466a);
            codedOutputByteBufferNano.m33536c(c7221k.f35467b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7217f)) {
            return false;
        }
        C7217f c7217f = (C7217f) obj;
        if (this.f35461b == null || c7217f.f35461b == null) {
            if (this.f35462c != null && c7217f.f35462c != null) {
                return this.f35462c.equals(c7217f.f35462c);
            }
            try {
                return Arrays.equals(m33599b(), c7217f.m33599b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f35460a != c7217f.f35460a) {
            return false;
        } else {
            if (!this.f35460a.f35449b.isArray()) {
                return this.f35461b.equals(c7217f.f35461b);
            }
            if (this.f35461b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f35461b, (byte[]) c7217f.f35461b);
            }
            if (this.f35461b instanceof int[]) {
                return Arrays.equals((int[]) this.f35461b, (int[]) c7217f.f35461b);
            }
            if (this.f35461b instanceof long[]) {
                return Arrays.equals((long[]) this.f35461b, (long[]) c7217f.f35461b);
            }
            if (this.f35461b instanceof float[]) {
                return Arrays.equals((float[]) this.f35461b, (float[]) c7217f.f35461b);
            }
            if (this.f35461b instanceof double[]) {
                return Arrays.equals((double[]) this.f35461b, (double[]) c7217f.f35461b);
            }
            if (this.f35461b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f35461b, (boolean[]) c7217f.f35461b);
            }
            return Arrays.deepEquals((Object[]) this.f35461b, (Object[]) c7217f.f35461b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m33599b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] m33599b() {
        byte[] bArr = new byte[m33601a()];
        m33602a(CodedOutputByteBufferNano.m33491a(bArr, bArr.length));
        return bArr;
    }

    private final C7217f m33600c() {
        C7217f c7217f = new C7217f();
        try {
            c7217f.f35460a = this.f35460a;
            if (this.f35462c == null) {
                c7217f.f35462c = null;
            } else {
                c7217f.f35462c.addAll(this.f35462c);
            }
            if (this.f35461b != null) {
                if (this.f35461b instanceof i) {
                    c7217f.f35461b = (i) ((i) this.f35461b).clone();
                } else if (this.f35461b instanceof byte[]) {
                    c7217f.f35461b = ((byte[]) this.f35461b).clone();
                } else if (this.f35461b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f35461b;
                    r4 = new byte[bArr.length][];
                    c7217f.f35461b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.f35461b instanceof boolean[]) {
                    c7217f.f35461b = ((boolean[]) this.f35461b).clone();
                } else if (this.f35461b instanceof int[]) {
                    c7217f.f35461b = ((int[]) this.f35461b).clone();
                } else if (this.f35461b instanceof long[]) {
                    c7217f.f35461b = ((long[]) this.f35461b).clone();
                } else if (this.f35461b instanceof float[]) {
                    c7217f.f35461b = ((float[]) this.f35461b).clone();
                } else if (this.f35461b instanceof double[]) {
                    c7217f.f35461b = ((double[]) this.f35461b).clone();
                } else if (this.f35461b instanceof i[]) {
                    i[] iVarArr = (i[]) this.f35461b;
                    r4 = new i[iVarArr.length];
                    c7217f.f35461b = r4;
                    for (r2 = 0; r2 < iVarArr.length; r2++) {
                        r4[r2] = (i) iVarArr[r2].clone();
                    }
                }
            }
            return c7217f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return m33600c();
    }
}
