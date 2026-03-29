const myName="Shruti";
    //console.log(myName);

const evenNum =(num)=>{
    if(num%2==0){
        return `${num} is even`;
    }
    else
    {
        return `${num} is odd`;
    }
}

module.exports = {myName,evenNum};