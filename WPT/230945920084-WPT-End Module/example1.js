const arr = ['apple', 'banana', 'cherry', 'orange', 'Mango'];

const [,v1,,,v2] = arr; // destructuring the array and assigning the values to variables v1 and v2

console.log(v1); // output: banana
console.log(v2); // output: elderberry

console.log(v1 + " " + v2); // output: banana Mango