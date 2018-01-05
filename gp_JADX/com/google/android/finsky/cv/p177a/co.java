package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class co extends C0758b {
    public C2441n f12048a;
    public C2433g f12049b;
    public C2448u f12050c;
    public jw f12051d;
    public af f12052e;
    public lq f12053f;
    public kf f12054g;
    public ey f12055h;
    public la f12056i;
    public kz f12057j;
    public ky f12058k;
    public cp f12059l;
    public ct f12060m;
    public ci f12061n;
    public ag f12062o;

    public co() {
        this.f12048a = null;
        this.f12049b = null;
        this.f12050c = null;
        this.f12051d = null;
        this.f12052e = null;
        this.f12053f = null;
        this.f12054g = null;
        this.f12055h = null;
        this.f12056i = null;
        this.f12057j = null;
        this.f12058k = null;
        this.f12059l = null;
        this.f12060m = null;
        this.f12061n = null;
        this.f12062o = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        if (this.f12048a == null) {
            if (coVar.f12048a != null) {
                return false;
            }
        } else if (!this.f12048a.equals(coVar.f12048a)) {
            return false;
        }
        if (this.f12049b == null) {
            if (coVar.f12049b != null) {
                return false;
            }
        } else if (!this.f12049b.equals(coVar.f12049b)) {
            return false;
        }
        if (this.f12050c == null) {
            if (coVar.f12050c != null) {
                return false;
            }
        } else if (!this.f12050c.equals(coVar.f12050c)) {
            return false;
        }
        if (this.f12051d == null) {
            if (coVar.f12051d != null) {
                return false;
            }
        } else if (!this.f12051d.equals(coVar.f12051d)) {
            return false;
        }
        if (this.f12052e == null) {
            if (coVar.f12052e != null) {
                return false;
            }
        } else if (!this.f12052e.equals(coVar.f12052e)) {
            return false;
        }
        if (this.f12053f == null) {
            if (coVar.f12053f != null) {
                return false;
            }
        } else if (!this.f12053f.equals(coVar.f12053f)) {
            return false;
        }
        if (this.f12054g == null) {
            if (coVar.f12054g != null) {
                return false;
            }
        } else if (!this.f12054g.equals(coVar.f12054g)) {
            return false;
        }
        if (this.f12055h == null) {
            if (coVar.f12055h != null) {
                return false;
            }
        } else if (!this.f12055h.equals(coVar.f12055h)) {
            return false;
        }
        if (this.f12056i == null) {
            if (coVar.f12056i != null) {
                return false;
            }
        } else if (!this.f12056i.equals(coVar.f12056i)) {
            return false;
        }
        if (this.f12057j == null) {
            if (coVar.f12057j != null) {
                return false;
            }
        } else if (!this.f12057j.equals(coVar.f12057j)) {
            return false;
        }
        if (this.f12058k == null) {
            if (coVar.f12058k != null) {
                return false;
            }
        } else if (!this.f12058k.equals(coVar.f12058k)) {
            return false;
        }
        if (this.f12059l == null) {
            if (coVar.f12059l != null) {
                return false;
            }
        } else if (!this.f12059l.equals(coVar.f12059l)) {
            return false;
        }
        if (this.f12060m == null) {
            if (coVar.f12060m != null) {
                return false;
            }
        } else if (!this.f12060m.equals(coVar.f12060m)) {
            return false;
        }
        if (this.f12061n == null) {
            if (coVar.f12061n != null) {
                return false;
            }
        } else if (!this.f12061n.equals(coVar.f12061n)) {
            return false;
        }
        if (this.f12062o == null) {
            if (coVar.f12062o != null) {
                return false;
            }
        } else if (!this.f12062o.equals(coVar.f12062o)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(coVar.aO);
        }
        if (coVar.aO == null || coVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C2441n c2441n = this.f12048a;
        hashCode = (c2441n == null ? 0 : c2441n.hashCode()) + (hashCode * 31);
        C2433g c2433g = this.f12049b;
        hashCode = (c2433g == null ? 0 : c2433g.hashCode()) + (hashCode * 31);
        C2448u c2448u = this.f12050c;
        hashCode = (c2448u == null ? 0 : c2448u.hashCode()) + (hashCode * 31);
        jw jwVar = this.f12051d;
        hashCode = (jwVar == null ? 0 : jwVar.hashCode()) + (hashCode * 31);
        af afVar = this.f12052e;
        hashCode = (afVar == null ? 0 : afVar.hashCode()) + (hashCode * 31);
        lq lqVar = this.f12053f;
        hashCode = (lqVar == null ? 0 : lqVar.hashCode()) + (hashCode * 31);
        kf kfVar = this.f12054g;
        hashCode = (kfVar == null ? 0 : kfVar.hashCode()) + (hashCode * 31);
        ey eyVar = this.f12055h;
        hashCode = (eyVar == null ? 0 : eyVar.hashCode()) + (hashCode * 31);
        la laVar = this.f12056i;
        hashCode = (laVar == null ? 0 : laVar.hashCode()) + (hashCode * 31);
        kz kzVar = this.f12057j;
        hashCode = (kzVar == null ? 0 : kzVar.hashCode()) + (hashCode * 31);
        ky kyVar = this.f12058k;
        hashCode = (kyVar == null ? 0 : kyVar.hashCode()) + (hashCode * 31);
        cp cpVar = this.f12059l;
        hashCode = (cpVar == null ? 0 : cpVar.hashCode()) + (hashCode * 31);
        ct ctVar = this.f12060m;
        hashCode = (ctVar == null ? 0 : ctVar.hashCode()) + (hashCode * 31);
        ci ciVar = this.f12061n;
        hashCode = (ciVar == null ? 0 : ciVar.hashCode()) + (hashCode * 31);
        ag agVar = this.f12062o;
        hashCode = ((agVar == null ? 0 : agVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12048a != null) {
            codedOutputByteBufferNano.b(1, this.f12048a);
        }
        if (this.f12049b != null) {
            codedOutputByteBufferNano.b(2, this.f12049b);
        }
        if (this.f12050c != null) {
            codedOutputByteBufferNano.b(3, this.f12050c);
        }
        if (this.f12051d != null) {
            codedOutputByteBufferNano.b(4, this.f12051d);
        }
        if (this.f12052e != null) {
            codedOutputByteBufferNano.b(5, this.f12052e);
        }
        if (this.f12053f != null) {
            codedOutputByteBufferNano.b(6, this.f12053f);
        }
        if (this.f12054g != null) {
            codedOutputByteBufferNano.b(7, this.f12054g);
        }
        if (this.f12055h != null) {
            codedOutputByteBufferNano.b(8, this.f12055h);
        }
        if (this.f12056i != null) {
            codedOutputByteBufferNano.b(9, this.f12056i);
        }
        if (this.f12057j != null) {
            codedOutputByteBufferNano.b(10, this.f12057j);
        }
        if (this.f12058k != null) {
            codedOutputByteBufferNano.b(11, this.f12058k);
        }
        if (this.f12059l != null) {
            codedOutputByteBufferNano.b(12, this.f12059l);
        }
        if (this.f12060m != null) {
            codedOutputByteBufferNano.b(13, this.f12060m);
        }
        if (this.f12061n != null) {
            codedOutputByteBufferNano.b(14, this.f12061n);
        }
        if (this.f12062o != null) {
            codedOutputByteBufferNano.b(15, this.f12062o);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12048a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12048a);
        }
        if (this.f12049b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12049b);
        }
        if (this.f12050c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12050c);
        }
        if (this.f12051d != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12051d);
        }
        if (this.f12052e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12052e);
        }
        if (this.f12053f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f12053f);
        }
        if (this.f12054g != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12054g);
        }
        if (this.f12055h != null) {
            b += CodedOutputByteBufferNano.d(8, this.f12055h);
        }
        if (this.f12056i != null) {
            b += CodedOutputByteBufferNano.d(9, this.f12056i);
        }
        if (this.f12057j != null) {
            b += CodedOutputByteBufferNano.d(10, this.f12057j);
        }
        if (this.f12058k != null) {
            b += CodedOutputByteBufferNano.d(11, this.f12058k);
        }
        if (this.f12059l != null) {
            b += CodedOutputByteBufferNano.d(12, this.f12059l);
        }
        if (this.f12060m != null) {
            b += CodedOutputByteBufferNano.d(13, this.f12060m);
        }
        if (this.f12061n != null) {
            b += CodedOutputByteBufferNano.d(14, this.f12061n);
        }
        if (this.f12062o != null) {
            return b + CodedOutputByteBufferNano.d(15, this.f12062o);
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
                    if (this.f12048a == null) {
                        this.f12048a = new C2441n();
                    }
                    aVar.a(this.f12048a);
                    continue;
                case 18:
                    if (this.f12049b == null) {
                        this.f12049b = new C2433g();
                    }
                    aVar.a(this.f12049b);
                    continue;
                case 26:
                    if (this.f12050c == null) {
                        this.f12050c = new C2448u();
                    }
                    aVar.a(this.f12050c);
                    continue;
                case 34:
                    if (this.f12051d == null) {
                        this.f12051d = new jw();
                    }
                    aVar.a(this.f12051d);
                    continue;
                case 42:
                    if (this.f12052e == null) {
                        this.f12052e = new af();
                    }
                    aVar.a(this.f12052e);
                    continue;
                case 50:
                    if (this.f12053f == null) {
                        this.f12053f = new lq();
                    }
                    aVar.a(this.f12053f);
                    continue;
                case 58:
                    if (this.f12054g == null) {
                        this.f12054g = new kf();
                    }
                    aVar.a(this.f12054g);
                    continue;
                case 66:
                    if (this.f12055h == null) {
                        this.f12055h = new ey();
                    }
                    aVar.a(this.f12055h);
                    continue;
                case 74:
                    if (this.f12056i == null) {
                        this.f12056i = new la();
                    }
                    aVar.a(this.f12056i);
                    continue;
                case 82:
                    if (this.f12057j == null) {
                        this.f12057j = new kz();
                    }
                    aVar.a(this.f12057j);
                    continue;
                case 90:
                    if (this.f12058k == null) {
                        this.f12058k = new ky();
                    }
                    aVar.a(this.f12058k);
                    continue;
                case 98:
                    if (this.f12059l == null) {
                        this.f12059l = new cp();
                    }
                    aVar.a(this.f12059l);
                    continue;
                case 106:
                    if (this.f12060m == null) {
                        this.f12060m = new ct();
                    }
                    aVar.a(this.f12060m);
                    continue;
                case 114:
                    if (this.f12061n == null) {
                        this.f12061n = new ci();
                    }
                    aVar.a(this.f12061n);
                    continue;
                case 122:
                    if (this.f12062o == null) {
                        this.f12062o = new ag();
                    }
                    aVar.a(this.f12062o);
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
