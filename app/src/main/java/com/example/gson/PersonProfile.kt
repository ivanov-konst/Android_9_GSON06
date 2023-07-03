package com.example.gson

import com.google.gson.annotations.SerializedName

data class PersonProfile(

    @SerializedName("date_of_birth ")
    val date_of_birth: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("about")
    val about: String,

    @SerializedName("address")
    val address: String,

    @SerializedName("company")
    val company: String,

    @SerializedName("location")
    val location: PersonLocation

)