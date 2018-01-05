package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class js extends C0758b {
    public int f12815a;
    public long f12816b;
    public ax f12817c;

    public js() {
        this.f12815a = 0;
        this.f12816b = 0;
        this.f12817c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof js)) {
            return false;
        }
        js jsVar = (js) obj;
        if ((this.f12815a & 1) != (jsVar.f12815a & 1)) {
            return false;
        }
        if (this.f12816b != jsVar.f12816b) {
            return false;
        }
        if (this.f12817c == null) {
            if (jsVar.f12817c != null) {
                return false;
            }
        } else if (!this.f12817c.equals(jsVar.f12817c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jsVar.aO);
        }
        if (jsVar.aO == null || jsVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f12816b;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        ax axVar = this.f12817c;
        hashCode = ((axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12815a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f12816b);
        }
        if (this.f12817c != null) {
            codedOutputByteBufferNano.b(2, this.f12817c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12815a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f12816b);
        }
        if (this.f12817c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12817c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12816b = aVar.j();
                    this.f12815a |= 1;
                    continue;
                case 18:
                    if (this.f12817c == null) {
                        this.f12817c = new ax();
                    }
                    aVar.a(this.f12817c);
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
