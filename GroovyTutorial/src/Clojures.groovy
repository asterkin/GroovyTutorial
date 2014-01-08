
class Clojures {

	static main(args) {
		list_clojures()
		map_clojures()
		more_list_clojures()
		more_map_clojures()
		dealing_with_files()
	}

	private static dealing_with_files() {
		def myFileDirectory = "src/"
		def myFileName      = "myfile.txt"
		def myFile          = new File(myFileDirectory + myFileName)
		def printFileLine   = { println "File line: " + it }

		myFile.eachLine( printFileLine )
	}

	private static more_list_clojures() {
		def fullString = ""
		def orderParts = ["BUY", 200, "Hot Dogs", "1"]
		
		orderParts.each {
		  fullString += it + " "
		}
		println fullString		
	}

	private static more_map_clojures() {
		def myMap = ["China": 1 , "India" : 2, "USA" : 3]
		def result = 0
		
		myMap.keySet().each( { result+= myMap[it] } )
		println result
	}
	
	private static list_clojures() {
		def square = { it * it }

		println square(9)
		println ([ 1, 2, 3, 4 ].collect(square))
	}

	private static map_clojures() {
		def printMapClosure = { key, value -> println key + "=" + value }
		
		[ "Yue" : "Wu", "Mark" : "Williams", "sudha" : "Kumari" ].each(printMapClosure)
	}

}
