package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.controllers.view.C4503a;
import com.squareup.leakcanary.C7582R;
import java.util.HashMap;
import java.util.Map;

public final class C3676f {
    public final Map f18569a = new HashMap();
    public int f18570b;

    public C3676f(Context context) {
        Resources resources = context.getResources();
        this.f18570b = resources.getDimensionPixelSize(C7582R.dimen.play_card_inset);
        C1611k av = C1473m.f7980a.av();
        C3678h c3678h = new C3678h(av.m9279d(resources), av.m9280e(resources));
        this.f18569a.put(Integer.valueOf(C7582R.layout.flat_card_mini), c3678h);
        this.f18569a.put(Integer.valueOf(C7582R.layout.flat_card_mini_lite), c3678h);
        int e = C1473m.f7980a.av().m9280e(resources);
        C3679i c3679i = new C3679i(resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_mixed_content_thumbnail_height) + e, e + resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_mixed_content_thumbnail_height_tall));
        this.f18569a.put(Integer.valueOf(C7582R.layout.flat_card_mini_multi_aspect_ratio), c3679i);
        this.f18569a.put(Integer.valueOf(C7582R.layout.flat_card_mini_multi_aspect_ratio_lite), c3679i);
        e = resources.getDimensionPixelSize(C7582R.dimen.flat_avatar_card_content_height);
        this.f18569a.put(Integer.valueOf(C7582R.layout.flat_card_avatar), new C3683m(resources.getDimensionPixelSize(C7582R.dimen.flat_avatar_card_side_padding), e));
        e = resources.getDimensionPixelSize(C7582R.dimen.quicklinks_pill_content_min_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_quicklinks_pill_top_padding);
        e = (e + dimensionPixelSize) + resources.getDimensionPixelSize(C7582R.dimen.flat_quicklinks_pill_bottom_padding);
        this.f18569a.put(Integer.valueOf(C7582R.layout.play_quicklinks_banner_pill_item), new C3684n(e, e + resources.getDimensionPixelSize(C7582R.dimen.quicklinks_banner_vpadding)));
        this.f18569a.put(Integer.valueOf(C7582R.layout.play_card_mini), new C3677g(this, C1473m.f7980a.av().m9282g(resources), resources.getDimensionPixelSize(C7582R.dimen.play_mini_card_content_height), resources.getDimensionPixelSize(C7582R.dimen.play_mini_card_thumbnail_padding)));
        this.f18569a.put(Integer.valueOf(C7582R.layout.play_card_small), new C3680j(this, resources.getDimensionPixelSize(C7582R.dimen.play_small_card_content_min_height), resources.getDimensionPixelSize(C7582R.dimen.play_featured_grid_image_margin)));
        this.f18569a.put(Integer.valueOf(C7582R.layout.play_card_medium), new C3681k(this));
        this.f18569a.put(Integer.valueOf(C7582R.layout.play_card_artist), new C3682l(this, resources.getDimensionPixelSize(C7582R.dimen.play_artist_card_content_height)));
        TypedValue typedValue = new TypedValue();
        resources.getValue(C7582R.dimen.entertainment_story_peeking_card_min, typedValue, true);
        float f = typedValue.getFloat();
        resources.getValue(C7582R.dimen.entertainment_story_peeking_card_max, typedValue, true);
        float f2 = typedValue.getFloat();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.pe__card_margin_bottom);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C7582R.dimen.entertainment_story_card_width);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(C7582R.dimen.entertainment_story_card_width_deviation);
        this.f18569a.put(Integer.valueOf(C7582R.layout.card_story), new C4503a((float) (C1611k.m9270l(resources) - C1473m.f7980a.av().m9275a(resources)), this.f18570b, dimensionPixelSize2, f, f2, dimensionPixelSize3, dimensionPixelSize4));
        this.f18569a.put(Integer.valueOf(C7582R.layout.card_story_single), new C4503a(this.f18570b, dimensionPixelSize2));
    }

    public final C1164b m17439a(int i) {
        return (C1164b) this.f18569a.get(Integer.valueOf(i));
    }
}
