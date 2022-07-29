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

    NTemp, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
    checkError(err)
    N := int32(NTemp)
    
    //Task code
    if(N%2 == 1){
        fmt.Print("Weird")
    }else{
        if(N>1 && N<6){
            fmt.Print("Not Weird")
        } else if (N>5 && N<21){
            fmt.Print("Weird")
        } else{
            fmt.Print("Not Weird")
        }
         //Task code
    }
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
