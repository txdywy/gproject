package com.google.android.finsky.stream.controllers.inlinetopcharts.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;
import com.google.android.finsky.cv.p177a.jj;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.stream.controllers.inlinetopcharts.C4417a;
import com.google.android.finsky.stream.controllers.view.TopChartsClusterHeaderView;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public class InlineTopChartsClusterHeaderView extends TopChartsClusterHeaderView {
    public Spinner f22481a;
    public C4417a f22482b;

    public InlineTopChartsClusterHeaderView(Context context) {
        this(context, null);
    }

    public InlineTopChartsClusterHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22481a = (Spinner) findViewById(C7582R.id.section_corpus_spinner);
        this.f22482b = new C4417a(getContext(), new ArrayList());
        this.f22481a.setAdapter(this.f22482b);
    }

    protected final void mo4199a(boolean z, int i, Document document) {
        jj jjVar = document.ca().f12308e;
        if (!z || jjVar == null || jjVar.f12788a.length <= 0) {
            this.f22481a.setVisibility(8);
            return;
        }
        this.f22482b.clear();
        this.f22482b.addAll(jjVar.f12788a);
        this.f22481a.setSelection(i);
        this.f22481a.setOnItemSelectedListener(this);
        this.f22481a.setVisibility(0);
    }
}
