package com.google.android.finsky.stream.controllers.editorschoice.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.finsky.frameworkviews.C3076f;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;

public class EditorsChoiceV2ClusterHeader extends FrameLayout implements C3076f {
    public PlayTextView f22251a;

    public EditorsChoiceV2ClusterHeader(Context context) {
        this(context, null);
    }

    public EditorsChoiceV2ClusterHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22251a = (PlayTextView) findViewById(C7582R.id.cluster_title);
    }
}
