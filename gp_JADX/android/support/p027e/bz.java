package android.support.p027e;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class bz extends an {
    public static final String[] f1117a = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    public int f1118b = 3;

    public final String[] mo245a() {
        return f1117a;
    }

    private static void m975d(bc bcVar) {
        bcVar.f1081a.put("android:visibility:visibility", Integer.valueOf(bcVar.f1082b.getVisibility()));
        bcVar.f1081a.put("android:visibility:parent", bcVar.f1082b.getParent());
        Object obj = new int[2];
        bcVar.f1082b.getLocationOnScreen(obj);
        bcVar.f1081a.put("android:visibility:screenLocation", obj);
    }

    public void mo210a(bc bcVar) {
        bz.m975d(bcVar);
    }

    public final void mo217b(bc bcVar) {
        bz.m975d(bcVar);
    }

    private static cc m974b(bc bcVar, bc bcVar2) {
        cc ccVar = new cc();
        ccVar.f1127a = false;
        ccVar.f1128b = false;
        if (bcVar == null || !bcVar.f1081a.containsKey("android:visibility:visibility")) {
            ccVar.f1129c = -1;
            ccVar.f1131e = null;
        } else {
            ccVar.f1129c = ((Integer) bcVar.f1081a.get("android:visibility:visibility")).intValue();
            ccVar.f1131e = (ViewGroup) bcVar.f1081a.get("android:visibility:parent");
        }
        if (bcVar2 == null || !bcVar2.f1081a.containsKey("android:visibility:visibility")) {
            ccVar.f1130d = -1;
            ccVar.f1132f = null;
        } else {
            ccVar.f1130d = ((Integer) bcVar2.f1081a.get("android:visibility:visibility")).intValue();
            ccVar.f1132f = (ViewGroup) bcVar2.f1081a.get("android:visibility:parent");
        }
        if (bcVar == null || bcVar2 == null) {
            if (bcVar == null && ccVar.f1130d == 0) {
                ccVar.f1128b = true;
                ccVar.f1127a = true;
            } else if (bcVar2 == null && ccVar.f1129c == 0) {
                ccVar.f1128b = false;
                ccVar.f1127a = true;
            }
        } else if (ccVar.f1129c == ccVar.f1130d && ccVar.f1131e == ccVar.f1132f) {
            return ccVar;
        } else {
            if (ccVar.f1129c != ccVar.f1130d) {
                if (ccVar.f1129c == 0) {
                    ccVar.f1128b = false;
                    ccVar.f1127a = true;
                } else if (ccVar.f1130d == 0) {
                    ccVar.f1128b = true;
                    ccVar.f1127a = true;
                }
            } else if (ccVar.f1132f == null) {
                ccVar.f1128b = false;
                ccVar.f1127a = true;
            } else if (ccVar.f1131e == null) {
                ccVar.f1128b = true;
                ccVar.f1127a = true;
            }
        }
        return ccVar;
    }

    public final Animator mo243a(ViewGroup viewGroup, bc bcVar, bc bcVar2) {
        cc b = bz.m974b(bcVar, bcVar2);
        if (!b.f1127a || (b.f1131e == null && b.f1132f == null)) {
            return null;
        }
        if (b.f1128b) {
            return m977a(viewGroup, bcVar, b.f1129c, bcVar2, b.f1130d);
        }
        return m983b(viewGroup, bcVar, b.f1129c, bcVar2, b.f1130d);
    }

    public Animator m977a(ViewGroup viewGroup, bc bcVar, int i, bc bcVar2, int i2) {
        if ((this.f1118b & 1) != 1 || bcVar2 == null) {
            return null;
        }
        if (bcVar == null) {
            View view = (View) bcVar2.f1082b.getParent();
            if (bz.m974b(m856b(view, false), m841a(view, false)).f1127a) {
                return null;
            }
        }
        return mo248a(bcVar2.f1082b, bcVar);
    }

    public Animator mo248a(View view, bc bcVar) {
        return null;
    }

    public Animator m983b(ViewGroup viewGroup, bc bcVar, int i, bc bcVar2, int i2) {
        if ((this.f1118b & 2) != 2) {
            return null;
        }
        int id;
        View view = bcVar != null ? bcVar.f1082b : null;
        View view2 = bcVar2 != null ? bcVar2.f1082b : null;
        View view3 = null;
        if (view2 == null || view2.getParent() == null) {
            if (view2 != null) {
                view = null;
                view3 = view2;
            } else {
                if (view != null) {
                    if (view.getParent() != null) {
                        if (view.getParent() instanceof View) {
                            view2 = (View) view.getParent();
                            if (bz.m974b(m841a(view2, true), m856b(view2, true)).f1127a) {
                                if (view2.getParent() == null) {
                                    id = view2.getId();
                                    if (!(id == -1 || viewGroup.findViewById(id) == null || !this.J)) {
                                        view2 = view;
                                        view = null;
                                        view3 = view2;
                                    }
                                }
                                view2 = null;
                                view = null;
                                view3 = view2;
                            } else {
                                Matrix matrix = new Matrix();
                                matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                                bq.f1103a.mo237a(view, matrix);
                                bq.f1103a.mo239b(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
                                matrix.mapRect(rectF);
                                int round = Math.round(rectF.left);
                                int round2 = Math.round(rectF.top);
                                int round3 = Math.round(rectF.right);
                                int round4 = Math.round(rectF.bottom);
                                view3 = new ImageView(view.getContext());
                                view3.setScaleType(ScaleType.CENTER_CROP);
                                Bitmap bitmap = null;
                                int round5 = Math.round(rectF.width());
                                int round6 = Math.round(rectF.height());
                                if (round5 > 0 && round6 > 0) {
                                    float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
                                    round5 = (int) (((float) round5) * min);
                                    round6 = (int) (((float) round6) * min);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(min, min);
                                    bitmap = Bitmap.createBitmap(round5, round6, Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmap);
                                    canvas.concat(matrix);
                                    view.draw(canvas);
                                }
                                if (bitmap != null) {
                                    view3.setImageBitmap(bitmap);
                                }
                                view3.measure(MeasureSpec.makeMeasureSpec(round3 - round, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(round4 - round2, MemoryMappedFileBuffer.DEFAULT_SIZE));
                                view3.layout(round, round2, round3, round4);
                                view = null;
                            }
                        }
                    }
                    view3 = view;
                    view = null;
                }
                view = null;
            }
        } else if (i2 == 4) {
            view = view2;
        } else {
            if (view == view2) {
                view = view2;
            }
            view3 = view;
            view = null;
        }
        Animator b;
        if (view3 != null && bcVar != null) {
            int[] iArr = (int[]) bcVar.f1081a.get("android:visibility:screenLocation");
            int i3 = iArr[0];
            id = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view3.offsetLeftAndRight((i3 - iArr2[0]) - view3.getLeft());
            view3.offsetTopAndBottom((id - iArr2[1]) - view3.getTop());
            bg a = bh.f1090a.mo232a(viewGroup);
            a.mo230a(view3);
            b = mo249b(view3, bcVar);
            if (b == null) {
                a.mo231b(view3);
                return b;
            }
            b.addListener(new ca(a, view3));
            return b;
        } else if (view == null) {
            return null;
        } else {
            int visibility = view.getVisibility();
            bq.m943a(view, 0);
            b = mo249b(view, bcVar);
            if (b != null) {
                at cbVar = new cb(view, i2);
                b.addListener(cbVar);
                C0175a.f1008a.mo226a(b, cbVar);
                mo206a(cbVar);
                return b;
            }
            bq.m943a(view, visibility);
            return b;
        }
    }

    public Animator mo249b(View view, bc bcVar) {
        return null;
    }

    public final boolean mo244a(bc bcVar, bc bcVar2) {
        if (bcVar == null && bcVar2 == null) {
            return false;
        }
        if (bcVar != null && bcVar2 != null && bcVar2.f1081a.containsKey("android:visibility:visibility") != bcVar.f1081a.containsKey("android:visibility:visibility")) {
            return false;
        }
        cc b = bz.m974b(bcVar, bcVar2);
        if (!b.f1127a) {
            return false;
        }
        if (b.f1129c == 0 || b.f1130d == 0) {
            return true;
        }
        return false;
    }
}
