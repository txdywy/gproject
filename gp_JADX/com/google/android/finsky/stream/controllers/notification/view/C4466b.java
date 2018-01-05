package com.google.android.finsky.stream.controllers.notification.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.notification.C3806r;

public final /* synthetic */ class C4466b implements C3806r {
    public final NotificationCardRowView f22721a;
    public final int f22722b;

    public C4466b(NotificationCardRowView notificationCardRowView, int i) {
        this.f22721a = notificationCardRowView;
        this.f22722b = i;
    }

    public final void mo3812a(Bitmap bitmap) {
        NotificationCardRowView notificationCardRowView = this.f22721a;
        if (notificationCardRowView.f22713t > this.f22722b) {
            return;
        }
        if (bitmap != null) {
            notificationCardRowView.f22710q.setImageBitmap(bitmap);
            return;
        }
        ImageView imageView = notificationCardRowView.f22710q;
        if (notificationCardRowView.f22716w == null) {
            notificationCardRowView.f22716w = C0722q.m4782a(notificationCardRowView.getResources(), C1592a.aC.intValue(), new as());
        }
        imageView.setImageDrawable(notificationCardRowView.f22716w);
    }
}
