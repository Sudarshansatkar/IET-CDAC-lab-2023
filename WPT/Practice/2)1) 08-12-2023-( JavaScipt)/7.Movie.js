  
 // let obj={fname:"Sudarshan",lname:"satkar",desg:"Student",
 //           address:{area:"Moshi",city:"Pune",State:"Maharastra",Pin:"41111"},
 //           skills:["core Java","HTML","c++"]
 //       }

 // console.log(obj.fname,obj.lname,obj.desg)
  //console.log(obj.address.Pin)
 // console.log(obj.address.city)
 // console.log(obj.skills[1])


 let movie={name:["Animal","KGF","Dunki"],
            director:["SRV","P.Neel","R.Hirani"],
            cast:{hero:["Ranbir","Yash","SRK"],
                  villian:["Bobby","Garuda","British"],
                  heroine:["Tripti","Srinidhi","Tapsee"],
                  comedians:["Shakti","TMT","Vicky"]},
            DateofRelease:["Nov-23","Dec-19","dec-23"],
            Budget:["200cr","400cr","300cr"]
                
            }

//console.log("For animal Movie:")
//console.log(movie.name[0],movie.director[0])
//console.log(movie.name[0],movie.director[0],movie.cast.hero[0],movie.cast.heroine[0],movie.cast.comedians[0],movie.DateofRelease[0],movie.Budget[0])

for(let i=0;i<3;i++)
{
    console.log(movie.name[i],movie.director[i],movie.cast.hero[i],movie.cast.heroine[i],movie.cast.comedians[i],movie.DateofRelease[i],movie.Budget[i])
}
