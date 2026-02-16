@Entity

data class dailyQuist
(
    @primarykey val dailyQuistId : String,
    val goalId = int,
    val date = long,
    val title = String,
    val completed = Boolean = false,
    val notes : String ? = null,
    val completedAt ? : = null
)