package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v7.widget.eq;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.a.a.a.a.a.b.d;
import com.google.a.a.a.a.b.a.b.a.ab;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.b.a.ap;
import com.google.a.a.a.a.b.a.b.a.ar;
import com.google.a.a.a.a.b.a.b.a.as;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.android.wallet.ui.common.p402c.C6739a;
import com.google.android.wallet.ui.common.p402c.C6767d;
import com.google.android.wallet.ui.common.p402c.C6768f;
import com.google.android.wallet.ui.common.p402c.C6769g;
import com.google.android.wallet.ui.common.p402c.C6770h;
import com.google.android.wallet.ui.common.p402c.C6786x;
import com.google.android.wallet.ui.common.p402c.C6787z;
import com.google.android.wallet.ui.common.p402c.aa;
import com.google.android.wallet.ui.common.p402c.ad;
import com.google.android.wallet.ui.date.C6754a;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public final class cp {
    public static boolean m30908a(al alVar) {
        if (alVar.n == 1) {
            return true;
        }
        if (alVar.d() == null || alVar.d().a.length != 1) {
            return false;
        }
        return true;
    }

    public static String m30902a(View view) {
        View c = m30912c(view);
        if (c instanceof at) {
            return ((at) c).mo5522a(null);
        }
        if (c instanceof C6752d) {
            return ((C6752d) c).getText().toString();
        }
        if (c instanceof TextView) {
            return ((TextView) c).getText().toString();
        }
        if (c instanceof ImageWithCaptionView) {
            return "";
        }
        String valueOf = String.valueOf(c);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected field type: ").append(valueOf).toString());
    }

    public static void m30904a(al alVar, FormEditText formEditText, Activity activity) {
        boolean z = false;
        formEditText.setUiReference(alVar.d);
        formEditText.setName(alVar.c);
        formEditText.setHint(alVar.h);
        formEditText.setRequired(!alVar.f);
        if (!alVar.g) {
            z = true;
        }
        formEditText.setFieldEnabled(z);
        formEditText.setFieldDescription(alVar.i);
        String num;
        if (alVar.g() != null) {
            d dVar = alVar.g().d;
            if (alVar.g && dVar == null) {
                throw new IllegalArgumentException("Disabled field must have an initial value.");
            }
            DateEditText dateEditText = (DateEditText) formEditText;
            dateEditText.m30598a(alVar.g().a, alVar.g().h, alVar.g().i);
            if (alVar.g().a == 2) {
                dateEditText.mo5622a(new C6796x(dateEditText, alVar.g().b, alVar.g().c));
                if (dVar != null) {
                    dateEditText.m30601a(Integer.toString(dVar.b), Integer.toString(dVar.a), 5);
                }
            } else if (alVar.g().a == 1) {
                dateEditText.mo5622a(new C6793p(dateEditText, alVar.g().b, alVar.g().c));
                if (dVar != null) {
                    num = Integer.toString(dVar.b);
                    String num2 = Integer.toString(dVar.c);
                    String num3 = Integer.toString(dVar.a);
                    if (dateEditText.f33337o != 1) {
                        throw new IllegalArgumentException("Setting the is day only supported for DateField.YEAR_MONTH_DAY");
                    }
                    dateEditText.f33328f = num2;
                    dateEditText.f33329g = num;
                    dateEditText.f33330h = num3;
                    dateEditText.mo5626a(dateEditText.mo5627c(), 5);
                }
            } else {
                throw new IllegalArgumentException("DateField.Type " + alVar.g().a + " not supported.");
            }
            dateEditText.m30508a(dateEditText, dateEditText, true);
        } else if (alVar.c() != null) {
            ar c = alVar.c();
            if (c.a() != null) {
                formEditText.setNumberFormattingScheme(c.a());
            } else if (c.c() != null) {
                if (c.e != 1) {
                    formEditText.setTemplateFormattingScheme(c.c());
                } else {
                    throw new IllegalArgumentException("Templates with TEXT keyboards are not supported");
                }
            }
            formEditText.mo5641a(c.b, c.c);
            if (TextUtils.isEmpty(alVar.i)) {
                formEditText.setFieldDescription(c.d);
            }
            if (!alVar.g) {
                if (alVar.o) {
                    m30905a(c, formEditText);
                }
                m30911b(c, formEditText);
                switch (alVar.p) {
                    case 5:
                        if (TextUtils.isEmpty(alVar.c().h) && ci.m30868a(activity, (TextView) formEditText)) {
                            alVar.c().h = formEditText.getValue();
                            break;
                        }
                }
                m30906a(c.g, formEditText);
                if (!c.h.equals(formEditText.getValue())) {
                    formEditText.mo5626a(c.h, 5);
                }
                int i = c.i;
                num = c.k;
                boolean z2 = c.l;
                formEditText.ae = i;
                formEditText.af = num;
                formEditText.ah = z2;
                if (formEditText != null) {
                    formEditText.m30524h().remove(formEditText);
                }
                formEditText.m30528l();
                switch (i) {
                    case 0:
                    case 1:
                        return;
                    case 2:
                    case 3:
                        formEditText.setOnFocusChangeListener(formEditText);
                        if (!formEditText.hasFocus() && !TextUtils.isEmpty(formEditText.getText())) {
                            formEditText.m30527k();
                            return;
                        }
                        return;
                    default:
                        throw new IllegalArgumentException("RedactionScheme " + i + " is not supported");
                }
            } else if (TextUtils.isEmpty(c.h)) {
                throw new IllegalArgumentException("Disabled field must have an initial value.");
            } else {
                formEditText.mo5626a(c.h, 5);
            }
        }
    }

    private static void m30905a(ar arVar, FormEditText formEditText) {
        if (arVar.c == 0) {
            throw new IllegalArgumentException("Text fields with minimizeDisplayWidth set must have a max length.");
        }
        String replaceAll;
        if (arVar.c() != null) {
            StringBuilder stringBuilder = new StringBuilder((arVar.c().a.length * 6) - 1);
            for (ab abVar : arVar.c().a) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("|");
                }
                stringBuilder.append(Pattern.quote(abVar.b));
            }
            replaceAll = arVar.c().b.replaceAll(stringBuilder.toString(), "W");
        } else {
            char[] cArr = new char[arVar.c];
            Arrays.fill(cArr, 'W');
            replaceAll = new String(cArr);
        }
        TextPaint paint = formEditText.getPaint();
        int ceil = (((int) Math.ceil((double) Math.max(paint.measureText(replaceAll), paint.measureText(formEditText.getHint().toString())))) + formEditText.getPaddingLeft()) + formEditText.getPaddingRight();
        formEditText.setMinWidth(ceil);
        formEditText.setMaxWidth(ceil);
    }

    @TargetApi(17)
    private static void m30911b(ar arVar, FormEditText formEditText) {
        int i = 0;
        int i2 = 1;
        int i3 = (!arVar.l || arVar.i == 1 || arVar.i == 0) ? 0 : 1;
        switch (arVar.e) {
            case 1:
                if (arVar.l && i3 == 0) {
                    i2 = 129;
                    break;
                }
            case 2:
                if (arVar.l && i3 == 0) {
                    i3 = 18;
                } else {
                    i3 = 2;
                }
                if (arVar.c() != null && ci.m30872a(formEditText)) {
                    i3 = 1;
                }
                if (VERSION.SDK_INT < 17) {
                    i2 = i3;
                    break;
                }
                formEditText.setTextDirection(3);
                i2 = i3;
                break;
                break;
            case 3:
                i2 = 33;
                break;
            case 4:
                if (VERSION.SDK_INT < 17) {
                    i2 = 3;
                    break;
                }
                formEditText.setTextDirection(3);
                i2 = 3;
                break;
            default:
                throw new IllegalArgumentException("TextField.keyboardLayout " + arVar.e + " is not supported");
        }
        int[] iArr = arVar.f;
        int length = iArr.length;
        i3 = i2;
        while (i < length) {
            switch (iArr[i]) {
                case 1:
                    i3 |= 8192;
                    break;
                case 2:
                    i3 |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    break;
                case 3:
                    i3 |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    break;
                case 4:
                    i3 |= 16384;
                    break;
                case 5:
                    i3 |= 8192;
                    break;
                case 6:
                    i3 |= 32;
                    break;
                case 7:
                    i3 |= 96;
                    break;
                case 8:
                    i3 |= 112;
                    break;
                case 9:
                    i3 |= 16;
                    break;
                case 10:
                    i3 |= 524288;
                    break;
                default:
                    break;
            }
            i++;
        }
        Typeface typeface = formEditText.getTypeface();
        formEditText.setInputType(i3);
        formEditText.setTypeface(typeface);
        if (arVar.a() != null && !TextUtils.isEmpty(arVar.a().e)) {
            String valueOf = String.valueOf("0123456789");
            String valueOf2 = String.valueOf(arVar.a().e);
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            formEditText.setKeyListener(new by(valueOf2, i3));
        }
    }

    private static void m30906a(as[] asVarArr, FormEditText formEditText) {
        for (as asVar : asVarArr) {
            C6739a c6739a = null;
            Object obj = asVar.g;
            if (TextUtils.isEmpty(obj)) {
                throw new IllegalArgumentException("Error message must be provided for validation.");
            }
            if (!TextUtils.isEmpty(asVar.c())) {
                c6739a = new com.google.android.wallet.ui.common.p402c.ab(obj, Pattern.compile(asVar.c()));
            } else if (asVar.f() != -1.7976931348623157E308d) {
                c6739a = new aa(Double.NEGATIVE_INFINITY, asVar.f(), obj);
            } else if (asVar.e() != Double.MAX_VALUE) {
                c6739a = new aa(asVar.e(), Double.POSITIVE_INFINITY, obj);
            } else {
                switch (asVar.d()) {
                    case 0:
                        break;
                    case 1:
                        c6739a = new C6786x(obj);
                        break;
                    case 2:
                        c6739a = new C6767d(obj);
                        break;
                    case 3:
                        c6739a = new C6768f(obj);
                        break;
                    case 4:
                        c6739a = new ad(obj);
                        break;
                    case 5:
                        c6739a = new C6769g(obj);
                        break;
                    case 6:
                        c6739a = new C6787z(obj);
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        c6739a = C6770h.m30797a(asVar.d(), obj);
                        break;
                    default:
                        throw new IllegalArgumentException("TextField.ChecksumType " + asVar.d() + " is not supported");
                }
            }
            if (c6739a != null) {
                if (asVar.h != null) {
                    c6739a.f33269j = asVar.h.f35016a;
                    c6739a.f33270k = asVar.h.f35017b.f35018a;
                }
                formEditText.mo5622a(c6739a);
            }
        }
    }

    public static boolean m30907a(View view, boolean z) {
        View c = m30912c(view);
        if (c instanceof aa) {
            if (z) {
                return ((aa) c).cQ_();
            }
            return ((aa) c).mo5581e();
        } else if ((c instanceof TextView) || (c instanceof C6752d) || (c instanceof ImageWithCaptionView)) {
            return true;
        } else {
            String valueOf = String.valueOf(c);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid uiField view: ").append(valueOf).toString());
        }
    }

    public static void m30903a(View view, String str) {
        View c = m30912c(view);
        if (c instanceof aa) {
            ((aa) c).mo5578a(str, true);
        } else if (!(c instanceof TextView)) {
            String valueOf = String.valueOf(c);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid uiField view: ").append(valueOf).toString());
        } else if (!TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("TextViews should never have an error message");
        }
    }

    public static CharSequence m30909b(View view) {
        View c = m30912c(view);
        if (c instanceof TextView) {
            return ((TextView) c).getError();
        }
        if (c instanceof aa) {
            return ((aa) c).getError();
        }
        if (c instanceof C6752d) {
            return null;
        }
        if (c instanceof ImageWithCaptionView) {
            return null;
        }
        String valueOf = String.valueOf(c);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid uiField view: ").append(valueOf).toString());
    }

    public static at m30901a(View view, al alVar) {
        View c = m30912c(view);
        at atVar = new at();
        atVar.c = alVar.c;
        atVar.i = alVar.m;
        if (alVar.f() != null) {
            atVar.a(alVar.f().a);
        } else if (c instanceof C6754a) {
            C6754a c6754a = (C6754a) c;
            if (!alVar.e) {
                d dVar = new d();
                atVar.a = -1;
                atVar.a = 2;
                atVar.f = dVar;
                atVar.c().c = c6754a.getDay();
                atVar.c().b = c6754a.getMonth();
                atVar.c().a = c6754a.getYear();
            } else if (alVar.g().a == 2) {
                atVar.b(String.format(Locale.US, "%02d/%04d", new Object[]{Integer.valueOf(c6754a.getMonth()), Integer.valueOf(c6754a.getYear())}));
            } else if (alVar.g().a == 1) {
                atVar.b(String.format(Locale.US, "%02d/%02d/%04d", new Object[]{Integer.valueOf(c6754a.getMonth()), Integer.valueOf(c6754a.getDay()), Integer.valueOf(c6754a.getYear())}));
            } else {
                throw new IllegalArgumentException("DateField.Type " + alVar.g().a + " not supported.");
            }
        } else if (c instanceof CheckboxView) {
            r0 = ((CheckboxView) c).getState();
            if (alVar.e) {
                atVar.b(Integer.toString(r0));
            } else {
                atVar.a = -1;
                atVar.e = r0;
                atVar.a = 1;
            }
        } else {
            String str;
            if (c instanceof FormEditText) {
                FormEditText formEditText = (FormEditText) c;
                String value = formEditText.getValue();
                if (alVar.c().j) {
                    atVar.h = formEditText.getRedactedValue();
                }
                str = value;
            } else if (ci.m30894g(c)) {
                if (alVar.c() != null) {
                    str = alVar.c().h;
                } else if (alVar.d() != null) {
                    r0 = m30900a(alVar.d());
                    str = r0 >= 0 ? alVar.d().a[r0].c : "";
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected readonly field: %s", new Object[]{alVar}));
                }
            } else if (c instanceof FormSpinner) {
                r0 = ((FormSpinner) c).getSelectedItemPosition();
                if (m30913c(alVar)) {
                    r0--;
                }
                str = r0 >= 0 ? alVar.d().a[r0].c : "";
            } else if (c instanceof InlineSelectView) {
                r0 = ((InlineSelectView) c).getSelectedItemIndex();
                str = r0 >= 0 ? alVar.d().a[r0].c : "";
            } else {
                str = String.valueOf(c);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 22).append("Invalid uiField view: ").append(str).toString());
            }
            if (alVar.e) {
                atVar.b(str);
            } else {
                atVar.a(str);
            }
        }
        return atVar;
    }

    public static View m30912c(View view) {
        View view2 = view;
        while (view2 instanceof C6756y) {
            view2 = ((C6756y) view2).getInnerFieldView();
        }
        return view2;
    }

    public static Object m30910b(al alVar) {
        if (alVar.c() != null) {
            return alVar.c().h;
        }
        if (alVar.g() != null) {
            return alVar.g().d;
        }
        if (alVar.d() != null) {
            int a = m30900a(alVar.d());
            return a >= 0 ? alVar.d().a[a].c : "";
        } else if (alVar.e() != null) {
            return Integer.valueOf(alVar.e().a);
        } else {
            if (alVar.f() != null) {
                return alVar.f().a;
            }
            String valueOf = String.valueOf(alVar);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("UiField is not supported: ").append(valueOf).toString());
        }
    }

    public static boolean m30913c(al alVar) {
        return m30900a(alVar.d()) < 0 && !(TextUtils.isEmpty(alVar.d().c) && TextUtils.isEmpty(alVar.h));
    }

    public static int m30900a(ap apVar) {
        if (!TextUtils.isEmpty(apVar.b)) {
            int length = apVar.a.length;
            int i = 0;
            while (i < length) {
                if (apVar.b.equals(apVar.a[i].c)) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "No option that matches value %s.", new Object[]{apVar.b}));
        } else if (apVar.a.length == 1) {
            return 0;
        } else {
            return -1;
        }
    }
}
