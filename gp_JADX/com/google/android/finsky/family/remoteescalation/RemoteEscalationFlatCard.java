package com.google.android.finsky.family.remoteescalation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.frameworkviews.C3076f;
import com.google.android.finsky.frameworkviews.OutlinedForegroundLinearLayout;
import com.google.android.finsky.playcard.C3077k;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.squareup.leakcanary.C7582R;

public class RemoteEscalationFlatCard extends OutlinedForegroundLinearLayout implements OnClickListener, C3076f, C3077k {
    public TextView f15985a;
    public FifeImageView f15986b;
    public TextView f15987c;
    public TextView f15988d;
    public TextView f15989e;
    public C3086g f15990f;

    public RemoteEscalationFlatCard(Context context) {
        super(context);
    }

    public RemoteEscalationFlatCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RemoteEscalationFlatCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15985a = (TextView) findViewById(C7582R.id.title);
        this.f15986b = (FifeImageView) findViewById(C7582R.id.thumbnail);
        this.f15987c = (TextView) findViewById(C1592a.f8466o.intValue());
        this.f15988d = (TextView) findViewById(C1592a.f8467p.intValue());
        this.f15989e = (TextView) findViewById(C1592a.f8468q.intValue());
    }

    public final void m15794a(ac acVar, C3086g c3086g) {
        this.f15990f = c3086g;
        setTag(acVar);
        setOnClickListener(this);
        this.f15985a.setText(acVar.c);
        int[] iArr = new int[]{C7582R.id.subtitle, C7582R.id.subtitle_1, C7582R.id.subtitle_2};
        int i = 0;
        while (i < acVar.e.length && i < 3) {
            TextView textView = (TextView) findViewById(iArr[i]);
            textView.setText(acVar.e[i]);
            textView.setVisibility(0);
            i++;
        }
        C1473m.f7980a.ar().m9288a(this.f15986b, acVar.d.f11860f, acVar.d.f11863i);
        if (((acVar.b & 2) != 0 ? 1 : 0) != 0) {
            this.f15987c.setText(acVar.f);
        }
        if (TextUtils.isEmpty(acVar.g)) {
            this.f15988d.setVisibility(8);
            this.f15989e.setVisibility(8);
            return;
        }
        this.f15988d.setVisibility(0);
        this.f15988d.setText(acVar.g);
        this.f15988d.setOnClickListener(this);
        this.f15989e.setVisibility(0);
        this.f15989e.setText(acVar.h);
        this.f15989e.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (this.f15990f != null) {
            ac acVar = (ac) getTag();
            int i = 0;
            if (view == this.f15988d) {
                i = 1;
            } else if (view == this.f15989e) {
                i = 2;
            }
            this.f15990f.mo3305a(this, acVar, i);
        }
    }
}
