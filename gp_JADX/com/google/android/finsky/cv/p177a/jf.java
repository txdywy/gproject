package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class jf extends C0758b {
    public static volatile jf[] f12774a;
    public int f12775b;
    public String f12776c;
    public String f12777d;
    public String f12778e;
    public String f12779f;

    public static jf[] bw_() {
        if (f12774a == null) {
            synchronized (h.b) {
                if (f12774a == null) {
                    f12774a = new jf[0];
                }
            }
        }
        return f12774a;
    }

    public jf() {
        this.f12775b = 0;
        this.f12776c = "";
        this.f12777d = "";
        this.f12778e = "";
        this.f12779f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        if ((this.f12775b & 1) != (jfVar.f12775b & 1)) {
            return false;
        }
        if (!this.f12776c.equals(jfVar.f12776c)) {
            return false;
        }
        if ((this.f12775b & 2) != (jfVar.f12775b & 2)) {
            return false;
        }
        if (!this.f12777d.equals(jfVar.f12777d)) {
            return false;
        }
        if ((this.f12775b & 4) != (jfVar.f12775b & 4)) {
            return false;
        }
        if (!this.f12778e.equals(jfVar.f12778e)) {
            return false;
        }
        if ((this.f12775b & 8) != (jfVar.f12775b & 8)) {
            return false;
        }
        if (!this.f12779f.equals(jfVar.f12779f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jfVar.aO);
        }
        if (jfVar.aO == null || jfVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f12776c.hashCode()) * 31) + this.f12777d.hashCode()) * 31) + this.f12778e.hashCode()) * 31) + this.f12779f.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12775b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12776c);
        }
        if ((this.f12775b & 4) != 0) {
            codedOutputByteBufferNano.a(2, this.f12778e);
        }
        if ((this.f12775b & 8) != 0) {
            codedOutputByteBufferNano.a(3, this.f12779f);
        }
        if ((this.f12775b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f12777d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12775b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12776c);
        }
        if ((this.f12775b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12778e);
        }
        if ((this.f12775b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12779f);
        }
        if ((this.f12775b & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12777d);
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
                    this.f12776c = aVar.f();
                    this.f12775b |= 1;
                    continue;
                case 18:
                    this.f12778e = aVar.f();
                    this.f12775b |= 4;
                    continue;
                case 26:
                    this.f12779f = aVar.f();
                    this.f12775b |= 8;
                    continue;
                case 34:
                    this.f12777d = aVar.f();
                    this.f12775b |= 2;
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
