package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.notification.ab;
import java.util.Arrays;

public final class com.google.android.finsky.activities.bi implements View$OnClickListener
{

    bi() {
    }

    public final void onClick(View p0) {
        v1 = new com.google.android.finsky.cv.a.cv();
        v1.a("docid0");
        v1.b("docid0");
        v1.b(3);
        v1.a(1);
        v0 = new Document[1];
        v0[0] = new Document(v1);
        com.google.android.finsky.m.a.r().a(Arrays.asList(v0), com.google.android.finsky.m.a.dd());
    }

}
