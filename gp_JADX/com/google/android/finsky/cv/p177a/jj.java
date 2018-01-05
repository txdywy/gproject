package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class jj extends C0758b {
    public ji[] f12788a;

    public jj() {
        this.f12788a = ji.bx_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        if (!h.a(this.f12788a, jjVar.f12788a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jjVar.aO);
        }
        if (jjVar.aO == null || jjVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12788a)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12788a != null && this.f12788a.length > 0) {
            for (C0757i c0757i : this.f12788a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12788a != null && this.f12788a.length > 0) {
            for (C0757i c0757i : this.f12788a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
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
                    a = this.f12788a == null ? 0 : this.f12788a.length;
                    Object obj = new ji[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12788a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ji();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ji();
                    aVar.a(obj[a]);
                    this.f12788a = obj;
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
