/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the shader SM Builtins features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShaderSmBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderSMBuiltinsFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderSMBuiltins};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderSMBuiltinsFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSMBUILTINS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSMBUILTINS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports the SPIR-V {@code ShaderSMBuiltinsNV} capability. */
    @NativeType("VkBool32")
    public boolean shaderSMBuiltins() { return nshaderSMBuiltins(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVShaderSmBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV sType$Default() { return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderSMBuiltins} field. */
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV shaderSMBuiltins(@NativeType("VkBool32") boolean value) { nshaderSMBuiltins(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV set(
        int sType,
        long pNext,
        boolean shaderSMBuiltins
    ) {
        sType(sType);
        pNext(pNext);
        shaderSMBuiltins(shaderSMBuiltins);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV set(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #shaderSMBuiltins}. */
    public static int nshaderSMBuiltins(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.SHADERSMBUILTINS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #shaderSMBuiltins(boolean) shaderSMBuiltins}. */
    public static void nshaderSMBuiltins(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.SHADERSMBUILTINS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSMBuiltinsFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSMBuiltinsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceShaderSMBuiltinsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#shaderSMBuiltins} field. */
        @NativeType("VkBool32")
        public boolean shaderSMBuiltins() { return VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nshaderSMBuiltins(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#sType} field. */
        public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVShaderSmBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV} value to the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#sType} field. */
        public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer sType$Default() { return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#pNext} field. */
        public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSMBuiltinsFeaturesNV#shaderSMBuiltins} field. */
        public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.Buffer shaderSMBuiltins(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nshaderSMBuiltins(address(), value ? 1 : 0); return this; }

    }

}