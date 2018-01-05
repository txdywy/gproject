package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class an extends b {
    public static volatile an[] f39858a;
    public String f39859b;
    public String f39860c;
    public Integer f39861d;
    public Integer f39862e;
    public Integer f39863f;
    public Integer f39864g;
    public Integer f39865h;
    public int f39866i;
    public bn[] f39867j;
    public C7696c f39868k;
    public am f39869l;
    public al f39870m;
    public Long f39871n;
    public int f39872o;
    public int f39873p;
    public Integer f39874q;
    public Integer f39875r;
    public String f39876s;
    public long[] f39877t;
    public int f39878u;
    public String f39879v;

    public static an[] m37101d() {
        if (f39858a == null) {
            synchronized (C7219h.f35465b) {
                if (f39858a == null) {
                    f39858a = new an[0];
                }
            }
        }
        return f39858a;
    }

    public an() {
        this.f39859b = null;
        this.f39860c = null;
        this.f39861d = null;
        this.f39862e = null;
        this.f39863f = null;
        this.f39864g = null;
        this.f39865h = null;
        this.f39866i = Integer.MIN_VALUE;
        this.f39867j = bn.m37199d();
        this.f39868k = null;
        this.f39869l = null;
        this.f39870m = null;
        this.f39871n = null;
        this.f39872o = Integer.MIN_VALUE;
        this.f39873p = Integer.MIN_VALUE;
        this.f39874q = null;
        this.f39875r = null;
        this.f39876s = null;
        this.f39877t = C7222l.f35473f;
        this.f39878u = Integer.MIN_VALUE;
        this.f39879v = null;
        this.aP = -1;
    }

    public final void m37103a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f39859b != null) {
            codedOutputByteBufferNano.m33521a(1, this.f39859b);
        }
        if (this.f39860c != null) {
            codedOutputByteBufferNano.m33521a(2, this.f39860c);
        }
        if (this.f39861d != null) {
            codedOutputByteBufferNano.m33518a(3, this.f39861d.intValue());
        }
        if (this.f39862e != null) {
            codedOutputByteBufferNano.m33518a(4, this.f39862e.intValue());
        }
        if (this.f39863f != null) {
            codedOutputByteBufferNano.m33518a(5, this.f39863f.intValue());
        }
        if (this.f39864g != null) {
            codedOutputByteBufferNano.m33534c(6, this.f39864g.intValue());
        }
        if (this.f39865h != null) {
            codedOutputByteBufferNano.m33534c(7, this.f39865h.intValue());
        }
        if (this.f39866i != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(8, this.f39866i);
        }
        if (this.f39867j != null && this.f39867j.length > 0) {
            for (i iVar : this.f39867j) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(9, iVar);
                }
            }
        }
        if (this.f39868k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f39868k);
        }
        if (this.f39869l != null) {
            codedOutputByteBufferNano.m33532b(11, this.f39869l);
        }
        if (this.f39870m != null) {
            codedOutputByteBufferNano.m33532b(12, this.f39870m);
        }
        if (this.f39871n != null) {
            codedOutputByteBufferNano.m33531b(13, this.f39871n.longValue());
        }
        if (this.f39872o != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(14, this.f39872o);
        }
        if (this.f39873p != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(15, this.f39873p);
        }
        if (this.f39875r != null) {
            codedOutputByteBufferNano.m33518a(16, this.f39875r.intValue());
        }
        if (this.f39876s != null) {
            codedOutputByteBufferNano.m33521a(17, this.f39876s);
        }
        if (this.f39878u != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(18, this.f39878u);
        }
        if (this.f39874q != null) {
            codedOutputByteBufferNano.m33518a(19, this.f39874q.intValue());
        }
        if (this.f39879v != null) {
            codedOutputByteBufferNano.m33521a(20, this.f39879v);
        }
        if (this.f39877t != null && this.f39877t.length > 0) {
            while (i < this.f39877t.length) {
                codedOutputByteBufferNano.m33535c(21, this.f39877t[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37104b() {
        int b = super.b();
        if (this.f39859b != null) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39859b);
        }
        if (this.f39860c != null) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39860c);
        }
        if (this.f39861d != null) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f39861d.intValue());
        }
        if (this.f39862e != null) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f39862e.intValue());
        }
        if (this.f39863f != null) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f39863f.intValue());
        }
        if (this.f39864g != null) {
            b += CodedOutputByteBufferNano.m33504e(6, this.f39864g.intValue());
        }
        if (this.f39865h != null) {
            b += CodedOutputByteBufferNano.m33504e(7, this.f39865h.intValue());
        }
        if (this.f39866i != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f39866i);
        }
        if (this.f39867j != null && this.f39867j.length > 0) {
            int i = b;
            for (i iVar : this.f39867j) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(9, iVar);
                }
            }
            b = i;
        }
        if (this.f39868k != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f39868k);
        }
        if (this.f39869l != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f39869l);
        }
        if (this.f39870m != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f39870m);
        }
        if (this.f39871n != null) {
            b += CodedOutputByteBufferNano.m33508f(13, this.f39871n.longValue());
        }
        if (this.f39872o != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(14, this.f39872o);
        }
        if (this.f39873p != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(15, this.f39873p);
        }
        if (this.f39875r != null) {
            b += CodedOutputByteBufferNano.m33502d(16, this.f39875r.intValue());
        }
        if (this.f39876s != null) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f39876s);
        }
        if (this.f39878u != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(18, this.f39878u);
        }
        if (this.f39874q != null) {
            b += CodedOutputByteBufferNano.m33502d(19, this.f39874q.intValue());
        }
        if (this.f39879v != null) {
            b += CodedOutputByteBufferNano.m33493b(20, this.f39879v);
        }
        if (this.f39877t == null || this.f39877t.length <= 0) {
            return b;
        }
        return (b + (this.f39877t.length * 8)) + (this.f39877t.length * 2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.an m37100b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 24: goto L_0x001d;
            case 32: goto L_0x0028;
            case 40: goto L_0x0033;
            case 48: goto L_0x003e;
            case 56: goto L_0x0049;
            case 64: goto L_0x0054;
            case 74: goto L_0x0086;
            case 82: goto L_0x00c6;
            case 90: goto L_0x00d8;
            case 98: goto L_0x00ea;
            case 104: goto L_0x00fc;
            case 112: goto L_0x0108;
            case 120: goto L_0x013b;
            case 128: goto L_0x016e;
            case 138: goto L_0x017a;
            case 144: goto L_0x0182;
            case 152: goto L_0x01b5;
            case 162: goto L_0x01c1;
            case 169: goto L_0x01c9;
            case 170: goto L_0x01fd;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.m33564f();
        r7.f39859b = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r8.m33564f();
        r7.f39860c = r0;
        goto L_0x0001;
    L_0x001d:
        r0 = r8.m33567i();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39861d = r0;
        goto L_0x0001;
    L_0x0028:
        r0 = r8.m33567i();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39862e = r0;
        goto L_0x0001;
    L_0x0033:
        r0 = r8.m33567i();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39863f = r0;
        goto L_0x0001;
    L_0x003e:
        r0 = r8.m33567i();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39864g = r0;
        goto L_0x0001;
    L_0x0049:
        r0 = r8.m33567i();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39865h = r0;
        goto L_0x0001;
    L_0x0054:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x007a }
        switch(r3) {
            case 0: goto L_0x0082;
            case 1: goto L_0x0082;
            case 2: goto L_0x0082;
            case 3: goto L_0x0082;
            case 4: goto L_0x0082;
            case 5: goto L_0x0082;
            case 6: goto L_0x0082;
            default: goto L_0x005f;
        };	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x005f:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007a }
        r5 = 57;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007a }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        r5 = " is not a valid enum RequestNegotiatedProtocol";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x007a }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0082:
        r7.f39866i = r3;	 Catch:{ IllegalArgumentException -> 0x007a }
        goto L_0x0001;
    L_0x0086:
        r0 = 74;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39867j;
        if (r0 != 0) goto L_0x00b2;
    L_0x0090:
        r0 = r1;
    L_0x0091:
        r2 = r2 + r0;
        r2 = new p529d.p530a.p531a.p532a.p533a.p534a.bn[r2];
        if (r0 == 0) goto L_0x009b;
    L_0x0096:
        r3 = r7.f39867j;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x009b:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00b6;
    L_0x00a0:
        r3 = new d.a.a.a.a.a.bn;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x009b;
    L_0x00b2:
        r0 = r7.f39867j;
        r0 = r0.length;
        goto L_0x0091;
    L_0x00b6:
        r3 = new d.a.a.a.a.a.bn;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f39867j = r2;
        goto L_0x0001;
    L_0x00c6:
        r0 = r7.f39868k;
        if (r0 != 0) goto L_0x00d1;
    L_0x00ca:
        r0 = new d.a.a.a.a.a.c;
        r0.<init>();
        r7.f39868k = r0;
    L_0x00d1:
        r0 = r7.f39868k;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00d8:
        r0 = r7.f39869l;
        if (r0 != 0) goto L_0x00e3;
    L_0x00dc:
        r0 = new d.a.a.a.a.a.am;
        r0.<init>();
        r7.f39869l = r0;
    L_0x00e3:
        r0 = r7.f39869l;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00ea:
        r0 = r7.f39870m;
        if (r0 != 0) goto L_0x00f5;
    L_0x00ee:
        r0 = new d.a.a.a.a.a.al;
        r0.<init>();
        r7.f39870m = r0;
    L_0x00f5:
        r0 = r7.f39870m;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00fc:
        r2 = r8.m33559c();
        r0 = java.lang.Long.valueOf(r2);
        r7.f39871n = r0;
        goto L_0x0001;
    L_0x0108:
        r2 = r8.m33573o();
        r3 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x012e }
        switch(r3) {
            case 0: goto L_0x0137;
            case 1: goto L_0x0137;
            case 2: goto L_0x0137;
            case 3: goto L_0x0137;
            default: goto L_0x0113;
        };	 Catch:{ IllegalArgumentException -> 0x012e }
    L_0x0113:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x012e }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012e }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x012e }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x012e }
        r5 = " is not a valid enum RequestStatus";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x012e }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x012e }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x012e }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x012e }
    L_0x012e:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0137:
        r7.f39872o = r3;	 Catch:{ IllegalArgumentException -> 0x012e }
        goto L_0x0001;
    L_0x013b:
        r2 = r8.m33573o();
        r3 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x0161 }
        switch(r3) {
            case 0: goto L_0x016a;
            case 1: goto L_0x016a;
            case 2: goto L_0x016a;
            case 3: goto L_0x016a;
            case 4: goto L_0x016a;
            case 5: goto L_0x016a;
            case 6: goto L_0x016a;
            case 7: goto L_0x016a;
            case 8: goto L_0x016a;
            case 9: goto L_0x016a;
            case 10: goto L_0x016a;
            case 11: goto L_0x016a;
            case 12: goto L_0x016a;
            default: goto L_0x0146;
        };	 Catch:{ IllegalArgumentException -> 0x0161 }
    L_0x0146:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0161 }
        r5 = 51;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0161 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0161 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0161 }
        r5 = " is not a valid enum RequestFailedReason";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0161 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0161 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0161 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0161 }
    L_0x0161:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x016a:
        r7.f39873p = r3;	 Catch:{ IllegalArgumentException -> 0x0161 }
        goto L_0x0001;
    L_0x016e:
        r0 = r8.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39875r = r0;
        goto L_0x0001;
    L_0x017a:
        r0 = r8.m33564f();
        r7.f39876s = r0;
        goto L_0x0001;
    L_0x0182:
        r2 = r8.m33573o();
        r3 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x01a8 }
        switch(r3) {
            case 0: goto L_0x01b1;
            case 1: goto L_0x01b1;
            case 2: goto L_0x01b1;
            case 3: goto L_0x01b1;
            case 4: goto L_0x01b1;
            case 5: goto L_0x01b1;
            case 6: goto L_0x01b1;
            case 7: goto L_0x01b1;
            default: goto L_0x018d;
        };	 Catch:{ IllegalArgumentException -> 0x01a8 }
    L_0x018d:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x01a8 }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01a8 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x01a8 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x01a8 }
        r5 = " is not a valid enum HttpMethod";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x01a8 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x01a8 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x01a8 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x01a8 }
    L_0x01a8:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x01b1:
        r7.f39878u = r3;	 Catch:{ IllegalArgumentException -> 0x01a8 }
        goto L_0x0001;
    L_0x01b5:
        r0 = r8.m33560d();
        r0 = java.lang.Integer.valueOf(r0);
        r7.f39874q = r0;
        goto L_0x0001;
    L_0x01c1:
        r0 = r8.m33564f();
        r7.f39879v = r0;
        goto L_0x0001;
    L_0x01c9:
        r0 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f39877t;
        if (r0 != 0) goto L_0x01ef;
    L_0x01d3:
        r0 = r1;
    L_0x01d4:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x01de;
    L_0x01d9:
        r3 = r7.f39877t;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x01de:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01f3;
    L_0x01e3:
        r4 = r8.m33570l();
        r2[r0] = r4;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x01de;
    L_0x01ef:
        r0 = r7.f39877t;
        r0 = r0.length;
        goto L_0x01d4;
    L_0x01f3:
        r4 = r8.m33570l();
        r2[r0] = r4;
        r7.f39877t = r2;
        goto L_0x0001;
    L_0x01fd:
        r0 = r8.m33567i();
        r2 = r8.m33558c(r0);
        r3 = r0 / 8;
        r0 = r7.f39877t;
        if (r0 != 0) goto L_0x0222;
    L_0x020b:
        r0 = r1;
    L_0x020c:
        r3 = r3 + r0;
        r3 = new long[r3];
        if (r0 == 0) goto L_0x0216;
    L_0x0211:
        r4 = r7.f39877t;
        java.lang.System.arraycopy(r4, r1, r3, r1, r0);
    L_0x0216:
        r4 = r3.length;
        if (r0 >= r4) goto L_0x0226;
    L_0x0219:
        r4 = r8.m33570l();
        r3[r0] = r4;
        r0 = r0 + 1;
        goto L_0x0216;
    L_0x0222:
        r0 = r7.f39877t;
        r0 = r0.length;
        goto L_0x020c;
    L_0x0226:
        r7.f39877t = r3;
        r8.m33561d(r2);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.an.b(com.google.protobuf.nano.a):d.a.a.a.a.a.an");
    }

    public final /* synthetic */ i m37102a(C7213a c7213a) {
        return m37100b(c7213a);
    }
}
