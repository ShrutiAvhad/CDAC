import React, { Component } from 'react';
import staticData from '../shared/constant/constantData';

class MyImagesComp extends Component {
    render() {
        return (
            <div>
                <h2>MyImagesComp</h2>

                <img src={staticData.love} alt="love" width="150" height="150" />
                <img src={staticData.depression} alt="depression" width="150" height="150" />
                <img src={staticData.shiv} alt="shiv" width="150" height="150" />
                <img src={staticData.flower} alt="flower" width="150" height="150" />

            </div>
        );
    }
}

export default MyImagesComp;