package com.example.footballstatapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class userpwd(val username:String, val password:String):Parcelable