
class GettingStarted {

	static main(args) {
		println "Hello World!"
		variables()
		lists()
		maps()
	}

	private static maps() {
		def scores = [ "Brett":100, "Pete":"Did not finish", "Andrew":86.87934 ]
		println scores["Pete"]
		println scores.Pete
		scores["Pete"] = 3
		println scores["Pete"]
		def emptyMap = [:]
		println emptyMap.size()
	}

	private static lists() {
		def myList = [1776, -1, 33, 99, 0, 928734928763]
		println myList[0]
		println myList.size()
		def emptyList = []
		println emptyList.size()
	}

	private static variables() {
		def x
		x = 1
		println x

		x = new java.util.Date()
		println x

		x = -3.1499392
		println x

		x = false
		println x

		x = "Hi"
		println x
	}

}
