def scores: List[Int] = List(3,4,6,789)
val best :: rest =scores

println("The score of our champion is "+ best)

def gameResults(): Seq[(String,Int)] =
	("Daniel",3500) :: ("Melissa",13000) :: ("John",7000) :: Nil

	def hallOfFame = for {
		result <- gameResults()
		(name ,score) = result
		if(score > 5000)
	} yield name

println(hallOfFame);