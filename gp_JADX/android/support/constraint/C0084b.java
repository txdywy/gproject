package android.support.constraint;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;

public final class C0084b {
    public static final int[] f360a = new int[]{0, 4, 8};
    public static SparseIntArray f361c;
    public HashMap f362b = new HashMap();

    private static int m180a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    static void m181a(C0085c c0085c, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f361c.get(index)) {
                case 1:
                    c0085c.f404p = C0084b.m180a(typedArray, index, c0085c.f404p);
                    break;
                case 2:
                    c0085c.f366D = typedArray.getDimensionPixelSize(index, c0085c.f366D);
                    break;
                case 3:
                    c0085c.f403o = C0084b.m180a(typedArray, index, c0085c.f403o);
                    break;
                case 4:
                    c0085c.f402n = C0084b.m180a(typedArray, index, c0085c.f402n);
                    break;
                case 5:
                    c0085c.f411w = typedArray.getString(index);
                    break;
                case 6:
                    c0085c.f412x = typedArray.getDimensionPixelOffset(index, c0085c.f412x);
                    break;
                case 7:
                    c0085c.f413y = typedArray.getDimensionPixelOffset(index, c0085c.f413y);
                    break;
                case 8:
                    c0085c.f367E = typedArray.getDimensionPixelSize(index, c0085c.f367E);
                    break;
                case 9:
                    c0085c.f402n = C0084b.m180a(typedArray, index, c0085c.f408t);
                    break;
                case 10:
                    c0085c.f407s = C0084b.m180a(typedArray, index, c0085c.f407s);
                    break;
                case 11:
                    c0085c.f373K = typedArray.getDimensionPixelSize(index, c0085c.f373K);
                    break;
                case 12:
                    c0085c.f374L = typedArray.getDimensionPixelSize(index, c0085c.f374L);
                    break;
                case 13:
                    c0085c.f370H = typedArray.getDimensionPixelSize(index, c0085c.f370H);
                    break;
                case 14:
                    c0085c.f372J = typedArray.getDimensionPixelSize(index, c0085c.f372J);
                    break;
                case 15:
                    c0085c.f375M = typedArray.getDimensionPixelSize(index, c0085c.f375M);
                    break;
                case 16:
                    c0085c.f371I = typedArray.getDimensionPixelSize(index, c0085c.f371I);
                    break;
                case 17:
                    c0085c.f393e = typedArray.getDimensionPixelOffset(index, c0085c.f393e);
                    break;
                case 18:
                    c0085c.f394f = typedArray.getDimensionPixelOffset(index, c0085c.f394f);
                    break;
                case 19:
                    c0085c.f395g = typedArray.getFloat(index, c0085c.f395g);
                    break;
                case 20:
                    c0085c.f409u = typedArray.getFloat(index, c0085c.f409u);
                    break;
                case 21:
                    c0085c.f391c = typedArray.getLayoutDimension(index, c0085c.f391c);
                    break;
                case 22:
                    c0085c.f369G = typedArray.getInt(index, c0085c.f369G);
                    c0085c.f369G = f360a[c0085c.f369G];
                    break;
                case 23:
                    c0085c.f390b = typedArray.getLayoutDimension(index, c0085c.f390b);
                    break;
                case 24:
                    c0085c.f363A = typedArray.getDimensionPixelSize(index, c0085c.f363A);
                    break;
                case 25:
                    c0085c.f396h = C0084b.m180a(typedArray, index, c0085c.f396h);
                    break;
                case 26:
                    c0085c.f397i = C0084b.m180a(typedArray, index, c0085c.f397i);
                    break;
                case 27:
                    c0085c.f414z = typedArray.getInt(index, c0085c.f414z);
                    break;
                case 28:
                    c0085c.f364B = typedArray.getDimensionPixelSize(index, c0085c.f364B);
                    break;
                case 29:
                    c0085c.f398j = C0084b.m180a(typedArray, index, c0085c.f398j);
                    break;
                case 30:
                    c0085c.f399k = C0084b.m180a(typedArray, index, c0085c.f399k);
                    break;
                case 31:
                    c0085c.f368F = typedArray.getDimensionPixelSize(index, c0085c.f368F);
                    break;
                case 32:
                    c0085c.f405q = C0084b.m180a(typedArray, index, c0085c.f405q);
                    break;
                case 33:
                    c0085c.f406r = C0084b.m180a(typedArray, index, c0085c.f406r);
                    break;
                case 34:
                    c0085c.f365C = typedArray.getDimensionPixelSize(index, c0085c.f365C);
                    break;
                case 35:
                    c0085c.f401m = C0084b.m180a(typedArray, index, c0085c.f401m);
                    break;
                case 36:
                    c0085c.f400l = C0084b.m180a(typedArray, index, c0085c.f400l);
                    break;
                case 37:
                    c0085c.f410v = typedArray.getFloat(index, c0085c.f410v);
                    break;
                case 38:
                    c0085c.f392d = typedArray.getResourceId(index, c0085c.f392d);
                    break;
                case 39:
                    c0085c.f377O = typedArray.getFloat(index, c0085c.f377O);
                    break;
                case 40:
                    c0085c.f376N = typedArray.getFloat(index, c0085c.f376N);
                    break;
                case 41:
                    c0085c.f378P = typedArray.getInt(index, c0085c.f378P);
                    break;
                case 42:
                    c0085c.f379Q = typedArray.getInt(index, c0085c.f379Q);
                    break;
                case 43:
                    c0085c.f380R = typedArray.getFloat(index, c0085c.f380R);
                    break;
                case 44:
                    c0085c.f381S = true;
                    c0085c.f382T = typedArray.getFloat(index, c0085c.f382T);
                    break;
                case 45:
                    c0085c.f383U = typedArray.getFloat(index, c0085c.f383U);
                    break;
                case 46:
                    c0085c.f384V = typedArray.getFloat(index, c0085c.f384V);
                    break;
                case 47:
                    c0085c.f385W = typedArray.getFloat(index, c0085c.f385W);
                    break;
                case 48:
                    c0085c.f386X = typedArray.getFloat(index, c0085c.f386X);
                    break;
                case 49:
                    c0085c.f387Y = typedArray.getFloat(index, c0085c.f387Y);
                    break;
                case 50:
                    c0085c.f388Z = typedArray.getFloat(index, c0085c.f388Z);
                    break;
                case 51:
                    c0085c.aa = typedArray.getFloat(index, c0085c.aa);
                    break;
                case 52:
                    c0085c.ab = typedArray.getFloat(index, c0085c.ab);
                    break;
                case 53:
                    c0085c.ac = typedArray.getFloat(index, c0085c.ac);
                    break;
                case 60:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f361c.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f361c.get(index));
                    break;
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f361c = sparseIntArray;
        sparseIntArray.append(C0086d.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f361c.append(C0086d.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f361c.append(C0086d.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f361c.append(C0086d.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f361c.append(C0086d.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f361c.append(C0086d.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f361c.append(C0086d.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f361c.append(C0086d.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f361c.append(C0086d.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f361c.append(C0086d.ConstraintSet_layout_editor_absoluteX, 6);
        f361c.append(C0086d.ConstraintSet_layout_editor_absoluteY, 7);
        f361c.append(C0086d.ConstraintSet_layout_constraintGuide_begin, 17);
        f361c.append(C0086d.ConstraintSet_layout_constraintGuide_end, 18);
        f361c.append(C0086d.ConstraintSet_layout_constraintGuide_percent, 19);
        f361c.append(C0086d.ConstraintSet_android_orientation, 27);
        f361c.append(C0086d.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f361c.append(C0086d.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f361c.append(C0086d.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f361c.append(C0086d.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f361c.append(C0086d.ConstraintSet_layout_goneMarginLeft, 13);
        f361c.append(C0086d.ConstraintSet_layout_goneMarginTop, 16);
        f361c.append(C0086d.ConstraintSet_layout_goneMarginRight, 14);
        f361c.append(C0086d.ConstraintSet_layout_goneMarginBottom, 11);
        f361c.append(C0086d.ConstraintSet_layout_goneMarginStart, 15);
        f361c.append(C0086d.ConstraintSet_layout_goneMarginEnd, 12);
        f361c.append(C0086d.ConstraintSet_layout_constraintVertical_weight, 40);
        f361c.append(C0086d.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f361c.append(C0086d.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f361c.append(C0086d.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f361c.append(C0086d.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f361c.append(C0086d.ConstraintSet_layout_constraintVertical_bias, 37);
        f361c.append(C0086d.ConstraintSet_layout_constraintDimensionRatio, 5);
        f361c.append(C0086d.ConstraintSet_layout_constraintLeft_creator, 60);
        f361c.append(C0086d.ConstraintSet_layout_constraintTop_creator, 60);
        f361c.append(C0086d.ConstraintSet_layout_constraintRight_creator, 60);
        f361c.append(C0086d.ConstraintSet_layout_constraintBottom_creator, 60);
        f361c.append(C0086d.ConstraintSet_layout_constraintBaseline_creator, 60);
        f361c.append(C0086d.ConstraintSet_android_layout_marginLeft, 24);
        f361c.append(C0086d.ConstraintSet_android_layout_marginRight, 28);
        f361c.append(C0086d.ConstraintSet_android_layout_marginStart, 31);
        f361c.append(C0086d.ConstraintSet_android_layout_marginEnd, 8);
        f361c.append(C0086d.ConstraintSet_android_layout_marginTop, 34);
        f361c.append(C0086d.ConstraintSet_android_layout_marginBottom, 2);
        f361c.append(C0086d.ConstraintSet_android_layout_width, 23);
        f361c.append(C0086d.ConstraintSet_android_layout_height, 21);
        f361c.append(C0086d.ConstraintSet_android_visibility, 22);
        f361c.append(C0086d.ConstraintSet_android_alpha, 43);
        f361c.append(C0086d.ConstraintSet_android_elevation, 44);
        f361c.append(C0086d.ConstraintSet_android_rotationX, 45);
        f361c.append(C0086d.ConstraintSet_android_rotationY, 46);
        f361c.append(C0086d.ConstraintSet_android_scaleX, 47);
        f361c.append(C0086d.ConstraintSet_android_scaleY, 48);
        f361c.append(C0086d.ConstraintSet_android_transformPivotX, 49);
        f361c.append(C0086d.ConstraintSet_android_transformPivotY, 50);
        f361c.append(C0086d.ConstraintSet_android_translationX, 51);
        f361c.append(C0086d.ConstraintSet_android_translationY, 52);
        f361c.append(C0086d.ConstraintSet_android_translationZ, 53);
        f361c.append(C0086d.ConstraintSet_layout_constraintWidth_default, 54);
        f361c.append(C0086d.ConstraintSet_layout_constraintHeight_default, 55);
        f361c.append(C0086d.ConstraintSet_layout_constraintWidth_max, 56);
        f361c.append(C0086d.ConstraintSet_layout_constraintHeight_max, 57);
        f361c.append(C0086d.ConstraintSet_layout_constraintWidth_min, 58);
        f361c.append(C0086d.ConstraintSet_layout_constraintHeight_min, 59);
        f361c.append(C0086d.ConstraintSet_android_id, 38);
    }
}
