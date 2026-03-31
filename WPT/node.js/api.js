const express = require("express");
const app = express();

app.get("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.delete("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.post("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.put("/product", (req, res, next) => {
    res.send(`this is simple get request for ${req.url}`);
});

app.listen(4444, () => {
    console.log("api server got started on port 4444");
});