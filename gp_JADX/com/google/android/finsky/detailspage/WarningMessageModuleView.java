package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.frameworkviews.C2572y;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class WarningMessageModuleView extends LinearLayout implements OnClickListener, C2621k, C2622l, C2572y, C2573z {
    public TextView f14211a;
    public FifeImageView f14212b;
    public hf f14213c;
    public boolean f14214d;

    class C26311 extends UnderlineSpan {
        public final /* synthetic */ ColorStateList f14210a;

        C26311(ColorStateList colorStateList) {
            this.f14210a = colorStateList;
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f14210a.getDefaultColor());
        }
    }

    public WarningMessageModuleView(Context context) {
        super(context);
    }

    public WarningMessageModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14211a = (TextView) findViewById(C7582R.id.warning_message);
        if (C1473m.f7980a.dj().mo2294a(12626284)) {
            this.f14211a.setTextAppearance(getContext(), C7582R.style.WarningMessageModuleBoldText);
        }
        this.f14212b = (FifeImageView) findViewById(C7582R.id.warning_message_icon);
    }

    public void onClick(View view) {
        this.f14213c.mo3100a();
    }
}
