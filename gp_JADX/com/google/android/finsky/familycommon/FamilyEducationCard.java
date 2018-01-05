package com.google.android.finsky.familycommon;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.ae;
import com.google.android.play.layout.CardLinearLayout;
import com.google.android.play.utils.m;
import com.squareup.leakcanary.C7582R;

public class FamilyEducationCard extends CardLinearLayout {
    public FamilyEducationCard(Context context) {
        super(context);
    }

    public FamilyEducationCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FamilyEducationCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }

    public final FamilyEducationCard m15887a(int i, String str, String str2, String str3, OnClickListener onClickListener) {
        return m15888a(i, str, str2, str3, onClickListener, null);
    }

    public final FamilyEducationCard m15888a(int i, String str, String str2, String str3, OnClickListener onClickListener, m mVar) {
        getCardViewGroupDelegate().mo3864a(this, C1608h.m9253b(getContext(), i));
        TextView textView = (TextView) findViewById(C7582R.id.card_text);
        if (mVar != null) {
            ae.m9218a(textView, str2, mVar);
        } else {
            textView.setText(str2);
        }
        textView = (TextView) findViewById(C7582R.id.primary_button);
        textView.setText(str3.toUpperCase(getResources().getConfiguration().locale));
        textView.setOnClickListener(onClickListener);
        if (str != null) {
            textView = (TextView) findViewById(C7582R.id.card_title);
            textView.setVisibility(0);
            textView.setText(str);
        }
        return this;
    }

    public final void m15889a(String str, OnClickListener onClickListener) {
        TextView textView = (TextView) findViewById(C7582R.id.secondary_button);
        textView.setText(str.toUpperCase(getResources().getConfiguration().locale));
        textView.setOnClickListener(onClickListener);
        textView.setVisibility(0);
    }
}
