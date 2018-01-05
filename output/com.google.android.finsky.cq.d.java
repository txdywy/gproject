package com.google.android.finsky.cq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PermissionInfo;
import android.text.TextUtils;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.cq.d
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
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public Map r;
    public Set s;
    public final Context t;
    public final com.google.android.finsky.cn.a u;
    public final com.google.android.finsky.ba.c v;

    static {
        v0 = new String[1];
        v0[0] = "com.android.vending.BILLING";
        com.google.android.finsky.cq.d.a = v0;
        v0 = new String[4];
        v0[0] = "android.permission.GET_ACCOUNTS";
        v0[1] = "android.permission.MANAGE_ACCOUNTS";
        v0[2] = "android.permission.READ_PROFILE";
        v0[3] = "android.permission.WRITE_PROFILE";
        com.google.android.finsky.cq.d.b = v0;
        v0 = new String[2];
        v0[0] = "android.permission.READ_CALENDAR";
        v0[1] = "android.permission.WRITE_CALENDAR";
        com.google.android.finsky.cq.d.c = v0;
        v0 = new String[2];
        v0[0] = "android.permission.READ_CONTACTS";
        v0[1] = "android.permission.WRITE_CONTACTS";
        com.google.android.finsky.cq.d.d = v0;
        v0 = new String[5];
        v0[0] = "android.permission.ACCESS_COARSE_LOCATION";
        v0[1] = "android.permission.ACCESS_FINE_LOCATION";
        v0[2] = "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS";
        v0[3] = "android.permission.ACCESS_GPS";
        v0[4] = "com.google.android.gms.permission.CAR_SPEED";
        com.google.android.finsky.cq.d.e = v0;
        v0 = new String[6];
        v0[0] = "android.permission.RECEIVE_SMS";
        v0[1] = "android.permission.READ_SMS";
        v0[2] = "android.permission.WRITE_SMS";
        v0[3] = "android.permission.SEND_SMS";
        v0[4] = "android.permission.RECEIVE_MMS";
        v0[5] = "android.permission.RECEIVE_WAP_PUSH";
        com.google.android.finsky.cq.d.f = v0;
        v0 = new String[6];
        v0[0] = "android.permission.CALL_PHONE";
        v0[1] = "android.permission.WRITE_CALL_LOG";
        v0[2] = "android.permission.READ_CALL_LOG";
        v0[3] = "android.permission.CALL_PRIVILEGED";
        v0[4] = "android.permission.PROCESS_OUTGOING_CALLS";
        v0[5] = "android.permission.MODIFY_PHONE_STATE";
        com.google.android.finsky.cq.d.g = v0;
        v0 = new String[4];
        v0[0] = "android.permission.READ_EXTERNAL_STORAGE";
        v0[1] = "android.permission.WRITE_EXTERNAL_STORAGE";
        v0[2] = "android.permission.MOUNT_FORMAT_FILESYSTEMS";
        v0[3] = "android.permission.MOUNT_UNMOUNT_FILESYSTEMS";
        com.google.android.finsky.cq.d.h = v0;
        v0 = new String[2];
        v0[0] = "android.permission.CAMERA";
        v0[1] = "android.permission.RECORD_VIDEO";
        com.google.android.finsky.cq.d.i = v0;
        v0 = new String[1];
        v0[0] = "android.permission.RECORD_AUDIO";
        com.google.android.finsky.cq.d.j = v0;
        v0 = new String[4];
        v0[0] = "android.permission.READ_LOGS";
        v0[1] = "android.permission.GET_TASKS";
        v0[2] = "android.permission.DUMP";
        v0[3] = "com.android.browser.permission.READ_HISTORY_BOOKMARKS";
        com.google.android.finsky.cq.d.k = v0;
        v0 = new String[1];
        v0[0] = "android.permission.WRITE_APN_SETTINGS";
        com.google.android.finsky.cq.d.l = v0;
        v0 = new String[1];
        v0[0] = "android.permission.ACCESS_WIFI_STATE";
        com.google.android.finsky.cq.d.m = v0;
        v0 = new String[1];
        v0[0] = "android.permission.BLUETOOTH_ADMIN";
        com.google.android.finsky.cq.d.n = v0;
        v0 = new String[1];
        v0[0] = "android.permission.READ_PHONE_STATE";
        com.google.android.finsky.cq.d.o = v0;
        v0 = new String[1];
        v0[0] = "android.permission.BODY_SENSORS";
        com.google.android.finsky.cq.d.p = v0;
        v0 = new String[49];
        v0[0] = "android.permission.ACCESS_MOCK_LOCATION";
        v0[1] = "android.permission.ACCESS_NETWORK_STATE";
        v0[2] = "android.permission.ACCOUNT_MANAGER";
        v0[3] = "android.permission.AUTHENTICATE_ACCOUNTS";
        v0[4] = "android.permission.BATTERY_STATS";
        v0[5] = "android.permission.BLUETOOTH";
        v0[6] = "android.permission.BROADCAST_STICKY";
        v0[7] = "android.permission.CHANGE_CONFIGURATION";
        v0[8] = "android.permission.CHANGE_NETWORK_STATE";
        v0[9] = "android.permission.CHANGE_WIFI_MULTICAST_STATE";
        v0[10] = "android.permission.CHANGE_WIFI_STATE";
        v0[11] = "android.permission.CHANGE_WIMAX_STATE";
        v0[12] = "android.permission.CLEAR_APP_CACHE";
        v0[13] = "android.permission.DISABLE_KEYGUARD";
        v0[14] = "android.permission.EXPAND_STATUS_BAR";
        v0[15] = "android.permission.FLASHLIGHT";
        v0[16] = "android.permission.GET_PACKAGE_SIZE";
        v0[17] = "android.permission.INTERNET";
        v0[18] = "android.permission.KILL_BACKGROUND_PROCESSES";
        v0[19] = "android.permission.MODIFY_AUDIO_SETTINGS";
        v0[20] = "android.permission.NFC";
        v0[21] = "android.permission.PERSISTENT_ACTIVITY";
        v0[22] = "android.permission.READ_SYNC_SETTINGS";
        v0[23] = "android.permission.READ_USER_DICTIONARY";
        v0[24] = "android.permission.RECEIVE_BOOT_COMPLETED";
        v0[25] = "android.permission.REORDER_TASKS";
        v0[26] = "android.permission.SERIAL_PORT";
        v0[27] = "android.permission.SET_ALWAYS_FINISH";
        v0[28] = "android.permission.SET_ANIMATION_SCALE";
        v0[29] = "android.permission.SET_DEBUG_APP";
        v0[30] = "android.permission.SET_PREFERRED_APPLICATIONS";
        v0[31] = "android.permission.SET_PROCESS_LIMIT";
        v0[32] = "android.permission.SET_TIME_ZONE";
        v0[33] = "android.permission.SET_WALLPAPER";
        v0[34] = "android.permission.SIGNAL_PERSISTENT_PROCESSES";
        v0[35] = "android.permission.SYSTEM_ALERT_WINDOW";
        v0[36] = "android.permission.USE_CREDENTIALS";
        v0[37] = "android.permission.USE_SIP";
        v0[38] = "android.permission.VIBRATE";
        v0[39] = "android.permission.WAKE_LOCK";
        v0[40] = "android.permission.WRITE_SETTINGS";
        v0[41] = "android.permission.WRITE_SYNC_SETTINGS";
        v0[42] = "android.permission.WRITE_USER_DICTIONARY";
        v0[43] = "com.android.alarm.permission.SET_ALARM";
        v0[44] = "com.android.browser.permission.WRITE_HISTORY_BOOKMARKS";
        v0[45] = "com.android.launcher.permission.INSTALL_SHORTCUT";
        v0[46] = "com.android.launcher.permission.UNINSTALL_SHORTCUT";
        v0[47] = "com.android.vending.CHECK_LICENSE";
        v0[48] = "com.google.android.providers.gsf.permission.READ_GSERVICES";
        com.google.android.finsky.cq.d.q = v0;
    }

    d(Context p0, com.google.android.finsky.cn.a p1, com.google.android.finsky.ba.c p2) {
        this.r = 0;
        this.s = 0;
        this.t = p0;
        this.u = p1;
        this.v = p2;
    }

    public static com.google.android.finsky.cq.b a(int p0) {
        switch (p0) {
            case 0:
                v0 = new com.google.android.finsky.cq.b(0, 2130837779, 2131952819, 2131952818);
                break;
            case 1:
                v0 = new com.google.android.finsky.cq.b(1, 2130837777, 2131952813, 2131952812);
                break;
            case 2:
                v0 = new com.google.android.finsky.cq.b(2, 2130837775, 2131952831, 2131952830);
                break;
            case 3:
                v0 = new com.google.android.finsky.cq.b(3, 2130837778, 2131952817, 2131952816);
                break;
            case 4:
                v0 = new com.google.android.finsky.cq.b(4, 2130837771, 2131952807, 2131952806);
                break;
            case 5:
                v0 = new com.google.android.finsky.cq.b(5, 2130837774, 2131952811, 2131952810);
                break;
            case 6:
                v0 = new com.google.android.finsky.cq.b(6, 2130837780, 2131952821, 2131952820);
                break;
            case 7:
                v0 = new com.google.android.finsky.cq.b(7, 2130837782, 2131952833, 2131952832);
                break;
            case 8:
                v0 = new com.google.android.finsky.cq.b(8, 2130837784, 2131952827, 2131952826);
                break;
            case 9:
                v0 = new com.google.android.finsky.cq.b(9, 2130837781, 2131952829, 2131952828);
                break;
            case 10:
                v0 = new com.google.android.finsky.cq.b(10, 2130837772, 2131952809, 2131952808);
                break;
            case 11:
                v0 = new com.google.android.finsky.cq.b(11, 2130837783, 2131952823, 2131952822);
                break;
            case 12:
                v0 = new com.google.android.finsky.cq.b(12, 2130837785, 2131952836, 2131952835);
                break;
            case 13:
                v0 = new com.google.android.finsky.cq.b(13, 2130837769, 2131952805, 2131952804);
                break;
            case 14:
                v0 = new com.google.android.finsky.cq.b(14, 2130837776, 2131952815, 2131952814);
                break;
            case 15:
                v0 = new com.google.android.finsky.cq.b(15, 2130837770, 2131952834, 2131952838);
                break;
            case 16:
                v0 = new com.google.android.finsky.cq.b(16, 2130837786, 2131952825, 2131952824);
                break;
            default:
                throw new IllegalStateException("invalid permission bucket.");
        }
        return v0;
    }

    public static void a(com.google.android.finsky.bn.b p0, String p1) {
        p0.f(p1, 1);
    }

    private final void a(Map p0, Set p1, boolean p2, boolean p3, b[] p4) {
  0:    v3 = p1.iterator();
  8:    if (!v3.hasNext())
 97:        return;
 14:    v0 = (String)v3.next();
 20:    v1 = (Integer)p0.get(v0);
 22:    if (v1 != 0) goto 50;
 28:    v1 = this.a().contains(v0);
 32:    if (v1 == 0) goto 36;
 34:    if (p2 != 0) goto 44;
 36:    if (v1 != 0) goto 4;
 42:    if (!this.a(v0)) goto 4;
 46:    v1 = Integer.valueOf(16);
 54:    v2 = p4[v1.intValue()];
 56:    if (v2 == 0) {
 62:        v2 = com.google.android.finsky.cq.d.a(v1.intValue());
 70:        p4[v1.intValue()] = v2;
        }
 73:    v0 = this.b(v0);
 81:    if (!TextUtils.isEmpty(v0)) {
 83:        if (p3 != 0)
 87:            v2.f.add(v0);
            else
 93:            v2.e.add(v0);
        }
 90:    goto 4;
    }

    private final boolean a(String p0) {
        v0 = 1;
        try {
            v2 = this.t.getPackageManager().getPermissionInfo(p0, 0);
            if (v2 == 0) {
                v0 = 0;
                return v0;
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            v0 = 0;
            return v0;
        }
        if (v2.protectionLevel == 1)
            return v0;
        v0 = 0;
        return v0;
    }

    private final boolean a(Set p0, Set p1) {
        v2 = p1.iterator();
        while (true) {
            if (!v2.hasNext()) {
                v0 = new HashSet(p1);
                v0.removeAll(p0);
                v2 = v0.iterator();
                while (v2.hasNext()) {
                    if (this.a((String)v2.next())) {
                        v0 = 1;
                        return v0;
                    }
                }
                v0 = 0;
                return v0;
            }
            if (p0.contains((String)v2.next())) {
                v0 = 1;
                return v0;
            }
        }
    }

    private final String b(String p0) {
        v0 = 0;
        try {
            v1 = this.t.getPackageManager().getPermissionInfo(p0, 0);
            if (v1 != 0) {
                v1 = v1.loadLabel(this.t.getPackageManager());
                if (v1 != 0)
                    v0 = v1.toString();
            }
            return v0;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return v0;
        }
    }

    public final com.google.android.finsky.cq.c a(String[] p0, Set p1, boolean p2) {
        return this.a(p0, p1, p2, 0);
    }

    public final com.google.android.finsky.cq.c a(String[] p0, Set p1, boolean p2, boolean p3) {
        v5 = new b[17];
        if (p0 == 0)
            v0 = new com.google.android.finsky.cq.c(v5, 16, 0);
        else {
            v1 = this.b();
            if (p2 == 0) {
                if (p1 != 0) {
                    v0 = new HashSet(Arrays.asList(p0));
                    v0.removeAll(p1);
                    if (!this.a(v1.keySet(), v0)) {
                        v0 = new com.google.android.finsky.cq.c(v5, 16, 0);
                        return v0;
                    }
                    v0 = 1;
                }
                else
                    v0 = 0;
                p1 = 0;
                v2 = new HashSet(Arrays.asList(p0));
                v7 = v0;
            }
            else {
                v2 = new HashSet(Arrays.asList(p0));
                if (p1 != 0)
                    v2.removeAll(p1);
                v7 = 0;
            }
            this.a(v1, v2, p3, 1, v5);
            if (p1 != 0)
                this.a(v1, p1, p3, 0, v5);
            v0 = new com.google.android.finsky.cq.c(v5, 16, v7);
        }
        return v0;
    }

    public final Set a() {
        if (this.s == 0) {
            this.s = new HashSet(Arrays.asList(com.google.android.finsky.cq.d.q));
            if (this.v.dj().a(12607368))
                this.s.remove("android.permission.SYSTEM_ALERT_WINDOW");
        }
        return this.s;
    }

    public final Map b() {
        v0 = 0;
        if (this.r != 0)
            v0 = this.r;
        else {
            v2 = new HashMap();
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.a.length) {
                v2.put(com.google.android.finsky.cq.d.a[v1], Integer.valueOf(0));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.b.length) {
                v2.put(com.google.android.finsky.cq.d.b[v1], Integer.valueOf(3));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.d.length) {
                v2.put(com.google.android.finsky.cq.d.d[v1], Integer.valueOf(5));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.c.length) {
                v2.put(com.google.android.finsky.cq.d.c[v1], Integer.valueOf(4));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.e.length) {
                v2.put(com.google.android.finsky.cq.d.e[v1], Integer.valueOf(6));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.f.length) {
                v2.put(com.google.android.finsky.cq.d.f[v1], Integer.valueOf(7));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.g.length) {
                v2.put(com.google.android.finsky.cq.d.g[v1], Integer.valueOf(8));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.h.length) {
                v2.put(com.google.android.finsky.cq.d.h[v1], Integer.valueOf(9));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.i.length) {
                v2.put(com.google.android.finsky.cq.d.i[v1], Integer.valueOf(10));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.j.length) {
                v2.put(com.google.android.finsky.cq.d.j[v1], Integer.valueOf(11));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.k.length) {
                v2.put(com.google.android.finsky.cq.d.k[v1], Integer.valueOf(1));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.l.length) {
                v2.put(com.google.android.finsky.cq.d.l[v1], Integer.valueOf(2));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.m.length) {
                v2.put(com.google.android.finsky.cq.d.m[v1], Integer.valueOf(12));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.n.length) {
                v2.put(com.google.android.finsky.cq.d.n[v1], Integer.valueOf(13));
                v1 = v1 + 1;
            }
            v1 = 0;
            while (v1 < com.google.android.finsky.cq.d.o.length) {
                v2.put(com.google.android.finsky.cq.d.o[v1], Integer.valueOf(14));
                v1 = v1 + 1;
            }
            while (v0 < com.google.android.finsky.cq.d.p.length) {
                v2.put(com.google.android.finsky.cq.d.p[v0], Integer.valueOf(15));
                v0 = v0 + 1;
            }
            this.r = Collections.unmodifiableMap(v2);
            v0 = this.r;
        }
        return v0;
    }

    public final boolean b(com.google.android.finsky.bn.b p0, String p1) {
        v0 = 1;
        v1 = p0.a(p1);
        if (v1 == 0 || v1.s != 1)
            v0 = 0;
        if (v0 == 0) {
            v1 = this.u.a(p1);
            if (v1 != 0)
                v0 = v1.g;
        }
        return v0;
    }

}
