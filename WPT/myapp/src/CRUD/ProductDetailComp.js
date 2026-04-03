import axios from 'axios';
import React, { useEffect } from 'react'

const ProductDetailComp() {
    const [employee,setEmployee] = useState([]);

    const getData = () => {
        axios.get("url ")
        .then((responce)=>{
            console.log(responce.data);
            setEmployee(responce.data);
        })
        .catch((error)=>{})
    }
    useEffect(()=>{
        getData();
    },[])

    //delete requestcode
    const deleterescord = (id) =>{
        //console.log(id);
       if (window.confirm())
    }

    return (
        <div>
            
        </div>
    )
}

export default ProductDetailComp
