package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class cu extends C0758b {
    public eu[] f12080a;
    public eu f12081b;
    public eu f12082c;

    public cu() {
        this.f12080a = eu.aZ_();
        this.f12081b = null;
        this.f12082c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        if (!h.a(this.f12080a, cuVar.f12080a)) {
            return false;
        }
        if (this.f12081b == null) {
            if (cuVar.f12081b != null) {
                return false;
            }
        } else if (!this.f12081b.equals(cuVar.f12081b)) {
            return false;
        }
        if (this.f12082c == null) {
            if (cuVar.f12082c != null) {
                return false;
            }
        } else if (!this.f12082c.equals(cuVar.f12082c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cuVar.aO);
        }
        if (cuVar.aO == null || cuVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12080a);
        eu euVar = this.f12081b;
        hashCode = (euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31);
        euVar = this.f12082c;
        hashCode = ((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12080a != null && this.f12080a.length > 0) {
            for (C0757i c0757i : this.f12080a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f12081b != null) {
            codedOutputByteBufferNano.b(2, this.f12081b);
        }
        if (this.f12082c != null) {
            codedOutputByteBufferNano.b(3, this.f12082c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12080a != null && this.f12080a.length > 0) {
            for (C0757i c0757i : this.f12080a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if (this.f12081b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12081b);
        }
        if (this.f12082c != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f12082c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f12080a == null ? 0 : this.f12080a.length;
                    Object obj = new eu[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12080a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new eu();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new eu();
                    aVar.a(obj[a]);
                    this.f12080a = obj;
                    continue;
                case 18:
                    if (this.f12081b == null) {
                        this.f12081b = new eu();
                    }
                    aVar.a(this.f12081b);
                    continue;
                case 26:
                    if (this.f12082c == null) {
                        this.f12082c = new eu();
                    }
                    aVar.a(this.f12082c);
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
}
