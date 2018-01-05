package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

final class C2593t extends C1137h {
    public final ScreenshotsRecyclerView f13800c;
    public final List f13801d;
    public boolean f13802e;
    public boolean f13803f;
    public String f13804g;
    public int f13805h;
    public ad f13806i;
    public C1058q f13807j;
    public C2577b f13808k;
    public C1612l f13809l;
    public boolean f13810m = true;
    public boolean f13811n = true;

    public C2593t(ScreenshotsRecyclerView screenshotsRecyclerView, boolean z, boolean z2, String str, int i, List list, ad adVar, C1058q c1058q, C2577b c2577b, C1612l c1612l) {
        this.f13800c = screenshotsRecyclerView;
        this.f13801d = new ArrayList(list);
        this.f13802e = z;
        this.f13803f = z2;
        this.f13804g = str;
        this.f13805h = i;
        this.f13806i = adVar;
        this.f13807j = c1058q;
        this.f13808k = c2577b;
        this.f13809l = c1612l;
        for (C2591r c2591r : this.f13801d) {
            bd bdVar = c2591r.f13796a;
            if (bdVar.f11859e == null || bdVar.f11859e.f11879c == 0 || bdVar.f11859e.f11878b == 0) {
                this.f13811n = false;
            } else if (bdVar.f11859e.f11878b > bdVar.f11859e.f11879c) {
                this.f13810m = false;
                return;
            }
        }
    }

    public final int mo1040a(int i) {
        return ((C2591r) this.f13801d.get(i)).f13797b;
    }

    public final int mo1039a() {
        return this.f13801d.size();
    }

    public final /* synthetic */ void mo1132a(fr frVar) {
        C2592s c2592s = (C2592s) frVar;
        super.mo1132a((fr) c2592s);
        c2592s.a.getLayoutParams().width = 0;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        OnClickListener onClickListener = null;
        C2592s c2592s = (C2592s) frVar;
        Context context = this.f13800c.getContext();
        int i2 = mo1040a(i) == 1 ? 1 : 0;
        C2591r c2591r = (C2591r) this.f13801d.get(i);
        bd bdVar = c2591r.f13796a;
        this.f13809l.m9288a(c2592s.f13799t, bdVar.f11860f, bdVar.f11863i);
        if (i2 != 0) {
            CharSequence charSequence;
            if (TextUtils.isEmpty(this.f13804g)) {
                charSequence = null;
            } else {
                charSequence = context.getString(C7582R.string.content_description_generic_trailer, new Object[]{this.f13804g});
            }
            c2592s.a.setContentDescription(charSequence);
        }
        if (i2 != 0) {
            onClickListener = this.f13808k.m13628a(context, c2591r.f13798c, this.f13802e, this.f13803f, this.f13805h, this.f13806i);
        } else if (this.f13807j != null) {
            onClickListener = new C2594u(this, c2592s);
        }
        c2592s.a.setOnClickListener(onClickListener);
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.f13800c.getContext());
        switch (i) {
            case 0:
                return new C2592s(from.inflate(C7582R.layout.screenshot_item, viewGroup, false));
            case 1:
                return new C2592s(from.inflate(C7582R.layout.video_preview_screenshot_item, viewGroup, false));
            default:
                return null;
        }
    }
}
