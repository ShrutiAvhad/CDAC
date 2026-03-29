require("dotenv").config()
const http = require('http');

let host = process.env.HOST;
let port = process.env.PORT;

let server = http.createServer((req,res)=>{
    if(req.url == "/"){
        res.write("hihihihihi");
        res.end();
    }if(req.url == "/about"){
        res.write("hohoho");
        res.end();
    }if(req.url == "/service"){
        res.write("Service request");
        res.end();
    }
    }if(req.url == "/contact"){
        res.write("Contact request");
        res.end();
    }
});

server.listen(9999,()=>{
    console.log("server gets started ");
})

