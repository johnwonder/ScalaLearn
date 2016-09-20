var oneTwo = List(1,2)
var threeFour = List(3,4)

var oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo+" and " + threeFour +" were not mutated.")
println("Thus, "+ oneTwoThreeFour+" is a new list")

val oneTwoThree = 1::2::3::Nil
println(oneTwoThree)

val oneTwoThree1 = Nil.::(3).::(2).::(1)
println(oneTwoThree1)


val oneTwoThree2 = Nil.::(3).::(2).::(1)
println(oneTwoThree2)