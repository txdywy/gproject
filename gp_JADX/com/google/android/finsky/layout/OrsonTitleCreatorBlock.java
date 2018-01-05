package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class OrsonTitleCreatorBlock extends RelativeLayout {
    public TextView f18267a;
    public TextView f18268b;
    public TextView f18269c;
    public TextView f18270d;

    public OrsonTitleCreatorBlock(Context context) {
        this(context, null);
    }

    public OrsonTitleCreatorBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18267a = (TextView) findViewById(C1592a.an.intValue());
        this.f18268b = (TextView) findViewById(C1592a.ao.intValue());
        this.f18269c = (TextView) findViewById(C7582R.id.orson_book_duration);
        this.f18270d = (TextView) findViewById(C1592a.ap.intValue());
    }

    public final void m17327a(au auVar) {
        if (!TextUtils.isEmpty(auVar.f18498b)) {
            this.f18268b.setText(auVar.f18498b);
            this.f18268b.setVisibility(0);
        }
        if (!TextUtils.isEmpty(auVar.f18500d)) {
            CharSequence string;
            if (auVar.f18499c) {
                string = getResources().getString(C7582R.string.abridged_duration, new Object[]{auVar.f18500d});
            } else {
                string = auVar.f18500d;
            }
            this.f18269c.setText(string);
            this.f18269c.setVisibility(0);
        }
        if (!auVar.f18502f && !TextUtils.isEmpty(auVar.f18501e)) {
            try {
                this.f18270d.setText(C1473m.f7980a.bb().m21827a(auVar.f18501e));
                this.f18270d.setVisibility(0);
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Cannot parse ISO 8601 date", new Object[0]);
                this.f18270d.setVisibility(8);
            }
        }
    }
}
