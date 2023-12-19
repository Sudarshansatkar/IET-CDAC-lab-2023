

export default function Maths(props)
{

    let n1=props.num1
    let n2=props.num2
    let op=props.op
    let Result
  

        switch(op)
        {
            case "+" : Result=n1 + n2; break;
            case "-" : Result=n1 - n2; break;
            case "*" : Result=n1 * n2; break;
            case "/" : Result=n1 / n2; break;

            default : Result =NaN ; break;

        }

        return(


            <p> {n1} {op} {n2} = {Result} </p>


        )


}