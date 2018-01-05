package com.google.android.finsky.stream.controllers.jpkrquicklinks.view;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C4436d extends C1137h {
    public final Context f22537c;
    public C4433a f22538d;
    public ad f22539e;
    public int f22540f;
    public List f22541g;

    public C4436d(Context context) {
        this.f22537c = context;
        this.f22540f = context.getResources().getDimensionPixelSize(C7582R.dimen.jpkr_min_quicklink_item_width);
    }

    public final int mo1039a() {
        if (this.f22541g != null) {
            return this.f22541g.size();
        }
        return 0;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        Object obj = ((C4438f) frVar).f22544t;
        C4435b c4435b = (C4435b) this.f22541g.get(i);
        ad adVar = this.f22539e;
        C4433a c4433a = this.f22538d;
        if (!(obj.f22529c == null || c4435b.f22536c == null)) {
            obj.f22527a.m9288a(obj.f22529c, c4435b.f22536c.f11860f, c4435b.f22536c.f11863i);
            if (c4435b.f22536c.m12248e()) {
                ImageView imageView = obj.f22529c;
                Object obj2 = c4435b.f22536c.f11871q;
                if (!TextUtils.isEmpty(obj2)) {
                    try {
                        imageView.setColorFilter(Color.parseColor(obj2));
                    } catch (IllegalArgumentException e) {
                        FinskyLog.m21669e("Invalid color for JpkrQuickLinksBannerItem icon tint: %s", obj2);
                    }
                }
            }
        }
        obj.f22528b.setText(c4435b.f22534a);
        obj.setContentDescription(c4435b.f22534a);
        C2482j.m13285a(obj.getPlayStoreUiElement(), c4435b.f22535b);
        obj.f22531e = adVar;
        obj.f22530d = i;
        obj.f22533g = c4433a;
        obj.getParentNode().mo1219a(obj);
        if (this.f22541g != null) {
            LayoutParams layoutParams = obj.getLayoutParams();
            if (layoutParams.width != this.f22540f) {
                layoutParams.width = this.f22540f;
                return;
            }
            return;
        }
        FinskyLog.m21669e("Trying to render an empty jpkrQuickLinks item", new Object[0]);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C4438f(LayoutInflater.from(this.f22537c).inflate(C7582R.layout.jpkr_quicklinks_banner_item, viewGroup, false));
    }
}
