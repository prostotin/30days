package main
import "fmt"

func main() {
  //Enter your code here. Read input from STDIN. Print output to STDOUT
  var testCases int
  fmt.Scan( & testCases)

  var input string
  var evens string
  var odds string

  for i: = 0;
  i < testCases;
  i++{
    fmt.Scan( & input)
    for j: = 0;j < len(input);j++{
      if j % 2 == 0 {
        evens += (input[j: j + 1])
      } else {
        odds += (input[j: j + 1])
      }
    }
    fmt.Println(evens + " " + odds)
    evens, odds = "", ""
  }
}
