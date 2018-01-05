package com.google.android.finsky.permissionui;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.aa.C0955b;
import com.squareup.leakcanary.C7582R;

public class AppSecurityPermissions extends LinearLayout {
    public Context f19282a;
    public C3874e f19283b;
    public String f19284c;

    public AppSecurityPermissions(Context context) {
        this(context, null);
    }

    public AppSecurityPermissions(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void m18358a(C3874e c3874e, String str) {
        this.f19282a = getContext();
        this.f19284c = str;
        this.f19283b = c3874e;
        removeAllViews();
        int count = this.f19283b.getCount();
        if (this.f19283b.mo3829c()) {
            TextView textView = (TextView) LayoutInflater.from(this.f19282a).inflate(C7582R.layout.no_permissions_required, this, false);
            String string;
            if (TextUtils.isEmpty((String) C0955b.f5857A.m28964b())) {
                if (this.f19283b.mo3828a()) {
                    string = this.f19282a.getString(C7582R.string.no_new_dangerous_permissions, new Object[]{this.f19284c});
                } else {
                    string = this.f19282a.getString(C7582R.string.no_dangerous_permissions, new Object[]{this.f19284c});
                }
                textView.setText(Html.fromHtml(string));
            } else {
                int i;
                if (this.f19283b.mo3828a()) {
                    i = C7582R.string.no_new_dangerous_permissions_with_learn_more_link;
                } else {
                    i = C7582R.string.no_dangerous_permissions_with_learn_more_link;
                }
                textView.setText(Html.fromHtml(getResources().getString(i, new Object[]{this.f19284c, string})));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            addView(textView);
            return;
        }
        for (int i2 = 0; i2 < count; i2++) {
            addView(this.f19283b.getView(i2, null, this));
        }
    }
}
