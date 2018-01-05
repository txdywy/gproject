package com.google.android.finsky.detailspage.videowatchaction;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class WatchActionListViewItem extends LinearLayout {
    public FifeImageView f14766a;
    public TextView f14767b;
    public TextView f14768c;
    public TextView f14769d;
    public ImageView f14770e;

    public WatchActionListViewItem(Context context) {
        this(context, null);
    }

    public WatchActionListViewItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WatchActionListViewItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14766a = (FifeImageView) findViewById(C7582R.id.thumbnail_image);
        this.f14767b = (TextView) findViewById(C7582R.id.title);
        this.f14768c = (TextView) findViewById(C7582R.id.subtitle);
        this.f14769d = (TextView) findViewById(C7582R.id.offer_message);
        this.f14770e = (ImageView) findViewById(C7582R.id.group_indicator);
    }

    public final void m14499a(C2682h c2682h, boolean z) {
        this.f14767b.setText(c2682h.f14792a);
        this.f14768c.setVisibility(TextUtils.isEmpty(c2682h.f14793b) ? 8 : 0);
        this.f14768c.setText(c2682h.f14793b);
        this.f14769d.setText(c2682h.f14794c);
        this.f14766a.setContentDescription(c2682h.f14792a);
        if (c2682h.f14795d != null) {
            C1473m.f7980a.ar().m9288a(this.f14766a, c2682h.f14795d.f11860f, c2682h.f14795d.f11863i);
        }
        m14500a(z);
    }

    public void setGroupIndicatorVisibility(int i) {
        this.f14770e.setVisibility(i);
    }

    final void m14500a(boolean z) {
        int i;
        ImageView imageView = this.f14770e;
        if (z) {
            i = C7582R.drawable.watch_action_list_group_indicator_expanded;
        } else {
            i = C7582R.drawable.watch_action_list_group_indicator_collapsed;
        }
        imageView.setImageResource(i);
    }
}
