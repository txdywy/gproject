package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C2434h extends C0758b {
    public C2435i[] f12523a;
    public C2435i[] f12524b;

    public C2434h() {
        this.f12523a = C2435i.av_();
        this.f12524b = C2435i.av_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2434h)) {
            return false;
        }
        C2434h c2434h = (C2434h) obj;
        if (!h.a(this.f12523a, c2434h.f12523a)) {
            return false;
        }
        if (!h.a(this.f12524b, c2434h.f12524b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2434h.aO);
        }
        if (c2434h.aO == null || c2434h.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12523a)) * 31) + h.a(this.f12524b)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f12523a != null && this.f12523a.length > 0) {
            for (C0757i c0757i : this.f12523a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f12524b != null && this.f12524b.length > 0) {
            while (i < this.f12524b.length) {
                C0757i c0757i2 = this.f12524b[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(2, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f12523a != null && this.f12523a.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f12523a) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i2;
        }
        if (this.f12524b != null && this.f12524b.length > 0) {
            while (i < this.f12524b.length) {
                C0757i c0757i2 = this.f12524b[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(2, c0757i2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = l.a(aVar, 10);
                    a = this.f12523a == null ? 0 : this.f12523a.length;
                    obj = new C2435i[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12523a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C2435i();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C2435i();
                    aVar.a(obj[a]);
                    this.f12523a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f12524b == null ? 0 : this.f12524b.length;
                    obj = new C2435i[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12524b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C2435i();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C2435i();
                    aVar.a(obj[a]);
                    this.f12524b = obj;
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
