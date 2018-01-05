package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class cy extends C0758b {
    public int f12126a;
    public String[] f12127b;
    public String f12128c;

    public cy() {
        this.f12126a = 0;
        this.f12127b = l.j;
        this.f12128c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        if (!h.a(this.f12127b, cyVar.f12127b)) {
            return false;
        }
        if ((this.f12126a & 1) != (cyVar.f12126a & 1)) {
            return false;
        }
        if (!this.f12128c.equals(cyVar.f12128c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cyVar.aO);
        }
        if (cyVar.aO == null || cyVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12127b)) * 31) + this.f12128c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12127b != null && this.f12127b.length > 0) {
            for (String str : this.f12127b) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if ((this.f12126a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12128c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f12127b == null || this.f12127b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f12127b.length) {
                String str = this.f12127b[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if ((this.f12126a & 1) != 0) {
            return i + CodedOutputByteBufferNano.b(2, this.f12128c);
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f12127b == null ? 0 : this.f12127b.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12127b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f12127b = obj;
                    continue;
                case 18:
                    this.f12128c = aVar.f();
                    this.f12126a |= 1;
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
