package com.google.protobuf.nano;

import com.google.protobuf.C7225s;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ah;
import com.google.protobuf.at;
import com.google.protobuf.ay;
import com.google.protobuf.cf;
import com.google.protobuf.cs;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class C7214c {
    public final int f35448a;
    public final Class f35449b;
    public final int f35450c;
    public final boolean f35451d;
    public final at f35452e;

    public static C7214c m33574a(Class cls, long j) {
        return new C7214c(11, cls, (int) j);
    }

    C7214c(int i, Class cls, int i2) {
        this(i, cls, i2, (byte) 0);
    }

    private C7214c(int i, Class cls, int i2, byte b) {
        this.f35448a = i;
        this.f35449b = cls;
        this.f35450c = i2;
        this.f35451d = false;
        this.f35452e = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7214c)) {
            return false;
        }
        C7214c c7214c = (C7214c) obj;
        if (this.f35448a == c7214c.f35448a && this.f35449b == c7214c.f35449b && this.f35450c == c7214c.f35450c && this.f35451d == c7214c.f35451d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f35451d ? 1 : 0) + ((((((this.f35448a + 1147) * 31) + this.f35449b.hashCode()) * 31) + this.f35450c) * 31);
    }

    final Object m33577a(List list) {
        int i;
        int i2 = 0;
        List arrayList = new ArrayList();
        for (i = 0; i < list.size(); i++) {
            C7221k c7221k = (C7221k) list.get(i);
            if (c7221k.f35467b.length != 0) {
                mo6227a(c7221k, arrayList);
            }
        }
        i = arrayList.size();
        if (i == 0) {
            return null;
        }
        Object cast = this.f35449b.cast(Array.newInstance(this.f35449b.getComponentType(), i));
        while (i2 < i) {
            Array.set(cast, i2, arrayList.get(i2));
            i2++;
        }
        return cast;
    }

    protected Object mo6226a(C7213a c7213a) {
        String valueOf;
        Class componentType = this.f35451d ? this.f35449b.getComponentType() : this.f35449b;
        try {
            i iVar;
            switch (this.f35448a) {
                case 10:
                    iVar = (i) componentType.newInstance();
                    c7213a.m33553a(iVar, this.f35450c >>> 3);
                    return iVar;
                case 11:
                    if (this.f35452e != null) {
                        cs csVar = (cs) this.f35452e.m32945a(ay.GET_PARSER, null, null);
                        if (c7213a.f35447k == null) {
                            c7213a.f35447k = C7225s.m33629a(c7213a.f35437a, c7213a.f35438b, c7213a.f35439c, false);
                        }
                        int w = c7213a.f35447k.mo6260w();
                        int i = c7213a.f35442f - c7213a.f35438b;
                        if (w > i) {
                            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(w), Integer.valueOf(i)}));
                        }
                        c7213a.f35447k.mo6242e(i - w);
                        C7225s c7225s = c7213a.f35447k;
                        i = c7213a.f35446j - c7213a.f35445i;
                        if (i < 0) {
                            throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
                        }
                        c7225s.f35484b = i;
                        at atVar = (at) c7213a.f35447k.mo6233a(csVar, ah.m32879b());
                        c7213a.m33557b(c7213a.f35443g);
                        return atVar;
                    }
                    iVar = (i) componentType.newInstance();
                    c7213a.m33552a(iVar);
                    return iVar;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f35448a);
            }
        } catch (Throwable e) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e);
        } catch (Throwable e2) {
            valueOf = String.valueOf(componentType);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Error creating instance of class ").append(valueOf).toString(), e2);
        } catch (Throwable e22) {
            throw new IllegalArgumentException("Error reading extension field", e22);
        }
    }

    protected void mo6227a(C7221k c7221k, List list) {
        byte[] bArr = c7221k.f35467b;
        list.add(mo6226a(C7213a.m33546a(bArr, 0, bArr.length)));
    }

    protected void mo6228a(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.m33539e(this.f35450c);
            cf cfVar;
            switch (this.f35448a) {
                case 10:
                    int i = this.f35450c >>> 3;
                    if (this.f35452e == null) {
                        ((i) obj).a(codedOutputByteBufferNano);
                    } else {
                        cfVar = (cf) obj;
                        CodedOutputStream a = codedOutputByteBufferNano.m33512a();
                        cfVar.mo6116a(a);
                        a.mo6050h();
                        codedOutputByteBufferNano.f35436c = codedOutputByteBufferNano.f35434a.position();
                    }
                    codedOutputByteBufferNano.m33540f(i, 4);
                    return;
                case 11:
                    if (this.f35452e == null) {
                        codedOutputByteBufferNano.m33525a((i) obj);
                        return;
                    }
                    cfVar = (cf) obj;
                    codedOutputByteBufferNano.m33539e(cfVar.mo6115a());
                    CodedOutputStream a2 = codedOutputByteBufferNano.m33512a();
                    cfVar.mo6116a(a2);
                    a2.mo6050h();
                    codedOutputByteBufferNano.f35436c = codedOutputByteBufferNano.f35434a.position();
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f35448a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    public final void m33581b(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = this.f35450c >>> 3;
        i iVar = (i) obj;
        codedOutputByteBufferNano.m33540f(1, 3);
        codedOutputByteBufferNano.m33534c(2, i);
        codedOutputByteBufferNano.m33532b(3, iVar);
        codedOutputByteBufferNano.m33540f(1, 4);
    }

    protected void mo6230c(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                mo6228a(obj2, codedOutputByteBufferNano);
            }
        }
    }

    protected int mo6225a(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += mo6229b(Array.get(obj, i2));
            }
        }
        return i;
    }

    protected int mo6229b(Object obj) {
        int i = this.f35450c >>> 3;
        switch (this.f35448a) {
            case 10:
                if (this.f35452e == null) {
                    return CodedOutputByteBufferNano.m33499c(i, (i) obj);
                }
                return CodedOutputStream.m32607f(i, (cf) obj);
            case 11:
                if (this.f35452e == null) {
                    return CodedOutputByteBufferNano.m33503d(i, (i) obj);
                }
                return CodedOutputStream.m32592c(i, (cf) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f35448a);
        }
    }

    public final int m33582c(Object obj) {
        return (CodedOutputByteBufferNano.m33504e(2, this.f35450c >>> 3) + (CodedOutputByteBufferNano.m33501d(1) * 2)) + CodedOutputByteBufferNano.m33503d(3, (i) obj);
    }
}
