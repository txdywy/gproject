package com.google.android.finsky.dialogbuilder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.widget.bg;
import android.support.v7.widget.eq;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dialogbuilder.p154b.C2793j;
import com.google.android.finsky.frameworkviews.FlowLayout;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.x;
import com.google.wireless.android.finsky.dfe.c.a.bp;
import com.google.wireless.android.finsky.dfe.c.a.bq;
import com.google.wireless.android.finsky.dfe.c.a.cc;
import com.google.wireless.android.finsky.dfe.c.a.cg;
import com.google.wireless.android.finsky.dfe.c.a.ch;
import com.google.wireless.android.finsky.dfe.c.a.cj;
import com.google.wireless.android.finsky.dfe.c.a.ck;
import com.google.wireless.android.finsky.dfe.c.a.de;
import com.google.wireless.android.finsky.dfe.c.a.df;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public final class C2798j {
    public static final Typeface f15113a = Typeface.create("sans-serif-thin", 0);
    public static final Typeface f15114b = Typeface.create("sans-serif-light", 0);
    public static final Typeface f15115c = Typeface.create("sans-serif-medium", 0);
    public static final Typeface f15116d = Typeface.create("sans-serif-black", 0);
    public static final Typeface f15117e = Typeface.create("sans-serif-condensed", 0);
    public final C1294w f15118f;
    public final C1612l f15119g;
    public final C2820s f15120h;

    C2798j(C1294w c1294w, C1612l c1612l, C2820s c2820s) {
        this.f15118f = c1294w;
        this.f15119g = c1612l;
        this.f15120h = c2820s;
    }

    public final void m14901a(bp bpVar, Button button, C2797e c2797e) {
        if (bpVar != null) {
            button.setText(bpVar.b);
            button.setOnClickListener(new C2799k(c2797e, bpVar));
            C2798j.m14898a(bpVar.d, (View) button, c2797e);
            m14897a(bpVar.e, (TextView) button);
            bq bqVar = bpVar.f;
            if (bqVar != null) {
                if (((bqVar.a & 1) != 0 ? 1 : 0) != 0) {
                    int i;
                    switch (bqVar.b) {
                        case 1:
                            i = C7582R.drawable.play_action_button_apps_secondary;
                            break;
                        case 2:
                            i = C7582R.drawable.play_action_button_books_secondary;
                            break;
                        case 3:
                            i = C7582R.drawable.play_action_button_newsstand_secondary;
                            break;
                        case 4:
                            i = C7582R.drawable.play_action_button_movies_secondary;
                            break;
                        case 5:
                            i = C7582R.drawable.play_action_button_music_secondary;
                            break;
                        case 6:
                            i = C7582R.drawable.play_action_button_apps_ent_secondary;
                            break;
                        default:
                            i = C7582R.drawable.play_action_button_multi_secondary;
                            break;
                    }
                    button.setBackgroundResource(i);
                }
            }
            button.setVisibility(0);
        }
    }

    public static void m14894a(TextView textView, View view, int i, String str, int i2, String str2, C2793j c2793j) {
        C2817p c2817p = new C2817p(textView, i2, i);
        if (!TextUtils.isEmpty(str)) {
            C2798j.m14895a(c2817p, false);
            c2793j.m14879a(str);
            c2793j.m14880a(str, new C2818q(c2817p));
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            view.setOnClickListener(new C2800l(c2793j, str, str2));
        }
    }

    public final void m14902a(cg cgVar, ImageView imageView, C2797e c2797e) {
        if (cgVar != null) {
            int i;
            if (imageView instanceof FifeImageView) {
                this.f15119g.m9287a((FifeImageView) imageView, cgVar.b, -1);
            } else {
                Bitmap b = this.f15118f.mo1677b(cgVar.b.f11860f, 0, 0, new C2816o(imageView)).b();
                if (b != null) {
                    imageView.setImageBitmap(b);
                }
            }
            if ((cgVar.a & 1) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                imageView.setContentDescription(cgVar.d);
            }
            C2798j.m14898a(cgVar.c, (View) imageView, c2797e);
            ch chVar = cgVar.e;
            if (chVar != null) {
                if ((chVar.a & 1) != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    imageView.setColorFilter(chVar.b);
                }
            }
            imageView.setVisibility(0);
        }
    }

    public final void m14903a(cj cjVar, EditText editText, C2797e c2797e) {
        if (cjVar != null) {
            if (TextUtils.isEmpty(editText.getText())) {
                editText.setText(cjVar.b);
            }
            editText.setHint(cjVar.c);
            ck ckVar = cjVar.f;
            if (ckVar != null) {
                int i;
                int i2;
                if (ckVar.a.length > 0) {
                    i = 0;
                    for (int i22 : ckVar.a) {
                        switch (i22) {
                            case 1:
                                i22 = 20;
                                break;
                            case 2:
                                i22 = 4;
                                break;
                            case 3:
                                i22 = 0;
                                break;
                            case 4:
                                i22 = 2;
                                break;
                            case 5:
                                i22 = 8194;
                                break;
                            case 6:
                                i22 = 18;
                                break;
                            case 7:
                                i22 = 4098;
                                break;
                            case 8:
                                i22 = 3;
                                break;
                            case 10:
                                i22 = 65536;
                                break;
                            case 11:
                                i22 = 32768;
                                break;
                            case 12:
                                i22 = eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                                break;
                            case 13:
                                i22 = 16384;
                                break;
                            case 14:
                                i22 = 8192;
                                break;
                            case 15:
                                i22 = 33;
                                break;
                            case 16:
                                i22 = 49;
                                break;
                            case 17:
                                i22 = 177;
                                break;
                            case 18:
                                i22 = 262144;
                                break;
                            case 19:
                                i22 = 81;
                                break;
                            case 20:
                                i22 = 131072;
                                break;
                            case 21:
                                i22 = 524288;
                                break;
                            case 22:
                                i22 = 129;
                                break;
                            case 23:
                                i22 = 97;
                                break;
                            case 24:
                                i22 = 193;
                                break;
                            case 25:
                                i22 = 113;
                                break;
                            case 26:
                                i22 = 65;
                                break;
                            case 27:
                                i22 = 17;
                                break;
                            case 28:
                                i22 = 145;
                                break;
                            case 29:
                                i22 = 161;
                                break;
                            case 30:
                                i22 = 209;
                                break;
                            case 31:
                                i22 = 225;
                                break;
                            case 32:
                                i22 = 36;
                                break;
                            default:
                                i22 = 1;
                                break;
                        }
                        i |= i22;
                    }
                    editText.setInputType(i);
                }
                if (ckVar.b.length > 0) {
                    i = 0;
                    for (int i222 : ckVar.b) {
                        switch (i222) {
                            case 1:
                                i222 = 6;
                                break;
                            case 2:
                                i222 = 2;
                                break;
                            case 3:
                                i222 = 5;
                                break;
                            case 4:
                                i222 = 1;
                                break;
                            case 5:
                                i222 = 7;
                                break;
                            case 6:
                                i222 = 3;
                                break;
                            case 7:
                                i222 = 4;
                                break;
                            case 8:
                                i222 = 0;
                                break;
                            case 9:
                                i222 = Integer.MIN_VALUE;
                                break;
                            case 10:
                                i222 = 134217728;
                                break;
                            case 11:
                                i222 = 67108864;
                                break;
                            case 12:
                                i222 = 536870912;
                                break;
                            case 13:
                                i222 = MemoryMappedFileBuffer.DEFAULT_SIZE;
                                break;
                            case 14:
                                i222 = 268435456;
                                break;
                            case 15:
                                i222 = 33554432;
                                break;
                            case 16:
                                i222 = HprofParser.ROOT_UNKNOWN;
                                break;
                            default:
                                i222 = 0;
                                break;
                        }
                        i |= i222;
                    }
                    editText.setImeOptions(i);
                }
            }
            C2798j.m14898a(cjVar.d, (View) editText, c2797e);
            m14897a(cjVar.e, (TextView) editText);
            editText.setVisibility(0);
        }
    }

    public final void m14904a(de deVar, TextView textView, C2797e c2797e, Object... objArr) {
        if (deVar != null) {
            String str = deVar.c;
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (!deVar.d) {
                textView.setText(str);
            } else if (deVar.g) {
                textView.setText(Html.fromHtml(str));
            } else {
                ae.m9217a(textView, str);
            }
            C2798j.m14898a(deVar.e, (View) textView, c2797e);
            m14897a(deVar.f, textView);
            textView.setVisibility(0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14898a(com.google.wireless.android.finsky.dfe.c.a.dm r9, android.view.View r10, com.google.android.finsky.dialogbuilder.C2797e r11) {
        /*
        r8 = 2;
        r4 = 1;
        r5 = 0;
        if (r9 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r0 = r9.u;
        if (r0 == 0) goto L_0x0014;
    L_0x000a:
        if (r11 == 0) goto L_0x0014;
    L_0x000c:
        r0 = new com.google.android.finsky.dialogbuilder.n;
        r0.<init>(r11, r9);
        r10.setOnClickListener(r0);
    L_0x0014:
        r0 = r9.d();
        if (r0 == 0) goto L_0x001f;
    L_0x001a:
        r0 = r9.b;
        r10.setTag(r0);
    L_0x001f:
        r1 = r10.getLayoutParams();
        r0 = r9.a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00c0;
    L_0x0029:
        r0 = r4;
    L_0x002a:
        if (r0 != 0) goto L_0x0036;
    L_0x002c:
        r0 = r9.a;
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x00c3;
    L_0x0033:
        r0 = r4;
    L_0x0034:
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r0 = r9.d;
        r2 = r9.y;
        r0 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r0, r2);
        r1.height = r0;
    L_0x0040:
        r0 = r9.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x00c6;
    L_0x0046:
        r0 = r4;
    L_0x0047:
        if (r0 != 0) goto L_0x0053;
    L_0x0049:
        r0 = r9.a;
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x00c8;
    L_0x0050:
        r0 = r4;
    L_0x0051:
        if (r0 == 0) goto L_0x005d;
    L_0x0053:
        r0 = r9.c;
        r2 = r9.x;
        r0 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r0, r2);
        r1.width = r0;
    L_0x005d:
        r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams;
        if (r0 == 0) goto L_0x00aa;
    L_0x0061:
        r0 = r1;
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r2 = r9.a;
        r2 = r2 & 8;
        if (r2 == 0) goto L_0x00ca;
    L_0x006a:
        r2 = r4;
    L_0x006b:
        if (r2 == 0) goto L_0x0076;
    L_0x006d:
        r2 = r9.e;
        r2 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r2, r8);
        android.support.v4.view.C0361r.m2050a(r0, r2);
    L_0x0076:
        r2 = r9.a;
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x00cc;
    L_0x007c:
        r2 = r4;
    L_0x007d:
        if (r2 == 0) goto L_0x0087;
    L_0x007f:
        r2 = r9.f;
        r2 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r2, r8);
        r0.topMargin = r2;
    L_0x0087:
        r2 = r9.a;
        r2 = r2 & 32;
        if (r2 == 0) goto L_0x00ce;
    L_0x008d:
        r2 = r4;
    L_0x008e:
        if (r2 == 0) goto L_0x0099;
    L_0x0090:
        r2 = r9.g;
        r2 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r2, r8);
        android.support.v4.view.C0361r.m2052b(r0, r2);
    L_0x0099:
        r2 = r9.a;
        r2 = r2 & 64;
        if (r2 == 0) goto L_0x00d0;
    L_0x009f:
        r2 = r4;
    L_0x00a0:
        if (r2 == 0) goto L_0x00aa;
    L_0x00a2:
        r2 = r9.h;
        r2 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r2, r8);
        r0.bottomMargin = r2;
    L_0x00aa:
        r0 = r9.w;
        r0 = r0.length;
        if (r0 <= 0) goto L_0x00e5;
    L_0x00af:
        r3 = r9.w;
        r6 = r3.length;
        r0 = r5;
        r2 = r5;
    L_0x00b4:
        if (r0 >= r6) goto L_0x00d2;
    L_0x00b6:
        r7 = r3[r0];
        r7 = com.google.android.finsky.dialogbuilder.C2798j.m14899b(r7);
        r2 = r2 | r7;
        r0 = r0 + 1;
        goto L_0x00b4;
    L_0x00c0:
        r0 = r5;
        goto L_0x002a;
    L_0x00c3:
        r0 = r5;
        goto L_0x0034;
    L_0x00c6:
        r0 = r5;
        goto L_0x0047;
    L_0x00c8:
        r0 = r5;
        goto L_0x0051;
    L_0x00ca:
        r2 = r5;
        goto L_0x006b;
    L_0x00cc:
        r2 = r5;
        goto L_0x007d;
    L_0x00ce:
        r2 = r5;
        goto L_0x008e;
    L_0x00d0:
        r2 = r5;
        goto L_0x00a0;
    L_0x00d2:
        r0 = r1 instanceof android.widget.LinearLayout.LayoutParams;
        if (r0 == 0) goto L_0x00db;
    L_0x00d6:
        r0 = r1;
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r0.gravity = r2;
    L_0x00db:
        r0 = r10 instanceof android.widget.LinearLayout;
        if (r0 == 0) goto L_0x00e5;
    L_0x00df:
        r0 = r10;
        r0 = (android.widget.LinearLayout) r0;
        r0.setGravity(r2);
    L_0x00e5:
        r10.setLayoutParams(r1);
        r0 = r9.a;
        r0 = r0 & 128;
        if (r0 == 0) goto L_0x01c9;
    L_0x00ee:
        r0 = r4;
    L_0x00ef:
        if (r0 == 0) goto L_0x01cc;
    L_0x00f1:
        r0 = r9.i;
        r0 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r0, r8);
    L_0x00f7:
        r1 = r9.a;
        r1 = r1 & 256;
        if (r1 == 0) goto L_0x01d4;
    L_0x00fd:
        r1 = r4;
    L_0x00fe:
        if (r1 == 0) goto L_0x01d7;
    L_0x0100:
        r1 = r9.j;
        r1 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r1, r8);
    L_0x0106:
        r2 = r9.a;
        r2 = r2 & 512;
        if (r2 == 0) goto L_0x01dd;
    L_0x010c:
        r2 = r4;
    L_0x010d:
        if (r2 == 0) goto L_0x01e0;
    L_0x010f:
        r2 = r9.k;
        r2 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r2, r8);
    L_0x0115:
        r3 = r9.a;
        r3 = r3 & 1024;
        if (r3 == 0) goto L_0x01e8;
    L_0x011b:
        r3 = r4;
    L_0x011c:
        if (r3 == 0) goto L_0x01eb;
    L_0x011e:
        r3 = r9.l;
        r3 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r3, r8);
    L_0x0124:
        android.support.v4.view.ai.m1823a(r10, r0, r1, r2, r3);
        r0 = r9.a;
        r0 = r0 & 2048;
        if (r0 == 0) goto L_0x01f1;
    L_0x012d:
        r0 = r4;
    L_0x012e:
        if (r0 == 0) goto L_0x013b;
    L_0x0130:
        r0 = r10.getBackground();
        if (r0 != 0) goto L_0x01f4;
    L_0x0136:
        r0 = r9.m;
        r10.setBackgroundColor(r0);
    L_0x013b:
        r0 = r9.a;
        r0 = r0 & 4096;
        if (r0 == 0) goto L_0x0206;
    L_0x0141:
        r0 = r4;
    L_0x0142:
        if (r0 == 0) goto L_0x0158;
    L_0x0144:
        r0 = r9.o;
        r10.setContentDescription(r0);
        r0 = r9.p;
        if (r0 == 0) goto L_0x0158;
    L_0x014d:
        r0 = r10.getContext();
        r1 = r10.getContentDescription();
        com.google.android.finsky.bg.C1601a.m9199a(r0, r1, r10, r5);
    L_0x0158:
        r0 = r9.a;
        r0 = r0 & 16384;
        if (r0 == 0) goto L_0x0209;
    L_0x015e:
        r0 = r4;
    L_0x015f:
        if (r0 == 0) goto L_0x0171;
    L_0x0161:
        r0 = r9.q;
        r1 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r0, r8);
        r0 = r10 instanceof android.widget.TextView;
        if (r0 == 0) goto L_0x020c;
    L_0x016b:
        r0 = r10;
        r0 = (android.widget.TextView) r0;
        r0.setMinWidth(r1);
    L_0x0171:
        r0 = r9.a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x0211;
    L_0x0179:
        r0 = r4;
    L_0x017a:
        if (r0 == 0) goto L_0x018c;
    L_0x017c:
        r0 = r9.r;
        r1 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r0, r8);
        r0 = r10 instanceof android.widget.TextView;
        if (r0 == 0) goto L_0x0214;
    L_0x0186:
        r0 = r10;
        r0 = (android.widget.TextView) r0;
        r0.setMinHeight(r1);
    L_0x018c:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x01b8;
    L_0x0192:
        r0 = r9.a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x0219;
    L_0x0199:
        r0 = r4;
    L_0x019a:
        if (r0 == 0) goto L_0x01a4;
    L_0x019c:
        r0 = r9.s;
        if (r0 == 0) goto L_0x01a4;
    L_0x01a0:
        r0 = 0;
        r10.setStateListAnimator(r0);
    L_0x01a4:
        r0 = r9.a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x021b;
    L_0x01ab:
        r0 = r4;
    L_0x01ac:
        if (r0 == 0) goto L_0x01b8;
    L_0x01ae:
        r0 = r9.t;
        r0 = com.google.android.finsky.dialogbuilder.C2798j.m14891a(r10, r0, r8);
        r0 = (float) r0;
        r10.setElevation(r0);
    L_0x01b8:
        r0 = r9.a;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x021d;
    L_0x01bf:
        r0 = r4;
    L_0x01c0:
        if (r0 == 0) goto L_0x0005;
    L_0x01c2:
        r0 = r9.v;
        r10.setEnabled(r0);
        goto L_0x0005;
    L_0x01c9:
        r0 = r5;
        goto L_0x00ef;
    L_0x01cc:
        r0 = android.support.v4.view.ai.f1848a;
        r0 = r0.mo401l(r10);
        goto L_0x00f7;
    L_0x01d4:
        r1 = r5;
        goto L_0x00fe;
    L_0x01d7:
        r1 = r10.getPaddingTop();
        goto L_0x0106;
    L_0x01dd:
        r2 = r5;
        goto L_0x010d;
    L_0x01e0:
        r2 = android.support.v4.view.ai.f1848a;
        r2 = r2.mo402m(r10);
        goto L_0x0115;
    L_0x01e8:
        r3 = r5;
        goto L_0x011c;
    L_0x01eb:
        r3 = r10.getPaddingBottom();
        goto L_0x0124;
    L_0x01f1:
        r0 = r5;
        goto L_0x012e;
    L_0x01f4:
        r0 = android.support.v4.p013b.p014a.C0259a.m1526e(r0);
        r1 = r0.mutate();
        r2 = r9.m;
        android.support.v4.p013b.p014a.C0259a.m1514a(r1, r2);
        com.google.android.finsky.bg.ah.m9227a(r10, r0);
        goto L_0x013b;
    L_0x0206:
        r0 = r5;
        goto L_0x0142;
    L_0x0209:
        r0 = r5;
        goto L_0x015f;
    L_0x020c:
        r10.setMinimumWidth(r1);
        goto L_0x0171;
    L_0x0211:
        r0 = r5;
        goto L_0x017a;
    L_0x0214:
        r10.setMinimumHeight(r1);
        goto L_0x018c;
    L_0x0219:
        r0 = r5;
        goto L_0x019a;
    L_0x021b:
        r0 = r5;
        goto L_0x01ac;
    L_0x021d:
        r0 = r5;
        goto L_0x01c0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.dialogbuilder.j.a(com.google.wireless.android.finsky.dfe.c.a.dm, android.view.View, com.google.android.finsky.dialogbuilder.e):void");
    }

    public static void m14896a(cc ccVar, FlowLayout flowLayout) {
        if (ccVar != null) {
            flowLayout.setVerticalGap(C2798j.m14891a((View) flowLayout, (float) ccVar.b, 2));
            flowLayout.setHorizontalGap(C2798j.m14891a((View) flowLayout, (float) ccVar.c, 2));
        }
    }

    private final void m14897a(df dfVar, TextView textView) {
        if (dfVar != null) {
            boolean z;
            boolean z2;
            int i;
            int paintFlags;
            if ((dfVar.a & 1) != 0) {
                textView.setTextSize(C2798j.m14890a(dfVar.c, 2), dfVar.b);
            }
            if ((dfVar.a & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textView.setTextColor(C1607g.m9239a(dfVar.e, textView.getContext()));
            }
            Typeface a = C2798j.m14892a(0);
            if ((dfVar.a & 8) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                a = C2798j.m14892a(dfVar.f);
            }
            if ((dfVar.a & 16) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                switch (dfVar.g) {
                    case 1:
                        textView.setTypeface(a, 1);
                        break;
                    case 2:
                        textView.setTypeface(a, 2);
                        break;
                    case 3:
                        textView.setTypeface(a, 3);
                        break;
                    default:
                        textView.setTypeface(a, 0);
                        break;
                }
            }
            textView.setTypeface(a);
            if ((dfVar.a & 32) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                switch (dfVar.h) {
                    case 1:
                        textView.setEllipsize(TruncateAt.START);
                        break;
                    case 2:
                        textView.setEllipsize(TruncateAt.MIDDLE);
                        break;
                    case 3:
                        textView.setEllipsize(TruncateAt.END);
                        break;
                    case 4:
                        textView.setEllipsize(TruncateAt.MARQUEE);
                        break;
                    default:
                        textView.setEllipsize(null);
                        break;
                }
            }
            if ((dfVar.a & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (dfVar.i == 1) {
                    textView.setSingleLine();
                } else {
                    textView.setMaxLines(dfVar.i);
                }
            }
            if ((dfVar.a & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textView.setAllCaps(dfVar.k);
            }
            if (dfVar.j.length > 0) {
                i = 0;
                for (int b : dfVar.j) {
                    i |= C2798j.m14899b(b);
                }
                textView.setGravity(i);
            }
            if (dfVar.n != null || dfVar.o != null || dfVar.p != null || dfVar.q != null) {
                C2820s c2820s = this.f15120h;
                bd bdVar = dfVar.n;
                bd bdVar2 = dfVar.o;
                bd bdVar3 = dfVar.p;
                bd bdVar4 = dfVar.q;
                bd[] bdVarArr = new bd[]{bdVar, bdVar2, bdVar3, bdVar4};
                x[] xVarArr = (x[]) textView.getTag(C7582R.id.fife_bitmap_textview_loader);
                if (xVarArr == null) {
                    xVarArr = new x[4];
                    textView.setTag(C7582R.id.fife_bitmap_textview_loader, xVarArr);
                }
                x[] xVarArr2 = xVarArr;
                int i2 = 0;
                while (i2 < 4) {
                    int i3;
                    int i4;
                    if (bdVarArr[i2] == null || !bdVarArr[i2].f11863i) {
                        i3 = 0;
                        i4 = 0;
                    } else {
                        i4 = C2820s.m14941a((float) bdVarArr[i2].f11859e.f11878b, textView);
                        i3 = C2820s.m14941a((float) bdVarArr[i2].f11859e.f11879c, textView);
                    }
                    x xVar = xVarArr2[i2];
                    if (!(xVar == null || xVar.c() == null)) {
                        if (bdVarArr[i2] != null && xVar.c().equals(bdVarArr[i2].f11860f) && xVar.d() == i4 && xVar.e() == i3) {
                            i2++;
                        } else {
                            xVar.a();
                        }
                    }
                    if (bdVarArr[i2] != null) {
                        xVarArr2[i2] = c2820s.f15190a.mo1672a(bdVarArr[i2].f11860f, i4, i3, true, new C2821t(textView, i2), false);
                        C2820s.m14942a(textView, i2, xVarArr2[i2].b());
                    } else {
                        C2820s.m14942a(textView, i2, null);
                    }
                    i2++;
                }
            } else if (!(dfVar.r == null && dfVar.s == null && dfVar.t == null && dfVar.u == null)) {
                Context context = textView.getContext();
                bg.m2222a(textView, C2798j.m14893a(context, dfVar.r), C2798j.m14893a(context, dfVar.s), C2798j.m14893a(context, dfVar.t), C2798j.m14893a(context, dfVar.u));
            }
            if ((dfVar.a & 256) != 0) {
                textView.setCompoundDrawablePadding(C2798j.m14891a((View) textView, dfVar.v, 2));
            }
            if (dfVar.l.length > 0) {
                i = 0;
                for (int b2 : dfVar.l) {
                    i |= C2798j.m14900c(b2);
                }
                textView.setPaintFlags(i);
            }
            if (dfVar.m.length > 0) {
                paintFlags = textView.getPaintFlags();
                i = paintFlags;
                for (int b22 : dfVar.m) {
                    i &= C2798j.m14900c(b22) ^ -1;
                }
                textView.setPaintFlags(i);
            }
            if (((dfVar.a & 512) != 0) && VERSION.SDK_INT >= 23) {
                switch (dfVar.w) {
                    case 1:
                        textView.setBreakStrategy(1);
                        return;
                    case 2:
                        textView.setBreakStrategy(2);
                        return;
                    default:
                        textView.setBreakStrategy(0);
                        return;
                }
            }
        }
    }

    private static Typeface m14892a(int i) {
        switch (i) {
            case 1:
                return Typeface.DEFAULT_BOLD;
            case 2:
                return Typeface.MONOSPACE;
            case 3:
                return Typeface.SANS_SERIF;
            case 4:
                return Typeface.SERIF;
            case 5:
                return f15113a;
            case 6:
                return f15114b;
            case 7:
                return f15115c;
            case 8:
                return f15116d;
            case 9:
                return f15117e;
            default:
                return Typeface.DEFAULT;
        }
    }

    private static int m14891a(View view, float f, int i) {
        switch (i) {
            case 7:
                return -2;
            case 8:
                return -1;
            default:
                return (int) TypedValue.applyDimension(C2798j.m14890a(i, 1), f, view.getResources().getDisplayMetrics());
        }
    }

    private static int m14890a(int i, int i2) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return i2;
        }
    }

    private static int m14899b(int i) {
        switch (i) {
            case 1:
                return 80;
            case 2:
                return 17;
            case 3:
                return 1;
            case 4:
                return 16;
            case 5:
                return 8;
            case 6:
                return 128;
            case 7:
                return 8388613;
            case 8:
                return 119;
            case 9:
                return 7;
            case 10:
                return 112;
            case 11:
                return 3;
            case 12:
                return 5;
            case 13:
                return 8388611;
            case 14:
                return 48;
            default:
                return 0;
        }
    }

    private static int m14900c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return MemoryMappedFileBuffer.DEFAULT_PADDING;
            default:
                return 0;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.caverock.androidsvg.cs m14893a(android.content.Context r8, com.google.wireless.android.finsky.dfe.c.a.eh r9) {
        /*
        r1 = 0;
        r2 = 1;
        r3 = 0;
        if (r9 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r9.a;	 Catch:{ SVGParseException -> 0x011a }
        if (r0 != 0) goto L_0x00a1;
    L_0x000a:
        r0 = r2;
    L_0x000b:
        if (r0 == 0) goto L_0x0106;
    L_0x000d:
        r0 = r9.a;	 Catch:{ SVGParseException -> 0x011a }
        if (r0 != 0) goto L_0x00a4;
    L_0x0011:
        r0 = r9.c;	 Catch:{ SVGParseException -> 0x011a }
    L_0x0013:
        switch(r0) {
            case 1: goto L_0x00a7;
            case 2: goto L_0x00ac;
            case 3: goto L_0x00b1;
            case 4: goto L_0x00b6;
            case 5: goto L_0x00bb;
            case 6: goto L_0x00c0;
            case 7: goto L_0x00c5;
            case 8: goto L_0x00ca;
            case 9: goto L_0x00cf;
            case 10: goto L_0x00d4;
            case 11: goto L_0x00d9;
            case 12: goto L_0x00de;
            case 13: goto L_0x00e3;
            case 14: goto L_0x00e8;
            case 15: goto L_0x00ed;
            case 16: goto L_0x00f2;
            case 17: goto L_0x00f7;
            case 18: goto L_0x00fc;
            case 19: goto L_0x0101;
            default: goto L_0x0016;
        };	 Catch:{ SVGParseException -> 0x011a }
    L_0x0016:
        r0 = r3;
    L_0x0017:
        if (r0 == 0) goto L_0x0150;
    L_0x0019:
        r0 = com.caverock.androidsvg.C0722q.m4784a(r8, r0);	 Catch:{ SVGParseException -> 0x011a }
    L_0x001d:
        r4 = r0;
    L_0x001e:
        if (r4 == 0) goto L_0x0005;
    L_0x0020:
        r0 = r9.e;
        if (r0 == 0) goto L_0x0146;
    L_0x0024:
        r5 = r9.e;
        r1 = new com.caverock.androidsvg.as;
        r1.<init>();
        r0 = r5.a;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x0125;
    L_0x0031:
        r0 = r2;
    L_0x0032:
        if (r0 == 0) goto L_0x0039;
    L_0x0034:
        r0 = r5.b;
        r1.m4593b(r0);
    L_0x0039:
        r0 = r5.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0128;
    L_0x003f:
        r0 = r2;
    L_0x0040:
        if (r0 == 0) goto L_0x0047;
    L_0x0042:
        r0 = r5.c;
        r1.m4592a(r0);
    L_0x0047:
        r0 = r5.a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x012b;
    L_0x004d:
        r0 = r2;
    L_0x004e:
        if (r0 == 0) goto L_0x0056;
    L_0x0050:
        r0 = r5.d;
        r0 = (float) r0;
        r4.m4795b(r0);
    L_0x0056:
        r0 = r5.a;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x012e;
    L_0x005c:
        r0 = r2;
    L_0x005d:
        if (r0 == 0) goto L_0x0065;
    L_0x005f:
        r0 = r5.e;
        r0 = (float) r0;
        r4.m4796c(r0);
    L_0x0065:
        r0 = r5.a;
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x0131;
    L_0x006b:
        r0 = r2;
    L_0x006c:
        if (r0 != 0) goto L_0x0089;
    L_0x006e:
        r0 = r5.a;
        r0 = r0 & 32;
        if (r0 == 0) goto L_0x0134;
    L_0x0074:
        r0 = r2;
    L_0x0075:
        if (r0 != 0) goto L_0x0089;
    L_0x0077:
        r0 = r5.a;
        r0 = r0 & 64;
        if (r0 == 0) goto L_0x0137;
    L_0x007d:
        r0 = r2;
    L_0x007e:
        if (r0 != 0) goto L_0x0089;
    L_0x0080:
        r0 = r5.a;
        r0 = r0 & 128;
        if (r0 == 0) goto L_0x013a;
    L_0x0086:
        r0 = r2;
    L_0x0087:
        if (r0 == 0) goto L_0x0146;
    L_0x0089:
        r0 = r5.f;
        r0 = (float) r0;
        r2 = r5.g;
        r2 = (float) r2;
        r3 = r5.h;
        r3 = (float) r3;
        r5 = r5.i;
        r5 = (float) r5;
        r6 = r4.f4614b;
        if (r6 != 0) goto L_0x013d;
    L_0x0099:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "SVG document is empty";
        r0.<init>(r1);
        throw r0;
    L_0x00a1:
        r0 = r3;
        goto L_0x000b;
    L_0x00a4:
        r0 = r3;
        goto L_0x0013;
    L_0x00a7:
        r0 = 2131361806; // 0x7f0a000e float:1.8343375E38 double:1.053032647E-314;
        goto L_0x0017;
    L_0x00ac:
        r0 = 2131361807; // 0x7f0a000f float:1.8343377E38 double:1.0530326477E-314;
        goto L_0x0017;
    L_0x00b1:
        r0 = 2131361808; // 0x7f0a0010 float:1.8343379E38 double:1.053032648E-314;
        goto L_0x0017;
    L_0x00b6:
        r0 = 2131361812; // 0x7f0a0014 float:1.8343387E38 double:1.05303265E-314;
        goto L_0x0017;
    L_0x00bb:
        r0 = 2131361818; // 0x7f0a001a float:1.83434E38 double:1.053032653E-314;
        goto L_0x0017;
    L_0x00c0:
        r0 = 2131361819; // 0x7f0a001b float:1.8343401E38 double:1.0530326536E-314;
        goto L_0x0017;
    L_0x00c5:
        r0 = 2131361804; // 0x7f0a000c float:1.834337E38 double:1.053032646E-314;
        goto L_0x0017;
    L_0x00ca:
        r0 = 2131361860; // 0x7f0a0044 float:1.8343484E38 double:1.053032674E-314;
        goto L_0x0017;
    L_0x00cf:
        r0 = 2131361863; // 0x7f0a0047 float:1.834349E38 double:1.0530326754E-314;
        goto L_0x0017;
    L_0x00d4:
        r0 = 2131361865; // 0x7f0a0049 float:1.8343494E38 double:1.0530326764E-314;
        goto L_0x0017;
    L_0x00d9:
        r0 = 2131361866; // 0x7f0a004a float:1.8343496E38 double:1.053032677E-314;
        goto L_0x0017;
    L_0x00de:
        r0 = 2131361867; // 0x7f0a004b float:1.8343498E38 double:1.0530326773E-314;
        goto L_0x0017;
    L_0x00e3:
        r0 = 2131361894; // 0x7f0a0066 float:1.8343553E38 double:1.0530326907E-314;
        goto L_0x0017;
    L_0x00e8:
        r0 = 2131361869; // 0x7f0a004d float:1.8343503E38 double:1.0530326783E-314;
        goto L_0x0017;
    L_0x00ed:
        r0 = 2131361870; // 0x7f0a004e float:1.8343505E38 double:1.053032679E-314;
        goto L_0x0017;
    L_0x00f2:
        r0 = 2131361871; // 0x7f0a004f float:1.8343507E38 double:1.0530326793E-314;
        goto L_0x0017;
    L_0x00f7:
        r0 = 2131361875; // 0x7f0a0053 float:1.8343515E38 double:1.0530326813E-314;
        goto L_0x0017;
    L_0x00fc:
        r0 = 2131361882; // 0x7f0a005a float:1.8343529E38 double:1.0530326848E-314;
        goto L_0x0017;
    L_0x0101:
        r0 = 2131361844; // 0x7f0a0034 float:1.8343452E38 double:1.053032666E-314;
        goto L_0x0017;
    L_0x0106:
        r0 = r9.a;	 Catch:{ SVGParseException -> 0x011a }
        if (r0 != r2) goto L_0x014e;
    L_0x010a:
        r0 = r9.a;	 Catch:{ SVGParseException -> 0x011a }
        if (r0 != r2) goto L_0x0117;
    L_0x010e:
        r0 = r9.d;	 Catch:{ SVGParseException -> 0x011a }
    L_0x0110:
        r0 = com.caverock.androidsvg.C0722q.m4788a(r0);	 Catch:{ SVGParseException -> 0x011a }
    L_0x0114:
        r4 = r0;
        goto L_0x001e;
    L_0x0117:
        r0 = "";
        goto L_0x0110;
    L_0x011a:
        r0 = move-exception;
        r0 = "Malformed svg source";
        r4 = new java.lang.Object[r3];
        com.google.android.finsky.utils.FinskyLog.m21669e(r0, r4);
        r4 = r1;
        goto L_0x001e;
    L_0x0125:
        r0 = r3;
        goto L_0x0032;
    L_0x0128:
        r0 = r3;
        goto L_0x0040;
    L_0x012b:
        r0 = r3;
        goto L_0x004e;
    L_0x012e:
        r0 = r3;
        goto L_0x005d;
    L_0x0131:
        r0 = r3;
        goto L_0x006c;
    L_0x0134:
        r0 = r3;
        goto L_0x0075;
    L_0x0137:
        r0 = r3;
        goto L_0x007e;
    L_0x013a:
        r0 = r3;
        goto L_0x0087;
    L_0x013d:
        r6 = r4.f4614b;
        r7 = new com.caverock.androidsvg.r;
        r7.<init>(r0, r2, r3, r5);
        r6.w = r7;
    L_0x0146:
        r0 = new com.caverock.androidsvg.cs;
        r0.<init>(r4, r1);
        r1 = r0;
        goto L_0x0005;
    L_0x014e:
        r0 = r1;
        goto L_0x0114;
    L_0x0150:
        r0 = r1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.dialogbuilder.j.a(android.content.Context, com.google.wireless.android.finsky.dfe.c.a.eh):com.caverock.androidsvg.cs");
    }

    static void m14895a(C2817p c2817p, boolean z) {
        Drawable drawable;
        TextView textView = c2817p.f15183a;
        Resources resources = textView.getResources();
        if (z) {
            drawable = resources.getDrawable(c2817p.f15185c);
        } else {
            drawable = resources.getDrawable(c2817p.f15184b);
        }
        drawable = C0259a.m1526e(drawable);
        C0259a.m1514a(drawable.mutate(), textView.getCurrentTextColor());
        bg.m2222a(textView, null, null, drawable, null);
    }
}
