
import React, { Component } from "react";

class MyStateComp extends Component{
    constructor(){
        super();
        this.state ={
            name : "Shru",
            salary : 556789
        }
    }

    changeState(){
        this.setState({name : "Buntu", salary : this.state.salary + 5000});
        //this.setState((prevState)=>({name:"Bunty", salary : prevState.state.salary+5000}));
    }

    greeting(){
        window.alert("Shhhhhh");
    }

    render(){
        return (
            <div>MyStateComp
                <p>My name : {this.state.name} and salary : {this.state.salary}</p>
                <button type='button' onClick={()=> this.greeting()}>Call greeting</button>
                <button type='button' onClick={()=> this.changeState()}>Update</button>

            </div>
        )

    }
}
export default MyStateComp;
