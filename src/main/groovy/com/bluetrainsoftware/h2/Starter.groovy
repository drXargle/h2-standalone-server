package com.bluetrainsoftware.h2

/**
 *
 * @author: Richard Vowles - https://plus.google.com/+RichardVowles
 */
class Starter {
	public static void main(String[] args) {
		org.h2.tools.Server.main(args)

		while (true)  {
			Thread.sleep(10000)
		}
	}
}
