package com.caverock.androidsvg;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.xml.sax.SAXException;

public final class C0705a {
    public C0711f f4197a = null;
    public boolean f4198b = false;

    public C0705a(C0711f c0711f) {
        this.f4197a = c0711f;
    }

    public static boolean m4526a(String str, C0711f c0711f) {
        df c0709d = new C0709d(str);
        c0709d.m4755c();
        List b = C0705a.m4528b(c0709d);
        if (c0709d.m4754b()) {
            return C0705a.m4527a(b, c0711f);
        }
        throw new SAXException("Invalid @media type list");
    }

    private static boolean m4527a(List list, C0711f c0711f) {
        for (C0711f c0711f2 : list) {
            if (c0711f2 != C0711f.all) {
                if (c0711f2 == c0711f) {
                }
            }
            return true;
        }
        return false;
    }

    private static List m4528b(C0709d c0709d) {
        List arrayList = new ArrayList();
        while (!c0709d.m4754b()) {
            try {
                arrayList.add(C0711f.valueOf(c0709d.m4753b(',')));
                if (!c0709d.m4756d()) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    private static void m4529c(C0709d c0709d) {
        int i = 0;
        while (!c0709d.m4754b()) {
            int intValue = c0709d.m4759g().intValue();
            if (intValue != 59 || i != 0) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0) {
                    i--;
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    final C0713h m4531a(C0709d c0709d) {
        C0713h c0713h = new C0713h();
        while (!c0709d.m4754b()) {
            if (!(c0709d.m4752a("<!--") || c0709d.m4752a("-->"))) {
                if (c0709d.m4751a('@')) {
                    String a = c0709d.m4766a();
                    c0709d.m4755c();
                    if (a == null) {
                        throw new SAXException("Invalid '@' rule in <style> element");
                    }
                    if (this.f4198b || !a.equals("media")) {
                        Log.w("AndroidSVG CSSParser", String.format("Ignoring @%s rule", new Object[]{a}));
                        C0705a.m4529c(c0709d);
                    } else {
                        List b = C0705a.m4528b(c0709d);
                        if (c0709d.m4751a('{')) {
                            c0709d.m4755c();
                            if (C0705a.m4527a(b, this.f4197a)) {
                                this.f4198b = true;
                                c0713h.m4772a(m4531a(c0709d));
                                this.f4198b = false;
                            } else {
                                m4531a(c0709d);
                            }
                            if (!c0709d.m4751a('}')) {
                                throw new SAXException("Invalid @media rule: expected '}' at end of rule set");
                            }
                        }
                        throw new SAXException("Invalid @media rule: missing rule set");
                    }
                    c0709d.m4755c();
                } else if (!C0705a.m4522a(c0713h, c0709d)) {
                    break;
                }
            }
        }
        return c0713h;
    }

    private static boolean m4522a(C0713h c0713h, C0709d c0709d) {
        if (c0709d.m4754b()) {
            List list = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            C0714i c0714i = new C0714i();
            while (!c0709d.m4754b() && c0709d.m4767a(c0714i)) {
                if (c0709d.m4756d()) {
                    arrayList.add(c0714i);
                    c0714i = new C0714i();
                }
            }
            if (!c0714i.m4775b()) {
                arrayList.add(c0714i);
            }
            Object obj = arrayList;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (c0709d.m4751a('{')) {
            c0709d.m4755c();
            av d = C0705a.m4530d(c0709d);
            c0709d.m4755c();
            ArrayList arrayList2 = (ArrayList) list;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                c0713h.m4771a(new C0712g((C0714i) obj2, d));
            }
            return true;
        }
        throw new SAXException("Malformed rule block in <style> element: missing '{'");
    }

    private static av m4530d(C0709d c0709d) {
        av avVar = new av();
        do {
            String a = c0709d.m4766a();
            c0709d.m4755c();
            if (!c0709d.m4751a(':')) {
                break;
            }
            String str;
            c0709d.m4755c();
            if (c0709d.m4754b()) {
                str = null;
            } else {
                int i = c0709d.b;
                int i2 = c0709d.b;
                int charAt = c0709d.a.charAt(c0709d.b);
                int i3 = i2;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33) {
                    Object obj = (charAt == 10 || charAt == 13) ? 1 : null;
                    if (obj != null) {
                        break;
                    }
                    if (!df.m4748a(charAt)) {
                        i3 = c0709d.b + 1;
                    }
                    charAt = c0709d.m4761i();
                }
                if (c0709d.b > i) {
                    str = c0709d.a.substring(i, i3);
                } else {
                    c0709d.b = i;
                    str = null;
                }
            }
            if (str == null) {
                break;
            }
            c0709d.m4755c();
            if (c0709d.m4751a('!')) {
                c0709d.m4755c();
                if (c0709d.m4752a("important")) {
                    c0709d.m4755c();
                } else {
                    throw new SAXException("Malformed rule set in <style> element: found unexpected '!'");
                }
            }
            c0709d.m4751a(';');
            cy.m4715a(avVar, a, str);
            c0709d.m4755c();
            if (c0709d.m4751a('}')) {
                return avVar;
            }
        } while (!c0709d.m4754b());
        throw new SAXException("Malformed rule set in <style> element");
    }

    static boolean m4524a(C0714i c0714i, int i, List list, int i2, bk bkVar) {
        while (true) {
            C0715j a = c0714i.m4774a(i);
            if (!C0705a.m4525a(a, list, i2, bkVar)) {
                return false;
            }
            if (a.f4585a == C0710e.DESCENDANT) {
                break;
            } else if (a.f4585a == C0710e.CHILD) {
                return C0705a.m4523a(c0714i, i - 1, list, i2);
            } else {
                int a2 = C0705a.m4521a(list, i2, bkVar);
                if (a2 <= 0) {
                    return false;
                }
                i--;
                bkVar = (bk) bkVar.u.mo1095a().get(a2 - 1);
            }
        }
        if (i == 0) {
            return true;
        }
        while (i2 >= 0) {
            if (C0705a.m4523a(c0714i, i - 1, list, i2)) {
                return true;
            }
            i2--;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4523a(com.caverock.androidsvg.C0714i r6, int r7, java.util.List r8, int r9) {
        /*
        r2 = 1;
        r1 = 0;
    L_0x0002:
        r3 = r6.m4774a(r7);
        r0 = r8.get(r9);
        r0 = (com.caverock.androidsvg.bk) r0;
        r4 = com.caverock.androidsvg.C0705a.m4525a(r3, r8, r9, r0);
        if (r4 != 0) goto L_0x0014;
    L_0x0012:
        r0 = r1;
    L_0x0013:
        return r0;
    L_0x0014:
        r4 = r3.f4585a;
        r5 = com.caverock.androidsvg.C0710e.DESCENDANT;
        if (r4 != r5) goto L_0x002e;
    L_0x001a:
        if (r7 != 0) goto L_0x001e;
    L_0x001c:
        r0 = r2;
        goto L_0x0013;
    L_0x001e:
        if (r9 <= 0) goto L_0x002c;
    L_0x0020:
        r0 = r7 + -1;
        r9 = r9 + -1;
        r0 = com.caverock.androidsvg.C0705a.m4523a(r6, r0, r8, r9);
        if (r0 == 0) goto L_0x001e;
    L_0x002a:
        r0 = r2;
        goto L_0x0013;
    L_0x002c:
        r0 = r1;
        goto L_0x0013;
    L_0x002e:
        r3 = r3.f4585a;
        r4 = com.caverock.androidsvg.C0710e.CHILD;
        if (r3 != r4) goto L_0x0039;
    L_0x0034:
        r7 = r7 + -1;
        r9 = r9 + -1;
        goto L_0x0002;
    L_0x0039:
        r2 = com.caverock.androidsvg.C0705a.m4521a(r8, r9, r0);
        if (r2 > 0) goto L_0x0041;
    L_0x003f:
        r0 = r1;
        goto L_0x0013;
    L_0x0041:
        r0 = r0.u;
        r0 = r0.mo1095a();
        r1 = r2 + -1;
        r0 = r0.get(r1);
        r0 = (com.caverock.androidsvg.bk) r0;
        r1 = r7 + -1;
        r0 = com.caverock.androidsvg.C0705a.m4524a(r6, r1, r8, r9, r0);
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.a.a(com.caverock.androidsvg.i, int, java.util.List, int):boolean");
    }

    private static int m4521a(List list, int i, bk bkVar) {
        if (i < 0) {
            return -1;
        }
        if (list.get(i) != bkVar.u) {
            return -1;
        }
        int i2 = 0;
        for (bm bmVar : bkVar.u.mo1095a()) {
            if (bmVar == bkVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    static boolean m4525a(C0715j c0715j, List list, int i, bk bkVar) {
        if (c0715j.f4586b != null) {
            if (c0715j.f4586b.equalsIgnoreCase("G")) {
                if (!(bkVar instanceof ac)) {
                    return false;
                }
            } else if (!c0715j.f4586b.equals(bkVar.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        if (c0715j.f4587c != null) {
            for (C0706b c0706b : c0715j.f4587c) {
                if (c0706b.f4328a == "id") {
                    if (!c0706b.f4330c.equals(bkVar.f4205o)) {
                        return false;
                    }
                } else if (c0706b.f4328a != "class") {
                    return false;
                } else {
                    if (bkVar.f4209s == null) {
                        return false;
                    }
                    if (!bkVar.f4209s.contains(c0706b.f4330c)) {
                        return false;
                    }
                }
            }
        }
        if (c0715j.f4588d != null) {
            for (String equals : c0715j.f4588d) {
                if (!equals.equals("first-child")) {
                    return false;
                }
                if (C0705a.m4521a(list, i, bkVar) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
