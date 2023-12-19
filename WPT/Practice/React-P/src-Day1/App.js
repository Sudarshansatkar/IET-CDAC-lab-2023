import Sample from "./welcome";
import Icard from "./Icard";
import Maths from "./Maths";
import Armstrong from "./armstrong";
import Total from "./Total";

function App()
{

  let obj1={name:"SKS", email:"SKS@gmail.com", phone:"8795468547"}

  let arr=[1,2,3,4,5,6]

  return(
    <>
    
      <Sample></Sample>   

      <Icard obj={obj1}> </Icard>


      <Maths num1={12} num2={11} op={"+"}></Maths>  
      <Maths num1={11} num2={1}  op={"-"}></Maths>
      <Maths num1={10} num2={2}  op={"*"}></Maths>
      <Maths num1={40} num2={10}  op={"/"}></Maths>

      <Armstrong num={153}></Armstrong>

      <Total arr1={arr}></Total>
    
    </>
      






  )
}

export default App;