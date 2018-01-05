package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class al extends C0758b {
    public int f11807a;
    public String f11808b;
    public ak f11809c;

    public final ak aE_() {
        if (this.f11807a == 1) {
            return this.f11809c;
        }
        return null;
    }

    public al() {
        this.f11807a = -1;
        this.f11807a = -1;
        this.f11808b = "";
        this.f11807a = -1;
        this.f11809c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (this.f11807a != alVar.f11807a) {
            return false;
        }
        if (this.f11807a == 0 && !this.f11808b.equals(alVar.f11808b)) {
            return false;
        }
        if (this.f11809c == null) {
            if (alVar.f11809c != null) {
                return false;
            }
        } else if (!this.f11809c.equals(alVar.f11809c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(alVar.aO);
        }
        if (alVar.aO == null || alVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        String str = this.f11808b;
        if (this.f11807a != 0) {
            str = "";
        }
        hashCode = (hashCode * 31) + str.hashCode();
        ak akVar = this.f11809c;
        if (this.f11807a != 1) {
            akVar = null;
        }
        int hashCode2 = ((akVar == null ? 0 : akVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode2 + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11807a == 0) {
            codedOutputByteBufferNano.a(1, this.f11808b);
        }
        if (this.f11807a == 1) {
            codedOutputByteBufferNano.b(2, this.f11809c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11807a == 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11808b);
        }
        if (this.f11807a == 1) {
            return b + CodedOutputByteBufferNano.d(2, this.f11809c);
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
                    this.f11808b = aVar.f();
                    this.f11807a = 0;
                    continue;
                case 18:
                    if (this.f11809c == null) {
                        this.f11809c = new ak();
                    }
                    aVar.a(this.f11809c);
                    this.f11807a = 1;
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
