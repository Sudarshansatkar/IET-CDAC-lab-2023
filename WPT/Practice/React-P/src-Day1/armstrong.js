
import React from 'react';
export default function Armstrong(props)
{
    let num1=props.num
    let temp=props.num
    let sum1=0
    let rem = 0

    while(num1>0)
    {
       
        rem=num1 % 10
        sum1=sum1 + Math.pow(rem,3)
        num1=parseInt(num1/10)

    }

    if(sum1==temp)
    {
        return(
            <p>No. {temp} is  a armstrong</p>
        )
    }
        return(
            <p> No. {temp} is not a armstrong</p>
        )
        
}