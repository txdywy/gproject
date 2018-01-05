package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.d.a.c;
import com.google.a.a.a.a.b.a.a.f.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.ai;
import com.google.a.a.a.a.b.a.b.a.b;
import com.google.a.a.a.a.b.a.b.a.g;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.y extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public x[] b;
    public String c;
    public String d;
    public w[] e;
    public com.google.a.a.a.a.b.a.a.f.a f;
    public com.google.a.a.a.a.b.a.a.c.b.a.z g;
    public com.google.a.a.a.a.b.a.a.d.a.c h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int[] n;
    public int[] o;
    public int[] p;

    y() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.a.a.a.a.b.a.a.c.b.a.x.a();
        this.c = "";
        this.d = "";
        this.e = com.google.a.a.a.a.b.a.a.c.b.a.w.a();
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 1;
        this.n = com.google.protobuf.nano.l.e;
        this.o = com.google.protobuf.nano.l.e;
        this.p = com.google.protobuf.nano.l.e;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.y b(com.google.protobuf.nano.a p0) {
  7:    v3 = p0.a();
 11:    switch (v3) {
            case 0:
 11:            goto 20;
            case 18:
 11:            goto 21;
            case 26:
 11:            goto 38;
            case 34:
 11:            goto 55;
            case 50:
 11:            goto 72;
            case 58:
 11:            goto 135;
            case 64:
 11:            goto 199;
            case 72:
 11:            goto 207;
            case 80:
 11:            goto 215;
            case 88:
 11:            goto 223;
            case 96:
 11:            goto 231;
            case 120:
 11:            goto 239;
            case 122:
 11:            goto 319;
            case 128:
 11:            goto 410;
            case 130:
 11:            goto 490;
            case 146:
 11:            goto 581;
            case 154:
 11:            goto 599;
            case 162:
 11:            goto 607;
            case 168:
 11:            goto 615;
            case 170:
 11:            goto 695;
            default:
        }
 18:    if (super.a(p0, v3)) goto 7;
 20:    return this;
 23:    if (this.f == 0)
 30:        this.f = new com.google.a.a.a.a.b.a.a.f.a();
 34:    p0.a(this.f);
 37:    goto 7;
 40:    if (this.g == 0)
 47:        this.g = new com.google.a.a.a.a.b.a.a.c.b.a.z();
 51:    p0.a(this.g);
 54:    goto 7;
 57:    if (this.h == 0)
 64:        this.h = new com.google.a.a.a.a.b.a.a.d.a.c();
 68:    p0.a(this.h);
 71:    goto 7;
 80:    if (this.b == 0)
 82:        v0 = 0;
        else
118:        v0 = this.b.length;
 84:    v2 = new x[com.google.protobuf.nano.l.a(p0, 50) + v0];
 86:    if (v0 != 0)
 90:        System.arraycopy(this.b, 0, v2, 0, v0);
 93:    while (v0 < v2.length - 1) {
103:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.x();
107:        p0.a(v2[v0]);
110:        p0.a();
113:        v0 = v0 + 1;
        }
115:    goto 120;
125:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.x();
129:    p0.a(v2[v0]);
132:    this.b = v2;
134:    goto 7;
143:    if (this.e == 0)
145:        v0 = 0;
        else
181:        v0 = this.e.length;
147:    v2 = new w[com.google.protobuf.nano.l.a(p0, 58) + v0];
149:    if (v0 != 0)
153:        System.arraycopy(this.e, 0, v2, 0, v0);
156:    while (v0 < v2.length - 1) {
166:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.w();
170:        p0.a(v2[v0]);
173:        p0.a();
176:        v0 = v0 + 1;
        }
178:    goto 183;
188:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.w();
192:    p0.a(v2[v0]);
195:    this.e = v2;
197:    goto 7;
203:    this.i = p0.i();
205:    goto 7;
211:    this.j = p0.i();
213:    goto 7;
219:    this.k = p0.i();
221:    goto 7;
227:    this.l = p0.i();
229:    goto 7;
235:    this.m = p0.e();
237:    goto 7;
239:    v4 = com.google.protobuf.nano.l.a(p0, 120);
243:    v5 = new int[v4];
245:    v2 = 0;
246:    v0 = 0;
247:    if (v2 >= v4) goto 281;
249:    if (v2 != 0)
251:        p0.a();
266:    v5[v0] = com.google.a.a.a.a.b.a.b.a.b.a(p0.i());
268:    v0 = v0 + 1;
270:    v2 = v2 + 1;
272:    goto 247;
274:    p0.e(p0.o());
277:    this.a(p0, v3);
280:    goto 270;
281:    if (v0 != 0) {
285:        if (this.n == 0)
287:            v2 = 0;
            else
299:            v2 = this.n.length;
288:        if (v2 == 0 && v0 == v5.length)
293:            this.n = v5;
            else {
303:            v3 = new int[v2 + v0];
305:            if (v2 != 0)
309:                System.arraycopy(this.n, 0, v3, 0, v2);
312:            System.arraycopy(v5, 0, v3, v2, v0);
315:            this.n = v3;
            }
        }
295:    goto 7;
331:    v0 = 0;
336:    if (p0.m() <= 0) goto 348;
342:    com.google.a.a.a.a.b.a.b.a.b.a(p0.i());
345:    v0 = v0 + 1;
347:    goto 332;
348:    if (v0 == 0) goto 405;
350:    p0.e(p0.o());
355:    if (this.n == 0)
357:        v2 = 0;
        else
393:        v2 = this.n.length;
359:    v0 = new int[v0 + v2];
361:    if (v2 != 0)
365:        System.arraycopy(this.n, 0, v0, 0, v2);
372:    if (p0.m() <= 0) goto 403;
386:    v0[v2] = com.google.a.a.a.a.b.a.b.a.b.a(p0.i());
388:    v2 = v2 + 1;
390:    goto 368;
396:    p0.e(p0.o());
399:    this.a(p0, 120);
402:    goto 368;
403:    this.n = v0;
405:    p0.d(p0.c(p0.i()));
408:    goto 7;
410:    v4 = com.google.protobuf.nano.l.a(p0, 128);
414:    v5 = new int[v4];
416:    v2 = 0;
417:    v0 = 0;
418:    if (v2 >= v4) goto 452;
420:    if (v2 != 0)
422:        p0.a();
437:    v5[v0] = com.google.a.a.a.a.b.a.b.a.ai.a(p0.i());
439:    v0 = v0 + 1;
441:    v2 = v2 + 1;
443:    goto 418;
445:    p0.e(p0.o());
448:    this.a(p0, v3);
451:    goto 441;
452:    if (v0 != 0) {
456:        if (this.o == 0)
458:            v2 = 0;
            else
470:            v2 = this.o.length;
459:        if (v2 == 0 && v0 == v5.length)
464:            this.o = v5;
            else {
474:            v3 = new int[v2 + v0];
476:            if (v2 != 0)
480:                System.arraycopy(this.o, 0, v3, 0, v2);
483:            System.arraycopy(v5, 0, v3, v2, v0);
486:            this.o = v3;
            }
        }
466:    goto 7;
502:    v0 = 0;
507:    if (p0.m() <= 0) goto 519;
513:    com.google.a.a.a.a.b.a.b.a.ai.a(p0.i());
516:    v0 = v0 + 1;
518:    goto 503;
519:    if (v0 == 0) goto 576;
521:    p0.e(p0.o());
526:    if (this.o == 0)
528:        v2 = 0;
        else
564:        v2 = this.o.length;
530:    v0 = new int[v0 + v2];
532:    if (v2 != 0)
536:        System.arraycopy(this.o, 0, v0, 0, v2);
543:    if (p0.m() <= 0) goto 574;
557:    v0[v2] = com.google.a.a.a.a.b.a.b.a.ai.a(p0.i());
559:    v2 = v2 + 1;
561:    goto 539;
567:    p0.e(p0.o());
570:    this.a(p0, 128);
573:    goto 539;
574:    this.o = v0;
576:    p0.d(p0.c(p0.i()));
579:    goto 7;
583:    if (this.a == 0)
590:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
594:    p0.a(this.a);
597:    goto 7;
603:    this.c = p0.f();
605:    goto 7;
611:    this.d = p0.f();
613:    goto 7;
615:    v4 = com.google.protobuf.nano.l.a(p0, 168);
619:    v5 = new int[v4];
621:    v2 = 0;
622:    v0 = 0;
623:    if (v2 >= v4) goto 657;
625:    if (v2 != 0)
627:        p0.a();
642:    v5[v0] = com.google.a.a.a.a.b.a.b.a.g.a(p0.i());
644:    v0 = v0 + 1;
646:    v2 = v2 + 1;
648:    goto 623;
650:    p0.e(p0.o());
653:    this.a(p0, v3);
656:    goto 646;
657:    if (v0 != 0) {
661:        if (this.p == 0)
663:            v2 = 0;
            else
675:            v2 = this.p.length;
664:        if (v2 == 0 && v0 == v5.length)
669:            this.p = v5;
            else {
679:            v3 = new int[v2 + v0];
681:            if (v2 != 0)
685:                System.arraycopy(this.p, 0, v3, 0, v2);
688:            System.arraycopy(v5, 0, v3, v2, v0);
691:            this.p = v3;
            }
        }
671:    goto 7;
707:    v0 = 0;
712:    if (p0.m() <= 0) goto 724;
718:    com.google.a.a.a.a.b.a.b.a.g.a(p0.i());
721:    v0 = v0 + 1;
723:    goto 708;
724:    if (v0 == 0) goto 781;
726:    p0.e(p0.o());
731:    if (this.p == 0)
733:        v2 = 0;
        else
769:        v2 = this.p.length;
735:    v0 = new int[v0 + v2];
737:    if (v2 != 0)
741:        System.arraycopy(this.p, 0, v0, 0, v2);
748:    if (p0.m() <= 0) goto 779;
762:    v0[v2] = com.google.a.a.a.a.b.a.b.a.g.a(p0.i());
764:    v2 = v2 + 1;
766:    goto 744;
772:    p0.e(p0.o());
775:    this.a(p0, 168);
778:    goto 744;
779:    this.p = v0;
781:    p0.d(p0.c(p0.i()));
784:    goto 7;
787:    goto 708;
789:    goto 503;
792:    goto 332;
793:    try
            run 754...764
        catch (IllegalArgumentException ex) {
754:        goto 771;
        }
794:    try
            run 714...721
        catch (IllegalArgumentException ex) {
714:        goto 786;
        }
795:    try
            run 634...644
        catch (IllegalArgumentException ex) {
634:        goto 649;
        }
796:    try
            run 549...559
        catch (IllegalArgumentException ex) {
549:        goto 566;
        }
797:    try
            run 509...516
        catch (IllegalArgumentException ex) {
509:        goto 788;
        }
798:    try
            run 429...439
        catch (IllegalArgumentException ex) {
429:        goto 444;
        }
799:    try
            run 378...388
        catch (IllegalArgumentException ex) {
378:        goto 395;
        }
800:    try
            run 338...345
        catch (IllegalArgumentException ex) {
338:        goto 791;
        }
801:    try
            run 258...268
        catch (IllegalArgumentException ex) {
258:        goto 273;
        }
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.f != 0)
            p0.b(2, this.f);
        if (this.g != 0)
            p0.b(3, this.g);
        if (this.h != 0)
            p0.b(4, this.h);
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(6, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    p0.b(7, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.i != 0)
            p0.a(8, this.i);
        if (this.j != 0)
            p0.a(9, this.j);
        if (this.k != 0)
            p0.a(10, this.k);
        if (this.l != 0)
            p0.a(11, this.l);
        if (this.m != 1)
            p0.a(12, this.m);
        if (this.n != 0 && this.n.length > 0) {
            v0 = 0;
            while (v0 < this.n.length) {
                p0.a(15, this.n[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.o != 0 && this.o.length > 0) {
            v0 = 0;
            while (v0 < this.o.length) {
                p0.a(16, this.o[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.a != 0)
            p0.b(18, this.a);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(19, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(20, this.d);
        if (this.p != 0 && this.p.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.p.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.p[v0]);
                v0 = v0 + 1;
            }
            p0.e(170);
            p0.e(v2);
            while (v1 < this.p.length) {
                p0.e(this.p[v1]);
                v1 = v1 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.h);
        if (this.b != 0 && this.b.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(6, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.e != 0 && this.e.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(7, this.e[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.i);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.j);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.k);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.l);
        if (this.m != 1)
            v0 = v0 + CodedOutputByteBufferNano.d(12) + 1;
        if (this.n != 0 && this.n.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.n.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.n[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + this.n.length * 1;
        }
        if (this.o != 0 && this.o.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v2 < this.o.length) {
                v3 = v3 + CodedOutputByteBufferNano.c(this.o[v2]);
                v2 = v2 + 1;
            }
            v0 = v0 + v3 + this.o.length * 2;
        }
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(18, this.a);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(19, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(20, this.d);
        if (this.p != 0 && this.p.length > 0) {
            v2 = 0;
            while (v1 < this.p.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.p[v1]);
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + 2 + CodedOutputByteBufferNano.f(v2);
        }
        return v0;
    }

}
