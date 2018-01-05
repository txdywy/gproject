package com.google.android.wallet.instrumentmanager.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.a.a.a.a.b.a.a.f.g;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.b;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.instrumentmanager.C6629a;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.instrumentmanager.C6641d;
import com.google.android.wallet.instrumentmanager.C6643f;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6513c;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.ui.common.ButtonComponent;
import com.google.android.wallet.ui.common.C6526e;
import com.google.android.wallet.ui.common.C6752d;
import com.google.android.wallet.ui.common.cg;
import com.google.android.wallet.ui.common.ci;
import java.util.List;
import java.util.Locale;

public class ButtonBar extends LinearLayout implements OnFocusChangeListener {
    public FlexboxLayout f32882a;
    public Button f32883b;
    public Button f32884c;
    public Button f32885d;
    public ImageView f32886e;
    public C6526e f32887f;
    public C6513c f32888g;
    public float f32889h;
    public int f32890i;
    public boolean f32891j;
    public boolean f32892k;
    public boolean f32893l;
    public int f32894m;
    public int f32895n;
    public int f32896o;
    public boolean f32897p;
    public LogContext f32898q;

    public ButtonBar(Context context) {
        super(context);
    }

    public ButtonBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30158a(context, attributeSet);
    }

    public ButtonBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30158a(context, attributeSet);
    }

    private final void m30158a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6643f.WalletImButtonBar);
        this.f32891j = obtainStyledAttributes.getBoolean(C6643f.WalletImButtonBar_capitalizeButtonText, false);
        this.f32892k = obtainStyledAttributes.getBoolean(C6643f.WalletImButtonBar_showNegativeButton, false);
        this.f32893l = obtainStyledAttributes.getBoolean(C6643f.WalletImButtonBar_hideNegativeButtonText, false);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6629a.imButtonBarSubmitButtonBetweenMarginHorizontal, C6629a.imButtonBarSubmitButtonBetweenMarginVertical, C6629a.imButtonMinimumTouchTargetSize});
        this.f32895n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f32894m = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f32890i = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32886e = (ImageView) findViewById(C6634c.logo);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6629a.imButtonBarIntegratorLogoDrawable, C6629a.imPositiveButtonBarAlphaWhenDisabled});
        TypedValue peekValue = obtainStyledAttributes.peekValue(0);
        this.f32889h = obtainStyledAttributes.getFloat(1, -1.0f);
        obtainStyledAttributes.recycle();
        ci.m30860a(this.f32886e, peekValue);
        this.f32897p = this.f32886e.getVisibility() == 0;
        this.f32884c = (Button) findViewById(C6634c.expand_btn);
        this.f32885d = (Button) findViewById(C6634c.error_btn);
        this.f32882a = (FlexboxLayout) findViewById(C6634c.dynamic_button_container);
        this.f32883b = (Button) findViewById(C6634c.negative_btn);
        if (this.f32891j) {
            this.f32883b.setText(this.f32883b.getText().toString().toUpperCase(getResources().getConfiguration().locale));
        }
        m30162a(this.f32892k);
        if (this.f32893l) {
            this.f32883b.setText(null);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cg cgVar;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (getTouchDelegate() == null) {
            TouchDelegate cgVar2 = new cg(this);
            setTouchDelegate(cgVar2);
            cgVar = cgVar2;
        } else {
            cgVar = (cg) getTouchDelegate();
        }
        m30159a(cgVar, this.f32883b);
        m30159a(cgVar, this.f32884c);
        int childCount = this.f32882a.getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            m30159a(cgVar, (Button) this.f32882a.getChildAt(i5));
        }
        List<b> flexLines = this.f32882a.getFlexLines();
        int childCount2 = this.f32882a.getChildCount();
        if (childCount2 <= 1) {
            return;
        }
        if ((this.f32895n != 0 || this.f32894m != 0) && this.f32896o != flexLines.size()) {
            this.f32896o = flexLines.size();
            int i6 = 0;
            while (i6 < childCount2) {
                ButtonComponent buttonComponent = (ButtonComponent) this.f32882a.getChildAt(i6);
                i5 = 0;
                childCount = 0;
                for (b bVar : flexLines) {
                    int i7 = bVar.h + i5;
                    if (i6 >= i5 && i6 < i7) {
                        i5 = i6 - i5;
                        break;
                    } else {
                        childCount++;
                        i5 = i7;
                    }
                }
                i5 = 0;
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) buttonComponent.getLayoutParams();
                if (i5 > 0) {
                    r.b(marginLayoutParams, r.b(marginLayoutParams) + this.f32895n);
                }
                if (childCount > 0) {
                    marginLayoutParams.bottomMargin += this.f32894m;
                }
                buttonComponent.setLayoutParams(marginLayoutParams);
                i6++;
            }
        }
    }

    private final void m30159a(cg cgVar, Button button) {
        if (button.getVisibility() == 0 && (button.getHeight() < this.f32890i || button.getWidth() < this.f32890i)) {
            Rect rect = new Rect();
            ci.m30853a(rect, (View) button, (View) this, this.f32890i, this.f32890i);
            if (button == null) {
                throw new NullPointerException("delegateView cannot be null");
            }
            cgVar.f33633b.put(button, new TouchDelegate(rect, button));
        } else if (((TouchDelegate) cgVar.f33633b.remove(button)) == cgVar.f33634c) {
            cgVar.f33634c = null;
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("negativeButtonShowing", this.f32883b.getVisibility() == 0);
        bundle.putBoolean("expandButtonEnabled", this.f32884c.isEnabled());
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
            m30162a(bundle.getBoolean("negativeButtonShowing"));
            this.f32884c.setEnabled(bundle.getBoolean("expandButtonEnabled"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setDynamicButtonsEnabled(boolean z) {
        int childCount = this.f32882a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Button button = (Button) this.f32882a.getChildAt(i);
            button.setEnabled(z);
            if (this.f32889h >= 0.0f) {
                button.setAlpha(z ? 1.0f : this.f32889h);
            }
        }
    }

    public void setExpandButtonEnabled(boolean z) {
        this.f32884c.setEnabled(z);
    }

    public void setLogContext(LogContext logContext) {
        this.f32898q = logContext;
        int childCount = this.f32882a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C6752d) this.f32882a.getChildAt(i)).setLogContext(this.f32898q);
        }
    }

    public void setDynamicButtons(g[] gVarArr) {
        int childCount = this.f32882a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object obj = (ButtonComponent) this.f32882a.getChildAt(i);
            C6516f.m29561a(obj, obj.getUiSpec().b, this.f32888g);
        }
        this.f32882a.removeAllViews();
        this.f32896o = 0;
        for (g gVar : gVarArr) {
            View view;
            LayoutInflater from = LayoutInflater.from(getContext());
            ButtonComponent buttonComponent;
            switch (gVar.i) {
                case 0:
                    view = (ButtonComponent) from.inflate(C6641d.view_button_standard, this, false);
                    break;
                case 2:
                    buttonComponent = (ButtonComponent) from.inflate(C6641d.view_button_primary_submit, this, false);
                    break;
                case 12:
                    buttonComponent = (ButtonComponent) from.inflate(C6641d.view_button_secondary_submit, this, false);
                    break;
                default:
                    throw new IllegalStateException(String.format(Locale.US, "Button of type %d not supported inside simple form", new Object[]{Integer.valueOf(gVar.i)}));
            }
            view.setUiSpecification(gVar);
            view.setLogContext(this.f32898q);
            view.setBaseButtonComponentOnClickListener(this.f32887f);
            view.setOnFocusChangeListener(this);
            this.f32882a.addView(view);
        }
        m30160b();
        m30161a();
    }

    private final void m30160b() {
        int i;
        if (this.f32897p) {
            if (!(this.f32883b.getVisibility() == 0 || this.f32884c.getVisibility() == 0)) {
                int childCount = this.f32882a.getChildCount();
                i = 0;
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (this.f32882a.getChildAt(i2).getVisibility() == 0) {
                        i++;
                    }
                }
                if (i <= 1) {
                    i = 0;
                    this.f32886e.setVisibility(i);
                }
            }
            if (this.f32885d.getVisibility() == 0) {
                i = 0;
                this.f32886e.setVisibility(i);
            }
        }
        i = 8;
        this.f32886e.setVisibility(i);
    }

    public void setExpandButtonText(String str) {
        this.f32884c.setText(str);
    }

    public void setErrorButtonText(String str) {
        this.f32885d.setText(str);
    }

    public void setDynamicButtonsOnClickListener(C6526e c6526e) {
        this.f32887f = c6526e;
        int childCount = this.f32882a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ButtonComponent) this.f32882a.getChildAt(i)).setBaseButtonComponentOnClickListener(c6526e);
        }
    }

    public void setNegativeButtonOnClickListener(OnClickListener onClickListener) {
        this.f32883b.setOnClickListener(onClickListener);
    }

    public void setExpandButtonOnClickListener(OnClickListener onClickListener) {
        this.f32884c.setOnClickListener(onClickListener);
    }

    public void setErrorButtonOnClickListener(OnClickListener onClickListener) {
        this.f32885d.setOnClickListener(onClickListener);
    }

    public final void m30162a(boolean z) {
        if (!z) {
            this.f32883b.setVisibility(8);
        } else if (this.f32884c.getVisibility() == 0) {
            throw new IllegalStateException("Can't show negative button while expand button is visible.");
        } else {
            this.f32883b.setVisibility(0);
        }
        m30160b();
    }

    public final void m30163b(boolean z) {
        if (z) {
            this.f32885d.setVisibility(0);
            this.f32885d.setEnabled(true);
            this.f32882a.setVisibility(8);
        } else {
            this.f32885d.setVisibility(8);
            this.f32885d.setEnabled(false);
            this.f32882a.setVisibility(0);
        }
        m30160b();
    }

    public final void m30164c(boolean z) {
        if (!z) {
            this.f32884c.setVisibility(8);
        } else if (this.f32883b.getVisibility() == 0) {
            throw new IllegalStateException("Can't show expand button while negative button is visible.");
        } else {
            this.f32884c.setVisibility(0);
        }
        m30160b();
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            ci.m30879b(view.getContext(), view);
        }
    }

    public final void m30161a() {
        int childCount = this.f32882a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ButtonComponent buttonComponent = (ButtonComponent) this.f32882a.getChildAt(i);
            long j = buttonComponent.getUiSpec().b;
            C6512i c6512i = this.f32888g;
            C6516f.m29562a(buttonComponent, j, c6512i, c6512i);
        }
    }
}
