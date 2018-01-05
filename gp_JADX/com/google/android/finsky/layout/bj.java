package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.squareup.leakcanary.C7582R;

final class bj implements OnClickListener {
    public final /* synthetic */ ReviewReplyLayout f18524a;

    bj(ReviewReplyLayout reviewReplyLayout) {
        this.f18524a = reviewReplyLayout;
    }

    public final void onClick(View view) {
        ReviewReplyLayout reviewReplyLayout;
        boolean z = false;
        if (this.f18524a.f18325d) {
            this.f18524a.m17340a();
            this.f18524a.f18323b.setVisibility(8);
        } else {
            reviewReplyLayout = this.f18524a;
            reviewReplyLayout.f18324c.setImageResource(C7582R.drawable.ic_menu_expander_maximized_light);
            reviewReplyLayout.f18324c.setContentDescription(reviewReplyLayout.getContext().getString(C7582R.string.content_description_collapse_reply));
            this.f18524a.f18323b.setVisibility(0);
        }
        reviewReplyLayout = this.f18524a;
        if (!this.f18524a.f18325d) {
            z = true;
        }
        reviewReplyLayout.f18325d = z;
    }
}
