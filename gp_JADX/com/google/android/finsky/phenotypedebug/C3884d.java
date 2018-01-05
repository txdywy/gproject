package com.google.android.finsky.phenotypedebug;

import android.content.Context;
import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.phenotypedebug.view.C3883c;
import com.google.android.finsky.phenotypedebug.view.C3890a;
import com.google.android.finsky.phenotypedebug.view.C3891b;
import com.google.android.finsky.phenotypedebug.view.DebugPhenotypeExperimentItemView;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C3884d extends em implements C3883c {
    public final Context f19307c;
    public final List f19308d;
    public final List f19309e;
    public final List f19310f = new ArrayList();
    public final List f19311g = new ArrayList();
    public Pattern f19312h = null;

    public C3884d(Context context, List list, List list2) {
        this.f19307c = context;
        this.f19308d = list;
        this.f19309e = list2;
        this.f19310f.addAll(this.f19308d);
        this.f19310f.addAll(this.f19309e);
        this.f19311g.addAll(this.f19310f);
    }

    public final int mo1039a() {
        return this.f19311g.size();
    }

    public final void mo3833a(String str, String str2) {
        for (C3880a c3880a : this.f19310f) {
            if (c3880a.f19304a.equals(str)) {
                if (str2 != null) {
                    try {
                        c3880a.f19306c = c3880a.mo3830a(str2);
                        return;
                    } catch (Exception e) {
                        c3880a.f19306c = c3880a.f19305b;
                        return;
                    }
                }
                return;
            }
        }
    }

    public final /* synthetic */ void mo1132a(fr frVar) {
        ((DebugPhenotypeExperimentItemView) ((C3885e) frVar).a).Z_();
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        DebugPhenotypeExperimentItemView debugPhenotypeExperimentItemView = (DebugPhenotypeExperimentItemView) ((C3885e) frVar).a;
        C3880a c3880a = (C3880a) this.f19311g.get(i);
        CharSequence charSequence = c3880a.f19304a;
        String simpleName = c3880a.m18373b().getClass().getSimpleName();
        Object c = c3880a.mo3832c();
        debugPhenotypeExperimentItemView.f19313a = charSequence;
        debugPhenotypeExperimentItemView.f19314b = simpleName;
        debugPhenotypeExperimentItemView.f19315c = c;
        debugPhenotypeExperimentItemView.f19318f.setText(c);
        debugPhenotypeExperimentItemView.f19316d.setText(charSequence);
        debugPhenotypeExperimentItemView.m18389a(c);
        debugPhenotypeExperimentItemView.setOnClickListener(new C3890a(debugPhenotypeExperimentItemView));
        debugPhenotypeExperimentItemView.f19319g = new C3891b(debugPhenotypeExperimentItemView, this);
        debugPhenotypeExperimentItemView.f19318f.addTextChangedListener(debugPhenotypeExperimentItemView.f19319g);
        Pattern pattern = this.f19312h;
        if (pattern != null) {
            Matcher matcher = pattern.matcher(debugPhenotypeExperimentItemView.f19313a);
            if (matcher != null && matcher.find()) {
                TextView textView = debugPhenotypeExperimentItemView.f19316d;
                CharSequence charSequence2 = debugPhenotypeExperimentItemView.f19313a;
                int start = matcher.start();
                int end = matcher.end();
                CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-16776961);
                StyleSpan styleSpan = new StyleSpan(3);
                spannableStringBuilder.setSpan(foregroundColorSpan, start, end, 18);
                spannableStringBuilder.setSpan(styleSpan, start, end, 18);
                textView.setText(spannableStringBuilder);
            }
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C3885e((DebugPhenotypeExperimentItemView) LayoutInflater.from(this.f19307c).inflate(C7582R.layout.phenotype_experiment_item_layout, viewGroup, false));
    }
}
