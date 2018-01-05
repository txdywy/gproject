package com.google.android.play.search;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.play.C6361i;
import com.google.android.play.g;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class PlaySearchPlateTextContainer extends FrameLayout implements TextWatcher, OnEditorActionListener, C6407o {
    public final InputMethodManager f32309a;
    public C6420m f32310b;
    public ak f32311c;
    public ImageView f32312d;
    public TextView f32313e;
    public EditText f32314f;
    public boolean f32315g;
    public boolean f32316h;

    public PlaySearchPlateTextContainer(Context context) {
        this(context, null);
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32309a = (InputMethodManager) context.getSystemService("input_method");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32312d = (ImageView) findViewById(g.search_box_idle_text);
        this.f32313e = (TextView) findViewById(g.search_box_active_text_view);
        this.f32314f = (EditText) findViewById(g.search_box_text_input);
        OnClickListener c6424r = new C6424r(this);
        this.f32312d.setOnClickListener(c6424r);
        this.f32313e.setOnClickListener(c6424r);
    }

    public void setPlaySearchController(C6420m c6420m) {
        if (this.f32310b != null) {
            this.f32310b.m29447b(this);
        }
        this.f32310b = c6420m;
        this.f32310b.m29442a((C6407o) this);
        this.f32311c = new ak(this.f32310b);
    }

    public void setHint(CharSequence charSequence) {
        if (charSequence != null) {
            this.f32313e.setHint(charSequence);
            this.f32314f.setHint(charSequence);
            return;
        }
        this.f32313e.setHint(C6361i.play_search_box_hint);
        this.f32314f.setHint(C6361i.play_search_box_hint);
    }

    public final void mo5425a(int i) {
        switch (i) {
            case 1:
                if (this.f32316h) {
                    this.f32312d.setVisibility(8);
                    this.f32313e.setText("");
                    this.f32313e.setVisibility(0);
                } else {
                    this.f32312d.setVisibility(0);
                    this.f32313e.setVisibility(8);
                }
                this.f32314f.setVisibility(8);
                this.f32314f.setOnEditorActionListener(null);
                this.f32314f.setOnClickListener(null);
                break;
            case 2:
                this.f32312d.setVisibility(8);
                this.f32313e.setVisibility(0);
                this.f32314f.setVisibility(8);
                this.f32314f.setOnEditorActionListener(null);
                break;
            case 3:
                this.f32312d.setVisibility(8);
                this.f32313e.setVisibility(8);
                this.f32314f.setVisibility(0);
                this.f32314f.addTextChangedListener(this);
                this.f32314f.setOnEditorActionListener(this);
                this.f32314f.setOnClickListener(null);
                this.f32314f.requestFocus();
                this.f32309a.showSoftInput(this.f32314f, 0);
                if (this.f32310b != null) {
                    this.f32310b.m29444a(true);
                }
                m29383b(this.f32310b.f32364d);
                return;
            case 4:
                if (this.f32310b != null) {
                    this.f32310b.m29443a("", true);
                }
                if (!(this.f32310b == null || this.f32311c == null)) {
                    BroadcastReceiver broadcastReceiver = this.f32311c;
                    Context context = getContext();
                    Intent intent = new Intent("com.google.android.play.search.VOICE_SEARCH_RESULT");
                    intent.setPackage(context.getPackageName());
                    Parcelable broadcast = PendingIntent.getBroadcast(context, 0, intent, MemoryMappedFileBuffer.DEFAULT_SIZE);
                    Intent intent2 = new Intent(ak.f32344a);
                    intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", broadcast);
                    if (!broadcastReceiver.f32346c) {
                        context.registerReceiver(broadcastReceiver, new IntentFilter("com.google.android.play.search.VOICE_SEARCH_RESULT"));
                        broadcastReceiver.f32346c = true;
                    }
                    context.startActivity(intent2);
                    break;
                }
            default:
                return;
        }
        this.f32309a.hideSoftInputFromWindow(this.f32314f.getWindowToken(), 0);
        this.f32314f.removeTextChangedListener(this);
    }

    public final void mo5428a(String str, boolean z) {
        this.f32313e.setText(str);
        m29383b(str);
    }

    public final void mo5426a(C6429w c6429w) {
    }

    public final boolean mo5429b(C6429w c6429w) {
        return false;
    }

    public final void mo5427a(String str) {
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            m29382a();
            return true;
        }
        if (keyEvent != null) {
            boolean z;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 66 || keyCode == 160 || keyCode == 84) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (keyEvent.getAction() != 1) {
                    return true;
                }
                m29382a();
                return true;
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f32310b != null && !this.f32315g) {
            this.f32310b.m29443a(charSequence.toString(), true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f32310b != null && this.f32310b.f32362b == 4) {
            if (this.f32311c != null) {
                this.f32311c.m29431b(getContext());
            }
            if (!TextUtils.isEmpty(this.f32310b.f32364d)) {
                this.f32310b.m29448c();
            } else if (hasFocus()) {
                this.f32310b.m29441a(3);
            } else {
                this.f32310b.m29446b();
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f32311c != null) {
            this.f32311c.m29431b(getContext());
        }
    }

    private final void m29382a() {
        if (TextUtils.getTrimmedLength(this.f32310b.f32364d) > 0) {
            this.f32310b.m29448c();
        }
    }

    private final void m29383b(String str) {
        if (this.f32310b.f32362b == 3 && !this.f32314f.getText().toString().equals(str)) {
            this.f32315g = true;
            this.f32314f.setText(str);
            this.f32314f.setSelection(str.length());
            this.f32315g = false;
        }
    }

    public void setIdleBackgroundDrawable(Drawable drawable) {
        this.f32312d.setImageDrawable(drawable);
    }

    public void setIdleContentDescription(CharSequence charSequence) {
        this.f32312d.setContentDescription(charSequence);
    }

    public void setUseHintOnIdle(boolean z) {
        this.f32316h = z;
    }
}
