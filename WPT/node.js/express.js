const express = require("express");
const app = express();

app.get("/",(req,res,next) =>{
   //res.send("this simple get request");
    res.sendFile(__dirname+"/index.html");
});

app.get("/home",(req,res,next) =>{
    //res.send("this simple get request for home");
    res.sendFile(__dirname+"/home.html");
});

app.get("/about/:id",(req,res,next) =>{
    //res.send("this simple get request for about");
    res.sendFile(__dirname+"/about.html");

});

app.get("/service",(req,res,next) =>{
    //res.send("this simple get request for service");
    res.sendFile(__dirname+"/service.html");
});

app.get("/contact",(req,res,next) =>{
    //res.send("this simple get request for contact");
    res.sendFile(__dirname+"/contact.html");
});

//whild card routing 
app.get("/*splat",(req,res,next) =>{
    res.send("404...page not found");
});

app.listen(8888,()=>{
    console.log("server get started");
});


