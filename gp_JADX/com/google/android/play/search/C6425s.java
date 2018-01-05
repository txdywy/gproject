package com.google.android.play.search;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import com.google.android.play.C6382j;
import com.google.android.play.h;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;
import java.util.ArrayList;
import java.util.List;

public final class C6425s extends em implements C6419l {
    public final List f32370c = new ArrayList();
    public C6420m f32371d;
    public w f32372e;

    public final em mo5436b() {
        return this;
    }

    public final void mo5434a(C6420m c6420m) {
        this.f32371d = c6420m;
    }

    public final void mo5433a(w wVar) {
        this.f32372e = wVar;
    }

    public final int m29451a() {
        return this.f32370c.size();
    }

    public final void mo5435a(List list) {
        this.f32370c.clear();
        this.f32370c.addAll(list);
        this.a.b();
    }

    public final /* synthetic */ void m29453a(fr frVar, int i) {
        PlaySearchOneSuggestion playSearchOneSuggestion = ((C6428v) frVar).f32377t;
        C6429w c6429w = (C6429w) this.f32370c.get(i);
        w wVar = this.f32372e;
        playSearchOneSuggestion.f32303c.setText(playSearchOneSuggestion.f32301a.mo5430a(this.f32371d.f32364d, c6429w.f32378f, C6382j.PlaySearchSuggestionText_Query, C6382j.PlaySearchSuggestionText_Suggested));
        if (TextUtils.isEmpty(c6429w.f32379g)) {
            playSearchOneSuggestion.f32304d.setVisibility(8);
        } else {
            playSearchOneSuggestion.f32304d.setVisibility(0);
            playSearchOneSuggestion.f32304d.setText(c6429w.f32379g);
        }
        FifeImageView fifeImageView = playSearchOneSuggestion.f32302b;
        Drawable drawable = playSearchOneSuggestion.f32305e;
        if (c6429w.f32381i != null) {
            drawable = c6429w.f32381i;
        }
        fifeImageView.m29179a();
        fifeImageView.setScaleType(ScaleType.CENTER_INSIDE);
        fifeImageView.setBackgroundDrawable(null);
        fifeImageView.setDefaultDrawable(drawable);
        if (c6429w.f32382j != null) {
            Uri parse = Uri.parse(c6429w.f32382j);
            if ("android.resource".equals(parse.getScheme())) {
                fifeImageView.setImageURI(parse);
            } else if (wVar != null) {
                fifeImageView.setOnLoadedListener(new C6423q(fifeImageView, c6429w));
                fifeImageView.m29182a(c6429w.f32382j, c6429w.f32383k, wVar);
            }
            playSearchOneSuggestion.setOnClickListener(new C6426t(this, c6429w));
            playSearchOneSuggestion.setOnLongClickListener(new C6427u(this, c6429w));
        }
        fifeImageView.setOnLoadedListener(null);
        fifeImageView.setImageDrawable(drawable);
        playSearchOneSuggestion.setOnClickListener(new C6426t(this, c6429w));
        playSearchOneSuggestion.setOnLongClickListener(new C6427u(this, c6429w));
    }

    public final /* synthetic */ fr m29452a(ViewGroup viewGroup, int i) {
        return new C6428v((PlaySearchOneSuggestion) LayoutInflater.from(viewGroup.getContext()).inflate(h.play_search_one_suggestion, viewGroup, false));
    }
}
