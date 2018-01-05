package com.google.android.finsky.verifier.impl;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.finsky.aa.C0955b;

final class ae extends ClickableSpan {
    public final /* synthetic */ PackageWarningDialogView f24380a;

    ae(PackageWarningDialogView packageWarningDialogView) {
        this.f24380a = packageWarningDialogView;
    }

    public final void onClick(View view) {
        this.f24380a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) C0955b.ix.m28964b())));
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
