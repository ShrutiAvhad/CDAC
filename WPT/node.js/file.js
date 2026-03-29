const fs = require('fs');


//write file operation synchronously
let writeData = fs.writeFileSync("./writeOne.txt", "Hi");

//read file operation synchronously
let readData = fs.readFileSync("./writeTwo.txt","utf-8");
console.log(readData);

//append data file operation synchronously
let appendData = fs.appendFileSync("./writeOne.txt"," Welcome");


