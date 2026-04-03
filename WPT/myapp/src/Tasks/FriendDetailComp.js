
import React, { Component } from "react";

class FriendDetailComp extends Component{
    render(){
        return (<div>
                
                <h1>This is My friend detail class component</h1>
                <p>My name is : <strong>{this.props.fname}</strong>, and Last name is : <strong>{this.props.lname}</strong>, Gender : <strong>{this.props.gender}</strong>, City: <strong>{this.props.city}</strong>, country : <strong>{this.props.country}</strong></p>
            </div>
        )

    }
}
export default FriendDetailComp;
