package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p351m.C6121g;

public class CardStory extends FrameLayout {
    public final C6121g f15655c;

    public CardStory(Context context) {
        this(context, null, 0);
    }

    public CardStory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardStory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15655c = new C6121g();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f15655c.m28116a((View) this, C6089g.title, TextView.class);
        this.f15655c.m28116a((View) this, C6089g.subtitle, TextView.class);
        this.f15655c.m28116a((View) this, C6089g.source, TextView.class);
        this.f15655c.m28128b(this, C6089g.call_to_action, TextView.class);
        this.f15655c.m28116a((View) this, C6089g.image, PEImageView.class);
        this.f15655c.m28116a((View) this, C6089g.attribution, TextView.class);
    }

    public void setTitle(String str) {
        ((TextView) this.f15655c.m28117a(TextView.class, C6089g.title)).setText(str);
    }

    public void setTitleBackgroundColor(int i) {
        Drawable background = ((TextView) this.f15655c.m28117a(TextView.class, C6089g.title)).getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        }
    }

    public void setSubtitle(String str) {
        ((TextView) this.f15655c.m28117a(TextView.class, C6089g.subtitle)).setText(str);
    }

    public void setSource(String str) {
        ((TextView) this.f15655c.m28117a(TextView.class, C6089g.source)).setText(str);
    }

    public void setCallToAction(String str) {
        TextView textView = (TextView) this.f15655c.m28129b(TextView.class, C6089g.call_to_action);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setAttribution(String str) {
        TextView textView = (TextView) this.f15655c.m28117a(TextView.class, C6089g.attribution);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    public void setImageBackgroundColor(int i) {
        ((View) this.f15655c.m28117a(View.class, C6089g.image)).setBackgroundColor(i);
    }
}
