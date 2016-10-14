val it = Iterator("a","number","of","words")

val res1 = it.map(_.length)

res1 foreach println

//it.next()

val (words,ns) = Iterator("a","number").duplicate

val shorts = words.filter(_.length < 3).toList

shorts foreach println