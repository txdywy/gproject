package com.google.android.finsky.detailscomponents;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.ac;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.a;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class C2576a {
    public final C1294w f13747a;
    public final C1612l f13748b;

    public C2576a(C1294w c1294w, C1612l c1612l) {
        this.f13747a = c1294w;
        this.f13748b = c1612l;
    }

    public static bd m13619a(ac acVar) {
        for (bd bdVar : acVar.f11758e) {
            if (bdVar.f11857c == 6) {
                return bdVar;
            }
        }
        return null;
    }

    public final void m13625a(Document document, DecoratedTextView decoratedTextView) {
        m13623a(document.an() ? document.ao() : null, decoratedTextView, decoratedTextView.getResources());
    }

    public final void m13622a(ac acVar, DecoratedTextView decoratedTextView) {
        m13623a(acVar, decoratedTextView, decoratedTextView.getResources());
    }

    public final void m13623a(ac acVar, a aVar, Resources resources) {
        CharSequence text = aVar.getText();
        if (acVar != null) {
            int textSize = (int) aVar.getTextSize();
            bd a = C2576a.m13619a(acVar);
            if (a != null) {
                aVar.a(this.f13747a, a, textSize);
                aVar.setContentDescription(resources.getString(C7582R.string.content_description_item_subtitle, new Object[]{text, acVar.f11756c}));
                return;
            }
            aVar.setContentDescription(text);
            return;
        }
        aVar.a();
        aVar.setContentDescription(text);
    }

    public final void m13624a(Document document, ViewGroup viewGroup) {
        if (document.f14885a.f12098e == 1 || document.f14885a.f12098e == 6) {
            ac ar = document.ar();
            if (ar == null) {
                viewGroup.setVisibility(8);
                return;
            }
            DecoratedTextView decoratedTextView = (DecoratedTextView) viewGroup.findViewById(C7582R.id.title_content_rating);
            if ((ar.f11755b & 8) != 0) {
                decoratedTextView.setText(ar.f11761h);
                decoratedTextView.setVisibility(0);
            } else {
                decoratedTextView.setVisibility(8);
            }
            FifeImageView fifeImageView = (FifeImageView) viewGroup.findViewById(C7582R.id.title_content_rating_icon);
            if (ar.f11758e == null || ar.f11758e.length == 0) {
                fifeImageView.setVisibility(8);
                return;
            }
            af.m9224a(fifeImageView, ar.f11758e[0]);
            this.f13748b.m9288a(fifeImageView, ar.f11758e[0].f11860f, true);
            fifeImageView.setVisibility(0);
            if (decoratedTextView.getVisibility() != 0 && !TextUtils.isEmpty(ar.f11756c)) {
                fifeImageView.setContentDescription(ar.f11756c);
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    public static boolean m13621a(d dVar, Document document) {
        if (dVar.getRatingBarDelegate() == null || document.f14885a.f12098e != 1) {
            return false;
        }
        return true;
    }

    public static void m13620a(Document document, PlayTextView playTextView) {
        int i;
        int i2;
        if (document.bh()) {
            switch (document.f14885a.f12112s.f12049b.f12397c.f12375b) {
                case 1:
                    i = C7582R.string.tipper_sticker_explicit_content;
                    i2 = C7582R.color.tipper_sticker_explicit;
                    break;
                case 2:
                    i = C7582R.string.tipper_sticker_edited_content;
                    i2 = C7582R.color.tipper_sticker_edited;
                    break;
            }
        }
        i2 = C7582R.color.tipper_sticker_edited;
        i = -1;
        if (i == -1 && document.bi()) {
            switch (document.f14885a.f12112s.f12049b.f12397c.f12376c[0]) {
                case 0:
                    i = C7582R.string.tipper_sticker_remix;
                    break;
                case 1:
                    i = C7582R.string.tipper_sticker_bonus_tracks;
                    break;
                case 2:
                    i = C7582R.string.tipper_sticker_remastered;
                    break;
            }
        }
        if (i >= 0) {
            playTextView.setVisibility(0);
            playTextView.setText(playTextView.getResources().getString(i).toUpperCase());
            playTextView.a(i2, true);
            playTextView.setCompoundDrawables(null, null, null, null);
            return;
        }
        playTextView.setVisibility(8);
    }
}
