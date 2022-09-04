package main

import "fmt"

func returnsTwoThings(message string) (string, int) {
	var newMessage string
	var coolNumber int
	coolNumber = 5
	newMessage = "Surprise!" + message
	return newMessage, coolNumber
}

func main() {
	msg, num := returnsTwoThings("What's up?")
	fmt.Println(msg, num)
}
