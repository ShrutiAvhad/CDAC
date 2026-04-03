
import React, { Component } from "react";

class ClassComp extends Component{
    render(){
        return (<div>
                
                <h1>This is class component</h1>
                <p>My name is : <strong>{this.props.myname}</strong>, I am : <strong>{this.props.post}</strong></p>
            </div>
        )

    }
}
export default ClassComp;
