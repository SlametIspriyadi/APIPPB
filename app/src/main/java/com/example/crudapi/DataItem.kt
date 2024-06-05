package com.example.crudapi

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DataItem : Serializable {
    @field:SerializedName("Staff_Name")
    val staffName: String? = null

    @field:SerializedName("Staff_Id")
    val staffId: String? = null

    @field:SerializedName("Staff_Hp")
    val staffHp: String? = null

    @field:SerializedName("Staff_Alamat")
    val staffAlamat: String? = null
}