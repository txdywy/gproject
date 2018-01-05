package com.google.a.a.a.a.b.a.a.f;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.f.a extends com.google.protobuf.nano.b
{

    public String A;
    public int[] B;
    public long C;
    public long D;
    public long E;
    public com.google.a.a.a.a.b.a.a.f.h a;
    public String b;
    public long c;
    public byte[] d;
    public String e;
    public com.google.a.a.a.a.b.a.a.f.c f;
    public String g;
    public f[] h;
    public boolean i;
    public String j;
    public int k;
    public long l;
    public long m;
    public long n;
    public int o;
    public String p;
    public String[] q;
    public String r;
    public String[] s;
    public boolean t;
    public String u;
    public int[] v;
    public int[] w;
    public b[] x;
    public int y;
    public boolean z;

    a() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = com.google.protobuf.nano.l.l;
        this.e = "";
        this.f = 0;
        this.g = "";
        this.h = com.google.a.a.a.a.b.a.a.f.f.a();
        this.i = 0;
        this.j = "";
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = "";
        this.q = com.google.protobuf.nano.l.j;
        this.r = "";
        this.s = com.google.protobuf.nano.l.j;
        this.t = 0;
        this.u = "";
        this.v = com.google.protobuf.nano.l.e;
        this.w = com.google.protobuf.nano.l.e;
        this.x = com.google.a.a.a.a.b.a.a.f.b.a();
        this.y = 0;
        this.z = 0;
        this.A = "";
        this.B = com.google.protobuf.nano.l.e;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.aP = -1;
    }

    public static int a(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                return p0;
            case 4:
                return p0;
            case 5:
                return p0;
            case 6:
                return p0;
            case 7:
                return p0;
            case 8:
                return p0;
            case 9:
                return p0;
            case 10:
                return p0;
            case 11:
                return p0;
            case 12:
                return p0;
            case 13:
                return p0;
            case 14:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(48 + p0 + " is not a valid enum AddressFormField");
    }

    private static int b(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                return p0;
            case 3:
                return p0;
            case 4:
                return p0;
            case 5:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(57 + p0 + " is not a valid enum AddressAutocompleteOption");
    }

    private final com.google.a.a.a.a.b.a.a.f.a b(com.google.protobuf.nano.a p0) {
  7:    v3 = p0.a();
 11:    switch (v3) {
            case 0:
 11:            goto 20;
            case 34:
 11:            goto 21;
            case 40:
 11:            goto 72;
            case 50:
 11:            goto 79;
            case 58:
 11:            goto 86;
            case 74:
 11:            goto 103;
            case 82:
 11:            goto 155;
            case 90:
 11:            goto 163;
            case 96:
 11:            goto 171;
            case 98:
 11:            goto 251;
            case 106:
 11:            goto 342;
            case 112:
 11:            goto 350;
            case 114:
 11:            goto 430;
            case 122:
 11:            goto 521;
            case 160:
 11:            goto 529;
            case 170:
 11:            goto 580;
            case 178:
 11:            goto 644;
            case 200:
 11:            goto 652;
            case 210:
 11:            goto 660;
            case 234:
 11:            goto 668;
            case 240:
 11:            goto 686;
            case 242:
 11:            goto 766;
            case 248:
 11:            goto 857;
            case 256:
 11:            goto 865;
            case 272:
 11:            goto 873;
            case 282:
 11:            goto 881;
            case 288:
 11:            goto 889;
            case 304:
 11:            goto 940;
            case 320:
 11:            goto 948;
            case 338:
 11:            goto 956;
            case 368:
 11:            goto 964;
            case 376:
 11:            goto 972;
            case 392:
 11:            goto 980;
            case 402:
 11:            goto 988;
            case 408:
 11:            goto 1052;
            default:
        }
 18:    if (super.a(p0, v3)) goto 7;
 20:    return this;
 29:    if (this.q == 0)
 31:        v0 = 0;
        else
 61:        v0 = this.q.length;
 33:    v2 = new String[com.google.protobuf.nano.l.a(p0, 34) + v0];
 35:    if (v0 != 0)
 39:        System.arraycopy(this.q, 0, v2, 0, v0);
 42:    while (v0 < v2.length - 1) {
 51:        v2[v0] = p0.f();
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 67:    v2[v0] = p0.f();
 69:    this.q = v2;
 71:    goto 7;
 76:    this.t = p0.e();
 78:    goto 7;
 83:    this.b = p0.f();
 85:    goto 7;
 88:    if (this.f == 0)
 95:        this.f = new com.google.a.a.a.a.b.a.a.f.c();
 99:    p0.a(this.f);
102:    goto 7;
111:    if (this.s == 0)
113:        v0 = 0;
        else
143:        v0 = this.s.length;
115:    v2 = new String[com.google.protobuf.nano.l.a(p0, 74) + v0];
117:    if (v0 != 0)
121:        System.arraycopy(this.s, 0, v2, 0, v0);
124:    while (v0 < v2.length - 1) {
133:        v2[v0] = p0.f();
135:        p0.a();
138:        v0 = v0 + 1;
        }
140:    goto 145;
149:    v2[v0] = p0.f();
151:    this.s = v2;
153:    goto 7;
159:    this.u = p0.f();
161:    goto 7;
167:    this.p = p0.f();
169:    goto 7;
171:    v4 = com.google.protobuf.nano.l.a(p0, 96);
175:    v5 = new int[v4];
177:    v2 = 0;
178:    v0 = 0;
179:    if (v2 >= v4) goto 213;
181:    if (v2 != 0)
183:        p0.a();
198:    v5[v0] = com.google.a.a.a.a.b.a.a.f.a.a(p0.i());
200:    v0 = v0 + 1;
202:    v2 = v2 + 1;
204:    goto 179;
206:    p0.e(p0.o());
209:    this.a(p0, v3);
212:    goto 202;
213:    if (v0 != 0) {
217:        if (this.v == 0)
219:            v2 = 0;
            else
231:            v2 = this.v.length;
220:        if (v2 == 0 && v0 == v5.length)
225:            this.v = v5;
            else {
235:            v3 = new int[v2 + v0];
237:            if (v2 != 0)
241:                System.arraycopy(this.v, 0, v3, 0, v2);
244:            System.arraycopy(v5, 0, v3, v2, v0);
247:            this.v = v3;
            }
        }
227:    goto 7;
263:    v0 = 0;
268:    if (p0.m() <= 0) goto 280;
274:    com.google.a.a.a.a.b.a.a.f.a.a(p0.i());
277:    v0 = v0 + 1;
279:    goto 264;
280:    if (v0 == 0) goto 337;
282:    p0.e(p0.o());
287:    if (this.v == 0)
289:        v2 = 0;
        else
325:        v2 = this.v.length;
291:    v0 = new int[v0 + v2];
293:    if (v2 != 0)
297:        System.arraycopy(this.v, 0, v0, 0, v2);
304:    if (p0.m() <= 0) goto 335;
318:    v0[v2] = com.google.a.a.a.a.b.a.a.f.a.a(p0.i());
320:    v2 = v2 + 1;
322:    goto 300;
328:    p0.e(p0.o());
331:    this.a(p0, 96);
334:    goto 300;
335:    this.v = v0;
337:    p0.d(p0.c(p0.i()));
340:    goto 7;
346:    this.e = p0.f();
348:    goto 7;
350:    v4 = com.google.protobuf.nano.l.a(p0, 112);
354:    v5 = new int[v4];
356:    v2 = 0;
357:    v0 = 0;
358:    if (v2 >= v4) goto 392;
360:    if (v2 != 0)
362:        p0.a();
377:    v5[v0] = com.google.a.a.a.a.b.a.a.f.a.a(p0.i());
379:    v0 = v0 + 1;
381:    v2 = v2 + 1;
383:    goto 358;
385:    p0.e(p0.o());
388:    this.a(p0, v3);
391:    goto 381;
392:    if (v0 != 0) {
396:        if (this.w == 0)
398:            v2 = 0;
            else
410:            v2 = this.w.length;
399:        if (v2 == 0 && v0 == v5.length)
404:            this.w = v5;
            else {
414:            v3 = new int[v2 + v0];
416:            if (v2 != 0)
420:                System.arraycopy(this.w, 0, v3, 0, v2);
423:            System.arraycopy(v5, 0, v3, v2, v0);
426:            this.w = v3;
            }
        }
406:    goto 7;
442:    v0 = 0;
447:    if (p0.m() <= 0) goto 459;
453:    com.google.a.a.a.a.b.a.a.f.a.a(p0.i());
456:    v0 = v0 + 1;
458:    goto 443;
459:    if (v0 == 0) goto 516;
461:    p0.e(p0.o());
466:    if (this.w == 0)
468:        v2 = 0;
        else
504:        v2 = this.w.length;
470:    v0 = new int[v0 + v2];
472:    if (v2 != 0)
476:        System.arraycopy(this.w, 0, v0, 0, v2);
483:    if (p0.m() <= 0) goto 514;
497:    v0[v2] = com.google.a.a.a.a.b.a.a.f.a.a(p0.i());
499:    v2 = v2 + 1;
501:    goto 479;
507:    p0.e(p0.o());
510:    this.a(p0, 112);
513:    goto 479;
514:    this.w = v0;
516:    p0.d(p0.c(p0.i()));
519:    goto 7;
525:    this.g = p0.f();
527:    goto 7;
533:    try {
533:        v2 = p0.i();
537:        switch (v2) {
                case 0:
1081:                break;
                case 1:
1081:                break;
                case 2:
1081:                break;
                case 3:
1081:                break;
                case 4:
1081:                break;
                default:
566:                throw new IllegalArgumentException(47 + v2 + " is not a valid enum EditabilityType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
568:    p0.e(p0.o());
571:    this.a(p0, v3);
574:    goto 7;
576:    try {
576:        this.y = v2;
        }
        catch (IllegalArgumentException ex) {
568:        p0.e(p0.o());
571:        this.a(p0, v3);
        }
578:    goto 7;
588:    if (this.h == 0)
590:        v0 = 0;
        else
626:        v0 = this.h.length;
592:    v2 = new f[com.google.protobuf.nano.l.a(p0, 170) + v0];
594:    if (v0 != 0)
598:        System.arraycopy(this.h, 0, v2, 0, v0);
601:    while (v0 < v2.length - 1) {
611:        v2[v0] = new com.google.a.a.a.a.b.a.a.f.f();
615:        p0.a(v2[v0]);
618:        p0.a();
621:        v0 = v0 + 1;
        }
633:    v2[v0] = new com.google.a.a.a.a.b.a.a.f.f();
637:    p0.a(v2[v0]);
640:    this.h = v2;
642:    goto 7;
648:    this.j = p0.f();
650:    goto 7;
656:    this.c = p0.j();
658:    goto 7;
664:    this.d = p0.g();
666:    goto 7;
670:    if (this.a == 0)
677:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
681:    p0.a(this.a);
684:    goto 7;
686:    v4 = com.google.protobuf.nano.l.a(p0, 240);
690:    v5 = new int[v4];
692:    v2 = 0;
693:    v0 = 0;
694:    if (v2 >= v4) goto 728;
696:    if (v2 != 0)
698:        p0.a();
713:    v5[v0] = com.google.a.a.a.a.b.a.a.f.a.b(p0.i());
715:    v0 = v0 + 1;
717:    v2 = v2 + 1;
719:    goto 694;
721:    p0.e(p0.o());
724:    this.a(p0, v3);
727:    goto 717;
728:    if (v0 != 0) {
732:        if (this.B == 0)
734:            v2 = 0;
            else
746:            v2 = this.B.length;
735:        if (v2 == 0 && v0 == v5.length)
740:            this.B = v5;
            else {
750:            v3 = new int[v2 + v0];
752:            if (v2 != 0)
756:                System.arraycopy(this.B, 0, v3, 0, v2);
759:            System.arraycopy(v5, 0, v3, v2, v0);
762:            this.B = v3;
            }
        }
742:    goto 7;
778:    v0 = 0;
783:    if (p0.m() <= 0) goto 795;
789:    com.google.a.a.a.a.b.a.a.f.a.b(p0.i());
792:    v0 = v0 + 1;
794:    goto 779;
795:    if (v0 == 0) goto 852;
797:    p0.e(p0.o());
802:    if (this.B == 0)
804:        v2 = 0;
        else
840:        v2 = this.B.length;
806:    v0 = new int[v0 + v2];
808:    if (v2 != 0)
812:        System.arraycopy(this.B, 0, v0, 0, v2);
819:    if (p0.m() <= 0) goto 850;
833:    v0[v2] = com.google.a.a.a.a.b.a.a.f.a.b(p0.i());
835:    v2 = v2 + 1;
837:    goto 815;
843:    p0.e(p0.o());
846:    this.a(p0, 240);
849:    goto 815;
850:    this.B = v0;
852:    p0.d(p0.c(p0.i()));
855:    goto 7;
861:    this.C = p0.j();
863:    goto 7;
869:    this.k = p0.i();
871:    goto 7;
877:    this.z = p0.e();
879:    goto 7;
885:    this.A = p0.f();
887:    goto 7;
893:    try {
893:        v2 = p0.i();
897:        switch (v2) {
                case 0:
1081:                break;
                case 1:
1081:                break;
                case 2:
1081:                break;
                default:
926:                throw new IllegalArgumentException(54 + v2 + " is not a valid enum AddressFormDisplayType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
928:    p0.e(p0.o());
931:    this.a(p0, v3);
934:    goto 7;
936:    try {
936:        this.o = v2;
        }
        catch (IllegalArgumentException ex) {
928:        p0.e(p0.o());
931:        this.a(p0, v3);
        }
938:    goto 7;
944:    this.D = p0.j();
946:    goto 7;
952:    this.m = p0.j();
954:    goto 7;
960:    this.r = p0.f();
962:    goto 7;
968:    this.n = p0.j();
970:    goto 7;
976:    this.l = p0.j();
978:    goto 7;
984:    this.E = p0.j();
986:    goto 7;
996:    if (this.x == 0)
998:        v0 = 0;
        else
1034:        v0 = this.x.length;
1000:    v2 = new b[com.google.protobuf.nano.l.a(p0, 402) + v0];
1002:    if (v0 != 0)
1006:        System.arraycopy(this.x, 0, v2, 0, v0);
1009:    while (v0 < v2.length - 1) {
1019:        v2[v0] = new com.google.a.a.a.a.b.a.a.f.b();
1023:        p0.a(v2[v0]);
1026:        p0.a();
1029:        v0 = v0 + 1;
        }
1041:    v2[v0] = new com.google.a.a.a.a.b.a.a.f.b();
1045:    p0.a(v2[v0]);
1048:    this.x = v2;
1050:    goto 7;
1056:    this.i = p0.e();
1058:    goto 7;
1061:    goto 779;
1064:    goto 443;
1067:    goto 264;
1070:    try
            run 825...835
        catch (IllegalArgumentException ex) {
825:        goto 842;
        }
1071:    try
            run 785...792
        catch (IllegalArgumentException ex) {
785:        goto 1060;
        }
1072:    try
            run 705...715
        catch (IllegalArgumentException ex) {
705:        goto 720;
        }
1075:    try
            run 489...499
        catch (IllegalArgumentException ex) {
489:        goto 506;
        }
1076:    try
            run 449...456
        catch (IllegalArgumentException ex) {
449:        goto 1063;
        }
1077:    try
            run 369...379
        catch (IllegalArgumentException ex) {
369:        goto 384;
        }
1078:    try
            run 310...320
        catch (IllegalArgumentException ex) {
310:        goto 327;
        }
1079:    try
            run 270...277
        catch (IllegalArgumentException ex) {
270:        goto 1066;
        }
1080:    try
            run 190...200
        catch (IllegalArgumentException ex) {
190:        goto 205;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.q != 0 && this.q.length > 0) {
            v0 = 0;
            while (v0 < this.q.length) {
                if (this.q[v0] != 0)
                    p0.a(4, this.q[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.t != 0)
            p0.a(5, this.t);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(6, this.b);
        if (this.f != 0)
            p0.b(7, this.f);
        if (this.s != 0 && this.s.length > 0) {
            v0 = 0;
            while (v0 < this.s.length) {
                if (this.s[v0] != 0)
                    p0.a(9, this.s[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.u != 0 && !this.u.equals(""))
            p0.a(10, this.u);
        if (this.p != 0 && !this.p.equals(""))
            p0.a(11, this.p);
        if (this.v != 0 && this.v.length > 0) {
            v0 = 0;
            while (v0 < this.v.length) {
                p0.a(12, this.v[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && !this.e.equals(""))
            p0.a(13, this.e);
        if (this.w != 0 && this.w.length > 0) {
            v0 = 0;
            while (v0 < this.w.length) {
                p0.a(14, this.w[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.g != 0 && !this.g.equals(""))
            p0.a(15, this.g);
        if (this.y != 0)
            p0.a(20, this.y);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    p0.b(21, this.h[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.j != 0 && !this.j.equals(""))
            p0.a(22, this.j);
        if (this.c != 0)
            p0.b(25, this.c);
        if (!Arrays.equals(this.d, com.google.protobuf.nano.l.l))
            p0.a(26, this.d);
        if (this.a != 0)
            p0.b(29, this.a);
        if (this.B != 0 && this.B.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.B.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.B[v0]);
                v0 = v0 + 1;
            }
            p0.e(242);
            p0.e(v2);
            v0 = 0;
            while (v0 < this.B.length) {
                p0.e(this.B[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.C != 0)
            p0.b(31, this.C);
        if (this.k != 0)
            p0.a(32, this.k);
        if (this.z != 0)
            p0.a(34, this.z);
        if (this.A != 0 && !this.A.equals(""))
            p0.a(35, this.A);
        if (this.o != 0)
            p0.a(36, this.o);
        if (this.D != 0)
            p0.b(38, this.D);
        if (this.m != 0)
            p0.b(40, this.m);
        if (this.r != 0 && !this.r.equals(""))
            p0.a(42, this.r);
        if (this.n != 0)
            p0.b(46, this.n);
        if (this.l != 0)
            p0.b(47, this.l);
        if (this.E != 0)
            p0.b(49, this.E);
        if (this.x != 0 && this.x.length > 0)
            while (v1 < this.x.length) {
                if (this.x[v1] != 0)
                    p0.b(50, this.x[v1]);
                v1 = v1 + 1;
            }
        if (this.i != 0)
            p0.a(51, this.i);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v4 = super.b();
        if (this.q != 0 && this.q.length > 0) {
            v0 = 0;
            v2 = 0;
            v3 = 0;
            while (v0 < this.q.length) {
                if (this.q[v0] != 0) {
                    v3 = v3 + 1;
                    v2 = v2 + CodedOutputByteBufferNano.b(this.q[v0]);
                }
                v0 = v0 + 1;
            }
            v0 = v4 + v2 + v3 * 1;
        }
        else
            v0 = v4;
        if (this.t != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.b);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.f);
        if (this.s != 0 && this.s.length > 0) {
            v2 = 0;
            v3 = 0;
            v4 = 0;
            while (v2 < this.s.length) {
                if (this.s[v2] != 0) {
                    v4 = v4 + 1;
                    v3 = v3 + CodedOutputByteBufferNano.b(this.s[v2]);
                }
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + v4 * 1;
        }
        if (this.u != 0 && !this.u.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(10, this.u);
        if (this.p != 0 && !this.p.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(11, this.p);
        if (this.v != 0 && this.v.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.v.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.v[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + this.v.length * 1;
        }
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(13, this.e);
        if (this.w != 0 && this.w.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.w.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.w[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + this.w.length * 1;
        }
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(15, this.g);
        if (this.y != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(20, this.y);
        if (this.h != 0 && this.h.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.h.length) {
                if (this.h[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(21, this.h[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.j != 0 && !this.j.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(22, this.j);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(25, this.c);
        if (!Arrays.equals(this.d, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(26, this.d);
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(29, this.a);
        if (this.B != 0 && this.B.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.B.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.B[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + 2 + CodedOutputByteBufferNano.f(v3);
        }
        if (this.C != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(31, this.C);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(32, this.k);
        if (this.z != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(34) + 1;
        if (this.A != 0 && !this.A.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(35, this.A);
        if (this.o != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(36, this.o);
        if (this.D != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(38, this.D);
        if (this.m != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(40, this.m);
        if (this.r != 0 && !this.r.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(42, this.r);
        if (this.n != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(46, this.n);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(47, this.l);
        if (this.E != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(49, this.E);
        if (this.x != 0 && this.x.length > 0)
            while (v1 < this.x.length) {
                if (this.x[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(50, this.x[v1]);
                v1 = v1 + 1;
            }
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(51) + 1;
        return v0;
    }

}
