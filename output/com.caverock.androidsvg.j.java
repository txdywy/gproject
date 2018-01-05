package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.caverock.androidsvg.j
{

    public com.caverock.androidsvg.e a;
    public String b;
    public List c;
    public List d;

    j(com.caverock.androidsvg.e p0, String p1) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        if (p0 == 0)
            p0 = com.caverock.androidsvg.e.a;
        this.a = p0;
        this.b = p1;
    }

    public final void a(String p0, com.caverock.androidsvg.c p1, String p2) {
        if (this.c == 0)
            this.c = new ArrayList();
        this.c.add(new com.caverock.androidsvg.b(p0, p1, p2));
    }

    public final String toString() {
        v1 = new StringBuilder();
        if (this.a == com.caverock.androidsvg.e.b)
            v1.append("> ");
        else if (this.a == com.caverock.androidsvg.e.c)
            v1.append("+ ");
        if (this.b == 0)
            v0 = "*";
        else
            v0 = this.b;
        v1.append(v0);
        if (this.c != 0) {
            v2 = this.c.iterator();
            while (v2.hasNext()) {
                v0 = (com.caverock.androidsvg.b)v2.next();
                v1.append(91).append(v0.a);
                switch (v0.b.ordinal()) {
                    case 1:
                        v1.append(61).append(v0.c);
                        break;
                    case 2:
                        v1.append("~=").append(v0.c);
                        break;
                    case 3:
                        v1.append("|=").append(v0.c);
                        break;
                    default:
                        break;
                }
                v1.append(93);
            }
        }
        if (this.d != 0) {
            v2 = this.d.iterator();
            while (v2.hasNext())
                v1.append(58).append((String)v2.next());
        }
        return v1.toString();
    }

}
