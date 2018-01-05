package com.google.android.finsky.layout.structuredreviews;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ai;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import com.google.android.finsky.bg.C1608h;
import com.squareup.leakcanary.C7582R;

public class ReviewCommentQuestion extends C3721a implements TextWatcher {
    public EditText f18817c;
    public C1145c f18818d;

    public ReviewCommentQuestion(Context context) {
        this(context, null);
    }

    public ReviewCommentQuestion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18817c = (EditText) findViewById(C7582R.id.review_comment);
    }

    public final void m17596a(CharSequence charSequence, int i, String str) {
        super.m17594a(charSequence);
        this.f18817c.removeTextChangedListener(this);
        this.f18817c.setText(str);
        this.f18817c.addTextChangedListener(this);
        ai.m1824a(this.f18817c, C1608h.m9257d(getContext(), i));
    }

    public void setReviewCommentListener(C1145c c1145c) {
        this.f18818d = c1145c;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("review_comment_question.parent_instance_state", super.onSaveInstanceState());
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            super.onRestoreInstanceState(((Bundle) parcelable).getParcelable("review_comment_question.parent_instance_state"));
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public final void mo3618b() {
        super.mo3618b();
        if (this.f18818d != null) {
            this.f18818d.mo1470b(this.f18817c.getText().toString().trim());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f18818d != null) {
            this.f18818d.mo1469a(charSequence.toString().trim());
        }
    }

    public void afterTextChanged(Editable editable) {
    }
}
