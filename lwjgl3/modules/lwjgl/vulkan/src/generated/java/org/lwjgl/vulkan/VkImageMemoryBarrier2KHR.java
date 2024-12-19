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
 * See {@link VkImageMemoryBarrier2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageMemoryBarrier2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineStageFlags2 srcStageMask;
 *     VkAccessFlags2 srcAccessMask;
 *     VkPipelineStageFlags2 dstStageMask;
 *     VkAccessFlags2 dstAccessMask;
 *     VkImageLayout oldLayout;
 *     VkImageLayout newLayout;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkImage image;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</code></pre>
 */
public class VkImageMemoryBarrier2KHR extends VkImageMemoryBarrier2 {

    /**
     * Creates a {@code VkImageMemoryBarrier2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryBarrier2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageMemoryBarrier2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2} value to the {@code sType} field. */
    @Override
    public VkImageMemoryBarrier2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageMemoryBarrier2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcStageMask} field. */
    @Override
    public VkImageMemoryBarrier2KHR srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    @Override
    public VkImageMemoryBarrier2KHR srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    @Override
    public VkImageMemoryBarrier2KHR dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    @Override
    public VkImageMemoryBarrier2KHR dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code oldLayout} field. */
    @Override
    public VkImageMemoryBarrier2KHR oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@code newLayout} field. */
    @Override
    public VkImageMemoryBarrier2KHR newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
    @Override
    public VkImageMemoryBarrier2KHR srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
    @Override
    public VkImageMemoryBarrier2KHR dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    @Override
    public VkImageMemoryBarrier2KHR image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    @Override
    public VkImageMemoryBarrier2KHR subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageMemoryBarrier2KHR subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImageMemoryBarrier2KHR set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask,
        int oldLayout,
        int newLayout,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long image,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageMemoryBarrier2KHR set(VkImageMemoryBarrier2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryBarrier2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier2KHR malloc() {
        return wrap(VkImageMemoryBarrier2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryBarrier2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier2KHR calloc() {
        return wrap(VkImageMemoryBarrier2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryBarrier2KHR} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryBarrier2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageMemoryBarrier2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryBarrier2KHR} instance for the specified memory address. */
    public static VkImageMemoryBarrier2KHR create(long address) {
        return wrap(VkImageMemoryBarrier2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImageMemoryBarrier2KHR.class, address);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageMemoryBarrier2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier2KHR malloc(MemoryStack stack) {
        return wrap(VkImageMemoryBarrier2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier2KHR calloc(MemoryStack stack) {
        return wrap(VkImageMemoryBarrier2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImageMemoryBarrier2KHR} structs. */
    public static class Buffer extends VkImageMemoryBarrier2.Buffer {

        private static final VkImageMemoryBarrier2KHR ELEMENT_FACTORY = VkImageMemoryBarrier2KHR.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryBarrier2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryBarrier2KHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkImageMemoryBarrier2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryBarrier2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2} value to the {@code sType} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryBarrier2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcStageMask} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2KHR.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkImageMemoryBarrier2KHR.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2KHR.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkImageMemoryBarrier2KHR.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code oldLayout} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier2KHR.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@code newLayout} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier2KHR.nnewLayout(address(), value); return this; }
        /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier2KHR.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier2KHR.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryBarrier2KHR.nimage(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier2KHR.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageMemoryBarrier2KHR.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}