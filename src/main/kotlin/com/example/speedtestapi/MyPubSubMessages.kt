package com.example.speedtestapi

import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate
import org.springframework.web.bind.annotation.RestController

@RestController
class MyPubSubMessages(val pubSub: PubSubTemplate) {
    fun publish(myMessage: String) {
        this.pubSub.publish("the_topic_name", myMessage)
    }
}