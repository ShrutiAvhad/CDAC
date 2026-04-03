import React, { useEffect, useState } from 'react'

const UseEffectHookComp = () => {
  const [count, setCount] = useState(0);
  const [age, setAge] = useState(18);

  //case 1 : When no depedency value pass
  useEffect (() => {
      setCount(count+1);
  });

  //case 2 : When dependency value is blank space
  useEffect (() => {
      setCount(count+1),[];
  });

  //case 3 : when dependency value pass in array
  useEffect (() => {
      setCount(count+1),[age];
  });

  //case 4 : how to achive componentWillUnmount
  useEffect (() => {
    return () => {
      console.log("component will unmount")
    };
  },[]);



  //case 3 : when dependency value is pass in an array
  useEffect (() => {
      setCount(count+1),[age];
  });
  return (
    <div>
    <div>UseEffectHookComp</div>
    <div>Count : {count}</div>
    <div> age: {age}</div>
    <button type = 'button' onClick={() =>{setAge(age+1)} }></button>
    <br/>
    </div>
  )
}

export default UseEffectHookComp