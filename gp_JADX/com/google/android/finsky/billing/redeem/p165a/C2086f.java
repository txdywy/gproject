package com.google.android.finsky.billing.redeem.p165a;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.finsky.bg.C1618s;
import com.squareup.leakcanary.C7582R;

final class C2086f implements OnEditorActionListener {
    public final /* synthetic */ C2084d f10642a;

    C2086f(C2084d c2084d) {
        this.f10642a = c2084d;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            if (TextUtils.isEmpty(this.f10642a.f10638d.getText())) {
                this.f10642a.m10922a(this.f10642a.m592c((int) C7582R.string.blank_code_redeem));
            } else {
                this.f10642a.m10923a(true);
            }
        } else if (i == 7) {
            C1618s.m9293a(this.f10642a.m603h(), this.f10642a.f10638d);
        }
        return false;
    }
}
