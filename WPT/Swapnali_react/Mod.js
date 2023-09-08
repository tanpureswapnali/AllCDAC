import {useState} from "react"
function Mod(){

    const [result,setResult]=useState(0)
    const handleSubmit=function(event){
        event.preventDeafult()
       var  num1=event.target.num1.value
       var  num2=event.target.num2.value
        setResult(Number(num1) % Number(num2))
    } 
    return <div>
        <form onSubmit={handleSubmit}>
        Enter no-1:<input type="text" name="num1"/>
       
        Enetr no-2:<input type="text" name="num2"/>
       <button>MOD</button>
        </form>
        <span>Result is--{result}</span>
    </div>
}
export default Mod;