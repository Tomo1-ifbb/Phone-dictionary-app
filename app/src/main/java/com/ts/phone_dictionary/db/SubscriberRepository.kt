package com.ts.phone_dictionary.db

class SubscriberRepository(private val dao : SubscriberDAO) {

    val subscribers= dao.getAllSubscribers()

    suspend fun insert(subscriber: Subscriber){
        dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber){
        dao.upDataSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber){
        dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll(subscriber: Subscriber){
        dao.deleteAll()
    }


}