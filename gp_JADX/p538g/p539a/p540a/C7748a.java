package p538g.p539a.p540a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7214c;
import com.google.protobuf.nano.C7217f;
import com.google.protobuf.nano.C7221k;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.lang.reflect.Array;

public final class C7748a extends b {
    public C7748a() {
        this.aO = null;
        this.aP = -1;
    }

    public final void m37521a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.aO != null) {
            for (int i = 0; i < this.aO.m33594a(); i++) {
                C7217f b = this.aO.m33597b(i);
                if (b.f35461b != null) {
                    C7214c c7214c = b.f35460a;
                    Object obj = b.f35461b;
                    if (c7214c.f35451d) {
                        int length = Array.getLength(obj);
                        for (int i2 = 0; i2 < length; i2++) {
                            Object obj2 = Array.get(obj, i2);
                            if (obj2 != null) {
                                c7214c.m33581b(obj2, codedOutputByteBufferNano);
                            }
                        }
                    } else {
                        c7214c.m33581b(obj, codedOutputByteBufferNano);
                    }
                } else {
                    for (C7221k c7221k : b.f35462c) {
                        int i3 = c7221k.f35466a;
                        byte[] bArr = c7221k.f35467b;
                        codedOutputByteBufferNano.m33540f(1, 3);
                        codedOutputByteBufferNano.m33534c(2, i3);
                        codedOutputByteBufferNano.m33540f(3, 2);
                        codedOutputByteBufferNano.m33536c(bArr);
                        codedOutputByteBufferNano.m33540f(1, 4);
                    }
                }
            }
        }
    }

    protected final int m37522b() {
        if (this.aO == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.aO.m33594a(); i2++) {
            int i3;
            C7217f b = this.aO.m33597b(i2);
            int i4;
            if (b.f35461b != null) {
                C7214c c7214c = b.f35460a;
                Object obj = b.f35461b;
                if (c7214c.f35451d) {
                    int length = Array.getLength(obj);
                    i3 = 0;
                    for (i4 = 0; i4 < length; i4++) {
                        if (Array.get(obj, i4) != null) {
                            i3 += c7214c.m33582c(Array.get(obj, i4));
                        }
                    }
                } else {
                    i3 = c7214c.m33582c(obj);
                }
            } else {
                i4 = 0;
                for (C7221k c7221k : b.f35462c) {
                    int i5 = c7221k.f35466a;
                    i5 = (CodedOutputByteBufferNano.m33504e(2, i5) + (CodedOutputByteBufferNano.m33501d(1) * 2)) + CodedOutputByteBufferNano.m33501d(3);
                    i4 = (c7221k.f35467b.length + i5) + i4;
                }
                i3 = i4;
            }
            i += i3;
        }
        return i;
    }

    public final /* synthetic */ i m37520a(C7213a c7213a) {
        boolean a;
        do {
            int a2 = c7213a.m33550a();
            switch (a2) {
                case 0:
                    break;
                default:
                    if (a2 != C7222l.f35468a) {
                        a = a(c7213a, a2);
                        continue;
                    } else {
                        int i = 0;
                        byte[] bArr = null;
                        while (true) {
                            int a3 = c7213a.m33550a();
                            if (a3 != 0) {
                                if (a3 == C7222l.f35470c) {
                                    i = c7213a.m33567i();
                                } else if (a3 == C7222l.f35471d) {
                                    a2 = c7213a.m33573o();
                                    c7213a.m33557b(a3);
                                    bArr = c7213a.m33554a(a2, c7213a.m33573o() - a2);
                                } else if (c7213a.m33557b(a3)) {
                                }
                            }
                            c7213a.m33551a(C7222l.f35469b);
                            if (!(bArr == null || i == 0)) {
                                super.a(i, new C7221k(i, bArr));
                            }
                            a = true;
                            continue;
                        }
                    }
            }
            return this;
        } while (a);
        return this;
    }
}
