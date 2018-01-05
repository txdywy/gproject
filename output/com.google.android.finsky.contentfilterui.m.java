package com.google.android.finsky.contentfilterui;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vending.c.b;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ab.a;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.f;
import com.google.android.finsky.api.h;
import com.google.android.finsky.d.g;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import com.google.wireless.android.finsky.dfe.nano.bi;
import java.io.File;
import java.util.List;

public final class com.google.android.finsky.contentfilterui.m extends com.android.vending.c.b
{

    public final ContentFiltersService a;

    m(ContentFiltersService p0) {
        this.a = p0;
        com.android.vending.c.b();
    }

    public final Bundle a(int[] p0) {
 22:    v3 = com.google.android.finsky.dh.a.a(this.a, 0, 0, this.a.c.dc(), 519);
 26:    if (v3 == 0) {
 28:        v2 = 0;
 29:        return v2;
        }
 33:    v5 = new Object[1];
 36:    v5[0] = v3;
 38:    FinskyLog.a("Received content filters request from %s", v5);
 43:    v9 = new Bundle();
 66:    v9.putParcelable("content_filters_intent", PendingIntent.getActivity(this.a, 0, new Intent(this.a, ContentFiltersActivity3), 1073741824));
 73:    v9.putInt("content_filters_request_code", 44);
 82:    v3 = this.a.a.cY();
 86:    if (v3 != 0 && com.google.android.finsky.contentfilterui.u.a(this.a, v3))
 95:        v4 = 1;
        else
115:        v4 = 0;
108:    if (TextUtils.isEmpty((CharSequence)com.google.android.finsky.aa.a.d.a()) && v4 == 0) {
112:        v2 = v9;
113:        return v2;
        }
123:    v3 = this.a.b.a();
127:    if (v3 == 0) {
129:        v2 = 0;
130:        return v2;
        }
137:    v10 = new com.google.android.finsky.contentfilterui.p(v3, this.a);
146:    if (!v10.c())
148:        v3 = 1;
242:    else if (System.currentTimeMillis() > v10.a.lastModified() + ((Long)com.google.android.finsky.api.f.N.b()).longValue())
244:        v3 = 1;
        else
246:        v3 = 0;
149:    if (v3 != 0) goto 351;
151:    if (v4 != 0 && v10.e() == 0)
159:        v3 = 1;
        else
248:        v3 = 0;
160:    if (v3 == 0) goto 348;
162:    v7 = v10.d();
166:    if (v3 != 0 && v7 != 0)
200:        com.google.android.finsky.ab.a.a(this.a, this.a.d, this.a.b, this.a.a, v7.o, v7, (b[])com.google.android.finsky.ab.a.a(v7).toArray());
203:    v2 = v7;
204:    if (v2 == 0)
210:        v3 = v10.e();
        else
345:        v3 = v2;
211:    if (v3 == 0) {
213:        v2 = 0;
214:        return v2;
        }
258:    if (!ContentFiltersService.a(v3.b, p0)) {
260:        v2 = 0;
261:        return v2;
        }
275:    if (TextUtils.isEmpty((CharSequence)com.google.android.finsky.aa.a.d.a())) {
277:        v2 = v9;
278:        return v2;
        }
290:    v4 = 0;
291:    if (v4 >= v3.b.length) {
342:        v2 = v9;
343:        return v2;
        }
293:    v8 = v3.b[v4];
295:    v10 = com.google.android.finsky.ab.a.a(v8, com.google.android.finsky.ab.a.a(com.google.android.finsky.aa.a.g));
299:    if (v10 == 0) goto 338;
305:    v3 = 0;
306:    if (v3 >= p0.length) goto 338;
313:    v2 = 0;
314:    if (v2 >= v8.c.length) goto 331;
318:    if (v8.c[v2] != p0[v3]) goto 335;
328:    v9.putBundle(String.valueOf(p0[v3]), com.google.android.finsky.ab.a.a(v8, v10));
333:    v3 = v3 + 1;
334:    goto 306;
335:    v2 = v2 + 1;
337:    goto 314;
340:    v4 = v4 + 1;
341:    goto 291;
348:    v2 = 0;
349:    goto 204;
351:    v3 = 0;
352:    goto 162;
    }

}
