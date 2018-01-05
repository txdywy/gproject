package com.android.ex.photo.e;

import android.util.Log;
import java.io.InputStream;

private static class com.android.ex.photo.e.a
{

    private static int a(com.android.ex.photo.e.g p0, int p1, int p2, boolean p3) {
        v0 = 1;
        if (p3 != 0) {
            p1 = p1 + p2 - 1;
            v0 = -1;
        }
        v1 = 0;
        while (p2 > 0) {
            v1 = v1 << 8 | p0.a(p1) & 255;
            p1 = p1 + v0;
            p2 = p2 - 1;
        }
        return v1;
    }

    public static int a(InputStream p0) {
  5:    v1 = 0;
  6:    if (p0 == 0)
  8:        return v1;
 11:    v6 = new com.android.ex.photo.e.g(p0);
 18:    if (com.android.ex.photo.e.a.a(v6, 1)) {
 25:        if (v6.a(0) == -1 && v6.a(1) == -40)
 35:            v0 = 1;
            else
116:            v0 = 0;
 36:        if (v0 == 0)
  8:            return v1;
        }
 38:    v0 = 0;
 45:    if (!com.android.ex.photo.e.a.a(v6, v0 + 3)) goto 300;
 57:    if ((v6.a(v0) & 255) != 255) goto 296;
 63:    v4 = v6.a(v0 + 1) & 255;
 67:    if (v4 == 255) goto 293;
 69:    v0 = v0 + 2;
 73:    if (v4 == 216) goto 39;
 75:    if (v4 == 1) goto 39;
 79:    if (v4 == 217) {
 87:        v6.c(v0 - 4);
 90:        v2 = 0;
 91:        v4 = v0;
 92:        if (v2 > 8) {
 94:            v0 = com.android.ex.photo.e.a.a(v6, v4, 4, 0);
101:            if (v0 != 1229531648 && v0 != 1296891946)
112:                Log.e("CameraExif", "Invalid byte order");
                else {
191:                if (v0 == 1229531648)
193:                    v0 = 1;
                    else
217:                    v0 = 0;
196:                v3 = com.android.ex.photo.e.a.a(v6, v4 + 4, 4, v0);
204:                if (v3 + 2 < 10 || v3 + 2 > v2)
212:                    Log.e("CameraExif", "Invalid offset");
                    else {
219:                    v4 = v4 + v3 + 2;
220:                    v3 = v2 - (v3 + 2);
224:                    v6.c(v4 - 4);
229:                    v2 = com.android.ex.photo.e.a.a(v6, v4 - 2, 2, v0);
233:                    v5 = v4;
234:                    v4 = v3;
235:                    while (v2 > 0 && v4 >= 12) {
249:                        if (com.android.ex.photo.e.a.a(v6, v5, 2, v0) == 274) {
257:                            switch (com.android.ex.photo.e.a.a(v6, v5 + 8, 2, v0)) {
                                    case 1:
303:                                    break;
                                    case 2:
264:                                    Log.i("CameraExif", "Unsupported orientation");
303:                                    break;
                                    case 3:
269:                                    v1 = 180;
303:                                    break;
                                    case 4:
264:                                    Log.i("CameraExif", "Unsupported orientation");
303:                                    break;
                                    case 5:
264:                                    Log.i("CameraExif", "Unsupported orientation");
303:                                    break;
                                    case 6:
273:                                    v1 = 90;
303:                                    break;
                                    case 7:
264:                                    Log.i("CameraExif", "Unsupported orientation");
303:                                    break;
                                    case 8:
277:                                    v1 = 270;
303:                                    break;
                                    default:
264:                                    Log.i("CameraExif", "Unsupported orientation");
303:                                    break;
                                }
                            }
281:                        v5 = v5 + 12;
287:                        v6.c(v5 - 4);
290:                        v4 = v4 - 12;
291:                        v2 = v2 - 1;
                        }
                    }
                }
            }
115:        return v1;
        }
 83:    if (v4 != 218) goto 118;
 87:    v6.c(v0 - 4);
 90:    v2 = 0;
 91:    v4 = v0;
 92:    if (v2 > 8) {
 94:        v0 = com.android.ex.photo.e.a.a(v6, v4, 4, 0);
101:        if (v0 != 1229531648 && v0 != 1296891946)
112:            Log.e("CameraExif", "Invalid byte order");
            else {
191:            if (v0 == 1229531648)
193:                v0 = 1;
                else
217:                v0 = 0;
196:            v3 = com.android.ex.photo.e.a.a(v6, v4 + 4, 4, v0);
204:            if (v3 + 2 < 10 || v3 + 2 > v2)
212:                Log.e("CameraExif", "Invalid offset");
                else {
219:                v4 = v4 + v3 + 2;
220:                v3 = v2 - (v3 + 2);
224:                v6.c(v4 - 4);
229:                v2 = com.android.ex.photo.e.a.a(v6, v4 - 2, 2, v0);
233:                v5 = v4;
234:                v4 = v3;
235:                while (v2 > 0 && v4 >= 12) {
249:                    if (com.android.ex.photo.e.a.a(v6, v5, 2, v0) == 274) {
257:                        switch (com.android.ex.photo.e.a.a(v6, v5 + 8, 2, v0)) {
                                case 1:
303:                                break;
                                case 2:
264:                                Log.i("CameraExif", "Unsupported orientation");
303:                                break;
                                case 3:
269:                                v1 = 180;
303:                                break;
                                case 4:
264:                                Log.i("CameraExif", "Unsupported orientation");
303:                                break;
                                case 5:
264:                                Log.i("CameraExif", "Unsupported orientation");
303:                                break;
                                case 6:
273:                                v1 = 90;
303:                                break;
                                case 7:
264:                                Log.i("CameraExif", "Unsupported orientation");
303:                                break;
                                case 8:
277:                                v1 = 270;
303:                                break;
                                default:
264:                                Log.i("CameraExif", "Unsupported orientation");
303:                                break;
                            }
                        }
281:                    v5 = v5 + 12;
287:                    v6.c(v5 - 4);
290:                    v4 = v4 - 12;
291:                    v2 = v2 - 1;
                    }
                }
            }
        }
115:    return v1;
118:    v5 = com.android.ex.photo.e.a.a(v6, v0, 2, 0);
122:    if (v5 < 2 || !com.android.ex.photo.e.a.a(v6, v0 + v5 - 1)) {
138:        Log.e("CameraExif", "Invalid length");
141:        return v1;
        }
145:    if (v4 != 225) goto 180;
147:    if (v5 < 8) goto 180;
158:    if (com.android.ex.photo.e.a.a(v6, v0 + 2, 4, 0) != 1165519206) goto 180;
166:    if (com.android.ex.photo.e.a.a(v6, v0 + 6, 2, 0) != 0) goto 180;
174:    v6.c(v0 + 8 - 4);
177:    v4 = v0 + 8;
178:    v2 = v5 - 8;
179:    goto 92;
180:    v0 = v0 + v5;
183:    v6.c(v0 - 4);
186:    goto 39;
293:    v0 = v0 + 1;
294:    goto 39;
296:    v4 = v0 + 1;
297:    v2 = 0;
298:    goto 92;
300:    v2 = 0;
301:    v4 = v0;
302:    goto 92;
    }

    private static boolean a(com.android.ex.photo.e.g p0, int p1) {
        if (-1 >= 0) {
            if ((long)p1 < -1)
                v0 = 1;
            else
                v0 = 0;
        }
        else
            v0 = p0.b(p1);
        return v0;
    }

}
