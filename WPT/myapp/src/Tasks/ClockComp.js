import React, { Component } from "react";

class ClockComp extends Component {
  constructor() {
    super();
    this.state = {
      Hr: 0,
      Min: 0,
      Sec: 0,
    };
  }

  render() {
    return (
      <div>
        <strong>ClockComp</strong>
        <h1>
          Hr : {this.state.Hr}, Min : {this.state.Min}, Sec : {this.state.Sec}
        </h1>
        <button
          type="button"
          onClick={() => {
            if (this.state.Hr < 24) {
              this.setState((prevState) => ({ Hr: prevState.Hr + 1 }));
            }
          }}
        >
          H
        </button>

        <button
          type="button"
          onClick={() =>{
            if (this.state.Min < 60) {
            this.setState((prevState) => ({ Min: prevState.Min + 1 }))
            }
          }}
        >
          M
        </button>

        <button
          type="button"
          onClick={() =>{
            if (this.state.Sec < 60) {
            this.setState((prevState) => ({ Sec: prevState.Sec + 1 }))
          }}
        }
        >
          S
        </button>

        <button
          type="button"
          onClick={() => this.setState({ Hr: 0, Min: 0, Sec: 0 })}
        >
          Reset
        </button>
      </div>
    );
  }
}
export default ClockComp;
