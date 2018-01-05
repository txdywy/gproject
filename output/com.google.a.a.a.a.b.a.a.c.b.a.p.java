package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ai;
import com.google.a.a.a.a.b.a.b.a.b;
import com.google.a.a.a.a.b.a.b.a.g;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.p extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public com.google.a.a.a.a.b.a.a.c.b.a.q b;
    public r[] c;
    public ad[] d;
    public int e;
    public int f;
    public int[] g;
    public int[] h;
    public long i;
    public u[] j;
    public String k;
    public String l;
    public t[] m;
    public int[] n;

    p() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.a.a.a.a.b.a.a.c.b.a.r.a();
        this.d = com.google.a.a.a.a.b.a.b.a.ad.a();
        this.e = -1;
        this.f = 0;
        this.g = com.google.protobuf.nano.l.e;
        this.h = com.google.protobuf.nano.l.e;
        this.i = 0;
        this.j = com.google.a.a.a.a.b.a.a.c.b.a.u.a();
        this.k = "";
        this.l = "";
        this.m = com.google.a.a.a.a.b.a.a.c.b.a.t.a();
        this.n = com.google.protobuf.nano.l.e;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.p b(com.google.protobuf.nano.a p0) {
  7:    v3 = p0.a();
 11:    switch (v3) {
            case 0:
 11:            goto 20;
            case 10:
 11:            goto 21;
            case 18:
 11:            goto 38;
            case 26:
 11:            goto 55;
            case 34:
 11:            goto 118;
            case 48:
 11:            goto 182;
            case 50:
 11:            goto 262;
            case 58:
 11:            goto 353;
            case 66:
 11:            goto 417;
            case 74:
 11:            goto 425;
            case 80:
 11:            goto 489;
            case 88:
 11:            goto 497;
            case 90:
 11:            goto 577;
            case 104:
 11:            goto 668;
            case 114:
 11:            goto 719;
            case 120:
 11:            goto 727;
            case 128:
 11:            goto 735;
            case 130:
 11:            goto 815;
            default:
        }
 18:    if (super.a(p0, v3)) goto 7;
 20:    return this;
 23:    if (this.a == 0)
 30:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 34:    p0.a(this.a);
 37:    goto 7;
 40:    if (this.b == 0)
 47:        this.b = new com.google.a.a.a.a.b.a.a.c.b.a.q();
 51:    p0.a(this.b);
 54:    goto 7;
 63:    if (this.c == 0)
 65:        v0 = 0;
        else
101:        v0 = this.c.length;
 67:    v2 = new r[com.google.protobuf.nano.l.a(p0, 26) + v0];
 69:    if (v0 != 0)
 73:        System.arraycopy(this.c, 0, v2, 0, v0);
 76:    while (v0 < v2.length - 1) {
 86:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.r();
 90:        p0.a(v2[v0]);
 93:        p0.a();
 96:        v0 = v0 + 1;
        }
 98:    goto 103;
108:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.r();
112:    p0.a(v2[v0]);
115:    this.c = v2;
117:    goto 7;
126:    if (this.d == 0)
128:        v0 = 0;
        else
164:        v0 = this.d.length;
130:    v2 = new ad[com.google.protobuf.nano.l.a(p0, 34) + v0];
132:    if (v0 != 0)
136:        System.arraycopy(this.d, 0, v2, 0, v0);
139:    while (v0 < v2.length - 1) {
149:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
153:        p0.a(v2[v0]);
156:        p0.a();
159:        v0 = v0 + 1;
        }
161:    goto 166;
171:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
175:    p0.a(v2[v0]);
178:    this.d = v2;
180:    goto 7;
182:    v4 = com.google.protobuf.nano.l.a(p0, 48);
186:    v5 = new int[v4];
188:    v2 = 0;
189:    v0 = 0;
190:    if (v2 >= v4) goto 224;
192:    if (v2 != 0)
194:        p0.a();
209:    v5[v0] = com.google.a.a.a.a.b.a.b.a.b.a(p0.i());
211:    v0 = v0 + 1;
213:    v2 = v2 + 1;
215:    goto 190;
217:    p0.e(p0.o());
220:    this.a(p0, v3);
223:    goto 213;
224:    if (v0 != 0) {
228:        if (this.g == 0)
230:            v2 = 0;
            else
242:            v2 = this.g.length;
231:        if (v2 == 0 && v0 == v5.length)
236:            this.g = v5;
            else {
246:            v3 = new int[v2 + v0];
248:            if (v2 != 0)
252:                System.arraycopy(this.g, 0, v3, 0, v2);
255:            System.arraycopy(v5, 0, v3, v2, v0);
258:            this.g = v3;
            }
        }
238:    goto 7;
274:    v0 = 0;
279:    if (p0.m() <= 0) goto 291;
285:    com.google.a.a.a.a.b.a.b.a.b.a(p0.i());
288:    v0 = v0 + 1;
290:    goto 275;
291:    if (v0 == 0) goto 348;
293:    p0.e(p0.o());
298:    if (this.g == 0)
300:        v2 = 0;
        else
336:        v2 = this.g.length;
302:    v0 = new int[v0 + v2];
304:    if (v2 != 0)
308:        System.arraycopy(this.g, 0, v0, 0, v2);
315:    if (p0.m() <= 0) goto 346;
329:    v0[v2] = com.google.a.a.a.a.b.a.b.a.b.a(p0.i());
331:    v2 = v2 + 1;
333:    goto 311;
339:    p0.e(p0.o());
342:    this.a(p0, 48);
345:    goto 311;
346:    this.g = v0;
348:    p0.d(p0.c(p0.i()));
351:    goto 7;
361:    if (this.j == 0)
363:        v0 = 0;
        else
399:        v0 = this.j.length;
365:    v2 = new u[com.google.protobuf.nano.l.a(p0, 58) + v0];
367:    if (v0 != 0)
371:        System.arraycopy(this.j, 0, v2, 0, v0);
374:    while (v0 < v2.length - 1) {
384:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.u();
388:        p0.a(v2[v0]);
391:        p0.a();
394:        v0 = v0 + 1;
        }
406:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.u();
410:    p0.a(v2[v0]);
413:    this.j = v2;
415:    goto 7;
421:    this.l = p0.f();
423:    goto 7;
433:    if (this.m == 0)
435:        v0 = 0;
        else
471:        v0 = this.m.length;
437:    v2 = new t[com.google.protobuf.nano.l.a(p0, 74) + v0];
439:    if (v0 != 0)
443:        System.arraycopy(this.m, 0, v2, 0, v0);
446:    while (v0 < v2.length - 1) {
456:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.t();
460:        p0.a(v2[v0]);
463:        p0.a();
466:        v0 = v0 + 1;
        }
478:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.t();
482:    p0.a(v2[v0]);
485:    this.m = v2;
487:    goto 7;
493:    this.i = p0.j();
495:    goto 7;
497:    v4 = com.google.protobuf.nano.l.a(p0, 88);
501:    v5 = new int[v4];
503:    v2 = 0;
504:    v0 = 0;
505:    if (v2 >= v4) goto 539;
507:    if (v2 != 0)
509:        p0.a();
524:    v5[v0] = com.google.a.a.a.a.b.a.b.a.ai.a(p0.i());
526:    v0 = v0 + 1;
528:    v2 = v2 + 1;
530:    goto 505;
532:    p0.e(p0.o());
535:    this.a(p0, v3);
538:    goto 528;
539:    if (v0 != 0) {
543:        if (this.h == 0)
545:            v2 = 0;
            else
557:            v2 = this.h.length;
546:        if (v2 == 0 && v0 == v5.length)
551:            this.h = v5;
            else {
561:            v3 = new int[v2 + v0];
563:            if (v2 != 0)
567:                System.arraycopy(this.h, 0, v3, 0, v2);
570:            System.arraycopy(v5, 0, v3, v2, v0);
573:            this.h = v3;
            }
        }
553:    goto 7;
589:    v0 = 0;
594:    if (p0.m() <= 0) goto 606;
600:    com.google.a.a.a.a.b.a.b.a.ai.a(p0.i());
603:    v0 = v0 + 1;
605:    goto 590;
606:    if (v0 == 0) goto 663;
608:    p0.e(p0.o());
613:    if (this.h == 0)
615:        v2 = 0;
        else
651:        v2 = this.h.length;
617:    v0 = new int[v0 + v2];
619:    if (v2 != 0)
623:        System.arraycopy(this.h, 0, v0, 0, v2);
630:    if (p0.m() <= 0) goto 661;
644:    v0[v2] = com.google.a.a.a.a.b.a.b.a.ai.a(p0.i());
646:    v2 = v2 + 1;
648:    goto 626;
654:    p0.e(p0.o());
657:    this.a(p0, 88);
660:    goto 626;
661:    this.h = v0;
663:    p0.d(p0.c(p0.i()));
666:    goto 7;
672:    try {
672:        v2 = p0.i();
676:        switch (v2) {
                case 0:
924:                break;
                case 1:
924:                break;
                case 2:
924:                break;
                case 3:
924:                break;
                default:
705:                throw new IllegalArgumentException(48 + v2 + " is not a valid enum LogoUiPreference");
            }
        }
        catch (IllegalArgumentException ex) {
        }
707:    p0.e(p0.o());
710:    this.a(p0, v3);
713:    goto 7;
715:    try {
715:        this.f = v2;
        }
        catch (IllegalArgumentException ex) {
707:        p0.e(p0.o());
710:        this.a(p0, v3);
        }
717:    goto 7;
723:    this.k = p0.f();
725:    goto 7;
731:    this.e = p0.i();
733:    goto 7;
735:    v4 = com.google.protobuf.nano.l.a(p0, 128);
739:    v5 = new int[v4];
741:    v2 = 0;
742:    v0 = 0;
743:    if (v2 >= v4) goto 777;
745:    if (v2 != 0)
747:        p0.a();
762:    v5[v0] = com.google.a.a.a.a.b.a.b.a.g.a(p0.i());
764:    v0 = v0 + 1;
766:    v2 = v2 + 1;
768:    goto 743;
770:    p0.e(p0.o());
773:    this.a(p0, v3);
776:    goto 766;
777:    if (v0 != 0) {
781:        if (this.n == 0)
783:            v2 = 0;
            else
795:            v2 = this.n.length;
784:        if (v2 == 0 && v0 == v5.length)
789:            this.n = v5;
            else {
799:            v3 = new int[v2 + v0];
801:            if (v2 != 0)
805:                System.arraycopy(this.n, 0, v3, 0, v2);
808:            System.arraycopy(v5, 0, v3, v2, v0);
811:            this.n = v3;
            }
        }
791:    goto 7;
827:    v0 = 0;
832:    if (p0.m() <= 0) goto 844;
838:    com.google.a.a.a.a.b.a.b.a.g.a(p0.i());
841:    v0 = v0 + 1;
843:    goto 828;
844:    if (v0 == 0) goto 901;
846:    p0.e(p0.o());
851:    if (this.n == 0)
853:        v2 = 0;
        else
889:        v2 = this.n.length;
855:    v0 = new int[v0 + v2];
857:    if (v2 != 0)
861:        System.arraycopy(this.n, 0, v0, 0, v2);
868:    if (p0.m() <= 0) goto 899;
882:    v0[v2] = com.google.a.a.a.a.b.a.b.a.g.a(p0.i());
884:    v2 = v2 + 1;
886:    goto 864;
892:    p0.e(p0.o());
895:    this.a(p0, 128);
898:    goto 864;
899:    this.n = v0;
901:    p0.d(p0.c(p0.i()));
904:    goto 7;
907:    goto 828;
909:    goto 590;
912:    goto 275;
913:    try
            run 874...884
        catch (IllegalArgumentException ex) {
874:        goto 891;
        }
914:    try
            run 834...841
        catch (IllegalArgumentException ex) {
834:        goto 906;
        }
915:    try
            run 754...764
        catch (IllegalArgumentException ex) {
754:        goto 769;
        }
918:    try
            run 636...646
        catch (IllegalArgumentException ex) {
636:        goto 653;
        }
919:    try
            run 596...603
        catch (IllegalArgumentException ex) {
596:        goto 908;
        }
920:    try
            run 516...526
        catch (IllegalArgumentException ex) {
516:        goto 531;
        }
921:    try
            run 321...331
        catch (IllegalArgumentException ex) {
321:        goto 338;
        }
922:    try
            run 281...288
        catch (IllegalArgumentException ex) {
281:        goto 911;
        }
923:    try
            run 201...211
        catch (IllegalArgumentException ex) {
201:        goto 216;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(3, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(4, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.g != 0 && this.g.length > 0) {
            v0 = 0;
            while (v0 < this.g.length) {
                p0.a(6, this.g[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.j != 0 && this.j.length > 0) {
            v0 = 0;
            while (v0 < this.j.length) {
                if (this.j[v0] != 0)
                    p0.b(7, this.j[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.l != 0 && !this.l.equals(""))
            p0.a(8, this.l);
        if (this.m != 0 && this.m.length > 0) {
            v0 = 0;
            while (v0 < this.m.length) {
                if (this.m[v0] != 0)
                    p0.b(9, this.m[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.i != 0)
            p0.b(10, this.i);
        if (this.h != 0 && this.h.length > 0) {
            v0 = 0;
            while (v0 < this.h.length) {
                p0.a(11, this.h[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.f != 0)
            p0.a(13, this.f);
        if (this.k != 0 && !this.k.equals(""))
            p0.a(14, this.k);
        if (this.e != -1)
            p0.a(15, this.e);
        if (this.n != 0 && this.n.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.n.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.n[v0]);
                v0 = v0 + 1;
            }
            p0.e(130);
            p0.e(v2);
            while (v1 < this.n.length) {
                p0.e(this.n[v1]);
                v1 = v1 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(3, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.d != 0 && this.d.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(4, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.g != 0 && this.g.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.g.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.g[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + this.g.length * 1;
        }
        if (this.j != 0 && this.j.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.j.length) {
                if (this.j[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(7, this.j[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.l != 0 && !this.l.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(8, this.l);
        if (this.m != 0 && this.m.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.m.length) {
                if (this.m[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(9, this.m[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(10, this.i);
        if (this.h != 0 && this.h.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.h.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.h[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + this.h.length * 1;
        }
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.f);
        if (this.k != 0 && !this.k.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(14, this.k);
        if (this.e != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(15, this.e);
        if (this.n != 0 && this.n.length > 0) {
            v2 = 0;
            while (v1 < this.n.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.n[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + 2 + CodedOutputByteBufferNano.f(v2);
        }
        return v0;
    }

}
