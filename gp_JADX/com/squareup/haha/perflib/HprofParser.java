package com.squareup.haha.perflib;

import b.a.af;
import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.perflib.io.HprofBuffer;
import java.io.EOFException;

public class HprofParser {
    public static final int ALLOC_SITES = 6;
    public static final int CONTROL_SETTINGS = 14;
    public static final int CPU_SAMPLES = 13;
    public static final int END_THREAD = 11;
    public static final int HEAP_DUMP = 12;
    public static final int HEAP_DUMP_END = 44;
    public static final int HEAP_DUMP_SEGMENT = 28;
    public static final int HEAP_SUMMARY = 7;
    public static final int LOAD_CLASS = 2;
    public static final int ROOT_CLASS_DUMP = 32;
    public static final int ROOT_DEBUGGER = 139;
    public static final int ROOT_FINALIZING = 138;
    public static final int ROOT_HEAP_DUMP_INFO = 254;
    public static final int ROOT_INSTANCE_DUMP = 33;
    public static final int ROOT_INTERNED_STRING = 137;
    public static final int ROOT_JAVA_FRAME = 3;
    public static final int ROOT_JNI_GLOBAL = 1;
    public static final int ROOT_JNI_LOCAL = 2;
    public static final int ROOT_JNI_MONITOR = 142;
    public static final int ROOT_MONITOR_USED = 7;
    public static final int ROOT_NATIVE_STACK = 4;
    public static final int ROOT_OBJECT_ARRAY_DUMP = 34;
    public static final int ROOT_PRIMITIVE_ARRAY_DUMP = 35;
    public static final int ROOT_PRIMITIVE_ARRAY_NODATA = 195;
    public static final int ROOT_REFERENCE_CLEANUP = 140;
    public static final int ROOT_STICKY_CLASS = 5;
    public static final int ROOT_THREAD_BLOCK = 6;
    public static final int ROOT_THREAD_OBJECT = 8;
    public static final int ROOT_UNKNOWN = 255;
    public static final int ROOT_UNREACHABLE = 144;
    public static final int ROOT_VM_INTERNAL = 141;
    public static final int STACK_FRAME = 4;
    public static final int STACK_TRACE = 5;
    public static final int START_THREAD = 10;
    public static final int STRING_IN_UTF8 = 1;
    public static final int UNLOAD_CLASS = 3;
    @NonNull
    public af mClassNames = new af();
    public int mIdSize;
    @NonNull
    public final HprofBuffer mInput;
    public Snapshot mSnapshot;
    @NonNull
    public af mStrings = new af();

    public HprofParser(@NonNull HprofBuffer hprofBuffer) {
        this.mInput = hprofBuffer;
    }

    @NonNull
    public final Snapshot parse() {
        Snapshot snapshot = new Snapshot(this.mInput);
        this.mSnapshot = snapshot;
        readNullTerminatedString();
        this.mIdSize = this.mInput.readInt();
        this.mSnapshot.setIdSize(this.mIdSize);
        this.mInput.readLong();
        while (this.mInput.hasRemaining()) {
            int readUnsignedByte = readUnsignedByte();
            this.mInput.readInt();
            long readUnsignedInt = readUnsignedInt();
            switch (readUnsignedByte) {
                case 1:
                    loadString(((int) readUnsignedInt) - this.mIdSize);
                    break;
                case 2:
                    try {
                        loadClass();
                        break;
                    } catch (EOFException e) {
                        break;
                    }
                case 4:
                    loadStackFrame();
                    break;
                case 5:
                    loadStackTrace();
                    break;
                case 12:
                    loadHeapDump(readUnsignedInt);
                    this.mSnapshot.setToDefaultHeap();
                    break;
                case 28:
                    loadHeapDump(readUnsignedInt);
                    this.mSnapshot.setToDefaultHeap();
                    break;
                default:
                    skipFully(readUnsignedInt);
                    break;
            }
        }
        try {
            this.mSnapshot.resolveClasses();
            this.mSnapshot.resolveReferences();
        } catch (Throwable e2) {
            C6918a.f34250a.mo5841a(e2);
        }
        this.mClassNames.clear();
        this.mStrings.clear();
        return snapshot;
    }

    @NonNull
    private String readNullTerminatedString() {
        StringBuilder stringBuilder = new StringBuilder();
        int readByte = this.mInput.readByte();
        while (readByte != 0) {
            stringBuilder.append((char) readByte);
            readByte = this.mInput.readByte();
        }
        return stringBuilder.toString();
    }

    private long readId() {
        switch (this.mIdSize) {
            case 1:
                return (long) this.mInput.readByte();
            case 2:
                return (long) this.mInput.readShort();
            case 4:
                return (long) this.mInput.readInt();
            case 8:
                return this.mInput.readLong();
            default:
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
        }
    }

    @NonNull
    private String readUTF8(int i) {
        byte[] bArr = new byte[i];
        this.mInput.read(bArr);
        return new String(bArr, "utf-8");
    }

    private int readUnsignedByte() {
        return this.mInput.readByte() & ROOT_UNKNOWN;
    }

    private int readUnsignedShort() {
        return this.mInput.readShort() & 65535;
    }

    private long readUnsignedInt() {
        return ((long) this.mInput.readInt()) & 4294967295L;
    }

    private void loadString(int i) {
        this.mStrings.a(readId(), readUTF8(i));
    }

    private void loadClass() {
        this.mInput.readInt();
        long readId = readId();
        this.mInput.readInt();
        this.mClassNames.a(readId, (String) this.mStrings.e(readId()));
    }

    private void loadStackFrame() {
        this.mSnapshot.addStackFrame(new StackFrame(readId(), (String) this.mStrings.e(readId()), (String) this.mStrings.e(readId()), (String) this.mStrings.e(readId()), this.mInput.readInt(), this.mInput.readInt()));
    }

    private void loadStackTrace() {
        int readInt = this.mInput.readInt();
        int readInt2 = this.mInput.readInt();
        int readInt3 = this.mInput.readInt();
        StackFrame[] stackFrameArr = new StackFrame[readInt3];
        for (int i = 0; i < readInt3; i++) {
            stackFrameArr[i] = this.mSnapshot.getStackFrame(readId());
        }
        this.mSnapshot.addStackTrace(new StackTrace(readInt, readInt2, stackFrameArr));
    }

    private void loadHeapDump(long j) {
        while (j > 0) {
            int readUnsignedByte = readUnsignedByte();
            long j2 = j - 1;
            switch (readUnsignedByte) {
                case 1:
                    long loadBasicObj = j2 - ((long) loadBasicObj(RootType.NATIVE_STATIC));
                    readId();
                    j = loadBasicObj - ((long) this.mIdSize);
                    break;
                case 2:
                    j = j2 - ((long) loadJniLocal());
                    break;
                case 3:
                    j = j2 - ((long) loadJavaFrame());
                    break;
                case 4:
                    j = j2 - ((long) loadNativeStack());
                    break;
                case 5:
                    j = j2 - ((long) loadBasicObj(RootType.SYSTEM_CLASS));
                    break;
                case 6:
                    j = j2 - ((long) loadThreadBlock());
                    break;
                case 7:
                    j = j2 - ((long) loadBasicObj(RootType.BUSY_MONITOR));
                    break;
                case 8:
                    j = j2 - ((long) loadThreadObject());
                    break;
                case 32:
                    j = j2 - ((long) loadClassDump());
                    break;
                case 33:
                    j = j2 - ((long) loadInstanceDump());
                    break;
                case 34:
                    j = j2 - ((long) loadObjectArrayDump());
                    break;
                case 35:
                    j = j2 - ((long) loadPrimitiveArrayDump());
                    break;
                case ROOT_INTERNED_STRING /*137*/:
                    j = j2 - ((long) loadBasicObj(RootType.INTERNED_STRING));
                    break;
                case ROOT_FINALIZING /*138*/:
                    j = j2 - ((long) loadBasicObj(RootType.FINALIZING));
                    break;
                case ROOT_DEBUGGER /*139*/:
                    j = j2 - ((long) loadBasicObj(RootType.DEBUGGER));
                    break;
                case ROOT_REFERENCE_CLEANUP /*140*/:
                    j = j2 - ((long) loadBasicObj(RootType.REFERENCE_CLEANUP));
                    break;
                case ROOT_VM_INTERNAL /*141*/:
                    j = j2 - ((long) loadBasicObj(RootType.VM_INTERNAL));
                    break;
                case ROOT_JNI_MONITOR /*142*/:
                    j = j2 - ((long) loadJniMonitor());
                    break;
                case ROOT_UNREACHABLE /*144*/:
                    j = j2 - ((long) loadBasicObj(RootType.UNREACHABLE));
                    break;
                case ROOT_PRIMITIVE_ARRAY_NODATA /*195*/:
                    System.err.println("+--- PRIMITIVE ARRAY NODATA DUMP");
                    loadPrimitiveArrayDump();
                    throw new IllegalArgumentException("Don't know how to load a nodata array");
                case ROOT_HEAP_DUMP_INFO /*254*/:
                    this.mSnapshot.setHeapTo(this.mInput.readInt(), (String) this.mStrings.e(readId()));
                    j = j2 - ((long) (this.mIdSize + 4));
                    break;
                case ROOT_UNKNOWN /*255*/:
                    j = j2 - ((long) loadBasicObj(RootType.UNKNOWN));
                    break;
                default:
                    throw new IllegalArgumentException("loadHeapDump loop with unknown tag " + readUnsignedByte + " with " + this.mInput.remaining() + " bytes possibly remaining");
            }
        }
    }

    private int loadJniLocal() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.NATIVE_LOCAL, readId, readInt, this.mSnapshot.getStackTraceAtDepth(this.mSnapshot.getThread(readInt).mStackTrace, this.mInput.readInt())));
        return (this.mIdSize + 4) + 4;
    }

    private int loadJavaFrame() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.JAVA_LOCAL, readId, readInt, this.mSnapshot.getStackTraceAtDepth(this.mSnapshot.getThread(readInt).mStackTrace, this.mInput.readInt())));
        return (this.mIdSize + 4) + 4;
    }

    private int loadNativeStack() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.NATIVE_STACK, readId, readInt, this.mSnapshot.getStackTrace(this.mSnapshot.getThread(readInt).mStackTrace)));
        return this.mIdSize + 4;
    }

    private int loadBasicObj(RootType rootType) {
        this.mSnapshot.addRoot(new RootObj(rootType, readId()));
        return this.mIdSize;
    }

    private int loadThreadBlock() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.THREAD_BLOCK, readId, readInt, this.mSnapshot.getStackTrace(this.mSnapshot.getThread(readInt).mStackTrace)));
        return this.mIdSize + 4;
    }

    private int loadThreadObject() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addThread(new ThreadObj(readId, this.mInput.readInt()), readInt);
        return (this.mIdSize + 4) + 4;
    }

    private int loadClassDump() {
        int i;
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        long readId2 = readId();
        long readId3 = readId();
        readId();
        readId();
        readId();
        readId();
        int readInt = this.mInput.readInt();
        int i2 = ((this.mIdSize * 7) + 4) + 4;
        int readUnsignedShort = readUnsignedShort();
        int i3 = i2 + 2;
        i2 = 0;
        while (i2 < readUnsignedShort) {
            readUnsignedShort();
            i2++;
            i3 = (skipValue() + 2) + i3;
        }
        ClassObj classObj = new ClassObj(readId, stackTrace, (String) this.mClassNames.e(readId), this.mInput.position());
        classObj.setSuperClassId(readId2);
        classObj.setClassLoaderId(readId3);
        int readUnsignedShort2 = readUnsignedShort();
        Field[] fieldArr = new Field[readUnsignedShort2];
        readUnsignedShort = i3 + 2;
        for (i = 0; i < readUnsignedShort2; i++) {
            String str = (String) this.mStrings.e(readId());
            Type type = Type.getType(this.mInput.readByte());
            fieldArr[i] = new Field(type, str);
            skipFully((long) this.mSnapshot.getTypeSize(type));
            readUnsignedShort += (this.mIdSize + 1) + this.mSnapshot.getTypeSize(type);
        }
        classObj.setStaticFields(fieldArr);
        readUnsignedShort2 = readUnsignedShort();
        fieldArr = new Field[readUnsignedShort2];
        readUnsignedShort += 2;
        for (i = 0; i < readUnsignedShort2; i++) {
            fieldArr[i] = new Field(Type.getType(readUnsignedByte()), (String) this.mStrings.e(readId()));
            readUnsignedShort += this.mIdSize + 1;
        }
        classObj.setFields(fieldArr);
        classObj.setInstanceSize(readInt);
        this.mSnapshot.addClass(readId, classObj);
        return readUnsignedShort;
    }

    private int loadInstanceDump() {
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        long readId2 = readId();
        int readInt = this.mInput.readInt();
        Instance classInstance = new ClassInstance(readId, stackTrace, this.mInput.position());
        classInstance.setClassId(readId2);
        this.mSnapshot.addInstance(readId, classInstance);
        skipFully((long) readInt);
        return (((this.mIdSize + 4) + this.mIdSize) + 4) + readInt;
    }

    private int loadObjectArrayDump() {
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        int readInt = this.mInput.readInt();
        long readId2 = readId();
        Instance arrayInstance = new ArrayInstance(readId, stackTrace, Type.OBJECT, readInt, this.mInput.position());
        arrayInstance.setClassId(readId2);
        this.mSnapshot.addInstance(readId, arrayInstance);
        int i = this.mIdSize * readInt;
        skipFully((long) i);
        return i + (((this.mIdSize + 4) + 4) + this.mIdSize);
    }

    private int loadPrimitiveArrayDump() {
        long readId = readId();
        StackTrace stackTrace = this.mSnapshot.getStackTrace(this.mInput.readInt());
        int readInt = this.mInput.readInt();
        Type type = Type.getType(readUnsignedByte());
        int typeSize = this.mSnapshot.getTypeSize(type);
        this.mSnapshot.addInstance(readId, new ArrayInstance(readId, stackTrace, type, readInt, this.mInput.position()));
        int i = readInt * typeSize;
        skipFully((long) i);
        return i + (((this.mIdSize + 4) + 4) + 1);
    }

    private int loadJniMonitor() {
        long readId = readId();
        int readInt = this.mInput.readInt();
        this.mSnapshot.addRoot(new RootObj(RootType.NATIVE_MONITOR, readId, readInt, this.mSnapshot.getStackTraceAtDepth(this.mSnapshot.getThread(readInt).mStackTrace, this.mInput.readInt())));
        return (this.mIdSize + 4) + 4;
    }

    private int skipValue() {
        int typeSize = this.mSnapshot.getTypeSize(Type.getType(readUnsignedByte()));
        skipFully((long) typeSize);
        return typeSize + 1;
    }

    private void skipFully(long j) {
        this.mInput.setPosition(this.mInput.position() + j);
    }
}
