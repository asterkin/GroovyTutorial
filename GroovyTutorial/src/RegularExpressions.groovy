
class RegularExpressions {

	static main(args) {
		patterns()
		regular_expressions()
		operators()
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
