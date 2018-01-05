package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class lh extends C0758b {
    public static volatile lh[] f13010a;
    public int f13011b;
    public String f13012c;
    public String f13013d;

    public static lh[] bM_() {
        if (f13010a == null) {
            synchronized (h.b) {
                if (f13010a == null) {
                    f13010a = new lh[0];
                }
            }
        }
        return f13010a;
    }

    public final lh m13029a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f13011b |= 2;
        this.f13013d = str;
        return this;
    }

    public lh() {
        this.f13011b = 0;
        this.f13012c = "";
        this.f13013d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lh)) {
            return false;
        }
        lh lhVar = (lh) obj;
        if ((this.f13011b & 1) != (lhVar.f13011b & 1)) {
            return false;
        }
        if (!this.f13012c.equals(lhVar.f13012c)) {
            return false;
        }
        if ((this.f13011b & 2) != (lhVar.f13011b & 2)) {
            return false;
        }
        if (!this.f13013d.equals(lhVar.f13013d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lhVar.aO);
        }
        if (lhVar.aO == null || lhVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f13012c.hashCode()) * 31) + this.f13013d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13011b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13012c);
        }
        if ((this.f13011b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13013d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13011b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13012c);
        }
        if ((this.f13011b & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f13013d);
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
                    this.f13012c = aVar.f();
                    this.f13011b |= 1;
                    continue;
                case 18:
                    this.f13013d = aVar.f();
                    this.f13011b |= 2;
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
