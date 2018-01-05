package com.google.android.finsky.layout.structuredreviews;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.kb;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class ReviewStructuredQuestion extends C3721a {
    public ViewGroup f18832c;
    public ColorStateList f18833d;
    public int f18834e;
    public C1151k f18835f;

    public ReviewStructuredQuestion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (VERSION.SDK_INT >= 21) {
            this.f18833d = context.getResources().getColorStateList(C7582R.color.structured_review_option_tint);
        }
    }

    public ReviewStructuredQuestion(Context context) {
        this(context, null);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18832c = (ViewGroup) findViewById(C7582R.id.question_options_container);
    }

    public final void m17605a(CharSequence charSequence, List list, int i, boolean z, C1151k c1151k) {
        super.m17594a(charSequence);
        this.f18835f = c1151k;
        if (this.f18832c.getChildCount() > list.size()) {
            this.f18832c.removeViews(list.size(), this.f18832c.getChildCount() - list.size());
        }
        this.f18834e = i;
        LayoutInflater from = LayoutInflater.from(getContext());
        for (int i2 = 0; i2 < list.size(); i2++) {
            boolean z2;
            ViewGroup viewGroup = (ViewGroup) this.f18832c.getChildAt(i2);
            if (viewGroup == null) {
                viewGroup = (ViewGroup) from.inflate(C7582R.layout.structured_review_question_option, this.f18832c, false);
                this.f18832c.addView(viewGroup);
            }
            ViewGroup viewGroup2 = viewGroup;
            kb kbVar = (kb) list.get(i2);
            ((TextView) viewGroup2.findViewById(C7582R.id.question_option_text)).setText(kbVar.f12857d);
            m17604a(m17603a(kbVar), (FifeImageView) viewGroup2.findViewById(C7582R.id.question_option_icon), kbVar.f12857d, z);
            viewGroup2.setTag(kbVar);
            if (z) {
                z2 = false;
            } else {
                z2 = true;
            }
            viewGroup2.setEnabled(z2);
            viewGroup2.setOnClickListener(new C3726j(this, kbVar));
        }
    }

    final void m17604a(bd bdVar, FifeImageView fifeImageView, CharSequence charSequence, boolean z) {
        C1473m.f7980a.ar().m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
        fifeImageView.setContentDescription(charSequence);
        if (VERSION.SDK_INT >= 21 && this.f18833d != null) {
            fifeImageView.setImageTintList(z ? this.f18833d : null);
        }
    }

    final bd m17603a(kb kbVar) {
        if (kbVar.f12856c == this.f18834e) {
            return kbVar.f12858e;
        }
        return kbVar.f12859f;
    }
}
