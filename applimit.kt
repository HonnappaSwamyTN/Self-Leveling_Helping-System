@Entity

data class appLimit
(
    @primaryKey val packageName : String,
    val appName : String,
    val limitInMin : int,
    val icon : blob ? = null

)