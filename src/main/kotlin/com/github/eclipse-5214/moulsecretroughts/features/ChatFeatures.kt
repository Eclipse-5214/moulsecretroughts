package com.github.eclipse-5214.moulsecretroughts.features

import com.github.eclipse-5214.moulsecretroughts.ExampleMod
import com.github.eclipse-5214.moulsecretroughts.utils.ChatUtils
import net.minecraftforge.client.event.ClientChatReceivedEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class ChatFeatures {

    @SubscribeEvent(receiveCanceled = true)
    fun onChatReceive(event: ClientChatReceivedEvent) {
        if (event.type.toInt() == 2) return

        val message = event.message.formattedText
        if (ExampleMod.config.secondCategory.chat.duplicateChatMessage) {
            ChatUtils.messageToChat(message)
        }
    }
}
