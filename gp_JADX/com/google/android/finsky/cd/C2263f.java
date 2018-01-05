package com.google.android.finsky.cd;

import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.wireless.android.a.a.a.a.ce;

public final class C2263f extends C0758b {
    public int f11237a;
    public int f11238b;
    public String f11239c;
    public C2265h f11240d;
    public C2470a f11241e;
    public long f11242f;
    public int f11243g;

    public final C2265h ao_() {
        if (this.f11237a == 0) {
            return this.f11240d;
        }
        return null;
    }

    public final C2263f m11706a(C2265h c2265h) {
        this.f11237a = -1;
        this.f11237a = 0;
        this.f11240d = c2265h;
        return this;
    }

    public C2263f() {
        this.f11237a = -1;
        this.f11238b = 0;
        this.f11239c = "";
        this.f11237a = -1;
        this.f11240d = null;
        this.f11241e = null;
        this.f11242f = 0;
        this.f11243g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11238b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11239c);
        }
        if (this.f11237a == 0) {
            codedOutputByteBufferNano.b(2, this.f11240d);
        }
        if (this.f11241e != null) {
            codedOutputByteBufferNano.b(3, this.f11241e);
        }
        if ((this.f11238b & 2) != 0) {
            codedOutputByteBufferNano.b(4, this.f11242f);
        }
        if ((this.f11238b & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f11243g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11238b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11239c);
        }
        if (this.f11237a == 0) {
            b += CodedOutputByteBufferNano.d(2, this.f11240d);
        }
        if (this.f11241e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f11241e);
        }
        if ((this.f11238b & 2) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f11242f);
        }
        if ((this.f11238b & 4) != 0) {
            return b + CodedOutputByteBufferNano.d(5, this.f11243g);
        }
        return b;
    }

    private final C2263f m11705b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f11239c = aVar.f();
                    this.f11238b |= 1;
                    continue;
                case 18:
                    if (this.f11240d == null) {
                        this.f11240d = new C2265h();
                    }
                    aVar.a(this.f11240d);
                    this.f11237a = 0;
                    continue;
                case 26:
                    if (this.f11241e == null) {
                        this.f11241e = new C2470a();
                    }
                    aVar.a(this.f11241e);
                    continue;
                case 32:
                    this.f11242f = aVar.j();
                    this.f11238b |= 2;
                    continue;
                case 40:
                    this.f11238b |= 4;
                    int o = aVar.o();
                    try {
                        this.f11243g = ce.a(aVar.i());
                        this.f11238b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m11705b(aVar);
    }
}
