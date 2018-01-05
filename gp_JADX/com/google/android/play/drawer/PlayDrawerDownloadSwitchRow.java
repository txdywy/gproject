package com.google.android.play.drawer;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.eq;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.play.C6282d;
import com.google.android.play.C6316g;

class PlayDrawerDownloadSwitchRow extends RelativeLayout implements OnClickListener, Checkable, OnCheckedChangeListener {
    public static final boolean f31372a = (VERSION.SDK_INT >= 16);
    public TextView f31373b;
    public Switch f31374c;
    public boolean f31375d;
    public int f31376e;
    public int f31377f;
    public boolean f31378g;
    public C6291f f31379h;
    public final OnTouchListener f31380i;

    public PlayDrawerDownloadSwitchRow(Context context) {
        this(context, null);
    }

    public PlayDrawerDownloadSwitchRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31380i = new C6295e();
        this.f31376e = getResources().getColor(C6282d.play_fg_primary);
    }

    @SuppressLint({"NewApi"})
    public final void m28853a(C6297l c6297l) {
        this.f31377f = c6297l.f31472b;
        int i = c6297l.f31474d;
        int i2 = c6297l.f31473c;
        if (f31372a) {
            if (i2 != -1) {
                this.f31374c.setTrackResource(i2);
            }
            if (i != -1) {
                this.f31374c.setThumbResource(i);
            }
            this.f31374c.setContentDescription(c6297l.f31471a);
        }
        this.f31373b.setText(c6297l.f31471a);
        this.f31373b.setGravity(8388627);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f31373b = (TextView) findViewById(C6316g.action_text);
        setOnClickListener(this);
        View findViewById = findViewById(C6316g.switch_button);
        if (findViewById != null) {
            this.f31374c = (Switch) findViewById;
            this.f31374c.setOnCheckedChangeListener(this);
            this.f31374c.setOnTouchListener(this.f31380i);
        }
    }

    @SuppressLint({"NewApi"})
    public void setChecked(boolean z) {
        if (this.f31375d != z) {
            m28854a(z);
            if (!this.f31378g) {
                if (VERSION.SDK_INT >= 14) {
                    sendAccessibilityEvent(eq.FLAG_MOVED);
                }
                this.f31378g = true;
                if (this.f31379h != null) {
                    this.f31379h.mo5387a(z);
                }
                this.f31378g = false;
            }
        }
    }

    @TargetApi(14)
    public final void m28854a(boolean z) {
        this.f31375d = z;
        if (f31372a && this.f31374c != null) {
            this.f31374c.setChecked(z);
            this.f31374c.refreshDrawableState();
        }
        this.f31373b.setTextColor(z ? this.f31377f : this.f31376e);
    }

    public boolean isChecked() {
        return this.f31375d;
    }

    public void toggle() {
        setChecked(!this.f31375d);
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f31375d) {
            mergeDrawableStates(onCreateDrawableState, new int[]{16843014});
        }
        return onCreateDrawableState;
    }

    public void onClick(View view) {
        toggle();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z != this.f31375d) {
            setChecked(z);
        }
    }

    @TargetApi(16)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CheckBox.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f31375d);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(PlayDrawerDownloadSwitchRow.class.getName());
        accessibilityEvent.setChecked(this.f31375d);
    }
}
