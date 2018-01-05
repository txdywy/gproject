package com.google.android.finsky.billing.addresschallenge.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.finsky.billing.addresschallenge.AddressAutoComplete;
import com.google.android.finsky.billing.addresschallenge.j;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.billing.addresschallenge.a.m implements Runnable
{

    public final com.google.android.finsky.billing.addresschallenge.a.l a;

    m(com.google.android.finsky.billing.addresschallenge.a.l p0) {
        this.a = p0;
    }

    public final void run() {
  4:    v6 = this.a.a;
 47:    v1 = new com.google.android.finsky.billing.addresschallenge.a.x(v6.d).b(new com.google.android.finsky.billing.addresschallenge.a.am(com.google.android.finsky.billing.addresschallenge.a.an.a).a(new com.google.android.finsky.billing.addresschallenge.a.b().a(v6.k).a()).a().toString());
 55:    v3 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.a);
 60:    v0 = v1.b(com.google.android.finsky.billing.addresschallenge.a.c.h);
 64:    v6.n = v0;
 72:    v0 = (Integer)com.google.android.finsky.billing.addresschallenge.a.j.o.get(v0);
 74:    if (v0 == 0)
 79:        v0 = Integer.valueOf(2131952280);
 93:    v3.a = v6.a.getString(v0.intValue());
 99:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.a, v3);
106:    v0 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.b);
118:    v0.a = v6.a.getString(2131952275);
124:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.b, v0);
131:    v0 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.g);
143:    v0.a = v6.a.getString(2131952271);
149:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.g, v0);
156:    v0 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.e);
168:    v0.a = v6.a.getString(2131952266);
174:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.e, v0);
181:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.j, v0);
188:    v0 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.f);
200:    v0.a = v6.a.getString(2131952267);
206:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.f, v0);
213:    v0 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.d);
225:    v0.a = v6.a.getString(2131952276);
231:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.d, v0);
238:    v0 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.c);
250:    v0.a = v6.a.getString(2131952281);
256:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.c, v0);
263:    v3 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.h);
272:    if (v1.b(com.google.android.finsky.billing.addresschallenge.a.c.o) == 0) {
276:        v6.t = com.google.android.finsky.billing.addresschallenge.a.q.b;
283:        v0 = v6.a.getString(2131952278);
        }
        else {
469:        v6.t = com.google.android.finsky.billing.addresschallenge.a.q.a;
476:        v0 = v6.a.getString(2131952283);
        }
287:    v3.a = v0;
293:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.h, v3);
300:    v0 = new com.google.android.finsky.billing.addresschallenge.a.g(com.google.android.finsky.billing.addresschallenge.a.d.i);
305:    v0.a = "CEDEX";
311:    v6.e.put(com.google.android.finsky.billing.addresschallenge.a.d.i, v0);
330:    ((com.google.android.finsky.billing.addresschallenge.a.g)v6.e.get(com.google.android.finsky.billing.addresschallenge.a.d.a)).a(v6.a(com.google.android.finsky.billing.addresschallenge.a.d.k));
349:    ((com.google.android.finsky.billing.addresschallenge.a.g)v6.e.get(com.google.android.finsky.billing.addresschallenge.a.d.b)).a(v6.a(com.google.android.finsky.billing.addresschallenge.a.d.a));
354:    v7 = new ArrayList();
367:    v8 = v6.g.a(v6.m, v6.k).iterator();
371:    v3 = 1;
376:    if (!v8.hasNext()) {
624:        v6.b.setFields(v7);
629:        if (v6.q != 0)
633:            v6.a(v6.q, 1);
638:        if (v6.r != 0)
642:            v6.a(v6.r);
647:        v6.b.c();
656:        if (this.a.a.s != 0)
664:            this.a.a.s.a();
667:        return;
        }
382:    v0 = (com.google.android.finsky.billing.addresschallenge.a.d)v8.next();
390:    if (v6.h.a(v0)) goto 668;
400:    v1 = (com.google.android.finsky.billing.addresschallenge.a.g)v6.e.get(v0);
408:    v10 = v6.h.b.contains(v0);
414:    if (v3 != 0 && v10 == 0 && v1.b.equals(com.google.android.finsky.billing.addresschallenge.a.h.a) && v1.d == com.google.android.finsky.billing.addresschallenge.a.d.e && v6.j != 0) {
447:        v0 = (AddressAutoComplete)v6.c.inflate(2130968623, v6.b, 0);
449:        v1.f = v0;
451:        v0.setHint(v1.a);
456:        v0.setSuggestionProvider(v6.j);
        }
490:    else if (v1.b.equals(com.google.android.finsky.billing.addresschallenge.a.h.a)) {
497:        v0 = v6.c.inflate(2130968624, v6.b, 0);
501:        v1.f = v0;
503:        v0 = (EditText)v0;
505:        if (v10 == 0)
507:            v5 = 1;
            else
536:            v5 = 0;
508:        v0.setEnabled(v5);
515:        if (v1.a.length() > 0)
517:            v0.setHint(v1.a);
524:        if (v1.d == com.google.android.finsky.billing.addresschallenge.a.d.h)
532:            v0.setInputType(v0.getInputType() | 4096);
        }
546:    else if (v1.b.equals(com.google.android.finsky.billing.addresschallenge.a.h.b)) {
553:        v0 = v6.c.inflate(2130968627, v6.b, 0);
557:        v1.f = v0;
559:        v0 = (Spinner)v0;
567:        v5 = new com.google.android.finsky.billing.addresschallenge.a.n(v0, v1.d, v1.e);
580:        v5.d = new ArrayAdapter(v6.a, 17367048);
587:        v5.d.setDropDownViewResource(17367049);
592:        v0.setAdapter(v5.d);
597:        v5.a(v1.c, "");
604:        if (v1.a.length() > 0)
606:            v0.setPrompt(v1.a);
609:        v0.setOnItemSelectedListener(v6);
614:        v6.v.add(v5);
        }
        else
619:        v0 = 0;
459:    if (v0 == 0) goto 668;
461:    v7.add(v0);
464:    v0 = 0;
465:    v3 = v0;
466:    goto 372;
668:    v0 = v3;
669:    goto 465;
    }

}
