package com.google.android.finsky.bg;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.squareup.leakcanary.C7582R;

public final class C1611k {
    public final Context f8527a;
    public final C1461c f8528b;
    public final C1503a f8529c;
    public float f8530d;

    public C1611k(Context context, C1461c c1461c, C1503a c1503a) {
        this.f8527a = context;
        this.f8528b = c1461c;
        this.f8529c = c1503a;
    }

    public final int m9275a(Resources resources) {
        C1552e dj = this.f8528b.dj();
        if (!dj.mo2294a(12631598)) {
            return resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_edge_margin);
        }
        if (dj.mo2294a(12632714)) {
            return resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_edge_margin_large_tablet);
        }
        return resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_edge_margin_v2);
    }

    public static int m9269b(Resources resources) {
        return (C1611k.m9270l(resources) - resources.getDimensionPixelSize(C7582R.dimen.width_for_fixed_width_pages)) / 2;
    }

    public final int m9278c(Resources resources) {
        if (this.f8528b.dj().mo2294a(12631598)) {
            return resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_content_xpadding_v2);
        }
        return resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_content_xpadding);
    }

    public final int m9279d(Resources resources) {
        if (this.f8528b.dj().mo2294a(12631598)) {
            return resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_side_padding_v2);
        }
        return resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_side_padding);
    }

    public final int m9280e(Resources resources) {
        if (this.f8528b.dj().mo2294a(12632714)) {
            return resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_content_min_height_large_tablet);
        }
        return resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_content_min_height);
    }

    public final int m9281f(Resources resources) {
        return C1611k.m9270l(resources) - (m9275a(resources) * 2);
    }

    public final int m9282g(Resources resources) {
        if (!resources.getBoolean(C7582R.bool.play_dynamic_column_count)) {
            return resources.getInteger(C7582R.integer.mw_play_featured_grid_width);
        }
        return Math.min(((int) (((double) m9281f(resources)) * 1.0d)) / resources.getDimensionPixelSize(C7582R.dimen.mw_play_column_min_size), 5);
    }

    public final int m9283h(Resources resources) {
        if (resources.getBoolean(C7582R.bool.play_dynamic_column_count)) {
            return Math.min(m9281f(resources) / resources.getDimensionPixelSize(C7582R.dimen.mw_play_column_min_size), 5);
        }
        return resources.getInteger(C7582R.integer.mw_play_regular_grid_width);
    }

    public final int m9284i(Resources resources) {
        int integer;
        C1552e dj = this.f8528b.dj();
        if (dj.mo2294a(12632714)) {
            integer = resources.getInteger(C7582R.integer.flat_grid_column_count_large_tablet);
        } else {
            integer = resources.getInteger(C7582R.integer.flat_grid_column_count);
        }
        if (!dj.mo2294a(12630054)) {
            return integer;
        }
        if (dj.mo2294a(12632714)) {
            return resources.getInteger(C7582R.integer.flat_grid_less_dense_column_count_large_tablet);
        }
        return resources.getInteger(C7582R.integer.flat_grid_less_dense_column_count);
    }

    public final float m9273a() {
        if (this.f8528b.dj().mo2294a(12636089) && this.f8529c.f8184h) {
            return 0.0f;
        }
        return 0.25f;
    }

    public final boolean m9285j(Resources resources) {
        return this.f8528b.dj().mo2294a(12636865) && resources.getBoolean(C7582R.bool.use_fixed_width_pages);
    }

    public final boolean m9286k(Resources resources) {
        boolean z = resources.getBoolean(C7582R.bool.use_wide_layout);
        if (this.f8528b.dj().mo2294a(12636865)) {
            return z && !m9285j(resources);
        } else {
            return z;
        }
    }

    public static int m9268a(int i, Resources resources) {
        return (int) ((resources.getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public static int m9270l(Resources resources) {
        return C1611k.m9268a(resources.getConfiguration().screenWidthDp, resources);
    }

    public static int m9271m(Resources resources) {
        return C1611k.m9268a(resources.getConfiguration().screenHeightDp, resources);
    }

    public static boolean m9272n(Resources resources) {
        return C1611k.m9271m(resources) > C1611k.m9270l(resources);
    }

    public final int m9274a(Context context, int i) {
        if (this.f8530d == 0.0f) {
            this.f8530d = context.getResources().getDisplayMetrics().density;
        }
        return Math.round(((float) i) / this.f8530d);
    }

    public final int m9276b() {
        return this.f8527a.getResources().getDisplayMetrics().widthPixels;
    }

    public final int m9277c() {
        return this.f8527a.getResources().getDisplayMetrics().heightPixels;
    }
}
