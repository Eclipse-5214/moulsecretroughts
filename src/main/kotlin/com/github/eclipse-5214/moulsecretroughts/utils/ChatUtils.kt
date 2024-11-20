package com.github.eclipse-5214.moulsecretroughts.utils

import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText

object ChatUtils {

    fun messageToChat(message: String) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText(message))
    }
}