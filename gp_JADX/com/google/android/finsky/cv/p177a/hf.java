package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hf extends C0758b {
    public int f12546a;
    public String f12547b;
    public bd f12548c;
    public String f12549d;
    public String f12550e;
    public String f12551f;
    public String f12552g;

    public hf() {
        this.f12546a = 0;
        this.f12547b = "";
        this.f12548c = null;
        this.f12549d = "";
        this.f12550e = "";
        this.f12551f = "";
        this.f12552g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj;
        if ((this.f12546a & 1) != (hfVar.f12546a & 1)) {
            return false;
        }
        if (!this.f12547b.equals(hfVar.f12547b)) {
            return false;
        }
        if (this.f12548c == null) {
            if (hfVar.f12548c != null) {
                return false;
            }
        } else if (!this.f12548c.equals(hfVar.f12548c)) {
            return false;
        }
        if ((this.f12546a & 2) != (hfVar.f12546a & 2)) {
            return false;
        }
        if (!this.f12549d.equals(hfVar.f12549d)) {
            return false;
        }
        if ((this.f12546a & 4) != (hfVar.f12546a & 4)) {
            return false;
        }
        if (!this.f12550e.equals(hfVar.f12550e)) {
            return false;
        }
        if ((this.f12546a & 8) != (hfVar.f12546a & 8)) {
            return false;
        }
        if (!this.f12551f.equals(hfVar.f12551f)) {
            return false;
        }
        if ((this.f12546a & 16) != (hfVar.f12546a & 16)) {
            return false;
        }
        if (!this.f12552g.equals(hfVar.f12552g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hfVar.aO);
        }
        if (hfVar.aO == null || hfVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12547b.hashCode();
        bd bdVar = this.f12548c;
        hashCode = ((((((((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f12549d.hashCode()) * 31) + this.f12550e.hashCode()) * 31) + this.f12551f.hashCode()) * 31) + this.f12552g.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12546a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12547b);
        }
        if (this.f12548c != null) {
            codedOutputByteBufferNano.b(2, this.f12548c);
        }
        if ((this.f12546a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12549d);
        }
        if ((this.f12546a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12550e);
        }
        if ((this.f12546a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12551f);
        }
        if ((this.f12546a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f12552g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12546a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12547b);
        }
        if (this.f12548c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12548c);
        }
        if ((this.f12546a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12549d);
        }
        if ((this.f12546a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12550e);
        }
        if ((this.f12546a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12551f);
        }
        if ((this.f12546a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f12552g);
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
                    this.f12547b = aVar.f();
                    this.f12546a |= 1;
                    continue;
                case 18:
                    if (this.f12548c == null) {
                        this.f12548c = new bd();
                    }
                    aVar.a(this.f12548c);
                    continue;
                case 26:
                    this.f12549d = aVar.f();
                    this.f12546a |= 2;
                    continue;
                case 34:
                    this.f12550e = aVar.f();
                    this.f12546a |= 4;
                    continue;
                case 42:
                    this.f12551f = aVar.f();
                    this.f12546a |= 8;
                    continue;
                case 50:
                    this.f12552g = aVar.f();
                    this.f12546a |= 16;
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
