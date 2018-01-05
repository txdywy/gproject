package com.google.android.finsky.playpass;

import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.wireless.android.finsky.dfe.k.a.b;
import com.squareup.leakcanary.C7582R;

final class C3927e extends C1137h {
    public final int f19880c;
    public final /* synthetic */ C3923a f19881d;

    C3927e(C3923a c3923a, int i) {
        this.f19881d = c3923a;
        this.f19880c = i;
    }

    public final int mo1039a() {
        return 2;
    }

    public final long mo1043b(int i) {
        return (long) i;
    }

    public final int mo1040a(int i) {
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        if (i > 0) {
            OnClickListener onClickListener = this.f19881d;
            View view = c1155g.a;
            ae.m9217a((TextView) view.findViewById(C7582R.id.title), onClickListener.f19876h.f);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C7582R.id.benefits_list);
            viewGroup.removeAllViews();
            for (b bVar : onClickListener.f19876h.g) {
                View inflate = LayoutInflater.from(view.getContext()).inflate(C7582R.layout.family_benefits_row_v2, viewGroup, false);
                ae.m9217a((TextView) inflate.findViewById(C7582R.id.family_benefit_row_headline_text), bVar.c);
                ae.m9217a((TextView) inflate.findViewById(C7582R.id.family_benefit_row_summary_text), bVar.d);
                viewGroup.addView(inflate);
            }
            onClickListener.ak = (PlayActionButtonV2) view.findViewById(C7582R.id.explore_button);
            onClickListener.ak.mo2588a(3, onClickListener.f19876h.h, onClickListener);
            onClickListener.al = (PlayActionButtonV2) view.findViewById(C7582R.id.start_trial_button);
            onClickListener.al.mo2588a(3, onClickListener.f19876h.i, onClickListener);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                View view = new View(viewGroup.getContext());
                view.setLayoutParams(new LayoutParams(-1, this.f19880c));
                view.setId(C7582R.id.play_header_spacer);
                return new C1155g(view);
            case 1:
                return new C1155g(LayoutInflater.from(viewGroup.getContext()).inflate(C7582R.layout.family_benefits_v2, viewGroup, false));
            default:
                return null;
        }
    }
}
