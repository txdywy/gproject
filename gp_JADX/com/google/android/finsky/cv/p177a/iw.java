package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class iw extends C0758b {
    public static volatile iw[] f12740a;
    public int f12741b;
    public String f12742c;
    public String f12743d;
    public bd f12744e;

    public static iw[] bu_() {
        if (f12740a == null) {
            synchronized (h.b) {
                if (f12740a == null) {
                    f12740a = new iw[0];
                }
            }
        }
        return f12740a;
    }

    public iw() {
        this.f12741b = 0;
        this.f12742c = "";
        this.f12743d = "";
        this.f12744e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iw)) {
            return false;
        }
        iw iwVar = (iw) obj;
        if ((this.f12741b & 1) != (iwVar.f12741b & 1)) {
            return false;
        }
        if (!this.f12742c.equals(iwVar.f12742c)) {
            return false;
        }
        if ((this.f12741b & 2) != (iwVar.f12741b & 2)) {
            return false;
        }
        if (!this.f12743d.equals(iwVar.f12743d)) {
            return false;
        }
        if (this.f12744e == null) {
            if (iwVar.f12744e != null) {
                return false;
            }
        } else if (!this.f12744e.equals(iwVar.f12744e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(iwVar.aO);
        }
        if (iwVar.aO == null || iwVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12742c.hashCode()) * 31) + this.f12743d.hashCode();
        bd bdVar = this.f12744e;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12741b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12742c);
        }
        if ((this.f12741b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12743d);
        }
        if (this.f12744e != null) {
            codedOutputByteBufferNano.b(3, this.f12744e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12741b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12742c);
        }
        if ((this.f12741b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12743d);
        }
        if (this.f12744e != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f12744e);
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
                    this.f12742c = aVar.f();
                    this.f12741b |= 1;
                    continue;
                case 18:
                    this.f12743d = aVar.f();
                    this.f12741b |= 2;
                    continue;
                case 26:
                    if (this.f12744e == null) {
                        this.f12744e = new bd();
                    }
                    aVar.a(this.f12744e);
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
