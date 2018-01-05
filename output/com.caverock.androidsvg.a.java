package com.caverock.androidsvg;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.SAXException;

final class com.caverock.androidsvg.a
{

    public com.caverock.androidsvg.f a;
    public boolean b;

    a(com.caverock.androidsvg.f p0) {
        this.a = 0;
        this.b = 0;
        this.a = p0;
    }

    private static int a(List p0, int p1, com.caverock.androidsvg.bk p2) {
        if (p1 < 0)
            v1 = -1;
        else {
            if (p0.get(p1) != p2.u) {
                v1 = -1;
                return v1;
            }
            v3 = p2.u.a().iterator();
            v1 = 0;
            while (v3.hasNext()) {
                if ((com.caverock.androidsvg.bm)v3.next() == p2)
                    return v1;
                v1 = v1 + 1;
            }
            v1 = -1;
        }
        return v1;
    }

    private static boolean a(com.caverock.androidsvg.h p0, com.caverock.androidsvg.d p1) {
        if (p1.b())
            v0 = 0;
        else {
            v3 = new ArrayList(1);
            v0 = new com.caverock.androidsvg.i();
            while (!p1.b() && p1.a(v0)) {
                if (!p1.d())
                    continue;
                v3.add(v0);
                v0 = new com.caverock.androidsvg.i();
            }
            if (!v0.b())
                v3.add(v0);
            v0 = v3;
        }
        if (v0 != 0 && !v0.isEmpty()) {
            if (!p1.a(123))
                throw new SAXException("Malformed rule block in <style> element: missing '{'");
            p1.c();
            p1.c();
            v3 = 0;
            while (v3 < ((ArrayList)v0).size()) {
                v1 = ((ArrayList)v0).get(v3);
                v3 = v3 + 1;
                p0.a(new com.caverock.androidsvg.g((com.caverock.androidsvg.i)v1, com.caverock.androidsvg.a.d(p1)));
            }
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

    private static boolean a(com.caverock.androidsvg.i p0, int p1, List p2, int p3) {
        while (true) {
            v3 = p0.a(p1);
            v0 = (com.caverock.androidsvg.bk)p2.get(p3);
            if (!com.caverock.androidsvg.a.a(v3, p2, p3, v0)) {
                v0 = 0;
                return v0;
            }
            if (v3.a == com.caverock.androidsvg.e.a) {
                if (p1 == 0) {
                    v0 = 1;
                    return v0;
                }
                while (p3 > 0) {
                    p3 = p3 - 1;
                    if (com.caverock.androidsvg.a.a(p0, p1 - 1, p2, p3)) {
                        v0 = 1;
                        return v0;
                    }
                }
                v0 = 0;
                return v0;
            }
            if (v3.a != com.caverock.androidsvg.e.b)
                break;
            p1 = p1 - 1;
            p3 = p3 - 1;
        }
        v2 = com.caverock.androidsvg.a.a(p2, p3, v0);
        if (v2 <= 0)
            v0 = 0;
        else
            v0 = com.caverock.androidsvg.a.a(p0, p1 - 1, p2, p3, (com.caverock.androidsvg.bk)v0.u.a().get(v2 - 1));
        return v0;
    }

    static boolean a(com.caverock.androidsvg.i p0, int p1, List p2, int p3, com.caverock.androidsvg.bk p4) {
  2:    v0 = p0.a(p1);
 10:    if (!com.caverock.androidsvg.a.a(v0, p2, p3, p4)) {
 12:        v0 = 0;
 13:        return v0;
        }
 18:    if (v0.a != com.caverock.androidsvg.e.a) goto 40;
 20:    if (p1 == 0) {
 22:        v0 = 1;
 23:        return v0;
        }
 21:    goto 26;
 24:    p3 = p3 - 1;
 26:    if (p3 < 0) {
 38:        v0 = 0;
 39:        return v0;
        }
 34:    if (com.caverock.androidsvg.a.a(p0, p1 - 1, p2, p3)) {
 36:        v0 = 1;
 37:        return v0;
        }
 35:    goto 24;
 44:    if (v0.a == com.caverock.androidsvg.e.b) {
 48:        v0 = com.caverock.androidsvg.a.a(p0, p1 - 1, p2, p3);
 52:        return v0;
        }
 53:    v0 = com.caverock.androidsvg.a.a(p2, p3, p4);
 57:    if (v0 <= 0) {
 59:        v0 = 0;
 60:        return v0;
        }
 75:    p1 = p1 - 1;
 77:    p4 = (com.caverock.androidsvg.bk)p4.u.a().get(v0 - 1);
 78:    goto 2;
    }

    static boolean a(com.caverock.androidsvg.j p0, List p1, int p2, com.caverock.androidsvg.bk p3) {
        if (p0.b == 0) {
            if (p0.c != 0) {
                v2 = p0.c.iterator();
                while (v2.hasNext()) {
                    v0 = (com.caverock.androidsvg.b)v2.next();
                    if (v0.a == "id") {
                        if (!v0.c.equals(p3.o)) {
                            v0 = 0;
                            return v0;
                        }
                    }
                    else {
                        if (v0.a != "class") {
                            v0 = 0;
                            return v0;
                        }
                        if (p3.s == 0) {
                            v0 = 0;
                            return v0;
                        }
                        if (!p3.s.contains(v0.c)) {
                            v0 = 0;
                            return v0;
                        }
                    }
                }
            }
            if (p0.d != 0) {
                v2 = p0.d.iterator();
                while (v2.hasNext()) {
                    if (!((String)v2.next()).equals("first-child")) {
                        v0 = 0;
                        return v0;
                    }
                    if (com.caverock.androidsvg.a.a(p1, p2, p3) != 0) {
                        v0 = 0;
                        return v0;
                    }
                }
            }
            v0 = 1;
            return v0;
        }
        if (!p0.b.equalsIgnoreCase("G")) {
            if (!p0.b.equals(p3.getClass().getSimpleName().toLowerCase(Locale.US))) {
                v0 = 0;
                return v0;
            }
            if (p0.c != 0) {
                v2 = p0.c.iterator();
                while (v2.hasNext()) {
                    v0 = (com.caverock.androidsvg.b)v2.next();
                    if (v0.a == "id") {
                        if (!v0.c.equals(p3.o)) {
                            v0 = 0;
                            return v0;
                        }
                    }
                    else {
                        if (v0.a != "class") {
                            v0 = 0;
                            return v0;
                        }
                        if (p3.s == 0) {
                            v0 = 0;
                            return v0;
                        }
                        if (!p3.s.contains(v0.c)) {
                            v0 = 0;
                            return v0;
                        }
                    }
                }
            }
            if (p0.d != 0) {
                v2 = p0.d.iterator();
                while (v2.hasNext()) {
                    if (!((String)v2.next()).equals("first-child")) {
                        v0 = 0;
                        return v0;
                    }
                    if (com.caverock.androidsvg.a.a(p1, p2, p3) != 0) {
                        v0 = 0;
                        return v0;
                    }
                }
            }
            v0 = 1;
            return v0;
        }
        if (!(p3 instanceof com.caverock.androidsvg.ac)) {
            v0 = 0;
            return v0;
            if (!p0.b.equals(p3.getClass().getSimpleName().toLowerCase(Locale.US))) {
                v0 = 0;
                return v0;
            }
        }
        if (p0.c != 0) {
            v2 = p0.c.iterator();
            while (v2.hasNext()) {
                v0 = (com.caverock.androidsvg.b)v2.next();
                if (v0.a == "id") {
                    if (!v0.c.equals(p3.o)) {
                        v0 = 0;
                        return v0;
                    }
                }
                else {
                    if (v0.a != "class") {
                        v0 = 0;
                        return v0;
                    }
                    if (p3.s == 0) {
                        v0 = 0;
                        return v0;
                    }
                    if (!p3.s.contains(v0.c)) {
                        v0 = 0;
                        return v0;
                    }
                }
            }
        }
        if (p0.d != 0) {
            v2 = p0.d.iterator();
            while (v2.hasNext()) {
                if (!((String)v2.next()).equals("first-child")) {
                    v0 = 0;
                    return v0;
                }
                if (com.caverock.androidsvg.a.a(p1, p2, p3) != 0) {
                    v0 = 0;
                    return v0;
                }
            }
        }
        v0 = 1;
        return v0;
    }

    public static boolean a(String p0, com.caverock.androidsvg.f p1) {
        v0 = new com.caverock.androidsvg.d(p0);
        v0.c();
        if (!v0.b())
            throw new SAXException("Invalid @media type list");
        return com.caverock.androidsvg.a.a(com.caverock.androidsvg.a.b(v0), p1);
    }

    private static boolean a(List p0, com.caverock.androidsvg.f p1) {
        v1 = p0.iterator();
        while (true) {
            if (!v1.hasNext()) {
                v0 = 0;
                return v0;
            }
            v0 = (com.caverock.androidsvg.f)v1.next();
            if (v0 == com.caverock.androidsvg.f.a) {
                v0 = 1;
                return v0;
            }
            if (v0 == p1) {
                v0 = 1;
                return v0;
            }
        }
    }

    private static List b(com.caverock.androidsvg.d p0) {
        v0 = new ArrayList();
        while (true) {
            if (p0.b())
                return v0;
            try {
                v0.add(com.caverock.androidsvg.f.valueOf(p0.b(44)));
            }
            catch (IllegalArgumentException ex) {
                throw new SAXException("Invalid @media type list");
            }
            if (!p0.d())
                return v0;
        }
    }

    private static void c(com.caverock.androidsvg.d p0) {
        v0 = 0;
        while (true) {
            while (true) {
                if (p0.b())
                    return;
                v1 = p0.g().intValue();
                if (v1 == 59) {
                    if (v0 == 0)
                        return;
                }
                if (v1 != 123)
                    break;
                v0 = v0 + 1;
            }
            if (v1 != 125)
                continue;
            if (v0 <= 0)
                continue;
            v0 = v0 - 1;
            if (v0 == 0)
                return;
        }
    }

    private static com.caverock.androidsvg.av d(com.caverock.androidsvg.d p0) {
        v4 = new com.caverock.androidsvg.av();
        while (true) {
            p0.c();
            if (!p0.a(58))
                throw new SAXException("Malformed rule set in <style> element");
            p0.c();
            if (p0.b())
                v0 = 0;
            else {
                v3 = p0.a.charAt(p0.b);
                v0 = p0.b;
                while (v3 != -1 && v3 != 59 && v3 != 125 && v3 != 33) {
                    if (v3 == 10 || v3 == 13)
                        v2 = 1;
                    else
                        v2 = 0;
                    if (v2 != 0)
                        break;
                    if (!com.caverock.androidsvg.d.a(v3))
                        v0 = p0.b + 1;
                    v3 = p0.i();
                }
                if (p0.b > p0.b)
                    v0 = p0.a.substring(p0.b, v0);
                else {
                    p0.b = p0.b;
                    v0 = 0;
                }
            }
            if (v0 == 0)
                throw new SAXException("Malformed rule set in <style> element");
            p0.c();
            if (p0.a(33)) {
                p0.c();
                if (!p0.a("important"))
                    throw new SAXException("Malformed rule set in <style> element: found unexpected '!'");
                p0.c();
            }
            p0.a(59);
            com.caverock.androidsvg.cy.a(v4, p0.a(), v0);
            p0.c();
            if (p0.a(125))
                return v4;
            if (p0.b())
                throw new SAXException("Malformed rule set in <style> element");
        }
    }

    final com.caverock.androidsvg.h a(com.caverock.androidsvg.d p0) {
  4:    v0 = new com.caverock.androidsvg.h();
 11:    if (p0.b())
157:        return v0;
 19:    if (p0.a("<!--")) goto 7;
 27:    if (p0.a("-->")) goto 7;
 35:    if (!p0.a(64)) goto 151;
 37:    v1 = p0.a();
 41:    p0.c();
 44:    if (v1 == 0)
 53:        throw new SAXException("Invalid '@' rule in <style> element");
 56:    if (this.b != 0) goto 128;
 64:    if (!v1.equals("media")) goto 128;
 76:    if (!p0.a(123))
 85:        throw new SAXException("Invalid @media rule: missing rule set");
 86:    p0.c();
 95:    if (com.caverock.androidsvg.a.a(com.caverock.androidsvg.a.b(p0), this.a)) {
 97:        this.b = 1;
103:        v0.a(this.a(p0));
106:        this.b = 0;
        }
        else
124:        this.a(p0);
114:    if (!p0.a(125))
123:        throw new SAXException("Invalid @media rule: expected '}' at end of rule set");
115:    goto 146;
130:    v3 = new Object[1];
132:    v3[0] = v1;
140:    Log.w("AndroidSVG CSSParser", String.format("Ignoring @%s rule", v3));
143:    com.caverock.androidsvg.a.c(p0);
146:    p0.c();
149:    goto 7;
155:    if (!com.caverock.androidsvg.a.a(v0, p0))
157:        return v0;
156:    goto 7;
    }

}
