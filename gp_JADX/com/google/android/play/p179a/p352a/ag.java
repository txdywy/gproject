package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ag extends C0758b {
    public int f30784a;
    public int f30785b;
    public ae f30786c;
    public ah f30787d;
    public aj f30788e;
    public an f30789f;
    public ak f30790g;
    public af f30791h;

    public ag() {
        this.f30784a = 0;
        this.f30785b = 0;
        this.f30786c = null;
        this.f30787d = null;
        this.f30788e = null;
        this.f30789f = null;
        this.f30790g = null;
        this.f30791h = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if ((this.f30784a & 1) != (agVar.f30784a & 1)) {
            return false;
        }
        if (this.f30785b != agVar.f30785b) {
            return false;
        }
        if (this.f30786c == null) {
            if (agVar.f30786c != null) {
                return false;
            }
        } else if (!this.f30786c.equals(agVar.f30786c)) {
            return false;
        }
        if (this.f30787d == null) {
            if (agVar.f30787d != null) {
                return false;
            }
        } else if (!this.f30787d.equals(agVar.f30787d)) {
            return false;
        }
        if (this.f30788e == null) {
            if (agVar.f30788e != null) {
                return false;
            }
        } else if (!this.f30788e.equals(agVar.f30788e)) {
            return false;
        }
        if (this.f30789f == null) {
            if (agVar.f30789f != null) {
                return false;
            }
        } else if (!this.f30789f.equals(agVar.f30789f)) {
            return false;
        }
        if (this.f30790g == null) {
            if (agVar.f30790g != null) {
                return false;
            }
        } else if (!this.f30790g.equals(agVar.f30790g)) {
            return false;
        }
        if (this.f30791h == null) {
            if (agVar.f30791h != null) {
                return false;
            }
        } else if (!this.f30791h.equals(agVar.f30791h)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(agVar.aO);
        }
        if (agVar.aO == null || agVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f30785b;
        ae aeVar = this.f30786c;
        hashCode = (aeVar == null ? 0 : aeVar.hashCode()) + (hashCode * 31);
        ah ahVar = this.f30787d;
        hashCode = (ahVar == null ? 0 : ahVar.hashCode()) + (hashCode * 31);
        aj ajVar = this.f30788e;
        hashCode = (ajVar == null ? 0 : ajVar.hashCode()) + (hashCode * 31);
        an anVar = this.f30789f;
        hashCode = (anVar == null ? 0 : anVar.hashCode()) + (hashCode * 31);
        ak akVar = this.f30790g;
        hashCode = (akVar == null ? 0 : akVar.hashCode()) + (hashCode * 31);
        af afVar = this.f30791h;
        hashCode = ((afVar == null ? 0 : afVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30784a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30785b);
        }
        if (this.f30786c != null) {
            codedOutputByteBufferNano.b(2, this.f30786c);
        }
        if (this.f30787d != null) {
            codedOutputByteBufferNano.b(3, this.f30787d);
        }
        if (this.f30788e != null) {
            codedOutputByteBufferNano.b(4, this.f30788e);
        }
        if (this.f30789f != null) {
            codedOutputByteBufferNano.b(5, this.f30789f);
        }
        if (this.f30791h != null) {
            codedOutputByteBufferNano.b(9, this.f30791h);
        }
        if (this.f30790g != null) {
            codedOutputByteBufferNano.b(11, this.f30790g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30784a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f30785b);
        }
        if (this.f30786c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f30786c);
        }
        if (this.f30787d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f30787d);
        }
        if (this.f30788e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f30788e);
        }
        if (this.f30789f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f30789f);
        }
        if (this.f30791h != null) {
            b += CodedOutputByteBufferNano.d(9, this.f30791h);
        }
        if (this.f30790g != null) {
            return b + CodedOutputByteBufferNano.d(11, this.f30790g);
        }
        return b;
    }

    private final ag m28554b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30784a |= 1;
                    int o = aVar.o();
                    try {
                        this.f30785b = C6197h.m28625a(aVar.i());
                        this.f30784a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 18:
                    if (this.f30786c == null) {
                        this.f30786c = new ae();
                    }
                    aVar.a(this.f30786c);
                    continue;
                case 26:
                    if (this.f30787d == null) {
                        this.f30787d = new ah();
                    }
                    aVar.a(this.f30787d);
                    continue;
                case 34:
                    if (this.f30788e == null) {
                        this.f30788e = new aj();
                    }
                    aVar.a(this.f30788e);
                    continue;
                case 42:
                    if (this.f30789f == null) {
                        this.f30789f = new an();
                    }
                    aVar.a(this.f30789f);
                    continue;
                case 74:
                    if (this.f30791h == null) {
                        this.f30791h = new af();
                    }
                    aVar.a(this.f30791h);
                    continue;
                case 90:
                    if (this.f30790g == null) {
                        this.f30790g = new ak();
                    }
                    aVar.a(this.f30790g);
                    continue;
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
        return m28554b(aVar);
    }
}
