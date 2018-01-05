package com.google.android.finsky.cq;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PermissionInfo;
import android.text.TextUtils;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class C2363d {
    public static final String[] f11592a = new String[]{"com.android.vending.BILLING"};
    public static final String[] f11593b = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.MANAGE_ACCOUNTS", "android.permission.READ_PROFILE", "android.permission.WRITE_PROFILE"};
    public static final String[] f11594c = new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
    public static final String[] f11595d = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    public static final String[] f11596e = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS", "android.permission.ACCESS_GPS", "com.google.android.gms.permission.CAR_SPEED"};
    public static final String[] f11597f = new String[]{"android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.WRITE_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_WAP_PUSH"};
    public static final String[] f11598g = new String[]{"android.permission.CALL_PHONE", "android.permission.WRITE_CALL_LOG", "android.permission.READ_CALL_LOG", "android.permission.CALL_PRIVILEGED", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.MODIFY_PHONE_STATE"};
    public static final String[] f11599h = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.MOUNT_FORMAT_FILESYSTEMS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS"};
    public static final String[] f11600i = new String[]{"android.permission.CAMERA", "android.permission.RECORD_VIDEO"};
    public static final String[] f11601j = new String[]{"android.permission.RECORD_AUDIO"};
    public static final String[] f11602k = new String[]{"android.permission.READ_LOGS", "android.permission.GET_TASKS", "android.permission.DUMP", "com.android.browser.permission.READ_HISTORY_BOOKMARKS"};
    public static final String[] f11603l = new String[]{"android.permission.WRITE_APN_SETTINGS"};
    public static final String[] f11604m = new String[]{"android.permission.ACCESS_WIFI_STATE"};
    public static final String[] f11605n = new String[]{"android.permission.BLUETOOTH_ADMIN"};
    public static final String[] f11606o = new String[]{"android.permission.READ_PHONE_STATE"};
    public static final String[] f11607p = new String[]{"android.permission.BODY_SENSORS"};
    public static final String[] f11608q = new String[]{"android.permission.ACCESS_MOCK_LOCATION", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCOUNT_MANAGER", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.BATTERY_STATS", "android.permission.BLUETOOTH", "android.permission.BROADCAST_STICKY", "android.permission.CHANGE_CONFIGURATION", "android.permission.CHANGE_NETWORK_STATE", "android.permission.CHANGE_WIFI_MULTICAST_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.CHANGE_WIMAX_STATE", "android.permission.CLEAR_APP_CACHE", "android.permission.DISABLE_KEYGUARD", "android.permission.EXPAND_STATUS_BAR", "android.permission.FLASHLIGHT", "android.permission.GET_PACKAGE_SIZE", "android.permission.INTERNET", "android.permission.KILL_BACKGROUND_PROCESSES", "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.NFC", "android.permission.PERSISTENT_ACTIVITY", "android.permission.READ_SYNC_SETTINGS", "android.permission.READ_USER_DICTIONARY", "android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.REORDER_TASKS", "android.permission.SERIAL_PORT", "android.permission.SET_ALWAYS_FINISH", "android.permission.SET_ANIMATION_SCALE", "android.permission.SET_DEBUG_APP", "android.permission.SET_PREFERRED_APPLICATIONS", "android.permission.SET_PROCESS_LIMIT", "android.permission.SET_TIME_ZONE", "android.permission.SET_WALLPAPER", "android.permission.SIGNAL_PERSISTENT_PROCESSES", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.USE_CREDENTIALS", "android.permission.USE_SIP", "android.permission.VIBRATE", "android.permission.WAKE_LOCK", "android.permission.WRITE_SETTINGS", "android.permission.WRITE_SYNC_SETTINGS", "android.permission.WRITE_USER_DICTIONARY", "com.android.alarm.permission.SET_ALARM", "com.android.browser.permission.WRITE_HISTORY_BOOKMARKS", "com.android.launcher.permission.INSTALL_SHORTCUT", "com.android.launcher.permission.UNINSTALL_SHORTCUT", "com.android.vending.CHECK_LICENSE", "com.google.android.providers.gsf.permission.READ_GSERVICES"};
    public Map f11609r = null;
    public Set f11610s = null;
    public final Context f11611t;
    public final C2320a f11612u;
    public final C1461c f11613v;

    public C2363d(Context context, C2320a c2320a, C1461c c1461c) {
        this.f11611t = context;
        this.f11612u = c2320a;
        this.f11613v = c1461c;
    }

    public final C2362c m11994a(String[] strArr, Set set, boolean z) {
        return m11995a(strArr, set, z, false);
    }

    public final C2362c m11995a(String[] strArr, Set set, boolean z, boolean z2) {
        C2361b[] c2361bArr = new C2361b[17];
        if (strArr == null) {
            return new C2362c(c2361bArr, 16, false);
        }
        Set hashSet;
        boolean z3;
        Map b = m11997b();
        if (z) {
            hashSet = new HashSet(Arrays.asList(strArr));
            if (set != null) {
                hashSet.removeAll(set);
            }
            z3 = false;
        } else {
            boolean z4;
            if (set != null) {
                Set hashSet2 = new HashSet(Arrays.asList(strArr));
                hashSet2.removeAll(set);
                if (!m11992a(b.keySet(), hashSet2)) {
                    return new C2362c(c2361bArr, 16, false);
                }
                z4 = true;
            } else {
                z4 = false;
            }
            set = null;
            hashSet = new HashSet(Arrays.asList(strArr));
            z3 = z4;
        }
        m11990a(b, hashSet, z2, true, c2361bArr);
        if (set != null) {
            m11990a(b, set, z2, false, c2361bArr);
        }
        return new C2362c(c2361bArr, 16, z3);
    }

    public static void m11989a(C2127b c2127b, String str) {
        c2127b.mo2681f(str, 1);
    }

    public final boolean m11998b(C2127b c2127b, String str) {
        boolean z = true;
        C2129c a = c2127b.mo2657a(str);
        if (a == null || a.f10825s != 1) {
            z = false;
        }
        if (z) {
            return z;
        }
        C2322b a2 = this.f11612u.mo2854a(str);
        if (a2 != null) {
            return a2.f11422g;
        }
        return z;
    }

    private final boolean m11992a(Set set, Set set2) {
        for (String contains : set2) {
            if (set.contains(contains)) {
                return true;
            }
        }
        Set<String> hashSet = new HashSet(set2);
        hashSet.removeAll(set);
        for (String contains2 : hashSet) {
            if (m11991a(contains2)) {
                return true;
            }
        }
        return false;
    }

    private final void m11990a(Map map, Set set, boolean z, boolean z2, C2361b[] c2361bArr) {
        for (String str : set) {
            Integer num = (Integer) map.get(str);
            if (num == null) {
                boolean contains = m11996a().contains(str);
                if ((contains && z) || (!contains && m11991a(str))) {
                    num = Integer.valueOf(16);
                }
            }
            C2361b c2361b = c2361bArr[num.intValue()];
            if (c2361b == null) {
                c2361b = C2363d.m11988a(num.intValue());
                c2361bArr[num.intValue()] = c2361b;
            }
            C2361b c2361b2 = c2361b;
            CharSequence b = m11993b(str);
            if (!TextUtils.isEmpty(b)) {
                if (z2) {
                    c2361b2.f11588f.add(b);
                } else {
                    c2361b2.f11587e.add(b);
                }
            }
        }
    }

    private final boolean m11991a(String str) {
        try {
            PermissionInfo permissionInfo = this.f11611t.getPackageManager().getPermissionInfo(str, 0);
            if (permissionInfo != null && permissionInfo.protectionLevel == 1) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    private final String m11993b(String str) {
        String str2 = null;
        try {
            PermissionInfo permissionInfo = this.f11611t.getPackageManager().getPermissionInfo(str, 0);
            if (permissionInfo != null) {
                CharSequence loadLabel = permissionInfo.loadLabel(this.f11611t.getPackageManager());
                if (loadLabel != null) {
                    str2 = loadLabel.toString();
                }
            }
        } catch (NameNotFoundException e) {
        }
        return str2;
    }

    public final Set m11996a() {
        if (this.f11610s == null) {
            this.f11610s = new HashSet(Arrays.asList(f11608q));
            if (this.f11613v.dj().mo2294a(12607368)) {
                this.f11610s.remove("android.permission.SYSTEM_ALERT_WINDOW");
            }
        }
        return this.f11610s;
    }

    public final Map m11997b() {
        int i = 0;
        if (this.f11609r != null) {
            return this.f11609r;
        }
        Map hashMap = new HashMap();
        for (Object put : f11592a) {
            hashMap.put(put, Integer.valueOf(0));
        }
        for (Object put2 : f11593b) {
            hashMap.put(put2, Integer.valueOf(3));
        }
        for (Object put22 : f11595d) {
            hashMap.put(put22, Integer.valueOf(5));
        }
        for (Object put222 : f11594c) {
            hashMap.put(put222, Integer.valueOf(4));
        }
        for (Object put2222 : f11596e) {
            hashMap.put(put2222, Integer.valueOf(6));
        }
        for (Object put22222 : f11597f) {
            hashMap.put(put22222, Integer.valueOf(7));
        }
        for (Object put222222 : f11598g) {
            hashMap.put(put222222, Integer.valueOf(8));
        }
        for (Object put2222222 : f11599h) {
            hashMap.put(put2222222, Integer.valueOf(9));
        }
        for (Object put22222222 : f11600i) {
            hashMap.put(put22222222, Integer.valueOf(10));
        }
        for (Object put222222222 : f11601j) {
            hashMap.put(put222222222, Integer.valueOf(11));
        }
        for (Object put2222222222 : f11602k) {
            hashMap.put(put2222222222, Integer.valueOf(1));
        }
        for (Object put22222222222 : f11603l) {
            hashMap.put(put22222222222, Integer.valueOf(2));
        }
        for (Object put222222222222 : f11604m) {
            hashMap.put(put222222222222, Integer.valueOf(12));
        }
        for (Object put2222222222222 : f11605n) {
            hashMap.put(put2222222222222, Integer.valueOf(13));
        }
        for (Object put22222222222222 : f11606o) {
            hashMap.put(put22222222222222, Integer.valueOf(14));
        }
        String[] strArr = f11607p;
        int length = strArr.length;
        while (i < length) {
            hashMap.put(strArr[i], Integer.valueOf(15));
            i++;
        }
        this.f11609r = Collections.unmodifiableMap(hashMap);
        return this.f11609r;
    }

    public static C2361b m11988a(int i) {
        switch (i) {
            case 0:
                return new C2361b(0, C7582R.drawable.ic_perm_in_app_purchases, C7582R.string.permission_bucket_in_app_purchases_title, C7582R.string.permission_bucket_in_app_purchases_description);
            case 1:
                return new C2361b(1, C7582R.drawable.ic_perm_history, C7582R.string.permission_bucket_device_and_app_history_title, C7582R.string.permission_bucket_device_and_app_history_description);
            case 2:
                return new C2361b(2, C7582R.drawable.ic_perm_data_setting, C7582R.string.permission_bucket_redirect_internet_traffic_title, C7582R.string.permission_bucket_redirect_internet_traffic_description);
            case 3:
                return new C2361b(3, C7582R.drawable.ic_perm_identity, C7582R.string.permission_bucket_identity_title, C7582R.string.permission_bucket_identity_description);
            case 4:
                return new C2361b(4, C7582R.drawable.ic_perm_cal, C7582R.string.permission_bucket_calendar_title, C7582R.string.permission_bucket_calendar_description);
            case 5:
                return new C2361b(5, C7582R.drawable.ic_perm_contacts, C7582R.string.permission_bucket_contacts_title, C7582R.string.permission_bucket_contacts_description);
            case 6:
                return new C2361b(6, C7582R.drawable.ic_perm_location, C7582R.string.permission_bucket_location_title, C7582R.string.permission_bucket_location_description);
            case 7:
                return new C2361b(7, C7582R.drawable.ic_perm_messaging, C7582R.string.permission_bucket_sms_title, C7582R.string.permission_bucket_sms_description);
            case 8:
                return new C2361b(8, C7582R.drawable.ic_perm_phone, C7582R.string.permission_bucket_phone_title, C7582R.string.permission_bucket_phone_description);
            case 9:
                return new C2361b(9, C7582R.drawable.ic_perm_media, C7582R.string.permission_bucket_photos_media_files_title, C7582R.string.permission_bucket_photos_media_files_description);
            case 10:
                return new C2361b(10, C7582R.drawable.ic_perm_camera, C7582R.string.permission_bucket_camera_title, C7582R.string.permission_bucket_camera_description);
            case 11:
                return new C2361b(11, C7582R.drawable.ic_perm_microphone, C7582R.string.permission_bucket_mic_title, C7582R.string.permission_bucket_mic_description);
            case 12:
                return new C2361b(12, C7582R.drawable.ic_perm_scan_wifi, C7582R.string.permission_bucket_wifi_connection_info_title, C7582R.string.permission_bucket_wifi_connection_info_desc);
            case 13:
                return new C2361b(13, C7582R.drawable.ic_perm_bluetooth_discovery, C7582R.string.permission_bucket_bluetooth_connection_info_title, C7582R.string.permission_bucket_bluetooth_connection_info_desc);
            case 14:
                return new C2361b(14, C7582R.drawable.ic_perm_deviceid, C7582R.string.permission_bucket_device_id_and_call_information_title, C7582R.string.permission_bucket_device_id_and_call_information_description);
            case 15:
                return new C2361b(15, C7582R.drawable.ic_perm_body_motion, C7582R.string.permission_bucket_wearables_title, C7582R.string.permissions_bucket_wearables_description);
            case 16:
                return new C2361b(16, C7582R.drawable.ic_perm_unknown, C7582R.string.permission_bucket_other_title, C7582R.string.permission_bucket_other_description);
            default:
                throw new IllegalStateException("invalid permission bucket.");
        }
    }
}
