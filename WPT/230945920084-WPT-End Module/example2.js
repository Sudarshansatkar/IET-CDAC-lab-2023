<<<<<<< HEAD
const shape1 = { shapeName:"Circle", 
            shapeColor:"Red",
            shapeArea:"30cm2"
          }

const copyShape = { ...shape1 }
copyShape.shapeColor="Black";

console.log("Original object :-");

console.log(shape1.shapeName);
console.log(shape1.shapeColor);
console.log(shape1.shapeArea);

console.log("Copy object :-");

console.log(copyShape.shapeName);
console.log(copyShape.shapeColor);
=======
const shape1 = { shapeName:"Circle", 
            shapeColor:"Red",
            shapeArea:"30cm2"
          }

const copyShape = { ...shape1 }
copyShape.shapeColor="Black";

console.log("Original object :-");

console.log(shape1.shapeName);
console.log(shape1.shapeColor);
console.log(shape1.shapeArea);

console.log("Copy object :-");

console.log(copyShape.shapeName);
console.log(copyShape.shapeColor);
>>>>>>> cb3c9955c3d6777556c92f0f5baf95c3bc3a93bc
console.log(copyShape.shapeArea);