package com.google.android.finsky.cs.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.cs.f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.android.finsky.utils.j;
import com.google.android.play.a.a.l;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

final class com.google.android.finsky.cs.a.i
{

    public final Context a;

    i(Context p0) {
        this.a = p0;
    }

    private static com.google.android.finsky.cs.f a(com.google.android.finsky.cs.a.e p0, com.google.android.play.a.a.l p1, File p2) {
  3:    v5 = new HashMap();
  6:    v6 = p2.getName();
 24:    v3 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(p2)));
 30:    v4 = new Object[1];
 37:    v4[0] = FinskyLog.a(v6);
 39:    FinskyLog.a("Started writing experiment flags into file %s.", v4);
 43:    v3.writeByte(1);
 50:    v3.writeUTF(p0.b());
 57:    v3.writeUTF(p0.a());
 64:    v3.writeUTF(com.google.android.finsky.utils.ab.a(p1));
 67:    v7 = p0.c();
 73:    v4 = 0;
 74:    if (v4 >= v7.length) {
385:        v3.writeByte(0);
391:        v4 = new Object[1];
398:        v4[0] = FinskyLog.a(v6);
400:        FinskyLog.a("Finished writing experiment flags into file %s.", v4);
415:        v2 = new com.google.android.finsky.cs.f(v5, p1, p0.b(), p0.a());
418:        com.google.android.finsky.utils.j.a(v3);
421:        return v2;
        }
 78:    v9 = v7[v4].a();
 83:    v2 = 0;
 84:    if (v2 >= v9.length) goto 379;
 92:    switch (v9[v2].g()) {
            case 2:
 92:            goto 150;
            case 3:
 92:            goto 269;
            case 4:
 92:            goto 297;
            case 5:
 92:            goto 325;
            case 6:
 92:            goto 349;
            default:
        }
125:    throw new IllegalStateException(45 + "Unsupported experiment flag type: " + v9[v2].g());
126:    v2 = ex;
127:    try {
130:        v5 = new Object[2];
137:        v5[0] = FinskyLog.a(v6);
140:        v5[1] = v2;
142:        FinskyLog.d("Error writing experiment flags to file %s: %s.", v5);
        }
        catch (Throwable ex) {
223:        v2 = ex;
224:        com.google.android.finsky.utils.j.a(v3);
227:        throw v2;
        }
145:    com.google.android.finsky.utils.j.a(v3);
148:    v2 = 0;
149:    return v2;
150:    v12 = v9[v2].b();
158:    if (v12 < -128) goto 195;
164:    if (v12 > 127) goto 195;
175:    com.google.android.finsky.cs.a.i.a(v3, 1, v9[v2].a());
178:    v3.writeByte((byte)(int)v12);
189:    v5.put(v9[v2].a(), Long.valueOf(v12));
192:    v2 = v2 + 1;
194:    goto 84;
199:    if (v12 < -32768) goto 228;
205:    if (v12 > 32767) goto 228;
216:    com.google.android.finsky.cs.a.i.a(v3, 2, v9[v2].a());
219:    v3.writeShort((short)(int)v12);
222:    goto 181;
223:    v2 = ex;
224:    com.google.android.finsky.utils.j.a(v3);
227:    throw v2;
233:    if (v12 < -2147483648) goto 257;
240:    if (v12 > 2147483647) goto 257;
250:    com.google.android.finsky.cs.a.i.a(v3, 3, v9[v2].a());
253:    v3.writeInt((int)v12);
256:    goto 181;
262:    com.google.android.finsky.cs.a.i.a(v3, 4, v9[v2].a());
265:    v3.writeLong(v12);
268:    goto 181;
269:    v12 = v9[v2].c();
281:    v5.put(v9[v2].a(), Boolean.valueOf(v12));
290:    com.google.android.finsky.cs.a.i.a(v3, 8, v9[v2].a());
293:    v3.writeBoolean(v12);
296:    goto 192;
297:    v12 = v9[v2].d();
309:    v5.put(v9[v2].a(), Double.valueOf(v12));
317:    com.google.android.finsky.cs.a.i.a(v3, 7, v9[v2].a());
320:    v3.writeDouble(v12);
323:    goto 192;
325:    v12 = v9[v2].e();
333:    v5.put(v9[v2].a(), v12);
341:    com.google.android.finsky.cs.a.i.a(v3, 5, v9[v2].a());
344:    v3.writeUTF(v12);
347:    goto 192;
349:    v12 = v9[v2].f();
357:    v5.put(v9[v2].a(), v12);
365:    com.google.android.finsky.cs.a.i.a(v3, 6, v9[v2].a());
369:    v3.writeInt(v12.length);
374:    v3.write(v12, 0, v12.length);
377:    goto 192;
381:    v4 = v4 + 1;
382:    goto 74;
423:    v2 = ex;
424:    v3 = 0;
425:    goto 224;
427:    v2 = ex;
428:    v3 = 0;
429:    goto 127;
430:    try
            run 244...418
        catch (IOException ex) {
244:        goto 126;
        }
        catch (Throwable ex) {
244:        goto 223;
        }
431:    try
            run 150...222
        catch (IOException ex) {
150:        goto 126;
        }
        catch (Throwable ex) {
150:        goto 223;
        }
433:    try
            run 27...126
        catch (IOException ex) {
 27:        goto 126;
        }
        catch (Throwable ex) {
 27:        goto 223;
        }
434:    try
            run 10...27
        catch (IOException ex) {
 10:        goto 427;
        }
        catch (Throwable ex) {
 10:        goto 423;
        }
    }

    public static com.google.android.finsky.cs.f a(com.google.android.finsky.cs.a.e p0, com.google.android.play.a.a.l p1, File p2, String p3) {
        v3 = String.valueOf("temp-");
        v0 = String.valueOf(p3);
        if (v0.length() != 0)
            v0 = v3.concat(v0);
        else
            v0 = new String(v3);
        v2 = new File(p2, v0);
        v0 = com.google.android.finsky.cs.a.i.a(p0, p1, v2);
        if (v0 == 0 || !v2.renameTo(new File(p2, p3)))
            v0 = 0;
        return v0;
    }

    private static com.google.android.finsky.cs.f a(DataInputStream p0, String p1) {
        v3 = new HashMap();
        v6 = new com.google.android.play.a.a.l();
        com.google.android.finsky.utils.ab.a(p0.readUTF(), v6);
        v0 = 0;
        if (v0 == 0) {
            switch (p0.readByte()) {
                case 0:
                    v0 = 1;
                    break;
                case 1:
                    v3.put(p0.readUTF(), Long.valueOf((long)p0.readByte()));
                    break;
                case 2:
                    v3.put(p0.readUTF(), Long.valueOf((long)p0.readShort()));
                    break;
                case 3:
                    v3.put(p0.readUTF(), Long.valueOf((long)p0.readInt()));
                    break;
                case 4:
                    v3.put(p0.readUTF(), Long.valueOf(p0.readLong()));
                    break;
                case 5:
                    v3.put(p0.readUTF(), p0.readUTF());
                    break;
                case 6:
                    v8 = new byte[p0.readInt()];
                    p0.readFully(v8);
                    v3.put(p0.readUTF(), v8);
                    break;
                case 7:
                    v3.put(p0.readUTF(), Double.valueOf(p0.readDouble()));
                    break;
                case 8:
                    v3.put(p0.readUTF(), Boolean.valueOf(p0.readBoolean()));
                    break;
                default:
                    throw new IOException("Unrecognized flag type");
            }
        }
        v2 = new Object[1];
        v2[0] = FinskyLog.a(p1);
        FinskyLog.a("Finished reading experiment flags from file %s.", v2);
        return new com.google.android.finsky.cs.f(v3, v6, p0.readUTF(), p0.readUTF());
    }

    private static void a(DataOutputStream p0, byte p1, String p2) {
        p0.writeByte(p1);
        p0.writeUTF(p2);
    }

    static String b(String p0) {
        if (TextUtils.isEmpty(p0))
            v0 = "experiment-flags-regular-null-account";
        else {
            v1 = String.valueOf("experiment-flags-regular-");
            v0 = String.valueOf(Uri.encode(p0));
            if (v0.length() != 0)
                v0 = v1.concat(v0);
            else
                v0 = new String(v1);
        }
        return v0;
    }

    final com.google.android.finsky.cs.f a(String p0) {
  0:    v0 = 0;
 24:    v1 = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(this.a.getFilesDir(), p0))));
 30:    v3 = new Object[1];
 37:    v3[0] = FinskyLog.a(p0);
 39:    FinskyLog.a("Started reading experiment flags from file %s.", v3);
 46:    switch (v1.readByte()) {
            case 1:
 62:            v0 = com.google.android.finsky.cs.a.i.a(v1, p0);
 66:            com.google.android.finsky.utils.j.a(v1);
119:            break;
            default:
 56:            throw new IOException("Unrecognized file version.");
        }
 58:    com.google.android.finsky.utils.j.a(v1);
 61:    return v0;
 70:    v1 = ex;
 71:    v2 = 0;
 75:    v4 = new Object[2];
 82:    v4[0] = FinskyLog.a(p0);
 85:    v4[1] = v1;
 87:    FinskyLog.d("Error reading Phenotype flags from file %s: %s", v4);
 90:    com.google.android.finsky.utils.j.a(v2);
 93:    return v0;
 96:    v1 = 0;
 97:    v0 = ex;
 98:    com.google.android.finsky.utils.j.a(v1);
101:    throw v0;
102:    v0 = ex;
103:    goto 98;
104:    v0 = ex;
105:    v1 = v2;
106:    goto 98;
109:    v2 = v1;
110:    v1 = ex;
111:    goto 72;
113:    v1 = 0;
114:    goto 58;
115:    try
            run 72...90
        catch (Throwable ex) {
 72:        goto 104;
        }
116:    try
            run 62...65
        catch (FileNotFoundException ex) {
 62:        goto 57;
        }
        catch (IOException ex) {
 62:        goto 107;
        }
        catch (Throwable ex) {
 62:        goto 102;
        }
117:    try
            run 27...57
        catch (FileNotFoundException ex) {
 27:        goto 57;
        }
        catch (IOException ex) {
 27:        goto 107;
        }
        catch (Throwable ex) {
 27:        goto 102;
        }
118:    try
            run 12...27
        catch (FileNotFoundException ex) {
 12:        goto 112;
        }
        catch (IOException ex) {
 12:        goto 70;
        }
        catch (Throwable ex) {
 12:        goto 94;
        }
    }

}
