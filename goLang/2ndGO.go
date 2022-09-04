// ***LEARN GO === "Comic Mischief" 2nd Gopher project by batz.cg @2208091757***

package main

import "fmt"

func main() {

	var title string = "Mr. GoToSleep"
	var writer string = "Tracey Hatchet"
	var artist string = "Jewel Tampson"
	var publisher string = "DizzyBooks Publisher Inc."
	var year int = 1997
	var pageNumber int = 14
	var grade float32 = 6.5

	fmt.Print(
		"TITLE:           ", title, "\n",
		"WRITTEN BY:      ", writer, "\n",
		"DRAWN BY:        ", artist, "\n",
		"PUBLISHED BY:    ", publisher, "\n",
		"PUBLISHED YEAR:  ", year, "\n",
		"NUMBER OF PAGES: ", pageNumber, "\n",
		"GRADE:           ", grade)

	fmt.Println()
	fmt.Println()

	title = "Epic Vol. 1"
	writer = "Ryan N. Shawn"
	artist = "Phoebe Paperclips"
	publisher = "DizzyBooks Publisher Inc."
	year = 2013
	pageNumber = 160
	grade = 9.0

	fmt.Print(
		"TITLE:           ", title, "\n",
		"WRITTEN BY:      ", writer, "\n",
		"DRAWN BY:        ", artist, "\n",
		"PUBLISHED BY:    ", publisher, "\n",
		"PUBLISHED YEAR:  ", year, "\n",
		"NUMBER OF PAGES: ", pageNumber, "\n",
		"GRADE:           ", grade)

	fmt.Println()
	fmt.Println()

	title = "Gopher Bro's"
	writer = "Monkh-Altai Chuluunbaatar"
	artist = "Batzorig Gonchigsumlaa"
	publisher = "KHAN KHULGON LLC"
	year = 2022
	pageNumber = 9999
	grade = 10.0

	fmt.Print(
		"TITLE:           ", title, "\n",
		"WRITTEN BY:      ", writer, "\n",
		"DRAWN BY:        ", artist, "\n",
		"PUBLISHED BY:    ", publisher, "\n",
		"PUBLISHED YEAR:  ", year, "\n",
		"NUMBER OF PAGES: ", pageNumber, "\n",
		"GRADE:           ", grade)

}
