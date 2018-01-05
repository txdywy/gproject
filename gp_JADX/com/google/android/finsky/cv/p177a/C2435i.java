package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C2435i extends C0758b {
    public static volatile C2435i[] f12643a;
    public int f12644b;
    public long f12645c;
    public String f12646d;

    public static C2435i[] av_() {
        if (f12643a == null) {
            synchronized (h.b) {
                if (f12643a == null) {
                    f12643a = new C2435i[0];
                }
            }
        }
        return f12643a;
    }

    public C2435i() {
        this.f12644b = 0;
        this.f12645c = 0;
        this.f12646d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2435i)) {
            return false;
        }
        C2435i c2435i = (C2435i) obj;
        if ((this.f12644b & 1) != (c2435i.f12644b & 1)) {
            return false;
        }
        if (this.f12645c != c2435i.f12645c) {
            return false;
        }
        if ((this.f12644b & 2) != (c2435i.f12644b & 2)) {
            return false;
        }
        if (!this.f12646d.equals(c2435i.f12646d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2435i.aO);
        }
        if (c2435i.aO == null || c2435i.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f12645c;
        int hashCode2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12646d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + hashCode2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12644b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f12645c);
        }
        if ((this.f12644b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12646d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12644b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f12645c);
        }
        if ((this.f12644b & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12646d);
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
                    this.f12645c = aVar.j();
                    this.f12644b |= 1;
                    continue;
                case 18:
                    this.f12646d = aVar.f();
                    this.f12644b |= 2;
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
