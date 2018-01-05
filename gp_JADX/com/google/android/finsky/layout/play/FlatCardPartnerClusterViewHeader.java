package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.stream.base.view.C3687d;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class FlatCardPartnerClusterViewHeader extends FlatCardClusterViewHeader {
    public FlatCardPartnerClusterViewHeader(Context context) {
        super(context);
    }

    public FlatCardPartnerClusterViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void mo3611a(C4295c c4295c, C3687d c3687d) {
        super.mo3611a(c4295c, c3687d);
        this.e.setTextColor(this.d.getTextColors().getDefaultColor());
        this.e.getBackground().setLevel(this.w);
    }

    protected void onFinishInflate() {
        LayoutParams layoutParams = ((FifeImageView) findViewById(C7582R.id.cluster_image)).getLayoutParams();
        int i = layoutParams.height;
        super.onFinishInflate();
        layoutParams.width = i;
        layoutParams.height = i;
    }
}
