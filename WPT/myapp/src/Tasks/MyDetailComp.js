const MyDetailComp=(props)=>{
    return  (<div>
                <h1>This is My Detail function component</h1>
                <p>My name is : <strong>{props.fname}</strong>, and Last name is : <strong>{props.lname}</strong>, Gender : <strong>{props.gender}</strong>, City: <strong>{props.city}</strong>, country : <strong>{props.country}</strong></p>
         </div>
    )

}

export default MyDetailComp;