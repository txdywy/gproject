package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ac extends b {
    public Long f39825a;
    public Integer f39826b;
    public String[] f39827c;

    public ac() {
        this.f39825a = null;
        this.f39826b = null;
        this.f39827c = C7222l.f35477j;
        this.aP = -1;
    }

    public final void m37065a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39825a != null) {
            codedOutputByteBufferNano.m33531b(1, this.f39825a.longValue());
        }
        if (this.f39826b != null) {
            codedOutputByteBufferNano.m33534c(2, this.f39826b.intValue());
        }
        if (this.f39827c != null && this.f39827c.length > 0) {
            for (String str : this.f39827c) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(3, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37066b() {
        int i = 0;
        int b = super.b();
        if (this.f39825a != null) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f39825a.longValue());
        }
        if (this.f39826b != null) {
            b += CodedOutputByteBufferNano.m33504e(2, this.f39826b.intValue());
        }
        if (this.f39827c == null || this.f39827c.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f39827c.length) {
            String str = this.f39827c[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.m33495b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    public final /* synthetic */ i m37064a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39825a = Long.valueOf(c7213a.m33568j());
                    continue;
                case 16:
                    this.f39826b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f39827c == null ? 0 : this.f39827c.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39827c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f39827c = obj;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
