package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0807d extends C0758b {
    public C0811h f5125a;
    public String[] f5126b;
    public String f5127c;

    public C0807d() {
        this.f5125a = null;
        this.f5126b = l.j;
        this.f5127c = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5126b != null && this.f5126b.length > 0) {
            for (String str : this.f5126b) {
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        if (!(this.f5127c == null || this.f5127c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5127c);
        }
        if (this.f5125a != null) {
            codedOutputByteBufferNano.b(7, this.f5125a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5126b == null || this.f5126b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f5126b.length) {
                String str = this.f5126b[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (!(this.f5127c == null || this.f5127c.equals(""))) {
            i += CodedOutputByteBufferNano.b(3, this.f5127c);
        }
        if (this.f5125a != null) {
            return i + CodedOutputByteBufferNano.d(7, this.f5125a);
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f5126b == null ? 0 : this.f5126b.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5126b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f5126b = obj;
                    continue;
                case 26:
                    this.f5127c = aVar.f();
                    continue;
                case 58:
                    if (this.f5125a == null) {
                        this.f5125a = new C0811h();
                    }
                    aVar.a(this.f5125a);
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
