

export default function Total(props)
{
    let addition=0;
    let num=props.arr1
    for(let i=0; i<num.length;i++)
    {
         addition=addition+num[i]
    }

    return(

        <p> Addition is : {addition} </p>

    )






}