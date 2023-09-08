import {useState} from "react"

function FriendList(){
    //var friends = ["swap","anu","neha"]
    const[friends,setFriends]=useState({})
    const handleSubmit=function(event){
        event.preventDefault()
        var name= event.target.name.value
            setFriends([...friends,name])
    
    }
    
    return<div>
        <form>
     Enetr friend name: <input type="text"></input>
    <button>Add </button>
    
</form>
        <ol>
            {friends.map(item => <li>{item}</li>)}
        </ol>

    </div>
}
export default FriendList;