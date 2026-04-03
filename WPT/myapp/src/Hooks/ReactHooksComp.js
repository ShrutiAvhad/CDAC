import React from 'react'
import { Outlet } from 'react-router-dom';

const ReactHooksComp = () => {
  return (
    <div>
      <h2>ReactHooksComp</h2>
      <div className='card border-primary'></div>
      <div className='card header border-primary'>
        <link to = "usestate" class ='btn btn-success btn-sm'>usestate</link> {" "}
        <link to = "useeffect" class ='btn btn-info btn-sm'>useeffect</link> {" "}
      
      </div>
      <div className='card body border-primary'></div>
      <Outlet/>
    </div>
  )
}

export default ReactHooksComp;