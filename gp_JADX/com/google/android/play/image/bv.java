package com.google.android.play.image;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.util.SparseArray;
import java.lang.ref.ReferenceQueue;

public final class bv implements C6364u {
    public final SparseArray f32085a = new SparseArray();
    public final ReferenceQueue f32086b = new ReferenceQueue();
    public final LruCache f32087c;
    public final int f32088d;

    public bv(int i, int i2) {
        this.f32087c = new bw(i);
        this.f32088d = i2;
    }

    public final void mo5397a(String str, int i, int i2, Bitmap bitmap) {
        int hashCode = str.hashCode();
        bx bxVar = (bx) this.f32085a.get(hashCode);
        bx bxVar2 = new bx(bitmap, this.f32086b, str, i, i2, bxVar);
        if (bxVar != null) {
            bxVar.f32092d = bxVar2;
        }
        this.f32085a.put(hashCode, bxVar2);
        if (bitmap.getHeight() * bitmap.getRowBytes() <= this.f32088d) {
            this.f32087c.put(bitmap, bitmap);
        }
        while (true) {
            bxVar2 = (bx) this.f32086b.poll();
            if (bxVar2 != null) {
                bx bxVar3 = bxVar2.f32092d;
                bx bxVar4 = bxVar2.f32093e;
                if (bxVar3 != null) {
                    bxVar3.f32093e = bxVar4;
                    if (bxVar4 != null) {
                        bxVar4.f32092d = bxVar3;
                    }
                } else {
                    int hashCode2 = bxVar2.f32089a.hashCode();
                    if (bxVar4 == null) {
                        this.f32085a.delete(hashCode2);
                    } else {
                        this.f32085a.put(hashCode2, bxVar4);
                        bxVar4.f32092d = null;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.image.C6381v mo5395a(java.lang.String r13, int r14, int r15) {
        /*
        r12 = this;
        r6 = 0;
        r1 = 0;
        r0 = r13.hashCode();
        r2 = r12.f32085a;
        r0 = r2.get(r0);
        r0 = (com.google.android.play.image.bx) r0;
        r8 = r0;
        r3 = r1;
        r5 = r6;
    L_0x0011:
        if (r8 == 0) goto L_0x0066;
    L_0x0013:
        r0 = r8.f32089a;
        r0 = r0.equals(r13);
        if (r0 == 0) goto L_0x0075;
    L_0x001b:
        r0 = r8.get();
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x0075;
    L_0x0023:
        r4 = r0.getWidth();
        r2 = r0.getHeight();
        r7 = r8.f32090b;
        if (r14 != r7) goto L_0x003f;
    L_0x002f:
        r7 = r8.f32091c;
        if (r15 != r7) goto L_0x003f;
    L_0x0033:
        r1 = r12.f32087c;
        r1.put(r0, r0);
        r1 = new com.google.android.play.image.v;
        r1.<init>(r0, r14, r15);
        r0 = r1;
    L_0x003e:
        return r0;
    L_0x003f:
        if (r5 == 0) goto L_0x0049;
    L_0x0041:
        if (r14 != 0) goto L_0x0054;
    L_0x0043:
        r7 = m29275a(r15, r2, r1);
    L_0x0047:
        if (r7 == 0) goto L_0x0075;
    L_0x0049:
        r1 = r4;
        r11 = r2;
        r2 = r0;
        r0 = r11;
    L_0x004d:
        r3 = r8.f32093e;
        r8 = r3;
        r5 = r2;
        r3 = r1;
        r1 = r0;
        goto L_0x0011;
    L_0x0054:
        if (r15 != 0) goto L_0x005b;
    L_0x0056:
        r7 = m29275a(r14, r4, r3);
        goto L_0x0047;
    L_0x005b:
        r7 = r14 * r15;
        r9 = r4 * r2;
        r10 = r3 * r1;
        r7 = m29275a(r7, r9, r10);
        goto L_0x0047;
    L_0x0066:
        if (r5 != 0) goto L_0x006a;
    L_0x0068:
        r0 = r6;
        goto L_0x003e;
    L_0x006a:
        r0 = r12.f32087c;
        r0.put(r5, r5);
        r0 = new com.google.android.play.image.v;
        r0.<init>(r5, r3, r1);
        goto L_0x003e;
    L_0x0075:
        r0 = r1;
        r2 = r5;
        r1 = r3;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.image.bv.a(java.lang.String, int, int):com.google.android.play.image.v");
    }

    public final void mo5396a() {
        this.f32087c.evictAll();
    }

    private static boolean m29275a(int i, int i2, int i3) {
        if (i >= i2 || i >= i3) {
            if (i <= i2 || i <= i3) {
                if (i2 <= i3) {
                    return false;
                }
                return true;
            } else if (i2 <= i3) {
                return false;
            } else {
                return true;
            }
        } else if (i2 < i3) {
            return true;
        } else {
            return false;
        }
    }
}
