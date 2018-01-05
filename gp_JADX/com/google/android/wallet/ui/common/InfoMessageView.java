package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.support.v4.widget.bg;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.common.util.C6596h;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6626j;
import com.google.android.wallet.ui.common.p403a.C6759a;
import java.util.List;
import java.util.Locale;

public class InfoMessageView extends LinearLayout implements C6504m, C6511g, aa, C6527m {
    public TextView f32899a;
    public TextView f32900b;
    public boolean f32901c = true;
    public boolean f32902d = true;
    public boolean f32903e = true;
    public int f32904f;
    public ae f32905g;
    public C6504m f32906h;
    public C6527m f32907i;
    public final C6506n f32908j = new C6506n(1627);
    public C6494b f32909k;
    public at f32910l;
    public bl f32911m;
    public C6759a f32912n;
    public C6759a f32913o;
    public ColorStateList f32914p;
    public ColorStateList f32915q;
    public int f32916r;
    public int f32917s;

    public InfoMessageView(Context context) {
        super(context, null);
        m30167a();
    }

    public InfoMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30167a();
        m30169a(context, attributeSet);
    }

    public InfoMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30167a();
        m30169a(context, attributeSet);
    }

    @TargetApi(16)
    private final void m30169a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6617a.uicAlwaysInlineExpandLabel});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicInfoMessageView);
        if (z) {
            this.f32901c = true;
        } else {
            this.f32901c = obtainStyledAttributes.getBoolean(C6626j.WalletUicInfoMessageView_internalUicInlineExpandLabel, true);
        }
        this.f32916r = obtainStyledAttributes.getResourceId(C6626j.WalletUicInfoMessageView_internalUicInfoMessageTextAppearance, -1);
        this.f32917s = obtainStyledAttributes.getInt(C6626j.WalletUicInfoMessageView_internalUicInfoMessageTextForceGravity, -1);
        z = obtainStyledAttributes.getBoolean(C6626j.f32794xaec48125, true);
        this.f32899a.setIncludeFontPadding(z);
        this.f32900b.setIncludeFontPadding(z);
        if (VERSION.SDK_INT >= 16 && obtainStyledAttributes.hasValue(C6626j.f32795x19f63c8c)) {
            float dimension = obtainStyledAttributes.getDimension(C6626j.f32795x19f63c8c, 0.0f);
            this.f32899a.setLineSpacing(dimension, this.f32899a.getLineSpacingMultiplier());
            this.f32900b.setLineSpacing(dimension, this.f32900b.getLineSpacingMultiplier());
        }
        obtainStyledAttributes.recycle();
    }

    private final void m30167a() {
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(C6623g.view_info_message_view, this);
        this.f32899a = (TextView) findViewById(C6622f.message);
        this.f32900b = (TextView) findViewById(C6622f.detailed_message);
        setVisibility(getVisibility());
        this.f32912n = new C6759a(this.f32899a);
        ai.a(this, this.f32912n);
        this.f32913o = new C6759a(this.f32900b);
        ai.a(this, this.f32913o);
    }

    public void setVisibility(int i) {
        this.f32904f = i;
        if (TextUtils.isEmpty(this.f32899a.getText()) && TextUtils.isEmpty(this.f32900b.getText())) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    public int getBaseline() {
        int paddingTop = getPaddingTop();
        int baseline = super.getBaseline();
        if (this.f32899a.getVisibility() == 0) {
            return this.f32899a.getBaseline() + paddingTop;
        }
        if (this.f32900b.getVisibility() == 0) {
            return this.f32900b.getBaseline() + paddingTop;
        }
        return baseline;
    }

    public void setLinkify(boolean z) {
        this.f32903e = z;
    }

    public void setInfoMessage(ae aeVar) {
        boolean z = true;
        if (aeVar != null) {
            boolean z2;
            if (TextUtils.isEmpty(aeVar.e)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (aeVar.d == null) {
                z = false;
            }
            if (!z2 && !r1) {
                throw new IllegalArgumentException("Info message must contain a message.");
            } else if (z2 && r1) {
                throw new IllegalArgumentException("Info message cannot contain both messageHtml and messageTemplate.");
            }
        }
        this.f32905g = aeVar;
        this.f32902d = false;
        this.f32911m = null;
        m30174c();
    }

    public ae getInfoMessage() {
        return this.f32905g;
    }

    private final void m30174c() {
        if (this.f32905g == null) {
            this.f32899a.setText("");
            this.f32899a.setVisibility(8);
            this.f32900b.setText("");
            this.f32900b.setVisibility(8);
            this.f32902d = true;
        } else {
            if (this.f32905g.d != null) {
                this.f32900b.setText("");
                this.f32902d = true;
                if (this.f32911m == null) {
                    this.f32911m = new bl(this.f32905g.d);
                }
                if (!(this.f32911m.m30755a() || this.f32910l == null)) {
                    C6596h.m29924a(this.f32910l, this.f32911m);
                }
                if (this.f32911m.m30755a()) {
                    m30172a(this.f32899a, this.f32911m.m30757b());
                }
            } else {
                m30172a(this.f32899a, this.f32905g.e);
                this.f32899a.setVisibility(0);
                if (TextUtils.isEmpty(this.f32905g.f)) {
                    this.f32900b.setText("");
                    this.f32900b.setVisibility(8);
                    this.f32902d = true;
                } else {
                    m30172a(this.f32900b, this.f32905g.f);
                    if (TextUtils.isEmpty(this.f32905g.g)) {
                        this.f32900b.setVisibility(0);
                        this.f32902d = true;
                    } else if (this.f32902d) {
                        this.f32900b.setVisibility(0);
                        this.f32899a.setVisibility(8);
                    } else if (!this.f32901c) {
                        this.f32900b.setVisibility(8);
                    } else if (this.f32903e) {
                        this.f32900b.setVisibility(8);
                        ClickSpan.m30593a(this.f32899a, String.format("%s <a href=\"%s\">%s</a>", new Object[]{this.f32905g.e, "expandInfoText", this.f32905g.g}), this);
                    } else {
                        throw new IllegalArgumentException("InfoMessageView inline expand label can only be used when linkify is true");
                    }
                }
            }
            m30170a(this.f32899a, this.f32905g.h);
            m30170a(this.f32900b, this.f32905g.i);
            m30175f();
            if (this.f32905g.j) {
                LayoutParams layoutParams = (LayoutParams) getLayoutParams();
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            }
        }
        setVisibility(this.f32904f);
    }

    public void setParentUiNode(C6504m c6504m) {
        this.f32906h = c6504m;
    }

    public void setUrlClickListener(C6527m c6527m) {
        this.f32907i = c6527m;
    }

    public final void m30180a(boolean z) {
        if (this.f32902d != z) {
            if (z) {
                m30168a(1628);
            }
            this.f32902d = z;
            m30174c();
        }
    }

    private static void m30171a(TextView textView, ColorStateList colorStateList) {
        textView.setTextColor(colorStateList.getColorForState(new int[]{-16842910}, colorStateList.getDefaultColor()));
    }

    private final void m30168a(int i) {
        if (this.f32909k != null) {
            this.f32909k.mo5561a(this, i);
        }
    }

    public String getExpandLabel() {
        return this.f32905g.g;
    }

    public final void mo5472a(View view, String str) {
        if ("expandInfoText".equals(str)) {
            m30180a(true);
            return;
        }
        m30168a(1629);
        if (this.f32907i != null) {
            this.f32907i.mo5472a(this, str);
            return;
        }
        getContext().startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("messageSavedTextColors", this.f32914p);
        bundle.putParcelable("detailedMessageSavedTextColors", this.f32915q);
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putParcelable("infoMessage", ParcelableProto.m29885a(this.f32905g));
        bundle.putBoolean("expanded", this.f32902d);
        if (this.f32911m != null) {
            bl blVar = this.f32911m;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("messageBuilder.messageTemplate", ParcelableProto.m29885a(blVar.f33569b));
            bundle2.putStringArray("messageBuilder.displayValues", blVar.f33570c);
            bundle.putBundle("messageBuilder", bundle2);
        }
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f32905g = (ae) ParcelableProto.m29887a(bundle, "infoMessage");
            this.f32902d = bundle.getBoolean("expanded");
            this.f32911m = bl.m30751a(bundle.getBundle("messageBuilder"));
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            m30174c();
            this.f32914p = (ColorStateList) bundle.getParcelable("messageSavedTextColors");
            this.f32915q = (ColorStateList) bundle.getParcelable("detailedMessageSavedTextColors");
            if (this.f32914p != null) {
                m30171a(this.f32899a, this.f32914p);
            }
            if (this.f32915q != null) {
                m30171a(this.f32900b, this.f32915q);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public C6504m getParentUiNode() {
        return this.f32906h;
    }

    public C6506n getUiElement() {
        return this.f32908j;
    }

    public List getChildren() {
        return null;
    }

    public final boolean cQ_() {
        return true;
    }

    public final boolean mo5581e() {
        return true;
    }

    public final void mo5578a(CharSequence charSequence, boolean z) {
    }

    public CharSequence getError() {
        return "";
    }

    public final void cT_() {
        if (hasFocus() || !requestFocus()) {
            ci.m30882c((View) this);
        }
    }

    public void setParentFormElement(at atVar) {
        this.f32910l = atVar;
        if (this.f32905g != null && this.f32911m != null) {
            m30174c();
        }
    }

    public at getParentFormElement() {
        return this.f32910l;
    }

    public final String mo5522a(String str) {
        return "";
    }

    public void setAnalyticsClickListener(C6494b c6494b) {
        this.f32909k = c6494b;
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        switch (lVar.c) {
            case 1:
                setVisibility(0);
                return;
            case 11:
                setVisibility(8);
                return;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported resulting action type: %d", new Object[]{Integer.valueOf(lVar.c)}));
        }
    }

    private final void m30172a(TextView textView, String str) {
        if (this.f32903e) {
            ClickSpan.m30593a(textView, str, this);
        } else {
            textView.setText(str);
        }
    }

    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f32912n.a(motionEvent) || this.f32913o.a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    private final void m30170a(TextView textView, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = C6617a.internalUicDefaultDisplayType;
                break;
            case 3:
                i2 = C6617a.internalUicEmphasisDisplayType;
                break;
            case 4:
                i2 = C6617a.internalUicErrorDisplayType;
                break;
            case 5:
                i2 = C6617a.internalUicHeaderDisplayType;
                break;
            case 6:
                i2 = C6617a.internalUicSubHeaderDisplayType;
                break;
            case 7:
                i2 = C6617a.internalUicDetailDisplayType;
                break;
            case 8:
                i2 = C6617a.internalUicInfoDisplayType;
                break;
            case 9:
                i2 = C6617a.internalUicDetailInfoDisplayType;
                break;
            case 12:
                i2 = C6617a.internalUicScoreCardDisplayType;
                break;
            case 13:
                i2 = C6617a.internalUicPendingDisplayType;
                break;
            case 14:
                i2 = C6617a.internalUicInputDisplayType;
                break;
            default:
                i2 = this.f32916r;
                break;
        }
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            i2 = typedValue.data;
        } else {
            i2 = this.f32916r;
        }
        if (i2 > 0) {
            bg.a(textView, i2);
        }
    }

    public void setForcedGravity(int i) {
        if (this.f32917s != i) {
            this.f32917s = i;
            if (this.f32905g != null) {
                m30175f();
            }
        }
    }

    public int getForcedGravity() {
        return this.f32917s;
    }

    private final void m30175f() {
        m30173b(this.f32899a, this.f32905g.k);
        m30173b(this.f32900b, this.f32905g.k);
    }

    private final void m30173b(TextView textView, int i) {
        int i2;
        if (this.f32917s == -1) {
            switch (i) {
                case 2:
                    i2 = 8388629;
                    break;
                case 3:
                    i2 = 17;
                    break;
                default:
                    i2 = 8388627;
                    break;
            }
        }
        i2 = this.f32917s;
        textView.setGravity(i2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f32899a.setEnabled(z);
        this.f32900b.setEnabled(z);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f32899a.setOnClickListener(onClickListener);
        this.f32900b.setOnClickListener(onClickListener);
    }

    public String getText() {
        int i;
        int i2 = (this.f32899a.getVisibility() != 0 || TextUtils.isEmpty(this.f32899a.getText())) ? 0 : 1;
        if (this.f32900b.getVisibility() != 0 || TextUtils.isEmpty(this.f32900b.getText())) {
            i = 0;
        } else {
            i = 1;
        }
        String str = "";
        if (i2 != 0 && i != 0) {
            return String.format("%s\n%s", new Object[]{this.f32899a.getText(), this.f32900b.getText()});
        } else if (i2 != 0) {
            return this.f32899a.getText().toString();
        } else {
            return i != 0 ? this.f32900b.getText().toString() : str;
        }
    }

    public int getLineCount() {
        if (this.f32899a.getVisibility() == 0 && this.f32900b.getVisibility() == 0) {
            return this.f32899a.getLineCount() + this.f32900b.getLineCount();
        }
        if (this.f32899a.getVisibility() == 0) {
            return this.f32899a.getLineCount();
        }
        if (this.f32900b.getVisibility() == 0) {
            return this.f32900b.getLineCount();
        }
        return 0;
    }

    public float getTextSize() {
        if (this.f32899a.getVisibility() == 0) {
            return this.f32899a.getTextSize();
        }
        return this.f32900b.getTextSize();
    }

    public void setTextColor(int i) {
        this.f32899a.setTextColor(i);
        this.f32900b.setTextColor(i);
    }
}
