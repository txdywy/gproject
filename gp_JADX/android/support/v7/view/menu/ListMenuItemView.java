package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0400g;
import android.support.v7.p040a.C0403j;
import android.support.v7.widget.hc;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements ai {
    public C0485t f2637a;
    public ImageView f2638b;
    public RadioButton f2639c;
    public TextView f2640d;
    public CheckBox f2641e;
    public TextView f2642f;
    public ImageView f2643g;
    public Drawable f2644h;
    public int f2645i;
    public Context f2646j;
    public boolean f2647k;
    public Drawable f2648l;
    public LayoutInflater f2649m;
    public boolean f2650n;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        hc a = hc.m3769a(getContext(), attributeSet, C0403j.MenuView, i, 0);
        this.f2644h = a.m3771a(C0403j.MenuView_android_itemBackground);
        this.f2645i = a.m3783g(C0403j.MenuView_android_itemTextAppearance, -1);
        this.f2647k = a.m3772a(C0403j.MenuView_preserveIconSpacing, false);
        this.f2646j = context;
        this.f2648l = a.m3771a(C0403j.MenuView_subMenuArrow);
        a.f3558b.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ai.m1826a((View) this, this.f2644h);
        this.f2640d = (TextView) findViewById(C0399f.title);
        if (this.f2645i != -1) {
            this.f2640d.setTextAppearance(this.f2646j, this.f2645i);
        }
        this.f2642f = (TextView) findViewById(C0399f.shortcut);
        this.f2643g = (ImageView) findViewById(C0399f.submenuarrow);
        if (this.f2643g != null) {
            this.f2643g.setImageDrawable(this.f2648l);
        }
    }

    public final void mo58a(C0485t c0485t) {
        int i;
        int i2 = 0;
        this.f2637a = c0485t;
        setVisibility(c0485t.isVisible() ? 0 : 8);
        setTitle(c0485t.m2912a((ai) this));
        setCheckable(c0485t.isCheckable());
        boolean d = c0485t.m2921d();
        c0485t.m2918c();
        if (d && this.f2637a.m2921d()) {
            i = 0;
        } else {
            i = 8;
        }
        if (i == 0) {
            CharSequence charSequence;
            TextView textView = this.f2642f;
            char c = this.f2637a.m2918c();
            if (c == '\u0000') {
                charSequence = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder(C0485t.f2817F);
                switch (c) {
                    case '\b':
                        stringBuilder.append(C0485t.f2819H);
                        break;
                    case '\n':
                        stringBuilder.append(C0485t.f2818G);
                        break;
                    case ' ':
                        stringBuilder.append(C0485t.f2820I);
                        break;
                    default:
                        stringBuilder.append(c);
                        break;
                }
                charSequence = stringBuilder.toString();
            }
            textView.setText(charSequence);
        }
        if (this.f2642f.getVisibility() != i) {
            this.f2642f.setVisibility(i);
        }
        setIcon(c0485t.getIcon());
        setEnabled(c0485t.isEnabled());
        d = c0485t.hasSubMenu();
        if (this.f2643g != null) {
            ImageView imageView = this.f2643g;
            if (!d) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        setContentDescription(c0485t.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.f2650n = z;
        this.f2647k = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f2640d.setText(charSequence);
            if (this.f2640d.getVisibility() != 0) {
                this.f2640d.setVisibility(0);
            }
        } else if (this.f2640d.getVisibility() != 8) {
            this.f2640d.setVisibility(8);
        }
    }

    public C0485t getItemData() {
        return this.f2637a;
    }

    public void setCheckable(boolean z) {
        if (z || this.f2639c != null || this.f2641e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f2637a.m2922e()) {
                if (this.f2639c == null) {
                    m2737b();
                }
                compoundButton = this.f2639c;
                compoundButton2 = this.f2641e;
            } else {
                if (this.f2641e == null) {
                    m2738c();
                }
                compoundButton = this.f2641e;
                compoundButton2 = this.f2639c;
            }
            if (z) {
                int i;
                compoundButton.setChecked(this.f2637a.isChecked());
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f2641e != null) {
                this.f2641e.setVisibility(8);
            }
            if (this.f2639c != null) {
                this.f2639c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2637a.m2922e()) {
            if (this.f2639c == null) {
                m2737b();
            }
            compoundButton = this.f2639c;
        } else {
            if (this.f2641e == null) {
                m2738c();
            }
            compoundButton = this.f2641e;
        }
        compoundButton.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2637a.f2839n.f2734u || this.f2650n;
        if (!z && !this.f2647k) {
            return;
        }
        if (this.f2638b != null || drawable != null || this.f2647k) {
            if (this.f2638b == null) {
                this.f2638b = (ImageView) m2739d().inflate(C0400g.abc_list_menu_item_icon, this, false);
                addView(this.f2638b, 0);
            }
            if (drawable != null || this.f2647k) {
                ImageView imageView = this.f2638b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f2638b.getVisibility() != 0) {
                    this.f2638b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f2638b.setVisibility(8);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f2638b != null && this.f2647k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2638b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private final void m2737b() {
        this.f2639c = (RadioButton) m2739d().inflate(C0400g.abc_list_menu_item_radio, this, false);
        addView(this.f2639c);
    }

    private final void m2738c() {
        this.f2641e = (CheckBox) m2739d().inflate(C0400g.abc_list_menu_item_checkbox, this, false);
        addView(this.f2641e);
    }

    public final boolean mo59a() {
        return false;
    }

    private final LayoutInflater m2739d() {
        if (this.f2649m == null) {
            this.f2649m = LayoutInflater.from(getContext());
        }
        return this.f2649m;
    }
}
