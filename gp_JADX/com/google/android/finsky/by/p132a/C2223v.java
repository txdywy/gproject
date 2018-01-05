package com.google.android.finsky.by.p132a;

import android.text.format.DateFormat;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.protobuf.nano.j;
import com.google.wireless.android.finsky.b.w;

final class C2223v {
    public long f11090a;
    public int f11091b;
    public String f11092c;
    public w f11093d;
    public VolleyError f11094e;

    C2223v() {
    }

    public final void m11630a(String str) {
        String str2;
        Log.d("FinskyLibrary", String.valueOf(str).concat("Event {"));
        String str3 = "FinskyLibrary";
        int i = this.f11091b;
        switch (i) {
            case 0:
                str2 = "APPLY_LIBRARY_UPDATE";
                break;
            case 1:
                str2 = "SCHEDULE_REPLICATION";
                break;
            case 2:
                str2 = "REPLICATE";
                break;
            case 3:
                str2 = "ERROR_VOLLEY";
                break;
            case 4:
                str2 = "ERROR_TOKEN_CHANGED";
                break;
            case 5:
                str2 = "ERROR_UNSUPPORTED_LIBRARY";
                break;
            default:
                str2 = String.valueOf(String.valueOf(i)).concat(" (FIXME)");
                break;
        }
        Log.d(str3, new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append(str).append("  type=").append(str2).toString());
        Log.d("FinskyLibrary", new StringBuilder(String.valueOf(str).length() + 34).append(str).append("  timestampMs=").append(this.f11090a).toString());
        str3 = String.valueOf(DateFormat.format("MM-dd hh:mm:ss", this.f11090a));
        Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(str3).length()).append(str).append("  timestamp=").append(str3).toString());
        if (this.f11092c != null) {
            str3 = this.f11092c;
            Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 6) + String.valueOf(str3).length()).append(str).append("  tag=").append(str3).toString());
        }
        if (this.f11093d != null) {
            String[] split = j.a(this.f11093d).split("\n");
            Log.d("FinskyLibrary", String.valueOf(str).concat("  libraryUpdate="));
            for (String str4 : split) {
                Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 4) + String.valueOf(str4).length()).append(str).append("    ").append(str4).toString());
            }
        }
        if (this.f11094e != null) {
            str3 = String.valueOf(this.f11094e);
            Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(str3).length()).append(str).append("  volleyError=").append(str3).toString());
        }
        Log.d("FinskyLibrary", String.valueOf(str).concat("}"));
    }
}
