package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

final class ac implements C1705y {
    public final /* synthetic */ al f8810a;
    public final /* synthetic */ C1705y f8811b;
    public final /* synthetic */ Queue f8812c;
    public final /* synthetic */ ab f8813d;

    ac(ab abVar, al alVar, C1705y c1705y, Queue queue) {
        this.f8813d = abVar;
        this.f8810a = alVar;
        this.f8811b = c1705y;
        this.f8812c = queue;
    }

    public final void mo2413a() {
    }

    public final void mo2414b() {
        String str = null;
        List<aq> a = this.f8813d.m9525a(this.f8810a);
        if (!a.isEmpty()) {
            String str2;
            String str3;
            if (this.f8812c.size() > 0) {
                str2 = (String) this.f8812c.remove();
                for (aq aqVar : a) {
                    if (aqVar.m9560a(str2)) {
                        ab abVar = this.f8813d;
                        al alVar = this.f8810a;
                        str3 = aqVar.f8849a;
                        String[] split = alVar.toString().split("/");
                        if (abVar.f8807c == null) {
                            str2 = null;
                        } else {
                            str2 = az.m9580b(abVar.f8807c);
                        }
                        str = alVar.toString();
                        str3 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str3).length()).append(str).append("/").append(str3).toString();
                        if (split.length != 1 || str2 == null || abVar.m9528a(str2)) {
                            str2 = str3;
                        } else {
                            str3 = String.valueOf(str3);
                            str2 = str2.toString();
                            str2 = new StringBuilder((String.valueOf(str3).length() + 2) + String.valueOf(str2).length()).append(str3).append("--").append(str2).toString();
                        }
                        this.f8813d.m9527a(new am(str2).m9554a(), this.f8812c, this.f8811b);
                        return;
                    }
                }
            }
            str2 = ((aq) a.get(0)).f8849a;
            ab abVar2 = this.f8813d;
            al alVar2 = this.f8810a;
            String[] split2 = alVar2.toString().split("/");
            if (abVar2.f8807c != null) {
                str = az.m9580b(abVar2.f8807c);
            }
            String alVar3 = alVar2.toString();
            str2 = new StringBuilder((String.valueOf(alVar3).length() + 1) + String.valueOf(str2).length()).append(alVar3).append("/").append(str2).toString();
            if (!(split2.length != 1 || str == null || abVar2.m9528a(str))) {
                str2 = String.valueOf(str2);
                str3 = str.toString();
                str2 = new StringBuilder((String.valueOf(str2).length() + 2) + String.valueOf(str3).length()).append(str2).append("--").append(str3).toString();
            }
            this.f8813d.m9527a(new am(str2).m9554a(), new LinkedList(), this.f8811b);
        } else if (this.f8811b != null) {
            this.f8811b.mo2414b();
        }
    }
}
