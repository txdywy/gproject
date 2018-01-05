package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.AccessibleTextView;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2630c;
import com.squareup.leakcanary.C7582R;

public class TestingProgramModuleLayout extends C2630c implements C2621k {
    public AccessibleTextView f14076a;
    public AccessibleTextView f14077b;
    public AccessibleTextView f14078c;
    public AccessibleTextView f14079d;

    public TestingProgramModuleLayout(Context context) {
        this(context, null);
    }

    public TestingProgramModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14076a = (AccessibleTextView) findViewById(C7582R.id.opt_in_header);
        this.f14077b = (AccessibleTextView) findViewById(C7582R.id.opt_in_body);
        this.f14078c = (AccessibleTextView) findViewById(C7582R.id.learn_more_button);
        this.f14079d = (AccessibleTextView) findViewById(C7582R.id.opt_in_button);
    }
}
