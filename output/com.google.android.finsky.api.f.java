package com.google.android.finsky.api;

import com.google.android.play.utils.b.a;
import java.util.concurrent.TimeUnit;

static class com.google.android.finsky.api.f
{

    public static final com.google.android.play.utils.b.a A;
    public static final com.google.android.play.utils.b.a B;
    public static final com.google.android.play.utils.b.a C;
    public static final com.google.android.play.utils.b.a D;
    public static final com.google.android.play.utils.b.a E;
    public static final com.google.android.play.utils.b.a F;
    public static final com.google.android.play.utils.b.a G;
    public static final com.google.android.play.utils.b.a H;
    public static final com.google.android.play.utils.b.a I;
    public static final com.google.android.play.utils.b.a J;
    public static final com.google.android.play.utils.b.a K;
    public static final com.google.android.play.utils.b.a L;
    public static final com.google.android.play.utils.b.a M;
    public static final com.google.android.play.utils.b.a N;
    public static final com.google.android.play.utils.b.a O;
    public static final com.google.android.play.utils.b.a P;
    public static final com.google.android.play.utils.b.a Q;
    public static final com.google.android.play.utils.b.a R;
    public static final com.google.android.play.utils.b.a S;
    public static final com.google.android.play.utils.b.a T;
    public static final com.google.android.play.utils.b.a U;
    public static final com.google.android.play.utils.b.a a;
    public static final com.google.android.play.utils.b.a b;
    public static final com.google.android.play.utils.b.a c;
    public static final com.google.android.play.utils.b.a d;
    public static final com.google.android.play.utils.b.a e;
    public static final com.google.android.play.utils.b.a f;
    public static final com.google.android.play.utils.b.a g;
    public static final com.google.android.play.utils.b.a h;
    public static final com.google.android.play.utils.b.a i;
    public static final com.google.android.play.utils.b.a j;
    public static final com.google.android.play.utils.b.a k;
    public static final com.google.android.play.utils.b.a l;
    public static final com.google.android.play.utils.b.a m;
    public static final com.google.android.play.utils.b.a n;
    public static final com.google.android.play.utils.b.a o;
    public static final com.google.android.play.utils.b.a p;
    public static final com.google.android.play.utils.b.a q;
    public static final com.google.android.play.utils.b.a r;
    public static final com.google.android.play.utils.b.a s;
    public static final com.google.android.play.utils.b.a t;
    public static final com.google.android.play.utils.b.a u;
    public static final com.google.android.play.utils.b.a v;
    public static final com.google.android.play.utils.b.a w;
    public static final com.google.android.play.utils.b.a x;
    public static final com.google.android.play.utils.b.a y;
    public static final com.google.android.play.utils.b.a z;

    static {
        com.google.android.finsky.api.f.a = com.google.android.play.utils.b.a.a("finsky.mcc_mnc_override", 0);
        com.google.android.finsky.api.f.b = com.google.android.play.utils.b.a.a("finsky.proto_log_url_regexp", ".*");
        com.google.android.finsky.api.f.c = com.google.android.play.utils.b.a.a("finsky.send_public_android_id_in_requests_for_rads", Boolean.valueOf(1));
        com.google.android.finsky.api.f.d = com.google.android.play.utils.b.a.a("finsky.send_ad_id_in_requests_for_rads", Boolean.valueOf(1));
        com.google.android.finsky.api.f.e = com.google.android.play.utils.b.a.a("finsky.dfe_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.f = com.google.android.play.utils.b.a.a("finsky.dfe_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.g = com.google.android.play.utils.b.a.a("finsky.ip_country_override", 0);
        com.google.android.finsky.api.f.h = com.google.android.play.utils.b.a.b("logging_id2", "");
        com.google.android.finsky.api.f.i = com.google.android.play.utils.b.a.a("finsky.acquire_default_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(35)));
        com.google.android.finsky.api.f.j = com.google.android.play.utils.b.a.a("finsky.acquire_default_max_retry_attempts", Integer.valueOf(0));
        com.google.android.finsky.api.f.k = com.google.android.play.utils.b.a.a("finsky.acquire_default_back_off_multiplier", Float.valueOf(0));
        com.google.android.finsky.api.f.l = com.google.android.play.utils.b.a.a("finsky.purchase_status_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(35)));
        com.google.android.finsky.api.f.m = com.google.android.play.utils.b.a.a("finsky.age_verification_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(35)));
        com.google.android.finsky.api.f.n = com.google.android.play.utils.b.a.a("finsky.backup_devices_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(15)));
        com.google.android.finsky.api.f.o = com.google.android.play.utils.b.a.a("finsky.backup_devices_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.p = com.google.android.play.utils.b.a.a("finsky.backup_devices_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.q = com.google.android.play.utils.b.a.a("finsky.backup_documents_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(15)));
        com.google.android.finsky.api.f.r = com.google.android.play.utils.b.a.a("finsky.backup_documents_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.s = com.google.android.play.utils.b.a.a("finsky.backup_documents_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.t = com.google.android.play.utils.b.a.a("finsky.bulk_details_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(30)));
        com.google.android.finsky.api.f.u = com.google.android.play.utils.b.a.a("finsky.bulk_details_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.v = com.google.android.play.utils.b.a.a("finsky.bulk_details_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.w = com.google.android.play.utils.b.a.a("finsky.sku_details_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(30)));
        com.google.android.finsky.api.f.x = com.google.android.play.utils.b.a.a("finsky.sku_details_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.y = com.google.android.play.utils.b.a.a("finsky.sku_details_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.z = com.google.android.play.utils.b.a.a("finsky.replicate_library_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(30)));
        com.google.android.finsky.api.f.A = com.google.android.play.utils.b.a.a("finsky.replicate_library_max_retries", Integer.valueOf(0));
        com.google.android.finsky.api.f.B = com.google.android.play.utils.b.a.a("finsky.replicate_library_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.C = com.google.android.play.utils.b.a.a("finsky.early_update_timeout_ms", Integer.valueOf(2500));
        com.google.android.finsky.api.f.D = com.google.android.play.utils.b.a.a("finsky.early_update_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.E = com.google.android.play.utils.b.a.a("finsky.early_update_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.F = com.google.android.play.utils.b.a.a("finsky.ad_click_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(10)));
        com.google.android.finsky.api.f.G = com.google.android.play.utils.b.a.a("finsky.update_testing_program_opt_status_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(30)));
        com.google.android.finsky.api.f.H = com.google.android.play.utils.b.a.a("finsky.skip_all_caches", Boolean.valueOf(0));
        com.google.android.finsky.api.f.I = com.google.android.play.utils.b.a.a("finsky.show_staging_data", Boolean.valueOf(0));
        com.google.android.finsky.api.f.J = com.google.android.play.utils.b.a.a("finsky.prex_disabled", Boolean.valueOf(0));
        com.google.android.finsky.api.f.K = com.google.android.play.utils.b.a.a("finsky.vouchers_in_details_requests_enabled", Boolean.valueOf(1));
        com.google.android.finsky.api.f.L = com.google.android.play.utils.b.a.a("finsky.max_vouchers_in_details_request", Integer.valueOf(25));
        com.google.android.finsky.api.f.M = com.google.android.play.utils.b.a.a("finsky.consistency_token_enabled", Boolean.valueOf(1));
        com.google.android.finsky.api.f.N = com.google.android.play.utils.b.a.a("finsky.content_filter_settings_response_ttl_ms", Long.valueOf(TimeUnit.DAYS.toMillis(7)));
        com.google.android.finsky.api.f.O = com.google.android.play.utils.b.a.a("finsky.purchase_manager_ees_suffix", "PhoneskyPM");
        com.google.android.finsky.api.f.P = com.google.android.play.utils.b.a.a("finsky.preloads_timeout_ms", Integer.valueOf((int)TimeUnit.SECONDS.toMillis(10)));
        com.google.android.finsky.api.f.Q = com.google.android.play.utils.b.a.a("finsky.preloads_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.R = com.google.android.play.utils.b.a.a("finsky.preloads_backoff_multiplier", Float.valueOf(1065353216));
        com.google.android.finsky.api.f.S = com.google.android.play.utils.b.a.a("finsky.managed_configuration_timeout_ms", Integer.valueOf(2500));
        com.google.android.finsky.api.f.T = com.google.android.play.utils.b.a.a("finsky.managed_configuration_max_retries", Integer.valueOf(1));
        com.google.android.finsky.api.f.U = com.google.android.play.utils.b.a.a("finsky.managed_configuration_backoff_multiplier", Float.valueOf(1065353216));
    }

}
