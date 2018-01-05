package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import java.util.Arrays;

final class bi implements OnClickListener {
    bi() {
    }

    public final void onClick(View view) {
        String str = "docid0";
        cv cvVar = new cv();
        cvVar.m12387a(str);
        cvVar.m12392b(str);
        cvVar.m12391b(3);
        cvVar.m12386a(1);
        C1473m.f7980a.mo2259r().mo3799a(Arrays.asList(new Document[]{new Document(cvVar)}), C1473m.f7980a.dd());
    }
}
