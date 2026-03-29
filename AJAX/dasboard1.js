const BASE_URL = "http://localhost:8888/users";


// ================= GET ALL =================
function getData() {
    let xmlhttp = new XMLHttpRequest();

    xmlhttp.onload = function () {
        let tbody = document.getElementById("d1");

        if (this.status === 200) {
            let data = JSON.parse(this.responseText);

            tbody.innerHTML = ""; // clear old data

            data.forEach(user => {
                let tr = document.createElement("tr");

                tr.innerHTML = `
                    <td>${user.id}</td>
                    <td>${user.userid}</td>
                    <td>${user.upass}</td>
                    <td>
                        <button onclick="getSingleId(${user.id})">Edit</button>
                        <button onclick="deleteRecord(${user.id})">Delete</button>
                    </td>
                `;

                tbody.appendChild(tr);
            });
        } else {
            console.error("Error fetching data");
        }
    };

    xmlhttp.open("GET", BASE_URL);
    xmlhttp.send();
}


// ================= DELETE =================
function deleteRecord(id) {

    if (confirm(`Delete record with ID: ${id}?`)) {
        let xmlhttp = new XMLHttpRequest();

        xmlhttp.onload = function () {
            if (this.status === 200) {
                alert("Record deleted ✅");
                getData(); // refresh table
            }
        };

        xmlhttp.open("DELETE", `${BASE_URL}/${id}`);
        xmlhttp.send();
    }
}


// ================= ADD =================
function addData() {

    let userObj = {
        userid: document.getElementById("userid").value,
        upass: document.getElementById("upass").value
    };

    let xmlhttp = new XMLHttpRequest();

    xmlhttp.onload = function () {
        if (this.status === 200 || this.status === 201) {
            alert("Record Added ✅");

            document.getElementById("userid").value = "";
            document.getElementById("upass").value = "";

            getData();
        }
    };

    xmlhttp.open("POST", BASE_URL);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(userObj));
}


// ================= GET SINGLE =================
let currentId = null;

function getSingleId(id) {

    currentId = id;

    let xmlhttp = new XMLHttpRequest();

    xmlhttp.onload = function () {
        let data = JSON.parse(this.responseText);

        document.getElementById("userid").value = data.userid;
        document.getElementById("upass").value = data.upass;
    };

    xmlhttp.open("GET", `${BASE_URL}/${id}`);
    xmlhttp.send();
}


// ================= UPDATE =================
function updateRecord() {

    if (!currentId) {
        alert("Select a record first");
        return;
    }

    let userObj = {
        id: currentId,
        userid: document.getElementById("userid").value,
        upass: document.getElementById("upass").value
    };

    let xmlhttp = new XMLHttpRequest();

    xmlhttp.onload = function () {
        if (this.status === 200) {
            alert("Record Updated ✨");
            getData();
        }
    };

    xmlhttp.open("PUT", `${BASE_URL}/${currentId}`);
    xmlhttp.setRequestHeader("Content-Type", "application/json");
    xmlhttp.send(JSON.stringify(userObj));
}