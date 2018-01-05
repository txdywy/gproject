package com.google.common.p420f.p421a;

import com.google.common.p415b.ar;
import com.google.common.p415b.ce;

final class ab extends C6982z {
    ab(ar arVar) {
        Runnable acVar = new ac(this, arVar);
        this.f34384f = acVar;
        if (acVar.f34377a.isEmpty()) {
            acVar.mo5931c();
        } else if (acVar.f34378b) {
            r0 = (ce) acVar.f34377a.iterator();
            int i = 0;
            while (r0.hasNext()) {
                au auVar = (au) r0.next();
                int i2 = i + 1;
                auVar.mo5927a(new C6999t(acVar, i, auVar), ba.f34405a);
                i = i2;
            }
        } else {
            r0 = (ce) acVar.f34377a.iterator();
            while (r0.hasNext()) {
                ((au) r0.next()).mo5927a(acVar, ba.f34405a);
            }
        }
    }
}
