package com.google.android.gms.phenotype.core.p305b;

import com.google.android.libraries.p321b.p322a.C5847c;
import com.google.android.libraries.p321b.p322a.C5854j;

public final class C5515a {
    public static final C5854j f28343a;
    public static final C5847c f28344b = C5847c.m27273a(f28343a, "max_users_to_sync", 20);
    public static final C5847c f28345c = C5847c.m27273a(f28343a, "vacuum_change_count_mod", 1000);
    public static final C5847c f28346d = C5847c.m27274a(f28343a, "enable_sync_after_oneoff", true);
    public static final C5847c f28347e = C5847c.m27274a(f28343a, "enable_verbose_syncer_logging", false);
    public static final C5847c f28348f = C5847c.m27274a(f28343a, "debug_allow_http", false);
    public static final C5847c f28349g = C5847c.m27274a(f28343a, "debug_clear_heterodyne_tag", false);
    public static C5847c f28350h = C5847c.m27274a(f28343a, "allow_cross_diversion_and_logging", false);
    public static final C5847c f28351i = C5847c.m27274a(f28343a, "enable_flag_deltas", true);

    static {
        C5854j c5854j = new C5854j("com.google.android.gms.phenotype.core");
        String str = "gms:phenotype:";
        if (c5854j.f29354e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        C5854j c5854j2 = new C5854j(c5854j.f29350a, c5854j.f29351b, str, c5854j.f29353d, c5854j.f29354e, c5854j.f29355f);
        f28343a = c5854j2;
        C5847c.m27273a(c5854j2, "max_sync_redirects", 10);
    }
}
