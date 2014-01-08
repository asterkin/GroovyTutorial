
class RegularExpressions {

	static main(args) {
		patterns()
		regular_expressions()
		operators()
		matching_groups()
		not_matching_groups();
		replacement();
		reluctant_operators();
	}

	private static reluctant_operators() {
		def popesArray = [
			"Pope Anastasius I 399-401",
			"Pope Innocent I 401-417",
			"Pope Zosimus 417-418",
			"Pope Boniface I 418-422",
			"Pope Celestine I 422-432",
			"Pope Sixtus III 432-440",
			"Pope Leo I the Great 440-461",
			"Pope Hilarius 461-468",
			"Pope Simplicius 468-483",
			"Pope Felix III 483-492",
			"Pope Gelasius I 492-496",
			"Pope Anastasius II 496-498",
			"Pope Symmachus 498-514"
		]

		def myClosure = {
			def myMatcher = (it =~ /Pope (.*?)(?: .*)? ([0-9]+)-([0-9]+)/);
			if (myMatcher.matches())
				println(myMatcher[0][1]+": "+myMatcher[0][2]+" to "+myMatcher[0][3]);
		}
		popesArray.each(myClosure)
	}

	private static replacement() {
		def excerpt = "At school, Harry had no one. Everybody knew that Dudley's gang hated that odd Harry Potter "+
				"in his baggy old clothes and broken glasses, and nobody liked to disagree with Dudley's gang.";
		def matcher = (excerpt =~ /Harry Potter/);
		excerpt = matcher.replaceAll("Tanya Grotter");

		matcher = (excerpt =~ /Harry/);
		excerpt = matcher.replaceAll("Tanya");
		println("Publish it! "+excerpt)
	}

	private static not_matching_groups() {
		def names = [
			"Graham James Edward Miller",
			"Andrew Gregory Macintyre",
			"No MiddleName"
		]

		def printClosure = {
			def matcher = (it =~ /(.*?)(?: .*)* (.*)/);  // notice the non-matching group in the middle
			if (matcher.matches())
				println(matcher[0][2]+", "+matcher[0][1]);
		}
		names.each(printClosure)
	}

	private static matching_groups() {
		def locationData = "Liverpool, England: 53d 25m 0s N 3d 0m 0s"
		def myRegularExpression = /([a-zA-Z]+), ([a-zA-Z]+): ([0-9]+). ([0-9]+). ([0-9]+). ([A-Z]) ([0-9]+). ([0-9]+). ([0-9]+)./
		def matcher = ( locationData =~ myRegularExpression )
		println matcher[0]
		if (matcher.matches()) {
			println(matcher.getCount()+ " occurrence of the regular expression was found in the string.");
			println(matcher[0][1] + " is in the " + matcher[0][6] + " hemisphere. (According to: " + matcher[0][0] + ")")
		}
	}

	private static operators() {
		println "How tall is Angelina Jolie?" ==~ /[^\?]+\?/
	}

	private static patterns() {
		println "potatoe" ==~ /potatoe/
		println "potatoe" ==~ /potatoe?/
		println "motato" ==~ /potatoe?/
	}

	private static regular_expressions() {
		def theRegularExpression = /Wisniewski/
		checkSpelling("Wisniewski", theRegularExpression)
		checkSpelling("Wisnewski", theRegularExpression)

		theRegularExpression = /Wisniew?ski/
		checkSpelling("Wisniewski", theRegularExpression)
		checkSpelling("Wisnieski", theRegularExpression)
		checkSpelling("Wisniewewski", theRegularExpression)

		theRegularExpression = /Wisn(ie|ei)w?ski/
		checkSpelling("Wisniewski", theRegularExpression)
		checkSpelling("Wisnieski", theRegularExpression)
		checkSpelling("Wisniewewski", theRegularExpression)

		theRegularExpression = /Wis[abcd]niewski/ // requires one of 'a', 'b', 'c' or 'd'
		theRegularExpression = /Wis[abcd]?niewski/ // will allow one of 'a', 'b', 'c' or 'd', but not required (like above)
		theRegularExpression = /Wis[a-zA-Z]niewski/ // requires one of any upper\- or lower-case letter
		theRegularExpression = /Wis[^abcd]niewski/ // requires one of any character that is '''not''' 'a', 'b', 'c' or 'd'
	}

	private static checkSpelling(spellingAttempt, spellingRegularExpression)
	{
			if (spellingAttempt ==~ spellingRegularExpression)
			{
				   println("Congratulations, you spelled it correctly.")
			 } else {
				   println("Sorry, try again.")
			}
	}
}
