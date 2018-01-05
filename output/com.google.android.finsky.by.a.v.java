package com.google.android.finsky.by.a;

import android.text.format.DateFormat;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.protobuf.nano.j;
import com.google.wireless.android.finsky.b.w;

public final class com.google.android.finsky.by.a.v
{

    public long a;
    public int b;
    public String c;
    public com.google.wireless.android.finsky.b.w d;
    public VolleyError e;

    v() {
    }

    public final void a(String p0) {
 12:    Log.d("FinskyLibrary", String.valueOf(p0).concat("Event {"));
 19:    switch (this.b) {
            case 0:
320:            v0 = "APPLY_LIBRARY_UPDATE";
417:            break;
            case 1:
324:            v0 = "SCHEDULE_REPLICATION";
417:            break;
            case 2:
328:            v0 = "REPLICATE";
417:            break;
            case 3:
332:            v0 = "ERROR_VOLLEY";
417:            break;
            case 4:
336:            v0 = "ERROR_TOKEN_CHANGED";
417:            break;
            case 5:
340:            v0 = "ERROR_UNSUPPORTED_LIBRARY";
417:            break;
            default:
 32:            v0 = String.valueOf(String.valueOf(this.b)).concat(" (FIXME)");
417:            break;
        }
 78:    Log.d("FinskyLibrary", (String.valueOf(p0).length() + 7 + String.valueOf(v0).length()) + p0 + "  type=" + v0);
118:    Log.d("FinskyLibrary", (String.valueOf(p0).length() + 34) + p0 + "  timestampMs=" + this.a);
131:    v1 = String.valueOf(DateFormat.format("MM-dd hh:mm:ss", this.a));
177:    Log.d("FinskyLibrary", (String.valueOf(p0).length() + 12 + String.valueOf(v1).length()) + p0 + "  timestamp=" + v1);
182:    if (this.c != 0)
230:        Log.d("FinskyLibrary", (String.valueOf(p0).length() + 6 + String.valueOf(this.c).length()) + p0 + "  tag=" + this.c);
235:    if (this.d != 0) {
245:        v1 = com.google.protobuf.nano.j.a(this.d).split("\n");
261:        Log.d("FinskyLibrary", String.valueOf(p0).concat("  libraryUpdate="));
265:        v0 = 0;
266:        while (v0 < v1.length) {
314:            Log.d("FinskyLibrary", (String.valueOf(p0).length() + 4 + String.valueOf(v1[v0]).length()) + p0 + "    " + v1[v0]);
317:            v0 = v0 + 1;
            }
        }
319:    goto 344;
346:    if (this.e != 0) {
352:        v1 = String.valueOf(this.e);
398:        Log.d("FinskyLibrary", (String.valueOf(p0).length() + 14 + String.valueOf(v1).length()) + p0 + "  volleyError=" + v1);
        }
413:    Log.d("FinskyLibrary", String.valueOf(p0).concat("}"));
    }

}
