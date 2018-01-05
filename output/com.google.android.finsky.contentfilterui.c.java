package com.google.android.finsky.contentfilterui;

import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

protected final class com.google.android.finsky.contentfilterui.c extends AsyncTask
{

    public final com.google.android.finsky.contentfilterui.a a;

    c(com.google.android.finsky.contentfilterui.a p0) {
        this.a = p0;
        AsyncTask();
    }

    private final Void a(byte[][] p0) {
  1:    try {
  7:        v1 = new FileOutputStream(this.a.a);
        }
        catch (FileNotFoundException ex) {
 23:        v0 = ex;
 24:        v1 = 0;
 28:        v4 = new Object[1];
 31:        v4[0] = v0;
 33:        FinskyLog.c("Failed to save response proto, bad file path: %s", v4);
 36:        if (v1 != 0) {
 38:            try {
 38:                v1.flush();
 41:                v1.close();
                }
                catch (IOException ex) {
                }
            }
 44:        return 0;
        }
        catch (IOException ex) {
 47:        v0 = ex;
 48:        v1 = 0;
 52:        v4 = new Object[1];
 55:        v4[0] = v0;
 57:        FinskyLog.c("Failed to save response proto: %s", v4);
 60:        if (v1 != 0) {
 62:            try {
 62:                v1.flush();
 65:                v1.close();
                }
                catch (IOException ex) {
                }
            }
 68:        return 0;
        }
        catch (Throwable ex) {
 71:        v0 = ex;
 72:        v1 = 0;
 73:        if (v1 != 0) {
 75:            try {
 75:                v1.flush();
 78:                v1.close();
                }
                catch (IOException ex) {
                }
            }
 81:        throw v0;
        }
 13:    v1.write(p0[0]);
 16:    try {
 16:        v1.flush();
 19:        v1.close();
        }
        catch (IOException ex) {
        }
 22:    return 0;
 23:    v0 = ex;
 24:    v1 = 0;
 28:    v4 = new Object[1];
 31:    v4[0] = v0;
 33:    FinskyLog.c("Failed to save response proto, bad file path: %s", v4);
 36:    if (v1 != 0) {
 38:        try {
 38:            v1.flush();
 41:            v1.close();
            }
            catch (IOException ex) {
            }
        }
 44:    return 0;
 47:    v0 = ex;
 48:    v1 = 0;
 52:    v4 = new Object[1];
 55:    v4[0] = v0;
 57:    FinskyLog.c("Failed to save response proto: %s", v4);
 60:    if (v1 != 0) {
 62:        try {
 62:            v1.flush();
 65:            v1.close();
            }
            catch (IOException ex) {
            }
        }
 68:    return 0;
 71:    v0 = ex;
 72:    v1 = 0;
 73:    if (v1 != 0) {
 75:        try {
 75:            v1.flush();
 78:            v1.close();
            }
            catch (IOException ex) {
            }
        }
 81:    throw v0;
 84:    v0 = ex;
 85:    goto 73;
 86:    v0 = ex;
 87:    goto 49;
 88:    v0 = ex;
 89:    goto 25;
 94:    try
            run 49...60
        catch (Throwable ex) {
 49:        goto 84;
        }
 96:    try
            run 25...36
        catch (Throwable ex) {
 25:        goto 84;
        }
 98:    try
            run 11...16
        catch (FileNotFoundException ex) {
 11:        goto 88;
        }
        catch (IOException ex) {
 11:        goto 86;
        }
        catch (Throwable ex) {
 11:        goto 84;
        }
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a((byte[][])p0);
    }

}
