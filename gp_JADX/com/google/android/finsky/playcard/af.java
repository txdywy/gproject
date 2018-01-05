package com.google.android.finsky.playcard;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cy;
import com.google.android.finsky.detailscomponents.C2576a;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.C2586l;
import com.google.android.finsky.detailscomponents.C2596w;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;
import java.util.List;

public final class af extends C3901z {
    public C0988c f19550a;
    public C1011h f19551b;
    public C2576a f19552c;
    public C2206c f19553d;
    public C2233o f19554e;
    public ab f19555f;
    public C1461c f19556g;
    public final C3917q f19557h = new C3917q(this.f19550a.cY(), this.f19555f.dn(), this.f19554e, this.f19553d, this.f19556g);

    public af(C0988c c0988c, C1011h c1011h, C2576a c2576a, C2206c c2206c, C2233o c2233o, ab abVar, C1461c c1461c) {
        this.f19550a = c0988c;
        this.f19551b = c1011h;
        this.f19552c = c2576a;
        this.f19553d = c2206c;
        this.f19554e = c2233o;
        this.f19555f = abVar;
        this.f19556g = c1461c;
    }

    private static boolean m18480a(bd bdVar) {
        return (bdVar.f11859e == null || bdVar.f11859e.f11879c == 0 || bdVar.f11859e.f11878b == 0 || bdVar.f11859e.f11878b > bdVar.f11859e.f11879c) ? false : true;
    }

    private static boolean m18481a(List list, bd bdVar) {
        Object obj;
        for (bd a : list) {
            if (!m18480a(a)) {
                obj = null;
                break;
            }
        }
        int i = 1;
        return obj != null && (bdVar == null || m18480a(bdVar));
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        int i;
        PlayCardJpkrEditorialView playCardJpkrEditorialView = (PlayCardJpkrEditorialView) dVar;
        super.mo3861a(playCardJpkrEditorialView, document, c3748a, c2495w);
        this.f19552c.m13624a(document, playCardJpkrEditorialView.getContentRatingPanel());
        C1006c a = this.f19551b.m5977a(c3748a.mo3709k(), c3748a.mo3711m(), c3748a, playCardJpkrEditorialView.getContext(), null, (ad) playCardJpkrEditorialView.getLoggingData(), 4, null, -1, null, false, false, false);
        a.m5959a(document, null, c3748a.mo3710l(), playCardJpkrEditorialView.getDetailsDynamicSection());
        playCardJpkrEditorialView.setActionButtonHelper(a);
        if (!document.m14620I() || document.m14622K() <= 0) {
            playCardJpkrEditorialView.m18447b(8);
        } else {
            playCardJpkrEditorialView.m18447b(0);
            long K = document.m14622K();
            playCardJpkrEditorialView.f19429d.setText(NumberFormat.getIntegerInstance().format(K));
            playCardJpkrEditorialView.f19429d.setContentDescription(playCardJpkrEditorialView.getContext().getResources().getQuantityString(C7582R.plurals.content_description_review_histogram_review_count, (int) K, new Object[]{Long.valueOf(K)}));
        }
        if (document.bz()) {
            playCardJpkrEditorialView.setDownloadsCountVisbility(0);
            playCardJpkrEditorialView.f19430e.setText(document.by().f13201b);
            playCardJpkrEditorialView.f19430e.setContentDescription(playCardJpkrEditorialView.getContext().getString(C7582R.string.download_count, new Object[]{r2}));
        } else {
            playCardJpkrEditorialView.setDownloadsCountVisbility(8);
        }
        EditorialPageExtraLabelsSection extraLabelsContainer = playCardJpkrEditorialView.getExtraLabelsContainer();
        if (extraLabelsContainer != null) {
            String str;
            int i2;
            C3917q c3917q = this.f19557h;
            Resources resources = playCardJpkrEditorialView.getContext().getResources();
            C3916p c3916p = new C3916p();
            Object obj = (c3917q.f19852e.dj().mo2294a(12639546) || !document.m14658m()) ? null : 1;
            if (obj != null) {
                str = document.m14659n().f13069c;
            } else {
                str = null;
            }
            c3916p.f19844b = str;
            boolean ae = document.ae();
            boolean z = false;
            C2441n N = document.m14625N();
            if (N != null) {
                c3916p.f19843a = null;
                if (!N.m13104d() || ae) {
                    str = null;
                } else {
                    str = N.f13184x;
                }
                c3916p.f19845c = str;
                z = N.f13180t;
            }
            str = (!z || ae) ? null : resources.getString(C7582R.string.in_app_purchases);
            c3916p.f19847e = str;
            if (c3917q.f19850c.m11649a(document, c3917q.f19849b, c3917q.f19851d.mo2811a(c3917q.f19848a)) && ae) {
                str = resources.getString(C7582R.string.preregistration_extra_label);
            } else {
                str = null;
            }
            c3916p.f19846d = str;
            int i3 = 0;
            String[] strArr = new String[2];
            String[] strArr2 = new String[3];
            if (!TextUtils.isEmpty(c3916p.f19843a)) {
                i3 = 1;
                strArr[0] = c3916p.f19843a;
            }
            if (!TextUtils.isEmpty(c3916p.f19844b)) {
                i2 = i3 + 1;
                strArr[i3] = c3916p.f19844b;
                i3 = i2;
            }
            if (TextUtils.isEmpty(c3916p.f19846d)) {
                i2 = 0;
            } else {
                i2 = 1;
                strArr2[0] = c3916p.f19846d;
            }
            if (!TextUtils.isEmpty(c3916p.f19845c)) {
                i = i2 + 1;
                strArr2[i2] = c3916p.f19845c;
                i2 = i;
            }
            if (!TextUtils.isEmpty(c3916p.f19847e)) {
                i = i2 + 1;
                strArr2[i2] = c3916p.f19847e;
                i2 = i;
            }
            EditorialPageExtraLabelsSection.m18393a(extraLabelsContainer.f19331a, i3);
            EditorialPageExtraLabelsSection.m18393a(extraLabelsContainer.f19332b, i2);
            extraLabelsContainer.m18395b(extraLabelsContainer.f19331a, i3);
            extraLabelsContainer.m18395b(extraLabelsContainer.f19332b, i2);
            EditorialPageExtraLabelsSection.m18394a(strArr, i3, extraLabelsContainer.f19331a);
            EditorialPageExtraLabelsSection.m18394a(strArr2, i2, extraLabelsContainer.f19332b);
            if (i3 > 0 || i2 > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            extraLabelsContainer.setVisibility(i3);
        }
        ScreenshotsRecyclerView screenshotsContainer = playCardJpkrEditorialView.getScreenshotsContainer();
        if (screenshotsContainer != null) {
            if (document.ak() && document.bA()) {
                List c = document.m14644c(1);
                boolean b = C2586l.m13643b(document);
                screenshotsContainer.m13618a(C2596w.m13652a(document, 0), new ag(b, c3748a, document), (ad) playCardJpkrEditorialView.getLoggingData());
                if (!b) {
                    playCardJpkrEditorialView.setAllPortraitMode(m18481a(c, null));
                } else if (C2581g.m13636a(document) != null) {
                    playCardJpkrEditorialView.setAllPortraitMode(m18481a(c, (bd) document.m14644c(3).get(0)));
                }
                screenshotsContainer.setVisibility(0);
            } else {
                screenshotsContainer.setVisibility(8);
            }
        }
        if (document.cc()) {
            cy cyVar;
            if (document.cc()) {
                cyVar = document.f14885a.f12115v.f13113T;
            } else {
                cyVar = null;
            }
            if (cyVar.f12127b.length > 0) {
                playCardJpkrEditorialView.setKeyPointsVisibility(0);
                playCardJpkrEditorialView.setKeyPointCount(cyVar.f12127b.length);
                i = 0;
                while (i < cyVar.f12127b.length) {
                    CharSequence charSequence = cyVar.f12127b[i];
                    if (i >= 0 || i < playCardJpkrEditorialView.f19438m.getChildCount()) {
                        ((TextView) playCardJpkrEditorialView.f19438m.getChildAt(i).findViewById(C7582R.id.key_point_content)).setText(charSequence);
                    }
                    i++;
                }
            } else {
                playCardJpkrEditorialView.setKeyPointsVisibility(8);
            }
            PlayTextView editorialParagraph = playCardJpkrEditorialView.getEditorialParagraph();
            if (((cyVar.f12126a & 1) != 0 ? 1 : null) != null) {
                editorialParagraph.setVisibility(0);
                editorialParagraph.setText(cyVar.f12128c);
                return;
            }
            editorialParagraph.setVisibility(8);
            return;
        }
        playCardJpkrEditorialView.setKeyPointsVisibility(8);
    }
}
