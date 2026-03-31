require("dotenv").config();
const hbs = require("hbs");
const express = require("express");
const app = express();
const path = require("path");

let host = process.env.HOST || "localhost";
let port = process.env.PORT || 8888;

app.set("view engine", "hbs");
app.set("views", path.join(__dirname, "template/views"));
hbs.registerPartials(path.join(__dirname, "template/partials"));

let staticFilePath = path.join(__dirname, "partials");


app.use(express.static(staticFilePath));

app.get("/", (req, res, next) => {
  res.render("home");
});

app.get("/about", (req, res, next) => {
  res.render("about");
});

app.get("/service", (req, res, next) => {
  res.render("service");
});

app.get("/contact", (req, res, next) => {
  res.render("contact");
});

app.get("/*splat", (req, res, next) => {
  res.render("404", {error : 555});
});

app.listen(port, () => {
  console.log(`my webserver get started on ${host}:${port}`);
});
