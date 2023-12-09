const x=44
//let x=22    // error as const var 
console.log(x)

//case 1
console.log("Case 1")
var p=100
{
   // var p=200
   let p=200
   console.log(p)
}
console.log(p)

//case 2
console.log("Case 2")
var q=100
{
   var q=200
   console.log(q)
}
console.log(q)

//case 3
console.log("Case 3")

//let r=100  //not possible as globally declared below
{
   var r=200
   console.log(r)
}
console.log(r)