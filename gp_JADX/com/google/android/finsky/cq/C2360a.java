package com.google.android.finsky.cq;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PermissionInfo;
import android.text.TextUtils;
import com.google.android.finsky.utils.C4680k;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class C2360a {
    public static final String[] f11572a = new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
    public static final String[] f11573b = new String[]{"android.permission.CAMERA"};
    public static final String[] f11574c = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    public static final String[] f11575d = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "com.google.android.gms.permission.CAR_SPEED"};
    public static final String[] f11576e = new String[]{"android.permission.RECORD_AUDIO"};
    public static final String[] f11577f = new String[]{"android.permission.CALL_PHONE", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.USE_SIP", "android.permission.WRITE_CALL_LOG", "com.android.voicemail.permission.ADD_VOICEMAIL"};
    public static final String[] f11578g = new String[]{"android.permission.BODY_SENSORS"};
    public static final String[] f11579h = new String[]{"android.permission.READ_SMS", "android.permission.READ_CELL_BROADCASTS", "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_WAP_PUSH", "android.permission.SEND_SMS"};
    public static final String[] f11580i = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public Map f11581j = null;
    public final Context f11582k;

    public C2360a(Context context) {
        this.f11582k = context;
    }

    public final C2362c m11984a(String[] strArr, Set set) {
        C2361b[] c2361bArr = new C2361b[10];
        if (strArr == null) {
            return new C2362c(c2361bArr, 9, false);
        }
        Map map;
        if (this.f11581j != null) {
            map = this.f11581j;
        } else {
            Map hashMap = new HashMap();
            for (Object put : f11573b) {
                hashMap.put(put, Integer.valueOf(1));
            }
            for (Object put2 : f11572a) {
                hashMap.put(put2, Integer.valueOf(0));
            }
            for (Object put22 : f11574c) {
                hashMap.put(put22, Integer.valueOf(2));
            }
            for (Object put222 : f11575d) {
                hashMap.put(put222, Integer.valueOf(3));
            }
            for (Object put2222 : f11576e) {
                hashMap.put(put2222, Integer.valueOf(4));
            }
            for (Object put22222 : f11577f) {
                hashMap.put(put22222, Integer.valueOf(5));
            }
            for (Object put222222 : f11578g) {
                hashMap.put(put222222, Integer.valueOf(6));
            }
            for (Object put2222222 : f11579h) {
                hashMap.put(put2222222, Integer.valueOf(7));
            }
            for (Object put22222222 : f11580i) {
                hashMap.put(put22222222, Integer.valueOf(8));
            }
            this.f11581j = Collections.unmodifiableMap(hashMap);
            map = this.f11581j;
        }
        Set hashSet = new HashSet(Arrays.asList(strArr));
        if (set != null) {
            hashSet.removeAll(set);
        }
        m11983a(map, hashSet, true, c2361bArr);
        if (set != null) {
            m11983a(map, set, false, c2361bArr);
        }
        return new C2362c(c2361bArr, 9, false);
    }

    private final void m11983a(Map map, Set set, boolean z, C2361b[] c2361bArr) {
        String[] a = C4680k.m21818a(null);
        for (String str : set) {
            PermissionInfo permissionInfo;
            PermissionInfo permissionInfo2 = null;
            try {
                permissionInfo = this.f11582k.getPackageManager().getPermissionInfo(str, 0);
            } catch (NameNotFoundException e) {
                permissionInfo = permissionInfo2;
            }
            if (permissionInfo != null) {
                Integer num = (Integer) map.get(str);
                if (num == null) {
                    if ((permissionInfo.protectionLevel & 15) != 2 || "android.permission.SYSTEM_ALERT_WINDOW".equals(str)) {
                        Object obj;
                        Object obj2 = -1;
                        switch (str.hashCode()) {
                            case -1875779388:
                                if (str.equals("android.permission.USE_CREDENTIALS")) {
                                    obj2 = 11;
                                    break;
                                }
                                break;
                            case -1579322816:
                                if (str.equals("android.permission.MANAGE_ACCOUNTS")) {
                                    obj2 = 10;
                                    break;
                                }
                                break;
                            case -990672155:
                                if (str.equals("android.permission.SUBSCRIBED_FEEDS_READ")) {
                                    obj2 = 12;
                                    break;
                                }
                                break;
                            case -781522144:
                                if (str.equals("android.permission.READ_PROFILE")) {
                                    obj2 = null;
                                    break;
                                }
                                break;
                            case -641052592:
                                if (str.equals("android.permission.SUBSCRIBED_FEEDS_WRITE")) {
                                    obj2 = 13;
                                    break;
                                }
                                break;
                            case -627735856:
                                if (str.equals("android.permission.AUTHENTICATE_ACCOUNTS")) {
                                    obj2 = 9;
                                    break;
                                }
                                break;
                            case -558143690:
                                if (str.equals("com.android.browser.permission.READ_HISTORY_BOOKMARKS")) {
                                    obj2 = 7;
                                    break;
                                }
                                break;
                            case -378524462:
                                if (str.equals("android.permission.WRITE_SOCIAL_STREAM")) {
                                    obj2 = 3;
                                    break;
                                }
                                break;
                            case -145653303:
                                if (str.equals("android.permission.WRITE_PROFILE")) {
                                    obj2 = 1;
                                    break;
                                }
                                break;
                            case 169397625:
                                if (str.equals("android.permission.WRITE_SMS")) {
                                    obj2 = 6;
                                    break;
                                }
                                break;
                            case 827276746:
                                if (str.equals("android.permission.WRITE_USER_DICTIONARY")) {
                                    obj2 = 5;
                                    break;
                                }
                                break;
                            case 1261142821:
                                if (str.equals("com.android.browser.permission.WRITE_HISTORY_BOOKMARKS")) {
                                    obj2 = 8;
                                    break;
                                }
                                break;
                            case 1462853665:
                                if (str.equals("android.permission.READ_USER_DICTIONARY")) {
                                    obj2 = 4;
                                    break;
                                }
                                break;
                            case 1968503017:
                                if (str.equals("android.permission.READ_SOCIAL_STREAM")) {
                                    obj2 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (obj2) {
                            case null:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                obj = 1;
                                break;
                            default:
                                for (String equals : a) {
                                    if (equals.equals(str)) {
                                        obj = 1;
                                        break;
                                    }
                                }
                                obj = null;
                                break;
                        }
                        if (obj == null) {
                            num = Integer.valueOf(9);
                        } else {
                            continue;
                        }
                    }
                }
                C2361b c2361b = c2361bArr[num.intValue()];
                if (c2361b == null) {
                    switch (num.intValue()) {
                        case 0:
                            c2361b = new C2361b(0, C7582R.drawable.ic_perm_cal, C7582R.string.optional_permission_bucket_calendar_title, C7582R.string.optional_permission_bucket_calendar_description);
                            break;
                        case 1:
                            c2361b = new C2361b(1, C7582R.drawable.ic_perm_camera, C7582R.string.optional_permission_bucket_camera_title, C7582R.string.optional_permission_bucket_camera_description);
                            break;
                        case 2:
                            c2361b = new C2361b(2, C7582R.drawable.ic_perm_contacts, C7582R.string.optional_permission_bucket_contacts_title, C7582R.string.optional_permission_bucket_contacts_description);
                            break;
                        case 3:
                            c2361b = new C2361b(3, C7582R.drawable.ic_perm_location, C7582R.string.optional_permission_bucket_location_title, C7582R.string.optional_permission_bucket_location_description);
                            break;
                        case 4:
                            c2361b = new C2361b(4, C7582R.drawable.ic_perm_microphone, C7582R.string.optional_permission_bucket_mic_title, C7582R.string.optional_permission_bucket_mic_description);
                            break;
                        case 5:
                            c2361b = new C2361b(5, C7582R.drawable.ic_perm_phone, C7582R.string.optional_permission_bucket_phone_title, C7582R.string.optional_permission_bucket_phone_description);
                            break;
                        case 6:
                            c2361b = new C2361b(6, C7582R.drawable.ic_perm_body_motion, C7582R.string.optional_permission_bucket_sensors_title, C7582R.string.optional_permission_bucket_sensors_description);
                            break;
                        case 7:
                            c2361b = new C2361b(7, C7582R.drawable.ic_perm_messaging, C7582R.string.optional_permission_bucket_sms_title, C7582R.string.optional_permission_bucket_sms_description);
                            break;
                        case 8:
                            c2361b = new C2361b(8, C7582R.drawable.ic_perm_media, C7582R.string.optional_permission_bucket_storage_title, C7582R.string.optional_permission_bucket_storage_description);
                            break;
                        case 9:
                            c2361b = new C2361b(9, C7582R.drawable.ic_perm_unknown, C7582R.string.optional_permission_bucket_other_title, C7582R.string.optional_permission_bucket_other_description);
                            break;
                        default:
                            throw new IllegalStateException("invalid permission bucket.");
                    }
                    c2361bArr[num.intValue()] = c2361b;
                }
                CharSequence loadLabel = permissionInfo.loadLabel(this.f11582k.getPackageManager());
                loadLabel = loadLabel == null ? null : loadLabel.toString();
                if (!TextUtils.isEmpty(loadLabel)) {
                    if (z) {
                        c2361b.f11588f.add(loadLabel);
                    } else {
                        c2361b.f11587e.add(loadLabel);
                    }
                }
            }
        }
    }
}
