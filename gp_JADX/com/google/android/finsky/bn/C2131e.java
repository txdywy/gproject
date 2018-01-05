package com.google.android.finsky.bn;

import android.content.ContentValues;
import android.content.Intent;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.b.a;
import java.net.URISyntaxException;

public final class C2131e {
    public final ContentValues f10834a = new ContentValues();
    public final String f10835b;

    public C2131e(String str) {
        this.f10835b = str;
        this.f10834a.put("package_name", str);
    }

    public final C2131e m11159a() {
        this.f10834a.put("desired_version", Integer.valueOf(-1));
        return this;
    }

    public final C2131e m11160a(long j) {
        this.f10834a.put("update_discovered_timestamp_ms", Long.valueOf(j));
        return this;
    }

    public final C2131e m11161a(C2470a c2470a) {
        this.f10834a.put("logging_context", C0757i.m4909a((C0757i) c2470a));
        return this;
    }

    public final C2131e m11162b() {
        this.f10834a.put("desired_derived_apk_id", Integer.valueOf(0));
        return this;
    }

    private final long m11155a(String str, long j) {
        if (this.f10834a.containsKey(str)) {
            return this.f10834a.getAsLong(str).longValue();
        }
        return j;
    }

    private final int m11154a(String str, int i) {
        if (this.f10834a.containsKey(str)) {
            return this.f10834a.getAsInteger(str).intValue();
        }
        return i;
    }

    private final String m11156a(String str, String str2) {
        if (this.f10834a.containsKey(str)) {
            return this.f10834a.getAsString(str);
        }
        return str2;
    }

    private final String[] m11157a(String str, String[] strArr) {
        if (this.f10834a.containsKey(str)) {
            return C4680k.m21818a(this.f10834a.getAsString(str));
        }
        return strArr;
    }

    public final C2129c m11158a(C2129c c2129c) {
        if (c2129c == null) {
            C2129c c2129c2 = new C2129c(this.f10835b);
        }
        try {
            a a;
            C2441n a2;
            C2470a a3;
            C2470a a4;
            C3314d a5;
            byte[] asByteArray;
            Intent parseUri;
            if (this.f10834a.containsKey("delivery_data")) {
                a = a.a(this.f10834a.getAsByteArray("delivery_data"));
            } else {
                a = c2129c.f10811e;
            }
            if (this.f10834a.containsKey("app_details")) {
                a2 = C2441n.m13098a(this.f10834a.getAsByteArray("app_details"));
            } else {
                a2 = c2129c.f10832z;
            }
            if (this.f10834a.containsKey("install_logging_context")) {
                a3 = C2470a.m13171a(this.f10834a.getAsByteArray("install_logging_context"));
            } else {
                a3 = c2129c.f10798E;
            }
            if (this.f10834a.containsKey("logging_context")) {
                a4 = C2470a.m13171a(this.f10834a.getAsByteArray("logging_context"));
            } else {
                a4 = c2129c.f10799F;
            }
            if (this.f10834a.containsKey("install_request_data")) {
                a5 = C3314d.m16660a(this.f10834a.getAsByteArray("install_request_data"));
            } else {
                a5 = c2129c.f10806M;
            }
            if (this.f10834a.containsKey("managed_configuration_token")) {
                asByteArray = this.f10834a.getAsByteArray("managed_configuration_token");
            } else {
                asByteArray = c2129c.f10830x;
            }
            int a6 = m11154a("auto_update", c2129c.f10808b);
            if (this.f10834a.containsKey("notification_intent")) {
                try {
                    parseUri = Intent.parseUri(this.f10834a.getAsString("notification_intent"), 1);
                } catch (URISyntaxException e) {
                    FinskyLog.m21665c("Error parsing WebAPK notification intent from uri: %s", FinskyLog.m21655a(r4));
                }
                return new C2129c(c2129c.f10807a, a6, m11154a("desired_version", c2129c.f10809c), m11154a("sandbox_version", c2129c.f10804K), m11154a("last_notified_version", c2129c.f10810d), a, m11155a("delivery_data_timestamp_ms", c2129c.f10812f), m11154a("installer_state", c2129c.f10813g), m11156a("download_uri", c2129c.f10814h), m11155a("first_download_ms", c2129c.f10816j), m11156a("referrer", c2129c.f10817k), m11156a("continue_url", c2129c.f10820n), m11156a("account", c2129c.f10815i), m11156a("title", c2129c.f10818l), m11154a("flags", c2129c.f10819m), m11155a("last_update_timestamp_ms", c2129c.f10821o), m11156a("account_for_update", c2129c.f10822p), m11155a("external_referrer_timestamp_ms", c2129c.f10823q), m11154a("persistent_flags", c2129c.f10824r), m11154a("permissions_version", c2129c.f10825s), m11156a("delivery_token", c2129c.f10826t), m11157a("completed_split_ids", c2129c.f10827u), m11156a("active_split_id", c2129c.f10828v), m11156a("request_id", c2129c.f10829w), asByteArray, m11155a("total_completed_bytes_downloaded", c2129c.f10831y), a2, m11155a("install_client_event_id", c2129c.f10794A), m11155a("last_client_event_id", c2129c.f10795B), m11156a("requesting_package_name", c2129c.f10796C), m11155a("update_discovered_timestamp_ms", c2129c.f10797D), a3, a4, m11155a("install_request_timestamp_ms", c2129c.f10800G), m11154a("desired_derived_apk_id", c2129c.f10802I), parseUri, m11156a("install_reason", c2129c.f10801H), m11157a("requested_modules", c2129c.f10805L), a5);
            }
            parseUri = c2129c.f10803J;
            return new C2129c(c2129c.f10807a, a6, m11154a("desired_version", c2129c.f10809c), m11154a("sandbox_version", c2129c.f10804K), m11154a("last_notified_version", c2129c.f10810d), a, m11155a("delivery_data_timestamp_ms", c2129c.f10812f), m11154a("installer_state", c2129c.f10813g), m11156a("download_uri", c2129c.f10814h), m11155a("first_download_ms", c2129c.f10816j), m11156a("referrer", c2129c.f10817k), m11156a("continue_url", c2129c.f10820n), m11156a("account", c2129c.f10815i), m11156a("title", c2129c.f10818l), m11154a("flags", c2129c.f10819m), m11155a("last_update_timestamp_ms", c2129c.f10821o), m11156a("account_for_update", c2129c.f10822p), m11155a("external_referrer_timestamp_ms", c2129c.f10823q), m11154a("persistent_flags", c2129c.f10824r), m11154a("permissions_version", c2129c.f10825s), m11156a("delivery_token", c2129c.f10826t), m11157a("completed_split_ids", c2129c.f10827u), m11156a("active_split_id", c2129c.f10828v), m11156a("request_id", c2129c.f10829w), asByteArray, m11155a("total_completed_bytes_downloaded", c2129c.f10831y), a2, m11155a("install_client_event_id", c2129c.f10794A), m11155a("last_client_event_id", c2129c.f10795B), m11156a("requesting_package_name", c2129c.f10796C), m11155a("update_discovered_timestamp_ms", c2129c.f10797D), a3, a4, m11155a("install_request_timestamp_ms", c2129c.f10800G), m11154a("desired_derived_apk_id", c2129c.f10802I), parseUri, m11156a("install_reason", c2129c.f10801H), m11157a("requested_modules", c2129c.f10805L), a5);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }
}
