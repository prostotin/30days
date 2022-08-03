package main
import "fmt"
import "bufio"
import "os"

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
 
 var n int
 fmt.Scan(&n)
 m := make(map[string]int)
 
 var name string
 var phone int

for i :=0; i < n; i++{
    fmt.Scan(&name, &phone)
    m[name]=phone
}
 
 scanner := bufio.NewScanner(os.Stdin)
    for scanner.Scan() {    
     query := scanner.Text()  
     exists := m[query]
     if(exists>0){
         fmt.Printf("%s=%d\n",query, m[query])
     } else{
         fmt.Printf("Not found\n")
     }
 }
 
