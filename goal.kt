data class goals
(
    @primarykey val goalId : String,
    val userId : String,
    val description : String,
    val title : String,
    val noOfDaysequired : int,
    val createdAt : int,
    val completedAt : String,
    val completed : boolean = true,
)