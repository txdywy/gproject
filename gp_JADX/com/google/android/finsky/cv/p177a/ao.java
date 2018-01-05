package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ao extends C0758b {
    public static volatile ao[] f11821a;
    public String[] f11822b;

    public static ao[] aF_() {
        if (f11821a == null) {
            synchronized (h.b) {
                if (f11821a == null) {
                    f11821a = new ao[0];
                }
            }
        }
        return f11821a;
    }

    public ao() {
        this.f11822b = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (!h.a(this.f11822b, aoVar.f11822b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(aoVar.aO);
        }
        if (aoVar.aO == null || aoVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + h.a(this.f11822b)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11822b != null && this.f11822b.length > 0) {
            for (String str : this.f11822b) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f11822b == null || this.f11822b.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f11822b.length) {
            String str = this.f11822b[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f11822b == null ? 0 : this.f11822b.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11822b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f11822b = obj;
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
