
class Clojures {

	static main(args) {
		def square = { it * it }
		
		println square(9)
		println ([ 1, 2, 3, 4 ].collect(square))
		
		def printMapClosure = { key, value -> println key + "=" + value }
		[ "Yue" : "Wu", "Mark" : "Williams", "sudha" : "Kumari" ].each(printMapClosure)
	}

}
