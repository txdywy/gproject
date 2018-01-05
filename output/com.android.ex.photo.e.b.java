package com.android.ex.photo.e;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build$VERSION;
import android.util.Log;
import com.android.ex.photo.c.c;
import com.android.ex.photo.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

public static class com.android.ex.photo.e.b
{

    public static final Pattern a;
    public static final com.android.ex.photo.e.e b;

    static {
        com.android.ex.photo.e.b.a = Pattern.compile("^(?:.*;)?base64,.*");
        if (Build$VERSION.SDK_INT >= 11)
            com.android.ex.photo.e.b.b = com.android.ex.photo.e.e.c;
        else if ((long)com.android.ex.photo.j.a >= 32)
            com.android.ex.photo.e.b.b = com.android.ex.photo.e.e.c;
        else if ((long)com.android.ex.photo.j.a >= 24)
            com.android.ex.photo.e.b.b = com.android.ex.photo.e.e.b;
        else
            com.android.ex.photo.e.b.b = com.android.ex.photo.e.e.a;
    }

    private static Bitmap a(com.android.ex.photo.e.f p0, BitmapFactory$Options p1) {
  1:    v1 = p0.a();
  5:    v2 = com.android.ex.photo.e.a.a(v1);
  9:    if (v1 != 0)
 11:        v1.close();
 14:    v8 = p0.a();
 19:    v0 = BitmapFactory.decodeStream(v8, 0, p1);
 23:    if (v8 != 0 && v0 == 0 && p1.inJustDecodeBounds == 0) {
 35:        Log.w("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options): Image bytes cannot be decoded into a Bitmap");
 45:        throw new UnsupportedOperationException("Image bytes cannot be decoded into a Bitmap.");
        }
 30:    goto 62;
 46:    v0 = ex;
 47:    v1 = v8;
 52:    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", v0);
 55:    if (v1 != 0) {
 57:        try {
 57:            v1.close();
            }
            catch (IOException ex) {
            }
        }
 60:    v0 = 0;
 61:    return v0;
 62:    if (v0 == 0) {
 98:        if (v8 != 0) {
100:            try {
100:                v8.close();
                }
                catch (IOException ex) {
                }
            }
103:        return v0;
        }
 64:    if (v2 == 0) {
 98:        if (v8 != 0) {
100:            try {
100:                v8.close();
                }
                catch (IOException ex) {
                }
            }
103:        return v0;
        }
 68:    v5 = new Matrix();
 72:    v5.postRotate((float)v2);
 86:    v0 = Bitmap.createBitmap(v0, 0, 0, v0.getWidth(), v0.getHeight(), v5, 1);
 90:    if (v8 != 0) {
 92:        try {
 92:            v8.close();
            }
            catch (IOException ex) {
            }
        }
 95:    return v0;
106:    v0 = ex;
107:    v8 = 0;
112:    Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", v0);
115:    if (v8 != 0) {
117:        try {
117:            v8.close();
            }
            catch (IOException ex) {
            }
        }
120:    v0 = 0;
121:    return v0;
122:    v0 = ex;
123:    v8 = 0;
124:    if (v8 != 0) {
126:        try {
126:            v8.close();
            }
            catch (IOException ex) {
            }
        }
129:    throw v0;
136:    v0 = ex;
137:    v8 = v1;
138:    goto 124;
139:    v0 = ex;
140:    goto 124;
141:    v0 = ex;
142:    v8 = v1;
143:    goto 108;
144:    v0 = ex;
145:    goto 108;
146:    v0 = ex;
147:    v1 = 0;
148:    goto 48;
149:    v0 = ex;
150:    goto 48;
153:    try
            run 108...115
        catch (Throwable ex) {
108:        goto 139;
        }
156:    try
            run 66...89
        catch (OutOfMemoryError ex) {
 66:        goto 46;
        }
        catch (IOException ex) {
 66:        goto 144;
        }
        catch (Throwable ex) {
 66:        goto 139;
        }
158:    try
            run 48...55
        catch (Throwable ex) {
 48:        goto 136;
        }
159:    try
            run 19...46
        catch (OutOfMemoryError ex) {
 19:        goto 46;
        }
        catch (IOException ex) {
 19:        goto 144;
        }
        catch (Throwable ex) {
 19:        goto 139;
        }
160:    try
            run 5...17
        catch (OutOfMemoryError ex) {
  5:        goto 149;
        }
        catch (IOException ex) {
  5:        goto 141;
        }
        catch (Throwable ex) {
  5:        goto 136;
        }
161:    try
            run 1...4
        catch (OutOfMemoryError ex) {
  1:        goto 146;
        }
        catch (IOException ex) {
  1:        goto 106;
        }
        catch (Throwable ex) {
  1:        goto 122;
        }
    }

    public static com.android.ex.photo.c.c a(ContentResolver p0, Uri p1, int p2) {
  3:    v1 = new com.android.ex.photo.c.c();
 16:    if ("data".equals(p1.getScheme()))
 20:        v0 = new com.android.ex.photo.e.d(p0, p1);
        else
 73:        v0 = new com.android.ex.photo.e.c(p0, p1);
 25:    v2 = new BitmapFactory$Options();
 29:    v2.inJustDecodeBounds = 1;
 31:    com.android.ex.photo.e.b.a(v0, v2);
 40:    v3 = new Point(v2.outWidth, v2.outHeight);
 45:    v2 = new BitmapFactory$Options();
 58:    v2.inSampleSize = Math.max(v3.x / p2, v3.y / p2);
 64:    v1.b = com.android.ex.photo.e.b.a(v0, v2);
 67:    v1.c = 0;
 69:    v0 = v1;
 70:    return v0;
 78:    v1.c = 1;
 80:    v0 = v1;
 81:    return v0;
 83:    v1.c = 1;
 85:    goto 80;
 87:    goto 80;
 89:    goto 80;
 90:    try
            run 23...69
        catch (FileNotFoundException ex) {
 23:        goto 88;
        }
        catch (IOException ex) {
 23:        goto 77;
        }
        catch (IllegalArgumentException ex) {
 23:        goto 86;
        }
        catch (SecurityException ex) {
 23:        goto 82;
        }
    }

}
