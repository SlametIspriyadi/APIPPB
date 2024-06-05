package com.example.crudapi

interface CrudView {
    //add
    fun successAdd(msg: String)
    fun onErrorAdd(msg: String)
    //get data
    fun onSuccessGet(data: List<DataItem>?)
    fun onFailedGet(msg: String)
    //update
    fun onSuccessUpdate(msg: String)
    fun onErrorUpdate(msg: String)
    //delete
    fun onSuccessDelete(msg: String)
    fun onErrorDelete(msg: String)
}