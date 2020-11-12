package com.ts.phone_dictionary.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SubscriberDAO  {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun upDataSubscriber(subscriber: Subscriber)

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber)

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll()

    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubscribers():LiveData<List<Subscriber>>
}


//databaseとroomのsubscriber objectは必要なコードを生成する
//


/*
こう書けたりもする
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Insert
    fun insertSubscriber2(subscriber: Subscriber): Long

    @Insert
    fun insertSubscribers(subscriber1: Subscriber, subscriber2: Subscriber, subscriber3: Subscriber): List<Long>

    @Insert
    fun insertSubscribers(subscribers:List<Subscriber>)

    @Insert
    fun subscribers2(ubscriber: Subscriber, subscribers: List<Subscriber>):List<Long>



 */