import React, { useState } from "react";
import staticData from "../shared/constant/constantData";

const ChangeImages = () => {
    const [img, setImg] = useState(staticData.love);

    const changeToLove= () => {
        setImg(staticData.love);
    };

    const changeToShiv = () => {
        setImg(staticData.shiv);
    };

    const changeToGirl = () => {
        setImg(staticData.girl);
    };

    return (
        <div>
            <h3>ART</h3>

            <img
                src={img}
                alt="love"
                width="400px"
                height="500px"
            />

            <br /><br />

            <button type="button" onClick={()=> changeToLove()}>Love</button>

            <button type="button" onClick={()=> changeToShiv()}>Shiv</button>
                
            <button type="button" onClick={()=> changeToGirl()}>Girl</button>
               
        </div>
    );
};

export default ChangeImages;
