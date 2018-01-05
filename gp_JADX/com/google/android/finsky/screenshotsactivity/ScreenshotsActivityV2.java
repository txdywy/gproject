package com.google.android.finsky.screenshotsactivity;

import android.os.Bundle;
import com.android.ex.photo.C0545a;
import com.android.ex.photo.C0568r;
import com.android.ex.photo.C0569f;
import com.android.ex.photo.C0572j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.C1294w;

public class ScreenshotsActivityV2 extends C0569f implements C0568r {
    public C1294w f20351s;

    protected void onCreate(Bundle bundle) {
        ((C1413c) C3947d.m18649a(C1413c.class)).mo1902a(this);
        super.onCreate(bundle);
    }

    public final C0572j mo3890k() {
        return new C4053f(this, ((Document) getIntent().getParcelableExtra("document")).m14644c(getIntent().getIntExtra("imageType", 1)), this.f20351s);
    }

    public final C0545a mo996n() {
        return null;
    }
}
