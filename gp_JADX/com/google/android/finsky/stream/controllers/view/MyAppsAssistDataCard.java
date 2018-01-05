package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0054l;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class MyAppsAssistDataCard extends RelativeLayout implements C2625e {
    public ImageView f22977a;
    public PlayActionButtonV2 f22978b;
    public ProgressBar f22979c;
    public TextView f22980d;
    public TextView f22981e;
    public TextView f22982f;
    public TextView f22983g;

    public MyAppsAssistDataCard(Context context) {
        this(context, null);
    }

    public MyAppsAssistDataCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyAppsAssistDataCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22983g = (TextView) findViewById(C7582R.id.title);
        this.f22982f = (TextView) findViewById(C7582R.id.message);
        this.f22980d = (TextView) findViewById(C7582R.id.quantity_top_line);
        this.f22981e = (TextView) findViewById(C7582R.id.quantity_bottom_line);
        this.f22979c = (ProgressBar) findViewById(C7582R.id.progress_ring);
        this.f22978b = (PlayActionButtonV2) findViewById(C7582R.id.call_to_action);
        this.f22978b.setDrawAsLabel(true);
        this.f22977a = (ImageView) findViewById(C7582R.id.close);
        Drawable a = C0054l.m66a(getContext().getResources(), C7582R.drawable.play_card_view_action_button_close, null);
        if (a != null) {
            a = C0259a.m1526e(a).mutate();
            C0259a.m1514a(a, Color.argb(51, 0, 0, 0));
            this.f22977a.setImageDrawable(a);
        }
    }

    public final void m21028a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, double d, int i, String str, OnClickListener onClickListener, OnClickListener onClickListener2) {
        this.f22983g.setText(charSequence);
        this.f22982f.setText(charSequence2);
        this.f22980d.setText(charSequence3);
        this.f22981e.setText(C7582R.string.myapps_storage_assist_available_space_label);
        this.f22979c.setProgress((int) (100.0d * d));
        switch (i) {
            case 0:
                this.f22979c.setProgressDrawable(C0216d.m1112a(getContext(), (int) C7582R.drawable.myapps_data_ring_good));
                break;
            case 1:
                this.f22979c.setProgressDrawable(C0216d.m1112a(getContext(), (int) C7582R.drawable.myapps_data_ring_warning));
                break;
            case 2:
                this.f22979c.setProgressDrawable(C0216d.m1112a(getContext(), (int) C7582R.drawable.myapps_data_ring_bad));
                break;
            default:
                FinskyLog.m21669e("Unknown ring color severity value: " + i, new Object[0]);
                this.f22979c.setProgressDrawable(C0216d.m1112a(getContext(), (int) C7582R.drawable.myapps_data_ring_good));
                break;
        }
        this.f22978b.mo2588a(3, str, onClickListener);
        if (onClickListener2 == null) {
            this.f22977a.setVisibility(8);
            return;
        }
        this.f22977a.setVisibility(0);
        this.f22977a.setOnClickListener(onClickListener2);
    }
}
