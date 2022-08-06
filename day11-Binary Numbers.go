package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)



func main() {
    reader := bufio.NewReaderSize(os.Stdin, 16 * 1024 * 1024)

    nTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
    checkError(err)
    n := int64(nTemp)

    nBinary := (strconv.FormatInt(n, 2))
    
    var max = 0
    var counter = 0
    
    for i:=0; i<len(nBinary); i++{
       if (nBinary[i:i+1] == "1"){ 
           counter++
           if(counter > max){
               max = counter
           }
       }else{
           counter = 0
       } 
    }
     fmt.Println(max)
    
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}
