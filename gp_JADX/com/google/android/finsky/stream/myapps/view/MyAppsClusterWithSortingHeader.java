package com.google.android.finsky.stream.myapps.view;

import android.content.Context;
import android.support.p011c.p012a.C0054l;
import android.support.v4.widget.bg;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C3076f;
import com.google.android.finsky.playcard.C3077k;
import com.squareup.leakcanary.C7582R;

public class MyAppsClusterWithSortingHeader extends LinearLayout implements OnClickListener, C3076f, C3077k {
    public TextView f23294a;
    public TextView f23295b;
    public TextView f23296c;
    public C4345e f23297d;

    public MyAppsClusterWithSortingHeader(Context context) {
        this(context, null);
    }

    public MyAppsClusterWithSortingHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f23294a = (TextView) findViewById(C7582R.id.header_title);
        this.f23295b = (TextView) findViewById(C7582R.id.header_subtitle);
        this.f23296c = (TextView) findViewById(C7582R.id.header_sort_action);
        bg.m2222a(this.f23296c, null, null, C0054l.m66a(getContext().getResources(), C7582R.drawable.sort_icon, null), null);
    }

    public final void m21177a(C4558d c4558d, C4345e c4345e) {
        this.f23297d = c4345e;
        this.f23294a.setText(c4558d.f23301a);
        if (TextUtils.isEmpty(c4558d.f23302b)) {
            this.f23295b.setVisibility(8);
        } else {
            this.f23295b.setVisibility(0);
            this.f23295b.setText(c4558d.f23302b);
        }
        if (c4558d.f23303c) {
            this.f23296c.setVisibility(0);
            this.f23296c.setText(c4558d.f23304d);
            this.f23296c.setOnClickListener(this);
            setNextFocusRightId(C7582R.id.header_sort_action);
            this.f23296c.setNextFocusLeftId(C7582R.id.cluster_header);
            return;
        }
        this.f23296c.setVisibility(8);
    }

    public void onClick(View view) {
        this.f23297d.cd_();
    }
}
