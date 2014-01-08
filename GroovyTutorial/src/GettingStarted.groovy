
class GettingStarted {

	static main(args) {
		println "Hello World!"
		variables()
		lists()
		maps()
		conditionalExecution()
		booleanExpressions()
	}

	private static booleanExpressions() {
		def titanicBoxOffice = 1234600000
		def titanicDirector = "James Cameron"
		
		def trueLiesBoxOffice = 219000000
		def trueLiesDirector = "James Cameron"
		
		def returnOfTheKingBoxOffice = 752200000
		def returnOfTheKingDirector = "Peter Jackson"
		
		def theTwoTowersBoxOffice = 581200000
		def theTwoTowersDirector = "PeterJackson"
		
		println titanicBoxOffice > returnOfTheKingBoxOffice  // evaluates to true
		println titanicBoxOffice >= returnOfTheKingBoxOffice // evaluates to true
		println titanicBoxOffice >= titanicBoxOffice         // evaluates to true
		println titanicBoxOffice > titanicBoxOffice          // evaluates to false
		println titanicBoxOffice + trueLiesBoxOffice < returnOfTheKingBoxOffice + theTwoTowersBoxOffice  // evaluates to false
		
		println titanicDirector > returnOfTheKingDirector    // evaluates to false, because "J" is before "P"
		println titanicDirector < returnOfTheKingDirector    // evaluates to true
		println titanicDirector >= "James Cameron"           // evaluates to true
		println titanicDirector == "James Cameron"           // evaluates to true

		if (titanicBoxOffice + trueLiesBoxOffice > returnOfTheKingBoxOffice + theTwoTowersBoxOffice)
		{
			println(titanicDirector + " is a better director than " + returnOfTheKingDirector)
		}
		
		def suvMap = ["Acura MDX":"\$36,700", "Ford Explorer":"\$26,845"]
		if (suvMap["Hummer H3"] != null)
		{
			 println("A Hummer H3 will set you back "+suvMap["Hummer H3"]);
		}
		
	}
	
	private static conditionalExecution() {
		def amPM = Calendar.getInstance().get(Calendar.AM_PM)
		if (amPM == Calendar.AM)
		{
			println("Good morning")
		} else {
			println("Good evening")
		}
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
