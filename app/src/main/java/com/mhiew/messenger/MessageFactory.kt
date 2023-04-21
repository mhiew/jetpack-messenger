package com.mhiew.messenger

import com.mhiew.messenger.model.Message
import com.mhiew.messenger.model.MessageDirection
import java.util.*

/**
 * Created by Min Hiew on 2023-04-20.
 * Copyright (c) 2023
 */
object MessageFactory {
    
    fun generateMessages(): List<Message> {
        return listOf(
            Message(
                "0",
                MessageDirection.SENT,
                Calendar.getInstance().also {
                    it.add(Calendar.DAY_OF_YEAR, -5)
                    it.set(Calendar.HOUR_OF_DAY, 5)
                },
                "Joe Birch",
                "Hey!"
            ),
            Message(
                "1",
                MessageDirection.RECEIVED,
                Calendar.getInstance().also {
                    it.add(Calendar.DAY_OF_YEAR, -5)
                    it.set(Calendar.HOUR_OF_DAY, 5)
                },
                "Joe Birch",
                "Hey!"
            ),
            Message(
                "2",
                MessageDirection.RECEIVED,
                Calendar.getInstance().also {
                    it.add(Calendar.DAY_OF_YEAR, -4)
                    it.set(Calendar.HOUR_OF_DAY, 4)
                },
                "Joe Birch",
                "How is Roxy? 😊"
            ),
            Message(
                "4",
                MessageDirection.SENT,
                Calendar.getInstance().also {
                    it.add(Calendar.DAY_OF_YEAR, -2)
                },
                "Joe Birch",
                "She is doing great!"
            ),
            Message(
                "5",
                MessageDirection.SENT,
                Calendar.getInstance().also {
                    it.add(Calendar.DAY_OF_YEAR, -2)
                },
                "Joe Birch",
                image = R.drawable.roxy
            )
        )
    }
}