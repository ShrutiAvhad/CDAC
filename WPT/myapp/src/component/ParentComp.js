import React, { Component } from "react";
import ChildComp from "./ChildComp";

class ParentComp extends Component {
    constructor() {
        super();
        this.state = {
            item: "Samosa",
            price: 30
        };
    }

    changeState = () => {
        this.setState((prevState) => ({
            price: prevState.price + 10
        }));
    };

    render() {
        return (
            <div>
                <h2>Parent Component</h2>

                <p>
                    Item: {this.state.item} and Price: {this.state.price}
                </p>

                <button onClick={this.changeState}>
                    Update
                </button>

                <hr />

                <ChildComp
                    item={this.state.item}
                    price={this.state.price}
                    myaction={this.changeState}
                /> <hr/>
            </div>
           
        );
    }
}

export default ParentComp;