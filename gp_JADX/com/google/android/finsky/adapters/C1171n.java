package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v4.view.av;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.ah;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.play.PlayHighlightsBannerItemView;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.be;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.squareup.leakcanary.C7582R;

public final class C1171n implements C1158a {
    public final Document f7211a;
    public final C2720j f7212b;
    public final PlayCardClusterViewV2 f7213c;
    public final int f7214d;
    public final int f7215e;
    public final Context f7216f;
    public final C1294w f7217g;
    public final C3748a f7218h;
    public final C2495w f7219i;
    public C1173p f7220j;

    public C1171n(Context context, C1294w c1294w, C3748a c3748a, Document document, C2720j c2720j, PlayCardClusterViewV2 playCardClusterViewV2, C2495w c2495w) {
        this.f7211a = document;
        this.f7212b = c2720j;
        this.f7213c = playCardClusterViewV2;
        this.f7216f = context;
        this.f7217g = c1294w;
        this.f7218h = c3748a;
        this.f7219i = c2495w;
        Resources resources = context.getResources();
        this.f7214d = resources.getDimensionPixelSize(C7582R.dimen.highlight_banner_item_width);
        this.f7215e = resources.getDimensionPixelSize(C7582R.dimen.highlight_banner_item_height);
    }

    public final String mo1480a() {
        return this.f7211a.f14885a.f12096c;
    }

    public final int mo1477a(int i) {
        return C7582R.layout.play_highlights_banner_card_item;
    }

    public final boolean mo1484b() {
        return this.f7212b.f14901t;
    }

    public final x mo1479a(int i, int i2, int i3, y yVar, int[] iArr) {
        Document document = (Document) this.f7212b.m14679a(i, false);
        C1473m.f7980a.bR();
        return af.m9223a(this.f7216f, document, this.f7217g, i2, i3, yVar, iArr);
    }

    public final int mo1486c() {
        return this.f7212b.m14698m();
    }

    public final float mo1482b(int i) {
        return C1617r.m9292a(((Document) this.f7212b.m14679a(i, false)).f14885a.f12098e);
    }

    public final /* synthetic */ int mo1478a(View view) {
        return this.f7215e;
    }

    public final /* synthetic */ int mo1483b(View view) {
        return this.f7214d;
    }

    public final /* synthetic */ float mo1485c(View view) {
        return ((float) this.f7215e) / ((float) this.f7214d);
    }

    public final /* synthetic */ void mo1481a(View view, int i) {
        int i2;
        OnClickListener onClickListener = (PlayHighlightsBannerItemView) view;
        Document document = (Document) this.f7212b.m14679a(i, true);
        C1294w c1294w = this.f7217g;
        C3748a c3748a = this.f7218h;
        ad parentOfChildren = this.f7213c.getParentOfChildren();
        String str = this.f7211a.f14885a.f12096c;
        be c1172o = new C1172o(this);
        C2495w c2495w = this.f7219i;
        if (onClickListener.f18716b != null) {
            onClickListener.f18716b.setText(document.f14885a.f12100g);
        }
        if (onClickListener.f18717c != null) {
            onClickListener.f18717c.setText(document.f14885a.f12101h);
        }
        if (onClickListener.f18719e != null) {
            View view2 = onClickListener.f18719e;
            if (TextUtils.isEmpty(document.f14885a.f12100g) && TextUtils.isEmpty(document.f14885a.f12101h)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        onClickListener.f18723i = c3748a;
        onClickListener.f18720f = document;
        onClickListener.f18724j = c2495w;
        onClickListener.f18721g.setOnLoadedListener(onClickListener);
        onClickListener.f18726l = c1172o;
        onClickListener.f18721g.m13584a(document, c1294w, PlayHighlightsBannerItemView.f18714a);
        if (!onClickListener.f18721g.c()) {
            ah.m9227a(onClickListener.f18718d, null);
        }
        if (C3760e.m17903a()) {
            if (PlayHighlightsBannerItemView.f18715s == null) {
                PlayHighlightsBannerItemView.m17566b();
            }
            PlayHighlightsBannerItemView.f18715s.setLength(26);
            PlayHighlightsBannerItemView.f18715s.append(document.f14885a.f12096c);
            PlayHighlightsBannerItemView.f18715s.append(':');
            PlayHighlightsBannerItemView.f18715s.append(str);
            ai.m1832a(onClickListener.f18721g, PlayHighlightsBannerItemView.f18715s.toString());
            av.f1860a.mo430a(onClickListener);
        }
        onClickListener.setOnClickListener(onClickListener.f18723i.mo3625a(onClickListener, onClickListener.f18720f));
        C2482j.m13285a(onClickListener.f18731q, document.f14885a.f12087D);
        onClickListener.f18732r = parentOfChildren;
        onClickListener.getParentNode().mo1219a(onClickListener);
        String string = onClickListener.getContext().getString(C7582R.string.content_description_featured_prefix);
        String str2 = document.f14885a.f12100g;
        String str3 = document.f14885a.f12101h;
        onClickListener.setContentDescription(new StringBuilder(((String.valueOf(string).length() + 2) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(string).append("\n").append(str2).append("\n").append(str3).toString());
        int i3 = i + 1;
        i2 = this.f7212b.m14698m();
        onClickListener.f18725k.setVisibility(0);
        onClickListener.f18725k.setText(onClickListener.getResources().getString(C7582R.string.highlight_banner_numbering_index, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
    }
}
