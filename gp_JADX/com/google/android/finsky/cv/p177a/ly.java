package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ly extends C0758b {
    public int f13084a;
    public String f13085b;
    public String f13086c;
    public String f13087d;
    public eu f13088e;
    public String f13089f;
    public lz f13090g;

    public ly() {
        this.f13084a = 0;
        this.f13085b = "";
        this.f13086c = "";
        this.f13087d = "";
        this.f13088e = null;
        this.f13089f = "";
        this.f13090g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ly)) {
            return false;
        }
        ly lyVar = (ly) obj;
        if ((this.f13084a & 1) != (lyVar.f13084a & 1)) {
            return false;
        }
        if (!this.f13085b.equals(lyVar.f13085b)) {
            return false;
        }
        if ((this.f13084a & 2) != (lyVar.f13084a & 2)) {
            return false;
        }
        if (!this.f13086c.equals(lyVar.f13086c)) {
            return false;
        }
        if ((this.f13084a & 4) != (lyVar.f13084a & 4)) {
            return false;
        }
        if (!this.f13087d.equals(lyVar.f13087d)) {
            return false;
        }
        if (this.f13088e == null) {
            if (lyVar.f13088e != null) {
                return false;
            }
        } else if (!this.f13088e.equals(lyVar.f13088e)) {
            return false;
        }
        if ((this.f13084a & 8) != (lyVar.f13084a & 8)) {
            return false;
        }
        if (!this.f13089f.equals(lyVar.f13089f)) {
            return false;
        }
        if (this.f13090g == null) {
            if (lyVar.f13090g != null) {
                return false;
            }
        } else if (!this.f13090g.equals(lyVar.f13090g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lyVar.aO);
        }
        if (lyVar.aO == null || lyVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f13085b.hashCode()) * 31) + this.f13086c.hashCode()) * 31) + this.f13087d.hashCode();
        eu euVar = this.f13088e;
        hashCode = (((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31) + this.f13089f.hashCode();
        lz lzVar = this.f13090g;
        hashCode = ((lzVar == null ? 0 : lzVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13084a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13085b);
        }
        if ((this.f13084a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13086c);
        }
        if ((this.f13084a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f13087d);
        }
        if (this.f13088e != null) {
            codedOutputByteBufferNano.b(4, this.f13088e);
        }
        if ((this.f13084a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f13089f);
        }
        if (this.f13090g != null) {
            codedOutputByteBufferNano.b(6, this.f13090g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13084a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13085b);
        }
        if ((this.f13084a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13086c);
        }
        if ((this.f13084a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f13087d);
        }
        if (this.f13088e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f13088e);
        }
        if ((this.f13084a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f13089f);
        }
        if (this.f13090g != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f13090g);
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
                    this.f13085b = aVar.f();
                    this.f13084a |= 1;
                    continue;
                case 18:
                    this.f13086c = aVar.f();
                    this.f13084a |= 2;
                    continue;
                case 26:
                    this.f13087d = aVar.f();
                    this.f13084a |= 4;
                    continue;
                case 34:
                    if (this.f13088e == null) {
                        this.f13088e = new eu();
                    }
                    aVar.a(this.f13088e);
                    continue;
                case 42:
                    this.f13089f = aVar.f();
                    this.f13084a |= 8;
                    continue;
                case 50:
                    if (this.f13090g == null) {
                        this.f13090g = new lz();
                    }
                    aVar.a(this.f13090g);
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
