package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.AccessibleLinearLayout;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.squareup.leakcanary.C7582R;

public class ArtistRadioModuleLayout extends AccessibleLinearLayout implements OnClickListener, C2621k, C2622l {
    public TextView f13911a;
    public C2635e f13912b;

    public ArtistRadioModuleLayout(Context context) {
        this(context, null);
    }

    public ArtistRadioModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
        this.f13911a = (TextView) findViewById(C7582R.id.artist_radio_station_button_text);
        this.f13911a.setText(getContext().getString(C7582R.string.artist_radio_station_text).toUpperCase());
    }

    public void onClick(View view) {
        if (this.f13912b != null) {
            this.f13912b.mo3063a();
        }
    }
}
