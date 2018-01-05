package com.google.android.finsky.bn;

import android.content.ContentValues;
import android.content.Intent;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a.a;
import com.google.android.finsky.installer.b.a.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.b.a;
import java.net.URISyntaxException;

public final class com.google.android.finsky.bn.e
{

    public final ContentValues a;
    public final String b;

    e(String p0) {
        this.a = new ContentValues();
        this.b = p0;
        this.a.put("package_name", p0);
    }

    private final int a(String p0, int p1) {
        if (this.a.containsKey(p0))
            p1 = this.a.getAsInteger(p0).intValue();
        return p1;
    }

    private final long a(String p0, long p1) {
        if (this.a.containsKey(p0))
            p1 = this.a.getAsLong(p0).longValue();
        return p1;
    }

    private final String a(String p0, String p1) {
        if (this.a.containsKey(p0))
            p1 = this.a.getAsString(p0);
        return p1;
    }

    private final String[] a(String p0, String[] p1) {
        if (this.a.containsKey(p0))
            p1 = com.google.android.finsky.utils.k.a(this.a.getAsString(p0));
        return p1;
    }

    public final com.google.android.finsky.bn.c a(com.google.android.finsky.bn.c p0) {
        if (p0 == 0) {
            p0 = new com.google.android.finsky.bn.c;
            p0.<init>(this.b);
        }
        try {
            if (this.a.containsKey("delivery_data"))
                v11 = com.google.wireless.android.finsky.b.a.a(this.a.getAsByteArray("delivery_data"));
            else {
                try {
                    v11 = p0.e;
                }
                catch (InvalidProtocolBufferNanoException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if (this.a.containsKey("app_details"))
                v37 = com.google.android.finsky.cv.a.n.a(this.a.getAsByteArray("app_details"));
            else
                v37 = p0.z;
            if (this.a.containsKey("install_logging_context"))
                v45 = com.google.android.finsky.d.a.a.a(this.a.getAsByteArray("install_logging_context"));
            else
                v45 = p0.E;
            if (this.a.containsKey("logging_context"))
                v46 = com.google.android.finsky.d.a.a.a(this.a.getAsByteArray("logging_context"));
            else
                v46 = p0.F;
            if (this.a.containsKey("install_request_data"))
                v53 = com.google.android.finsky.installer.b.a.d.a(this.a.getAsByteArray("install_request_data"));
            else
                v53 = p0.M;
        }
        catch (InvalidProtocolBufferNanoException ex) {
            throw new RuntimeException(ex);
        }
        if (this.a.containsKey("managed_configuration_token"))
            v34 = this.a.getAsByteArray("managed_configuration_token");
        else
            v34 = p0.x;
        if (this.a.containsKey("notification_intent")) {
            v4 = this.a.getAsString("notification_intent");
            try {
                v50 = Intent.parseUri(v4, 1);
            }
            catch (URISyntaxException ex) {
                v6 = new Object[1];
                v6[0] = FinskyLog.a(v4);
                FinskyLog.c("Error parsing WebAPK notification intent from uri: %s", v6);
                v50 = p0.J;
            }
            return new com.google.android.finsky.bn.c(p0.a, this.a("auto_update", p0.b), this.a("desired_version", p0.c), this.a("sandbox_version", p0.K), this.a("last_notified_version", p0.d), v11, this.a("delivery_data_timestamp_ms", p0.f), this.a("installer_state", p0.g), this.a("download_uri", p0.h), this.a("first_download_ms", p0.j), this.a("referrer", p0.k), this.a("continue_url", p0.n), this.a("account", p0.i), this.a("title", p0.l), this.a("flags", p0.m), this.a("last_update_timestamp_ms", p0.o), this.a("account_for_update", p0.p), this.a("external_referrer_timestamp_ms", p0.q), this.a("persistent_flags", p0.r), this.a("permissions_version", p0.s), this.a("delivery_token", p0.t), this.a("completed_split_ids", p0.u), this.a("active_split_id", p0.v), this.a("request_id", p0.w), v34, this.a("total_completed_bytes_downloaded", p0.y), v37, this.a("install_client_event_id", p0.A), this.a("last_client_event_id", p0.B), this.a("requesting_package_name", p0.C), this.a("update_discovered_timestamp_ms", p0.D), v45, v46, this.a("install_request_timestamp_ms", p0.G), this.a("desired_derived_apk_id", p0.I), v50, this.a("install_reason", p0.H), this.a("requested_modules", p0.L), v53);
            v6 = new Object[1];
            v6[0] = FinskyLog.a(v4);
            FinskyLog.c("Error parsing WebAPK notification intent from uri: %s", v6);
        }
        v50 = p0.J;
        return new com.google.android.finsky.bn.c(p0.a, this.a("auto_update", p0.b), this.a("desired_version", p0.c), this.a("sandbox_version", p0.K), this.a("last_notified_version", p0.d), v11, this.a("delivery_data_timestamp_ms", p0.f), this.a("installer_state", p0.g), this.a("download_uri", p0.h), this.a("first_download_ms", p0.j), this.a("referrer", p0.k), this.a("continue_url", p0.n), this.a("account", p0.i), this.a("title", p0.l), this.a("flags", p0.m), this.a("last_update_timestamp_ms", p0.o), this.a("account_for_update", p0.p), this.a("external_referrer_timestamp_ms", p0.q), this.a("persistent_flags", p0.r), this.a("permissions_version", p0.s), this.a("delivery_token", p0.t), this.a("completed_split_ids", p0.u), this.a("active_split_id", p0.v), this.a("request_id", p0.w), v34, this.a("total_completed_bytes_downloaded", p0.y), v37, this.a("install_client_event_id", p0.A), this.a("last_client_event_id", p0.B), this.a("requesting_package_name", p0.C), this.a("update_discovered_timestamp_ms", p0.D), v45, v46, this.a("install_request_timestamp_ms", p0.G), this.a("desired_derived_apk_id", p0.I), v50, this.a("install_reason", p0.H), this.a("requested_modules", p0.L), v53);
    }

    public final com.google.android.finsky.bn.e a() {
        this.a.put("desired_version", Integer.valueOf(-1));
        return this;
    }

    public final com.google.android.finsky.bn.e a(long p0) {
        this.a.put("update_discovered_timestamp_ms", Long.valueOf(p0));
        return this;
    }

    public final com.google.android.finsky.bn.e a(com.google.android.finsky.d.a.a p0) {
        this.a.put("logging_context", com.google.protobuf.nano.i.a(p0));
        return this;
    }

    public final com.google.android.finsky.bn.e b() {
        this.a.put("desired_derived_apk_id", Integer.valueOf(0));
        return this;
    }

}
