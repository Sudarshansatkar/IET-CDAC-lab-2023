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
console.log(copyShape.shapeArea);