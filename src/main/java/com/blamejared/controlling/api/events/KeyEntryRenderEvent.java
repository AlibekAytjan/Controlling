package com.blamejared.controlling.api.events;

import com.blamejared.controlling.client.gui.GuiNewKeyBindingList;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraftforge.eventbus.api.Event;

/**
 * RenderKeyEntryEvent is called at the top of {@link com.blamejared.controlling.client.gui.GuiNewKeyBindingList.KeyEntry#render(PoseStack, int, int, int, int, int, int, int, boolean, float)}
 * is called, allowing mods to render additional info.
 */
public class KeyEntryRenderEvent extends Event {
    
    private final GuiNewKeyBindingList.KeyEntry entry;
    
    private final PoseStack stack;
    private final int slotIndex;
    private final int y;
    private final int x;
    private final int rowLeft;
    private final int rowWidth;
    private final int mouseX;
    private final int mouseY;
    private final boolean hovered;
    private final float partialTicks;
    
    public KeyEntryRenderEvent(GuiNewKeyBindingList.KeyEntry entry, PoseStack stack, int slotIndex, int y, int x, int rowLeft, int rowWidth, int mouseX, int mouseY, boolean hovered, float partialTicks) {
        
        this.entry = entry;
        this.stack = stack;
        this.slotIndex = slotIndex;
        this.y = y;
        this.x = x;
        this.rowLeft = rowLeft;
        this.rowWidth = rowWidth;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
        this.hovered = hovered;
        this.partialTicks = partialTicks;
    }
    
    public GuiNewKeyBindingList.KeyEntry getEntry() {
        
        return entry;
    }
    
    public PoseStack getStack() {
        
        return stack;
    }
    
    public int getSlotIndex() {
        
        return slotIndex;
    }
    
    public int getY() {
        
        return y;
    }
    
    public int getX() {
        
        return x;
    }
    
    public int getRowLeft() {
        
        return rowLeft;
    }
    
    public int getRowWidth() {
        
        return rowWidth;
    }
    
    public int getMouseX() {
        
        return mouseX;
    }
    
    public int getMouseY() {
        
        return mouseY;
    }
    
    public boolean isHovered() {
        
        return hovered;
    }
    
    public float getPartialTicks() {
        
        return partialTicks;
    }
    
}
