const { error } = require("console");
const fs = require("fs");

//create new directory asynchronously
fs.mkdir("./newdir",(error,result)=>{});

//delete directory asynchronously
fs.rmdir("./newDirThree",(error,result)=>{
    console.log("directory remove");
})
fs.rmdir("./newDirThree",(error,result)=>{
    console.log("directory remove");
})

//remove file asynchronously
fs.unlink("./dummy.txt",(error,result)=>{});

//create new directory and new file in it
fs.mkdir("newDirTwo",(error,result)=>{
    fs.writeFile("./newDirTwo/writeMe.txt","My name is Mona Darling !",(error,result)=>{
        console.log("new directory and new file created")
    })
})