package com.google.android.finsky.p111d;

import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.DfeServerError;
import com.google.android.volley.DisplayMessageError;

public final class aj {
    public static void m13208a(C2474c c2474c, VolleyError volleyError, boolean z) {
        if (volleyError.f4022b == null || volleyError.f4022b.f4166a == 0) {
            int i;
            if (volleyError instanceof AuthFailureError) {
                i = 1400;
            } else if (volleyError instanceof DisplayMessageError) {
                if (volleyError instanceof DfeServerError) {
                    i = 1402;
                } else {
                    i = 1401;
                }
            } else if (volleyError instanceof NetworkError) {
                if (volleyError instanceof NoConnectionError) {
                    i = 1404;
                } else {
                    i = 1403;
                }
            } else if (volleyError instanceof ParseError) {
                i = 1405;
            } else if (volleyError instanceof ServerError) {
                i = 1406;
            } else if (volleyError instanceof TimeoutError) {
                i = 1407;
            } else {
                i = 1408;
            }
            c2474c.m13254g(i);
            if (z) {
                c2474c.m13210a(i);
                return;
            }
            return;
        }
        c2474c.m13211a(1409, volleyError.f4022b.f4166a);
        if (z) {
            c2474c.m13210a(volleyError.f4022b.f4166a);
        }
    }

    public static int m13207a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = -1;
        switch (str.hashCode()) {
            case -2088484725:
                if (str.equals("wifi_checker")) {
                    i = 13;
                    break;
                }
                break;
            case -1961831250:
                if (str.equals("arc_install")) {
                    i = 25;
                    break;
                }
                break;
            case -1943929292:
                if (str.equals("SplitInstallService")) {
                    i = 29;
                    break;
                }
                break;
            case -1810908213:
                if (str.equals("wear_auto_install")) {
                    i = 17;
                    break;
                }
                break;
            case -1548602792:
                if (str.equals("package_update_service")) {
                    i = 22;
                    break;
                }
                break;
            case -1547904740:
                if (str.equals("self_update")) {
                    i = 14;
                    break;
                }
                break;
            case -1376052071:
                if (str.equals("wear_auto_update")) {
                    i = 16;
                    break;
                }
                break;
            case -1186110119:
                if (str.equals("auto_update")) {
                    i = 5;
                    break;
                }
                break;
            case -873960490:
                if (str.equals("tickle")) {
                    i = 8;
                    break;
                }
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    i = 0;
                    break;
                }
                break;
            case -154886447:
                if (str.equals("content_dependency")) {
                    i = 18;
                    break;
                }
                break;
            case -129798419:
                if (str.equals("gms_core_update_service")) {
                    i = 23;
                    break;
                }
                break;
            case -26291381:
                if (str.equals("dependency")) {
                    i = 3;
                    break;
                }
                break;
            case 123399022:
                if (str.equals("bulk_install")) {
                    i = 2;
                    break;
                }
                break;
            case 210365590:
                if (str.equals("bulk_update")) {
                    i = 4;
                    break;
                }
                break;
            case 267487396:
                if (str.equals("single_install")) {
                    i = 1;
                    break;
                }
                break;
            case 330290102:
                if (str.equals("restore_vpa")) {
                    i = 11;
                    break;
                }
                break;
            case 390621846:
                if (str.equals("rapid_auto_update")) {
                    i = 6;
                    break;
                }
                break;
            case 678919953:
                if (str.equals("isotope_install")) {
                    i = 24;
                    break;
                }
                break;
            case 688818723:
                if (str.equals("daily_hygiene")) {
                    i = 12;
                    break;
                }
                break;
            case 838565350:
                if (str.equals("device_owner_install")) {
                    i = 27;
                    break;
                }
                break;
            case 1040700328:
                if (str.equals("su_notification")) {
                    i = 20;
                    break;
                }
                break;
            case 1097519758:
                if (str.equals("restore")) {
                    i = 10;
                    break;
                }
                break;
            case 1260116636:
                if (str.equals("maintenance_window")) {
                    i = 28;
                    break;
                }
                break;
            case 1315766948:
                if (str.equals("webapk_install")) {
                    i = 26;
                    break;
                }
                break;
            case 1370510537:
                if (str.equals("suicidal_tabsky")) {
                    i = 9;
                    break;
                }
                break;
            case 1378851109:
                if (str.equals("early_update")) {
                    i = 7;
                    break;
                }
                break;
            case 1433842815:
                if (str.equals("self_update_v2")) {
                    i = 15;
                    break;
                }
                break;
            case 1613403910:
                if (str.equals("su_daily_hygiene")) {
                    i = 19;
                    break;
                }
                break;
            case 2135358289:
                if (str.equals("su_notification_retry")) {
                    i = 21;
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            default:
                return 0;
        }
    }
}
