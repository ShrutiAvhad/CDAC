import staticData from "../shared/constant/constantData";
import React, { useState } from "react";

const ToggleImg = () => {
  const [Img, setImg] = useState(staticData.RadhaKishan);

  const changeImg = () => {
    if (Img === staticData.RadhaKishan) {
      setImg(staticData.peacockfeather);
    } else {
      setImg(staticData.RadhaKishan);
    }
  };

  return (
    <div>
      <h3>Images</h3>

      <img src={Img} alt="Art" width="400px" height="500px" />

      <br />
      <br />

      <button type="button" onClick={() => changeImg()}>
        Change Img
      </button>
    </div>
  );
};

export default ToggleImg;
