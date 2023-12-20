import {useState} from "react";
import Education from "./edu";
import Shoot from "./shoot";

function App3()
{

  let [col,setcol] = useState("red")
    function handler(event)
    {
        console.log(event.target.value)
        setcol(event.target.value)
    }
  
  return(
     <>
     <Education></Education>
     <Shoot> </Shoot>
     
     Enter Color:<input type="color" onChange={handler} />

     </>
     
  )
 
}

export default App3;