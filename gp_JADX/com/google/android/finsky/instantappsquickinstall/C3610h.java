package com.google.android.finsky.instantappsquickinstall;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v7.app.C0433y;
import android.support.v7.app.C0434z;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

@TargetApi(23)
public final class C3610h extends C0141p implements OnClickListener, OnShowListener {
    public C3602i af;
    public Document ag;
    public View ah;
    public ProgressBar ai;
    public C0433y aj;

    public final void m17211a(Document document) {
        this.ag = document;
        m17208W();
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (bundle != null && bundle.containsKey("document")) {
            m17211a((Document) bundle.getParcelable("document"));
        }
    }

    public final void mo135a(Context context) {
        super.mo135a(context);
        if (context instanceof C3602i) {
            this.af = (C3602i) context;
        } else {
            String valueOf = String.valueOf(context);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Wrong activity type ").append(valueOf).toString());
        }
    }

    public final Dialog mo143a(Bundle bundle) {
        View inflate = LayoutInflater.from(m603h()).inflate(C7582R.layout.quick_install_dialog, null);
        this.ah = inflate.findViewById(C7582R.id.loaded_message);
        this.ai = (ProgressBar) inflate.findViewById(C7582R.id.progressBar);
        this.aj = new C0434z(m601g()).m2639a(inflate).m2638a((int) C7582R.string.install, (OnClickListener) this).m2643b((int) C7582R.string.cancel, (OnClickListener) this).m2642a(false).m2637a();
        this.aj.setCanceledOnTouchOutside(false);
        this.aj.setOnShowListener(this);
        m17208W();
        return this.aj;
    }

    private final void m17208W() {
        if (this.ag != null && this.aj != null) {
            if (this.aj.isShowing()) {
                this.aj.findViewById(C7582R.id.buttonPanel).setVisibility(0);
            }
            this.ah.setVisibility(0);
            this.ai.setVisibility(8);
            TextView textView = (TextView) this.ah.findViewById(C7582R.id.install_message);
            Object a = m572a((int) C7582R.string.ia_quick_install_prompt, this.ag.f14885a.f12100g);
            CharSequence spannableString = new SpannableString(a);
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(m603h(), C7582R.style.Theme.QuickInstallDialog.PromptText.AppName);
            int indexOf = a.indexOf(this.ag.f14885a.f12100g);
            spannableString.setSpan(textAppearanceSpan, indexOf, this.ag.f14885a.f12100g.length() + indexOf, 33);
            textView.setText(spannableString, BufferType.SPANNABLE);
            this.aj.setCancelable(true);
            this.aj.setCanceledOnTouchOutside(true);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.af.mo3551h(false);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        C3602i c3602i = this.af;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        c3602i.mo3551h(z);
        m626a(false);
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.ag == null) {
            this.aj.findViewById(C7582R.id.buttonPanel).setVisibility(8);
            this.aj.getWindow().setLayout(-2, -2);
            return;
        }
        this.aj.findViewById(C7582R.id.buttonPanel).setVisibility(0);
        this.aj.getWindow().setLayout(-1, -2);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        if (this.ag != null) {
            bundle.putParcelable("document", this.ag);
        }
    }
}
