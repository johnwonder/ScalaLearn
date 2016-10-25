abstract class Person

case class Student(name:String,age:Int,studentNo:Int) extends Person

case class Teacher(name:String,age:Int,teacherNo:Int) extends Person

case class Nobody(name:String) extends Person

object CaseClassDemo{

	def main(args:Array[String]):Unit = {

		val p:Person = Student("john",18,1024)

		p match {

			case Student(name,age,studentNo) => println(name+":"+age+":"+studentNo)

			case Teacher(name,age,teacherNo)=>println(name+":"+age+":"+teacherNo)
      		
      		case Nobody(name)=>println(name)
		}
	}

}