package com.momentolabs.app.security.applocker.data.database.callblocker.blacklist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "blacklist")
data class BlackListItemEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "blacklist_id") var blacklistId: Int = 0,
    @ColumnInfo(name = "user_name") var userName: String = "",
    @ColumnInfo(name = "phone_number") var phoneNumber: String = ""
)