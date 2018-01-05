package com.google.android.finsky.cq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PermissionInfo;
import android.text.TextUtils;
import com.google.android.finsky.utils.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.cq.a
{

    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public Map j;
    public final Context k;

    static {
        v0 = new String[2];
        v0[0] = "android.permission.READ_CALENDAR";
        v0[1] = "android.permission.WRITE_CALENDAR";
        com.google.android.finsky.cq.a.a = v0;
        v0 = new String[1];
        v0[0] = "android.permission.CAMERA";
        com.google.android.finsky.cq.a.b = v0;
        v0 = new String[3];
        v0[0] = "android.permission.GET_ACCOUNTS";
        v0[1] = "android.permission.READ_CONTACTS";
        v0[2] = "android.permission.WRITE_CONTACTS";
        com.google.android.finsky.cq.a.c = v0;
        v0 = new String[3];
        v0[0] = "android.permission.ACCESS_COARSE_LOCATION";
        v0[1] = "android.permission.ACCESS_FINE_LOCATION";
        v0[2] = "com.google.android.gms.permission.CAR_SPEED";
        com.google.android.finsky.cq.a.d = v0;
        v0 = new String[1];
        v0[0] = "android.permission.RECORD_AUDIO";
        com.google.android.finsky.cq.a.e = v0;
        v0 = new String[7];
        v0[0] = "android.permission.CALL_PHONE";
        v0[1] = "android.permission.PROCESS_OUTGOING_CALLS";
        v0[2] = "android.permission.READ_CALL_LOG";
        v0[3] = "android.permission.READ_PHONE_STATE";
        v0[4] = "android.permission.USE_SIP";
        v0[5] = "android.permission.WRITE_CALL_LOG";
        v0[6] = "com.android.voicemail.permission.ADD_VOICEMAIL";
        com.google.android.finsky.cq.a.f = v0;
        v0 = new String[1];
        v0[0] = "android.permission.BODY_SENSORS";
        com.google.android.finsky.cq.a.g = v0;
        v0 = new String[6];
        v0[0] = "android.permission.READ_SMS";
        v0[1] = "android.permission.READ_CELL_BROADCASTS";
        v0[2] = "android.permission.RECEIVE_SMS";
        v0[3] = "android.permission.RECEIVE_MMS";
        v0[4] = "android.permission.RECEIVE_WAP_PUSH";
        v0[5] = "android.permission.SEND_SMS";
        com.google.android.finsky.cq.a.h = v0;
        v0 = new String[2];
        v0[0] = "android.permission.READ_EXTERNAL_STORAGE";
        v0[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
        com.google.android.finsky.cq.a.i = v0;
    }

    a(Context p0) {
        this.j = 0;
        this.k = p0;
    }

    private final void a(Map p0, Set p1, boolean p2, b[] p3) {
  1:    v3 = com.google.android.finsky.utils.k.a(0);
  5:    v4 = p1.iterator();
 13:    if (!v4.hasNext())
492:        return;
 19:    v0 = (String)v4.next();
 22:    try {
 33:        v2 = this.k.getPackageManager().getPermissionInfo(v0, 0);
        }
        catch (PackageManager$NameNotFoundException ex) {
115:        v2 = 0;
        }
 34:    if (v2 == 0) goto 9;
 40:    v1 = (Integer)p0.get(v0);
 42:    if (v1 != 0) goto 91;
 49:    if ((v2.protectionLevel & 15) != 2) goto 59;
 57:    if (!"android.permission.SYSTEM_ALERT_WINDOW".equals(v0)) goto 9;
 59:    v1 = -1;
 64:    switch (v0.hashCode()) {
            case -1875779388:
 64:            goto 234;
            case -1579322816:
 64:            goto 222;
            case -990672155:
 64:            goto 246;
            case -781522144:
 64:            goto 117;
            case -641052592:
 64:            goto 258;
            case -627735856:
 64:            goto 210;
            case -558143690:
 64:            goto 187;
            case -378524462:
 64:            goto 147;
            case -145653303:
 64:            goto 127;
            case 169397625:
 64:            goto 177;
            case 827276746:
 64:            goto 167;
            case 1261142821:
 64:            goto 198;
            case 1462853665:
 64:            goto 157;
            case 1968503017:
 64:            goto 137;
            default:
        }
 67:    switch (v1) {
            case 0:
 67:            goto 270;
            case 1:
 67:            goto 270;
            case 2:
 67:            goto 270;
            case 3:
 67:            goto 270;
            case 4:
 67:            goto 270;
            case 5:
 67:            goto 270;
            case 6:
 67:            goto 270;
            case 7:
 67:            goto 270;
            case 8:
 67:            goto 270;
            case 9:
 67:            goto 270;
            case 10:
 67:            goto 270;
            case 11:
 67:            goto 270;
            case 12:
 67:            goto 270;
            case 13:
 67:            goto 270;
            default:
        }
 71:    v1 = 0;
 72:    if (v1 >= v3.length) goto 277;
 80:    if (!v3[v1].equals(v0)) goto 273;
 82:    v0 = 1;
 83:    if (v0 != 0) goto 9;
 87:    v1 = Integer.valueOf(9);
 95:    v0 = p3[v1.intValue()];
 97:    if (v0 != 0) goto 301;
103:    switch (v1.intValue()) {
            case 0:
292:            v0 = new com.google.android.finsky.cq.b(0, 2130837771, 2131952692, 2131952691);
494:            break;
            case 1:
422:            v0 = new com.google.android.finsky.cq.b(1, 2130837772, 2131952694, 2131952693);
494:            break;
            case 2:
341:            v0 = new com.google.android.finsky.cq.b(2, 2130837774, 2131952696, 2131952695);
494:            break;
            case 3:
357:            v0 = new com.google.android.finsky.cq.b(3, 2130837780, 2131952698, 2131952697);
494:            break;
            case 4:
439:            v0 = new com.google.android.finsky.cq.b(4, 2130837783, 2131952700, 2131952699);
494:            break;
            case 5:
373:            v0 = new com.google.android.finsky.cq.b(5, 2130837784, 2131952704, 2131952703);
494:            break;
            case 6:
456:            v0 = new com.google.android.finsky.cq.b(6, 2130837770, 2131952706, 2131952705);
494:            break;
            case 7:
389:            v0 = new com.google.android.finsky.cq.b(7, 2130837782, 2131952708, 2131952707);
494:            break;
            case 8:
406:            v0 = new com.google.android.finsky.cq.b(8, 2130837781, 2131952710, 2131952709);
494:            break;
            case 9:
474:            v0 = new com.google.android.finsky.cq.b(9, 2130837786, 2131952702, 2131952701);
494:            break;
            default:
113:            throw new IllegalStateException("invalid permission bucket.");
        }
123:    if (v0.equals("android.permission.READ_PROFILE"))
125:        v1 = 0;
126:    goto 67;
133:    if (v0.equals("android.permission.WRITE_PROFILE"))
135:        v1 = 1;
136:    goto 67;
143:    if (v0.equals("android.permission.READ_SOCIAL_STREAM"))
145:        v1 = 2;
146:    goto 67;
153:    if (v0.equals("android.permission.WRITE_SOCIAL_STREAM"))
155:        v1 = 3;
156:    goto 67;
163:    if (v0.equals("android.permission.READ_USER_DICTIONARY"))
165:        v1 = 4;
166:    goto 67;
173:    if (v0.equals("android.permission.WRITE_USER_DICTIONARY"))
175:        v1 = 5;
176:    goto 67;
183:    if (v0.equals("android.permission.WRITE_SMS"))
185:        v1 = 6;
186:    goto 67;
193:    if (v0.equals("com.android.browser.permission.READ_HISTORY_BOOKMARKS"))
195:        v1 = 7;
196:    goto 67;
204:    if (v0.equals("com.android.browser.permission.WRITE_HISTORY_BOOKMARKS"))
206:        v1 = 8;
208:    goto 67;
216:    if (v0.equals("android.permission.AUTHENTICATE_ACCOUNTS"))
218:        v1 = 9;
220:    goto 67;
228:    if (v0.equals("android.permission.MANAGE_ACCOUNTS"))
230:        v1 = 10;
232:    goto 67;
240:    if (v0.equals("android.permission.USE_CREDENTIALS"))
242:        v1 = 11;
244:    goto 67;
252:    if (v0.equals("android.permission.SUBSCRIBED_FEEDS_READ"))
254:        v1 = 12;
256:    goto 67;
264:    if (v0.equals("android.permission.SUBSCRIBED_FEEDS_WRITE"))
266:        v1 = 13;
268:    goto 67;
270:    v0 = 1;
271:    goto 83;
273:    v1 = v1 + 1;
275:    goto 72;
277:    v0 = 0;
278:    goto 83;
299:    p3[v1.intValue()] = v0;
307:    v1 = v2.loadLabel(this.k.getPackageManager());
311:    if (v1 == 0)
313:        v1 = 0;
        else
479:        v1 = v1.toString();
318:    if (!TextUtils.isEmpty(v1)) {
320:        if (p2 != 0)
324:            v0.f.add(v1);
            else
487:            v0.e.add(v1);
        }
327:    goto 9;
    }

    public final com.google.android.finsky.cq.c a(String[] p0, Set p1) {
        v2 = new b[10];
        if (p0 == 0)
            v0 = new com.google.android.finsky.cq.c(v2, 9, 0);
        else {
            if (this.j != 0)
                v0 = this.j;
            else {
                v3 = new HashMap();
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.b.length) {
                    v3.put(com.google.android.finsky.cq.a.b[v0], Integer.valueOf(1));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.a.length) {
                    v3.put(com.google.android.finsky.cq.a.a[v0], Integer.valueOf(0));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.c.length) {
                    v3.put(com.google.android.finsky.cq.a.c[v0], Integer.valueOf(2));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.d.length) {
                    v3.put(com.google.android.finsky.cq.a.d[v0], Integer.valueOf(3));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.e.length) {
                    v3.put(com.google.android.finsky.cq.a.e[v0], Integer.valueOf(4));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.f.length) {
                    v3.put(com.google.android.finsky.cq.a.f[v0], Integer.valueOf(5));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.g.length) {
                    v3.put(com.google.android.finsky.cq.a.g[v0], Integer.valueOf(6));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.h.length) {
                    v3.put(com.google.android.finsky.cq.a.h[v0], Integer.valueOf(7));
                    v0 = v0 + 1;
                }
                v0 = 0;
                while (v0 < com.google.android.finsky.cq.a.i.length) {
                    v3.put(com.google.android.finsky.cq.a.i[v0], Integer.valueOf(8));
                    v0 = v0 + 1;
                }
                this.j = Collections.unmodifiableMap(v3);
                v0 = this.j;
            }
            v3 = new HashSet(Arrays.asList(p0));
            if (p1 != 0)
                v3.removeAll(p1);
            this.a(v0, v3, 1, v2);
            if (p1 != 0)
                this.a(v0, p1, 0, v2);
            v0 = new com.google.android.finsky.cq.c(v2, 9, 0);
        }
        return v0;
    }

}
