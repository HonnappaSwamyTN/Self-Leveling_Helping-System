@Entity
data class user
(
    @PrimaryKey userId : String,
    val username : String,
    val experience : int = 0,
    val level : int =1,
    val createdAt: Long = System.currentTimeMillis()
)