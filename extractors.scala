import sys.error
trait User{
	def name:String
}

class FreeUser(val name: String) extends User
class PreminumUser(val name : String) extends User

object FreeUser{
	def unapply(user: FreeUser) : Option[String] = Some(user.name)
}

object PreminumUser{
	def unapply(user:PreminumUser):Option[String] = Some(user.name)
}

val user:User = new PreminumUser("John")

user match{
	case FreeUser(name) => "Hello"+name
	case PreminumUser(name) => "Welcome back,dear "+name

}