package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.h;
import g.a.a.a;

public final class dn extends C0758b {
    public static volatile dn[] f12176a;
    public int f12177b;
    public long f12178c;
    public int f12179d;
    public boolean f12180e;
    public C2430do f12181f;
    public long f12182g;
    public dq f12183h;
    public a f12184i;

    public static dn[] aV_() {
        if (f12176a == null) {
            synchronized (h.b) {
                if (f12176a == null) {
                    f12176a = new dn[0];
                }
            }
        }
        return f12176a;
    }

    public dn() {
        this.f12177b = 0;
        this.f12178c = 0;
        this.f12179d = 1;
        this.f12180e = false;
        this.f12181f = null;
        this.f12182g = 0;
        this.f12183h = null;
        this.f12184i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        if (this.f12178c != dnVar.f12178c) {
            return false;
        }
        if ((this.f12177b & 1) != (dnVar.f12177b & 1)) {
            return false;
        }
        if (this.f12179d != dnVar.f12179d) {
            return false;
        }
        if ((this.f12177b & 2) != (dnVar.f12177b & 2)) {
            return false;
        }
        if (this.f12180e != dnVar.f12180e) {
            return false;
        }
        if (this.f12181f == null) {
            if (dnVar.f12181f != null) {
                return false;
            }
        } else if (!this.f12181f.equals(dnVar.f12181f)) {
            return false;
        }
        if ((this.f12177b & 4) != (dnVar.f12177b & 4)) {
            return false;
        }
        if (this.f12182g != dnVar.f12182g) {
            return false;
        }
        if (this.f12183h == null) {
            if (dnVar.f12183h != null) {
                return false;
            }
        } else if (!this.f12183h.equals(dnVar.f12183h)) {
            return false;
        }
        if (this.f12184i == null) {
            if (dnVar.f12184i != null) {
                return false;
            }
        } else if (!this.f12184i.equals(dnVar.f12184i)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dnVar.aO);
        }
        if (dnVar.aO == null || dnVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f12180e ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f12178c ^ (this.f12178c >>> 32)))) * 31) + this.f12179d) * 31);
        C2430do c2430do = this.f12181f;
        hashCode = (c2430do == null ? 0 : c2430do.hashCode()) + (hashCode * 31);
        long j = this.f12182g;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        dq dqVar = this.f12183h;
        hashCode = (dqVar == null ? 0 : dqVar.hashCode()) + (hashCode * 31);
        a aVar = this.f12184i;
        hashCode = ((aVar == null ? 0 : aVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.c(10, this.f12178c);
        if ((this.f12177b & 1) != 0) {
            codedOutputByteBufferNano.a(11, this.f12179d);
        }
        if ((this.f12177b & 4) != 0) {
            codedOutputByteBufferNano.b(12, this.f12182g);
        }
        if (this.f12183h != null) {
            codedOutputByteBufferNano.b(15, this.f12183h);
        }
        if (this.f12184i != null) {
            codedOutputByteBufferNano.b(20, this.f12184i);
        }
        if ((this.f12177b & 2) != 0) {
            codedOutputByteBufferNano.a(22, this.f12180e);
        }
        if (this.f12181f != null) {
            codedOutputByteBufferNano.b(27, this.f12181f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b() + (CodedOutputByteBufferNano.d(10) + 8);
        if ((this.f12177b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(11, this.f12179d);
        }
        if ((this.f12177b & 4) != 0) {
            b += CodedOutputByteBufferNano.f(12, this.f12182g);
        }
        if (this.f12183h != null) {
            b += CodedOutputByteBufferNano.d(15, this.f12183h);
        }
        if (this.f12184i != null) {
            b += CodedOutputByteBufferNano.d(20, this.f12184i);
        }
        if ((this.f12177b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(22) + 1;
        }
        if (this.f12181f != null) {
            return b + CodedOutputByteBufferNano.d(27, this.f12181f);
        }
        return b;
    }

    private final dn m12443b(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 81:
                    this.f12178c = aVar.l();
                    continue;
                case 88:
                    this.f12177b |= 1;
                    int o = aVar.o();
                    try {
                        this.f12179d = dm.m12438a(aVar.i());
                        this.f12177b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 96:
                    this.f12182g = aVar.j();
                    this.f12177b |= 4;
                    continue;
                case 122:
                    if (this.f12183h == null) {
                        this.f12183h = new dq();
                    }
                    aVar.a(this.f12183h);
                    continue;
                case 162:
                    if (this.f12184i == null) {
                        this.f12184i = new a();
                    }
                    aVar.a(this.f12184i);
                    continue;
                case 176:
                    this.f12180e = aVar.e();
                    this.f12177b |= 2;
                    continue;
                case 218:
                    if (this.f12181f == null) {
                        this.f12181f = new C2430do();
                    }
                    aVar.a(this.f12181f);
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

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        return m12443b(aVar);
    }
}
