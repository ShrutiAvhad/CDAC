import staticData from "../shared/constant/constantData";
import React, { useState } from "react";

const ImgSlider = () => {
    const img = [
        staticData.roronoa,
        staticData.zoro,
        staticData.shree
    ];

    const [index, setIndex] = useState(0);

    const nextImg = () => {
        setIndex((prev) => (prev + 1) % img.length);
    };

    const prevImg = () => {
        setIndex((prev) => (prev - 1 + img.length) % img.length);
    };

    return (
        <div>
            <h3>Images</h3>

            <img 
                src = {img[index]}
                alt = "ART"
                width = "700px"
                height = "400px"
            />

            <br/><br/>

            <button type="button" onClick={prevImg}>Prev</button>
            <button type="button" onClick={nextImg}>Next</button>
        </div>
    );
};

export default ImgSlider;