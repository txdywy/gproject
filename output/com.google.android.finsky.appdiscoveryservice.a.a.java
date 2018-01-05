package com.google.android.finsky.appdiscoveryservice.a;

import a.a;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.text.TextUtils;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.appdiscoveryservice.a.a
{

    public final a.a a;
    public final a.a b;
    public final com.google.android.finsky.appdiscoveryservice.a.c c;

    a(a.a p0, a.a p1, com.google.android.finsky.appdiscoveryservice.a.c p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final InstantAppInfo a(List p0) {
  1:    v2 = 0;
  6:    if (p0.isEmpty())
  8:        return v2;
  9:    v10 = System.currentTimeMillis();
 21:    v6 = v10 - TimeUnit.HOURS.toMillis(4);
 35:    v4 = ((SharedPreferences)this.b.a()).getLong("InstantApsStatsManager.mostRecentTimestamp", -1);
 41:    if (v4 <= v6) goto 259;
 53:    v0 = ((SharedPreferences)this.b.a()).getString("InstantApsStatsManager.recentlyMostRecentStats", 0);
 61:    if (!TextUtils.isEmpty(v0))
 65:        v1 = this.c.a(v0);
        else
256:        v1 = 0;
 69:    if (v1 == 0) goto 253;
 77:    if (v1.getLastTimeUsed() <= v6) goto 253;
 79:    v3 = p0.iterator();
 87:    if (!v3.hasNext()) goto 253;
 93:    v0 = (InstantAppInfo)v3.next();
107:    if (!v1.getPackageName().equals(v0.a())) goto 83;
109:    v2 = v0;
110:    v0 = v1;
111:    v1 = v2;
112:    v2 = v0;
125:    v6 = p0.iterator();
129:    v3 = v1;
134:    if (!v6.hasNext()) {
179:        if (v2 == 0)
209:            ((SharedPreferences)this.b.a()).edit().remove("InstantApsStatsManager.recentlyMostRecentStats").putLong("InstantApsStatsManager.mostRecentTimestamp", System.currentTimeMillis()).apply();
            else
247:            ((SharedPreferences)this.b.a()).edit().putString("InstantApsStatsManager.recentlyMostRecentStats", com.google.android.finsky.appdiscoveryservice.a.c.a(v2)).putLong("InstantApsStatsManager.mostRecentTimestamp", System.currentTimeMillis()).apply();
212:        v2 = v3;
213:        return v2;
        }
140:    v0 = (InstantAppInfo)v6.next();
150:    v1 = (UsageStats)((UsageStatsManager)this.a.a()).queryAndAggregateUsageStats(v4, v10).get(v0.a());
152:    if (v1 == 0) goto 251;
154:    if (v2 == 0)
156:        v4 = 1;
173:    else if (v1.getLastTimeUsed() > v2.getLastTimeUsed())
175:        v4 = 1;
        else
177:        v4 = 0;
157:    if (v4 == 0) goto 251;
159:    v2 = v1;
160:    v1 = v0;
161:    v3 = v1;
162:    goto 130;
251:    v1 = v3;
252:    goto 161;
253:    v0 = 0;
254:    goto 111;
259:    v1 = 0;
260:    v4 = v6;
261:    goto 113;
    }

    public final InstantAppInfo b(List p0) {
  1:    v2 = 0;
  6:    if (p0.isEmpty())
  8:        return v2;
 21:    v10 = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(4);
 31:    v6 = v10 - TimeUnit.DAYS.toMillis(2);
 45:    v4 = ((SharedPreferences)this.b.a()).getLong("InstantApsStatsManager.mostUsedTimestamp", -1);
 51:    if (v4 <= v6) goto 245;
 63:    v0 = ((SharedPreferences)this.b.a()).getString("InstantApsStatsManager.mostUsedStats", 0);
 71:    if (!TextUtils.isEmpty(v0))
 75:        v1 = this.c.a(v0);
        else
242:        v1 = 0;
 79:    if (v1 == 0) goto 240;
 87:    if (v1.getLastTimeUsed() <= v6) goto 240;
 89:    v3 = p0.iterator();
 97:    if (!v3.hasNext()) goto 240;
103:    v0 = (InstantAppInfo)v3.next();
117:    if (!v1.getPackageName().equals(v0.a())) goto 93;
119:    v2 = v0;
132:    v6 = p0.iterator();
136:    v3 = v2;
137:    v2 = v1;
142:    if (!v6.hasNext()) {
205:        v0 = ((SharedPreferences)this.b.a()).edit().putLong("InstantApsStatsManager.mostUsedTimestamp", System.currentTimeMillis());
209:        if (v2 == 0)
217:            v0.remove("InstantApsStatsManager.mostUsedStats").apply();
            else
233:            v0.putString("InstantApsStatsManager.mostUsedStats", com.google.android.finsky.appdiscoveryservice.a.c.a(v2)).apply();
220:        v2 = v3;
221:        return v2;
        }
148:    v0 = (InstantAppInfo)v6.next();
158:    v1 = (UsageStats)((UsageStatsManager)this.a.a()).queryAndAggregateUsageStats(v4, v10).get(v0.a());
160:    if (v1 == 0) goto 237;
162:    if (v2 == 0)
164:        v4 = 1;
181:    else if (v1.getTotalTimeInForeground() > v2.getTotalTimeInForeground())
183:        v4 = 1;
        else
185:        v4 = 0;
165:    if (v4 == 0) goto 237;
167:    v2 = v0;
168:    v3 = v2;
169:    v2 = v1;
170:    goto 138;
237:    v1 = v2;
238:    v2 = v3;
239:    goto 168;
240:    v1 = 0;
241:    goto 120;
245:    v1 = 0;
246:    v4 = v6;
247:    goto 120;
    }

}
