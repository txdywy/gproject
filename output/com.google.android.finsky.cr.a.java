package com.google.android.finsky.cr;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.google.android.finsky.cr.a implements com.google.android.finsky.cr.b
{

    public final File a;
    public final String b;

    a(File p0, String p1) {
        if (TextUtils.isEmpty(p1))
            throw new IllegalArgumentException("A dataStoreId must be specified");
        this.a = p0;
        this.b = p1;
    }

    private static Map a(JSONObject p0) {
        v1 = new HashMap();
        v2 = p0.keys();
        while (v2.hasNext()) {
            v0 = (String)v2.next();
            if (!p0.isNull(v0))
                v1.put(v0, p0.getString(v0));
            else
                v1.put(v0, 0);
        }
        return v1;
    }

    public final Map a() {
  4:    v3 = new HashMap();
  9:    v4 = this.a.listFiles();
 13:    if (v4 == 0)
134:        return v3;
 16:    v1 = 0;
 17:    if (v1 >= v4.length)
134:        return v3;
 19:    v6 = v4[v1];
 21:    v7 = v6.getName();
 31:    if (v7.startsWith(this.b)) {
 39:        v0 = new FileInputStream(v6);
 64:        v0.close();
 71:        v3.put(v7.replace(this.b, ""), com.google.android.finsky.cr.a.a(new JSONObject(new ObjectInputStream(v0).readUTF())));
        }
 35:    v1 = v1 + 1;
 36:    goto 17;
 78:    v8 = new Object[1];
 80:    v8[0] = v7;
 82:    FinskyLog.c("IOException when reading file '%s'. Deleting.", v8);
 89:    if (!v6.delete()) {
 93:        v6 = new Object[1];
 95:        v6[0] = v7;
 97:        FinskyLog.d("Attempt to delete '%s' failed!", v6);
        }
100:    goto 33;
105:    v9 = new Object[2];
107:    v9[0] = v7;
113:    v9[1] = ex.toString();
115:    FinskyLog.d("JSONException when reading file '%s'. Deleting. error=[%s]", v9);
122:    if (!v6.delete()) {
126:        v6 = new Object[1];
128:        v6[0] = v7;
130:        FinskyLog.d("Attempt to delete '%s' failed!", v6);
        }
133:    goto 33;
135:    try
            run 25...74
        catch (IOException ex) {
 25:        goto 75;
        }
        catch (JSONException ex) {
 25:        goto 101;
        }
    }

    public final void a(String p0) {
        v3 = String.valueOf(this.b);
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = v3.concat(v0);
        else
            v0 = new String(v3);
        if (!new File(this.a, v0).delete()) {
            v1 = new Object[1];
            v1[0] = p0;
            FinskyLog.d("Attempt to delete '%s' failed!", v1);
        }
    }

    public final void a(String p0, Map p1) {
  0:    v1 = 0;
  4:    try {
 12:        v5 = String.valueOf(this.b);
 16:        v0 = String.valueOf(p0);
 24:        if (v0.length() != 0)
 26:            v0 = v5.concat(v0);
            else {
 60:            try {
 62:                v0 = new String(v5);
                }
                catch (IOException ex) {
 66:                v0 = ex;
 67:                v2 = 0;
 71:                v4 = new Object[2];
 74:                v4[0] = p0;
 77:                v4[1] = v0;
 79:                FinskyLog.c("Couldn't write value store for key %s: %s", v4);
 82:                if (v1 != 0) {
 84:                    try {
 84:                        v1.close();
                        }
                        catch (IOException ex) {
 91:                        v2 = new Object[2];
 93:                        v2[0] = p0;
 95:                        v2[1] = ex;
 97:                        FinskyLog.c("Couldn't close output stream for key %s: %s", v2);
                        }
                    }
114:                else if (v2 != 0) {
116:                    try {
116:                        v2.close();
                        }
                        catch (IOException ex) {
 91:                        v2 = new Object[2];
 93:                        v2[0] = p0;
 95:                        v2[1] = ex;
 97:                        FinskyLog.c("Couldn't close output stream for key %s: %s", v2);
                        }
                    }
 87:                return;
                }
                catch (Throwable ex) {
120:                v0 = ex;
121:                v3 = 0;
122:                if (v1 != 0) {
124:                    try {
124:                        v1.close();
                        }
                        catch (IOException ex) {
137:                        v3 = new Object[2];
139:                        v3[0] = p0;
141:                        v3[1] = ex;
143:                        FinskyLog.c("Couldn't close output stream for key %s: %s", v3);
                        }
                    }
128:                else if (v3 != 0) {
130:                    try {
130:                        v3.close();
                        }
                        catch (IOException ex) {
137:                        v3 = new Object[2];
139:                        v3[0] = p0;
141:                        v3[1] = ex;
143:                        FinskyLog.c("Couldn't close output stream for key %s: %s", v3);
                        }
                    }
127:                throw v0;
                }
            }
 33:        v3 = new FileOutputStream(new File(this.a, v0));
        }
        catch (IOException ex) {
 66:        v0 = ex;
 67:        v2 = 0;
 71:        v4 = new Object[2];
 74:        v4[0] = p0;
 77:        v4[1] = v0;
 79:        FinskyLog.c("Couldn't write value store for key %s: %s", v4);
 82:        if (v1 != 0) {
 84:            try {
 84:                v1.close();
                }
                catch (IOException ex) {
 91:                v2 = new Object[2];
 93:                v2[0] = p0;
 95:                v2[1] = ex;
 97:                FinskyLog.c("Couldn't close output stream for key %s: %s", v2);
                }
            }
114:        else if (v2 != 0) {
116:            try {
116:                v2.close();
                }
                catch (IOException ex) {
 91:                v2 = new Object[2];
 93:                v2[0] = p0;
 95:                v2[1] = ex;
 97:                FinskyLog.c("Couldn't close output stream for key %s: %s", v2);
                }
            }
 87:        return;
        }
        catch (Throwable ex) {
120:        v0 = ex;
121:        v3 = 0;
122:        if (v1 != 0) {
124:            try {
124:                v1.close();
                }
                catch (IOException ex) {
137:                v3 = new Object[2];
139:                v3[0] = p0;
141:                v3[1] = ex;
143:                FinskyLog.c("Couldn't close output stream for key %s: %s", v3);
                }
            }
128:        else if (v3 != 0) {
130:            try {
130:                v3.close();
                }
                catch (IOException ex) {
137:                v3 = new Object[2];
139:                v3[0] = p0;
141:                v3[1] = ex;
143:                FinskyLog.c("Couldn't close output stream for key %s: %s", v3);
                }
            }
127:        throw v0;
        }
 38:    v2 = new ObjectOutputStream(v3);
 50:    v2.writeUTF(new JSONObject(p1).toString());
 53:    v2.flush();
 56:    try {
 56:        v2.close();
        }
        catch (IOException ex) {
104:        v2 = new Object[2];
106:        v2[0] = p0;
108:        v2[1] = ex;
110:        FinskyLog.c("Couldn't close output stream for key %s: %s", v2);
        }
 59:    return;
 66:    v0 = ex;
 67:    v2 = 0;
 71:    v4 = new Object[2];
 74:    v4[0] = p0;
 77:    v4[1] = v0;
 79:    FinskyLog.c("Couldn't write value store for key %s: %s", v4);
 82:    if (v1 != 0) {
 84:        try {
 84:            v1.close();
            }
            catch (IOException ex) {
 91:            v2 = new Object[2];
 93:            v2[0] = p0;
 95:            v2[1] = ex;
 97:            FinskyLog.c("Couldn't close output stream for key %s: %s", v2);
            }
        }
114:    else if (v2 != 0) {
116:        try {
116:            v2.close();
            }
            catch (IOException ex) {
 91:            v2 = new Object[2];
 93:            v2[0] = p0;
 95:            v2[1] = ex;
 97:            FinskyLog.c("Couldn't close output stream for key %s: %s", v2);
            }
        }
 87:    return;
120:    v0 = ex;
121:    v3 = 0;
122:    if (v1 != 0) {
124:        try {
124:            v1.close();
            }
            catch (IOException ex) {
137:            v3 = new Object[2];
139:            v3[0] = p0;
141:            v3[1] = ex;
143:            FinskyLog.c("Couldn't close output stream for key %s: %s", v3);
            }
        }
128:    else if (v3 != 0) {
130:        try {
130:            v3.close();
            }
            catch (IOException ex) {
137:            v3 = new Object[2];
139:            v3[0] = p0;
141:            v3[1] = ex;
143:            FinskyLog.c("Couldn't close output stream for key %s: %s", v3);
            }
        }
127:    throw v0;
147:    v0 = ex;
148:    goto 122;
149:    v0 = ex;
150:    v1 = v2;
151:    goto 122;
152:    v0 = ex;
153:    v3 = v2;
154:    goto 122;
155:    v0 = ex;
156:    v2 = v3;
157:    goto 68;
158:    v0 = ex;
159:    v1 = v2;
160:    v2 = v3;
161:    goto 68;
166:    try
            run 68...82
        catch (Throwable ex) {
 68:        goto 152;
        }
169:    try
            run 41...56
        catch (IOException ex) {
 41:        goto 158;
        }
        catch (Throwable ex) {
 41:        goto 149;
        }
170:    try
            run 36...41
        catch (IOException ex) {
 36:        goto 155;
        }
        catch (Throwable ex) {
 36:        goto 147;
        }
    }

}
