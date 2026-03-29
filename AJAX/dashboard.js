
function getData() {
    //1.create object of XMLHttpRequest
    let xmlhttp = new XMLHttpRequest();
    //2.create callback method 
    xmlhttp.onload = function () {
        // console.log(this.responseText);
        let data = JSON.parse(this.responseText);
        // console.log(data);
        let parentUl = document.getElementById("d1");
        for (let i = 0; i < data.length; i++) {

            let newTR = document.createElement("tr");
            newTR.innerHTML = `<td>${data[i].id}</td><td>${data[i].uid}</td><td>${data[i].upass}</td>`;
            parentUl.appendChild(newTR);
        }

    }
    //   3. create request by using open()
    xmlhttp.open("GET", "http://localhost:8888/users");
    //4. send request using send()
    xmlhttp.send();
}

// delete data function 
function deleteRecod() {
    let id = document.getElementById("uid").value;
    if (window.confirm(`are you sure to delete record with id:${id}`)) {
        let xmlhttp = new XMLHttpRequest();
        xmlhttp.onload = function () {
            window.alert('record deleted successfully');
        };
        xmlhttp.open("DELETE", `http://localhost:8888/users/${id}`);
        xmlhttp.send();
    }

}

// add data function 
function addData() {
    let userObj = {
        uid: document.getElementById("uid").value,
        upass: document.getElementById("upass").value,
        
    }
   
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onload = function (){
        window.alert("Record Added successfully");
        document.getElementById("uid").value="";
        document.getElementById("upass").value="";
    };
    xmlhttp.open("POST","http://localhost:8888/users");
    xmlhttp.send(JSON.stringify(userObj));
    
}
 let id;
// get request for single record 
function getSingleId(){
     id = document.getElementById("gid").value;
    let xmlhttp = new XMLHttpRequest();
    xmlhttp.onload = function(){
        // console.log(this.responseText);
        let data = JSON.parse(this.responseText);
        document.getElementById("uid").value=data.uid;
        document.getElementById("upass").value=data.upass;
    }
    xmlhttp.open("GET",`http://localhost:8888/users/${id}`);
    xmlhttp.send();
}

// put request method 
function updateRecord(){
    let userObjObj = {
       uid:  document.getElementById("uid").value,
       upass :  document.getElementById("upass").value,
    }
   let xmlhttp=new XMLHttpRequest();
   xmlhttp.onload = function(){
     window.alert("Record updated Successfully");
   }
   xmlhttp.open("PUT",`http://localhost:8888/user/${id}`);
   xmlhttp.send(JSON.stringify(userObj));
}