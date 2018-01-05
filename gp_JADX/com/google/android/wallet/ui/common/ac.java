package com.google.android.wallet.ui.common;

import android.view.ViewGroup.LayoutParams;

final class ac implements Runnable {
    public final /* synthetic */ String f33512a;
    public final /* synthetic */ FifeNetworkImageView f33513b;

    ac(FifeNetworkImageView fifeNetworkImageView, String str) {
        this.f33513b = fifeNetworkImageView;
        this.f33512a = str;
    }

    public final void run() {
        int i = 0;
        int width = this.f33513b.getWidth();
        int height = this.f33513b.getHeight();
        LayoutParams layoutParams = this.f33513b.getLayoutParams();
        if (layoutParams.width == -2) {
            width = 0;
        }
        if (layoutParams.height != -2) {
            i = height;
        }
        this.f33513b.a(ci.m30849a(this.f33512a, width, i, this.f33513b.f33347l), this.f33513b.f33340d);
    }
}
