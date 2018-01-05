package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.p015a.p016a.C0066e;
import android.support.constraint.p015a.p016a.C0070h;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class C0083a extends MarginLayoutParams {
    public float f309A = 0.0f;
    public float f310B = 0.0f;
    public int f311C = 0;
    public int f312D = 0;
    public int f313E = 0;
    public int f314F = 0;
    public int f315G = 0;
    public int f316H = 0;
    public int f317I = 0;
    public int f318J = 0;
    public int f319K = -1;
    public int f320L = -1;
    public int f321M = -1;
    public boolean f322N = true;
    public boolean f323O = true;
    public boolean f324P = false;
    public boolean f325Q = false;
    public int f326R = -1;
    public int f327S = -1;
    public int f328T = -1;
    public int f329U = -1;
    public int f330V = -1;
    public int f331W = -1;
    public float f332X = 0.5f;
    public C0066e f333Y = new C0066e();
    public int f334a = -1;
    public int f335b = -1;
    public float f336c = -1.0f;
    public int f337d = -1;
    public int f338e = -1;
    public int f339f = -1;
    public int f340g = -1;
    public int f341h = -1;
    public int f342i = -1;
    public int f343j = -1;
    public int f344k = -1;
    public int f345l = -1;
    public int f346m = -1;
    public int f347n = -1;
    public int f348o = -1;
    public int f349p = -1;
    public int f350q = -1;
    public int f351r = -1;
    public int f352s = -1;
    public int f353t = -1;
    public int f354u = -1;
    public int f355v = -1;
    public float f356w = 0.5f;
    public float f357x = 0.5f;
    public String f358y = null;
    public int f359z = 1;

    public C0083a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0086d.ConstraintLayout_Layout);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0086d.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                this.f337d = obtainStyledAttributes.getResourceId(index, this.f337d);
                if (this.f337d == -1) {
                    this.f337d = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                this.f338e = obtainStyledAttributes.getResourceId(index, this.f338e);
                if (this.f338e == -1) {
                    this.f338e = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                this.f339f = obtainStyledAttributes.getResourceId(index, this.f339f);
                if (this.f339f == -1) {
                    this.f339f = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                this.f340g = obtainStyledAttributes.getResourceId(index, this.f340g);
                if (this.f340g == -1) {
                    this.f340g = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                this.f341h = obtainStyledAttributes.getResourceId(index, this.f341h);
                if (this.f341h == -1) {
                    this.f341h = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                this.f342i = obtainStyledAttributes.getResourceId(index, this.f342i);
                if (this.f342i == -1) {
                    this.f342i = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                this.f343j = obtainStyledAttributes.getResourceId(index, this.f343j);
                if (this.f343j == -1) {
                    this.f343j = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                this.f344k = obtainStyledAttributes.getResourceId(index, this.f344k);
                if (this.f344k == -1) {
                    this.f344k = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                this.f345l = obtainStyledAttributes.getResourceId(index, this.f345l);
                if (this.f345l == -1) {
                    this.f345l = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_editor_absoluteX) {
                this.f319K = obtainStyledAttributes.getDimensionPixelOffset(index, this.f319K);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_editor_absoluteY) {
                this.f320L = obtainStyledAttributes.getDimensionPixelOffset(index, this.f320L);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                this.f334a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f334a);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintGuide_end) {
                this.f335b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f335b);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                this.f336c = obtainStyledAttributes.getFloat(index, this.f336c);
            } else if (index == C0086d.ConstraintLayout_Layout_android_orientation) {
                this.f321M = obtainStyledAttributes.getInt(index, this.f321M);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                this.f346m = obtainStyledAttributes.getResourceId(index, this.f346m);
                if (this.f346m == -1) {
                    this.f346m = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                this.f347n = obtainStyledAttributes.getResourceId(index, this.f347n);
                if (this.f347n == -1) {
                    this.f347n = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                this.f348o = obtainStyledAttributes.getResourceId(index, this.f348o);
                if (this.f348o == -1) {
                    this.f348o = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                this.f349p = obtainStyledAttributes.getResourceId(index, this.f349p);
                if (this.f349p == -1) {
                    this.f349p = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_goneMarginLeft) {
                this.f350q = obtainStyledAttributes.getDimensionPixelSize(index, this.f350q);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_goneMarginTop) {
                this.f351r = obtainStyledAttributes.getDimensionPixelSize(index, this.f351r);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_goneMarginRight) {
                this.f352s = obtainStyledAttributes.getDimensionPixelSize(index, this.f352s);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_goneMarginBottom) {
                this.f353t = obtainStyledAttributes.getDimensionPixelSize(index, this.f353t);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_goneMarginStart) {
                this.f354u = obtainStyledAttributes.getDimensionPixelSize(index, this.f354u);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_goneMarginEnd) {
                this.f355v = obtainStyledAttributes.getDimensionPixelSize(index, this.f355v);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                this.f356w = obtainStyledAttributes.getFloat(index, this.f356w);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                this.f357x = obtainStyledAttributes.getFloat(index, this.f357x);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                this.f358y = obtainStyledAttributes.getString(index);
                this.f359z = -1;
                if (this.f358y != null) {
                    int length = this.f358y.length();
                    index = this.f358y.indexOf(44);
                    if (index <= 0 || index >= length - 1) {
                        index = 0;
                    } else {
                        String substring = this.f358y.substring(0, index);
                        if (substring.equalsIgnoreCase("W")) {
                            this.f359z = 0;
                        } else if (substring.equalsIgnoreCase("H")) {
                            this.f359z = 1;
                        }
                        index++;
                    }
                    int indexOf = this.f358y.indexOf(58);
                    String substring2;
                    if (indexOf < 0 || indexOf >= length - 1) {
                        substring2 = this.f358y.substring(index);
                        if (substring2.length() > 0) {
                            try {
                                Float.parseFloat(substring2);
                            } catch (NumberFormatException e) {
                            }
                        }
                    } else {
                        substring2 = this.f358y.substring(index, indexOf);
                        String substring3 = this.f358y.substring(indexOf + 1);
                        if (substring2.length() > 0 && substring3.length() > 0) {
                            try {
                                float parseFloat = Float.parseFloat(substring2);
                                float parseFloat2 = Float.parseFloat(substring3);
                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                    if (this.f359z == 1) {
                                        Math.abs(parseFloat2 / parseFloat);
                                    } else {
                                        Math.abs(parseFloat / parseFloat2);
                                    }
                                }
                            } catch (NumberFormatException e2) {
                            }
                        }
                    }
                }
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintHorizontal_weight) {
                this.f309A = obtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintVertical_weight) {
                this.f310B = obtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle) {
                this.f311C = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintVertical_chainStyle) {
                this.f312D = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintWidth_default) {
                this.f313E = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintHeight_default) {
                this.f314F = obtainStyledAttributes.getInt(index, 0);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintWidth_min) {
                this.f315G = obtainStyledAttributes.getDimensionPixelSize(index, this.f315G);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintWidth_max) {
                this.f317I = obtainStyledAttributes.getDimensionPixelSize(index, this.f317I);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintHeight_min) {
                this.f316H = obtainStyledAttributes.getDimensionPixelSize(index, this.f316H);
            } else if (index == C0086d.ConstraintLayout_Layout_layout_constraintHeight_max) {
                this.f318J = obtainStyledAttributes.getDimensionPixelSize(index, this.f318J);
            }
        }
        obtainStyledAttributes.recycle();
        m179a();
    }

    public final void m179a() {
        this.f325Q = false;
        this.f322N = true;
        this.f323O = true;
        if (this.width == 0 || this.width == -1) {
            this.f322N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.f323O = false;
        }
        if (this.f336c != -1.0f || this.f334a != -1 || this.f335b != -1) {
            this.f325Q = true;
            this.f322N = true;
            this.f323O = true;
            if (!(this.f333Y instanceof C0070h)) {
                this.f333Y = new C0070h();
            }
            ((C0070h) this.f333Y).m128e(this.f321M);
        }
    }

    public C0083a() {
        super(-2, -2);
    }

    public C0083a(LayoutParams layoutParams) {
        super(layoutParams);
    }

    @TargetApi(17)
    public final void resolveLayoutDirection(int i) {
        super.resolveLayoutDirection(i);
        this.f328T = -1;
        this.f329U = -1;
        this.f326R = -1;
        this.f327S = -1;
        this.f330V = -1;
        this.f331W = -1;
        this.f330V = this.f350q;
        this.f331W = this.f352s;
        this.f332X = this.f356w;
        if (1 == getLayoutDirection()) {
            if (this.f346m != -1) {
                this.f328T = this.f346m;
            } else if (this.f347n != -1) {
                this.f329U = this.f347n;
            }
            if (this.f348o != -1) {
                this.f327S = this.f348o;
            }
            if (this.f349p != -1) {
                this.f326R = this.f349p;
            }
            if (this.f354u != -1) {
                this.f331W = this.f354u;
            }
            if (this.f355v != -1) {
                this.f330V = this.f355v;
            }
            this.f332X = 1.0f - this.f356w;
        } else {
            if (this.f346m != -1) {
                this.f327S = this.f346m;
            }
            if (this.f347n != -1) {
                this.f326R = this.f347n;
            }
            if (this.f348o != -1) {
                this.f328T = this.f348o;
            }
            if (this.f349p != -1) {
                this.f329U = this.f349p;
            }
            if (this.f354u != -1) {
                this.f330V = this.f354u;
            }
            if (this.f355v != -1) {
                this.f331W = this.f355v;
            }
        }
        if (this.f348o == -1 && this.f349p == -1) {
            if (this.f339f != -1) {
                this.f328T = this.f339f;
            } else if (this.f340g != -1) {
                this.f329U = this.f340g;
            }
        }
        if (this.f347n != -1 || this.f346m != -1) {
            return;
        }
        if (this.f337d != -1) {
            this.f326R = this.f337d;
        } else if (this.f338e != -1) {
            this.f327S = this.f338e;
        }
    }
}
