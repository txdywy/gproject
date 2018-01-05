package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C3076f;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.playcard.C3077k;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class MyAppsUpdateClusterHeader extends LinearLayout implements OnClickListener, C3076f, C3077k {
    public TextView f22990a;
    public TextView f22991b;
    public PlayActionButtonV2 f22992c;
    public Drawable f22993d;
    public C4346u f22994e;

    public MyAppsUpdateClusterHeader(Context context) {
        this(context, null);
    }

    public MyAppsUpdateClusterHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22990a = (TextView) findViewById(C7582R.id.header_title);
        this.f22991b = (TextView) findViewById(C7582R.id.header_subtitle);
        this.f22992c = (PlayActionButtonV2) findViewById(C7582R.id.header_action_button);
        this.f22993d = getResources().getDrawable(C7582R.drawable.play_dot_notification);
    }

    public final void m21029a(C4517t c4517t, C4346u c4346u) {
        this.f22994e = c4346u;
        this.f22990a.setText(c4517t.f23121a);
        if (TextUtils.isEmpty(c4517t.f23122b)) {
            this.f22991b.setVisibility(8);
        } else {
            this.f22991b.setText(c4517t.f23122b);
            this.f22991b.setVisibility(0);
        }
        if (TextUtils.isEmpty(c4517t.f23123c)) {
            this.f22992c.setVisibility(8);
        } else {
            this.f22992c.mo2588a(3, c4517t.f23123c, (OnClickListener) this);
            this.f22992c.setVisibility(0);
        }
        setNextFocusRightId(C7582R.id.header_action_button);
        this.f22992c.setNextFocusLeftId(C7582R.id.cluster_header);
        if (c4517t.f23124d) {
            this.f22990a.setCompoundDrawablePadding(getResources().getDimensionPixelOffset(C7582R.dimen.myapps_cluster_header_drawable_padding));
            if (k.b(getContext())) {
                this.f22990a.setCompoundDrawablesWithIntrinsicBounds(null, null, this.f22993d, null);
            } else {
                this.f22990a.setCompoundDrawablesWithIntrinsicBounds(this.f22993d, null, null, null);
            }
        }
    }

    public void onClick(View view) {
        this.f22994e.mo4141m();
    }
}
