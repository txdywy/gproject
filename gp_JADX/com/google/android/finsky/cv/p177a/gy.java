package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gy extends C0758b {
    public gw f12513a;
    public hb f12514b;
    public dh f12515c;
    public C2434h f12516d;
    public le f12517e;
    public jd f12518f;

    public gy() {
        this.f12513a = null;
        this.f12514b = null;
        this.f12515c = null;
        this.f12516d = null;
        this.f12517e = null;
        this.f12518f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gy)) {
            return false;
        }
        gy gyVar = (gy) obj;
        if (this.f12513a == null) {
            if (gyVar.f12513a != null) {
                return false;
            }
        } else if (!this.f12513a.equals(gyVar.f12513a)) {
            return false;
        }
        if (this.f12514b == null) {
            if (gyVar.f12514b != null) {
                return false;
            }
        } else if (!this.f12514b.equals(gyVar.f12514b)) {
            return false;
        }
        if (this.f12515c == null) {
            if (gyVar.f12515c != null) {
                return false;
            }
        } else if (!this.f12515c.equals(gyVar.f12515c)) {
            return false;
        }
        if (this.f12516d == null) {
            if (gyVar.f12516d != null) {
                return false;
            }
        } else if (!this.f12516d.equals(gyVar.f12516d)) {
            return false;
        }
        if (this.f12517e == null) {
            if (gyVar.f12517e != null) {
                return false;
            }
        } else if (!this.f12517e.equals(gyVar.f12517e)) {
            return false;
        }
        if (this.f12518f == null) {
            if (gyVar.f12518f != null) {
                return false;
            }
        } else if (!this.f12518f.equals(gyVar.f12518f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gyVar.aO);
        }
        if (gyVar.aO == null || gyVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        gw gwVar = this.f12513a;
        hashCode = (gwVar == null ? 0 : gwVar.hashCode()) + (hashCode * 31);
        hb hbVar = this.f12514b;
        hashCode = (hbVar == null ? 0 : hbVar.hashCode()) + (hashCode * 31);
        dh dhVar = this.f12515c;
        hashCode = (dhVar == null ? 0 : dhVar.hashCode()) + (hashCode * 31);
        C2434h c2434h = this.f12516d;
        hashCode = (c2434h == null ? 0 : c2434h.hashCode()) + (hashCode * 31);
        le leVar = this.f12517e;
        hashCode = (leVar == null ? 0 : leVar.hashCode()) + (hashCode * 31);
        jd jdVar = this.f12518f;
        hashCode = ((jdVar == null ? 0 : jdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12513a != null) {
            codedOutputByteBufferNano.b(1, this.f12513a);
        }
        if (this.f12514b != null) {
            codedOutputByteBufferNano.b(2, this.f12514b);
        }
        if (this.f12515c != null) {
            codedOutputByteBufferNano.b(3, this.f12515c);
        }
        if (this.f12516d != null) {
            codedOutputByteBufferNano.b(4, this.f12516d);
        }
        if (this.f12517e != null) {
            codedOutputByteBufferNano.b(5, this.f12517e);
        }
        if (this.f12518f != null) {
            codedOutputByteBufferNano.b(6, this.f12518f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12513a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12513a);
        }
        if (this.f12514b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12514b);
        }
        if (this.f12515c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12515c);
        }
        if (this.f12516d != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12516d);
        }
        if (this.f12517e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12517e);
        }
        if (this.f12518f != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f12518f);
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
                    if (this.f12513a == null) {
                        this.f12513a = new gw();
                    }
                    aVar.a(this.f12513a);
                    continue;
                case 18:
                    if (this.f12514b == null) {
                        this.f12514b = new hb();
                    }
                    aVar.a(this.f12514b);
                    continue;
                case 26:
                    if (this.f12515c == null) {
                        this.f12515c = new dh();
                    }
                    aVar.a(this.f12515c);
                    continue;
                case 34:
                    if (this.f12516d == null) {
                        this.f12516d = new C2434h();
                    }
                    aVar.a(this.f12516d);
                    continue;
                case 42:
                    if (this.f12517e == null) {
                        this.f12517e = new le();
                    }
                    aVar.a(this.f12517e);
                    continue;
                case 50:
                    if (this.f12518f == null) {
                        this.f12518f = new jd();
                    }
                    aVar.a(this.f12518f);
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
