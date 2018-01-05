package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.squareup.leakcanary.C7582R;

public class ButtonBar extends LinearLayout implements OnClickListener {
    public static final boolean f16158a = (VERSION.SDK_INT < 21);
    public Button f16159b;
    public Button f16160c;
    public C1056b f16161d;
    public Paint f16162e;

    public ButtonBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (f16158a) {
            this.f16162e = new Paint();
            this.f16162e.setColor(context.getResources().getColor(C7582R.color.play_multi_primary));
            this.f16162e.setStrokeWidth(1.0f);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16159b = (Button) findViewById(C7582R.id.positive_button);
        this.f16160c = (Button) findViewById(C7582R.id.negative_button);
        this.f16159b.setText(this.f16159b.getText().toString().toUpperCase());
        this.f16160c.setText(this.f16160c.getText().toString().toUpperCase());
    }

    public void setPositiveButtonTitle(int i) {
        setPositiveButtonTitle(getResources().getString(i));
    }

    public void setPositiveButtonTitle(String str) {
        this.f16159b.setText(str.toUpperCase());
    }

    public void setNegativeButtonTitle(int i) {
        setNegativeButtonTitle(getResources().getString(i));
    }

    public void setNegativeButtonTitle(String str) {
        this.f16160c.setText(str.toUpperCase());
    }

    public void setPositiveButtonTextColor(int i) {
        this.f16159b.setTextColor(i);
    }

    public void setNegativeButtonTextColor(int i) {
        this.f16160c.setTextColor(i);
    }

    public void setPositiveButtonEnabled(boolean z) {
        this.f16159b.setEnabled(z);
    }

    public boolean getPositiveButtonEnabled() {
        return this.f16159b.isEnabled();
    }

    public void setNegativeButtonEnabled(boolean z) {
        this.f16160c.setEnabled(z);
    }

    public boolean getNegativeButtonEnabled() {
        return this.f16160c.isEnabled();
    }

    public void setPositiveButtonVisible(boolean z) {
        this.f16159b.setVisibility(z ? 0 : 8);
    }

    public void setNegativeButtonVisible(boolean z) {
        this.f16160c.setVisibility(z ? 0 : 8);
    }

    public void setClickListener(C1056b c1056b) {
        this.f16161d = c1056b;
        this.f16159b.setOnClickListener(this);
        this.f16160c.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (this.f16161d == null) {
            return;
        }
        if (view == this.f16159b) {
            this.f16161d.u_();
        } else if (view == this.f16160c) {
            this.f16161d.v_();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16162e != null) {
            canvas.drawLine(0.0f, 0.0f, (float) getWidth(), 0.0f, this.f16162e);
        }
    }
}
