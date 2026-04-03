const ChildComp = (props) =>{
    return (<div>
        <h2>Child Component</h2>
        <div>Item : {props.item}</div>
        <div>Price : {props.price}</div>
        <h2 onMouseOver = {() => props.myaction()}>Hover on me to change the data</h2>
        </div>
    )
}

export default ChildComp

