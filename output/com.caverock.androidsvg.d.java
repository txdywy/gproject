package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

public final class com.caverock.androidsvg.d extends com.caverock.androidsvg.df
{

    d(String p0) {
        com.caverock.androidsvg.df(p0.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public final String a() {
 14:    if (!this.b()) goto 24;
 16:    v0 = this.b;
 20:    if (v0 == this.b)
 22:        v0 = 0;
        else {
 98:        this.b = v0;
100:        v0 = this.a.substring(this.b, v0);
        }
 23:    return v0;
 26:    v0 = this.b;
 32:    v1 = this.a.charAt(this.b);
 36:    if (v1 == 45)
 38:        v1 = this.i();
 42:    if (v1 < 65) goto 46;
 44:    if (v1 <= 90) goto 54;
 46:    if (v1 < 97) goto 52;
 50:    if (v1 <= 122) goto 54;
 52:    if (v1 != 95) goto 87;
 54:    v0 = this.i();
 58:    if (v0 < 65) goto 62;
 60:    if (v0 <= 90) goto 80;
 62:    if (v0 < 97) goto 68;
 66:    if (v0 <= 122) goto 80;
 70:    if (v0 < 48) goto 76;
 74:    if (v0 <= 57) goto 80;
 76:    if (v0 == 45) goto 80;
 78:    if (v0 != 95) goto 85;
 80:    v0 = this.i();
 84:    goto 58;
 85:    v0 = this.b;
 87:    this.b = this.b;
 89:    goto 18;
    }

    public final boolean a(com.caverock.androidsvg.i p0) {
  6:    if (this.b()) {
  8:        v0 = 0;
  9:        return v0;
        }
 16:    if (!p0.b()) {
 24:        if (this.a(62)) {
 26:            v0 = com.caverock.androidsvg.e.b;
 28:            this.c();
            }
 85:        else if (this.a(43)) {
 87:            v0 = com.caverock.androidsvg.e.c;
 89:            this.c();
            }
            else
401:            v0 = 0;
        }
        else
401:        v0 = 0;
 37:    if (this.a(42))
 41:        v2 = new com.caverock.androidsvg.j(v0, 0);
        else {
 93:        v3 = this.a();
 97:        if (v3 != 0) {
101:            v2 = new com.caverock.androidsvg.j(v0, v3);
108:            p0.b = p0.b + 1;
            }
            else
398:            v2 = 0;
        }
 44:    while (true) {
 44:        while (true) {
 48:            if (this.b()) {
338:                if (v2 != 0) {
342:                    if (p0.a == 0)
349:                        p0.a = new ArrayList();
353:                    p0.a.add(v2);
356:                    v0 = 1;
                    }
                    else {
387:                    this.b = this.b;
389:                    v0 = 0;
                    }
357:                return v0;
                }
 56:            if (!this.a(46))
 56:                break;
 58:            if (v2 == 0)
 62:                v2 = new com.caverock.androidsvg.j(v0, 0);
 65:            v3 = this.a();
 69:            if (v3 == 0)
 78:                throw new SAXException("Invalid \".class\" selector in <style> element");
115:            v2.a("class", com.caverock.androidsvg.c.b, v3);
118:            p0.c();
            }
128:        if (this.a(35)) {
130:            if (v2 == 0)
134:                v2 = new com.caverock.androidsvg.j(v0, 0);
137:            v3 = this.a();
141:            if (v3 == 0)
150:                throw new SAXException("Invalid \"#id\" selector in <style> element");
155:            v2.a("id", com.caverock.androidsvg.c.b, v3);
162:            p0.b = p0.b + 10000;
            }
164:        if (v2 == 0) {
338:            if (v2 != 0) {
342:                if (p0.a == 0)
349:                    p0.a = new ArrayList();
353:                p0.a.add(v2);
356:                v0 = 1;
                }
                else {
387:                this.b = this.b;
389:                v0 = 0;
                }
357:            return v0;
            }
172:        if (!this.a(91))
172:            break;
174:        this.c();
177:        v7 = this.a();
181:        if (v7 == 0)
190:            throw new SAXException("Invalid attribute selector in <style> element");
191:        this.c();
200:        if (this.a(61))
202:            v4 = com.caverock.androidsvg.c.b;
232:        else if (this.a("~="))
234:            v4 = com.caverock.androidsvg.c.c;
243:        else if (this.a("|="))
245:            v4 = com.caverock.androidsvg.c.d;
            else
395:            v4 = 0;
204:        if (v4 != 0) {
206:            this.c();
213:            if (this.b())
215:                v3 = 0;
                else {
248:                v3 = this.m();
252:                if (v3 == 0)
254:                    v3 = this.a();
                }
216:            if (v3 == 0)
225:                throw new SAXException("Invalid attribute selector in <style> element");
259:            this.c();
            }
            else
392:            v3 = 0;
268:        if (!this.a(93))
277:            throw new SAXException("Invalid attribute selector in <style> element");
278:        if (v4 == 0)
280:            v4 = com.caverock.androidsvg.c.a;
282:        v2.a(v7, v4, v3);
285:        p0.c();
        }
296:    if (!this.a(58)) {
338:        if (v2 != 0) {
342:            if (p0.a == 0)
349:                p0.a = new ArrayList();
353:            p0.a.add(v2);
356:            v0 = 1;
            }
            else {
387:            this.b = this.b;
389:            v0 = 0;
            }
357:        return v0;
        }
304:    if (this.a() == 0) {
338:        if (v2 != 0) {
342:            if (p0.a == 0)
349:                p0.a = new ArrayList();
353:            p0.a.add(v2);
356:            v0 = 1;
            }
            else {
387:            this.b = this.b;
389:            v0 = 0;
            }
357:        return v0;
        }
312:    if (!this.a(40)) goto 359;
314:    this.c();
321:    if (this.a() == 0) goto 359;
323:    this.c();
332:    if (this.a(41)) goto 359;
336:    this.b = this.b - 1;
338:    if (v2 != 0) {
342:        if (p0.a == 0)
349:            p0.a = new ArrayList();
353:        p0.a.add(v2);
356:        v0 = 1;
        }
        else {
387:        this.b = this.b;
389:        v0 = 0;
        }
357:    return v0;
369:    if (v2.d == 0)
376:        v2.d = new ArrayList();
380:    v2.d.add(this.a.substring(this.b, this.b));
383:    p0.c();
386:    goto 338;
    }

}
