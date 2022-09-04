package main

import (
	"fmt"
)

func multiplyThree(x int, y int, z int) int {
	return x * y * z
}

func main() {
	var product int
	product = multiplyThree(2, 2, 2)
	fmt.Println(product)
}
