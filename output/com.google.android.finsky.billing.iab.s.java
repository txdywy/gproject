package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.android.vending.b.h;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bj;
import com.google.wireless.android.a.a.a.a.bk;
import com.google.wireless.android.a.a.a.a.bl;
import java.util.List;

public final class com.google.android.finsky.billing.iab.s extends com.android.vending.b.h
{

    public final InAppBillingService a;

    s(InAppBillingService p0) {
        this.a = p0;
        com.android.vending.b.h();
    }

    private final com.google.android.finsky.billing.iab.t a(String p0, Bundle p1) {
  5:    v2 = new com.google.android.finsky.billing.iab.t();
 16:    v2.c = this.a.i.b();
 33:    if (!this.a.c.dj().a(12631549)) goto 210;
 51:    v2.d = com.google.android.finsky.billing.iab.w.a(p0, this.a, v2.c, this.a.c.dj());
 57:    if (v2.d != com.google.android.finsky.billing.iab.x.a) {
 59:        v0 = v2;
 60:        return v0;
        }
 73:    v2.b = Long.valueOf(this.a.i.a());
 75:    v0 = InAppBillingService.a;
 77:    if (p1 != 0) goto 97;
 87:    v2.a = this.a.d.b(p0);
 91:    if (v2.a == 0)
 93:        v2.d = v0;
 95:    v0 = v2;
 96:    return v0;
109:    if (p1 == 0) goto 195;
117:    if (!p1.containsKey("accountName")) goto 195;
123:    if (com.google.android.finsky.dh.a.a(this.a, p0)) goto 159;
129:    if (com.google.android.finsky.billing.iab.w.a(this.a, p0, this.a.c.dj())) goto 159;
133:    v1 = new Object[1];
135:    v1[0] = p0;
137:    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
147:    v1 = new Pair(0, com.google.android.finsky.billing.iab.x.f);
152:    v2.a = (Account)v1.first;
156:    v0 = (com.google.android.finsky.billing.iab.x)v1.second;
158:    goto 89;
167:    v0 = this.a.d.d.b(p1.getString("accountName"));
171:    if (v0 != 0) goto 182;
180:    v1 = new Pair(0, com.google.android.finsky.billing.iab.x.d);
181:    goto 148;
184:    p1.remove("accountName");
191:    v1 = new Pair(v0, com.google.android.finsky.billing.iab.x.a);
194:    goto 148;
195:    v0 = this.a.d.b(p0);
199:    if (v0 != 0) goto 187;
208:    v1 = new Pair(0, com.google.android.finsky.billing.iab.x.d);
209:    goto 148;
222:    v2.b = Long.valueOf(this.a.i.a());
224:    v0 = InAppBillingService.a;
226:    if (p1 != 0) goto 259;
236:    v2.a = this.a.d.b(p0);
248:    v2.d = this.a.a(p0, v2.a, v2.c);
254:    if (v2.d != com.google.android.finsky.billing.iab.x.a) {
256:        v0 = v2;
257:        return v0;
        }
255:    goto 372;
271:    if (p1 == 0) goto 357;
279:    if (!p1.containsKey("accountName")) goto 357;
285:    if (com.google.android.finsky.dh.a.a(this.a, p0)) goto 321;
291:    if (com.google.android.finsky.billing.iab.w.a(this.a, p0, this.a.c.dj())) goto 321;
295:    v1 = new Object[1];
297:    v1[0] = p0;
299:    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
309:    v1 = new Pair(0, com.google.android.finsky.billing.iab.x.f);
314:    v2.a = (Account)v1.first;
318:    v0 = (com.google.android.finsky.billing.iab.x)v1.second;
320:    goto 238;
329:    v0 = this.a.d.d.b(p1.getString("accountName"));
333:    if (v0 != 0) goto 344;
342:    v1 = new Pair(0, com.google.android.finsky.billing.iab.x.d);
343:    goto 310;
346:    p1.remove("accountName");
353:    v1 = new Pair(v0, com.google.android.finsky.billing.iab.x.a);
356:    goto 310;
357:    v0 = this.a.d.b(p0);
361:    if (v0 != 0) goto 349;
370:    v1 = new Pair(0, com.google.android.finsky.billing.iab.x.d);
371:    goto 310;
374:    if (v2.a == 0)
376:        v2.d = v0;
378:    goto 95;
    }

    public final int a() {
        return com.google.android.finsky.billing.iab.x.g.l;
    }

    public final int a(int p0, String p1, String p2) {
  0:    v2 = 0;
  2:    try {
  2:        v0 = this.a(p1, 0);
  6:        v1 = v0.b;
        }
        catch (Exception ex) {
 65:        v0 = ex;
 66:        v1 = 0;
 71:        InAppBillingService.a(this.a, v2, v0, p1, 621);
 76:        v0 = InAppBillingService.b.l;
 80:        if (v1 != 0)
 88:            this.a.i.a(v1.longValue());
 91:        return v0;
        }
        catch (Throwable ex) {
 92:        v0 = ex;
 93:        v1 = 0;
 96:        if (v1 != 0)
104:            this.a.i.a(v1.longValue());
107:        throw v0;
        }
 12:    if (v0.d == com.google.android.finsky.billing.iab.x.a) {
 30:        v2 = v0.a;
 47:        v0 = this.a.j.a(v2.name, this.a.a(p1)).a(p0, p2, 0);
 53:        if (v1 != 0)
 61:            this.a.i.a(v1.longValue());
 64:        return v0;
        }
 14:    v0 = v0.d.l;
 18:    if (v1 != 0)
 26:        this.a.i.a(v1.longValue());
 29:    return v0;
 30:    v2 = v0.a;
 47:    v0 = this.a.j.a(v2.name, this.a.a(p1)).a(p0, p2, 0);
 53:    if (v1 != 0)
 61:        this.a.i.a(v1.longValue());
 64:    return v0;
 65:    v0 = ex;
 66:    v1 = 0;
 71:    InAppBillingService.a(this.a, v2, v0, p1, 621);
 76:    v0 = InAppBillingService.b.l;
 80:    if (v1 != 0)
 88:        this.a.i.a(v1.longValue());
 91:    return v0;
 92:    v0 = ex;
 93:    v1 = 0;
 96:    if (v1 != 0)
104:        this.a.i.a(v1.longValue());
107:    throw v0;
108:    v0 = ex;
109:    goto 94;
110:    v0 = ex;
111:    goto 67;
112:    try
            run 67...78
        catch (Throwable ex) {
 67:        goto 108;
        }
113:    try
            run 30...50
        catch (Exception ex) {
 30:        goto 110;
        }
        catch (Throwable ex) {
 30:        goto 108;
        }
114:    try
            run 8...16
        catch (Exception ex) {
  8:        goto 110;
        }
        catch (Throwable ex) {
  8:        goto 108;
        }
    }

    public final Bundle a(int p0, String p1, String p2, Bundle p3) {
  0:    v2 = 0;
  2:    try {
  2:        v0 = this.a(p1, 0);
  6:        v1 = v0.b;
        }
        catch (Exception ex) {
101:        v0 = ex;
102:        v1 = 0;
107:        InAppBillingService.a(this.a, v2, v0, p1, 622);
116:        v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
122:        if (v1 != 0)
130:            this.a.i.a(v1.longValue());
133:        return v0;
        }
        catch (Throwable ex) {
134:        v0 = ex;
135:        v1 = 0;
138:        if (v1 != 0)
146:            this.a.i.a(v1.longValue());
149:        throw v0;
        }
 12:    if (v0.d != com.google.android.finsky.billing.iab.x.a) {
 18:        v0 = com.google.android.finsky.billing.iab.w.a(v0.d);
 24:        if (v1 != 0)
 32:            this.a.i.a(v1.longValue());
 35:        return v0;
        }
 36:    v3 = v0.a;
 38:    if (p3 != 0) goto 94;
 40:    if (v2 != 0) {
 76:        v0 = this.a.j.a(v3.name, this.a.a(p1)).a(p0, p1, p2, p3);
 82:        if (v1 != 0)
 90:            this.a.i.a(v1.longValue());
 93:        return v0;
        }
 46:    if (this.a.h != 0) {
 48:        if (p3 == 0)
 52:            p3 = new Bundle();
 59:        p3.putString("libraryVersion", "dp-1");
        }
 76:    v0 = this.a.j.a(v3.name, this.a.a(p1)).a(p0, p1, p2, p3);
 82:    if (v1 != 0)
 90:        this.a.i.a(v1.longValue());
 93:    return v0;
 96:    v2 = p3.getString("libraryVersion");
100:    goto 40;
101:    v0 = ex;
102:    v1 = 0;
107:    InAppBillingService.a(this.a, v2, v0, p1, 622);
116:    v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
122:    if (v1 != 0)
130:        this.a.i.a(v1.longValue());
133:    return v0;
134:    v0 = ex;
135:    v1 = 0;
138:    if (v1 != 0)
146:        this.a.i.a(v1.longValue());
149:    throw v0;
150:    v0 = ex;
151:    goto 136;
152:    v0 = ex;
153:    goto 103;
154:    v0 = ex;
155:    v2 = v3;
156:    goto 103;
157:    try
            run 103...119
        catch (Throwable ex) {
103:        goto 150;
        }
158:    try
            run 94...99
        catch (Exception ex) {
 94:        goto 154;
        }
        catch (Throwable ex) {
 94:        goto 150;
        }
159:    try
            run 42...79
        catch (Exception ex) {
 42:        goto 154;
        }
        catch (Throwable ex) {
 42:        goto 150;
        }
160:    try
            run 36...38
        catch (Exception ex) {
 36:        goto 152;
        }
        catch (Throwable ex) {
 36:        goto 150;
        }
161:    try
            run 8...21
        catch (Exception ex) {
  8:        goto 152;
        }
        catch (Throwable ex) {
  8:        goto 150;
        }
    }

    public final Bundle a(int p0, String p1, String p2, String p3) {
  0:    v1 = 0;
  2:    try {
  2:        v0 = this.a(p1, 0);
  6:        v6 = v0.b;
        }
        catch (Exception ex) {
 75:        v0 = ex;
 76:        v2 = 0;
 81:        InAppBillingService.a(this.a, v2, v0, p1, 624);
 90:        v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
 96:        if (v1 != 0)
104:            this.a.i.a(v1.longValue());
107:        return v0;
        }
        catch (Throwable ex) {
108:        v0 = ex;
109:        v6 = 0;
112:        if (v6 != 0)
120:            this.a.i.a(v6.longValue());
123:        throw v0;
        }
 12:    if (v0.d == com.google.android.finsky.billing.iab.x.a) {
 36:        v7 = v0.a;
 57:        v0 = this.a.j.a(v7.name, this.a.a(p1)).a(p0, p1, p2, p3, 0);
 63:        if (v6 != 0)
 71:            this.a.i.a(v6.longValue());
 74:        return v0;
        }
 18:    v0 = com.google.android.finsky.billing.iab.w.a(v0.d);
 24:    if (v6 != 0)
 32:        this.a.i.a(v6.longValue());
 35:    return v0;
 36:    v7 = v0.a;
 57:    v0 = this.a.j.a(v7.name, this.a.a(p1)).a(p0, p1, p2, p3, 0);
 63:    if (v6 != 0)
 71:        this.a.i.a(v6.longValue());
 74:    return v0;
 75:    v0 = ex;
 76:    v2 = 0;
 81:    InAppBillingService.a(this.a, v2, v0, p1, 624);
 90:    v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
 96:    if (v1 != 0)
104:        this.a.i.a(v1.longValue());
107:    return v0;
108:    v0 = ex;
109:    v6 = 0;
112:    if (v6 != 0)
120:        this.a.i.a(v6.longValue());
123:    throw v0;
124:    v0 = ex;
125:    goto 110;
126:    v0 = ex;
127:    v6 = v1;
128:    goto 110;
129:    v0 = ex;
130:    v2 = 0;
131:    v1 = v6;
132:    goto 77;
133:    v0 = ex;
134:    v1 = v6;
135:    v2 = v7;
136:    goto 77;
137:    try
            run 77...93
        catch (Throwable ex) {
 77:        goto 126;
        }
138:    try
            run 38...60
        catch (Exception ex) {
 38:        goto 133;
        }
        catch (Throwable ex) {
 38:        goto 124;
        }
139:    try
            run 36...38
        catch (Exception ex) {
 36:        goto 129;
        }
        catch (Throwable ex) {
 36:        goto 124;
        }
140:    try
            run 8...21
        catch (Exception ex) {
  8:        goto 129;
        }
        catch (Throwable ex) {
  8:        goto 124;
        }
    }

    public final Bundle a(int p0, String p1, String p2, String p3, Bundle p4) {
  1:    try {
  1:        v1 = this.a(p1, p4);
  5:        v6 = v1.b;
        }
        catch (Exception ex) {
 74:        v2 = ex;
 75:        v6 = 0;
 76:        v1 = 0;
 79:        v5 = new com.google.wireless.android.a.a.a.a.bk();
 87:        v5.b = new com.google.wireless.android.a.a.a.a.bl();
 92:        v5.b.a(2);
100:        InAppBillingService.a(this.a, v1, v2, p1, 624, v5);
109:        v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
115:        if (v6 != 0)
123:            this.a.i.a(v6.longValue());
126:        return v0;
        }
        catch (Throwable ex) {
128:        v6 = 0;
129:        v0 = ex;
132:        if (v6 != 0)
140:            this.a.i.a(v6.longValue());
143:        throw v0;
        }
 11:    if (v1.d == com.google.android.finsky.billing.iab.x.a) {
 56:        v0 = this.a.j.a(v1.a.name, this.a.a(p1)).b(p0, p1, p2, p3, p4);
 62:        if (v6 != 0)
 70:            this.a.i.a(v6.longValue());
 73:        return v0;
        }
 17:    v0 = com.google.android.finsky.billing.iab.w.a(v1.d);
 23:    if (v6 != 0)
 31:        this.a.i.a(v6.longValue());
 34:    return v0;
 56:    v0 = this.a.j.a(v1.a.name, this.a.a(p1)).b(p0, p1, p2, p3, p4);
 62:    if (v6 != 0)
 70:        this.a.i.a(v6.longValue());
 73:    return v0;
 74:    v2 = ex;
 75:    v6 = 0;
 76:    v1 = 0;
 79:    v5 = new com.google.wireless.android.a.a.a.a.bk();
 87:    v5.b = new com.google.wireless.android.a.a.a.a.bl();
 92:    v5.b.a(2);
100:    InAppBillingService.a(this.a, v1, v2, p1, 624, v5);
109:    v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
115:    if (v6 != 0)
123:        this.a.i.a(v6.longValue());
126:    return v0;
128:    v6 = 0;
129:    v0 = ex;
132:    if (v6 != 0)
140:        this.a.i.a(v6.longValue());
143:    throw v0;
144:    v0 = ex;
145:    goto 130;
146:    v2 = ex;
147:    v1 = 0;
148:    goto 77;
149:    v2 = ex;
150:    v1 = v1.a;
151:    goto 77;
152:    try
            run 77...112
        catch (Throwable ex) {
 77:        goto 144;
        }
153:    try
            run 37...59
        catch (Exception ex) {
 37:        goto 149;
        }
        catch (Throwable ex) {
 37:        goto 144;
        }
154:    try
            run 35...37
        catch (Exception ex) {
 35:        goto 146;
        }
        catch (Throwable ex) {
 35:        goto 144;
        }
155:    try
            run 7...20
        catch (Exception ex) {
  7:        goto 146;
        }
        catch (Throwable ex) {
  7:        goto 144;
        }
    }

    public final Bundle a(int p0, String p1, String p2, String p3, String p4) {
  0:    v1 = 0;
  2:    try {
  2:        v2 = this.a(p1, 0);
  6:        v7 = v2.b;
        }
        catch (Exception ex) {
 77:        v0 = ex;
 78:        v2 = 0;
 83:        InAppBillingService.a(this.a, v2, v0, p1, 623);
 92:        v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
 98:        if (v1 != 0)
106:            this.a.i.a(v1.longValue());
109:        return v0;
        }
        catch (Throwable ex) {
110:        v0 = ex;
111:        v7 = 0;
114:        if (v7 != 0)
122:            this.a.i.a(v7.longValue());
125:        throw v0;
        }
 12:    if (v2.d == com.google.android.finsky.billing.iab.x.a) {
 59:        v0 = this.a.j.a(v2.a.name, this.a.a(p1)).a(p0, p1, p2, p3, p4, v2.c);
 65:        if (v7 != 0)
 73:            this.a.i.a(v7.longValue());
 76:        return v0;
        }
 18:    v0 = com.google.android.finsky.billing.iab.w.a(v2.d);
 24:    if (v7 != 0)
 32:        this.a.i.a(v7.longValue());
 35:    return v0;
 59:    v0 = this.a.j.a(v2.a.name, this.a.a(p1)).a(p0, p1, p2, p3, p4, v2.c);
 65:    if (v7 != 0)
 73:        this.a.i.a(v7.longValue());
 76:    return v0;
 77:    v0 = ex;
 78:    v2 = 0;
 83:    InAppBillingService.a(this.a, v2, v0, p1, 623);
 92:    v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
 98:    if (v1 != 0)
106:        this.a.i.a(v1.longValue());
109:    return v0;
110:    v0 = ex;
111:    v7 = 0;
114:    if (v7 != 0)
122:        this.a.i.a(v7.longValue());
125:    throw v0;
126:    v0 = ex;
127:    goto 112;
128:    v0 = ex;
129:    v7 = v1;
130:    goto 112;
131:    v0 = ex;
132:    v2 = 0;
133:    v1 = v7;
134:    goto 79;
135:    v0 = ex;
136:    v1 = v7;
137:    v2 = v2.a;
138:    goto 79;
139:    try
            run 79...95
        catch (Throwable ex) {
 79:        goto 128;
        }
140:    try
            run 38...62
        catch (Exception ex) {
 38:        goto 135;
        }
        catch (Throwable ex) {
 38:        goto 126;
        }
141:    try
            run 36...38
        catch (Exception ex) {
 36:        goto 131;
        }
        catch (Throwable ex) {
 36:        goto 126;
        }
142:    try
            run 8...21
        catch (Exception ex) {
  8:        goto 131;
        }
        catch (Throwable ex) {
  8:        goto 126;
        }
    }

    public final Bundle a(int p0, String p1, String p2, String p3, String p4, Bundle p5) {
  0:    v5 = 0;
  8:    v6 = this.a(p1, p5);
 14:    v20 = v6.b;
 20:    if (v6.d != com.google.android.finsky.billing.iab.x.a) {
 28:        v4 = com.google.android.finsky.billing.iab.w.a(v6.d);
 36:        if (v20 != 0)
 44:            this.a.i.a(v20.longValue());
 47:        return v4;
        }
 50:    v21 = v6.a;
 68:    v23 = this.a.j.a(v21.name, this.a.a(p1));
 74:    if (p5 != 0) goto 135;
 77:    v22 = 0;
 81:    v19 = new Bundle();
 88:    v4 = v23.a(p0);
 94:    if (v4 == com.google.android.finsky.billing.iab.x.a) goto 146;
102:    v19.putInt("RESPONSE_CODE", v4.l);
114:    v23.a(v19, 3, p1, v22);
121:    if (v20 != 0)
129:        this.a.i.a(v20.longValue());
132:    v4 = v19;
134:    return v4;
143:    v22 = p5.getString("libraryVersion");
145:    goto 79;
149:    if (p0 >= 6) goto 246;
156:    FinskyLog.c("Input Error: getBuyIntentExtraParams was introduced in API version 6.", new Object[0]);
167:    v19.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
179:    v23.a(v19, 3, p1, v22);
182:    goto 117;
183:    v6 = ex;
184:    v10 = v20;
186:    v5 = v21;
190:    v9 = new com.google.wireless.android.a.a.a.a.bk();
198:    v9.a = new com.google.wireless.android.a.a.a.a.bj();
203:    v9.a.a(3);
214:    InAppBillingService.a(this.a, v5, v6, p1, 623, v9);
225:    v4 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
233:    if (v10 != 0)
241:        this.a.i.a(v10.longValue());
244:    return v4;
251:    v4 = v23.a(p3, 0);
257:    if (v4 == com.google.android.finsky.billing.iab.x.a) goto 299;
265:    v19.putInt("RESPONSE_CODE", v4.l);
277:    v23.a(v19, 3, p1, v22);
280:    goto 117;
282:    v4 = ex;
287:    if (v20 != 0)
295:        this.a.i.a(v20.longValue());
298:    throw v4;
303:    if (!TextUtils.isEmpty(p2)) goto 338;
310:    FinskyLog.c("Input Error: Non empty/null argument expected for sku.", new Object[0]);
321:    v19.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
333:    v23.a(v19, 3, p1, v22);
336:    goto 117;
350:    if (!v23.a(p3, p2, p1)) goto 377;
360:    v19.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.h.l);
372:    v23.a(v19, 3, p1, v22);
375:    goto 117;
377:    v8 = 0;
378:    v12 = 0;
379:    v13 = 0;
380:    v16 = 1;
382:    v18 = 0;
384:    if (p5 == 0) goto 555;
390:    if (p5.isEmpty()) goto 555;
400:    if (!p5.containsKey("vr")) goto 440;
405:    if (p0 >= 7) goto 440;
412:    FinskyLog.c("Input Error: VR mode purchase was introduced in API version 7.", new Object[0]);
423:    v19.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.f.l);
435:    v23.a(v19, 3, p1, v22);
438:    goto 117;
449:    if (!p5.getBoolean("isDynamicSku", 0))
451:        v16 = 1;
        else
498:        v16 = 0;
457:    v13 = p5.getBoolean("vr");
461:    if (v13 == 0) goto 501;
471:    if (!TextUtils.equals(p3, "subs")) goto 501;
481:    v19.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.d.l);
493:    v23.a(v19, 3, p1, v22);
496:    goto 117;
505:    v8 = p5.getStringArrayList("skusToReplace");
513:    p5.remove("skusToReplace");
520:    p5.remove("vr");
527:    p5.remove("isDynamicSku");
534:    p5.remove("libraryVersion");
541:    v18 = p5.getString("skuPackageName");
549:    if (!p5.isEmpty())
551:        v12 = com.google.android.finsky.billing.iab.e.a(p5);
583:    v4 = v23.l.a(v23.e, p0, p1, v8, p2, p3, p4, v12, v13, v23.g, Integer.valueOf(v6.c), v16, 1, v18);
587:    if (v4 == 0) {
597:        v19.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.g.l);
609:        v23.a(v19, 1, p1, v22);
        }
        else {
618:        v4 = v23.a(v19, v4);
631:        v23.a(v19, 3, p1, v22);
634:        if (v4 != 0)
640:            v23.a(v4, v19);
        }
612:    goto 117;
646:    v20 = 0;
648:    v4 = ex;
649:    goto 283;
651:    v4 = ex;
652:    v20 = v10;
654:    goto 283;
656:    v6 = ex;
657:    v10 = 0;
658:    goto 188;
660:    v6 = ex;
661:    v10 = v20;
663:    goto 188;
664:    try
            run 299...643
        catch (Exception ex) {
299:        goto 183;
        }
        catch (Throwable ex) {
299:        goto 282;
        }
665:    try
            run 247...280
        catch (Exception ex) {
247:        goto 183;
        }
        catch (Throwable ex) {
247:        goto 282;
        }
666:    try
            run 188...228
        catch (Throwable ex) {
188:        goto 651;
        }
667:    try
            run 135...182
        catch (Exception ex) {
135:        goto 183;
        }
        catch (Throwable ex) {
135:        goto 282;
        }
668:    try
            run 52...117
        catch (Exception ex) {
 52:        goto 183;
        }
        catch (Throwable ex) {
 52:        goto 282;
        }
669:    try
            run 48...52
        catch (Exception ex) {
 48:        goto 660;
        }
        catch (Throwable ex) {
 48:        goto 282;
        }
670:    try
            run 16...31
        catch (Exception ex) {
 16:        goto 660;
        }
        catch (Throwable ex) {
 16:        goto 282;
        }
671:    try
            run 2...16
        catch (Exception ex) {
  2:        goto 656;
        }
        catch (Throwable ex) {
  2:        goto 645;
        }
    }

    public final Bundle a(int p0, String p1, List p2, String p3, String p4, String p5) {
  0:    v1 = 0;
  3:    try {
  3:        v2 = this.a(p1, 0);
  7:        v8 = v2.b;
        }
        catch (Exception ex) {
 84:        v2 = ex;
 85:        v6 = 0;
 88:        v5 = new com.google.wireless.android.a.a.a.a.bk();
 96:        v5.a = new com.google.wireless.android.a.a.a.a.bj();
101:        v5.a.a(2);
109:        InAppBillingService.a(this.a, v1, v2, p1, 623, v5);
118:        v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
124:        if (v6 != 0)
132:            this.a.i.a(v6.longValue());
135:        return v0;
        }
        catch (Throwable ex) {
137:        v8 = 0;
138:        v0 = ex;
141:        if (v8 != 0)
149:            this.a.i.a(v8.longValue());
152:        throw v0;
        }
 13:    if (v2.d == com.google.android.finsky.billing.iab.x.a) {
 37:        v9 = v2.a;
 66:        v0 = this.a.j.a(v9.name, this.a.a(p1)).a(p0, p1, p2, p3, p4, p5, Integer.valueOf(v2.c));
 72:        if (v8 != 0)
 80:            this.a.i.a(v8.longValue());
 83:        return v0;
        }
 19:    v0 = com.google.android.finsky.billing.iab.w.a(v2.d);
 25:    if (v8 != 0)
 33:        this.a.i.a(v8.longValue());
 36:    return v0;
 37:    v9 = v2.a;
 66:    v0 = this.a.j.a(v9.name, this.a.a(p1)).a(p0, p1, p2, p3, p4, p5, Integer.valueOf(v2.c));
 72:    if (v8 != 0)
 80:        this.a.i.a(v8.longValue());
 83:    return v0;
 84:    v2 = ex;
 85:    v6 = 0;
 88:    v5 = new com.google.wireless.android.a.a.a.a.bk();
 96:    v5.a = new com.google.wireless.android.a.a.a.a.bj();
101:    v5.a.a(2);
109:    InAppBillingService.a(this.a, v1, v2, p1, 623, v5);
118:    v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
124:    if (v6 != 0)
132:        this.a.i.a(v6.longValue());
135:    return v0;
137:    v8 = 0;
138:    v0 = ex;
141:    if (v8 != 0)
149:        this.a.i.a(v8.longValue());
152:    throw v0;
153:    v0 = ex;
154:    goto 139;
155:    v0 = ex;
156:    v8 = v6;
157:    goto 139;
158:    v2 = ex;
159:    v6 = v8;
160:    goto 86;
161:    v2 = ex;
162:    v6 = v8;
163:    v1 = v9;
164:    goto 86;
165:    try
            run 86...121
        catch (Throwable ex) {
 86:        goto 155;
        }
166:    try
            run 39...69
        catch (Exception ex) {
 39:        goto 161;
        }
        catch (Throwable ex) {
 39:        goto 153;
        }
167:    try
            run 37...39
        catch (Exception ex) {
 37:        goto 158;
        }
        catch (Throwable ex) {
 37:        goto 153;
        }
168:    try
            run 9...22
        catch (Exception ex) {
  9:        goto 158;
        }
        catch (Throwable ex) {
  9:        goto 153;
        }
    }

    public final int b(int p0, String p1, String p2) {
  0:    v2 = 0;
  2:    try {
  2:        v0 = this.a(p1, 0);
  6:        v1 = v0.b;
        }
        catch (Exception ex) {
 65:        v0 = ex;
 66:        v1 = 0;
 71:        InAppBillingService.a(this.a, v2, v0, p1, 625);
 76:        v0 = InAppBillingService.b.l;
 80:        if (v1 != 0)
 88:            this.a.i.a(v1.longValue());
 91:        return v0;
        }
        catch (Throwable ex) {
 92:        v0 = ex;
 93:        v1 = 0;
 96:        if (v1 != 0)
104:            this.a.i.a(v1.longValue());
107:        throw v0;
        }
 12:    if (v0.d == com.google.android.finsky.billing.iab.x.a) {
 30:        v2 = v0.a;
 47:        v0 = this.a.j.a(v2.name, this.a.a(p1)).b(p0, p1, p2, 0);
 53:        if (v1 != 0)
 61:            this.a.i.a(v1.longValue());
 64:        return v0;
        }
 14:    v0 = v0.d.l;
 18:    if (v1 != 0)
 26:        this.a.i.a(v1.longValue());
 29:    return v0;
 30:    v2 = v0.a;
 47:    v0 = this.a.j.a(v2.name, this.a.a(p1)).b(p0, p1, p2, 0);
 53:    if (v1 != 0)
 61:        this.a.i.a(v1.longValue());
 64:    return v0;
 65:    v0 = ex;
 66:    v1 = 0;
 71:    InAppBillingService.a(this.a, v2, v0, p1, 625);
 76:    v0 = InAppBillingService.b.l;
 80:    if (v1 != 0)
 88:        this.a.i.a(v1.longValue());
 91:    return v0;
 92:    v0 = ex;
 93:    v1 = 0;
 96:    if (v1 != 0)
104:        this.a.i.a(v1.longValue());
107:    throw v0;
108:    v0 = ex;
109:    goto 94;
110:    v0 = ex;
111:    goto 67;
112:    try
            run 67...78
        catch (Throwable ex) {
 67:        goto 108;
        }
113:    try
            run 30...50
        catch (Exception ex) {
 30:        goto 110;
        }
        catch (Throwable ex) {
 30:        goto 108;
        }
114:    try
            run 8...16
        catch (Exception ex) {
  8:        goto 110;
        }
        catch (Throwable ex) {
  8:        goto 108;
        }
    }

    public final int b(int p0, String p1, String p2, Bundle p3) {
  0:    v2 = 0;
  1:    try {
  1:        v0 = this.a(p1, p3);
  5:        v1 = v0.b;
        }
        catch (Exception ex) {
 63:        v0 = ex;
 64:        v1 = 0;
 69:        InAppBillingService.a(this.a, v2, v0, p1, 621);
 74:        v0 = InAppBillingService.b.l;
 78:        if (v1 != 0)
 86:            this.a.i.a(v1.longValue());
 89:        return v0;
        }
        catch (Throwable ex) {
 90:        v0 = ex;
 91:        v1 = 0;
 94:        if (v1 != 0)
102:            this.a.i.a(v1.longValue());
105:        throw v0;
        }
 11:    if (v0.d == com.google.android.finsky.billing.iab.x.a) {
 29:        v2 = v0.a;
 45:        v0 = this.a.j.a(v2.name, this.a.a(p1)).a(p0, p2, p3);
 51:        if (v1 != 0)
 59:            this.a.i.a(v1.longValue());
 62:        return v0;
        }
 13:    v0 = v0.d.l;
 17:    if (v1 != 0)
 25:        this.a.i.a(v1.longValue());
 28:    return v0;
 29:    v2 = v0.a;
 45:    v0 = this.a.j.a(v2.name, this.a.a(p1)).a(p0, p2, p3);
 51:    if (v1 != 0)
 59:        this.a.i.a(v1.longValue());
 62:    return v0;
 63:    v0 = ex;
 64:    v1 = 0;
 69:    InAppBillingService.a(this.a, v2, v0, p1, 621);
 74:    v0 = InAppBillingService.b.l;
 78:    if (v1 != 0)
 86:        this.a.i.a(v1.longValue());
 89:    return v0;
 90:    v0 = ex;
 91:    v1 = 0;
 94:    if (v1 != 0)
102:        this.a.i.a(v1.longValue());
105:    throw v0;
106:    v0 = ex;
107:    goto 92;
108:    v0 = ex;
109:    goto 65;
110:    try
            run 65...76
        catch (Throwable ex) {
 65:        goto 106;
        }
111:    try
            run 29...48
        catch (Exception ex) {
 29:        goto 108;
        }
        catch (Throwable ex) {
 29:        goto 106;
        }
112:    try
            run 7...15
        catch (Exception ex) {
  7:        goto 108;
        }
        catch (Throwable ex) {
  7:        goto 106;
        }
    }

    public final Bundle b(int p0, String p1, String p2, String p3, Bundle p4) {
  0:    v1 = 0;
  1:    try {
  1:        v0 = this.a(p1, p4);
  5:        v6 = v0.b;
        }
        catch (Exception ex) {
 74:        v0 = ex;
 75:        v2 = 0;
 80:        InAppBillingService.a(this.a, v2, v0, p1, 624);
 89:        v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
 95:        if (v1 != 0)
103:            this.a.i.a(v1.longValue());
106:        return v0;
        }
        catch (Throwable ex) {
107:        v0 = ex;
108:        v6 = 0;
111:        if (v6 != 0)
119:            this.a.i.a(v6.longValue());
122:        throw v0;
        }
 11:    if (v0.d == com.google.android.finsky.billing.iab.x.a) {
 35:        v7 = v0.a;
 56:        v0 = this.a.j.a(v7.name, this.a.a(p1)).a(p0, p1, p2, p3, p4);
 62:        if (v6 != 0)
 70:            this.a.i.a(v6.longValue());
 73:        return v0;
        }
 17:    v0 = com.google.android.finsky.billing.iab.w.a(v0.d);
 23:    if (v6 != 0)
 31:        this.a.i.a(v6.longValue());
 34:    return v0;
 35:    v7 = v0.a;
 56:    v0 = this.a.j.a(v7.name, this.a.a(p1)).a(p0, p1, p2, p3, p4);
 62:    if (v6 != 0)
 70:        this.a.i.a(v6.longValue());
 73:    return v0;
 74:    v0 = ex;
 75:    v2 = 0;
 80:    InAppBillingService.a(this.a, v2, v0, p1, 624);
 89:    v0 = com.google.android.finsky.billing.iab.w.a(InAppBillingService.b);
 95:    if (v1 != 0)
103:        this.a.i.a(v1.longValue());
106:    return v0;
107:    v0 = ex;
108:    v6 = 0;
111:    if (v6 != 0)
119:        this.a.i.a(v6.longValue());
122:    throw v0;
123:    v0 = ex;
124:    goto 109;
125:    v0 = ex;
126:    v6 = v1;
127:    goto 109;
128:    v0 = ex;
129:    v2 = 0;
130:    v1 = v6;
131:    goto 76;
132:    v0 = ex;
133:    v1 = v6;
134:    v2 = v7;
135:    goto 76;
136:    try
            run 76...92
        catch (Throwable ex) {
 76:        goto 125;
        }
137:    try
            run 37...59
        catch (Exception ex) {
 37:        goto 132;
        }
        catch (Throwable ex) {
 37:        goto 123;
        }
138:    try
            run 35...37
        catch (Exception ex) {
 35:        goto 128;
        }
        catch (Throwable ex) {
 35:        goto 123;
        }
139:    try
            run 7...20
        catch (Exception ex) {
  7:        goto 128;
        }
        catch (Throwable ex) {
  7:        goto 123;
        }
    }

    public final int c(int p0, String p1, String p2, Bundle p3) {
  0:    v2 = 0;
  1:    try {
  1:        v0 = this.a(p1, p3);
  5:        v1 = v0.b;
        }
        catch (Exception ex) {
 63:        v0 = ex;
 64:        v1 = 0;
 69:        InAppBillingService.a(this.a, v2, v0, p1, 625);
 74:        v0 = InAppBillingService.b.l;
 78:        if (v1 != 0)
 86:            this.a.i.a(v1.longValue());
 89:        return v0;
        }
        catch (Throwable ex) {
 90:        v0 = ex;
 91:        v1 = 0;
 94:        if (v1 != 0)
102:            this.a.i.a(v1.longValue());
105:        throw v0;
        }
 11:    if (v0.d == com.google.android.finsky.billing.iab.x.a) {
 29:        v2 = v0.a;
 45:        v0 = this.a.j.a(v2.name, this.a.a(p1)).b(p0, p1, p2, p3);
 51:        if (v1 != 0)
 59:            this.a.i.a(v1.longValue());
 62:        return v0;
        }
 13:    v0 = v0.d.l;
 17:    if (v1 != 0)
 25:        this.a.i.a(v1.longValue());
 28:    return v0;
 29:    v2 = v0.a;
 45:    v0 = this.a.j.a(v2.name, this.a.a(p1)).b(p0, p1, p2, p3);
 51:    if (v1 != 0)
 59:        this.a.i.a(v1.longValue());
 62:    return v0;
 63:    v0 = ex;
 64:    v1 = 0;
 69:    InAppBillingService.a(this.a, v2, v0, p1, 625);
 74:    v0 = InAppBillingService.b.l;
 78:    if (v1 != 0)
 86:        this.a.i.a(v1.longValue());
 89:    return v0;
 90:    v0 = ex;
 91:    v1 = 0;
 94:    if (v1 != 0)
102:        this.a.i.a(v1.longValue());
105:    throw v0;
106:    v0 = ex;
107:    goto 92;
108:    v0 = ex;
109:    goto 65;
110:    try
            run 65...76
        catch (Throwable ex) {
 65:        goto 106;
        }
111:    try
            run 29...48
        catch (Exception ex) {
 29:        goto 108;
        }
        catch (Throwable ex) {
 29:        goto 106;
        }
112:    try
            run 7...15
        catch (Exception ex) {
  7:        goto 108;
        }
        catch (Throwable ex) {
  7:        goto 106;
        }
    }

}
