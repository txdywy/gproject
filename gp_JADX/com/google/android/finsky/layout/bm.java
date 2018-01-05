package com.google.android.finsky.layout;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.iu;

public final class bm implements OnClickListener {
    public final /* synthetic */ iu f18527a;
    public final /* synthetic */ RottenTomatoesReviewItem f18528b;

    public bm(RottenTomatoesReviewItem rottenTomatoesReviewItem, iu iuVar) {
        this.f18528b = rottenTomatoesReviewItem;
        this.f18527a = iuVar;
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f18527a.f12721i));
        this.f18528b.getContext().startActivity(intent);
    }
}
