package com.jaeyunpark.a7minutesworkout

class ExerciseModel(
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isComplete: Boolean,
    private var isSelected: Boolean,

) {

    fun getId(): Int{
        return id
    }

    fun setId(id: Int){
        this.id = id

    }

    fun getName(): String{
        return name
    }

    fun setName(name: String){
        this.name = name

    }

    fun getImage(): Int{
        return image
    }

    fun setImage(image: Int){
        this.image = image

    }

    fun getIsComplete(): Boolean{
        return isComplete
    }

    fun setImage(isComplete: Boolean){
        this.isComplete = isComplete

    }

    fun getIsSelected(): Boolean{
        return isSelected
    }


    fun setIsComplete(isComplete: Boolean){
        this.isComplete = isComplete

    }

    fun setIsSelected(isSelected: Boolean){
        this.isSelected = isSelected

    }

}