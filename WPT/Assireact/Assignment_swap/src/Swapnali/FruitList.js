import {useState} from "react"

function FruitList(){

    const[fruits,setFruits]=useState([])
    const handleSubmit=function(event){
        event.preventDefault()
        var name= event.target.name.value
            setFruits([...fruits,name])
    
    }
    
    return<div>
        <form onSubmit={handleSubmit}>
     Enetr fruits name: <input type="text"></input>
    <button>Add </button>
    
</form>
        <ol>
            {fruits.map(item => <li>{item}</li>)}
        </ol>

    </div>
}
export default FruitList;