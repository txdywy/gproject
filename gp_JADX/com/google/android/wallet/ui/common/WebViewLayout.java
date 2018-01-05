package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.wallet.a.a;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6622f;
import java.util.Collections;
import java.util.List;

public class WebViewLayout extends RelativeLayout implements OnClickListener, OnKeyListener, OnTouchListener, C6504m, C6758r {
    public final C6506n f33489a = new C6506n(1630);
    public WebView f33490b;
    public ProgressBar f33491c;
    public View f33492d;
    public TextView f33493e;
    public ImageButton f33494f;
    public View f33495g;
    public TextView f33496h;
    public View f33497i;
    public boolean f33498j;
    public boolean f33499k;
    public String f33500l;
    public String f33501m;
    public C6504m f33502n;
    public String f33503o;
    public String f33504p;
    public C6702q f33505q = new C6702q(this);
    public cx f33506r;
    public int f33507s = 1;

    public WebViewLayout(Context context) {
        super(context);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public WebViewLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setHeaderView(View view) {
        if (this.f33497i != null) {
            throw new IllegalArgumentException("Only a single header view is supported.");
        }
        this.f33497i = view;
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) getResources().getDimension(C6620d.wallet_uic_web_view_layout_header_bottom_margin);
        this.f33497i.setLayoutParams(layoutParams);
        ((RelativeLayout.LayoutParams) this.f33490b.getLayoutParams()).addRule(ci.m30835a(3), C6622f.web_view_layout_header);
        ((RelativeLayout.LayoutParams) this.f33495g.getLayoutParams()).addRule(ci.m30835a(3), C6622f.web_view_layout_header);
        ((RelativeLayout.LayoutParams) this.f33492d.getLayoutParams()).addRule(ci.m30835a(3), C6622f.web_view_layout_header);
        this.f33497i.setId(C6622f.web_view_layout_header);
        addView(this.f33497i, 0);
    }

    public void setParentUiNode(C6504m c6504m) {
        this.f33502n = c6504m;
    }

    public void setWebViewClient(C6702q c6702q) {
        if (c6702q == null) {
            c6702q = new C6702q();
        }
        this.f33505q = c6702q;
        this.f33505q.f33047v = this;
        if (this.f33490b != null) {
            this.f33490b.setWebViewClient(this.f33505q);
        }
    }

    public void setUserAgent(String str) {
        this.f33490b.getSettings().setUserAgentString(str);
    }

    public void setLoadingText(String str) {
        this.f33503o = str;
        if (this.f33496h != null) {
            this.f33496h.setText(this.f33503o);
            this.f33496h.setVisibility(!TextUtils.isEmpty(this.f33503o) ? 0 : 8);
        }
    }

    public void setErrorText(String str) {
        this.f33504p = str;
        if (this.f33493e != null) {
            this.f33493e.setText(str);
        }
    }

    public void setWebViewSizingMode(int i) {
        this.f33507s = i;
        if (this.f33490b != null) {
            this.f33490b.setLayoutParams(m30698b());
        }
    }

    private final RelativeLayout.LayoutParams m30698b() {
        switch (this.f33507s) {
            case 2:
                return new RelativeLayout.LayoutParams(-1, -1);
            default:
                return new RelativeLayout.LayoutParams(-2, -2);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33499k = true;
        if (TextUtils.isEmpty(this.f33490b.getOriginalUrl())) {
            this.f33498j = false;
            if (!TextUtils.isEmpty(this.f33500l)) {
                m30699b(this.f33500l, this.f33501m);
            }
        }
        if (this.f33491c == null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6617a.internalUicWebViewProgressBarId});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                this.f33491c = (ProgressBar) getRootView().findViewById(resourceId);
            }
            if (this.f33491c == null) {
                this.f33491c = (ProgressBar) findViewById(C6622f.progress_bar_web_view);
            }
            cx cxVar = this.f33506r;
            cxVar.f33668a = this.f33491c;
            cxVar.f33668a.setMax(100);
            cxVar.m30921a();
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f33492d = findViewById(C6622f.error_overlay);
        this.f33493e = (TextView) this.f33492d.findViewById(C6622f.error_msg);
        if (!TextUtils.isEmpty(this.f33504p)) {
            this.f33493e.setText(this.f33504p);
        }
        this.f33494f = (ImageButton) this.f33492d.findViewById(C6622f.refresh_button);
        this.f33494f.setOnClickListener(this);
        this.f33495g = findViewById(C6622f.loading_overlay);
        ((ViewStub) this.f33495g.findViewById(C6622f.loading_progress)).inflate();
        this.f33496h = (TextView) this.f33495g.findViewById(C6622f.loading_msg);
        this.f33496h.setText(this.f33503o);
        this.f33496h.setVisibility(TextUtils.isEmpty(this.f33503o) ? 8 : 0);
        this.f33490b = new cz(getContext());
        this.f33490b.setLayoutParams(m30698b());
        this.f33490b.setId(C6622f.web_view_layout_web_view);
        this.f33490b.setVisibility(4);
        this.f33490b.setOnKeyListener(this);
        this.f33490b.setOnTouchListener(this);
        WebSettings settings = this.f33490b.getSettings();
        settings.setSupportZoom(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        this.f33490b.setWebViewClient(this.f33505q);
        this.f33506r = new cx(this.f33490b.getContext());
        this.f33490b.setWebChromeClient(this.f33506r);
        addView(this.f33490b, 0);
        this.f33490b.requestFocus();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
            this.f33498j = bundle.getBoolean("pageLoaded");
            if (!this.f33498j || this.f33490b.restoreState(bundle) == null) {
                this.f33498j = false;
                m30699b(this.f33500l, this.f33501m);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f33490b.canGoBack()) {
            return false;
        }
        this.f33490b.goBack();
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    public void onClick(View view) {
        if (view == this.f33494f) {
            this.f33492d.setVisibility(8);
            this.f33490b.setVisibility(0);
            this.f33490b.reload();
        }
    }

    public WebView getWebView() {
        return this.f33490b;
    }

    public C6504m getParentUiNode() {
        return this.f33502n;
    }

    public C6506n getUiElement() {
        return this.f33489a;
    }

    public List getChildren() {
        if (this.f33497i instanceof C6504m) {
            return Collections.singletonList((C6504m) this.f33497i);
        }
        return null;
    }

    public final void mo5660a(WebView webView, String str) {
        if (str.equals(this.f33500l)) {
            this.f33495g.setVisibility(0);
            this.f33506r.m30923a(false);
            webView.setVisibility(8);
        }
    }

    public final void mo5659a(WebView webView) {
        this.f33495g.setVisibility(8);
        this.f33506r.m30923a(true);
        if (!(this.f33492d.getVisibility() == 0 || webView.getVisibility() == 0)) {
            webView.setVisibility(0);
            webView.scrollTo(0, 0);
        }
        this.f33498j = true;
    }

    public final void mo5657a() {
        this.f33495g.setVisibility(8);
        this.f33506r.m30923a(true);
        this.f33492d.setVisibility(0);
        this.f33490b.setVisibility(4);
        this.f33498j = false;
    }

    public final void mo5658a(Message message) {
        message.sendToTarget();
    }

    public final void m30704a(String str, String str2) {
        if (this.f33499k) {
            m30699b(str, str2);
            return;
        }
        this.f33500l = str;
        this.f33501m = str2;
    }

    private final void m30699b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            this.f33490b.loadUrl(str);
            return;
        }
        try {
            this.f33490b.postUrl(str, str2.getBytes("UTF-8"));
        } catch (Throwable e) {
            Throwable th = e;
            if (((Boolean) a.i.a()).booleanValue()) {
                throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Couldn't post to url: ").append(str).append(" with data: ").append(str2).toString(), th);
            }
            String str3 = "Couldn't post to url: ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    public /* synthetic */ Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("pageLoaded", this.f33498j);
        if (this.f33498j) {
            this.f33490b.saveState(bundle);
        }
        return bundle;
    }
}
