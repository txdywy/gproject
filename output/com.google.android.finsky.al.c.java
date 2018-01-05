package com.google.android.finsky.al;

import android.os.Environment;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.j;
import com.google.android.finsky.utils.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public static class com.google.android.finsky.al.c
{

    c() {
    }

    private static com.google.android.finsky.al.k a(BufferedReader p0, com.google.android.finsky.al.i p1) {
        v1 = new com.google.android.finsky.al.k();
        while (true) {
            v0 = p0.readLine();
            if (v0 == 0)
                break;
            v0 = v0.trim();
            if (v0.startsWith("#"))
                continue;
            if (TextUtils.isEmpty(v0))
                continue;
            v2 = com.google.android.finsky.utils.k.a(v0);
            if (TextUtils.isEmpty(v2[0])) {
                v0 = String.valueOf(v0);
                if (v0.length() != 0)
                    v0 = "Skipping an item from csv without a name: ".concat(v0);
                else
                    v0 = new String("Skipping an item from csv without a name: ");
                FinskyLog.a(v0, new Object[0]);
            }
            else if (!p1.a(v2)) {
                v0 = String.valueOf(v0);
                if (v0.length() != 0)
                    v0 = "Skipping an item from csv without proper validation: ".concat(v0);
                else
                    v0 = new String("Skipping an item from csv without proper validation: ");
                FinskyLog.a(v0, new Object[0]);
            }
            else {
                v0 = p1.b(v2);
                v1.a(v2[0], v0);
                if (p1.b(v0))
                    v1.a = v1.a().size() - 1;
            }
        }
        return v1;
    }

    public static com.google.android.finsky.al.k a(String p0, com.google.android.finsky.al.i p1) {
  0:    v1 = 0;
  1:    try {
  1:        v2 = Environment.getExternalStorageDirectory();
  7:        v0 = new File(v2, p0);
 14:        if (!v0.exists())
 25:            v0 = new File(new File(v2, "Download"), p0);
 35:        v2 = new BufferedReader(new FileReader(v0));
        }
        catch (Exception ex) {
 46:        v0 = ex;
 47:        try {
 50:            v3 = new Object[1];
 57:            v3[0] = v0.getMessage();
 59:            FinskyLog.d("Unable to build selector: %s", v3);
            }
            catch (Throwable ex) {
 71:            v0 = ex;
 72:            com.google.android.finsky.utils.j.a(v1);
 75:            throw v0;
            }
 62:        com.google.android.finsky.utils.j.a(v1);
 67:        v0 = new com.google.android.finsky.al.k();
 70:        return v0;
        }
        catch (Throwable ex) {
 71:        v0 = ex;
 72:        com.google.android.finsky.utils.j.a(v1);
 75:        throw v0;
        }
 38:    v0 = com.google.android.finsky.al.c.a(v2, p1);
 42:    com.google.android.finsky.utils.j.a(v2);
 45:    return v0;
 46:    v0 = ex;
 47:    try {
 50:        v3 = new Object[1];
 57:        v3[0] = v0.getMessage();
 59:        FinskyLog.d("Unable to build selector: %s", v3);
        }
        catch (Throwable ex) {
 71:        v0 = ex;
 72:        com.google.android.finsky.utils.j.a(v1);
 75:        throw v0;
        }
 62:    com.google.android.finsky.utils.j.a(v1);
 67:    v0 = new com.google.android.finsky.al.k();
 70:    return v0;
 71:    v0 = ex;
 72:    com.google.android.finsky.utils.j.a(v1);
 75:    throw v0;
 76:    v0 = ex;
 77:    v1 = v2;
 78:    goto 72;
 79:    v0 = ex;
 80:    v1 = v2;
 81:    goto 47;
 83:    try
            run 38...41
        catch (Exception ex) {
 38:        goto 79;
        }
        catch (Throwable ex) {
 38:        goto 76;
        }
    }

}
